// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

import android.view.KeyEvent;
import android.graphics.RectF;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.content.Context;
import android.os.Handler;
import android.graphics.Matrix;
import android.widget.ImageView;

public abstract class ImageViewTouchBase extends ImageView
{
    public static boolean h;
    int a;
    protected Matrix b;
    private j c;
    protected float d;
    private float e;
    private final float[] f;
    protected Matrix g;
    private Runnable i;
    protected Handler j;
    protected final r k;
    int l;
    public Matrix m;
    
    public ImageViewTouchBase(final Context context) {
        super(context);
        this.g = new Matrix();
        this.b = new Matrix();
        this.m = new Matrix();
        this.f = new float[9];
        this.k = new r(null);
        this.l = -1;
        this.a = -1;
        this.e = 3.0f;
        this.j = new Handler();
        this.i = null;
        this.c();
    }
    
    public ImageViewTouchBase(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = new Matrix();
        this.b = new Matrix();
        this.m = new Matrix();
        this.f = new float[9];
        this.k = new r(null);
        this.l = -1;
        this.a = -1;
        this.e = 3.0f;
        this.j = new Handler();
        this.i = null;
        this.c();
    }
    
    private void a(final Bitmap imageBitmap, final Matrix matrix) {
        super.setImageBitmap(imageBitmap);
        final Drawable drawable = this.getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        final Bitmap f = this.k.f();
        this.k.a(imageBitmap);
        this.k.a(matrix);
        if (f != null && f != imageBitmap && this.c != null) {
            this.c.a(f);
        }
    }
    
    private void a(final r r, final Matrix matrix) {
        final float n = this.getWidth();
        final float n2 = this.getHeight();
        final float n3 = r.e();
        final float n4 = r.b();
        matrix.reset();
        final float min = Math.min(Math.min(n / n3, this.e), Math.min(n2 / n4, this.e));
        matrix.postConcat(r.c());
        matrix.postScale(min, min);
        matrix.postTranslate((n - n3 * min) / 2.0f, (n2 - n4 * min) / 2.0f);
    }
    
    private void c() {
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    protected float a(final Matrix matrix) {
        return this.a(matrix, 0);
    }
    
    protected float a(final Matrix matrix, final int n) {
        matrix.getValues(this.f);
        return this.f[n];
    }
    
    public void a() {
        this.setImageBitmapResetBase(null, true);
    }
    
    protected void a(final float n) {
        this.a(n, this.getWidth() / 2.0f, this.getHeight() / 2.0f);
    }
    
    public void a(final float n, final float n2) {
        if (n != 0.0f || n2 != 0.0f) {
            this.b(n, n2);
            this.setImageMatrix(this.b());
        }
    }
    
    protected void a(float d, final float n, final float n2) {
        if (d > this.d) {
            d = this.d;
        }
        final float n3 = d / this.e();
        this.b.postScale(n3, n3, n, n2);
        this.setImageMatrix(this.b());
        this.a(true, true);
    }
    
    protected void a(final float n, final float n2, final float n3, final float n4, final Runnable runnable) {
        this.j.post((Runnable)new o(this, n4, System.currentTimeMillis(), this.e(), (n - this.e()) / n4, n2, n3, runnable));
    }
    
    protected void a(final boolean b, final boolean b2) {
        final boolean h = ImageViewTouchBase.h;
        if (this.k.f() == null) {
            return;
        }
        final Matrix b3 = this.b();
        final RectF rectF = new RectF(0.0f, 0.0f, (float)this.k.f().getWidth(), (float)this.k.f().getHeight());
        b3.mapRect(rectF);
        final float height = rectF.height();
        final float width = rectF.width();
        float n2 = 0.0f;
        Label_0162: {
            if (b2) {
                final int height2 = this.getHeight();
                float n = 0.0f;
                Label_0275: {
                    if (height < height2) {
                        n = (height2 - height) / 2.0f - rectF.top;
                        if (!h) {
                            break Label_0275;
                        }
                    }
                    else {
                        n = 0.0f;
                    }
                    if (rectF.top > 0.0f) {
                        n = -rectF.top;
                        if (!h) {
                            break Label_0275;
                        }
                    }
                    if (rectF.bottom < height2) {
                        n2 = this.getHeight() - rectF.bottom;
                        break Label_0162;
                    }
                }
                n2 = n;
            }
            else {
                n2 = 0.0f;
            }
        }
        float n3 = 0.0f;
        Label_0246: {
            if (b) {
                final int width2 = this.getWidth();
                if (width < width2) {
                    n3 = (width2 - width) / 2.0f - rectF.left;
                    if (!h) {
                        break Label_0246;
                    }
                }
                else {
                    n3 = 0.0f;
                }
                if (rectF.left > 0.0f) {
                    n3 = -rectF.left;
                    if (!h) {
                        break Label_0246;
                    }
                }
                if (rectF.right < width2) {
                    n3 = width2 - rectF.right;
                }
            }
            else {
                n3 = 0.0f;
            }
        }
        this.b(n3, n2);
        this.setImageMatrix(this.b());
    }
    
    public Matrix b() {
        this.m.set(this.g);
        this.m.postConcat(this.b);
        return this.m;
    }
    
    protected void b(final float n, final float n2) {
        this.b.postTranslate(n, n2);
    }
    
    protected float d() {
        if (this.k.f() == null) {
            return 1.0f;
        }
        return Math.max(1.0f, 4.0f * Math.max(this.k.e() / this.l, this.k.b() / this.a));
    }
    
    public float e() {
        return this.a(this.b);
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.e() > 1.0f) {
            this.a(1.0f);
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.l = n3 - n;
        this.a = n4 - n2;
        final Runnable i = this.i;
        if (i != null) {
            this.i = null;
            i.run();
        }
        if (this.k.f() != null) {
            this.a(this.k, this.g);
            this.setImageMatrix(this.b());
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        if (imageBitmap == null) {
            super.setImageBitmap(imageBitmap);
            if (!ImageViewTouchBase.h) {
                return;
            }
        }
        this.setImageBitmapResetBase(imageBitmap, true);
    }
    
    public void setImageBitmapResetBase(final Bitmap bitmap, final boolean b) {
        this.setImageRotateBitmapResetBase(new r(bitmap), b);
    }
    
    public void setImageRotateBitmapResetBase(final r r, final boolean b) {
        if (this.getWidth() <= 0) {
            this.i = new l(this, r, b);
            return;
        }
        Label_0068: {
            if (r.f() != null) {
                this.a(r, this.g);
                this.a(r.f(), r.d());
                if (!ImageViewTouchBase.h) {
                    break Label_0068;
                }
            }
            this.g.reset();
            super.setImageBitmap((Bitmap)null);
        }
        if (b) {
            this.b.reset();
        }
        this.setImageMatrix(this.b());
        this.d = this.d();
    }
    
    public void setRecycler(final j c) {
        this.c = c;
    }
}
