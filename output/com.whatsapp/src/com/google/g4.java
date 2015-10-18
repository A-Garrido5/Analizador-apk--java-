// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g4 extends fp implements ff
{
    private List e;
    private b8 f;
    private int g;
    
    private g4() {
        this.e = Collections.emptyList();
        this.k();
    }
    
    private g4(final dg dg) {
        super(dg);
        this.e = Collections.emptyList();
        this.k();
    }
    
    g4(final dg dg, final fM fm) {
        this(dg);
    }
    
    private b8 b() {
        boolean b = true;
        if (this.f == null) {
            final List e = this.e;
            if ((0x1 & this.g) != (b ? 1 : 0)) {
                b = false;
            }
            this.f = new b8(e, b, this.a(), this.f());
            this.e = null;
        }
        return this.f;
    }
    
    private void d() {
        if ((0x1 & this.g) != 0x1) {
            this.e = new ArrayList(this.e);
            this.g |= 0x1;
        }
    }
    
    static g4 h() {
        return j();
    }
    
    private static g4 j() {
        return new g4();
    }
    
    private void k() {
        if (dS.d) {
            this.b();
        }
    }
    
    public dR a() {
        final dR dr = new dR(this, null);
        final int g = this.g;
        Label_0081: {
            if (this.f == null) {
                if ((0x1 & this.g) == 0x1) {
                    this.e = Collections.unmodifiableList((List<?>)this.e);
                    this.g &= 0xFFFFFFFE;
                }
                dR.a(dr, this.e);
                if (!dt.b) {
                    break Label_0081;
                }
            }
            dR.a(dr, this.f.b());
        }
        this.b();
        return dr;
    }
    
    public g4 a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dR.f:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dR;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/g4.a:(Lcom/google/dR;)Lcom/google/g4;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dR;
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
        //    61: invokevirtual   com/google/g4.a:(Lcom/google/dR;)Lcom/google/g4;
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
    
    public g4 a(final dR dr) {
        final boolean b = dt.b;
        if (dr == dR.a()) {
            return this;
        }
        Label_0187: {
            if (this.f == null) {
                if (dR.a(dr).isEmpty()) {
                    break Label_0187;
                }
                Label_0085: {
                    if (this.e.isEmpty()) {
                        this.e = dR.a(dr);
                        this.g &= 0xFFFFFFFE;
                        if (!b) {
                            break Label_0085;
                        }
                    }
                    this.d();
                    this.e.addAll(dR.a(dr));
                }
                this.c();
                if (!b) {
                    break Label_0187;
                }
            }
            if (!dR.a(dr).isEmpty()) {
                if (this.f.d()) {
                    this.f.f();
                    this.f = null;
                    this.e = dR.a(dr);
                    this.g &= 0xFFFFFFFE;
                    final boolean d = dS.d;
                    b8 b2 = null;
                    if (d) {
                        b2 = this.b();
                    }
                    this.f = b2;
                    if (!b) {
                        break Label_0187;
                    }
                }
                this.f.a(dR.a(dr));
            }
        }
        this.b(dr.getUnknownFields());
        return this;
    }
    
    public g4 a(final fm fm) {
        if (fm instanceof dR) {
            return this.a((dR)fm);
        }
        super.mergeFrom(fm);
        return this;
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
    public fp clear() {
        return this.g();
    }
    
    @Override
    public fE clone() {
        return this.f();
    }
    
    @Override
    public fp clone() {
        return this.f();
    }
    
    @Override
    public fx clone() {
        return this.f();
    }
    
    @Override
    public Object clone() {
        return this.f();
    }
    
    public dR e() {
        final dR a = this.a();
        if (!a.isInitialized()) {
            throw fx.a(a);
        }
        return a;
    }
    
    public g4 f() {
        return j().a(this.a());
    }
    
    public g4 g() {
        super.clear();
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.g &= 0xFFFFFFFE;
            if (!dt.b) {
                return this;
            }
        }
        this.f.c();
        return this;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.i();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.d();
    }
    
    public dR i() {
        return dR.a();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.D().a(dR.class, g4.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return true;
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
