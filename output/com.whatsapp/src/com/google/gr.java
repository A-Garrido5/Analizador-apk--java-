// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class gr extends fp implements eC
{
    private boolean e;
    private Object f;
    private int g;
    
    private gr() {
        this.f = "";
        this.d();
    }
    
    private gr(final dg dg) {
        super(dg);
        this.f = "";
        this.d();
    }
    
    gr(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void d() {
        if (dS.d) {}
    }
    
    private static gr h() {
        return new gr();
    }
    
    static gr i() {
        return h();
    }
    
    public dn a() {
        return dn.k();
    }
    
    public gr a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dn.f:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dn;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gr.a:(Lcom/google/dn;)Lcom/google/gr;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dn;
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
        //    61: invokevirtual   com/google/gr.a:(Lcom/google/dn;)Lcom/google/gr;
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
    
    public gr a(final dn dn) {
        if (dn == dn.k()) {
            return this;
        }
        if (dn.f()) {
            this.g |= 0x1;
            this.f = dn.a(dn);
            this.c();
        }
        if (dn.a()) {
            this.a(dn.d());
        }
        this.b(dn.getUnknownFields());
        return this;
    }
    
    public gr a(final fm fm) {
        if (fm instanceof dn) {
            return this.a((dn)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public gr a(final boolean e) {
        this.g |= 0x2;
        this.e = e;
        this.c();
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
        return this.l();
    }
    
    @Override
    public fm buildPartial() {
        return this.l();
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
    
    public boolean e() {
        return (0x2 & this.g) == 0x2;
    }
    
    public gr f() {
        return h().a(this.l());
    }
    
    public gr g() {
        super.clear();
        this.f = "";
        this.g &= 0xFFFFFFFE;
        this.e = false;
        this.g &= 0xFFFFFFFD;
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
        return hM.M();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.N().a(dn.class, gr.class);
    }
    
    @Override
    public final boolean isInitialized() {
        return this.j() && this.e();
    }
    
    public boolean j() {
        return (0x1 & this.g) == 0x1;
    }
    
    public dn k() {
        final dn l = this.l();
        if (!l.isInitialized()) {
            throw fx.a(l);
        }
        return l;
    }
    
    public dn l() {
        int n = 1;
        final dn dn = new dn(this, null);
        final int g = this.g;
        if ((g & 0x1) != n) {
            n = 0;
        }
        com.google.dn.a(dn, this.f);
        if ((g & 0x2) == 0x2) {
            n |= 0x2;
        }
        com.google.dn.a(dn, this.e);
        com.google.dn.a(dn, n);
        this.b();
        return dn;
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
