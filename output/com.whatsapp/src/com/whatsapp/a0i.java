// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class a0i extends AnimatorListenerAdapter
{
    final Runnable a;
    final MediaView b;
    
    a0i(final MediaView b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.run();
    }
}
