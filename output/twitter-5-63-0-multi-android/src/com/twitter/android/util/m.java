// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.RotateAnimation;
import com.twitter.util.g;
import android.view.View;

final class m implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    
    m(final int a, final View b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, (float)(-180 + g.a(180 + (this.a - Math.round(this.b.getRotation())), 360)), 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration((long)this.c);
        rotateAnimation.setAnimationListener((Animation$AnimationListener)new n(this));
        if (this.d > 0) {
            rotateAnimation.setInterpolator(this.b.getContext(), this.d);
        }
        this.b.startAnimation((Animation)rotateAnimation);
    }
}
