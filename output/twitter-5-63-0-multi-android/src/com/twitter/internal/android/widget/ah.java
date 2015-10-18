// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.ColorFilter;
import android.graphics.Region;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetricsInt;
import com.twitter.util.t;
import com.twitter.ui.widget.ag;
import android.util.TypedValue;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;

final class ah extends Drawable
{
    private Drawable a;
    private CharSequence b;
    private TextPaint c;
    private int d;
    private int e;
    private int f;
    private Rect g;
    private float h;
    
    public ah(final Context context) {
        this.g = new Rect();
        this.a(context);
    }
    
    private void a(final Context context) {
        this.f = -16777216;
        this.h = TypedValue.applyDimension(2, 16.0f, context.getResources().getDisplayMetrics());
    }
    
    public void a(final float h) {
        if (h > 0.0f && this.h != h) {
            this.h = h;
            this.invalidateSelf();
        }
    }
    
    public void a(final int f) {
        if (this.f != f) {
            this.f = f;
            this.invalidateSelf();
        }
    }
    
    public void a(final Context context, final CharSequence b) {
        if (b == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        if (!b.equals(this.b)) {
            if (this.c == null) {
                (this.c = new TextPaint(1)).setTypeface(ag.a(context).c);
                this.c.setTextSize(this.h);
            }
            final Paint$FontMetricsInt fontMetricsInt = this.c.getFontMetricsInt();
            this.b = b;
            this.d = t.a(b, this.c);
            this.e = fontMetricsInt.bottom - fontMetricsInt.top;
            this.invalidateSelf();
        }
    }
    
    public void a(final Drawable a) {
        if (this.a != a) {
            this.a = a;
            this.invalidateSelf();
        }
    }
    
    public void draw(final Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
        }
        final Rect bounds = this.getBounds();
        final int n = this.e - this.c.getFontMetricsInt().descent - this.e / 2;
        final int n2 = bounds.left + t.a(bounds.width(), this.d);
        final int n3 = n + bounds.centerY();
        this.c.setColor(this.f);
        canvas.drawText(this.b, 0, this.b.length(), (float)n2, (float)n3, (Paint)this.c);
    }
    
    public int getIntrinsicHeight() {
        if (this.a != null) {
            final Rect g = this.g;
            this.a.getPadding(g);
            return g.top + g.bottom + Math.max(this.a.getIntrinsicHeight(), this.e);
        }
        return this.e;
    }
    
    public int getIntrinsicWidth() {
        if (this.a != null) {
            final Rect g = this.g;
            this.a.getPadding(g);
            return g.left + g.right + Math.max(this.a.getIntrinsicWidth(), this.d);
        }
        return this.d;
    }
    
    public int getOpacity() {
        int resolveOpacity = 0;
        switch (this.c.getAlpha()) {
            default: {
                resolveOpacity = -3;
                break;
            }
            case 0: {
                resolveOpacity = -1;
                break;
            }
            case 255: {
                resolveOpacity = -2;
                break;
            }
        }
        if (this.a != null) {
            resolveOpacity = resolveOpacity(resolveOpacity, this.a.getOpacity());
        }
        return resolveOpacity;
    }
    
    public boolean getPadding(final Rect rect) {
        if (this.a != null) {
            return this.a.getPadding(rect);
        }
        return super.getPadding(rect);
    }
    
    public Region getTransparentRegion() {
        if (this.a != null) {
            return this.a.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }
    
    public boolean isStateful() {
        return this.a != null && this.a.isStateful();
    }
    
    protected void onBoundsChange(final Rect bounds) {
        super.onBoundsChange(bounds);
        if (this.a != null) {
            this.a.setBounds(bounds);
        }
    }
    
    public void setAlpha(final int alpha) {
        this.c.setAlpha(alpha);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
    
    public boolean setState(final int[] array) {
        boolean setState = super.setState(array);
        if (this.a != null) {
            setState |= this.a.setState(array);
        }
        return setState;
    }
}
