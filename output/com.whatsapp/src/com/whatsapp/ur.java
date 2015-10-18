// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class ur implements Animation$AnimationListener
{
    final atl a;
    
    ur(final atl a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        if (this.a.a.b.i()) {
            return;
        }
        this.a.a.a.setVisibility(0);
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
