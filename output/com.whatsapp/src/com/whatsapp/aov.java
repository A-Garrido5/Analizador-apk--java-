// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class aov extends Animation
{
    final CircularRevealView a;
    boolean b;
    
    aov(final CircularRevealView a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    protected void applyTransformation(float n, final Transformation transformation) {
        final CircularRevealView a = this.a;
        if (this.b) {
            n = 1.0f - n;
        }
        CircularRevealView.a(a, n);
        this.a.invalidate();
    }
}
