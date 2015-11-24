// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.widget.ImageView;

public final class zzki extends ImageView
{
    private int zzZH;
    private zzki$zza zzZI;
    private int zzZJ;
    private float zzZK;
    
    protected void onDraw(final Canvas canvas) {
        if (this.zzZI != null) {
            canvas.clipPath(this.zzZI.zzk(this.getWidth(), this.getHeight()));
        }
        super.onDraw(canvas);
        if (this.zzZH != 0) {
            canvas.drawColor(this.zzZH);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final boolean a = zzkf.a;
        super.onMeasure(n, n2);
        int measuredHeight = 0;
        int measuredWidth = 0;
        Label_0079: {
            Label_0058: {
                switch (this.zzZJ) {
                    case 1: {
                        measuredHeight = this.getMeasuredHeight();
                        measuredWidth = (int)(measuredHeight * this.zzZK);
                        if (a) {
                            break Label_0058;
                        }
                        break Label_0079;
                    }
                    case 2: {
                        measuredWidth = this.getMeasuredWidth();
                        measuredHeight = (int)(measuredWidth / this.zzZK);
                        if (!a) {
                            break Label_0079;
                        }
                        break;
                    }
                }
            }
            return;
        }
        this.setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
