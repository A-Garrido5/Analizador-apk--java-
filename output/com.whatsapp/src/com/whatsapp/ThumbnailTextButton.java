// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils$TruncateAt;
import android.graphics.Path;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class ThumbnailTextButton extends ThumbnailButton
{
    private int k;
    private Drawable l;
    private Rect m;
    private int n;
    private Paint o;
    private float p;
    private RectF q;
    private int r;
    private TextPaint s;
    private CharSequence t;
    
    public ThumbnailTextButton(final Context context) {
        super(context);
        this.k = -1728053248;
        this.n = -1;
        this.p = 15.0f;
        this.r = 17;
        this.b(context, null);
    }
    
    public ThumbnailTextButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.k = -1728053248;
        this.n = -1;
        this.p = 15.0f;
        this.r = 17;
        this.b(context, set);
    }
    
    public ThumbnailTextButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.k = -1728053248;
        this.n = -1;
        this.p = 15.0f;
        this.r = 17;
        this.b(context, set);
    }
    
    private void b(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aqy.ThumbnailTextButton);
            this.t = obtainStyledAttributes.getText(0);
            this.p = obtainStyledAttributes.getDimension(2, this.p);
            this.r = obtainStyledAttributes.getInt(4, this.r);
            this.n = obtainStyledAttributes.getInt(3, this.n);
            this.k = obtainStyledAttributes.getInt(5, this.k);
            final int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId != 0) {
                this.l = context.getResources().getDrawable(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    @Override
    protected void b(final Canvas canvas) {
        final boolean i = App.I;
        super.b(canvas);
        if (!TextUtils.isEmpty(this.t)) {
            if (this.o == null) {
                (this.o = new Paint()).setAntiAlias(true);
                this.o.setStyle(Paint$Style.FILL);
                this.o.setColor(this.k);
            }
            if (this.s == null) {
                (this.s = new TextPaint()).setAntiAlias(true);
                this.s.setColor(this.n);
                this.s.setTextSize(this.p);
                this.s.setTextAlign(Paint$Align.CENTER);
            }
            if (this.q == null) {
                this.q = new RectF();
            }
            if (this.m == null) {
                this.m = new Rect();
            }
            final float n = 1.25f * this.p;
            final float n2 = n - this.p;
            final Path path = new Path();
            path.moveTo(this.d.left, this.d.bottom - n);
            path.lineTo(this.d.right, this.d.bottom - n);
            path.lineTo(this.d.right, this.d.bottom - this.a);
            this.q.set(this.d.right - 2.0f * this.a, this.d.bottom - 2.0f * this.a, this.d.right, this.d.bottom);
            path.arcTo(this.q, 0.0f, 90.0f);
            path.lineTo(this.d.left + this.a, this.d.bottom);
            this.q.set(this.d.left, this.d.bottom - 2.0f * this.a, this.d.left + 2.0f * this.a, this.d.bottom);
            path.arcTo(this.q, 90.0f, 90.0f);
            path.lineTo(this.d.left, this.d.bottom - n);
            canvas.drawPath(path, this.o);
            final String string = TextUtils.ellipsize(this.t, this.s, this.d.width() - this.a, TextUtils$TruncateAt.END).toString();
            this.s.getTextBounds(string, 0, string.length(), this.m);
            float n3 = 0.0f;
            Label_0531: {
                Label_0727: {
                    switch (this.r) {
                        case 3: {
                            n3 = n2 + (this.d.left + (this.m.right - this.m.left) / 2);
                            if (i) {
                                break Label_0727;
                            }
                            break Label_0531;
                        }
                        case 5: {
                            n3 = this.d.right - (this.m.right - this.m.left) / 2 - n2;
                            if (i) {
                                break;
                            }
                            break Label_0531;
                        }
                    }
                }
                n3 = (this.d.right + this.d.left) / 2.0f;
            }
            canvas.drawText(string, 0, string.length(), n3, this.d.bottom - n / 2.0f + this.p / 2.0f - this.s.descent() / 2.0f, (Paint)this.s);
            if (this.l != null) {
                this.l.setBounds((int)(n2 + this.d.left + this.a), (int)(this.d.bottom - n + (n - this.p) / 2.0f), (int)(n * this.l.getIntrinsicWidth() / this.l.getIntrinsicHeight() + (n2 + this.d.left + this.a)), (int)(this.d.bottom - (n - this.p) / 2.0f));
                this.l.draw(canvas);
            }
        }
    }
    
    public void setBackgroundColor(final int k) {
        this.k = k;
    }
    
    public void setIcon(final Drawable l) {
        this.l = l;
    }
    
    public void setText(final CharSequence t) {
        this.t = t;
    }
    
    public void setTextGravity(final int r) {
        this.r = r;
    }
    
    public void setTextSize(final float p) {
        this.p = p;
    }
}
