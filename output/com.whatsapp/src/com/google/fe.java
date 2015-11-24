// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fe extends fp implements gn
{
    private List e;
    private b8 f;
    private b8 g;
    private List h;
    private b8 i;
    private b8 j;
    private d_ k;
    private List l;
    private aA m;
    private b8 n;
    private int o;
    private Object p;
    private List q;
    private List r;
    
    private fe() {
        this.p = "";
        this.e = Collections.emptyList();
        this.l = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.h = Collections.emptyList();
        this.k = d_.h();
        this.o();
    }
    
    private fe(final dg dg) {
        super(dg);
        this.p = "";
        this.e = Collections.emptyList();
        this.l = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.h = Collections.emptyList();
        this.k = d_.h();
        this.o();
    }
    
    fe(final dg dg, final fM fm) {
        this(dg);
    }
    
    private aA A() {
        if (this.m == null) {
            this.m = new aA(this.k, this.a(), this.f());
            this.k = null;
        }
        return this.m;
    }
    
    private b8 c() {
        if (this.n == null) {
            this.n = new b8(this.h, (0x20 & this.o) == 0x20, this.a(), this.f());
            this.h = null;
        }
        return this.n;
    }
    
    private void f() {
        if ((0x2 & this.o) != 0x2) {
            this.e = new ArrayList(this.e);
            this.o |= 0x2;
        }
    }
    
    private void h() {
        if ((0x20 & this.o) != 0x20) {
            this.h = new ArrayList(this.h);
            this.o |= 0x20;
        }
    }
    
    private b8 i() {
        if (this.i == null) {
            this.i = new b8(this.r, (0x10 & this.o) == 0x10, this.a(), this.f());
            this.r = null;
        }
        return this.i;
    }
    
    static fe l() {
        return z();
    }
    
    private void o() {
        if (dS.d) {
            this.y();
            this.w();
            this.t();
            this.i();
            this.c();
            this.A();
        }
    }
    
    private void q() {
        if ((0x8 & this.o) != 0x8) {
            this.q = new ArrayList(this.q);
            this.o |= 0x8;
        }
    }
    
    private void r() {
        if ((0x4 & this.o) != 0x4) {
            this.l = new ArrayList(this.l);
            this.o |= 0x4;
        }
    }
    
    private b8 t() {
        if (this.f == null) {
            this.f = new b8(this.q, (0x8 & this.o) == 0x8, this.a(), this.f());
            this.q = null;
        }
        return this.f;
    }
    
    private void v() {
        if ((0x10 & this.o) != 0x10) {
            this.r = new ArrayList(this.r);
            this.o |= 0x10;
        }
    }
    
    private b8 w() {
        if (this.j == null) {
            this.j = new b8(this.l, (0x4 & this.o) == 0x4, this.a(), this.f());
            this.l = null;
        }
        return this.j;
    }
    
    private b8 y() {
        if (this.g == null) {
            this.g = new b8(this.e, (0x2 & this.o) == 0x2, this.a(), this.f());
            this.e = null;
        }
        return this.g;
    }
    
    private static fe z() {
        return new fe();
    }
    
    public dC a(final int n) {
        if (this.j == null) {
            return this.l.get(n);
        }
        return (dC)this.j.a(n);
    }
    
    public dQ a() {
        int n = 1;
        final boolean b = dt.b;
        final dQ dq = new dQ(this, null);
        final int o = this.o;
        if ((o & 0x1) != n) {
            n = 0;
        }
        dQ.a(dq, this.p);
        Label_0103: {
            if (this.g == null) {
                if ((0x2 & this.o) == 0x2) {
                    this.e = Collections.unmodifiableList((List<?>)this.e);
                    this.o &= 0xFFFFFFFD;
                }
                dQ.e(dq, this.e);
                if (!b) {
                    break Label_0103;
                }
            }
            dQ.e(dq, this.g.b());
        }
        Label_0167: {
            if (this.j == null) {
                if ((0x4 & this.o) == 0x4) {
                    this.l = Collections.unmodifiableList((List<?>)this.l);
                    this.o &= 0xFFFFFFFB;
                }
                dQ.c(dq, this.l);
                if (!b) {
                    break Label_0167;
                }
            }
            dQ.c(dq, this.j.b());
        }
        Label_0233: {
            if (this.f == null) {
                if ((0x8 & this.o) == 0x8) {
                    this.q = Collections.unmodifiableList((List<?>)this.q);
                    this.o &= 0xFFFFFFF7;
                }
                dQ.b(dq, this.q);
                if (!b) {
                    break Label_0233;
                }
            }
            dQ.b(dq, this.f.b());
        }
        Label_0299: {
            if (this.i == null) {
                if ((0x10 & this.o) == 0x10) {
                    this.r = Collections.unmodifiableList((List<?>)this.r);
                    this.o &= 0xFFFFFFEF;
                }
                dQ.d(dq, this.r);
                if (!b) {
                    break Label_0299;
                }
            }
            dQ.d(dq, this.i.b());
        }
        Label_0365: {
            if (this.n == null) {
                if ((0x20 & this.o) == 0x20) {
                    this.h = Collections.unmodifiableList((List<?>)this.h);
                    this.o &= 0xFFFFFFDF;
                }
                dQ.a(dq, this.h);
                if (!b) {
                    break Label_0365;
                }
            }
            dQ.a(dq, this.n.b());
        }
        int n2;
        if ((o & 0x40) == 0x40) {
            n2 = (n | 0x2);
        }
        else {
            n2 = n;
        }
        Label_0415: {
            if (this.m == null) {
                dQ.a(dq, this.k);
                if (!b) {
                    break Label_0415;
                }
            }
            dQ.a(dq, (d_)this.m.a());
        }
        dQ.a(dq, n2);
        this.b();
        return dq;
    }
    
    public fe a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dQ.j:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dQ;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/fe.a:(Lcom/google/dQ;)Lcom/google/fe;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dQ;
        //    39: astore          8
        //    41: aload           7
        //    43: athrow         
        //    44: astore          9
        //    46: aload           8
        //    48: astore          4
        //    50: aload           9
        //    52: astore_3       
        //    53: aload           4
        //    55: ifnull          65
        //    58: aload_0        
        //    59: aload           4
        //    61: invokevirtual   com/google/fe.a:(Lcom/google/dQ;)Lcom/google/fe;
        //    64: pop            
        //    65: aload_3        
        //    66: athrow         
        //    67: astore          5
        //    69: aload           5
        //    71: athrow         
        //    72: astore          11
        //    74: aload           11
        //    76: athrow         
        //    77: astore_3       
        //    78: aconst_null    
        //    79: astore          4
        //    81: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  0      15     29     53     Lcom/google/bg;
        //  0      15     77     84     Any
        //  20     27     72     77     Lcom/google/bg;
        //  31     41     77     84     Any
        //  41     44     44     53     Any
        //  58     65     67     72     Lcom/google/bg;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public fe a(final dQ dq) {
        final boolean b = dt.b;
        if (dq == dQ.p()) {
            return this;
        }
        if (dq.c()) {
            this.o |= 0x1;
            this.p = dQ.c(dq);
            this.c();
        }
        Label_0209: {
            if (this.g == null) {
                if (dQ.d(dq).isEmpty()) {
                    break Label_0209;
                }
                Label_0114: {
                    if (this.e.isEmpty()) {
                        this.e = dQ.d(dq);
                        this.o &= 0xFFFFFFFD;
                        if (!b) {
                            break Label_0114;
                        }
                    }
                    this.f();
                    this.e.addAll(dQ.d(dq));
                }
                this.c();
                if (!b) {
                    break Label_0209;
                }
            }
            if (!dQ.d(dq).isEmpty()) {
                if (this.g.d()) {
                    this.g.f();
                    this.g = null;
                    this.e = dQ.d(dq);
                    this.o &= 0xFFFFFFFD;
                    b8 y;
                    if (dS.d) {
                        y = this.y();
                    }
                    else {
                        y = null;
                    }
                    this.g = y;
                    if (!b) {
                        break Label_0209;
                    }
                }
                this.g.a(dQ.d(dq));
            }
        }
        Label_0376: {
            if (this.j == null) {
                if (dQ.b(dq).isEmpty()) {
                    break Label_0376;
                }
                Label_0281: {
                    if (this.l.isEmpty()) {
                        this.l = dQ.b(dq);
                        this.o &= 0xFFFFFFFB;
                        if (!b) {
                            break Label_0281;
                        }
                    }
                    this.r();
                    this.l.addAll(dQ.b(dq));
                }
                this.c();
                if (!b) {
                    break Label_0376;
                }
            }
            if (!dQ.b(dq).isEmpty()) {
                if (this.j.d()) {
                    this.j.f();
                    this.j = null;
                    this.l = dQ.b(dq);
                    this.o &= 0xFFFFFFFB;
                    b8 w;
                    if (dS.d) {
                        w = this.w();
                    }
                    else {
                        w = null;
                    }
                    this.j = w;
                    if (!b) {
                        break Label_0376;
                    }
                }
                this.j.a(dQ.b(dq));
            }
        }
        Label_0543: {
            if (this.f == null) {
                if (dQ.f(dq).isEmpty()) {
                    break Label_0543;
                }
                Label_0448: {
                    if (this.q.isEmpty()) {
                        this.q = dQ.f(dq);
                        this.o &= 0xFFFFFFF7;
                        if (!b) {
                            break Label_0448;
                        }
                    }
                    this.q();
                    this.q.addAll(dQ.f(dq));
                }
                this.c();
                if (!b) {
                    break Label_0543;
                }
            }
            if (!dQ.f(dq).isEmpty()) {
                if (this.f.d()) {
                    this.f.f();
                    this.f = null;
                    this.q = dQ.f(dq);
                    this.o &= 0xFFFFFFF7;
                    b8 t;
                    if (dS.d) {
                        t = this.t();
                    }
                    else {
                        t = null;
                    }
                    this.f = t;
                    if (!b) {
                        break Label_0543;
                    }
                }
                this.f.a(dQ.f(dq));
            }
        }
        Label_0710: {
            if (this.i == null) {
                if (dQ.g(dq).isEmpty()) {
                    break Label_0710;
                }
                Label_0615: {
                    if (this.r.isEmpty()) {
                        this.r = dQ.g(dq);
                        this.o &= 0xFFFFFFEF;
                        if (!b) {
                            break Label_0615;
                        }
                    }
                    this.v();
                    this.r.addAll(dQ.g(dq));
                }
                this.c();
                if (!b) {
                    break Label_0710;
                }
            }
            if (!dQ.g(dq).isEmpty()) {
                if (this.i.d()) {
                    this.i.f();
                    this.i = null;
                    this.r = dQ.g(dq);
                    this.o &= 0xFFFFFFEF;
                    b8 i;
                    if (dS.d) {
                        i = this.i();
                    }
                    else {
                        i = null;
                    }
                    this.i = i;
                    if (!b) {
                        break Label_0710;
                    }
                }
                this.i.a(dQ.g(dq));
            }
        }
        Label_0884: {
            if (this.n == null) {
                if (dQ.a(dq).isEmpty()) {
                    break Label_0884;
                }
                Label_0782: {
                    if (this.h.isEmpty()) {
                        this.h = dQ.a(dq);
                        this.o &= 0xFFFFFFDF;
                        if (!b) {
                            break Label_0782;
                        }
                    }
                    this.h();
                    this.h.addAll(dQ.a(dq));
                }
                this.c();
                if (!b) {
                    break Label_0884;
                }
            }
            if (!dQ.a(dq).isEmpty()) {
                if (this.n.d()) {
                    this.n.f();
                    this.n = null;
                    this.h = dQ.a(dq);
                    this.o &= 0xFFFFFFDF;
                    final boolean d = dS.d;
                    b8 c = null;
                    if (d) {
                        c = this.c();
                    }
                    this.n = c;
                    if (!b) {
                        break Label_0884;
                    }
                }
                this.n.a(dQ.a(dq));
            }
        }
        if (dq.k()) {
            this.a(dq.a());
        }
        this.b(dq.getUnknownFields());
        return this;
    }
    
    public fe a(final d_ k) {
        final boolean b = dt.b;
        Label_0077: {
            if (this.m == null) {
                Label_0060: {
                    if ((0x40 & this.o) == 0x40 && this.k != d_.h()) {
                        this.k = d_.a(this.k).a(k).g();
                        if (!b) {
                            break Label_0060;
                        }
                    }
                    this.k = k;
                }
                this.c();
                if (!b) {
                    break Label_0077;
                }
            }
            this.m.a(k);
        }
        this.o |= 0x40;
        return this;
    }
    
    public fe a(final fm fm) {
        if (fm instanceof dQ) {
            return this.a((dQ)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public int b() {
        if (this.i == null) {
            return this.r.size();
        }
        return this.i.a();
    }
    
    public dq b(final int n) {
        if (this.i == null) {
            return this.r.get(n);
        }
        return (dq)this.i.a(n);
    }
    
    @Override
    public ci build() {
        return this.m();
    }
    
    @Override
    public fm build() {
        return this.m();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    @Override
    public fm buildPartial() {
        return this.a();
    }
    
    public dC c(final int n) {
        if (this.g == null) {
            return this.e.get(n);
        }
        return (dC)this.g.a(n);
    }
    
    @Override
    public fp clear() {
        return this.x();
    }
    
    @Override
    public fE clone() {
        return this.n();
    }
    
    @Override
    public fp clone() {
        return this.n();
    }
    
    @Override
    public fx clone() {
        return this.n();
    }
    
    @Override
    public Object clone() {
        return this.n();
    }
    
    public dQ d() {
        return dQ.p();
    }
    
    public dQ d(final int n) {
        if (this.f == null) {
            return this.q.get(n);
        }
        return (dQ)this.f.a(n);
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.e();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.z().a(dQ.class, fe.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.u()) {
            if (!this.c(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        int j = 0;
        while (j < this.p()) {
            if (!this.a(j).isInitialized()) {
                return false;
            }
            ++j;
            if (b) {
                break;
            }
        }
        int k = 0;
        while (k < this.k()) {
            if (!this.d(k).isInitialized()) {
                return false;
            }
            ++k;
            if (b) {
                break;
            }
        }
        int l = 0;
        while (l < this.b()) {
            if (!this.b(l).isInitialized()) {
                return false;
            }
            ++l;
            if (b) {
                break;
            }
        }
        if (!this.s() || this.j().isInitialized()) {
            return true;
        }
        return false;
    }
    
    public d_ j() {
        if (this.m == null) {
            return this.k;
        }
        return (d_)this.m.b();
    }
    
    public int k() {
        if (this.f == null) {
            return this.q.size();
        }
        return this.f.a();
    }
    
    public dQ m() {
        final dQ a = this.a();
        if (!a.isInitialized()) {
            throw fx.a(a);
        }
        return a;
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
    
    public fe n() {
        return z().a(this.a());
    }
    
    public int p() {
        if (this.j == null) {
            return this.l.size();
        }
        return this.j.a();
    }
    
    public boolean s() {
        return (0x40 & this.o) == 0x40;
    }
    
    public int u() {
        if (this.g == null) {
            return this.e.size();
        }
        return this.g.a();
    }
    
    public fe x() {
        final boolean b = dt.b;
        super.clear();
        this.p = "";
        this.o &= 0xFFFFFFFE;
        Label_0062: {
            if (this.g == null) {
                this.e = Collections.emptyList();
                this.o &= 0xFFFFFFFD;
                if (!b) {
                    break Label_0062;
                }
            }
            this.g.c();
        }
        Label_0098: {
            if (this.j == null) {
                this.l = Collections.emptyList();
                this.o &= 0xFFFFFFFB;
                if (!b) {
                    break Label_0098;
                }
            }
            this.j.c();
        }
        Label_0134: {
            if (this.f == null) {
                this.q = Collections.emptyList();
                this.o &= 0xFFFFFFF7;
                if (!b) {
                    break Label_0134;
                }
            }
            this.f.c();
        }
        Label_0170: {
            if (this.i == null) {
                this.r = Collections.emptyList();
                this.o &= 0xFFFFFFEF;
                if (!b) {
                    break Label_0170;
                }
            }
            this.i.c();
        }
        Label_0206: {
            if (this.n == null) {
                this.h = Collections.emptyList();
                this.o &= 0xFFFFFFDF;
                if (!b) {
                    break Label_0206;
                }
            }
            this.n.c();
        }
        Label_0232: {
            if (this.m == null) {
                this.k = d_.h();
                if (!b) {
                    break Label_0232;
                }
            }
            this.m.c();
        }
        this.o &= 0xFFFFFFBF;
        return this;
    }
}
