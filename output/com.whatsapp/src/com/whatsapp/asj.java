// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.animation.AnimatorListenerAdapter;

class asj extends AnimatorListenerAdapter
{
    final TransitionValues a;
    final ae b;
    
    asj(final ae b, final TransitionValues a) {
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationStart(final Animator animator) {
        this.a.view.setAlpha(1.0f);
    }
}
