// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.view.GestureDetector$SimpleOnGestureListener;

class y extends GestureDetector$SimpleOnGestureListener
{
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ Animation b;
    final /* synthetic */ Animation c;
    final /* synthetic */ ComposerActivity d;
    
    y(final ComposerActivity d, final FrameLayout a, final Animation b, final Animation c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        return true;
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
        this.a.startAnimation(this.b);
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        this.a.startAnimation(this.c);
        this.a.performClick();
        return true;
    }
}
