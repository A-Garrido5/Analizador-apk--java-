// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class a2w extends AnimatorListenerAdapter
{
    final MediaView a;
    
    a2w(final MediaView a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        MediaView.b(this.a, false);
        MediaView.a(this.a, true);
    }
}
