// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class h extends Animation
{
    final /* synthetic */ m a;
    final /* synthetic */ f b;
    
    h(final f b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    public void applyTransformation(final float n, final Transformation transformation) {
        final float n2 = (float)(1.0 + Math.floor(this.a.i() / 0.8f));
        this.a.b(this.a.e() + n * (this.a.f() - this.a.e()));
        this.a.d(this.a.i() + n * (n2 - this.a.i()));
        this.a.e(1.0f - n);
    }
}
