// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.animation.Animator;
import com.twitter.library.util.g;

class ax extends g
{
    final /* synthetic */ ComposerScrollView a;
    
    ax(final ComposerScrollView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animator animator) {
        this.a.a = true;
    }
}
