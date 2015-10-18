// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Matrix;
import android.view.animation.Transformation;
import android.graphics.Camera;
import android.view.animation.Animation;

public class b3 extends Animation
{
    private final float a;
    protected final float b;
    private final boolean c;
    private final float d;
    private final float e;
    private Camera f;
    protected final float g;
    
    public b3(final float b, final float g, final float a, final float e, final float d, final boolean c) {
        this.b = b;
        this.g = g;
        this.a = a;
        this.e = e;
        this.d = d;
        this.c = c;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        final float b = this.b;
        final float n2 = b + n * (this.g - b);
        final float a = this.a;
        final float e = this.e;
        final Camera f = this.f;
        final Matrix matrix = transformation.getMatrix();
        f.save();
        f.translate(0.0f, 0.0f, (float)(this.d * Math.sin(3.141592653589793 * n)));
        f.rotateY(n2);
        f.getMatrix(matrix);
        f.restore();
        matrix.preTranslate(-a, -e);
        matrix.postTranslate(a, e);
    }
    
    public void initialize(final int n, final int n2, final int n3, final int n4) {
        super.initialize(n, n2, n3, n4);
        this.f = new Camera();
    }
}
