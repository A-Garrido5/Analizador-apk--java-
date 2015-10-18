// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.animation.Transformation;
import com.twitter.util.g;
import android.view.animation.Animation;

class bm extends Animation
{
    public final float a;
    public final float b;
    
    public bm(final float n, final float n2, final float n3) {
        this.a = Math.copySign(n2, n);
        this.b = Math.copySign(n3, n);
        this.setDuration((long)(int)g.c(n, this.a, this.b));
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        transformation.getMatrix().setTranslate(0.0f, g.b(n * this.getDuration(), this.a, this.b));
    }
}
