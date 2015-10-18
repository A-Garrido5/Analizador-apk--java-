// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class fz extends fp implements g7
{
    private aA e;
    private int f;
    private int g;
    private Object h;
    private dF i;
    
    private fz() {
        this.h = "";
        this.i = dF.i();
        this.d();
    }
    
    private fz(final dg dg) {
        super(dg);
        this.h = "";
        this.i = dF.i();
        this.d();
    }
    
    fz(final dg dg, final fM fm) {
        this(dg);
    }
    
    private aA a() {
        if (this.e == null) {
            this.e = new aA(this.i, this.a(), this.f());
            this.i = null;
        }
        return this.e;
    }
    
    private void d() {
        if (dS.d) {
            this.a();
        }
    }
    
    private static fz h() {
        return new fz();
    }
    
    static fz l() {
        return h();
    }
    
    public fz a(final int f) {
        this.g |= 0x2;
        this.f = f;
        this.c();
        return this;
    }
    
    public fz a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dW.l:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dW;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/fz.a:(Lcom/google/dW;)Lcom/google/fz;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dW;
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
        //    61: invokevirtual   com/google/fz.a:(Lcom/google/dW;)Lcom/google/fz;
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
    
    public fz a(final dF i) {
        final boolean b = dt.b;
        Label_0075: {
            if (this.e == null) {
                Label_0058: {
                    if ((0x4 & this.g) == 0x4 && this.i != dF.i()) {
                        this.i = dF.a(this.i).a(i).i();
                        if (!b) {
                            break Label_0058;
                        }
                    }
                    this.i = i;
                }
                this.c();
                if (!b) {
                    break Label_0075;
                }
            }
            this.e.a(i);
        }
        this.g |= 0x4;
        return this;
    }
    
    public fz a(final dW dw) {
        if (dw == dW.m()) {
            return this;
        }
        if (dw.l()) {
            this.g |= 0x1;
            this.h = dW.a(dw);
            this.c();
        }
        if (dw.o()) {
            this.a(dw.i());
        }
        if (dw.g()) {
            this.a(dw.d());
        }
        this.b(dw.getUnknownFields());
        return this;
    }
    
    public fz a(final fm fm) {
        if (fm instanceof dW) {
            return this.a((dW)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public fz b() {
        return h().a(this.k());
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
        return this.k();
    }
    
    @Override
    public fm buildPartial() {
        return this.k();
    }
    
    @Override
    public fp clear() {
        return this.g();
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
    
    public boolean e() {
        return (0x4 & this.g) == 0x4;
    }
    
    public dW f() {
        return dW.m();
    }
    
    public fz g() {
        super.clear();
        this.h = "";
        this.g &= 0xFFFFFFFE;
        this.f = 0;
        this.g &= 0xFFFFFFFD;
        Label_0066: {
            if (this.e == null) {
                this.i = dF.i();
                if (!dt.b) {
                    break Label_0066;
                }
            }
            this.e.c();
        }
        this.g &= 0xFFFFFFFB;
        return this;
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
        return hM.C();
    }
    
    public dF i() {
        if (this.e == null) {
            return this.i;
        }
        return (dF)this.e.b();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.B().a(dW.class, fz.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return !this.e() || this.i().isInitialized();
    }
    
    public dW j() {
        final dW k = this.k();
        if (!k.isInitialized()) {
            throw fx.a(k);
        }
        return k;
    }
    
    public dW k() {
        int n = 1;
        final dW dw = new dW(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        dW.a(dw, this.h);
        if ((g & 0x2) == 0x2) {
            n |= 0x2;
        }
        dW.a(dw, this.f);
        int n2;
        if ((g & 0x4) == 0x4) {
            n2 = (n | 0x4);
        }
        else {
            n2 = n;
        }
        Label_0102: {
            if (this.e == null) {
                dW.a(dw, this.i);
                if (!dt.b) {
                    break Label_0102;
                }
            }
            dW.a(dw, (dF)this.e.a());
        }
        dW.b(dw, n2);
        this.b();
        return dw;
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
