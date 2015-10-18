// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.view.GestureDetector;
import android.view.View$OnTouchListener;

class z implements View$OnTouchListener
{
    final /* synthetic */ GestureDetector a;
    final /* synthetic */ FrameLayout b;
    final /* synthetic */ ComposerActivity c;
    
    z(final ComposerActivity c, final GestureDetector a, final FrameLayout b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean onTouchEvent = this.a.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !onTouchEvent) {
            this.b.clearAnimation();
        }
        return onTouchEvent;
    }
}
