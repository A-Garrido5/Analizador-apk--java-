// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation$AnimationListener;
import com.twitter.library.widget.TweetView;
import com.twitter.library.provider.Tweet;
import android.widget.ViewAnimator;

class xd implements Runnable
{
    final /* synthetic */ ViewAnimator a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ xc d;
    
    xd(final xc d, final ViewAnimator a, final Tweet b, final Runnable c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        ((TweetView)this.a.getChildAt(1)).setTweetNoLayout(this.b);
        if (this.c != null) {
            this.a.getInAnimation().setAnimationListener((Animation$AnimationListener)new xe(this));
        }
        this.a.showNext();
    }
}
