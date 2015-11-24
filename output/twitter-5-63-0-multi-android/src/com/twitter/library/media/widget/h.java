// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.graphics.RectF;
import android.animation.ValueAnimator;
import com.twitter.util.g;
import android.animation.PropertyValuesHolder;
import com.twitter.util.j;
import android.graphics.Matrix;

class h extends f
{
    private int a;
    private float b;
    private float c;
    private float d;
    
    public h(final CroppableImageView croppableImageView, final int n) {
        super(croppableImageView);
        this.a = 0;
        this.b = 1.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        final RectF activeRect = croppableImageView.getActiveRect();
        final Matrix matrix = new Matrix();
        final float centerX = activeRect.centerX();
        final float centerY = activeRect.centerY();
        matrix.postRotate((float)n, centerX, centerY);
        final RectF imageRect = croppableImageView.getImageRect();
        matrix.mapRect(imageRect);
        final float max = Math.max(1.0f, j.a(imageRect, activeRect, false));
        matrix.postScale(max, max, centerX, centerY);
        imageRect.set(croppableImageView.getImageRect());
        matrix.mapRect(imageRect);
        super.a(ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("rot", new int[] { 0, n }), PropertyValuesHolder.ofFloat("scale", new float[] { 1.0f, max }), PropertyValuesHolder.ofFloat("x", new float[] { 0.0f, g.a(0.0f, imageRect.right, imageRect.left, activeRect.right, activeRect.left) }), PropertyValuesHolder.ofFloat("y", new float[] { 0.0f, g.a(0.0f, imageRect.bottom, imageRect.top, activeRect.bottom, activeRect.top) }) }));
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        final CroppableImageView b = this.b();
        if (b != null) {
            final int intValue = (int)valueAnimator.getAnimatedValue("rot");
            final float floatValue = (float)valueAnimator.getAnimatedValue("scale");
            final float floatValue2 = (float)valueAnimator.getAnimatedValue("x");
            final float floatValue3 = (float)valueAnimator.getAnimatedValue("y");
            final int n = intValue - this.a;
            final float n2 = floatValue / this.b;
            final float n3 = floatValue2 - this.c;
            final float n4 = floatValue3 - this.d;
            final RectF activeRect = b.getActiveRect();
            b.a(activeRect.centerX() + this.c, activeRect.centerY() + this.d, n3, n4, n2, n);
            this.a = intValue;
            this.b = floatValue;
            this.c = floatValue2;
            this.d = floatValue3;
        }
    }
}
