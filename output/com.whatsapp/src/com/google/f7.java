// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class f7 extends fp implements gI
{
    private int e;
    private ds f;
    private dU g;
    private Object h;
    private Object i;
    private aA j;
    private d1 k;
    private int l;
    private Object m;
    private Object n;
    
    private f7() {
        this.n = "";
        this.g = dU.LABEL_OPTIONAL;
        this.k = d1.TYPE_DOUBLE;
        this.h = "";
        this.m = "";
        this.i = "";
        this.f = ds.p();
        this.i();
    }
    
    private f7(final dg dg) {
        super(dg);
        this.n = "";
        this.g = dU.LABEL_OPTIONAL;
        this.k = d1.TYPE_DOUBLE;
        this.h = "";
        this.m = "";
        this.i = "";
        this.f = ds.p();
        this.i();
    }
    
    f7(final dg dg, final fM fm) {
        this(dg);
    }
    
    static f7 a() {
        return g();
    }
    
    private static f7 g() {
        return new f7();
    }
    
    private aA h() {
        try {
            if (this.j == null) {
                this.j = new aA(this.f, this.a(), this.f());
                this.f = null;
            }
            return this.j;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void i() {
        try {
            if (dS.d) {
                this.h();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public f7 a(final int e) {
        this.l |= 0x2;
        this.e = e;
        this.c();
        return this;
    }
    
    public f7 a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dC.h:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dC;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/f7.a:(Lcom/google/dC;)Lcom/google/f7;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dC;
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
        //    61: invokevirtual   com/google/f7.a:(Lcom/google/dC;)Lcom/google/f7;
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
    
    public f7 a(final d1 k) {
        if (k == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.l |= 0x8;
        this.k = k;
        this.c();
        return this;
    }
    
    public f7 a(final dC p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/google/dC.s:()Lcom/google/dC;
        //     3: astore_3       
        //     4: aload_1        
        //     5: aload_3        
        //     6: if_acmpne       14
        //     9: aload_0        
        //    10: areturn        
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_1        
        //    15: invokevirtual   com/google/dC.n:()Z
        //    18: ifeq            43
        //    21: aload_0        
        //    22: iconst_1       
        //    23: aload_0        
        //    24: getfield        com/google/f7.l:I
        //    27: ior            
        //    28: putfield        com/google/f7.l:I
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokestatic    com/google/dC.c:(Lcom/google/dC;)Ljava/lang/Object;
        //    36: putfield        com/google/f7.n:Ljava/lang/Object;
        //    39: aload_0        
        //    40: invokevirtual   com/google/f7.c:()V
        //    43: aload_1        
        //    44: invokevirtual   com/google/dC.b:()Z
        //    47: ifeq            59
        //    50: aload_0        
        //    51: aload_1        
        //    52: invokevirtual   com/google/dC.q:()I
        //    55: invokevirtual   com/google/f7.a:(I)Lcom/google/f7;
        //    58: pop            
        //    59: aload_1        
        //    60: invokevirtual   com/google/dC.d:()Z
        //    63: ifeq            75
        //    66: aload_0        
        //    67: aload_1        
        //    68: invokevirtual   com/google/dC.t:()Lcom/google/dU;
        //    71: invokevirtual   com/google/f7.a:(Lcom/google/dU;)Lcom/google/f7;
        //    74: pop            
        //    75: aload_1        
        //    76: invokevirtual   com/google/dC.k:()Z
        //    79: ifeq            91
        //    82: aload_0        
        //    83: aload_1        
        //    84: invokevirtual   com/google/dC.u:()Lcom/google/d1;
        //    87: invokevirtual   com/google/f7.a:(Lcom/google/d1;)Lcom/google/f7;
        //    90: pop            
        //    91: aload_1        
        //    92: invokevirtual   com/google/dC.e:()Z
        //    95: ifeq            121
        //    98: aload_0        
        //    99: bipush          16
        //   101: aload_0        
        //   102: getfield        com/google/f7.l:I
        //   105: ior            
        //   106: putfield        com/google/f7.l:I
        //   109: aload_0        
        //   110: aload_1        
        //   111: invokestatic    com/google/dC.d:(Lcom/google/dC;)Ljava/lang/Object;
        //   114: putfield        com/google/f7.h:Ljava/lang/Object;
        //   117: aload_0        
        //   118: invokevirtual   com/google/f7.c:()V
        //   121: aload_1        
        //   122: invokevirtual   com/google/dC.x:()Z
        //   125: ifeq            151
        //   128: aload_0        
        //   129: bipush          32
        //   131: aload_0        
        //   132: getfield        com/google/f7.l:I
        //   135: ior            
        //   136: putfield        com/google/f7.l:I
        //   139: aload_0        
        //   140: aload_1        
        //   141: invokestatic    com/google/dC.a:(Lcom/google/dC;)Ljava/lang/Object;
        //   144: putfield        com/google/f7.m:Ljava/lang/Object;
        //   147: aload_0        
        //   148: invokevirtual   com/google/f7.c:()V
        //   151: aload_1        
        //   152: invokevirtual   com/google/dC.v:()Z
        //   155: ifeq            181
        //   158: aload_0        
        //   159: bipush          64
        //   161: aload_0        
        //   162: getfield        com/google/f7.l:I
        //   165: ior            
        //   166: putfield        com/google/f7.l:I
        //   169: aload_0        
        //   170: aload_1        
        //   171: invokestatic    com/google/dC.b:(Lcom/google/dC;)Ljava/lang/Object;
        //   174: putfield        com/google/f7.i:Ljava/lang/Object;
        //   177: aload_0        
        //   178: invokevirtual   com/google/f7.c:()V
        //   181: aload_1        
        //   182: invokevirtual   com/google/dC.g:()Z
        //   185: ifeq            197
        //   188: aload_0        
        //   189: aload_1        
        //   190: invokevirtual   com/google/dC.y:()Lcom/google/ds;
        //   193: invokevirtual   com/google/f7.a:(Lcom/google/ds;)Lcom/google/f7;
        //   196: pop            
        //   197: aload_0        
        //   198: aload_1        
        //   199: invokevirtual   com/google/dC.getUnknownFields:()Lcom/google/ce;
        //   202: invokevirtual   com/google/f7.b:(Lcom/google/ce;)Lcom/google/fp;
        //   205: pop            
        //   206: aload_0        
        //   207: areturn        
        //   208: astore          4
        //   210: aload           4
        //   212: athrow         
        //   213: astore          5
        //   215: aload           5
        //   217: athrow         
        //   218: astore          6
        //   220: aload           6
        //   222: athrow         
        //   223: astore          7
        //   225: aload           7
        //   227: athrow         
        //   228: astore          8
        //   230: aload           8
        //   232: athrow         
        //   233: astore          9
        //   235: aload           9
        //   237: athrow         
        //   238: astore          10
        //   240: aload           10
        //   242: athrow         
        //   243: astore          11
        //   245: aload           11
        //   247: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      4      11     14     Ljava/lang/NullPointerException;
        //  14     43     208    213    Ljava/lang/NullPointerException;
        //  43     59     213    218    Ljava/lang/NullPointerException;
        //  59     75     218    223    Ljava/lang/NullPointerException;
        //  75     91     223    228    Ljava/lang/NullPointerException;
        //  91     121    228    233    Ljava/lang/NullPointerException;
        //  121    151    233    238    Ljava/lang/NullPointerException;
        //  151    181    238    243    Ljava/lang/NullPointerException;
        //  181    197    243    248    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 133, Size: 133
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
    
    public f7 a(final dU g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.l |= 0x4;
        this.g = g;
        this.c();
        return this;
    }
    
    public f7 a(final ds p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/f7.j:Lcom/google/aA;
        //     8: astore          7
        //    10: aload           7
        //    12: ifnonnull       86
        //    15: aload_0        
        //    16: getfield        com/google/f7.l:I
        //    19: istore          10
        //    21: iload           10
        //    23: sipush          128
        //    26: iand           
        //    27: sipush          128
        //    30: if_icmpne       73
        //    33: aload_0        
        //    34: getfield        com/google/f7.f:Lcom/google/ds;
        //    37: astore          11
        //    39: invokestatic    com/google/ds.p:()Lcom/google/ds;
        //    42: astore          12
        //    44: aload           11
        //    46: aload           12
        //    48: if_acmpeq       73
        //    51: aload_0        
        //    52: aload_0        
        //    53: getfield        com/google/f7.f:Lcom/google/ds;
        //    56: invokestatic    com/google/ds.c:(Lcom/google/ds;)Lcom/google/gO;
        //    59: aload_1        
        //    60: invokevirtual   com/google/gO.a:(Lcom/google/ds;)Lcom/google/gO;
        //    63: invokevirtual   com/google/gO.a:()Lcom/google/ds;
        //    66: putfield        com/google/f7.f:Lcom/google/ds;
        //    69: iload_2        
        //    70: ifeq            78
        //    73: aload_0        
        //    74: aload_1        
        //    75: putfield        com/google/f7.f:Lcom/google/ds;
        //    78: aload_0        
        //    79: invokevirtual   com/google/f7.c:()V
        //    82: iload_2        
        //    83: ifeq            95
        //    86: aload_0        
        //    87: getfield        com/google/f7.j:Lcom/google/aA;
        //    90: aload_1        
        //    91: invokevirtual   com/google/aA.a:(Lcom/google/dS;)Lcom/google/aA;
        //    94: pop            
        //    95: aload_0        
        //    96: sipush          128
        //    99: aload_0        
        //   100: getfield        com/google/f7.l:I
        //   103: ior            
        //   104: putfield        com/google/f7.l:I
        //   107: aload_0        
        //   108: areturn        
        //   109: astore_3       
        //   110: aload_3        
        //   111: athrow         
        //   112: astore          4
        //   114: aload           4
        //   116: athrow         
        //   117: astore          5
        //   119: aload           5
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: astore          8
        //   129: aload           8
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     109    112    Ljava/lang/NullPointerException;
        //  15     21     112    117    Ljava/lang/NullPointerException;
        //  33     44     117    122    Ljava/lang/NullPointerException;
        //  51     69     122    127    Ljava/lang/NullPointerException;
        //  73     78     122    127    Ljava/lang/NullPointerException;
        //  78     82     127    132    Ljava/lang/NullPointerException;
        //  86     95     127    132    Ljava/lang/NullPointerException;
        //  110    112    112    117    Ljava/lang/NullPointerException;
        //  114    117    117    122    Ljava/lang/NullPointerException;
        //  119    122    122    127    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    public f7 a(final fm fm) {
        try {
            if (fm instanceof dC) {
                return this.a((dC)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public f7 b() {
        return g().a(this.f());
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
        return this.f();
    }
    
    @Override
    public fm buildPartial() {
        return this.f();
    }
    
    public ds c() {
        try {
            if (this.j == null) {
                return this.f;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return (ds)this.j.b();
    }
    
    @Override
    public fp clear() {
        return this.e();
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
    
    public dC d() {
        return dC.s();
    }
    
    public f7 e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/fp.clear:()Lcom/google/fp;
        //     4: pop            
        //     5: aload_0        
        //     6: ldc             ""
        //     8: putfield        com/google/f7.n:Ljava/lang/Object;
        //    11: aload_0        
        //    12: bipush          -2
        //    14: aload_0        
        //    15: getfield        com/google/f7.l:I
        //    18: iand           
        //    19: putfield        com/google/f7.l:I
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        com/google/f7.e:I
        //    27: aload_0        
        //    28: bipush          -3
        //    30: aload_0        
        //    31: getfield        com/google/f7.l:I
        //    34: iand           
        //    35: putfield        com/google/f7.l:I
        //    38: aload_0        
        //    39: getstatic       com/google/dU.LABEL_OPTIONAL:Lcom/google/dU;
        //    42: putfield        com/google/f7.g:Lcom/google/dU;
        //    45: aload_0        
        //    46: bipush          -5
        //    48: aload_0        
        //    49: getfield        com/google/f7.l:I
        //    52: iand           
        //    53: putfield        com/google/f7.l:I
        //    56: aload_0        
        //    57: getstatic       com/google/d1.TYPE_DOUBLE:Lcom/google/d1;
        //    60: putfield        com/google/f7.k:Lcom/google/d1;
        //    63: aload_0        
        //    64: bipush          -9
        //    66: aload_0        
        //    67: getfield        com/google/f7.l:I
        //    70: iand           
        //    71: putfield        com/google/f7.l:I
        //    74: aload_0        
        //    75: ldc             ""
        //    77: putfield        com/google/f7.h:Ljava/lang/Object;
        //    80: aload_0        
        //    81: bipush          -17
        //    83: aload_0        
        //    84: getfield        com/google/f7.l:I
        //    87: iand           
        //    88: putfield        com/google/f7.l:I
        //    91: aload_0        
        //    92: ldc             ""
        //    94: putfield        com/google/f7.m:Ljava/lang/Object;
        //    97: aload_0        
        //    98: bipush          -33
        //   100: aload_0        
        //   101: getfield        com/google/f7.l:I
        //   104: iand           
        //   105: putfield        com/google/f7.l:I
        //   108: aload_0        
        //   109: ldc             ""
        //   111: putfield        com/google/f7.i:Ljava/lang/Object;
        //   114: aload_0        
        //   115: bipush          -65
        //   117: aload_0        
        //   118: getfield        com/google/f7.l:I
        //   121: iand           
        //   122: putfield        com/google/f7.l:I
        //   125: aload_0        
        //   126: getfield        com/google/f7.j:Lcom/google/aA;
        //   129: astore          4
        //   131: aload           4
        //   133: ifnonnull       149
        //   136: aload_0        
        //   137: invokestatic    com/google/ds.p:()Lcom/google/ds;
        //   140: putfield        com/google/f7.f:Lcom/google/ds;
        //   143: getstatic       com/google/dt.b:Z
        //   146: ifeq            157
        //   149: aload_0        
        //   150: getfield        com/google/f7.j:Lcom/google/aA;
        //   153: invokevirtual   com/google/aA.c:()Lcom/google/aA;
        //   156: pop            
        //   157: aload_0        
        //   158: sipush          -129
        //   161: aload_0        
        //   162: getfield        com/google/f7.l:I
        //   165: iand           
        //   166: putfield        com/google/f7.l:I
        //   169: aload_0        
        //   170: areturn        
        //   171: astore_1       
        //   172: aload_1        
        //   173: athrow         
        //   174: astore_2       
        //   175: aload_2        
        //   176: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      131    171    174    Ljava/lang/NullPointerException;
        //  136    149    174    177    Ljava/lang/NullPointerException;
        //  149    157    174    177    Ljava/lang/NullPointerException;
        //  172    174    174    177    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0149:
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
    
    public dC f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: new             Lcom/google/dC;
        //     5: dup            
        //     6: aload_0        
        //     7: aconst_null    
        //     8: invokespecial   com/google/dC.<init>:(Lcom/google/fp;Lcom/google/fM;)V
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/google/f7.l:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: iconst_1       
        //    19: iand           
        //    20: iload_1        
        //    21: if_icmpne       253
        //    24: aload_2        
        //    25: aload_0        
        //    26: getfield        com/google/f7.n:Ljava/lang/Object;
        //    29: invokestatic    com/google/dC.b:(Lcom/google/dC;Ljava/lang/Object;)Ljava/lang/Object;
        //    32: pop            
        //    33: iload_3        
        //    34: iconst_2       
        //    35: iand           
        //    36: iconst_2       
        //    37: if_icmpne       44
        //    40: iload_1        
        //    41: iconst_2       
        //    42: ior            
        //    43: istore_1       
        //    44: aload_2        
        //    45: aload_0        
        //    46: getfield        com/google/f7.e:I
        //    49: invokestatic    com/google/dC.a:(Lcom/google/dC;I)I
        //    52: pop            
        //    53: iload_3        
        //    54: iconst_4       
        //    55: iand           
        //    56: iconst_4       
        //    57: if_icmpne       64
        //    60: iload_1        
        //    61: iconst_4       
        //    62: ior            
        //    63: istore_1       
        //    64: aload_2        
        //    65: aload_0        
        //    66: getfield        com/google/f7.g:Lcom/google/dU;
        //    69: invokestatic    com/google/dC.a:(Lcom/google/dC;Lcom/google/dU;)Lcom/google/dU;
        //    72: pop            
        //    73: iload_3        
        //    74: bipush          8
        //    76: iand           
        //    77: bipush          8
        //    79: if_icmpne       87
        //    82: iload_1        
        //    83: bipush          8
        //    85: ior            
        //    86: istore_1       
        //    87: aload_2        
        //    88: aload_0        
        //    89: getfield        com/google/f7.k:Lcom/google/d1;
        //    92: invokestatic    com/google/dC.a:(Lcom/google/dC;Lcom/google/d1;)Lcom/google/d1;
        //    95: pop            
        //    96: iload_3        
        //    97: bipush          16
        //    99: iand           
        //   100: bipush          16
        //   102: if_icmpne       110
        //   105: iload_1        
        //   106: bipush          16
        //   108: ior            
        //   109: istore_1       
        //   110: aload_2        
        //   111: aload_0        
        //   112: getfield        com/google/f7.h:Ljava/lang/Object;
        //   115: invokestatic    com/google/dC.a:(Lcom/google/dC;Ljava/lang/Object;)Ljava/lang/Object;
        //   118: pop            
        //   119: iload_3        
        //   120: bipush          32
        //   122: iand           
        //   123: bipush          32
        //   125: if_icmpne       133
        //   128: iload_1        
        //   129: bipush          32
        //   131: ior            
        //   132: istore_1       
        //   133: aload_2        
        //   134: aload_0        
        //   135: getfield        com/google/f7.m:Ljava/lang/Object;
        //   138: invokestatic    com/google/dC.d:(Lcom/google/dC;Ljava/lang/Object;)Ljava/lang/Object;
        //   141: pop            
        //   142: iload_3        
        //   143: bipush          64
        //   145: iand           
        //   146: bipush          64
        //   148: if_icmpne       156
        //   151: iload_1        
        //   152: bipush          64
        //   154: ior            
        //   155: istore_1       
        //   156: aload_2        
        //   157: aload_0        
        //   158: getfield        com/google/f7.i:Ljava/lang/Object;
        //   161: invokestatic    com/google/dC.c:(Lcom/google/dC;Ljava/lang/Object;)Ljava/lang/Object;
        //   164: pop            
        //   165: iload_3        
        //   166: sipush          128
        //   169: iand           
        //   170: sipush          128
        //   173: if_icmpne       247
        //   176: iload_1        
        //   177: sipush          128
        //   180: ior            
        //   181: istore          11
        //   183: aload_0        
        //   184: getfield        com/google/f7.j:Lcom/google/aA;
        //   187: astore          14
        //   189: aload           14
        //   191: ifnonnull       209
        //   194: aload_2        
        //   195: aload_0        
        //   196: getfield        com/google/f7.f:Lcom/google/ds;
        //   199: invokestatic    com/google/dC.a:(Lcom/google/dC;Lcom/google/ds;)Lcom/google/ds;
        //   202: pop            
        //   203: getstatic       com/google/dt.b:Z
        //   206: ifeq            224
        //   209: aload_2        
        //   210: aload_0        
        //   211: getfield        com/google/f7.j:Lcom/google/aA;
        //   214: invokevirtual   com/google/aA.a:()Lcom/google/dS;
        //   217: checkcast       Lcom/google/ds;
        //   220: invokestatic    com/google/dC.a:(Lcom/google/dC;Lcom/google/ds;)Lcom/google/ds;
        //   223: pop            
        //   224: aload_2        
        //   225: iload           11
        //   227: invokestatic    com/google/dC.b:(Lcom/google/dC;I)I
        //   230: pop            
        //   231: aload_0        
        //   232: invokevirtual   com/google/f7.b:()V
        //   235: aload_2        
        //   236: areturn        
        //   237: astore          12
        //   239: aload           12
        //   241: athrow         
        //   242: astore          13
        //   244: aload           13
        //   246: athrow         
        //   247: iload_1        
        //   248: istore          11
        //   250: goto            183
        //   253: iconst_0       
        //   254: istore_1       
        //   255: goto            24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  183    189    237    242    Ljava/lang/NullPointerException;
        //  194    209    242    247    Ljava/lang/NullPointerException;
        //  209    224    242    247    Ljava/lang/NullPointerException;
        //  239    242    242    247    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0209:
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
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.d();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.n();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.s().a(dC.class, f7.class);
    }
    
    @Override
    public final boolean isInitialized() {
        try {
            if (!this.j()) {
                return true;
            }
            final f7 f7 = this;
            final ds ds = f7.c();
            final boolean b = ds.isInitialized();
            if (!b) {
                return false;
            }
            return true;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final f7 f7 = this;
            final ds ds = f7.c();
            final boolean b = ds.isInitialized();
            if (!b) {
                return false;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return true;
    }
    
    public boolean j() {
        try {
            if ((this.l & 0x80) == 0x80) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    public dC k() {
        final dC f = this.f();
        try {
            if (!f.isInitialized()) {
                throw fx.a(f);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return f;
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
