// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public class c
{
    public DisplayMetrics a;
    public Drawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public double i;
    public float j;
    
    public a a() {
        return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
    }
    
    public c a(final double i) {
        this.i = i;
        return this;
    }
    
    public c a(final float j) {
        this.j = j;
        return this;
    }
    
    public c a(final int c) {
        this.c = c;
        return this;
    }
    
    public c a(final Drawable b) {
        this.b = b;
        return this;
    }
    
    public c a(final DisplayMetrics a) {
        this.a = a;
        return this;
    }
    
    public c b(final int d) {
        this.d = d;
        return this;
    }
    
    public c c(final int e) {
        this.e = e;
        return this;
    }
    
    public c d(final int f) {
        this.f = f;
        return this;
    }
    
    public c e(final int g) {
        this.g = g;
        return this;
    }
    
    public c f(final int h) {
        this.h = h;
        return this;
    }
}
