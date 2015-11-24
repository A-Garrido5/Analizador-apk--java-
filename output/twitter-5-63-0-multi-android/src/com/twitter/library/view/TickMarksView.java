// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class TickMarksView extends View
{
    private final Paint a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private int g;
    private int h;
    private x[] i;
    private int j;
    private boolean k;
    private int l;
    
    public TickMarksView(final Context context) {
        this(context, null, 0);
    }
    
    public TickMarksView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TickMarksView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        (this.a = new Paint()).setAntiAlias(false);
        this.a.setColor(this.getResources().getColor(kx.medium_gray));
        this.a.setTypeface(Typeface.DEFAULT_BOLD);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TickMarksView, n, 0);
        try {
            this.c = obtainStyledAttributes.getDimensionPixelSize(li.TickMarksView_tickMarksMinGap, 0);
            this.d = obtainStyledAttributes.getDimensionPixelSize(li.TickMarksView_tickMarksMarkWidth, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(li.TickMarksView_tickMarkLabelMarginLeft, 0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(li.TickMarksView_tickMarkLabelMarginTop, 0);
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(li.TickMarksView_android_textSize, 0);
            if (dimensionPixelSize > 0) {
                this.a.setTextSize((float)dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            final Rect rect = new Rect();
            this.a.getTextBounds("8", 0, 1, rect);
            this.b = rect.height();
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public void a(final int j) {
        if (this.j != j) {
            this.j = j;
            this.invalidate();
        }
    }
    
    public void a(final int g, final int h) {
        if (this.g != g || this.h != h) {
            this.g = g;
            this.h = h;
            this.invalidate();
        }
    }
    
    public void a(final boolean k) {
        if (this.k != k) {
            this.k = k;
            this.invalidate();
        }
    }
    
    public void onDraw(final Canvas canvas) {
        if (this.i != null && this.g < this.h) {
            final float n = this.getHeight();
            final float n2 = this.getHeight();
            final float n3 = this.getWidth();
            final float n4 = n3 / (this.h - this.g);
            final int length = this.i.length;
            int i = 0;
            int n5 = Integer.MAX_VALUE;
            while (i < length) {
                final x x = this.i[i];
                final int a = x.a;
                if (i >= this.j && n4 * a < this.c) {
                    break;
                }
                final float n6 = n2 - n * x.b;
                this.a.setStrokeWidth(this.d * x.c);
                this.a.setAlpha(x.d);
                final int n7 = this.g - this.g % a;
                int n8 = a - this.g % a;
                int n9 = n7;
                while (true) {
                    final float n10 = n4 * n8;
                    if (n10 >= n3) {
                        break;
                    }
                    final int n11 = n9 + a;
                    if (n11 % n5 != 0) {
                        canvas.drawLine(n10, n6, n10, n2, this.a);
                        if (this.k) {
                            final String a2 = x.a(n11);
                            if (a2 != null) {
                                this.a.setAlpha(this.l);
                                this.a.setAntiAlias(true);
                                canvas.drawText(a2, n10 + this.e, n6 + this.b + this.f, this.a);
                                this.a.setAntiAlias(false);
                                this.a.setAlpha(x.d);
                            }
                        }
                    }
                    n8 += a;
                    n9 = n11;
                }
                ++i;
                n5 = a;
            }
        }
    }
    
    public void setTextAlpha(final int l) {
        if (this.l != l) {
            this.l = l;
            this.invalidate();
        }
    }
    
    public void setTickMarks(final x[] i) {
        if (this.i != i) {
            this.i = i;
            this.invalidate();
        }
    }
}
