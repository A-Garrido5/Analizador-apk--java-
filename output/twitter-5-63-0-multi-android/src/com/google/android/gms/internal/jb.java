// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.widget.ImageView;

public final class jb extends ImageView
{
    private int a;
    private h b;
    private int c;
    private float d;
    
    protected void onDraw(final Canvas canvas) {
        if (this.b != null) {
            canvas.clipPath(this.b.a(this.getWidth(), this.getHeight()));
        }
        super.onDraw(canvas);
        if (this.a != 0) {
            canvas.drawColor(this.a);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        int measuredHeight = 0;
        int measuredWidth = 0;
        switch (this.c) {
            default: {
                return;
            }
            case 1: {
                measuredHeight = this.getMeasuredHeight();
                measuredWidth = (int)(measuredHeight * this.d);
                break;
            }
            case 2: {
                measuredWidth = this.getMeasuredWidth();
                measuredHeight = (int)(measuredWidth / this.d);
                break;
            }
        }
        this.setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
