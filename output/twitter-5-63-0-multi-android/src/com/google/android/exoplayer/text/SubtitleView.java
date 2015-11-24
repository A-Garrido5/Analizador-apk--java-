// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer.text;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.view.View$MeasureSpec;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout$Alignment;
import android.annotation.TargetApi;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.text.StaticLayout;
import android.graphics.Paint;
import android.text.TextPaint;
import android.graphics.RectF;
import android.view.View;

public class SubtitleView extends View
{
    private final RectF a;
    private final StringBuilder b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private TextPaint g;
    private Paint h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private StaticLayout o;
    private float p;
    private float q;
    private int r;
    
    public SubtitleView(final Context context) {
        this(context, null);
    }
    
    public SubtitleView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public SubtitleView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new RectF();
        this.b = new StringBuilder();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16843087, 16842901, 16843287, 16843288 }, n, 0);
        final CharSequence text = obtainStyledAttributes.getText(0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 15);
        this.q = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.p = obtainStyledAttributes.getFloat(3, 1.0f);
        obtainStyledAttributes.recycle();
        final int round = Math.round(2 * this.getContext().getResources().getDisplayMetrics().densityDpi / 160);
        this.c = round;
        this.d = round;
        this.e = round;
        this.f = round;
        (this.g = new TextPaint()).setAntiAlias(true);
        this.g.setSubpixelText(true);
        (this.h = new Paint()).setAntiAlias(true);
        this.r = 0;
        this.setText(text);
        this.setTextSize(dimensionPixelSize);
        this.setStyle(com.google.android.exoplayer.text.a.a);
    }
    
    @TargetApi(11)
    private void a() {
        this.setMeasuredDimension(16777216, 16777216);
    }
    
    private boolean a(final int n) {
        if (this.m && n == this.n) {
            return true;
        }
        final int n2 = n - (this.getPaddingLeft() + this.getPaddingRight() + 2 * this.r);
        if (n2 <= 0) {
            return false;
        }
        this.m = true;
        this.n = n2;
        this.o = new StaticLayout((CharSequence)this.b, this.g, n2, (Layout$Alignment)null, this.p, this.q, true);
        return true;
    }
    
    private void setTypeface(final Typeface typeface) {
        if (this.g.getTypeface() != typeface) {
            this.g.setTypeface(typeface);
            this.m = false;
            this.requestLayout();
            this.invalidate();
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        final StaticLayout o = this.o;
        if (o == null) {
            return;
        }
        final int save = canvas.save();
        final int r = this.r;
        canvas.translate((float)(r + this.getPaddingLeft()), (float)this.getPaddingTop());
        final int lineCount = o.getLineCount();
        final TextPaint g = this.g;
        final Paint h = this.h;
        final RectF a = this.a;
        if (Color.alpha(this.j) > 0) {
            final float c = this.c;
            float bottom = o.getLineTop(0);
            h.setColor(this.j);
            h.setStyle(Paint$Style.FILL);
            for (int i = 0; i < lineCount; ++i) {
                a.left = o.getLineLeft(i) - r;
                a.right = o.getLineRight(i) + r;
                a.top = bottom;
                a.bottom = o.getLineBottom(i);
                bottom = a.bottom;
                canvas.drawRoundRect(a, c, c, h);
            }
        }
        if (this.l == 1) {
            ((Paint)g).setStrokeJoin(Paint$Join.ROUND);
            ((Paint)g).setStrokeWidth(this.d);
            ((Paint)g).setColor(this.k);
            ((Paint)g).setStyle(Paint$Style.FILL_AND_STROKE);
            o.draw(canvas);
        }
        else if (this.l == 2) {
            ((Paint)g).setShadowLayer(this.e, this.f, this.f, this.k);
        }
        else if (this.l == 3 || this.l == 4) {
            boolean b;
            if (this.l == 3) {
                b = true;
            }
            else {
                b = false;
            }
            int k;
            if (b) {
                k = -1;
            }
            else {
                k = this.k;
            }
            int j;
            if (b) {
                j = this.k;
            }
            else {
                j = -1;
            }
            final float n = this.e / 2.0f;
            ((Paint)g).setColor(this.i);
            ((Paint)g).setStyle(Paint$Style.FILL);
            ((Paint)g).setShadowLayer(this.e, -n, -n, k);
            o.draw(canvas);
            ((Paint)g).setShadowLayer(this.e, n, n, j);
        }
        ((Paint)g).setColor(this.i);
        ((Paint)g).setStyle(Paint$Style.FILL);
        o.draw(canvas);
        ((Paint)g).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
    
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.a(n3 - n);
    }
    
    protected void onMeasure(final int n, final int n2) {
        int i = 0;
        if (this.a(View$MeasureSpec.getSize(n))) {
            final StaticLayout o = this.o;
            final int n3 = this.getPaddingLeft() + this.getPaddingRight() + 2 * this.r;
            final int n4 = o.getHeight() + this.getPaddingTop() + this.getPaddingBottom();
            final int lineCount = o.getLineCount();
            int max = 0;
            while (i < lineCount) {
                max = Math.max((int)Math.ceil(o.getLineWidth(i)), max);
                ++i;
            }
            this.setMeasuredDimension(max + n3, n4);
            return;
        }
        if (ai.a >= 11) {
            this.a();
            return;
        }
        this.setMeasuredDimension(0, 0);
    }
    
    public void setBackgroundColor(final int j) {
        this.j = j;
        this.invalidate();
    }
    
    public void setStyle(final a a) {
        this.i = a.b;
        this.j = a.c;
        this.l = a.e;
        this.k = a.f;
        this.setTypeface(a.g);
        super.setBackgroundColor(a.d);
        this.m = false;
        this.requestLayout();
    }
    
    public void setText(final CharSequence charSequence) {
        this.b.setLength(0);
        this.b.append(charSequence);
        this.m = false;
        this.requestLayout();
    }
    
    public void setTextSize(final float textSize) {
        if (this.g.getTextSize() != textSize) {
            this.g.setTextSize(textSize);
            this.r = (int)(0.5f + 0.125f * textSize);
            this.m = false;
            this.requestLayout();
            this.invalidate();
        }
    }
}
