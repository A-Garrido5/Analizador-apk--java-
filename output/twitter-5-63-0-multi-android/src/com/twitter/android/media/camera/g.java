// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class g implements View$OnTouchListener
{
    final /* synthetic */ CameraFragment a;
    
    g(final CameraFragment a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (MotionEventCompat.getActionMasked(motionEvent) == 1) {
            this.a.a((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        return true;
    }
}
