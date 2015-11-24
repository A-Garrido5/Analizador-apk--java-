// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Matrix;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap;
import android.graphics.drawable.LayerDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.view.animation.AccelerateInterpolator;

public class qo
{
    private final AccelerateInterpolator a;
    private final Rect b;
    private final Drawable c;
    private final Resources d;
    private LayerDrawable e;
    
    public qo(final Resources d, Drawable c, final Rect b) {
        this.d = d;
        if (c == null) {
            c = this.c();
        }
        this.c = c;
        this.b = b;
        this.a = new AccelerateInterpolator(3.0f);
    }
    
    private Bitmap a(final Bitmap bitmap) {
        final int top = this.b.top;
        Bitmap a = null;
        if (top >= 0) {
            final int left = this.b.left;
            a = null;
            if (left >= 0) {
                a = m.a(bitmap, this.b, null, false);
                if (a == bitmap) {
                    return m.a(bitmap);
                }
            }
        }
        return a;
    }
    
    private LayerDrawable a(final Drawable drawable) {
        return new LayerDrawable(new Drawable[] { drawable, this.c });
    }
    
    private Drawable c() {
        return (Drawable)new ColorDrawable(17170445);
    }
    
    public Drawable a() {
        if (this.e != null) {
            return this.c;
        }
        return this.c();
    }
    
    public LayerDrawable a(@ColorRes final int n) {
        if (this.e != null) {
            return this.e;
        }
        return this.a((Drawable)new ColorDrawable(n));
    }
    
    public void a(final float n) {
        this.c.setColorFilter(Color.argb((int)(96.0f * this.a.getInterpolation(Math.min(n, 1.0f))), 0, 0, 0), PorterDuff$Mode.SRC_OVER);
    }
    
    public void a(final Bitmap bitmap, final boolean b) {
        this.b();
        try {
            final Bitmap a = this.a(bitmap);
            if (a != null) {
                this.e = this.a((Drawable)new BitmapDrawable(this.d, a));
            }
        }
        finally {
            if (b) {
                bitmap.recycle();
            }
        }
    }
    
    public void b() {
        if (this.e != null) {
            final Drawable drawable = this.e.getDrawable(0);
            if (drawable instanceof BitmapDrawable) {
                ((BitmapDrawable)drawable).getBitmap().recycle();
            }
            this.e = null;
        }
    }
}
