// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import android.view.WindowManager;
import android.graphics.PointF;
import android.view.WindowManager$LayoutParams;
import android.util.Log;
import android.app.Activity;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import android.graphics.Rect;

public abstract class ap implements ba
{
    private boolean a;
    private boolean b;
    private av c;
    private au d;
    private bi e;
    bb f;
    az g;
    private Rect h;
    private Set i;
    
    ap(final Context context, bi b, final ay ay) {
        this.a = false;
        this.b = true;
        this.h = new Rect();
        this.i = new HashSet();
        if (context instanceof Activity) {
            Log.w("Dock", "Dock created from Activity context. This can lead to memory leaks.");
        }
        if (b == null) {
            b = this.b(context);
        }
        this.e = b;
        if (this.e.a.x < 0 || this.e.a.y < 0 || this.e.b.x < 0 || this.e.b.y < 0) {
            throw new IllegalArgumentException("Sorry, at the moment Dock only supports fixed size values in DockParams.size and DockParams.dismissSize.");
        }
        this.c = ay.a(this);
        this.g = this.a(context);
        this.b();
        this.i.add(this.g);
        if (this.e.j && this.e.e != 0) {
            this.f = new bb(context, this, this.e.e);
            this.g();
            this.i.add(this.f);
        }
        else if (this.e.j) {
            throw new IllegalArgumentException("When " + ap.class.getSimpleName() + ".showDimissTarget is set, dismissLayoutId needs to different than 0");
        }
    }
    
    private void a(final int n, final Runnable runnable) {
        switch (n) {
            case 0: {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                break;
            }
            case 1:
            case 2: {
                int n2;
                if (n == 1) {
                    n2 = 0;
                }
                else {
                    n2 = 2;
                }
                this.g.b(n2, this.h, runnable);
                this.c.a();
            }
        }
    }
    
    private void a(final WindowManager$LayoutParams windowManager$LayoutParams) {
        windowManager$LayoutParams.type = 2003;
        windowManager$LayoutParams.format = -3;
        windowManager$LayoutParams.flags |= 0x1020228;
        windowManager$LayoutParams.gravity = 51;
    }
    
    private void b() {
        final AnimatableParams a = this.g.a();
        this.a(a);
        a.width = this.e.a.x;
        a.height = this.e.a.y;
        if (!this.e.h) {
            a.flags |= 0x10;
        }
        final PointF a2 = this.e.a(this.h);
        a.b(a2);
        a.a(a2);
        a.c(a2);
        this.g.a(a);
        this.g.a(this);
    }
    
    protected abstract az a(final Context p0);
    
    public abstract String a();
    
    public void a(final Rect rect) {
        if (rect.width() > 0 && rect.height() > 0) {
            this.h.set(rect);
            this.j();
        }
    }
    
    public void a(final WindowManager windowManager) {
        final Iterator<be> iterator = this.f().iterator();
        while (iterator.hasNext()) {
            iterator.next().b(windowManager);
        }
    }
    
    public void a(final WindowManager windowManager, final int n, final Runnable runnable) {
        this.b = true;
        this.a(n, new ar(this, runnable, windowManager));
    }
    
    public void a(final WindowManager windowManager, final Rect rect, final int n, final Runnable runnable) {
        this.a = false;
        this.b = false;
        this.h.set(rect);
        this.b();
        final Iterator<be> iterator = (Iterator<be>)this.f().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(windowManager);
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException("The requested transition is not supported in show().");
            }
            case 0: {
                if (runnable != null) {
                    runnable.run();
                }
            }
            case 3:
            case 4: {
                int n2;
                if (n == 3) {
                    n2 = 1;
                }
                else {
                    n2 = 3;
                }
                this.g.a(n2, this.h, new aq(this, runnable));
                this.c.a();
            }
        }
    }
    
    public void a(final au d) {
        this.d = d;
    }
    
    protected void a(final az az) {
        if (this.d != null) {
            this.d.b(this);
        }
    }
    
    @Override
    public void a(final az az, final float n, final float n2) {
        if (this.f != null) {
            this.f.a(this.e.a(az.a().b(), this.h));
        }
    }
    
    public void a(final be be) {
        if (this.d != null) {
            this.d.a(this, be);
        }
    }
    
    public abstract bi b(final Context p0);
    
    public void b(final WindowManager windowManager, final int n, final Runnable runnable) {
        if (!this.h()) {
            this.a(windowManager, n, runnable);
        }
    }
    
    @Override
    public void b(final az az) {
        if (!this.a) {
            this.a(az);
            this.a = true;
        }
    }
    
    @Override
    public void c(final az az) {
        if (this.e.j) {
            this.f.a().o();
            this.f.a(this.h);
            this.c.a();
        }
        final AnimatableParams a = this.g.a();
        if (a.k()) {
            a.o();
        }
    }
    
    public az d() {
        return this.g;
    }
    
    @Override
    public void d(final az az) {
        final AnimatableParams a = az.a();
        if (this.e.a(a.b(), this.h)) {
            final PointF b = this.e.b(this.h);
            final bb f = this.f;
            Runnable runnable = null;
            if (f != null) {
                runnable = new as(this);
            }
            az.a(b, runnable);
            az.b(b, 0, this.h, new at(this));
        }
        else {
            az.a(a.a(), (Runnable)null);
            if (this.f != null) {
                this.f.b(this.h);
            }
        }
        this.c.a();
    }
    
    public bi e() {
        return this.e;
    }
    
    public Iterable f() {
        return this.i;
    }
    
    void g() {
        final AnimatableParams a = this.f.a();
        this.a(a);
        a.type = 2002;
        a.width = this.e.b.x;
        a.height = this.e.b.y;
        a.flags |= 0x10;
        a.b(this.e.b(this.h));
        final PointF c = this.f.c(this.h);
        a.a(c);
        a.c(c);
        this.f.a(a);
    }
    
    public boolean h() {
        return this.b;
    }
    
    public Rect i() {
        return this.h;
    }
    
    protected void j() {
        if (this.h.width() <= 0 && this.h.height() <= 0) {
            return;
        }
        final AnimatableParams a = this.g.a();
        final PointF a2 = this.e.a(this.h);
        if (!a.a().equals(a2.x, a2.y)) {
            a.b(a2, new PointF(a.a().x, a.a().y));
            this.a((be)this.g);
        }
        if (this.f != null) {
            final PointF b = this.e.b(this.h);
            final AnimatableParams a3 = this.f.a();
            if (!a3.a().equals(a2.x, a2.y)) {
                a3.b(b, new PointF(a3.a().x, a3.a().y));
                this.a(this.f);
            }
        }
        this.c.a();
    }
}
