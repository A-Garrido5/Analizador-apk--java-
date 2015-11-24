// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gB extends gq implements e7
{
    private List f;
    private b8 g;
    private int h;
    
    private gB() {
        this.f = Collections.emptyList();
        this.d();
    }
    
    private gB(final dg dg) {
        super(dg);
        this.f = Collections.emptyList();
        this.d();
    }
    
    gB(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void d() {
        if (dS.d) {
            this.e();
        }
    }
    
    private b8 e() {
        boolean b = true;
        if (this.g == null) {
            final List f = this.f;
            if ((0x1 & this.h) != (b ? 1 : 0)) {
                b = false;
            }
            this.g = new b8(f, b, this.a(), this.f());
            this.f = null;
        }
        return this.g;
    }
    
    private void h() {
        if ((0x1 & this.h) != 0x1) {
            this.f = new ArrayList(this.f);
            this.h |= 0x1;
        }
    }
    
    static gB i() {
        return m();
    }
    
    private static gB m() {
        return new gB();
    }
    
    public dN a() {
        final dN dn = new dN(this, null);
        final int h = this.h;
        Label_0081: {
            if (this.g == null) {
                if ((0x1 & this.h) == 0x1) {
                    this.f = Collections.unmodifiableList((List<?>)this.f);
                    this.h &= 0xFFFFFFFE;
                }
                dN.a(dn, this.f);
                if (!dt.b) {
                    break Label_0081;
                }
            }
            dN.a(dn, this.g.b());
        }
        this.b();
        return dn;
    }
    
    public dy a(final int n) {
        if (this.g == null) {
            return this.f.get(n);
        }
        return (dy)this.g.a(n);
    }
    
    public gB a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dN.g:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dN;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gB.a:(Lcom/google/dN;)Lcom/google/gB;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dN;
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
        //    61: invokevirtual   com/google/gB.a:(Lcom/google/dN;)Lcom/google/gB;
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
    
    public gB a(final dN dn) {
        final boolean b = dt.b;
        if (dn == dN.h()) {
            return this;
        }
        Label_0187: {
            if (this.g == null) {
                if (dN.a(dn).isEmpty()) {
                    break Label_0187;
                }
                Label_0085: {
                    if (this.f.isEmpty()) {
                        this.f = dN.a(dn);
                        this.h &= 0xFFFFFFFE;
                        if (!b) {
                            break Label_0085;
                        }
                    }
                    this.h();
                    this.f.addAll(dN.a(dn));
                }
                this.c();
                if (!b) {
                    break Label_0187;
                }
            }
            if (!dN.a(dn).isEmpty()) {
                if (this.g.d()) {
                    this.g.f();
                    this.g = null;
                    this.f = dN.a(dn);
                    this.h &= 0xFFFFFFFE;
                    final boolean d = dS.d;
                    b8 e = null;
                    if (d) {
                        e = this.e();
                    }
                    this.g = e;
                    if (!b) {
                        break Label_0187;
                    }
                }
                this.g.a(dN.a(dn));
            }
        }
        this.a(dn);
        this.b(dn.getUnknownFields());
        return this;
    }
    
    public gB a(final fm fm) {
        if (fm instanceof dN) {
            return this.a((dN)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    @Override
    public gB b() {
        super.b();
        if (this.g == null) {
            this.f = Collections.emptyList();
            this.h &= 0xFFFFFFFE;
            if (!dt.b) {
                return this;
            }
        }
        this.g.c();
        return this;
    }
    
    @Override
    public gq b() {
        return this.b();
    }
    
    @Override
    public ci build() {
        return this.j();
    }
    
    @Override
    public fm build() {
        return this.j();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    @Override
    public fm buildPartial() {
        return this.a();
    }
    
    @Override
    public gq c() {
        return this.k();
    }
    
    @Override
    public fp clear() {
        return this.b();
    }
    
    @Override
    public fE clone() {
        return this.k();
    }
    
    @Override
    public fp clone() {
        return this.k();
    }
    
    @Override
    public fx clone() {
        return this.k();
    }
    
    @Override
    public Object clone() {
        return this.k();
    }
    
    public int f() {
        if (this.g == null) {
            return this.f.size();
        }
        return this.g.a();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.r();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.O().a(dN.class, gB.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.f()) {
            if (!this.a(i).isInitialized()) {
                return false;
            }
            ++i;
            if (b) {
                break;
            }
        }
        if (this.e()) {
            return true;
        }
        return false;
    }
    
    public dN j() {
        final dN a = this.a();
        if (!a.isInitialized()) {
            throw fx.a(a);
        }
        return a;
    }
    
    public gB k() {
        return m().a(this.a());
    }
    
    public dN l() {
        return dN.h();
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
}
