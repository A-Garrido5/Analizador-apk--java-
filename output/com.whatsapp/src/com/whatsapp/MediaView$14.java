// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ScaleGestureDetector;
import android.view.MotionEvent;
import android.content.Context;

class MediaView$14 extends PhotoView
{
    final MediaView R;
    
    MediaView$14(final MediaView r, final Context context) {
        this.R = r;
        super(context);
    }
    
    @Override
    public boolean a(final float n, final float n2) {
        return super.a(n, n2);
    }
    
    @Override
    public boolean b(final float n, final float n2) {
        return super.b(n, n2);
    }
    
    @Override
    public boolean onDoubleTap(final MotionEvent motionEvent) {
        MediaView.a(this.R, this.c() != this.a());
        return super.onDoubleTap(motionEvent);
    }
    
    @Override
    public boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        MediaView.a(this.R, false);
        return super.onScaleBegin(scaleGestureDetector);
    }
    
    @Override
    public void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
        MediaView.a(this.R, this.c() == this.a());
    }
}
