// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.AccelerateDecelerateInterpolator;

class MaterialProgressDrawable$StartCurveInterpolator extends AccelerateDecelerateInterpolator
{
    private MaterialProgressDrawable$StartCurveInterpolator() {
    }
    
    MaterialProgressDrawable$StartCurveInterpolator(final MaterialProgressDrawable$1 materialProgressDrawable$1) {
        this();
    }
    
    public float getInterpolation(final float n) {
        return super.getInterpolation(Math.min(1.0f, 2.0f * n));
    }
}
