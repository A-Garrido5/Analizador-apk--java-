// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.graphics.drawable.Drawable;
import java.util.List;
import android.util.DisplayMetrics;

public class d
{
    private final DisplayMetrics a;
    private final int b;
    private final int c;
    private final List d;
    private final c e;
    private int f;
    private final int g;
    private final int h;
    
    public d(final DisplayMetrics a, final int b, final int c, final List d, final c e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = a.widthPixels / c;
        this.h = this.a();
        this.e = e;
    }
    
    int a() {
        return Math.round(Math.min(this.a.widthPixels, this.a.heightPixels) / this.c);
    }
    
    int b() {
        return this.b;
    }
    
    public a c() {
        final Drawable drawable = this.d.get(this.f % this.d.size());
        final int n = this.f % this.c * this.g - this.g / 2;
        ++this.f;
        this.e.a(drawable).b(n).c(n + this.g).a(this.h);
        return this.e.a();
    }
}
