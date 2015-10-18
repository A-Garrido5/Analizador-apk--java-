// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gR extends gq implements fY
{
    private b8 f;
    private int g;
    private List h;
    
    private gR() {
        this.h = Collections.emptyList();
        this.h();
    }
    
    private gR(final dg dg) {
        super(dg);
        this.h = Collections.emptyList();
        this.h();
    }
    
    gR(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void d() {
        if ((0x1 & this.g) != 0x1) {
            this.h = new ArrayList(this.h);
            this.g |= 0x1;
        }
    }
    
    private static gR f() {
        return new gR();
    }
    
    static gR g() {
        return f();
    }
    
    private void h() {
        if (dS.d) {
            this.k();
        }
    }
    
    private b8 k() {
        boolean b = true;
        if (this.f == null) {
            final List h = this.h;
            if ((0x1 & this.g) != (b ? 1 : 0)) {
                b = false;
            }
            this.f = new b8(h, b, this.a(), this.f());
            this.h = null;
        }
        return this.f;
    }
    
    public dh a() {
        final dh dh = new dh(this, null);
        final int g = this.g;
        Label_0081: {
            if (this.f == null) {
                if ((0x1 & this.g) == 0x1) {
                    this.h = Collections.unmodifiableList((List<?>)this.h);
                    this.g &= 0xFFFFFFFE;
                }
                com.google.dh.a(dh, this.h);
                if (!dt.b) {
                    break Label_0081;
                }
            }
            com.google.dh.a(dh, this.f.b());
        }
        this.b();
        return dh;
    }
    
    public dy a(final int n) {
        if (this.f == null) {
            return this.h.get(n);
        }
        return (dy)this.f.a(n);
    }
    
    public gR a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dh.l:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dh;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gR.a:(Lcom/google/dh;)Lcom/google/gR;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dh;
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
        //    61: invokevirtual   com/google/gR.a:(Lcom/google/dh;)Lcom/google/gR;
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
    
    public gR a(final dh dh) {
        final boolean b = dt.b;
        if (dh == dh.g()) {
            return this;
        }
        Label_0187: {
            if (this.f == null) {
                if (dh.b(dh).isEmpty()) {
                    break Label_0187;
                }
                Label_0085: {
                    if (this.h.isEmpty()) {
                        this.h = dh.b(dh);
                        this.g &= 0xFFFFFFFE;
                        if (!b) {
                            break Label_0085;
                        }
                    }
                    this.d();
                    this.h.addAll(dh.b(dh));
                }
                this.c();
                if (!b) {
                    break Label_0187;
                }
            }
            if (!dh.b(dh).isEmpty()) {
                if (this.f.d()) {
                    this.f.f();
                    this.f = null;
                    this.h = dh.b(dh);
                    this.g &= 0xFFFFFFFE;
                    final boolean d = dS.d;
                    b8 k = null;
                    if (d) {
                        k = this.k();
                    }
                    this.f = k;
                    if (!b) {
                        break Label_0187;
                    }
                }
                this.f.a(dh.b(dh));
            }
        }
        this.a(dh);
        this.b(dh.getUnknownFields());
        return this;
    }
    
    public gR a(final fm fm) {
        if (fm instanceof dh) {
            return this.a((dh)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    @Override
    public gR b() {
        super.b();
        if (this.f == null) {
            this.h = Collections.emptyList();
            this.g &= 0xFFFFFFFE;
            if (!dt.b) {
                return this;
            }
        }
        this.f.c();
        return this;
    }
    
    @Override
    public gq b() {
        return this.b();
    }
    
    @Override
    public ci build() {
        return this.e();
    }
    
    @Override
    public fm build() {
        return this.e();
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
        return this.l();
    }
    
    @Override
    public fp clear() {
        return this.b();
    }
    
    @Override
    public fE clone() {
        return this.l();
    }
    
    @Override
    public fp clone() {
        return this.l();
    }
    
    @Override
    public fx clone() {
        return this.l();
    }
    
    @Override
    public Object clone() {
        return this.l();
    }
    
    public dh e() {
        final dh a = this.a();
        if (!a.isInitialized()) {
            throw fx.a(a);
        }
        return a;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.j();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.t();
    }
    
    public int i() {
        if (this.f == null) {
            return this.h.size();
        }
        return this.f.a();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.I().a(dh.class, gR.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.i()) {
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
    
    public dh j() {
        return dh.g();
    }
    
    public gR l() {
        return f().a(this.a());
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
