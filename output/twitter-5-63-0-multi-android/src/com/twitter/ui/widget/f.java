// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.view.animation.Animation$AnimationListener;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Animation;
import android.view.View;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$Callback;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public class f extends Drawable implements Animatable
{
    private static final Interpolator a;
    private static final Interpolator b;
    private static final Interpolator c;
    private static final Interpolator d;
    private static final int[] e;
    private final ArrayList f;
    private final m g;
    private final Drawable$Callback h;
    private float i;
    private Resources j;
    private View k;
    private Animation l;
    private float m;
    private double n;
    private double o;
    private Animation p;
    private boolean q;
    
    static {
        a = (Interpolator)new LinearInterpolator();
        b = (Interpolator)new l(null);
        c = (Interpolator)new n(null);
        d = (Interpolator)new AccelerateDecelerateInterpolator();
        e = new int[] { -16777216 };
    }
    
    public f(final Context context, final View k) {
        this.f = new ArrayList();
        this.h = (Drawable$Callback)new g(this);
        this.k = k;
        this.j = context.getResources();
        (this.g = new m(this.h)).a(com.twitter.ui.widget.f.e);
        this.a(1);
        this.c();
    }
    
    private void a(final double n, final double n2, final double n3, final double n4, final float n5, final float n6) {
        final m g = this.g;
        final float density = this.j.getDisplayMetrics().density;
        this.n = n * density;
        this.o = n2 * density;
        g.a(density * (float)n4);
        g.a(n3 * density);
        g.b(0);
        g.a(n5 * density, density * n6);
        g.a((int)this.n, (int)this.o);
    }
    
    private void c() {
        final m g = this.g;
        final h p = new h(this, g);
        p.setInterpolator(com.twitter.ui.widget.f.d);
        p.setDuration(666L);
        p.setAnimationListener((Animation$AnimationListener)new i(this, g));
        final j l = new j(this, g);
        l.setRepeatCount(-1);
        l.setRepeatMode(1);
        l.setInterpolator(com.twitter.ui.widget.f.a);
        l.setDuration(1333L);
        l.setAnimationListener((Animation$AnimationListener)new k(this, g));
        this.p = p;
        this.l = l;
    }
    
    public void a(final float n) {
        this.g.e(n);
    }
    
    public void a(final float n, final float n2) {
        this.g.b(n);
        this.g.c(n2);
    }
    
    public void a(final int n) {
        if (n == 0) {
            this.a(56.0, 56.0, 12.5, 3.0, 12.0f, 6.0f);
            return;
        }
        this.a(40.0, 40.0, 8.75, 2.5, 10.0f, 5.0f);
    }
    
    public void a(final boolean b) {
        this.g.a(b);
    }
    
    public void a(final int... array) {
        this.g.a(array);
        this.g.b(0);
    }
    
    public void b(final float n) {
        this.g.d(n);
    }
    
    public void b(final int n) {
        this.g.a(n);
    }
    
    void c(final float i) {
        this.i = i;
        this.invalidateSelf();
    }
    
    public void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        final int save = canvas.save();
        canvas.rotate(this.i, bounds.exactCenterX(), bounds.exactCenterY());
        this.g.a(canvas, bounds);
        canvas.restoreToCount(save);
    }
    
    public int getAlpha() {
        return this.g.b();
    }
    
    public int getIntrinsicHeight() {
        return (int)this.o;
    }
    
    public int getIntrinsicWidth() {
        return (int)this.n;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public boolean isRunning() {
        final ArrayList f = this.f;
        for (int size = f.size(), i = 0; i < size; ++i) {
            final Animation animation = f.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }
    
    public void setAlpha(final int n) {
        this.g.c(n);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.g.a(colorFilter);
    }
    
    public void start() {
        this.q = true;
        this.l.reset();
        this.g.j();
        if (this.g.g() != this.g.d()) {
            this.k.startAnimation(this.p);
            return;
        }
        this.g.b(0);
        this.g.k();
        this.k.startAnimation(this.l);
    }
    
    public void stop() {
        this.q = false;
        this.k.clearAnimation();
        this.c(0.0f);
        this.g.a(false);
        this.g.b(0);
        this.g.k();
    }
}
