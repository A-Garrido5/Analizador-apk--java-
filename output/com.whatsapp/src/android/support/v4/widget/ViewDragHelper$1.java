// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Interpolator;

final class ViewDragHelper$1 implements Interpolator
{
    public float getInterpolation(final float n) {
        final float n2 = n - 1.0f;
        return 1.0f + n2 * (n2 * (n2 * (n2 * n2)));
    }
}
