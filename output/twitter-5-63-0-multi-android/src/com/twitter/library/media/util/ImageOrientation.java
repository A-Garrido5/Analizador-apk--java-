// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.internal.android.util.Size;
import android.graphics.RectF;
import android.graphics.Matrix;
import com.twitter.util.k;
import com.twitter.util.g;
import com.twitter.util.collection.e;

public enum ImageOrientation
{
    a("UNDEFINED", 0, false, 0, 0), 
    b("NORMAL", 1, false, 0, 1), 
    c("FLIP_HORIZONTAL", 2, true, 0, 2), 
    d("ROTATE_180", 3, false, 180, 3), 
    e("FLIP_VERTICAL", 4, true, 180, 4), 
    f("TRANSPOSE", 5, true, 90, 5), 
    g("ROTATE_90", 6, false, 90, 6), 
    h("TRANSVERSE", 7, true, 270, 7), 
    i("ROTATE_270", 8, false, 270, 8);
    
    private static final e j;
    public final int degrees;
    public final int exifOrientation;
    public final boolean flipped;
    
    static {
        (j = new e()).a(0, ImageOrientation.a);
        ImageOrientation.j.a(1, ImageOrientation.b);
        ImageOrientation.j.a(2, ImageOrientation.c);
        ImageOrientation.j.a(3, ImageOrientation.d);
        ImageOrientation.j.a(4, ImageOrientation.e);
        ImageOrientation.j.a(5, ImageOrientation.f);
        ImageOrientation.j.a(6, ImageOrientation.g);
        ImageOrientation.j.a(7, ImageOrientation.h);
        ImageOrientation.j.a(8, ImageOrientation.i);
    }
    
    private ImageOrientation(final String s, final int n, final boolean flipped, final int degrees, final int exifOrientation) {
        this.flipped = flipped;
        this.degrees = degrees;
        this.exifOrientation = exifOrientation;
    }
    
    public static ImageOrientation a(final int n) {
        return a(n, false);
    }
    
    public static ImageOrientation a(final int n, final boolean b) {
        switch (com.twitter.util.g.a(n, 360)) {
            default: {
                return ImageOrientation.a;
            }
            case 0: {
                if (b) {
                    return ImageOrientation.c;
                }
                return ImageOrientation.b;
            }
            case 90: {
                if (b) {
                    return ImageOrientation.f;
                }
                return ImageOrientation.g;
            }
            case 180: {
                if (b) {
                    return ImageOrientation.e;
                }
                return ImageOrientation.d;
            }
            case 270: {
                if (b) {
                    return ImageOrientation.h;
                }
                return ImageOrientation.i;
            }
        }
    }
    
    public static ImageOrientation b(final int n) {
        return (ImageOrientation)com.twitter.util.k.a(ImageOrientation.j.a(n), ImageOrientation.a);
    }
    
    public Matrix a() {
        if (this.degrees == 0 && !this.flipped) {
            return new Matrix();
        }
        final Matrix matrix = new Matrix();
        if (this.flipped) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postRotate((float)this.degrees);
        return matrix;
    }
    
    public RectF a(final RectF rectF, final float n, final float n2) {
        if (this.degrees == 0 && !this.flipped) {
            return rectF;
        }
        final Matrix matrix = new Matrix();
        if (this.flipped) {
            matrix.postScale(-1.0f, 1.0f, n, n2);
        }
        matrix.postRotate((float)this.degrees, n, n2);
        final RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }
    
    public Size a(Size a) {
        if (this.degrees == 90 || this.degrees == 270) {
            a = Size.a(a.b(), a.a());
        }
        return a;
    }
    
    public ImageOrientation b() {
        if (this.degrees == 0) {
            return this;
        }
        return a(-this.degrees, this.flipped);
    }
    
    public ImageOrientation c(final int n) {
        return a(n + this.degrees, this.flipped);
    }
}
