// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.util.AttributeSet;
import android.content.Context;
import android.view.SurfaceView;

public class VideoSurfaceView extends SurfaceView
{
    private float a;
    
    public VideoSurfaceView(final Context context) {
        super(context);
    }
    
    public VideoSurfaceView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        int measuredWidth = this.getMeasuredWidth();
        int measuredHeight = this.getMeasuredHeight();
        if (this.a != 0.0f) {
            final float n3 = this.a / (measuredWidth / measuredHeight) - 1.0f;
            if (n3 > 0.01f) {
                measuredHeight = (int)(measuredWidth / this.a);
            }
            else if (n3 < -0.01f) {
                measuredWidth = (int)(measuredHeight * this.a);
            }
        }
        this.setMeasuredDimension(measuredWidth, measuredHeight);
    }
    
    public void setVideoWidthHeightRatio(final float a) {
        if (this.a != a) {
            this.a = a;
            this.requestLayout();
        }
    }
}
