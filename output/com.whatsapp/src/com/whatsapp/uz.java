// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class uz extends AnimatorListenerAdapter
{
    final CircularRevealView a;
    
    uz(final CircularRevealView a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(4);
    }
}
