// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.TranslateAnimation;

class atl implements Runnable
{
    final bf a;
    
    atl(final bf a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.e.setVisibility(8);
        if (this.a.b.i()) {
            return;
        }
        final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        ((Animation)translateAnimation).setAnimationListener((Animation$AnimationListener)new ur(this));
        ((Animation)translateAnimation).setDuration(213L);
        this.a.e.startAnimation((Animation)translateAnimation);
    }
}
