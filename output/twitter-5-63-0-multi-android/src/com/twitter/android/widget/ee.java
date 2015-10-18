// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.widget.ProgressBar;
import android.os.Handler;
import android.animation.Animator$AnimatorListener;

public class ee implements Animator$AnimatorListener
{
    private final Handler a;
    private final ProgressBar b;
    
    ee(final Handler a, final ProgressBar b) {
        this.a = a;
        this.b = b;
    }
    
    public void onAnimationCancel(final Animator animator) {
    }
    
    public void onAnimationEnd(final Animator animator) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.b, "alpha", new float[] { 0.0f });
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
        ofFloat.addListener((Animator$AnimatorListener)new eh(this.a, this.b));
        ofFloat.start();
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
