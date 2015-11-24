// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.support.v4.view.ViewCompat;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.support.annotation.InterpolatorRes;
import android.view.View;
import android.view.animation.Interpolator;

class ax implements Runnable
{
    private static final Interpolator b;
    boolean a;
    private final Interpolator c;
    private final float d;
    private long e;
    private final View f;
    private boolean g;
    
    static {
        b = (Interpolator)new bh(null);
    }
    
    ax(final View f, final float d, final Interpolator c) {
        this.f = f;
        this.d = d;
        this.c = c;
    }
    
    ax(final View view, final int n) {
        this(view, n, ax.b);
    }
    
    ax(final View view, final int n, @InterpolatorRes final int n2) {
        this(view, n, AnimationUtils.loadInterpolator(view.getContext(), n2));
    }
    
    public void a() {
        this.e = SystemClock.uptimeMillis();
        this.g = false;
        this.a = true;
        this.c();
        ViewCompat.postOnAnimation(this.f, this);
    }
    
    public void a(final float n) {
    }
    
    public void b() {
        this.g = true;
    }
    
    public void c() {
    }
    
    public void d() {
    }
    
    @Override
    public void run() {
        if (this.g) {
            this.a = false;
            return;
        }
        final float n = (SystemClock.uptimeMillis() - this.e) / this.d;
        if (n >= 1.0f) {
            this.a(1.0f);
            this.a = false;
            this.d();
            return;
        }
        this.a(this.c.getInterpolation(n));
        ViewCompat.postOnAnimation(this.f, this);
    }
}
