// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class PipView extends View
{
    private final int a;
    private final int b;
    private final Paint c;
    private final int d;
    private final int e;
    private int f;
    private int g;
    
    public PipView(final Context context) {
        super(context);
        this.a = 3;
        this.b = 2;
        this.d = -1;
        this.e = -16776961;
        this.f = 0;
        this.c = new Paint(1);
    }
    
    public PipView(final Context context, final AttributeSet set) {
        this(context, set, 2130772048);
    }
    
    public PipView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.PipView, n, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(1, 3);
        this.b = obtainStyledAttributes.getDimensionPixelSize(2, 2);
        this.d = obtainStyledAttributes.getColor(3, -1);
        this.e = obtainStyledAttributes.getColor(4, -16776961);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(6, false);
        final int color = obtainStyledAttributes.getColor(5, -7829368);
        this.f = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        this.g = -1;
        this.c = new Paint(1);
        if (boolean1) {
            this.c.setShadowLayer(1.0f, 0.0f, 1.0f, color);
        }
    }
    
    public int getPipCount() {
        return this.f;
    }
    
    public int getPipOnPosition() {
        return this.g;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int paddingLeft = this.getPaddingLeft();
        final int a = this.a;
        final int n = a + this.b;
        final int g = this.g;
        final int n2 = n + this.getPaddingTop();
        final Paint c = this.c;
        c.setColor(this.d);
        for (int i = 0; i < this.f; ++i) {
            if (i != g) {
                canvas.drawCircle((float)(paddingLeft + n * (1 + i * 2)), (float)n2, (float)a, c);
            }
        }
        if (g != -1) {
            c.setColor(this.e);
            canvas.drawCircle((float)(paddingLeft + n * (1 + g * 2)), (float)n2, (float)a, c);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int n3 = 2 * (this.a + this.b);
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n3 * this.f + this.getPaddingLeft() + this.getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(n3 + this.getPaddingTop() + this.getPaddingBottom(), 1073741824));
    }
    
    public void setPipCount(final int f) {
        this.f = f;
        if (this.g >= f) {
            this.g = -1;
        }
        this.invalidate();
    }
    
    public void setPipOnPosition(final int g) {
        if (g > this.f || g < 0 || g == this.g) {
            return;
        }
        this.g = g;
        this.invalidate();
    }
}
