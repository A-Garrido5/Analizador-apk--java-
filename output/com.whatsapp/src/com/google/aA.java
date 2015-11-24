// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public class aA implements dg
{
    private boolean a;
    private dS b;
    private dg c;
    private fp d;
    
    public aA(final dS b, final dg c, final boolean a) {
        if (b == null) {
            throw new NullPointerException();
        }
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    private void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/aA.d:Lcom/google/fp;
        //     4: ifnull          12
        //     7: aload_0        
        //     8: aconst_null    
        //     9: putfield        com/google/aA.b:Lcom/google/dS;
        //    12: aload_0        
        //    13: getfield        com/google/aA.a:Z
        //    16: istore          4
        //    18: iload           4
        //    20: ifeq            44
        //    23: aload_0        
        //    24: getfield        com/google/aA.c:Lcom/google/dg;
        //    27: ifnull          44
        //    30: aload_0        
        //    31: getfield        com/google/aA.c:Lcom/google/dg;
        //    34: invokeinterface com/google/dg.a:()V
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        com/google/aA.a:Z
        //    44: return         
        //    45: astore_1       
        //    46: aload_1        
        //    47: athrow         
        //    48: astore_2       
        //    49: aload_2        
        //    50: athrow         
        //    51: astore_3       
        //    52: aload_3        
        //    53: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      12     45     48     Ljava/lang/NullPointerException;
        //  12     18     48     51     Ljava/lang/NullPointerException;
        //  23     44     51     54     Ljava/lang/NullPointerException;
        //  49     51     51     54     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 30, Size: 30
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    public aA a(final dS p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/aA.d:Lcom/google/fp;
        //     4: astore          5
        //     6: aload           5
        //     8: ifnonnull       44
        //    11: aload_0        
        //    12: getfield        com/google/aA.b:Lcom/google/dS;
        //    15: astore          7
        //    17: aload_0        
        //    18: getfield        com/google/aA.b:Lcom/google/dS;
        //    21: invokevirtual   com/google/dS.getDefaultInstanceForType:()Lcom/google/fm;
        //    24: astore          8
        //    26: aload           7
        //    28: aload           8
        //    30: if_acmpne       44
        //    33: aload_0        
        //    34: aload_1        
        //    35: putfield        com/google/aA.b:Lcom/google/dS;
        //    38: getstatic       com/google/dt.b:Z
        //    41: ifeq            53
        //    44: aload_0        
        //    45: invokevirtual   com/google/aA.f:()Lcom/google/fp;
        //    48: aload_1        
        //    49: invokevirtual   com/google/fp.mergeFrom:(Lcom/google/fm;)Lcom/google/fx;
        //    52: pop            
        //    53: aload_0        
        //    54: invokespecial   com/google/aA.d:()V
        //    57: aload_0        
        //    58: areturn        
        //    59: astore_2       
        //    60: aload_2        
        //    61: athrow         
        //    62: astore_3       
        //    63: aload_3        
        //    64: athrow         
        //    65: astore          4
        //    67: aload           4
        //    69: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      59     62     Ljava/lang/NullPointerException;
        //  11     26     62     65     Ljava/lang/NullPointerException;
        //  33     44     65     70     Ljava/lang/NullPointerException;
        //  44     53     65     70     Ljava/lang/NullPointerException;
        //  60     62     62     65     Ljava/lang/NullPointerException;
        //  63     65     65     70     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 38, Size: 38
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    public dS a() {
        this.a = true;
        return this.b();
    }
    
    @Override
    public void a() {
        this.d();
    }
    
    public aA b(final dS b) {
        if (b == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            this.b = b;
            if (this.d != null) {
                this.d.e();
                this.d = null;
            }
            this.d();
            return this;
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    public dS b() {
        try {
            if (this.b == null) {
                this.b = (dS)this.d.buildPartial();
            }
            return this.b;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public aA c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/aA.b:Lcom/google/dS;
        //     4: ifnull          58
        //     7: aload_0        
        //     8: getfield        com/google/aA.b:Lcom/google/dS;
        //    11: invokevirtual   com/google/dS.getDefaultInstanceForType:()Lcom/google/fm;
        //    14: astore          4
        //    16: aload           4
        //    18: astore_2       
        //    19: aload_0        
        //    20: aload_2        
        //    21: checkcast       Lcom/google/dS;
        //    24: checkcast       Lcom/google/dS;
        //    27: putfield        com/google/aA.b:Lcom/google/dS;
        //    30: aload_0        
        //    31: getfield        com/google/aA.d:Lcom/google/fp;
        //    34: ifnull          49
        //    37: aload_0        
        //    38: getfield        com/google/aA.d:Lcom/google/fp;
        //    41: invokevirtual   com/google/fp.e:()V
        //    44: aload_0        
        //    45: aconst_null    
        //    46: putfield        com/google/aA.d:Lcom/google/fp;
        //    49: aload_0        
        //    50: invokespecial   com/google/aA.d:()V
        //    53: aload_0        
        //    54: areturn        
        //    55: astore_1       
        //    56: aload_1        
        //    57: athrow         
        //    58: aload_0        
        //    59: getfield        com/google/aA.d:Lcom/google/fp;
        //    62: invokevirtual   com/google/fp.getDefaultInstanceForType:()Lcom/google/fm;
        //    65: astore_2       
        //    66: goto            19
        //    69: astore_3       
        //    70: aload_3        
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      16     55     58     Ljava/lang/NullPointerException;
        //  19     49     69     72     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    public cT e() {
        try {
            if (this.d != null) {
                return this.d;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.b;
    }
    
    public fp f() {
        try {
            if (this.d == null) {
                (this.d = (fp)this.b.newBuilderForType(this)).mergeFrom((fm)this.b);
                this.d.g();
            }
            return this.d;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public void g() {
        this.c = null;
    }
}
