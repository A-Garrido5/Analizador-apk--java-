// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Matrix;
import android.view.animation.Transformation;
import android.graphics.Camera;
import android.widget.ImageView;
import android.view.animation.Animation;

public class xw extends Animation
{
    private int a;
    private boolean b;
    private ImageView c;
    private Camera d;
    
    xw(final ImageView c, final int a) {
        this.c = c;
        this.a = a;
    }
    
    protected void applyTransformation(final float n, final Transformation transformation) {
        super.applyTransformation(n, transformation);
        final int n2 = (int)(180.0f * n) % 360;
        final Matrix matrix = transformation.getMatrix();
        this.d.save();
        this.d.translate(0.0f, 0.0f, (float)(this.c.getWidth() * Math.sin(3.141592653589793 * n2 / 180.0)));
        Label_0095: {
            if (n2 < 90) {
                this.d.rotateY((float)n2);
                if (!App.I) {
                    break Label_0095;
                }
            }
            this.d.rotateY((float)(n2 + 180));
        }
        this.d.getMatrix(matrix);
        this.d.restore();
        matrix.preTranslate((float)(-this.c.getWidth() / 2), (float)(-this.c.getHeight() / 2));
        matrix.postTranslate((float)(this.c.getWidth() / 2), (float)(this.c.getHeight() / 2));
        if (n2 > 90 && !this.b) {
            this.b = true;
            this.c.setImageResource(this.a);
        }
    }
    
    public void initialize(final int n, final int n2, final int n3, final int n4) {
        super.initialize(n, n2, n3, n4);
        this.d = new Camera();
    }
}
