// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import android.graphics.Rect;
import java.util.ArrayDeque;
import java.util.Queue;
import android.graphics.PointF;
import android.view.WindowManager$LayoutParams;

public class AnimatableParams extends WindowManager$LayoutParams implements xl
{
    private final PointF a;
    private final PointF b;
    private final PointF c;
    private final PointF d;
    private final PointF e;
    private final Queue f;
    private final PointF g;
    private final xm h;
    
    public AnimatableParams() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
        this.d = new PointF();
        this.e = new PointF();
        this.f = new ArrayDeque();
        this.g = new PointF();
        this.h = new xp();
    }
    
    public PointF a() {
        return this.a;
    }
    
    public void a(final float n) {
        this.g().a(n, this);
    }
    
    public void a(final PointF pointF) {
        this.b.set(pointF.x, pointF.y);
    }
    
    public void a(final PointF pointF, final PointF pointF2) {
        this.c.set(pointF.x, pointF.y);
        this.e.set(pointF2.x, pointF2.y);
    }
    
    public boolean a(final Rect rect) {
        return rect.contains((int)this.b.x, (int)this.b.y);
    }
    
    public PointF b() {
        return this.b;
    }
    
    public void b(final PointF pointF) {
        this.a.set(pointF.x, pointF.y);
    }
    
    public void b(final PointF pointF, final PointF pointF2) {
        for (final c c : this.f) {
            if (c.b.equals(pointF2.x, pointF2.y)) {
                c.b.set(pointF.x, pointF.y);
                if (c != this.f.peek()) {
                    continue;
                }
                this.a(new PointF(pointF.x - pointF2.x + this.b().x, pointF.y - pointF2.y + this.b().y));
            }
        }
        if (this.j()) {
            this.d(pointF);
        }
        this.b(pointF);
    }
    
    public PointF c() {
        return this.c;
    }
    
    public void c(final PointF pointF) {
        this.x = (int)pointF.x;
        this.y = (int)pointF.y;
    }
    
    public PointF d() {
        return this.d;
    }
    
    public c d(final PointF pointF) {
        final c c = new c(this.h);
        c.a(pointF);
        if (this.f.isEmpty()) {
            this.h.a();
            this.i();
        }
        this.f.add(c);
        return c;
    }
    
    public PointF e() {
        return this.e;
    }
    
    public PointF f() {
        if (this.f.isEmpty()) {
            this.g.set(this.b);
            return this.g;
        }
        return this.f.peek().b;
    }
    
    public xm g() {
        if (this.f.isEmpty()) {
            return xm.a;
        }
        return this.f.peek().a();
    }
    
    public boolean h() {
        return this.g().a(this);
    }
    
    public void i() {
        this.a(this.b(), this.d());
    }
    
    public boolean j() {
        return this.a().equals(this.b().x, this.b().y);
    }
    
    public boolean k() {
        return this.n() && this.f().equals(this.a().x, this.a().y);
    }
    
    public Runnable l() {
        if (this.f.isEmpty()) {
            return com.twitter.android.widget.c.a;
        }
        return this.f.peek().b();
    }
    
    public c m() {
        this.h.a();
        this.i();
        if (this.f.isEmpty()) {
            return null;
        }
        return this.f.remove();
    }
    
    public boolean n() {
        return !this.f.isEmpty();
    }
    
    public void o() {
        this.f.clear();
    }
}
