// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.animation.Animator;
import android.widget.ProgressBar;
import android.os.Handler;
import android.animation.Animator$AnimatorListener;

class eg implements Runnable
{
    final /* synthetic */ ef a;
    
    eg(final ef a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.c) {
            this.a.b.setProgress(this.a.d);
            return;
        }
        this.a.b.setSecondaryProgress(this.a.d);
    }
}
