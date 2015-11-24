// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.animation.Animator;
import android.widget.ProgressBar;
import android.os.Handler;
import android.animation.Animator$AnimatorListener;

public class ef implements Animator$AnimatorListener
{
    private final Handler a;
    private final ProgressBar b;
    private final boolean c;
    private final int d;
    
    ef(final Handler a, final ProgressBar b, final boolean c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void onAnimationCancel(final Animator animator) {
    }
    
    public void onAnimationEnd(final Animator animator) {
        this.a.post((Runnable)new eg(this));
    }
    
    public void onAnimationRepeat(final Animator animator) {
    }
    
    public void onAnimationStart(final Animator animator) {
    }
}
