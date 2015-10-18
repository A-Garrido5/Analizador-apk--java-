// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.Path;
import java.util.Random;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public class a
{
    protected final DisplayMetrics a;
    protected final Drawable b;
    protected final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final double i;
    private final float j;
    private final Random k;
    
    private a(final DisplayMetrics a, final Drawable b, final int c, final int d, final int e, final int f, final int g, final int h, final double i, final float j) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = new Random();
    }
    
    protected int a(int n, final int n2) {
        if (n2 - n > 0) {
            n += this.k.nextInt(n2 - n);
        }
        return n;
    }
    
    public Path a() {
        final int round = Math.round(this.a.density * this.a(-this.h, this.h));
        final int a = this.a(this.d, this.e);
        final int n = round + a;
        final float n2 = this.a.heightPixels;
        final float n3 = -this.b.getIntrinsicHeight();
        final Path path = new Path();
        path.moveTo((float)a, n2);
        path.quadTo((a + n) / 2.0f, (n2 + n3) / 2.0f, (float)n, n3);
        return path;
    }
    
    public ImageView a(final Context context) {
        final ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(this.b);
        imageView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(this.c, -2));
        return imageView;
    }
    
    public long b() {
        return Math.round((this.a.heightPixels - -this.b.getIntrinsicHeight()) / (this.c * this.i));
    }
    
    public long c() {
        return this.a(this.f, this.g);
    }
    
    public TimeInterpolator d() {
        return (TimeInterpolator)new AccelerateInterpolator(this.j);
    }
}
