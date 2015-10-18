// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

final class f
{
    d[] a;
    int b;
    int c;
    at d;
    long e;
    int f;
    private final Huffman$Codec g;
    private final List h;
    private final bj i;
    private int j;
    
    f(final boolean b, final int j, final cd cd) {
        this.h = new ArrayList();
        this.a = new d[8];
        this.b = -1 + this.a.length;
        this.c = 0;
        this.d = new av();
        this.e = 0L;
        this.f = 0;
        Huffman$Codec g;
        if (b) {
            g = Huffman$Codec.b;
        }
        else {
            g = Huffman$Codec.a;
        }
        this.g = g;
        this.j = j;
        this.i = bt.a(cd);
    }
    
    private void a(final int n, final d d) {
        final int j = d.j;
        int n2;
        if (n != -1) {
            n2 = j - this.a[this.d(n)].j;
        }
        else {
            n2 = j;
        }
        if (n2 > this.j) {
            this.d();
            this.h.add(d);
            return;
        }
        final int b = this.b(n2 + this.f - this.j);
        if (n == -1) {
            if (1 + this.c > this.a.length) {
                final d[] a = new d[2 * this.a.length];
                System.arraycopy(this.a, 0, a, this.a.length, this.a.length);
                if (a.length == 64) {
                    this.d = ((av)this.d).b();
                }
                this.d.d(this.a.length);
                this.b = -1 + this.a.length;
                this.a = a;
            }
            final int n3 = this.b--;
            this.d.a(n3);
            this.a[n3] = d;
            ++this.c;
        }
        else {
            final int n4 = n + (b + this.d(n));
            this.d.a(n4);
            this.a[n4] = d;
        }
        this.f += n2;
    }
    
    private int b(int n) {
        int n2 = 0;
        if (n > 0) {
            for (int n3 = -1 + this.a.length; n3 >= this.b && n > 0; n -= this.a[n3].j, this.f -= this.a[n3].j, --this.c, ++n2, --n3) {}
            this.d.d(n2);
            System.arraycopy(this.a, 1 + this.b, this.a, n2 + (1 + this.b), this.c);
            this.b += n2;
        }
        return n2;
    }
    
    private void c(final int n) {
        if (!this.h(n)) {
            this.d.b(this.d(n));
            return;
        }
        if (this.j == 0) {
            this.e |= 1L << n - this.c;
            return;
        }
        this.a(-1, com.squareup.okhttp.internal.spdy.e.a[n - this.c]);
    }
    
    private int d(final int n) {
        return n + (1 + this.b);
    }
    
    private void d() {
        this.e();
        Arrays.fill(this.a, null);
        this.b = -1 + this.a.length;
        this.c = 0;
        this.f = 0;
    }
    
    private void e() {
        this.e = 0L;
        this.d.a();
    }
    
    private void e(final int n) {
        this.h.add(new d(this.g(n), this.a(false)));
    }
    
    private void f() {
        this.h.add(new d(this.a(true), this.a(false)));
    }
    
    private void f(final int n) {
        this.a(-1, new d(this.g(n), this.a(false)));
    }
    
    private bk g(final int n) {
        if (this.h(n)) {
            return com.squareup.okhttp.internal.spdy.e.a[n - this.c].h;
        }
        return this.a[this.d(n)].h;
    }
    
    private void g() {
        this.a(-1, new d(this.a(true), this.a(false)));
    }
    
    private int h() {
        return 0xFF & this.i.f();
    }
    
    private boolean h(final int n) {
        return n >= this.c;
    }
    
    int a(final int n, int n2) {
        final int n3 = n & n2;
        if (n3 < n2) {
            return n3;
        }
        int n4 = 0;
        int h;
        while (true) {
            h = this.h();
            if ((h & 0x80) == 0x0) {
                break;
            }
            n2 += (h & 0x7F) << n4;
            n4 += 7;
        }
        return n2 + (h << n4);
    }
    
    bk a(final boolean b) {
        final int h = this.h();
        int n;
        if ((h & 0x80) == 0x80) {
            n = 1;
        }
        else {
            n = 0;
        }
        final bk c = this.i.c(this.a(h, 127));
        bk bk;
        if (n != 0) {
            bk = this.g.a(c);
        }
        else {
            bk = c;
        }
        if (b) {
            bk = bk.d();
        }
        return bk;
    }
    
    void a() {
        while (!this.i.e()) {
            final int n = 0xFF & this.i.f();
            if (n == 128) {
                this.e();
            }
            else if ((n & 0x80) == 0x80) {
                this.c(-1 + this.a(n, 127));
            }
            else if (n == 64) {
                this.f();
            }
            else if ((n & 0x40) == 0x40) {
                this.e(-1 + this.a(n, 63));
            }
            else if (n == 0) {
                this.g();
            }
            else {
                if ((n & 0xC0) != 0x0) {
                    throw new AssertionError((Object)("unhandled byte: " + Integer.toBinaryString(n)));
                }
                this.f(-1 + this.a(n, 63));
            }
        }
    }
    
    void a(final int j) {
        this.j = j;
        if (this.j < this.f) {
            if (this.j != 0) {
                this.b(this.f - this.j);
                return;
            }
            this.d();
        }
    }
    
    void b() {
        for (int i = 0; i < com.squareup.okhttp.internal.spdy.e.a.length; ++i) {
            if ((0x1L & this.e >> i) == 0x1L) {
                this.h.add(com.squareup.okhttp.internal.spdy.e.a[i]);
            }
        }
        for (int j = -1 + this.a.length; j != this.b; --j) {
            if (this.d.c(j)) {
                this.h.add(this.a[j]);
            }
        }
    }
    
    List c() {
        final ArrayList list = new ArrayList(this.h);
        this.h.clear();
        return list;
    }
}
