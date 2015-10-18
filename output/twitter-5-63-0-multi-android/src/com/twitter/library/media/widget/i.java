// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.graphics.RectF;
import android.animation.ValueAnimator;
import android.animation.PropertyValuesHolder;

class i extends f
{
    private float a;
    private float b;
    private float c;
    
    public i(final CroppableImageView croppableImageView, final float a, final float n, final float b, final float n2, final float n3) {
        super(croppableImageView);
        this.a = a;
        this.b = b;
        final float width = croppableImageView.getActiveRect().width();
        final float n4 = width * n3;
        this.c = width;
        super.a(ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("x", new float[] { a, n }), PropertyValuesHolder.ofFloat("y", new float[] { b, n2 }), PropertyValuesHolder.ofFloat("width", new float[] { width, n4 }) }));
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final CroppableImageView b = this.b();
        if (b != null) {
            final float floatValue = (float)valueAnimator.getAnimatedValue("x");
            final float floatValue2 = (float)valueAnimator.getAnimatedValue("y");
            final float floatValue3 = (float)valueAnimator.getAnimatedValue("width");
            final float n = floatValue - this.a;
            final float n2 = floatValue2 - this.b;
            final float n3 = floatValue3 / this.c;
            final RectF activeRect = b.getActiveRect();
            b.a(activeRect.centerX(), activeRect.centerY(), n, n2, n3, 0);
            b.a(n, n2, n3);
            this.a = floatValue;
            this.b = floatValue2;
            this.c = floatValue3;
        }
    }
}
