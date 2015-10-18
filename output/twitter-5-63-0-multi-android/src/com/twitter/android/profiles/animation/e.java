// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.animation.Animator;
import android.animation.Animator$AnimatorListener;

class e implements Animator$AnimatorListener
{
    final /* synthetic */ FlyThroughSetAnimationView a;
    
    e(final FlyThroughSetAnimationView a) {
        this.a = a;
    }
    
    public void onAnimationCancel(final Animator animator) {
        this.a.setVisibility(8);
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
