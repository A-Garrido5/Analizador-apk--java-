// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.animation.Animator;
import android.view.View;
import android.animation.Animator$AnimatorListener;

class g implements Animator$AnimatorListener
{
    final /* synthetic */ View a;
    final /* synthetic */ FlyThroughSetAnimationView b;
    
    g(final FlyThroughSetAnimationView b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationCancel(final Animator animator) {
        this.b.removeView(this.a);
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.b.removeView(this.a);
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
