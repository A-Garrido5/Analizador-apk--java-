// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class xe implements Animation$AnimationListener
{
    final /* synthetic */ xd a;
    
    xe(final xd a) {
        this.a = a;
    }
    
    public void onAnimationEnd(final Animation animation) {
        this.a.c.run();
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
