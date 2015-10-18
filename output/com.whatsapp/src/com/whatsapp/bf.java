// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.Animation$AnimationListener;

class bf implements Animation$AnimationListener
{
    final View a;
    final ps b;
    final View c;
    final View d;
    final View e;
    
    bf(final ps b, final View c, final View e, final View d, final View a) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        this.c.setVisibility(8);
        if (this.b.i()) {
            this.e.setVisibility(8);
            return;
        }
        final AnimationSet set = new AnimationSet(true);
        final TranslateAnimation translateAnimation = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        ((Animation)translateAnimation).setDuration(160L);
        final RotateAnimation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        ((Animation)rotateAnimation).setDuration(160L);
        ((Animation)rotateAnimation).setFillAfter(true);
        set.addAnimation((Animation)rotateAnimation);
        set.addAnimation((Animation)translateAnimation);
        this.d.startAnimation((Animation)set);
        this.e.postDelayed((Runnable)new atl(this), 500L);
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
