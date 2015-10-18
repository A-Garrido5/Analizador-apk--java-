// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import android.graphics.Matrix;
import android.view.animation.Transformation;
import android.view.animation.Interpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.View;
import android.graphics.Camera;
import android.view.animation.Animation;

public class h extends Animation
{
    private Camera a;
    private View b;
    private View c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    
    public h(final View b, final View c, final int n, final int n2) {
        this.f = true;
        this.b = b;
        this.c = c;
        this.d = n;
        this.e = n2;
        this.setDuration(500L);
        this.setFillAfter(true);
        this.setInterpolator((Interpolator)new AccelerateDecelerateInterpolator());
    }
    
    public void a() {
        this.f = false;
        final View c = this.c;
        this.c = this.b;
        this.b = c;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        final double n2 = 3.141592653589793 * n;
        float n3 = (float)(180.0 * n2 / 3.141592653589793);
        if (n >= 0.5f) {
            n3 -= 180.0f;
            if (!this.g) {
                this.b.setVisibility(8);
                this.c.setVisibility(0);
                this.g = true;
            }
        }
        if (this.f) {
            n3 = -n3;
        }
        final Matrix matrix = transformation.getMatrix();
        this.a.save();
        this.a.translate(0.0f, 0.0f, (float)(150.0 * Math.sin(n2)));
        this.a.rotateY(n3);
        this.a.getMatrix(matrix);
        this.a.restore();
        matrix.preTranslate(-this.d, -this.e);
        matrix.postTranslate(this.d, this.e);
    }
    
    public void initialize(final int n, final int n2, final int n3, final int n4) {
        super.initialize(n, n2, n3, n4);
        this.a = new Camera();
    }
}
