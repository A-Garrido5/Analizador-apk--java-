// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

class vm extends AnimatorListenerAdapter
{
    final o_ a;
    final boolean b;
    final View c;
    
    vm(final o_ a, final View c, final boolean b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public void onAnimationEnd(final Animator animator) {
        if (!this.b) {
            this.c.setAlpha(0.0f);
        }
    }
    
    public void onAnimationStart(final Animator animator) {
        this.c.setAlpha(1.0f);
    }
}
