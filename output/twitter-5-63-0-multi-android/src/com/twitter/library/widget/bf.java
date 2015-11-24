// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Rect;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class bf implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ TweetView a;
    private TweetView$InlineAction b;
    
    public bf(final TweetView a, final TweetView$InlineAction b) {
        this.a = a;
        this.b = b;
    }
    
    public void onAnimationUpdate(final ValueAnimator d) {
        final Rect c = this.b.c;
        final int width = c.width();
        final int height = c.height();
        this.a.invalidate(c.left - width, c.top - height, width + c.right, height + c.bottom);
        this.b.d = d;
    }
}
