// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.graphics.Matrix;
import android.graphics.Bitmap;

public class r
{
    private Bitmap a;
    private Matrix b;
    
    public r(final Bitmap a) {
        this.a = a;
    }
    
    public void a(final Bitmap a) {
        this.a = a;
    }
    
    public void a(final Matrix b) {
        this.b = b;
    }
    
    public boolean a() {
        final Matrix b = this.b;
        boolean b2 = false;
        if (b != null) {
            final float[] array = { 0.0f, 1.0f };
            this.b.mapVectors(array);
            final float n = fcmpl(array[0], 0.0f);
            b2 = false;
            if (n != 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public int b() {
        if (this.a()) {
            return this.a.getWidth();
        }
        return this.a.getHeight();
    }
    
    public Matrix c() {
        final Matrix matrix = new Matrix();
        if (this.b != null) {
            matrix.preTranslate((float)(-(this.a.getWidth() / 2)), (float)(-(this.a.getHeight() / 2)));
            matrix.postConcat(this.b);
            matrix.postTranslate((float)(this.e() / 2), (float)(this.b() / 2));
        }
        return matrix;
    }
    
    public Matrix d() {
        return this.b;
    }
    
    public int e() {
        if (this.a()) {
            return this.a.getHeight();
        }
        return this.a.getWidth();
    }
    
    public Bitmap f() {
        return this.a;
    }
}
