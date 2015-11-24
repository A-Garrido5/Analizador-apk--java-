// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.animation.Interpolator;

class bh implements Interpolator
{
    public float getInterpolation(final float n) {
        if (n < 0.05f) {
            return n * (10.526316f * n);
        }
        if (n < 0.95f) {
            return -0.02631579f + 1.0526316f * n;
        }
        final float n2 = 1.0f - n;
        return 1.0f - n2 * (10.526316f * n2);
    }
}
