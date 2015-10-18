// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public final class c extends cv
{
    private static volatile c[] o;
    public int a;
    public String b;
    public c[] c;
    public c[] d;
    public c[] e;
    public String f;
    public String g;
    public long h;
    public boolean i;
    public c[] j;
    public int[] k;
    public boolean l;
    
    public c() {
        this.b();
    }
    
    public static c[] a() {
        Label_0027: {
            if (c.o != null) {
                break Label_0027;
            }
            synchronized (cz.a) {
                if (c.o == null) {
                    c.o = new c[0];
                }
                return c.o;
            }
        }
    }
    
    @Override
    public void a(final qp qp) {
        qp.a(1, this.a);
        if (!this.b.equals("")) {
            qp.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; ++i) {
                final c c = this.c[i];
                if (c != null) {
                    qp.a(3, c);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (int j = 0; j < this.d.length; ++j) {
                final c c2 = this.d[j];
                if (c2 != null) {
                    qp.a(4, c2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int k = 0; k < this.e.length; ++k) {
                final c c3 = this.e[k];
                if (c3 != null) {
                    qp.a(5, c3);
                }
            }
        }
        if (!this.f.equals("")) {
            qp.a(6, this.f);
        }
        if (!this.g.equals("")) {
            qp.a(7, this.g);
        }
        if (this.h != 0L) {
            qp.a(8, this.h);
        }
        if (this.l) {
            qp.a(9, this.l);
        }
        if (this.k != null && this.k.length > 0) {
            for (int l = 0; l < this.k.length; ++l) {
                qp.a(10, this.k[l]);
            }
        }
        if (this.j != null) {
            final int length = this.j.length;
            int n = 0;
            if (length > 0) {
                while (n < this.j.length) {
                    final c c4 = this.j[n];
                    if (c4 != null) {
                        qp.a(11, c4);
                    }
                    ++n;
                }
            }
        }
        if (this.i) {
            qp.a(12, this.i);
        }
        super.a(qp);
    }
    
    public c b() {
        this.a = 1;
        this.b = "";
        this.c = a();
        this.d = a();
        this.e = a();
        this.f = "";
        this.g = "";
        this.h = 0L;
        this.i = false;
        this.j = a();
        this.k = dd.a;
        this.l = false;
        this.m = null;
        this.n = -1;
        return this;
    }
    
    @Override
    protected int c() {
        int n = super.c() + qp.b(1, this.a);
        if (!this.b.equals("")) {
            n += qp.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int n2 = n;
            for (int i = 0; i < this.c.length; ++i) {
                final c c = this.c[i];
                if (c != null) {
                    n2 += qp.c(3, c);
                }
            }
            n = n2;
        }
        if (this.d != null && this.d.length > 0) {
            int n3 = n;
            for (int j = 0; j < this.d.length; ++j) {
                final c c2 = this.d[j];
                if (c2 != null) {
                    n3 += qp.c(4, c2);
                }
            }
            n = n3;
        }
        if (this.e != null && this.e.length > 0) {
            int n4 = n;
            for (int k = 0; k < this.e.length; ++k) {
                final c c3 = this.e[k];
                if (c3 != null) {
                    n4 += qp.c(5, c3);
                }
            }
            n = n4;
        }
        if (!this.f.equals("")) {
            n += qp.b(6, this.f);
        }
        if (!this.g.equals("")) {
            n += qp.b(7, this.g);
        }
        if (this.h != 0L) {
            n += qp.b(8, this.h);
        }
        if (this.l) {
            n += qp.b(9, this.l);
        }
        if (this.k != null && this.k.length > 0) {
            int l = 0;
            int n5 = 0;
            while (l < this.k.length) {
                n5 += qp.b(this.k[l]);
                ++l;
            }
            n = n + n5 + 1 * this.k.length;
        }
        if (this.j != null) {
            final int length = this.j.length;
            int n6 = 0;
            if (length > 0) {
                while (n6 < this.j.length) {
                    final c c4 = this.j[n6];
                    if (c4 != null) {
                        n += qp.c(11, c4);
                    }
                    ++n6;
                }
            }
        }
        if (this.i) {
            n += qp.b(12, this.i);
        }
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b;
        if (o == this) {
            b = true;
        }
        else {
            final boolean b2 = o instanceof c;
            b = false;
            if (b2) {
                final c c = (c)o;
                final int a = this.a;
                final int a2 = c.a;
                b = false;
                if (a == a2) {
                    if (this.b == null) {
                        final String b3 = c.b;
                        b = false;
                        if (b3 != null) {
                            return b;
                        }
                    }
                    else if (!this.b.equals(c.b)) {
                        return false;
                    }
                    final boolean a3 = cz.a(this.c, c.c);
                    b = false;
                    if (a3) {
                        final boolean a4 = cz.a(this.d, c.d);
                        b = false;
                        if (a4) {
                            final boolean a5 = cz.a(this.e, c.e);
                            b = false;
                            if (a5) {
                                if (this.f == null) {
                                    final String f = c.f;
                                    b = false;
                                    if (f != null) {
                                        return b;
                                    }
                                }
                                else if (!this.f.equals(c.f)) {
                                    return false;
                                }
                                if (this.g == null) {
                                    final String g = c.g;
                                    b = false;
                                    if (g != null) {
                                        return b;
                                    }
                                }
                                else if (!this.g.equals(c.g)) {
                                    return false;
                                }
                                final long n = lcmp(this.h, c.h);
                                b = false;
                                if (n == 0) {
                                    final boolean i = this.i;
                                    final boolean j = c.i;
                                    b = false;
                                    if (i == j) {
                                        final boolean a6 = cz.a(this.j, c.j);
                                        b = false;
                                        if (a6) {
                                            final boolean a7 = cz.a(this.k, c.k);
                                            b = false;
                                            if (a7) {
                                                final boolean l = this.l;
                                                final boolean k = c.l;
                                                b = false;
                                                if (l == k) {
                                                    return this.a(c);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        int n = 1231;
        final int n2 = 31 * (527 + this.a);
        int hashCode;
        if (this.b == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.b.hashCode();
        }
        final int n3 = 31 * (31 * (31 * (31 * (hashCode + n2) + cz.a(this.c)) + cz.a(this.d)) + cz.a(this.e));
        int hashCode2;
        if (this.f == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = this.f.hashCode();
        }
        final int n4 = 31 * (hashCode2 + n3);
        final String g = this.g;
        int hashCode3 = 0;
        if (g != null) {
            hashCode3 = this.g.hashCode();
        }
        final int n5 = 31 * (31 * (n4 + hashCode3) + (int)(this.h ^ this.h >>> 32));
        int n6;
        if (this.i) {
            n6 = n;
        }
        else {
            n6 = 1237;
        }
        final int n7 = 31 * (31 * (31 * (n6 + n5) + cz.a(this.j)) + cz.a(this.k));
        if (!this.l) {
            n = 1237;
        }
        return 31 * (n7 + n) + this.d();
    }
}
