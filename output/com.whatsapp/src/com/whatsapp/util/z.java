// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class z implements ValueAnimator$AnimatorUpdateListener
{
    final FloatingChildLayout a;
    
    z(final FloatingChildLayout a) {
        this.a = a;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.setBackgroundColorAlpha((int)valueAnimator.getAnimatedValue());
    }
}
