// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Interpolator;

class bt implements Interpolator
{
    final ps a;
    
    bt(final ps a) {
        this.a = a;
    }
    
    public float getInterpolation(final float n) {
        if (n > 0.5) {
            return Math.min(n, ps.h(this.a));
        }
        return 0.0f;
    }
}
