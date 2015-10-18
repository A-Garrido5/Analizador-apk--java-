// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public final class bl implements cH
{
    private final hg[] a;
    private final hg[] b;
    private dQ c;
    private final E[] d;
    private final String e;
    private final int f;
    private final bl g;
    private final bl[] h;
    private final by i;
    
    private bl(final dQ c, final by i, final bl g, final int f) {
        this.f = f;
        this.c = c;
        this.e = cl.b(i, g, c.s());
        this.i = i;
        this.g = g;
        this.h = new bl[c.l()];
        for (int j = 0; j < c.l(); ++j) {
            this.h[j] = new bl(c.c(j), i, this, j);
        }
        this.d = new E[c.u()];
        for (int k = 0; k < c.u(); ++k) {
            this.d[k] = new E(c.f(k), i, this, k, null);
        }
        this.b = new hg[c.x()];
        for (int l = 0; l < c.x(); ++l) {
            this.b[l] = new hg(c.a(l), i, this, l, false, null);
        }
        this.a = new hg[c.v()];
        for (int n = 0; n < c.v(); ++n) {
            this.a[n] = new hg(c.e(n), i, this, n, true, null);
        }
        by.a(i).d(this);
    }
    
    bl(final dQ dq, final by by, final bl bl, final int n, final bO bo) {
        this(dq, by, bl, n);
    }
    
    static void a(final bl bl) {
        bl.d();
    }
    
    static void a(final bl bl, final dQ dq) {
        bl.a(dq);
    }
    
    private void a(final dQ c) {
        this.c = c;
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i].a(c.c(i));
        }
        for (int j = 0; j < this.d.length; ++j) {
            E.a(this.d[j], c.f(j));
        }
        int n = 0;
        int k;
        while (true) {
            final int length = this.b.length;
            k = 0;
            if (n >= length) {
                break;
            }
            hg.a(this.b[n], c.a(n));
            ++n;
        }
        while (k < this.a.length) {
            hg.a(this.a[k], c.e(k));
            ++k;
        }
    }
    
    private void d() {
        int i = 0;
        final bl[] h = this.h;
        for (int length = h.length, j = 0; j < length; ++j) {
            h[j].d();
        }
        final hg[] b = this.b;
        for (int length2 = b.length, k = 0; k < length2; ++k) {
            hg.b(b[k]);
        }
        for (hg[] a = this.a; i < a.length; ++i) {
            hg.b(a[i]);
        }
    }
    
    public dQ a() {
        return this.c;
    }
    
    public hg a(final int n) {
        return b7.a(by.a(this.i)).get(new v(this, n));
    }
    
    @Override
    public String a() {
        return this.e;
    }
    
    @Override
    public fm b() {
        return this.a();
    }
    
    public List b() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.a));
    }
    
    public boolean b(final int n) {
        for (final dr dr : this.c.d()) {
            if (dr.b() <= n && n < dr.e()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String c() {
        return this.c.s();
    }
    
    public List c() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.d));
    }
    
    @Override
    public by d() {
        return this.i;
    }
    
    public d_ e() {
        return this.c.a();
    }
    
    public List f() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.b));
    }
    
    public List g() {
        return Collections.unmodifiableList((List<?>)Arrays.asList((T[])this.h));
    }
}
