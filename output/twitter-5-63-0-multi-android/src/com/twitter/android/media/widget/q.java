// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.animation.Animator;
import com.twitter.library.util.g;

class q extends g
{
    final /* synthetic */ FilterFilmstripView a;
    
    q(final FilterFilmstripView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animator animator) {
        this.a.setVisibility(8);
        this.a.setTranslationY(0.0f);
    }
}
