// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class g0 implements Animation$AnimationListener
{
    final ps a;
    
    g0(final ps a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        ps.f(this.a).findViewById(2131755443).setVisibility(0);
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
