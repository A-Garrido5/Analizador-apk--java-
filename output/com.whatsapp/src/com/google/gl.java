// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gl extends gq implements fa
{
    private boolean f;
    private int g;
    private cF h;
    private List i;
    private boolean j;
    private boolean k;
    private Object l;
    private boolean m;
    private b8 n;
    private boolean o;
    private Object p;
    private Object q;
    
    private gl() {
        this.l = "";
        this.q = "";
        this.h = cF.SPEED;
        this.p = "";
        this.i = Collections.emptyList();
        this.i();
    }
    
    private gl(final dg dg) {
        super(dg);
        this.l = "";
        this.q = "";
        this.h = cF.SPEED;
        this.p = "";
        this.i = Collections.emptyList();
        this.i();
    }
    
    gl(final dg dg, final fM fm) {
        this(dg);
    }
    
    static gl d() {
        return e();
    }
    
    private static gl e() {
        return new gl();
    }
    
    private b8 g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/gl.n:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       64
        //     9: aload_0        
        //    10: getfield        com/google/gl.i:Ljava/util/List;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        com/google/gl.g:I
        //    19: istore          5
        //    21: iload           5
        //    23: sipush          512
        //    26: iand           
        //    27: sipush          512
        //    30: if_icmpne       75
        //    33: iconst_1       
        //    34: istore          6
        //    36: aload_0        
        //    37: new             Lcom/google/b8;
        //    40: dup            
        //    41: aload           4
        //    43: iload           6
        //    45: aload_0        
        //    46: invokevirtual   com/google/gl.a:()Lcom/google/dg;
        //    49: aload_0        
        //    50: invokevirtual   com/google/gl.f:()Z
        //    53: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    56: putfield        com/google/gl.n:Lcom/google/b8;
        //    59: aload_0        
        //    60: aconst_null    
        //    61: putfield        com/google/gl.i:Ljava/util/List;
        //    64: aload_0        
        //    65: getfield        com/google/gl.n:Lcom/google/b8;
        //    68: areturn        
        //    69: astore_1       
        //    70: aload_1        
        //    71: athrow         
        //    72: astore_2       
        //    73: aload_2        
        //    74: athrow         
        //    75: iconst_0       
        //    76: istore          6
        //    78: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      69     72     Ljava/lang/NullPointerException;
        //  9      21     72     75     Ljava/lang/NullPointerException;
        //  70     72     72     75     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0036:
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
    
    private void i() {
        try {
            if (dS.d) {
                this.g();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void j() {
        try {
            if ((0x200 & this.g) != 0x200) {
                this.i = new ArrayList(this.i);
                this.g |= 0x200;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public dZ a() {
        final dZ h = this.h();
        try {
            if (!h.isInitialized()) {
                throw fx.a(h);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return h;
    }
    
    public dy a(final int n) {
        try {
            if (this.n == null) {
                return this.i.get(n);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return (dy)this.n.a(n);
    }
    
    public gl a(final cF h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.g |= 0x10;
        this.h = h;
        this.c();
        return this;
    }
    
    public gl a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dZ.w:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dZ;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gl.a:(Lcom/google/dZ;)Lcom/google/gl;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dZ;
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
        //    61: invokevirtual   com/google/gl.a:(Lcom/google/dZ;)Lcom/google/gl;
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
    
    public gl a(final dZ p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: invokestatic    com/google/dZ.x:()Lcom/google/dZ;
        //     7: astore          4
        //     9: aload_1        
        //    10: aload           4
        //    12: if_acmpne       20
        //    15: aload_0        
        //    16: areturn        
        //    17: astore_3       
        //    18: aload_3        
        //    19: athrow         
        //    20: aload_1        
        //    21: invokevirtual   com/google/dZ.n:()Z
        //    24: ifeq            49
        //    27: aload_0        
        //    28: iconst_1       
        //    29: aload_0        
        //    30: getfield        com/google/gl.g:I
        //    33: ior            
        //    34: putfield        com/google/gl.g:I
        //    37: aload_0        
        //    38: aload_1        
        //    39: invokestatic    com/google/dZ.d:(Lcom/google/dZ;)Ljava/lang/Object;
        //    42: putfield        com/google/gl.l:Ljava/lang/Object;
        //    45: aload_0        
        //    46: invokevirtual   com/google/gl.c:()V
        //    49: aload_1        
        //    50: invokevirtual   com/google/dZ.u:()Z
        //    53: ifeq            78
        //    56: aload_0        
        //    57: iconst_2       
        //    58: aload_0        
        //    59: getfield        com/google/gl.g:I
        //    62: ior            
        //    63: putfield        com/google/gl.g:I
        //    66: aload_0        
        //    67: aload_1        
        //    68: invokestatic    com/google/dZ.c:(Lcom/google/dZ;)Ljava/lang/Object;
        //    71: putfield        com/google/gl.q:Ljava/lang/Object;
        //    74: aload_0        
        //    75: invokevirtual   com/google/gl.c:()V
        //    78: aload_1        
        //    79: invokevirtual   com/google/dZ.l:()Z
        //    82: ifeq            94
        //    85: aload_0        
        //    86: aload_1        
        //    87: invokevirtual   com/google/dZ.g:()Z
        //    90: invokevirtual   com/google/gl.a:(Z)Lcom/google/gl;
        //    93: pop            
        //    94: aload_1        
        //    95: invokevirtual   com/google/dZ.i:()Z
        //    98: ifeq            110
        //   101: aload_0        
        //   102: aload_1        
        //   103: invokevirtual   com/google/dZ.q:()Z
        //   106: invokevirtual   com/google/gl.d:(Z)Lcom/google/gl;
        //   109: pop            
        //   110: aload_1        
        //   111: invokevirtual   com/google/dZ.B:()Z
        //   114: ifeq            126
        //   117: aload_0        
        //   118: aload_1        
        //   119: invokevirtual   com/google/dZ.k:()Lcom/google/cF;
        //   122: invokevirtual   com/google/gl.a:(Lcom/google/cF;)Lcom/google/gl;
        //   125: pop            
        //   126: aload_1        
        //   127: invokevirtual   com/google/dZ.a:()Z
        //   130: ifeq            156
        //   133: aload_0        
        //   134: bipush          32
        //   136: aload_0        
        //   137: getfield        com/google/gl.g:I
        //   140: ior            
        //   141: putfield        com/google/gl.g:I
        //   144: aload_0        
        //   145: aload_1        
        //   146: invokestatic    com/google/dZ.e:(Lcom/google/dZ;)Ljava/lang/Object;
        //   149: putfield        com/google/gl.p:Ljava/lang/Object;
        //   152: aload_0        
        //   153: invokevirtual   com/google/gl.c:()V
        //   156: aload_1        
        //   157: invokevirtual   com/google/dZ.v:()Z
        //   160: ifeq            172
        //   163: aload_0        
        //   164: aload_1        
        //   165: invokevirtual   com/google/dZ.f:()Z
        //   168: invokevirtual   com/google/gl.b:(Z)Lcom/google/gl;
        //   171: pop            
        //   172: aload_1        
        //   173: invokevirtual   com/google/dZ.C:()Z
        //   176: ifeq            188
        //   179: aload_0        
        //   180: aload_1        
        //   181: invokevirtual   com/google/dZ.h:()Z
        //   184: invokevirtual   com/google/gl.e:(Z)Lcom/google/gl;
        //   187: pop            
        //   188: aload_1        
        //   189: invokevirtual   com/google/dZ.A:()Z
        //   192: ifeq            204
        //   195: aload_0        
        //   196: aload_1        
        //   197: invokevirtual   com/google/dZ.o:()Z
        //   200: invokevirtual   com/google/gl.c:(Z)Lcom/google/gl;
        //   203: pop            
        //   204: aload_0        
        //   205: getfield        com/google/gl.n:Lcom/google/b8;
        //   208: astore          18
        //   210: aload           18
        //   212: ifnonnull       297
        //   215: aload_1        
        //   216: invokestatic    com/google/dZ.a:(Lcom/google/dZ;)Ljava/util/List;
        //   219: invokeinterface java/util/List.isEmpty:()Z
        //   224: istore          30
        //   226: iload           30
        //   228: ifne            404
        //   231: aload_0        
        //   232: getfield        com/google/gl.i:Ljava/util/List;
        //   235: invokeinterface java/util/List.isEmpty:()Z
        //   240: istore          31
        //   242: iload           31
        //   244: ifeq            271
        //   247: aload_0        
        //   248: aload_1        
        //   249: invokestatic    com/google/dZ.a:(Lcom/google/dZ;)Ljava/util/List;
        //   252: putfield        com/google/gl.i:Ljava/util/List;
        //   255: aload_0        
        //   256: sipush          -513
        //   259: aload_0        
        //   260: getfield        com/google/gl.g:I
        //   263: iand           
        //   264: putfield        com/google/gl.g:I
        //   267: iload_2        
        //   268: ifeq            289
        //   271: aload_0        
        //   272: invokespecial   com/google/gl.j:()V
        //   275: aload_0        
        //   276: getfield        com/google/gl.i:Ljava/util/List;
        //   279: aload_1        
        //   280: invokestatic    com/google/dZ.a:(Lcom/google/dZ;)Ljava/util/List;
        //   283: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   288: pop            
        //   289: aload_0        
        //   290: invokevirtual   com/google/gl.c:()V
        //   293: iload_2        
        //   294: ifeq            404
        //   297: aload_1        
        //   298: invokestatic    com/google/dZ.a:(Lcom/google/dZ;)Ljava/util/List;
        //   301: invokeinterface java/util/List.isEmpty:()Z
        //   306: istore          22
        //   308: iload           22
        //   310: ifne            404
        //   313: aload_0        
        //   314: getfield        com/google/gl.n:Lcom/google/b8;
        //   317: invokevirtual   com/google/b8.d:()Z
        //   320: istore          24
        //   322: iload           24
        //   324: ifeq            392
        //   327: aload_0        
        //   328: getfield        com/google/gl.n:Lcom/google/b8;
        //   331: invokevirtual   com/google/b8.f:()V
        //   334: aload_0        
        //   335: aconst_null    
        //   336: putfield        com/google/gl.n:Lcom/google/b8;
        //   339: aload_0        
        //   340: aload_1        
        //   341: invokestatic    com/google/dZ.a:(Lcom/google/dZ;)Ljava/util/List;
        //   344: putfield        com/google/gl.i:Ljava/util/List;
        //   347: aload_0        
        //   348: sipush          -513
        //   351: aload_0        
        //   352: getfield        com/google/gl.g:I
        //   355: iand           
        //   356: putfield        com/google/gl.g:I
        //   359: getstatic       com/google/dS.d:Z
        //   362: istore          27
        //   364: aconst_null    
        //   365: astore          28
        //   367: iload           27
        //   369: ifeq            382
        //   372: aload_0        
        //   373: invokespecial   com/google/gl.g:()Lcom/google/b8;
        //   376: astore          29
        //   378: aload           29
        //   380: astore          28
        //   382: aload_0        
        //   383: aload           28
        //   385: putfield        com/google/gl.n:Lcom/google/b8;
        //   388: iload_2        
        //   389: ifeq            404
        //   392: aload_0        
        //   393: getfield        com/google/gl.n:Lcom/google/b8;
        //   396: aload_1        
        //   397: invokestatic    com/google/dZ.a:(Lcom/google/dZ;)Ljava/util/List;
        //   400: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   403: pop            
        //   404: aload_0        
        //   405: aload_1        
        //   406: invokevirtual   com/google/gl.a:(Lcom/google/df;)V
        //   409: aload_0        
        //   410: aload_1        
        //   411: invokevirtual   com/google/dZ.getUnknownFields:()Lcom/google/ce;
        //   414: invokevirtual   com/google/gl.b:(Lcom/google/ce;)Lcom/google/fp;
        //   417: pop            
        //   418: aload_0        
        //   419: areturn        
        //   420: astore          5
        //   422: aload           5
        //   424: athrow         
        //   425: astore          6
        //   427: aload           6
        //   429: athrow         
        //   430: astore          7
        //   432: aload           7
        //   434: athrow         
        //   435: astore          8
        //   437: aload           8
        //   439: athrow         
        //   440: astore          9
        //   442: aload           9
        //   444: athrow         
        //   445: astore          10
        //   447: aload           10
        //   449: athrow         
        //   450: astore          11
        //   452: aload           11
        //   454: athrow         
        //   455: astore          12
        //   457: aload           12
        //   459: athrow         
        //   460: astore          13
        //   462: aload           13
        //   464: athrow         
        //   465: astore          14
        //   467: aload           14
        //   469: athrow         
        //   470: astore          15
        //   472: aload           15
        //   474: athrow         
        //   475: astore          16
        //   477: aload           16
        //   479: athrow         
        //   480: astore          17
        //   482: aload           17
        //   484: athrow         
        //   485: astore          33
        //   487: aload           33
        //   489: athrow         
        //   490: astore          19
        //   492: aload           19
        //   494: athrow         
        //   495: astore          20
        //   497: aload           20
        //   499: athrow         
        //   500: astore          21
        //   502: aload           21
        //   504: athrow         
        //   505: astore          25
        //   507: aload           25
        //   509: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     49     420    425    Ljava/lang/NullPointerException;
        //  49     78     425    430    Ljava/lang/NullPointerException;
        //  78     94     430    435    Ljava/lang/NullPointerException;
        //  94     110    435    440    Ljava/lang/NullPointerException;
        //  110    126    440    445    Ljava/lang/NullPointerException;
        //  126    156    445    450    Ljava/lang/NullPointerException;
        //  156    172    450    455    Ljava/lang/NullPointerException;
        //  172    188    455    460    Ljava/lang/NullPointerException;
        //  188    204    460    465    Ljava/lang/NullPointerException;
        //  204    210    465    470    Ljava/lang/NullPointerException;
        //  215    226    470    475    Ljava/lang/NullPointerException;
        //  231    242    475    480    Ljava/lang/NullPointerException;
        //  247    267    480    485    Ljava/lang/NullPointerException;
        //  271    289    480    485    Ljava/lang/NullPointerException;
        //  289    293    485    490    Ljava/lang/NullPointerException;
        //  297    308    490    495    Ljava/lang/NullPointerException;
        //  313    322    495    500    Ljava/lang/NullPointerException;
        //  327    364    500    505    Ljava/lang/NullPointerException;
        //  372    378    500    505    Ljava/lang/NullPointerException;
        //  382    388    505    510    Ljava/lang/NullPointerException;
        //  392    404    505    510    Ljava/lang/NullPointerException;
        //  467    470    470    475    Ljava/lang/NullPointerException;
        //  472    475    475    480    Ljava/lang/NullPointerException;
        //  477    480    480    485    Ljava/lang/NullPointerException;
        //  487    490    490    495    Ljava/lang/NullPointerException;
        //  492    495    495    500    Ljava/lang/NullPointerException;
        //  497    500    500    505    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 260, Size: 260
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
    
    public gl a(final fm fm) {
        try {
            if (fm instanceof dZ) {
                return this.a((dZ)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public gl a(final boolean o) {
        this.g |= 0x4;
        this.o = o;
        this.c();
        return this;
    }
    
    @Override
    public gl b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/gq.b:()Lcom/google/gq;
        //     4: pop            
        //     5: aload_0        
        //     6: ldc             ""
        //     8: putfield        com/google/gl.l:Ljava/lang/Object;
        //    11: aload_0        
        //    12: bipush          -2
        //    14: aload_0        
        //    15: getfield        com/google/gl.g:I
        //    18: iand           
        //    19: putfield        com/google/gl.g:I
        //    22: aload_0        
        //    23: ldc             ""
        //    25: putfield        com/google/gl.q:Ljava/lang/Object;
        //    28: aload_0        
        //    29: bipush          -3
        //    31: aload_0        
        //    32: getfield        com/google/gl.g:I
        //    35: iand           
        //    36: putfield        com/google/gl.g:I
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        com/google/gl.o:Z
        //    44: aload_0        
        //    45: bipush          -5
        //    47: aload_0        
        //    48: getfield        com/google/gl.g:I
        //    51: iand           
        //    52: putfield        com/google/gl.g:I
        //    55: aload_0        
        //    56: iconst_0       
        //    57: putfield        com/google/gl.f:Z
        //    60: aload_0        
        //    61: bipush          -9
        //    63: aload_0        
        //    64: getfield        com/google/gl.g:I
        //    67: iand           
        //    68: putfield        com/google/gl.g:I
        //    71: aload_0        
        //    72: getstatic       com/google/cF.SPEED:Lcom/google/cF;
        //    75: putfield        com/google/gl.h:Lcom/google/cF;
        //    78: aload_0        
        //    79: bipush          -17
        //    81: aload_0        
        //    82: getfield        com/google/gl.g:I
        //    85: iand           
        //    86: putfield        com/google/gl.g:I
        //    89: aload_0        
        //    90: ldc             ""
        //    92: putfield        com/google/gl.p:Ljava/lang/Object;
        //    95: aload_0        
        //    96: bipush          -33
        //    98: aload_0        
        //    99: getfield        com/google/gl.g:I
        //   102: iand           
        //   103: putfield        com/google/gl.g:I
        //   106: aload_0        
        //   107: iconst_0       
        //   108: putfield        com/google/gl.k:Z
        //   111: aload_0        
        //   112: bipush          -65
        //   114: aload_0        
        //   115: getfield        com/google/gl.g:I
        //   118: iand           
        //   119: putfield        com/google/gl.g:I
        //   122: aload_0        
        //   123: iconst_0       
        //   124: putfield        com/google/gl.m:Z
        //   127: aload_0        
        //   128: sipush          -129
        //   131: aload_0        
        //   132: getfield        com/google/gl.g:I
        //   135: iand           
        //   136: putfield        com/google/gl.g:I
        //   139: aload_0        
        //   140: iconst_0       
        //   141: putfield        com/google/gl.j:Z
        //   144: aload_0        
        //   145: sipush          -257
        //   148: aload_0        
        //   149: getfield        com/google/gl.g:I
        //   152: iand           
        //   153: putfield        com/google/gl.g:I
        //   156: aload_0        
        //   157: getfield        com/google/gl.n:Lcom/google/b8;
        //   160: astore          4
        //   162: aload           4
        //   164: ifnonnull       192
        //   167: aload_0        
        //   168: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   171: putfield        com/google/gl.i:Ljava/util/List;
        //   174: aload_0        
        //   175: sipush          -513
        //   178: aload_0        
        //   179: getfield        com/google/gl.g:I
        //   182: iand           
        //   183: putfield        com/google/gl.g:I
        //   186: getstatic       com/google/dt.b:Z
        //   189: ifeq            207
        //   192: aload_0        
        //   193: getfield        com/google/gl.n:Lcom/google/b8;
        //   196: invokevirtual   com/google/b8.c:()V
        //   199: aload_0        
        //   200: areturn        
        //   201: astore_1       
        //   202: aload_1        
        //   203: athrow         
        //   204: astore_2       
        //   205: aload_2        
        //   206: athrow         
        //   207: aload_0        
        //   208: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      162    201    204    Ljava/lang/NullPointerException;
        //  167    192    204    207    Ljava/lang/NullPointerException;
        //  192    199    204    207    Ljava/lang/NullPointerException;
        //  202    204    204    207    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0192:
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
    
    public gl b(final boolean k) {
        this.g |= 0x40;
        this.k = k;
        this.c();
        return this;
    }
    
    @Override
    public gq b() {
        return this.b();
    }
    
    @Override
    public ci build() {
        return this.a();
    }
    
    @Override
    public fm build() {
        return this.a();
    }
    
    @Override
    public ci buildPartial() {
        return this.h();
    }
    
    @Override
    public fm buildPartial() {
        return this.h();
    }
    
    public int c() {
        try {
            if (this.n == null) {
                return this.i.size();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.n.a();
    }
    
    public gl c(final boolean j) {
        this.g |= 0x100;
        this.j = j;
        this.c();
        return this;
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
    
    public gl d(final boolean f) {
        this.g |= 0x8;
        this.f = f;
        this.c();
        return this;
    }
    
    public gl e(final boolean m) {
        this.g |= 0x80;
        this.m = m;
        this.c();
        return this;
    }
    
    public dZ f() {
        return dZ.x();
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
        return hM.y();
    }
    
    public dZ h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: new             Lcom/google/dZ;
        //     5: dup            
        //     6: aload_0        
        //     7: aconst_null    
        //     8: invokespecial   com/google/dZ.<init>:(Lcom/google/gq;Lcom/google/fM;)V
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/google/gl.g:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: iconst_1       
        //    19: iand           
        //    20: iload_1        
        //    21: if_icmpne       319
        //    24: aload_2        
        //    25: aload_0        
        //    26: getfield        com/google/gl.l:Ljava/lang/Object;
        //    29: invokestatic    com/google/dZ.c:(Lcom/google/dZ;Ljava/lang/Object;)Ljava/lang/Object;
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
        //    46: getfield        com/google/gl.q:Ljava/lang/Object;
        //    49: invokestatic    com/google/dZ.a:(Lcom/google/dZ;Ljava/lang/Object;)Ljava/lang/Object;
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
        //    66: getfield        com/google/gl.o:Z
        //    69: invokestatic    com/google/dZ.a:(Lcom/google/dZ;Z)Z
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
        //    89: getfield        com/google/gl.f:Z
        //    92: invokestatic    com/google/dZ.c:(Lcom/google/dZ;Z)Z
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
        //   112: getfield        com/google/gl.h:Lcom/google/cF;
        //   115: invokestatic    com/google/dZ.a:(Lcom/google/dZ;Lcom/google/cF;)Lcom/google/cF;
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
        //   135: getfield        com/google/gl.p:Ljava/lang/Object;
        //   138: invokestatic    com/google/dZ.b:(Lcom/google/dZ;Ljava/lang/Object;)Ljava/lang/Object;
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
        //   158: getfield        com/google/gl.k:Z
        //   161: invokestatic    com/google/dZ.d:(Lcom/google/dZ;Z)Z
        //   164: pop            
        //   165: iload_3        
        //   166: sipush          128
        //   169: iand           
        //   170: sipush          128
        //   173: if_icmpne       182
        //   176: iload_1        
        //   177: sipush          128
        //   180: ior            
        //   181: istore_1       
        //   182: aload_2        
        //   183: aload_0        
        //   184: getfield        com/google/gl.m:Z
        //   187: invokestatic    com/google/dZ.e:(Lcom/google/dZ;Z)Z
        //   190: pop            
        //   191: iload_3        
        //   192: sipush          256
        //   195: iand           
        //   196: sipush          256
        //   199: if_icmpne       208
        //   202: iload_1        
        //   203: sipush          256
        //   206: ior            
        //   207: istore_1       
        //   208: aload_2        
        //   209: aload_0        
        //   210: getfield        com/google/gl.j:Z
        //   213: invokestatic    com/google/dZ.b:(Lcom/google/dZ;Z)Z
        //   216: pop            
        //   217: aload_0        
        //   218: getfield        com/google/gl.n:Lcom/google/b8;
        //   221: astore          15
        //   223: aload           15
        //   225: ifnonnull       280
        //   228: sipush          512
        //   231: aload_0        
        //   232: getfield        com/google/gl.g:I
        //   235: iand           
        //   236: sipush          512
        //   239: if_icmpne       265
        //   242: aload_0        
        //   243: aload_0        
        //   244: getfield        com/google/gl.i:Ljava/util/List;
        //   247: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   250: putfield        com/google/gl.i:Ljava/util/List;
        //   253: aload_0        
        //   254: sipush          -513
        //   257: aload_0        
        //   258: getfield        com/google/gl.g:I
        //   261: iand           
        //   262: putfield        com/google/gl.g:I
        //   265: aload_2        
        //   266: aload_0        
        //   267: getfield        com/google/gl.i:Ljava/util/List;
        //   270: invokestatic    com/google/dZ.a:(Lcom/google/dZ;Ljava/util/List;)Ljava/util/List;
        //   273: pop            
        //   274: getstatic       com/google/dt.b:Z
        //   277: ifeq            292
        //   280: aload_2        
        //   281: aload_0        
        //   282: getfield        com/google/gl.n:Lcom/google/b8;
        //   285: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //   288: invokestatic    com/google/dZ.a:(Lcom/google/dZ;Ljava/util/List;)Ljava/util/List;
        //   291: pop            
        //   292: aload_2        
        //   293: iload_1        
        //   294: invokestatic    com/google/dZ.a:(Lcom/google/dZ;I)I
        //   297: pop            
        //   298: aload_0        
        //   299: invokevirtual   com/google/gl.b:()V
        //   302: aload_2        
        //   303: areturn        
        //   304: astore          12
        //   306: aload           12
        //   308: athrow         
        //   309: astore          13
        //   311: aload           13
        //   313: athrow         
        //   314: astore          16
        //   316: aload           16
        //   318: athrow         
        //   319: iconst_0       
        //   320: istore_1       
        //   321: goto            24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  208    223    304    309    Ljava/lang/NullPointerException;
        //  228    265    309    314    Ljava/lang/NullPointerException;
        //  265    280    314    319    Ljava/lang/NullPointerException;
        //  280    292    314    319    Ljava/lang/NullPointerException;
        //  306    309    309    314    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 188, Size: 188
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
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.a().a(dZ.class, gl.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int n = 0;
        while (true) {
            Label_0043: {
                if (n >= this.c()) {
                    break Label_0043;
                }
                try {
                    if (!this.a(n).isInitialized()) {
                        return false;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                ++n;
                if (!b) {
                    continue;
                }
                try {
                    if (this.e()) {
                        return true;
                    }
                    return false;
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    public gl k() {
        return e().a(this.h());
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
