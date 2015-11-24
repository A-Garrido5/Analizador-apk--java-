// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class b implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ a a;
    
    b(final a a) {
        this.a = a;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.a((float)valueAnimator.getAnimatedValue());
    }
}
