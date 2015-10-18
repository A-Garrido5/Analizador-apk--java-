// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class dz implements Animation$AnimationListener
{
    final HomeActivity a;
    
    dz(final HomeActivity a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        HomeActivity.g(this.a).setIconified(false);
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
