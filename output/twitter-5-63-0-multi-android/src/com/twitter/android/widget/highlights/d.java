// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.highlights;

import android.view.animation.Interpolator;

final class d implements Interpolator
{
    public float getInterpolation(final float n) {
        final float n2 = n - 1.0f;
        return 1.0f + n2 * (n2 * (n2 * (n2 * n2)));
    }
}
