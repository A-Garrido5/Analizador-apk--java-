// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class aax implements Animation$AnimationListener
{
    final ConversationsFragment a;
    final int b;
    
    aax(final ConversationsFragment a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public void onAnimationEnd(final Animation animation) {
        ConversationsFragment.k(this.a).post((Runnable)new tg(this));
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
