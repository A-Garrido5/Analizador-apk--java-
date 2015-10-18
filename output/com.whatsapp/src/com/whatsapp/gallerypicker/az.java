// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.animation.Interpolator;

class az implements Interpolator
{
    final av a;
    
    az(final av a) {
        this.a = a;
    }
    
    public float getInterpolation(final float n) {
        final float n2 = fcmpl(n, 0.0f);
        float n3 = 0.0f;
        if (n2 > 0) {
            n3 = 1.0f;
        }
        return n3;
    }
}
