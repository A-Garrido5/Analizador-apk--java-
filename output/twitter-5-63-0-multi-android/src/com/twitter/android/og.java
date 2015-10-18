// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.View;
import android.widget.ViewAnimator;
import com.twitter.library.widget.TweetView;

public class og extends xb
{
    public final TweetView a;
    public final ViewAnimator b;
    
    public og(final View view) {
        super(view, true);
        this.b = (ViewAnimator)view.findViewById(2131886136);
        final AlphaAnimation inAnimation = new AlphaAnimation(0.0f, 1.0f);
        inAnimation.setDuration(150L);
        inAnimation.setFillAfter(true);
        this.b.setInAnimation((Animation)inAnimation);
        final AlphaAnimation outAnimation = new AlphaAnimation(0.4f, 0.0f);
        outAnimation.setDuration(150L);
        outAnimation.setFillAfter(false);
        this.b.setOutAnimation((Animation)outAnimation);
        this.a = (TweetView)this.b.getChildAt(1);
    }
}
