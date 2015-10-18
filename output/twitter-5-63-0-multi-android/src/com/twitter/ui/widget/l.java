// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.view.animation.AccelerateDecelerateInterpolator;

class l extends AccelerateDecelerateInterpolator
{
    public float getInterpolation(final float n) {
        return super.getInterpolation(Math.max(0.0f, 2.0f * (n - 0.5f)));
    }
}
