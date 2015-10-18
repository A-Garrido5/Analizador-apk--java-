// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Transformation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.view.animation.Animation;

final class ve extends Animation
{
    final int a;
    final int b;
    final View c;
    
    ve(final View c, final int b) {
        this.c = c;
        this.a = c.getHeight();
        this.b = b;
        this.setInterpolator((Interpolator)new DecelerateInterpolator(0.8f));
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        super.applyTransformation(n, transformation);
        this.c.getLayoutParams().height = (int)(this.a + n * (this.b - this.a));
        this.c.requestLayout();
    }
    
    public boolean willChangeBounds() {
        return true;
    }
}
