// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

class ats extends AnimatorListenerAdapter
{
    final boolean a;
    final View b;
    final o_ c;
    
    ats(final o_ c, final View b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        if (this.a) {
            this.b.setAlpha(0.0f);
        }
    }
    
    public void onAnimationStart(final Animator animator) {
        this.b.setAlpha(1.0f);
    }
}
