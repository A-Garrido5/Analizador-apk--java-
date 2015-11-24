// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.Path$FillType;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Path;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Paint;
import android.graphics.RectF;

class m
{
    private final RectF a;
    private final Paint b;
    private final Paint c;
    private final Drawable$Callback d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int[] j;
    private int k;
    private float l;
    private float m;
    private float n;
    private boolean o;
    private Path p;
    private float q;
    private double r;
    private int s;
    private int t;
    private int u;
    private final Paint v;
    private int w;
    
    public m(final Drawable$Callback d) {
        this.a = new RectF();
        this.b = new Paint();
        this.c = new Paint();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.i = 2.5f;
        this.v = new Paint();
        this.d = d;
        this.b.setStrokeCap(Paint$Cap.SQUARE);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint$Style.STROKE);
        this.c.setStyle(Paint$Style.FILL);
        this.c.setAntiAlias(true);
    }
    
    private void a(final Canvas canvas, final float n, final float n2, final Rect rect) {
        if (this.o) {
            if (this.p == null) {
                (this.p = new Path()).setFillType(Path$FillType.EVEN_ODD);
            }
            else {
                this.p.reset();
            }
            final float n3 = (int)this.i / 2 * this.q;
            final float n4 = (float)(this.r * Math.cos(0.0) + rect.exactCenterX());
            final float n5 = (float)(this.r * Math.sin(0.0) + rect.exactCenterY());
            this.p.moveTo(0.0f, 0.0f);
            this.p.lineTo(this.s * this.q, 0.0f);
            this.p.lineTo(this.s * this.q / 2.0f, this.t * this.q);
            this.p.offset(n4 - n3, n5);
            this.p.close();
            this.c.setColor(this.j[this.k]);
            canvas.rotate(n + n2 - 5.0f, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawPath(this.p, this.c);
        }
    }
    
    private void l() {
        this.d.invalidateDrawable((Drawable)null);
    }
    
    public void a() {
        this.k = (1 + this.k) % this.j.length;
    }
    
    public void a(final double r) {
        this.r = r;
    }
    
    public void a(final float n) {
        this.h = n;
        this.b.setStrokeWidth(n);
        this.l();
    }
    
    public void a(final float n, final float n2) {
        this.s = (int)n;
        this.t = (int)n2;
    }
    
    public void a(final int w) {
        this.w = w;
    }
    
    public void a(final int n, final int n2) {
        final float n3 = Math.min(n, n2);
        float i;
        if (this.r <= 0.0 || n3 < 0.0f) {
            i = (float)Math.ceil(this.h / 2.0f);
        }
        else {
            i = (float)(n3 / 2.0f - this.r);
        }
        this.i = i;
    }
    
    public void a(final Canvas canvas, final Rect rect) {
        final RectF a = this.a;
        a.set(rect);
        a.inset(this.i, this.i);
        final float n = 360.0f * (this.e + this.g);
        final float n2 = 360.0f * (this.f + this.g) - n;
        this.b.setColor(this.j[this.k]);
        canvas.drawArc(a, n, n2, false, this.b);
        this.a(canvas, n, n2, rect);
        if (this.u < 255) {
            this.v.setColor(this.w);
            this.v.setAlpha(255 - this.u);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float)(rect.width() / 2), this.v);
        }
    }
    
    public void a(final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.l();
    }
    
    public void a(final boolean o) {
        if (this.o != o) {
            this.o = o;
            this.l();
        }
    }
    
    public void a(final int[] j) {
        this.j = j;
        this.b(0);
    }
    
    public int b() {
        return this.u;
    }
    
    public void b(final float e) {
        this.e = e;
        this.l();
    }
    
    public void b(final int k) {
        this.k = k;
    }
    
    public float c() {
        return this.h;
    }
    
    public void c(final float f) {
        this.f = f;
        this.l();
    }
    
    public void c(final int u) {
        this.u = u;
    }
    
    public float d() {
        return this.e;
    }
    
    public void d(final float g) {
        this.g = g;
        this.l();
    }
    
    public float e() {
        return this.l;
    }
    
    public void e(final float q) {
        if (q != this.q) {
            this.q = q;
            this.l();
        }
    }
    
    public float f() {
        return this.m;
    }
    
    public float g() {
        return this.f;
    }
    
    public double h() {
        return this.r;
    }
    
    public float i() {
        return this.n;
    }
    
    public void j() {
        this.l = this.e;
        this.m = this.f;
        this.n = this.g;
    }
    
    public void k() {
        this.l = 0.0f;
        this.m = 0.0f;
        this.b(this.n = 0.0f);
        this.c(0.0f);
        this.d(0.0f);
    }
}
