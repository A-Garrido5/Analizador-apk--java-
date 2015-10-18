// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class fX extends fp implements bC
{
    private int e;
    private int f;
    private int g;
    
    private fX() {
        this.d();
    }
    
    private fX(final dg dg) {
        super(dg);
        this.d();
    }
    
    fX(final dg dg, final fM fm) {
        this(dg);
    }
    
    static fX b() {
        return e();
    }
    
    private void d() {
        if (dS.d) {}
    }
    
    private static fX e() {
        return new fX();
    }
    
    public fX a() {
        return e().a(this.f());
    }
    
    public fX a(final int e) {
        this.f |= 0x2;
        this.e = e;
        this.c();
        return this;
    }
    
    public fX a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dr.l:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dr;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/fX.a:(Lcom/google/dr;)Lcom/google/fX;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dr;
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
        //    61: invokevirtual   com/google/fX.a:(Lcom/google/dr;)Lcom/google/fX;
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
    
    public fX a(final dr dr) {
        if (dr == dr.g()) {
            return this;
        }
        if (dr.c()) {
            this.b(dr.b());
        }
        if (dr.a()) {
            this.a(dr.e());
        }
        this.b(dr.getUnknownFields());
        return this;
    }
    
    public fX a(final fm fm) {
        if (fm instanceof dr) {
            return this.a((dr)fm);
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public fX b(final int g) {
        this.f |= 0x1;
        this.g = g;
        this.c();
        return this;
    }
    
    @Override
    public ci build() {
        return this.g();
    }
    
    @Override
    public fm build() {
        return this.g();
    }
    
    @Override
    public ci buildPartial() {
        return this.f();
    }
    
    @Override
    public fm buildPartial() {
        return this.f();
    }
    
    public fX c() {
        super.clear();
        this.g = 0;
        this.f &= 0xFFFFFFFE;
        this.e = 0;
        this.f &= 0xFFFFFFFD;
        return this;
    }
    
    @Override
    public fp clear() {
        return this.c();
    }
    
    @Override
    public fE clone() {
        return this.a();
    }
    
    @Override
    public fp clone() {
        return this.a();
    }
    
    @Override
    public fx clone() {
        return this.a();
    }
    
    @Override
    public Object clone() {
        return this.a();
    }
    
    public dr f() {
        int n = 1;
        final dr dr = new dr(this, null);
        final int f = this.f;
        if ((f & 0x1) != n) {
            n = 0;
        }
        com.google.dr.b(dr, this.g);
        if ((f & 0x2) == 0x2) {
            n |= 0x2;
        }
        com.google.dr.a(dr, this.e);
        com.google.dr.c(dr, n);
        this.b();
        return dr;
    }
    
    public dr g() {
        final dr f = this.f();
        if (!f.isInitialized()) {
            throw fx.a(f);
        }
        return f;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.J();
    }
    
    public dr h() {
        return dr.g();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.E().a(dr.class, fX.class);
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
