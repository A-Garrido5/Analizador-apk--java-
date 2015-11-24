// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.animation.Animator;
import com.twitter.library.util.g;

final class fy extends g
{
    final /* synthetic */ EditImageFragment a;
    
    fy(final EditImageFragment a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animator animator) {
        this.a.a(true, true);
    }
}
