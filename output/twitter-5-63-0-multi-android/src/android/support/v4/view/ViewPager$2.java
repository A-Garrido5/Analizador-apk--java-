// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.animation.Interpolator;

final class ViewPager$2 implements Interpolator
{
    public float getInterpolation(final float n) {
        final float n2 = n - 1.0f;
        return 1.0f + n2 * (n2 * (n2 * (n2 * n2)));
    }
}
