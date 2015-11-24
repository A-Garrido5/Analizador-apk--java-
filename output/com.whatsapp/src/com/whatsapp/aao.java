// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class aao extends AnimatorListenerAdapter
{
    final HomeActivity a;
    
    aao(final HomeActivity a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        HomeActivity.g(this.a).setIconified(true);
        HomeActivity.f(this.a).setVisibility(4);
    }
}
