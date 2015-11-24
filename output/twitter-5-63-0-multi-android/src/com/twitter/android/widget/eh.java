// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.animation.Animator;
import android.widget.ProgressBar;
import android.os.Handler;
import android.animation.Animator$AnimatorListener;

public class eh implements Animator$AnimatorListener
{
    private final Handler a;
    private final ProgressBar b;
    
    eh(final Handler a, final ProgressBar b) {
        this.a = a;
        this.b = b;
    }
    
    public void onAnimationCancel(final Animator animator) {
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.post((Runnable)new ei(this));
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
