// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import java.io.FileNotFoundException;
import android.net.Uri;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.BitmapShader;
import android.graphics.Bitmap;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Matrix;
import android.graphics.Paint;

class ag
{
    private final Paint a;
    private final Matrix b;
    private final int c;
    private final Shape d;
    private final float[] e;
    private Bitmap f;
    private BitmapShader g;
    private int h;
    private int i;
    
    public ag(final float[] e) {
        int c = 0;
        this.a = new Paint(1);
        this.b = new Matrix();
        this.h = 0;
        this.i = 0;
        this.e = e;
        this.d = (Shape)new RoundRectShape(e, (RectF)null, (float[])null);
        for (final float n : e) {
            if (n > c) {
                c = (int)n;
            }
        }
        this.c = c;
    }
    
    public static Bitmap a(final Drawable drawable, int n) {
        if (!(drawable instanceof BitmapDrawable)) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            while (true) {
                Label_0094: {
                    if (intrinsicWidth <= 0) {
                        break Label_0094;
                    }
                    final int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicHeight > 0) {
                        n = intrinsicHeight;
                    }
                    try {
                        final Bitmap bitmap = Bitmap.createBitmap(intrinsicWidth, n, Bitmap$Config.ARGB_8888);
                        if (bitmap != null) {
                            final Canvas canvas = new Canvas(bitmap);
                            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawable.draw(canvas);
                            return bitmap;
                        }
                        return bitmap;
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        return null;
                    }
                }
                intrinsicWidth = n;
                continue;
            }
        }
        return ((BitmapDrawable)drawable).getBitmap();
    }
    
    public int a() {
        return this.h;
    }
    
    public int a(final int n, final int n2, final int n3) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        switch (mode) {
            default: {
                return n3;
            }
            case 1073741824: {
                return size;
            }
            case Integer.MIN_VALUE: {
                if (n2 == -2) {
                    return Math.min(size, n3);
                }
                if (n2 == -1) {
                    return size;
                }
                return Math.min(size, n2);
            }
        }
    }
    
    public void a(final int n, final int n2) {
        float n3 = 0.0f;
        this.d.resize((float)n, (float)n2);
        if (this.g != null && (this.h != n || this.i != n2)) {
            float n4;
            float n5;
            if (n2 * this.h > n * this.i) {
                n4 = n2 / this.i;
                n5 = 0.5f * (n - n4 * this.h);
            }
            else {
                n4 = n / this.h;
                n3 = 0.5f * (n2 - n4 * this.i);
                n5 = 0.0f;
            }
            this.b.setScale(n4, n4);
            this.b.postTranslate((float)(int)(n5 + 0.5f), (float)(int)(n3 + 0.5f));
            if (this.g != null) {
                this.g.setLocalMatrix(this.b);
            }
        }
    }
    
    public void a(final Context context, final Uri uri) {
        try {
            this.a(a(Drawable.createFromStream(context.getContentResolver().openInputStream(uri), uri.toString()), 2 * this.c));
        }
        catch (FileNotFoundException ex) {}
        catch (OutOfMemoryError outOfMemoryError) {
            goto Label_0030;
        }
    }
    
    public void a(final Resources resources, final int n) {
        this.a(a(resources.getDrawable(n), 2 * this.c));
    }
    
    public void a(final Bitmap f) {
        if (f != null) {
            this.g = new BitmapShader(f, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
            this.h = f.getWidth();
            this.i = f.getHeight();
        }
        else {
            this.g = null;
            this.h = 0;
            this.i = 0;
        }
        this.f = f;
        this.a.setShader((Shader)this.g);
    }
    
    public void a(final Canvas canvas, final int n, final int n2) {
        canvas.translate((float)n, (float)n2);
        this.d.draw(canvas, this.a);
    }
    
    public void a(final Drawable drawable) {
        Bitmap a;
        if (drawable != null) {
            a = a(drawable, 2 * this.c);
        }
        else {
            a = null;
        }
        this.a(a);
    }
    
    public int b() {
        return this.i;
    }
}
