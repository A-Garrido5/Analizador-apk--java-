// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Typeface;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import com.twitter.util.k;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;
import android.view.View;

public class TightTextView extends View
{
    private static final int[] a;
    private final Paint b;
    private Rect c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    
    static {
        a = new int[] { 0, 1, 3, 2 };
    }
    
    public TightTextView(final Context context) {
        this(context, null, 0);
    }
    
    public TightTextView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TightTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new Paint(1);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TightTextView, n, 0);
        this.setTextSize(obtainStyledAttributes.getDimensionPixelSize(li.TightTextView_text_size, 0));
        this.setTextColor(obtainStyledAttributes.getColor(li.TightTextView_text_color, 0));
        this.setFontStyle(obtainStyledAttributes.getInt(li.TightTextView_text_face, 0));
        this.h = obtainStyledAttributes.getInt(li.TightTextView_vertical_alignment, 1);
        this.i = obtainStyledAttributes.getInt(li.TightTextView_horizontal_alignment, 1);
        this.d = k.a(obtainStyledAttributes.getString(li.TightTextView_text));
        final Rect c = new Rect();
        this.b.getTextBounds(this.d, 0, this.d.length(), c);
        this.c = c;
        obtainStyledAttributes.recycle();
    }
    
    protected final void onDraw(final Canvas canvas) {
        final Rect c = this.c;
        int n = 0;
        switch (this.i) {
            default: {
                final int paddingLeft = this.getPaddingLeft();
                n = paddingLeft + (this.getWidth() - paddingLeft - this.getPaddingRight() - c.left - c.right) / 2;
                break;
            }
            case 0: {
                n = this.getPaddingLeft() - c.left;
                break;
            }
            case 2: {
                n = this.getWidth() - this.getPaddingRight() - c.right;
                break;
            }
        }
        int n2 = 0;
        switch (this.h) {
            default: {
                final int paddingTop = this.getPaddingTop();
                n2 = paddingTop + (this.getHeight() - paddingTop - this.getPaddingBottom() - c.top - c.bottom) / 2;
                break;
            }
            case 0: {
                n2 = this.getPaddingTop() - c.top;
                break;
            }
            case 2: {
                n2 = this.getHeight() - this.getPaddingBottom() - c.bottom;
                break;
            }
        }
        canvas.drawText(this.d, (float)n, (float)n2, this.b);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final Rect c = this.c;
        final int mode = View$MeasureSpec.getMode(n);
        int n3;
        if (mode == 1073741824) {
            n3 = View$MeasureSpec.getSize(n);
        }
        else {
            n3 = c.width() + this.getPaddingLeft() + this.getPaddingRight();
            if (mode == Integer.MIN_VALUE) {
                n3 = Math.min(n3, View$MeasureSpec.getSize(n));
            }
        }
        final int mode2 = View$MeasureSpec.getMode(n2);
        int n4;
        if (mode2 == 1073741824) {
            n4 = View$MeasureSpec.getSize(n2);
        }
        else {
            n4 = c.height() + this.getPaddingTop() + this.getPaddingBottom();
            if (mode2 == Integer.MIN_VALUE) {
                n4 = Math.min(n4, View$MeasureSpec.getSize(n2));
            }
        }
        this.setMeasuredDimension(n3, n4);
    }
    
    public void setFontStyle(final int g) {
        if (this.g != g) {
            this.g = g;
            this.b.setTypeface(Typeface.create(this.b.getTypeface(), TightTextView.a[g]));
        }
    }
    
    public void setText(String d) {
        if (d == null) {
            d = "";
        }
        if (!this.d.equals(d)) {
            this.d = d;
            final Rect c = new Rect();
            this.b.getTextBounds(d, 0, d.length(), c);
            if (!this.c.equals((Object)c)) {
                this.c = c;
                this.requestLayout();
                return;
            }
            this.invalidate();
        }
    }
    
    public void setTextColor(final int n) {
        if (this.f != n) {
            this.f = n;
            this.b.setColor(n);
        }
    }
    
    public void setTextSize(final int e) {
        if (this.e != e) {
            this.e = e;
            this.b.setTextSize((float)e);
        }
    }
}
