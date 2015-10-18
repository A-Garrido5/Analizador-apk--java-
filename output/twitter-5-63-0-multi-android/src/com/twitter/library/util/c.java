// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.animation.Animator;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

final class c extends AnimatorListenerAdapter
{
    final /* synthetic */ View a;
    
    c(final View a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(4);
        this.a.setAlpha(1.0f);
    }
}
