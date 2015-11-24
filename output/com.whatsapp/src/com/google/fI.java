// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fI extends fp implements q
{
    private b8 e;
    private Object f;
    private int g;
    private da h;
    private List i;
    private aA j;
    
    private fI() {
        this.f = "";
        this.i = Collections.emptyList();
        this.h = da.j();
        this.k();
    }
    
    private fI(final dg dg) {
        super(dg);
        this.f = "";
        this.i = Collections.emptyList();
        this.h = da.j();
        this.k();
    }
    
    fI(final dg dg, final fM fm) {
        this(dg);
    }
    
    private static fI b() {
        return new fI();
    }
    
    private void d() {
        if ((0x2 & this.g) != 0x2) {
            this.i = new ArrayList(this.i);
            this.g |= 0x2;
        }
    }
    
    private aA e() {
        if (this.j == null) {
            this.j = new aA(this.h, this.a(), this.f());
            this.h = null;
        }
        return this.j;
    }
    
    static fI f() {
        return b();
    }
    
    private b8 j() {
        if (this.e == null) {
            this.e = new b8(this.i, (0x2 & this.g) == 0x2, this.a(), this.f());
            this.i = null;
        }
        return this.e;
    }
    
    private void k() {
        if (dS.d) {
            this.j();
            this.e();
        }
    }
    
    public dW a(final int n) {
        if (this.e == null) {
            return this.i.get(n);
        }
        return (dW)this.e.a(n);
    }
    
    public dq a() {
        return dq.i();
    }
    
    public fI a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dq.e:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dq;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/fI.a:(Lcom/google/dq;)Lcom/google/fI;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dq;
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
        //    61: invokevirtual   com/google/fI.a:(Lcom/google/dq;)Lcom/google/fI;
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
    
    public fI a(final da h) {
        final boolean b = dt.b;
        Label_0075: {
            if (this.j == null) {
                Label_0058: {
                    if ((0x4 & this.g) == 0x4 && this.h != da.j()) {
                        this.h = da.b(this.h).a(h).f();
                        if (!b) {
                            break Label_0058;
                        }
                    }
                    this.h = h;
                }
                this.c();
                if (!b) {
                    break Label_0075;
                }
            }
            this.j.a(h);
        }
        this.g |= 0x4;
        return this;
    }
    
    public fI a(final dq dq) {
        final boolean b = dt.b;
        if (dq == dq.i()) {
            return this;
        }
        if (dq.q()) {
            this.g |= 0x1;
            this.f = dq.a(dq);
            this.c();
        }
        Label_0216: {
            if (this.e == null) {
                if (dq.c(dq).isEmpty()) {
                    break Label_0216;
                }
                Label_0114: {
                    if (this.i.isEmpty()) {
                        this.i = dq.c(dq);
                        this.g &= 0xFFFFFFFD;
                        if (!b) {
                            break Label_0114;
                        }
                    }
                    this.d();
                    this.i.addAll(dq.c(dq));
                }
                this.c();
                if (!b) {
                    break Label_0216;
                }
            }
            if (!dq.c(dq).isEmpty()) {
                if (this.e.d()) {
                    this.e.f();
                    this.e = null;
                    this.i = dq.c(dq);
                    this.g &= 0xFFFFFFFD;
                    final boolean d = dS.d;
                    b8 j = null;
                    if (d) {
                        j = this.j();
                    }
                    this.e = j;
                    if (!b) {
                        break Label_0216;
                    }
                }
                this.e.a(dq.c(dq));
            }
        }
        if (dq.e()) {
            this.a(dq.m());
        }
        this.b(dq.getUnknownFields());
        return this;
    }
    
    public fI a(final fm fm) {
        if (fm instanceof dq) {
            return this.a((dq)fm);
        }
        super.mergeFrom(fm);
        return this;
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
        return this.n();
    }
    
    @Override
    public fm buildPartial() {
        return this.n();
    }
    
    public da c() {
        if (this.j == null) {
            return this.h;
        }
        return (da)this.j.b();
    }
    
    @Override
    public fp clear() {
        return this.g();
    }
    
    @Override
    public fE clone() {
        return this.i();
    }
    
    @Override
    public fp clone() {
        return this.i();
    }
    
    @Override
    public fx clone() {
        return this.i();
    }
    
    @Override
    public Object clone() {
        return this.i();
    }
    
    public fI g() {
        final boolean b = dt.b;
        super.clear();
        this.f = "";
        this.g &= 0xFFFFFFFE;
        Label_0062: {
            if (this.e == null) {
                this.i = Collections.emptyList();
                this.g &= 0xFFFFFFFD;
                if (!b) {
                    break Label_0062;
                }
            }
            this.e.c();
        }
        Label_0088: {
            if (this.j == null) {
                this.h = da.j();
                if (!b) {
                    break Label_0088;
                }
            }
            this.j.c();
        }
        this.g &= 0xFFFFFFFB;
        return this;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.a();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.p();
    }
    
    public boolean h() {
        return (0x4 & this.g) == 0x4;
    }
    
    public fI i() {
        return b().a(this.n());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.c().a(dq.class, fI.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.l()) {
            if (!this.a(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (!this.h() || this.c().isInitialized()) {
            return true;
        }
        return false;
    }
    
    public int l() {
        if (this.e == null) {
            return this.i.size();
        }
        return this.e.a();
    }
    
    public dq m() {
        final dq n = this.n();
        if (!n.isInitialized()) {
            throw fx.a(n);
        }
        return n;
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
    
    public dq n() {
        int n = 1;
        final boolean b = dt.b;
        final dq dq = new dq(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        com.google.dq.a(dq, this.f);
        Label_0103: {
            if (this.e == null) {
                if ((0x2 & this.g) == 0x2) {
                    this.i = Collections.unmodifiableList((List<?>)this.i);
                    this.g &= 0xFFFFFFFD;
                }
                com.google.dq.a(dq, this.i);
                if (!b) {
                    break Label_0103;
                }
            }
            com.google.dq.a(dq, this.e.b());
        }
        int n2;
        if ((g & 0x4) == 0x4) {
            n2 = (n | 0x2);
        }
        else {
            n2 = n;
        }
        Label_0151: {
            if (this.j == null) {
                com.google.dq.a(dq, this.h);
                if (!b) {
                    break Label_0151;
                }
            }
            com.google.dq.a(dq, (da)this.j.a());
        }
        com.google.dq.a(dq, n2);
        this.b();
        return dq;
    }
}
