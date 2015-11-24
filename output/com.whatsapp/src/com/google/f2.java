// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f2 extends fp implements g
{
    private aA e;
    private Object f;
    private Object g;
    private List h;
    private eQ i;
    private dR j;
    private b8 k;
    private b8 l;
    private List m;
    private aA n;
    private List o;
    private List p;
    private b8 q;
    private b8 r;
    private dZ s;
    private int t;
    private List u;
    private List v;
    
    private f2() {
        this.f = "";
        this.g = "";
        this.i = gJ.b;
        this.u = Collections.emptyList();
        this.p = Collections.emptyList();
        this.h = Collections.emptyList();
        this.v = Collections.emptyList();
        this.o = Collections.emptyList();
        this.m = Collections.emptyList();
        this.s = dZ.x();
        this.j = dR.a();
        this.f();
    }
    
    private f2(final dg dg) {
        super(dg);
        this.f = "";
        this.g = "";
        this.i = gJ.b;
        this.u = Collections.emptyList();
        this.p = Collections.emptyList();
        this.h = Collections.emptyList();
        this.v = Collections.emptyList();
        this.o = Collections.emptyList();
        this.m = Collections.emptyList();
        this.s = dZ.x();
        this.j = dR.a();
        this.f();
    }
    
    f2(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void A() {
        if ((0x10 & this.t) != 0x10) {
            this.p = new ArrayList(this.p);
            this.t |= 0x10;
        }
    }
    
    private void a() {
        if ((0x20 & this.t) != 0x20) {
            this.h = new ArrayList(this.h);
            this.t |= 0x20;
        }
    }
    
    static f2 b() {
        return n();
    }
    
    private void f() {
        if (dS.d) {
            this.v();
            this.s();
            this.x();
            this.u();
            this.k();
            this.y();
        }
    }
    
    private void h() {
        if ((0x80 & this.t) != 0x80) {
            this.o = new ArrayList(this.o);
            this.t |= 0x80;
        }
    }
    
    private void j() {
        if ((0x4 & this.t) != 0x4) {
            this.i = new gJ(this.i);
            this.t |= 0x4;
        }
    }
    
    private aA k() {
        if (this.n == null) {
            this.n = new aA(this.s, this.a(), this.f());
            this.s = null;
        }
        return this.n;
    }
    
    private static f2 n() {
        return new f2();
    }
    
    private void o() {
        if ((0x8 & this.t) != 0x8) {
            this.u = new ArrayList(this.u);
            this.t |= 0x8;
        }
    }
    
    private void q() {
        if ((0x40 & this.t) != 0x40) {
            this.v = new ArrayList(this.v);
            this.t |= 0x40;
        }
    }
    
    private void r() {
        if ((0x100 & this.t) != 0x100) {
            this.m = new ArrayList(this.m);
            this.t |= 0x100;
        }
    }
    
    private b8 s() {
        if (this.l == null) {
            this.l = new b8(this.v, (0x40 & this.t) == 0x40, this.a(), this.f());
            this.v = null;
        }
        return this.l;
    }
    
    private b8 u() {
        if (this.q == null) {
            this.q = new b8(this.m, (0x100 & this.t) == 0x100, this.a(), this.f());
            this.m = null;
        }
        return this.q;
    }
    
    private b8 v() {
        if (this.r == null) {
            this.r = new b8(this.h, (0x20 & this.t) == 0x20, this.a(), this.f());
            this.h = null;
        }
        return this.r;
    }
    
    private b8 x() {
        if (this.k == null) {
            this.k = new b8(this.o, (0x80 & this.t) == 0x80, this.a(), this.f());
            this.o = null;
        }
        return this.k;
    }
    
    private aA y() {
        if (this.e == null) {
            this.e = new aA(this.j, this.a(), this.f());
            this.j = null;
        }
        return this.e;
    }
    
    public dO B() {
        return dO.G();
    }
    
    public f2 C() {
        final boolean b = dt.b;
        super.clear();
        this.f = "";
        this.t &= 0xFFFFFFFE;
        this.g = "";
        this.t &= 0xFFFFFFFD;
        this.i = gJ.b;
        this.t &= 0xFFFFFFFB;
        this.u = Collections.emptyList();
        this.t &= 0xFFFFFFF7;
        this.p = Collections.emptyList();
        this.t &= 0xFFFFFFEF;
        Label_0133: {
            if (this.r == null) {
                this.h = Collections.emptyList();
                this.t &= 0xFFFFFFDF;
                if (!b) {
                    break Label_0133;
                }
            }
            this.r.c();
        }
        Label_0169: {
            if (this.l == null) {
                this.v = Collections.emptyList();
                this.t &= 0xFFFFFFBF;
                if (!b) {
                    break Label_0169;
                }
            }
            this.l.c();
        }
        Label_0206: {
            if (this.k == null) {
                this.o = Collections.emptyList();
                this.t &= 0xFFFFFF7F;
                if (!b) {
                    break Label_0206;
                }
            }
            this.k.c();
        }
        Label_0243: {
            if (this.q == null) {
                this.m = Collections.emptyList();
                this.t &= 0xFFFFFEFF;
                if (!b) {
                    break Label_0243;
                }
            }
            this.q.c();
        }
        Label_0269: {
            if (this.n == null) {
                this.s = dZ.x();
                if (!b) {
                    break Label_0269;
                }
            }
            this.n.c();
        }
        this.t &= 0xFFFFFDFF;
        Label_0307: {
            if (this.e == null) {
                this.j = dR.a();
                if (!b) {
                    break Label_0307;
                }
            }
            this.e.c();
        }
        this.t &= 0xFFFFFBFF;
        return this;
    }
    
    public dB a(final int n) {
        if (this.k == null) {
            return this.o.get(n);
        }
        return (dB)this.k.a(n);
    }
    
    public f2 a(final cL cl, final fu fu) {
        while (true) {
            try {
                dO do3;
                Throwable t;
                try {
                    final dO do1 = (dO)dO.z.parsePartialFrom(cl, fu);
                    if (do1 == null) {
                        return this;
                    }
                    try {
                        this.a(do1);
                        return this;
                    }
                    catch (bg bg) {
                        throw bg;
                    }
                }
                catch (bg bg2) {
                    final dO do2 = (dO)bg2.b();
                    try {
                        throw bg2;
                    }
                    finally {
                        do3 = do2;
                        final Throwable t2;
                        t = t2;
                    }
                }
                Label_0070: {
                    if (do3 == null) {
                        break Label_0070;
                    }
                    try {
                        this.a(do3);
                        throw t;
                    }
                    catch (bg bg3) {
                        throw bg3;
                    }
                }
            }
            finally {
                final dO do3 = null;
                continue;
            }
            break;
        }
    }
    
    public f2 a(final dO do1) {
        final boolean b = dt.b;
        if (do1 == dO.G()) {
            return this;
        }
        if (do1.K()) {
            this.t |= 0x1;
            this.f = dO.j(do1);
            this.c();
        }
        if (do1.s()) {
            this.t |= 0x2;
            this.g = dO.f(do1);
            this.c();
        }
        if (!dO.e(do1).isEmpty()) {
            Label_0136: {
                if (this.i.isEmpty()) {
                    this.i = dO.e(do1);
                    this.t &= 0xFFFFFFFB;
                    if (!b) {
                        break Label_0136;
                    }
                }
                this.j();
                this.i.addAll(dO.e(do1));
            }
            this.c();
        }
        if (!dO.g(do1).isEmpty()) {
            Label_0205: {
                if (this.u.isEmpty()) {
                    this.u = dO.g(do1);
                    this.t &= 0xFFFFFFF7;
                    if (!b) {
                        break Label_0205;
                    }
                }
                this.o();
                this.u.addAll(dO.g(do1));
            }
            this.c();
        }
        if (!dO.c(do1).isEmpty()) {
            Label_0274: {
                if (this.p.isEmpty()) {
                    this.p = dO.c(do1);
                    this.t &= 0xFFFFFFEF;
                    if (!b) {
                        break Label_0274;
                    }
                }
                this.A();
                this.p.addAll(dO.c(do1));
            }
            this.c();
        }
        Label_0445: {
            if (this.r == null) {
                if (dO.h(do1).isEmpty()) {
                    break Label_0445;
                }
                Label_0350: {
                    if (this.h.isEmpty()) {
                        this.h = dO.h(do1);
                        this.t &= 0xFFFFFFDF;
                        if (!b) {
                            break Label_0350;
                        }
                    }
                    this.a();
                    this.h.addAll(dO.h(do1));
                }
                this.c();
                if (!b) {
                    break Label_0445;
                }
            }
            if (!dO.h(do1).isEmpty()) {
                if (this.r.d()) {
                    this.r.f();
                    this.r = null;
                    this.h = dO.h(do1);
                    this.t &= 0xFFFFFFDF;
                    b8 v;
                    if (dS.d) {
                        v = this.v();
                    }
                    else {
                        v = null;
                    }
                    this.r = v;
                    if (!b) {
                        break Label_0445;
                    }
                }
                this.r.a(dO.h(do1));
            }
        }
        Label_0612: {
            if (this.l == null) {
                if (dO.a(do1).isEmpty()) {
                    break Label_0612;
                }
                Label_0517: {
                    if (this.v.isEmpty()) {
                        this.v = dO.a(do1);
                        this.t &= 0xFFFFFFBF;
                        if (!b) {
                            break Label_0517;
                        }
                    }
                    this.q();
                    this.v.addAll(dO.a(do1));
                }
                this.c();
                if (!b) {
                    break Label_0612;
                }
            }
            if (!dO.a(do1).isEmpty()) {
                if (this.l.d()) {
                    this.l.f();
                    this.l = null;
                    this.v = dO.a(do1);
                    this.t &= 0xFFFFFFBF;
                    b8 s;
                    if (dS.d) {
                        s = this.s();
                    }
                    else {
                        s = null;
                    }
                    this.l = s;
                    if (!b) {
                        break Label_0612;
                    }
                }
                this.l.a(dO.a(do1));
            }
        }
        Label_0781: {
            if (this.k == null) {
                if (dO.d(do1).isEmpty()) {
                    break Label_0781;
                }
                Label_0685: {
                    if (this.o.isEmpty()) {
                        this.o = dO.d(do1);
                        this.t &= 0xFFFFFF7F;
                        if (!b) {
                            break Label_0685;
                        }
                    }
                    this.h();
                    this.o.addAll(dO.d(do1));
                }
                this.c();
                if (!b) {
                    break Label_0781;
                }
            }
            if (!dO.d(do1).isEmpty()) {
                if (this.k.d()) {
                    this.k.f();
                    this.k = null;
                    this.o = dO.d(do1);
                    this.t &= 0xFFFFFF7F;
                    b8 x;
                    if (dS.d) {
                        x = this.x();
                    }
                    else {
                        x = null;
                    }
                    this.k = x;
                    if (!b) {
                        break Label_0781;
                    }
                }
                this.k.a(dO.d(do1));
            }
        }
        Label_0957: {
            if (this.q == null) {
                if (dO.b(do1).isEmpty()) {
                    break Label_0957;
                }
                Label_0854: {
                    if (this.m.isEmpty()) {
                        this.m = dO.b(do1);
                        this.t &= 0xFFFFFEFF;
                        if (!b) {
                            break Label_0854;
                        }
                    }
                    this.r();
                    this.m.addAll(dO.b(do1));
                }
                this.c();
                if (!b) {
                    break Label_0957;
                }
            }
            if (!dO.b(do1).isEmpty()) {
                if (this.q.d()) {
                    this.q.f();
                    this.q = null;
                    this.m = dO.b(do1);
                    this.t &= 0xFFFFFEFF;
                    final boolean d = dS.d;
                    b8 u = null;
                    if (d) {
                        u = this.u();
                    }
                    this.q = u;
                    if (!b) {
                        break Label_0957;
                    }
                }
                this.q.a(dO.b(do1));
            }
        }
        if (do1.v()) {
            this.a(do1.r());
        }
        if (do1.t()) {
            this.a(do1.k());
        }
        this.b(do1.getUnknownFields());
        return this;
    }
    
    public f2 a(final dR j) {
        final boolean b = dt.b;
        Label_0079: {
            if (this.e == null) {
                Label_0062: {
                    if ((0x400 & this.t) == 0x400 && this.j != dR.a()) {
                        this.j = dR.b(this.j).a(j).a();
                        if (!b) {
                            break Label_0062;
                        }
                    }
                    this.j = j;
                }
                this.c();
                if (!b) {
                    break Label_0079;
                }
            }
            this.e.a(j);
        }
        this.t |= 0x400;
        return this;
    }
    
    public f2 a(final dZ s) {
        final boolean b = dt.b;
        Label_0079: {
            if (this.n == null) {
                Label_0062: {
                    if ((0x200 & this.t) == 0x200 && this.s != dZ.x()) {
                        this.s = dZ.b(this.s).a(s).h();
                        if (!b) {
                            break Label_0062;
                        }
                    }
                    this.s = s;
                }
                this.c();
                if (!b) {
                    break Label_0079;
                }
            }
            this.n.a(s);
        }
        this.t |= 0x200;
        return this;
    }
    
    public f2 a(final fm fm) {
        if (fm instanceof dO) {
            return this.a((dO)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public dq b(final int n) {
        if (this.l == null) {
            return this.v.get(n);
        }
        return (dq)this.l.a(n);
    }
    
    @Override
    public ci build() {
        return this.d();
    }
    
    @Override
    public fm build() {
        return this.d();
    }
    
    @Override
    public ci buildPartial() {
        return this.t();
    }
    
    @Override
    public fm buildPartial() {
        return this.t();
    }
    
    public int c() {
        if (this.q == null) {
            return this.m.size();
        }
        return this.q.a();
    }
    
    public dQ c(final int n) {
        if (this.r == null) {
            return this.h.get(n);
        }
        return (dQ)this.r.a(n);
    }
    
    @Override
    public fp clear() {
        return this.C();
    }
    
    @Override
    public fE clone() {
        return this.z();
    }
    
    @Override
    public fp clone() {
        return this.z();
    }
    
    @Override
    public fx clone() {
        return this.z();
    }
    
    @Override
    public Object clone() {
        return this.z();
    }
    
    public dC d(final int n) {
        if (this.q == null) {
            return this.m.get(n);
        }
        return (dC)this.q.a(n);
    }
    
    public dO d() {
        final dO t = this.t();
        if (!t.isInitialized()) {
            throw fx.a(t);
        }
        return t;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.B();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.B();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.H();
    }
    
    public int i() {
        if (this.l == null) {
            return this.v.size();
        }
        return this.l.a();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.h().a(dO.class, f2.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.p()) {
            if (!this.c(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        int j = 0;
        while (j < this.i()) {
            if (!this.b(j).isInitialized()) {
                return false;
            }
            ++j;
            if (b) {
                break;
            }
        }
        int k = 0;
        while (k < this.l()) {
            if (!this.a(k).isInitialized()) {
                return false;
            }
            ++k;
            if (b) {
                break;
            }
        }
        int l = 0;
        while (l < this.c()) {
            if (!this.d(l).isInitialized()) {
                return false;
            }
            ++l;
            if (b) {
                break;
            }
        }
        if (!this.w() || this.m().isInitialized()) {
            return true;
        }
        return false;
    }
    
    public int l() {
        if (this.k == null) {
            return this.o.size();
        }
        return this.k.a();
    }
    
    public dZ m() {
        if (this.n == null) {
            return this.s;
        }
        return (dZ)this.n.b();
    }
    
    @Override
    public a8 mergeFrom(final fm fm) {
        return this.a(fm);
    }
    
    @Override
    public aJ mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fE mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final cL cl, final fu fu) {
        return this.a(cl, fu);
    }
    
    @Override
    public fx mergeFrom(final fm fm) {
        return this.a(fm);
    }
    
    public int p() {
        if (this.r == null) {
            return this.h.size();
        }
        return this.r.a();
    }
    
    public dO t() {
        int n = 1;
        final boolean b = dt.b;
        final dO do1 = new dO(this, null);
        final int t = this.t;
        if ((t & 0x1) != n) {
            n = 0;
        }
        dO.a(do1, this.f);
        if ((t & 0x2) == 0x2) {
            n |= 0x2;
        }
        dO.b(do1, this.g);
        if ((0x4 & this.t) == 0x4) {
            this.i = new bT(this.i);
            this.t &= 0xFFFFFFFB;
        }
        dO.a(do1, this.i);
        if ((0x8 & this.t) == 0x8) {
            this.u = Collections.unmodifiableList((List<?>)this.u);
            this.t &= 0xFFFFFFF7;
        }
        dO.a(do1, this.u);
        if ((0x10 & this.t) == 0x10) {
            this.p = Collections.unmodifiableList((List<?>)this.p);
            this.t &= 0xFFFFFFEF;
        }
        dO.c(do1, this.p);
        Label_0257: {
            if (this.r == null) {
                if ((0x20 & this.t) == 0x20) {
                    this.h = Collections.unmodifiableList((List<?>)this.h);
                    this.t &= 0xFFFFFFDF;
                }
                dO.f(do1, this.h);
                if (!b) {
                    break Label_0257;
                }
            }
            dO.f(do1, this.r.b());
        }
        Label_0323: {
            if (this.l == null) {
                if ((0x40 & this.t) == 0x40) {
                    this.v = Collections.unmodifiableList((List<?>)this.v);
                    this.t &= 0xFFFFFFBF;
                }
                dO.b(do1, this.v);
                if (!b) {
                    break Label_0323;
                }
            }
            dO.b(do1, this.l.b());
        }
        Label_0392: {
            if (this.k == null) {
                if ((0x80 & this.t) == 0x80) {
                    this.o = Collections.unmodifiableList((List<?>)this.o);
                    this.t &= 0xFFFFFF7F;
                }
                dO.d(do1, this.o);
                if (!b) {
                    break Label_0392;
                }
            }
            dO.d(do1, this.k.b());
        }
        Label_0461: {
            if (this.q == null) {
                if ((0x100 & this.t) == 0x100) {
                    this.m = Collections.unmodifiableList((List<?>)this.m);
                    this.t &= 0xFFFFFEFF;
                }
                dO.e(do1, this.m);
                if (!b) {
                    break Label_0461;
                }
            }
            dO.e(do1, this.q.b());
        }
        int n2;
        if ((t & 0x200) == 0x200) {
            n2 = (n | 0x4);
        }
        else {
            n2 = n;
        }
        Label_0513: {
            if (this.n == null) {
                dO.a(do1, this.s);
                if (!b) {
                    break Label_0513;
                }
            }
            dO.a(do1, (dZ)this.n.a());
        }
        if ((t & 0x400) == 0x400) {
            n2 |= 0x8;
        }
        Label_0567: {
            if (this.e == null) {
                dO.a(do1, this.j);
                if (!b) {
                    break Label_0567;
                }
            }
            dO.a(do1, (dR)this.e.a());
        }
        dO.a(do1, n2);
        this.b();
        return do1;
    }
    
    public boolean w() {
        return (0x200 & this.t) == 0x200;
    }
    
    public f2 z() {
        return n().a(this.t());
    }
}
