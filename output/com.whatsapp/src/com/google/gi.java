// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class gi extends fp implements dP
{
    private int e;
    private Object f;
    private dN g;
    private Object h;
    private Object i;
    private aA j;
    
    private gi() {
        this.f = "";
        this.i = "";
        this.h = "";
        this.g = dN.h();
        this.d();
    }
    
    private gi(final dg dg) {
        super(dg);
        this.f = "";
        this.i = "";
        this.h = "";
        this.g = dN.h();
        this.d();
    }
    
    gi(final dg dg, final fM fm) {
        this(dg);
    }
    
    private aA a() {
        if (this.j == null) {
            this.j = new aA(this.g, this.a(), this.f());
            this.g = null;
        }
        return this.j;
    }
    
    private void d() {
        if (dS.d) {
            this.a();
        }
    }
    
    static gi f() {
        return h();
    }
    
    private static gi h() {
        return new gi();
    }
    
    public gi a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dc.q:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dc;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gi.a:(Lcom/google/dc;)Lcom/google/gi;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dc;
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
        //    61: invokevirtual   com/google/gi.a:(Lcom/google/dc;)Lcom/google/gi;
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
    
    public gi a(final dN g) {
        final boolean b = dt.b;
        Label_0077: {
            if (this.j == null) {
                Label_0060: {
                    if ((0x8 & this.e) == 0x8 && this.g != dN.h()) {
                        this.g = dN.b(this.g).a(g).a();
                        if (!b) {
                            break Label_0060;
                        }
                    }
                    this.g = g;
                }
                this.c();
                if (!b) {
                    break Label_0077;
                }
            }
            this.j.a(g);
        }
        this.e |= 0x8;
        return this;
    }
    
    public gi a(final dc dc) {
        if (dc == dc.h()) {
            return this;
        }
        if (dc.k()) {
            this.e |= 0x1;
            this.f = dc.d(dc);
            this.c();
        }
        if (dc.s()) {
            this.e |= 0x2;
            this.i = dc.c(dc);
            this.c();
        }
        if (dc.g()) {
            this.e |= 0x4;
            this.h = dc.b(dc);
            this.c();
        }
        if (dc.p()) {
            this.a(dc.t());
        }
        this.b(dc.getUnknownFields());
        return this;
    }
    
    public gi a(final fm fm) {
        if (fm instanceof dc) {
            return this.a((dc)fm);
        }
        super.mergeFrom(fm);
        return this;
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
        return this.e();
    }
    
    @Override
    public fm buildPartial() {
        return this.e();
    }
    
    @Override
    public fp clear() {
        return this.m();
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
    
    public dc e() {
        int n = 1;
        final dc dc = new dc(this, null);
        final int e = this.e;
        if ((e & 0x1) != n) {
            n = 0;
        }
        com.google.dc.c(dc, this.f);
        if ((e & 0x2) == 0x2) {
            n |= 0x2;
        }
        com.google.dc.a(dc, this.i);
        if ((e & 0x4) == 0x4) {
            n |= 0x4;
        }
        com.google.dc.b(dc, this.h);
        int n2;
        if ((e & 0x8) == 0x8) {
            n2 = (n | 0x8);
        }
        else {
            n2 = n;
        }
        Label_0125: {
            if (this.j == null) {
                com.google.dc.a(dc, this.g);
                if (!dt.b) {
                    break Label_0125;
                }
            }
            com.google.dc.a(dc, (dN)this.j.a());
        }
        com.google.dc.a(dc, n2);
        this.b();
        return dc;
    }
    
    public dc g() {
        return dc.h();
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.g();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.m();
    }
    
    public dN i() {
        if (this.j == null) {
            return this.g;
        }
        return (dN)this.j.b();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.v().a(dc.class, gi.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return !this.j() || this.i().isInitialized();
    }
    
    public boolean j() {
        return (0x8 & this.e) == 0x8;
    }
    
    public dc k() {
        final dc e = this.e();
        if (!e.isInitialized()) {
            throw fx.a(e);
        }
        return e;
    }
    
    public gi l() {
        return h().a(this.e());
    }
    
    public gi m() {
        super.clear();
        this.f = "";
        this.e &= 0xFFFFFFFE;
        this.i = "";
        this.e &= 0xFFFFFFFD;
        this.h = "";
        this.e &= 0xFFFFFFFB;
        Label_0084: {
            if (this.j == null) {
                this.g = dN.h();
                if (!dt.b) {
                    break Label_0084;
                }
            }
            this.j.c();
        }
        this.e &= 0xFFFFFFF7;
        return this;
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
