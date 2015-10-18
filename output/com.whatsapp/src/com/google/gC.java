// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gC extends gq implements aG
{
    private b8 f;
    private List g;
    private int h;
    
    private gC() {
        this.g = Collections.emptyList();
        this.h();
    }
    
    private gC(final dg dg) {
        super(dg);
        this.g = Collections.emptyList();
        this.h();
    }
    
    gC(final dg dg, final fM fm) {
        this(dg);
    }
    
    private b8 a() {
        boolean b = true;
        if (this.f == null) {
            final List g = this.g;
            if ((0x1 & this.h) != (b ? 1 : 0)) {
                b = false;
            }
            this.f = new b8(g, b, this.a(), this.f());
            this.g = null;
        }
        return this.f;
    }
    
    static gC e() {
        return j();
    }
    
    private void h() {
        if (dS.d) {
            this.a();
        }
    }
    
    private static gC j() {
        return new gC();
    }
    
    private void l() {
        if ((0x1 & this.h) != 0x1) {
            this.g = new ArrayList(this.g);
            this.h |= 0x1;
        }
    }
    
    public dy a(final int n) {
        if (this.f == null) {
            return this.g.get(n);
        }
        return (dy)this.f.a(n);
    }
    
    public gC a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dF.i:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dF;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gC.a:(Lcom/google/dF;)Lcom/google/gC;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dF;
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
        //    61: invokevirtual   com/google/gC.a:(Lcom/google/dF;)Lcom/google/gC;
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
    
    public gC a(final dF df) {
        final boolean b = dt.b;
        if (df == dF.i()) {
            return this;
        }
        Label_0187: {
            if (this.f == null) {
                if (dF.b(df).isEmpty()) {
                    break Label_0187;
                }
                Label_0085: {
                    if (this.g.isEmpty()) {
                        this.g = dF.b(df);
                        this.h &= 0xFFFFFFFE;
                        if (!b) {
                            break Label_0085;
                        }
                    }
                    this.l();
                    this.g.addAll(dF.b(df));
                }
                this.c();
                if (!b) {
                    break Label_0187;
                }
            }
            if (!dF.b(df).isEmpty()) {
                if (this.f.d()) {
                    this.f.f();
                    this.f = null;
                    this.g = dF.b(df);
                    this.h &= 0xFFFFFFFE;
                    final boolean d = dS.d;
                    b8 a = null;
                    if (d) {
                        a = this.a();
                    }
                    this.f = a;
                    if (!b) {
                        break Label_0187;
                    }
                }
                this.f.a(dF.b(df));
            }
        }
        this.a(df);
        this.b(df.getUnknownFields());
        return this;
    }
    
    public gC a(final fm fm) {
        if (fm instanceof dF) {
            return this.a((dF)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    @Override
    public gC b() {
        return j().a(this.i());
    }
    
    @Override
    public gq b() {
        return this.c();
    }
    
    @Override
    public ci build() {
        return this.k();
    }
    
    @Override
    public fm build() {
        return this.k();
    }
    
    @Override
    public ci buildPartial() {
        return this.i();
    }
    
    @Override
    public fm buildPartial() {
        return this.i();
    }
    
    @Override
    public gC c() {
        super.b();
        if (this.f == null) {
            this.g = Collections.emptyList();
            this.h &= 0xFFFFFFFE;
            if (!dt.b) {
                return this;
            }
        }
        this.f.c();
        return this;
    }
    
    @Override
    public gq c() {
        return this.b();
    }
    
    @Override
    public fp clear() {
        return this.c();
    }
    
    @Override
    public fE clone() {
        return this.b();
    }
    
    @Override
    public fp clone() {
        return this.b();
    }
    
    @Override
    public fx clone() {
        return this.b();
    }
    
    @Override
    public Object clone() {
        return this.b();
    }
    
    public int d() {
        if (this.f == null) {
            return this.g.size();
        }
        return this.f.a();
    }
    
    public dF f() {
        return dF.i();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.f();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.f();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.F();
    }
    
    public dF i() {
        final dF df = new dF(this, null);
        final int h = this.h;
        Label_0081: {
            if (this.f == null) {
                if ((0x1 & this.h) == 0x1) {
                    this.g = Collections.unmodifiableList((List<?>)this.g);
                    this.h &= 0xFFFFFFFE;
                }
                dF.a(df, this.g);
                if (!dt.b) {
                    break Label_0081;
                }
            }
            dF.a(df, this.f.b());
        }
        this.b();
        return df;
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.f().a(dF.class, gC.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.d()) {
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
    
    public dF k() {
        final dF i = this.i();
        if (!i.isInitialized()) {
            throw fx.a(i);
        }
        return i;
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
