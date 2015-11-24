// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.animation.ValueAnimator;
import android.view.View;
import android.graphics.PathMeasure;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class f implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ PathMeasure a;
    final /* synthetic */ float[] b;
    final /* synthetic */ View c;
    final /* synthetic */ FlyThroughSetAnimationView d;
    
    f(final FlyThroughSetAnimationView d, final PathMeasure a, final float[] b, final View c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.getPosTan(valueAnimator.getAnimatedFraction() * this.a.getLength(), this.b, (float[])null);
        this.c.setTranslationX(this.b[0]);
        this.c.setTranslationY(this.b[1]);
    }
}
