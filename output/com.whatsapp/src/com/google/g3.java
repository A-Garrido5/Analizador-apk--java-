// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class g3
{
    private cs a;
    private int b;
    private cs c;
    private cs d;
    private cs e;
    private int f;
    private int g;
    private L h;
    private int i;
    
    g3(final L l, final cs cs, final cs cs2, final cs cs3, final cs cs4) {
        if ((cs == null && cs3 == null) || (cs2 == null && cs4 == null) || (cs != null && cs2 == null) || (cs3 != null && cs4 == null)) {
            throw fv.a();
        }
        this.a(l, cs, cs2, cs3, cs4);
    }
    
    g3(final g3 g3) {
        this.a(g3.h, g3.c, g3.d, g3.e, g3.a);
    }
    
    static g3 a(final g3 g3, final g3 g4) {
        if (g3 == null) {
            return g4;
        }
        if (g4 == null) {
            return g3;
        }
        return new g3(g3.h, g3.c, g3.d, g4.e, g4.a);
    }
    
    private void a(final L h, final cs c, final cs d, final cs e, final cs a) {
        this.h = h;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.f();
    }
    
    private void f() {
        Label_0114: {
            if (this.c == null) {
                this.c = new cs(0.0f, this.e.b());
                this.d = new cs(0.0f, this.a.b());
                if (!fG.b) {
                    break Label_0114;
                }
            }
            if (this.e == null) {
                this.e = new cs(-1 + this.h.g(), this.c.b());
                this.a = new cs(-1 + this.h.g(), this.d.b());
            }
        }
        this.g = (int)Math.min(this.c.a(), this.d.a());
        this.f = (int)Math.max(this.e.a(), this.a.a());
        this.i = (int)Math.min(this.c.b(), this.e.b());
        this.b = (int)Math.max(this.d.b(), this.a.b());
    }
    
    int a() {
        return this.g;
    }
    
    g3 a(final int n, final int n2, final boolean b) {
        final boolean b2 = fG.b;
        final cs c = this.c;
        final cs d = this.d;
        cs e = this.e;
        final cs a = this.a;
        cs cs2 = null;
        Label_0099: {
            if (n > 0) {
                cs cs;
                if (b) {
                    cs = this.c;
                }
                else {
                    cs = this.e;
                }
                int n3 = (int)cs.b() - n;
                if (n3 < 0) {
                    n3 = 0;
                }
                cs2 = new cs(cs.a(), n3);
                cs cs3;
                if (b) {
                    if (!b2) {
                        break Label_0099;
                    }
                    cs3 = cs2;
                }
                else {
                    cs3 = c;
                }
                e = cs2;
                cs2 = cs3;
            }
            else {
                cs2 = c;
            }
        }
        cs cs5 = null;
        cs cs6 = null;
        Label_0184: {
            if (n2 > 0) {
                cs cs4;
                if (b) {
                    cs4 = this.d;
                }
                else {
                    cs4 = this.a;
                }
                int n4 = n2 + (int)cs4.b();
                if (n4 >= this.h.a()) {
                    n4 = -1 + this.h.a();
                }
                cs5 = new cs(cs4.a(), n4);
                cs cs7;
                if (b) {
                    if (!b2) {
                        cs6 = a;
                        break Label_0184;
                    }
                    cs7 = cs5;
                }
                else {
                    cs7 = d;
                }
                cs6 = cs5;
                cs5 = cs7;
            }
            else {
                cs5 = d;
                cs6 = a;
            }
        }
        this.f();
        return new g3(this.h, cs2, cs5, e, cs6);
    }
    
    int b() {
        return this.i;
    }
    
    cs c() {
        return this.d;
    }
    
    int d() {
        return this.f;
    }
    
    cs e() {
        return this.c;
    }
    
    int g() {
        return this.b;
    }
    
    cs h() {
        return this.e;
    }
    
    cs i() {
        return this.a;
    }
}
