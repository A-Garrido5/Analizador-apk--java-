// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.animation.Animator;
import android.widget.ProgressBar;
import android.os.Handler;
import android.animation.Animator$AnimatorListener;

class ei implements Runnable
{
    final /* synthetic */ eh a;
    
    ei(final eh a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.setVisibility(8);
        this.a.b.setProgress(0);
        this.a.b.setSecondaryProgress(0);
    }
}
