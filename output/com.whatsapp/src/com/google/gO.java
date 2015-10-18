// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gO extends gq implements c
{
    private List f;
    private bb g;
    private b8 h;
    private Object i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    
    private gO() {
        this.g = bb.STRING;
        this.i = "";
        this.f = Collections.emptyList();
        this.d();
    }
    
    private gO(final dg dg) {
        super(dg);
        this.g = bb.STRING;
        this.i = "";
        this.f = Collections.emptyList();
        this.d();
    }
    
    gO(final dg dg, final fM fm) {
        this(dg);
    }
    
    private b8 b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/gO.h:Lcom/google/b8;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       62
        //     9: aload_0        
        //    10: getfield        com/google/gO.f:Ljava/util/List;
        //    13: astore          4
        //    15: aload_0        
        //    16: getfield        com/google/gO.n:I
        //    19: istore          5
        //    21: iload           5
        //    23: bipush          64
        //    25: iand           
        //    26: bipush          64
        //    28: if_icmpne       73
        //    31: iconst_1       
        //    32: istore          6
        //    34: aload_0        
        //    35: new             Lcom/google/b8;
        //    38: dup            
        //    39: aload           4
        //    41: iload           6
        //    43: aload_0        
        //    44: invokevirtual   com/google/gO.a:()Lcom/google/dg;
        //    47: aload_0        
        //    48: invokevirtual   com/google/gO.f:()Z
        //    51: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    54: putfield        com/google/gO.h:Lcom/google/b8;
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        com/google/gO.f:Ljava/util/List;
        //    62: aload_0        
        //    63: getfield        com/google/gO.h:Lcom/google/b8;
        //    66: areturn        
        //    67: astore_1       
        //    68: aload_1        
        //    69: athrow         
        //    70: astore_2       
        //    71: aload_2        
        //    72: athrow         
        //    73: iconst_0       
        //    74: istore          6
        //    76: goto            34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      5      67     70     Ljava/lang/NullPointerException;
        //  9      21     70     73     Ljava/lang/NullPointerException;
        //  68     70     70     73     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    private static gO c() {
        return new gO();
    }
    
    private void d() {
        try {
            if (dS.d) {
                this.b();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void f() {
        try {
            if ((0x40 & this.n) != 0x40) {
                this.f = new ArrayList(this.f);
                this.n |= 0x40;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static gO g() {
        return c();
    }
    
    public ds a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: new             Lcom/google/ds;
        //     5: dup            
        //     6: aload_0        
        //     7: aconst_null    
        //     8: invokespecial   com/google/ds.<init>:(Lcom/google/gq;Lcom/google/fM;)V
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/google/gO.n:I
        //    16: istore_3       
        //    17: iload_3        
        //    18: iconst_1       
        //    19: iand           
        //    20: iload_1        
        //    21: if_icmpne       241
        //    24: aload_2        
        //    25: aload_0        
        //    26: getfield        com/google/gO.g:Lcom/google/bb;
        //    29: invokestatic    com/google/ds.a:(Lcom/google/ds;Lcom/google/bb;)Lcom/google/bb;
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
        //    46: getfield        com/google/gO.k:Z
        //    49: invokestatic    com/google/ds.c:(Lcom/google/ds;Z)Z
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
        //    66: getfield        com/google/gO.j:Z
        //    69: invokestatic    com/google/ds.a:(Lcom/google/ds;Z)Z
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
        //    89: getfield        com/google/gO.l:Z
        //    92: invokestatic    com/google/ds.b:(Lcom/google/ds;Z)Z
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
        //   112: getfield        com/google/gO.i:Ljava/lang/Object;
        //   115: invokestatic    com/google/ds.a:(Lcom/google/ds;Ljava/lang/Object;)Ljava/lang/Object;
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
        //   135: getfield        com/google/gO.m:Z
        //   138: invokestatic    com/google/ds.d:(Lcom/google/ds;Z)Z
        //   141: pop            
        //   142: aload_0        
        //   143: getfield        com/google/gO.h:Lcom/google/b8;
        //   146: astore          12
        //   148: aload           12
        //   150: ifnonnull       202
        //   153: bipush          64
        //   155: aload_0        
        //   156: getfield        com/google/gO.n:I
        //   159: iand           
        //   160: bipush          64
        //   162: if_icmpne       187
        //   165: aload_0        
        //   166: aload_0        
        //   167: getfield        com/google/gO.f:Ljava/util/List;
        //   170: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //   173: putfield        com/google/gO.f:Ljava/util/List;
        //   176: aload_0        
        //   177: bipush          -65
        //   179: aload_0        
        //   180: getfield        com/google/gO.n:I
        //   183: iand           
        //   184: putfield        com/google/gO.n:I
        //   187: aload_2        
        //   188: aload_0        
        //   189: getfield        com/google/gO.f:Ljava/util/List;
        //   192: invokestatic    com/google/ds.a:(Lcom/google/ds;Ljava/util/List;)Ljava/util/List;
        //   195: pop            
        //   196: getstatic       com/google/dt.b:Z
        //   199: ifeq            214
        //   202: aload_2        
        //   203: aload_0        
        //   204: getfield        com/google/gO.h:Lcom/google/b8;
        //   207: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //   210: invokestatic    com/google/ds.a:(Lcom/google/ds;Ljava/util/List;)Ljava/util/List;
        //   213: pop            
        //   214: aload_2        
        //   215: iload_1        
        //   216: invokestatic    com/google/ds.a:(Lcom/google/ds;I)I
        //   219: pop            
        //   220: aload_0        
        //   221: invokevirtual   com/google/gO.b:()V
        //   224: aload_2        
        //   225: areturn        
        //   226: astore          9
        //   228: aload           9
        //   230: athrow         
        //   231: astore          10
        //   233: aload           10
        //   235: athrow         
        //   236: astore          13
        //   238: aload           13
        //   240: athrow         
        //   241: iconst_0       
        //   242: istore_1       
        //   243: goto            24
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  133    148    226    231    Ljava/lang/NullPointerException;
        //  153    187    231    236    Ljava/lang/NullPointerException;
        //  187    202    236    241    Ljava/lang/NullPointerException;
        //  202    214    236    241    Ljava/lang/NullPointerException;
        //  228    231    231    236    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 146, Size: 146
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
    
    public dy a(final int n) {
        try {
            if (this.h == null) {
                return this.f.get(n);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return (dy)this.h.a(n);
    }
    
    public gO a(final bb g) {
        if (g == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.n |= 0x1;
        this.g = g;
        this.c();
        return this;
    }
    
    public gO a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ds.t:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/ds;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gO.a:(Lcom/google/ds;)Lcom/google/gO;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/ds;
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
        //    61: invokevirtual   com/google/gO.a:(Lcom/google/ds;)Lcom/google/gO;
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
    
    public gO a(final ds p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: invokestatic    com/google/ds.p:()Lcom/google/ds;
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
        //    21: invokevirtual   com/google/ds.w:()Z
        //    24: ifeq            36
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokevirtual   com/google/ds.c:()Lcom/google/bb;
        //    32: invokevirtual   com/google/gO.a:(Lcom/google/bb;)Lcom/google/gO;
        //    35: pop            
        //    36: aload_1        
        //    37: invokevirtual   com/google/ds.f:()Z
        //    40: ifeq            52
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokevirtual   com/google/ds.m:()Z
        //    48: invokevirtual   com/google/gO.d:(Z)Lcom/google/gO;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   com/google/ds.t:()Z
        //    56: ifeq            68
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokevirtual   com/google/ds.k:()Z
        //    64: invokevirtual   com/google/gO.b:(Z)Lcom/google/gO;
        //    67: pop            
        //    68: aload_1        
        //    69: invokevirtual   com/google/ds.q:()Z
        //    72: ifeq            84
        //    75: aload_0        
        //    76: aload_1        
        //    77: invokevirtual   com/google/ds.l:()Z
        //    80: invokevirtual   com/google/gO.a:(Z)Lcom/google/gO;
        //    83: pop            
        //    84: aload_1        
        //    85: invokevirtual   com/google/ds.h:()Z
        //    88: ifeq            114
        //    91: aload_0        
        //    92: bipush          16
        //    94: aload_0        
        //    95: getfield        com/google/gO.n:I
        //    98: ior            
        //    99: putfield        com/google/gO.n:I
        //   102: aload_0        
        //   103: aload_1        
        //   104: invokestatic    com/google/ds.a:(Lcom/google/ds;)Ljava/lang/Object;
        //   107: putfield        com/google/gO.i:Ljava/lang/Object;
        //   110: aload_0        
        //   111: invokevirtual   com/google/gO.c:()V
        //   114: aload_1        
        //   115: invokevirtual   com/google/ds.v:()Z
        //   118: ifeq            130
        //   121: aload_0        
        //   122: aload_1        
        //   123: invokevirtual   com/google/ds.n:()Z
        //   126: invokevirtual   com/google/gO.c:(Z)Lcom/google/gO;
        //   129: pop            
        //   130: aload_0        
        //   131: getfield        com/google/gO.h:Lcom/google/b8;
        //   134: astore          15
        //   136: aload           15
        //   138: ifnonnull       222
        //   141: aload_1        
        //   142: invokestatic    com/google/ds.b:(Lcom/google/ds;)Ljava/util/List;
        //   145: invokeinterface java/util/List.isEmpty:()Z
        //   150: istore          27
        //   152: iload           27
        //   154: ifne            328
        //   157: aload_0        
        //   158: getfield        com/google/gO.f:Ljava/util/List;
        //   161: invokeinterface java/util/List.isEmpty:()Z
        //   166: istore          28
        //   168: iload           28
        //   170: ifeq            196
        //   173: aload_0        
        //   174: aload_1        
        //   175: invokestatic    com/google/ds.b:(Lcom/google/ds;)Ljava/util/List;
        //   178: putfield        com/google/gO.f:Ljava/util/List;
        //   181: aload_0        
        //   182: bipush          -65
        //   184: aload_0        
        //   185: getfield        com/google/gO.n:I
        //   188: iand           
        //   189: putfield        com/google/gO.n:I
        //   192: iload_2        
        //   193: ifeq            214
        //   196: aload_0        
        //   197: invokespecial   com/google/gO.f:()V
        //   200: aload_0        
        //   201: getfield        com/google/gO.f:Ljava/util/List;
        //   204: aload_1        
        //   205: invokestatic    com/google/ds.b:(Lcom/google/ds;)Ljava/util/List;
        //   208: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   213: pop            
        //   214: aload_0        
        //   215: invokevirtual   com/google/gO.c:()V
        //   218: iload_2        
        //   219: ifeq            328
        //   222: aload_1        
        //   223: invokestatic    com/google/ds.b:(Lcom/google/ds;)Ljava/util/List;
        //   226: invokeinterface java/util/List.isEmpty:()Z
        //   231: istore          19
        //   233: iload           19
        //   235: ifne            328
        //   238: aload_0        
        //   239: getfield        com/google/gO.h:Lcom/google/b8;
        //   242: invokevirtual   com/google/b8.d:()Z
        //   245: istore          21
        //   247: iload           21
        //   249: ifeq            316
        //   252: aload_0        
        //   253: getfield        com/google/gO.h:Lcom/google/b8;
        //   256: invokevirtual   com/google/b8.f:()V
        //   259: aload_0        
        //   260: aconst_null    
        //   261: putfield        com/google/gO.h:Lcom/google/b8;
        //   264: aload_0        
        //   265: aload_1        
        //   266: invokestatic    com/google/ds.b:(Lcom/google/ds;)Ljava/util/List;
        //   269: putfield        com/google/gO.f:Ljava/util/List;
        //   272: aload_0        
        //   273: bipush          -65
        //   275: aload_0        
        //   276: getfield        com/google/gO.n:I
        //   279: iand           
        //   280: putfield        com/google/gO.n:I
        //   283: getstatic       com/google/dS.d:Z
        //   286: istore          24
        //   288: aconst_null    
        //   289: astore          25
        //   291: iload           24
        //   293: ifeq            306
        //   296: aload_0        
        //   297: invokespecial   com/google/gO.b:()Lcom/google/b8;
        //   300: astore          26
        //   302: aload           26
        //   304: astore          25
        //   306: aload_0        
        //   307: aload           25
        //   309: putfield        com/google/gO.h:Lcom/google/b8;
        //   312: iload_2        
        //   313: ifeq            328
        //   316: aload_0        
        //   317: getfield        com/google/gO.h:Lcom/google/b8;
        //   320: aload_1        
        //   321: invokestatic    com/google/ds.b:(Lcom/google/ds;)Ljava/util/List;
        //   324: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   327: pop            
        //   328: aload_0        
        //   329: aload_1        
        //   330: invokevirtual   com/google/gO.a:(Lcom/google/df;)V
        //   333: aload_0        
        //   334: aload_1        
        //   335: invokevirtual   com/google/ds.getUnknownFields:()Lcom/google/ce;
        //   338: invokevirtual   com/google/gO.b:(Lcom/google/ce;)Lcom/google/fp;
        //   341: pop            
        //   342: aload_0        
        //   343: areturn        
        //   344: astore          5
        //   346: aload           5
        //   348: athrow         
        //   349: astore          6
        //   351: aload           6
        //   353: athrow         
        //   354: astore          7
        //   356: aload           7
        //   358: athrow         
        //   359: astore          8
        //   361: aload           8
        //   363: athrow         
        //   364: astore          9
        //   366: aload           9
        //   368: athrow         
        //   369: astore          10
        //   371: aload           10
        //   373: athrow         
        //   374: astore          11
        //   376: aload           11
        //   378: athrow         
        //   379: astore          12
        //   381: aload           12
        //   383: athrow         
        //   384: astore          13
        //   386: aload           13
        //   388: athrow         
        //   389: astore          14
        //   391: aload           14
        //   393: athrow         
        //   394: astore          30
        //   396: aload           30
        //   398: athrow         
        //   399: astore          16
        //   401: aload           16
        //   403: athrow         
        //   404: astore          17
        //   406: aload           17
        //   408: athrow         
        //   409: astore          18
        //   411: aload           18
        //   413: athrow         
        //   414: astore          22
        //   416: aload           22
        //   418: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     36     344    349    Ljava/lang/NullPointerException;
        //  36     52     349    354    Ljava/lang/NullPointerException;
        //  52     68     354    359    Ljava/lang/NullPointerException;
        //  68     84     359    364    Ljava/lang/NullPointerException;
        //  84     114    364    369    Ljava/lang/NullPointerException;
        //  114    130    369    374    Ljava/lang/NullPointerException;
        //  130    136    374    379    Ljava/lang/NullPointerException;
        //  141    152    379    384    Ljava/lang/NullPointerException;
        //  157    168    384    389    Ljava/lang/NullPointerException;
        //  173    192    389    394    Ljava/lang/NullPointerException;
        //  196    214    389    394    Ljava/lang/NullPointerException;
        //  214    218    394    399    Ljava/lang/NullPointerException;
        //  222    233    399    404    Ljava/lang/NullPointerException;
        //  238    247    404    409    Ljava/lang/NullPointerException;
        //  252    288    409    414    Ljava/lang/NullPointerException;
        //  296    302    409    414    Ljava/lang/NullPointerException;
        //  306    312    414    419    Ljava/lang/NullPointerException;
        //  316    328    414    419    Ljava/lang/NullPointerException;
        //  376    379    379    384    Ljava/lang/NullPointerException;
        //  381    384    384    389    Ljava/lang/NullPointerException;
        //  386    389    389    394    Ljava/lang/NullPointerException;
        //  396    399    399    404    Ljava/lang/NullPointerException;
        //  401    404    404    409    Ljava/lang/NullPointerException;
        //  406    409    409    414    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 213, Size: 213
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
    
    public gO a(final fm fm) {
        try {
            if (fm instanceof ds) {
                return this.a((ds)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public gO a(final boolean l) {
        this.n |= 0x8;
        this.l = l;
        this.c();
        return this;
    }
    
    public gO b(final boolean j) {
        this.n |= 0x4;
        this.j = j;
        this.c();
        return this;
    }
    
    @Override
    public gq b() {
        return this.j();
    }
    
    @Override
    public ci build() {
        return this.h();
    }
    
    @Override
    public fm build() {
        return this.h();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    @Override
    public fm buildPartial() {
        return this.a();
    }
    
    public gO c(final boolean m) {
        this.n |= 0x20;
        this.m = m;
        this.c();
        return this;
    }
    
    @Override
    public gq c() {
        return this.i();
    }
    
    @Override
    public fp clear() {
        return this.j();
    }
    
    @Override
    public fE clone() {
        return this.i();
    }
    
    @Override
    public fp clone() {
        return this.i();
    }
    
    @Override
    public fx clone() {
        return this.i();
    }
    
    @Override
    public Object clone() {
        return this.i();
    }
    
    public gO d(final boolean k) {
        this.n |= 0x2;
        this.k = k;
        this.c();
        return this;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public fm getDefaultInstanceForType() {
        return this.l();
    }
    
    @Override
    public bl getDescriptorForType() {
        return hM.u();
    }
    
    public ds h() {
        final ds a = this.a();
        try {
            if (!a.isInitialized()) {
                throw fx.a(a);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return a;
    }
    
    public gO i() {
        return c().a(this.a());
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.g().a(ds.class, gO.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int n = 0;
        while (true) {
            Label_0043: {
                if (n >= this.k()) {
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
    
    public gO j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/gq.b:()Lcom/google/gq;
        //     4: pop            
        //     5: aload_0        
        //     6: getstatic       com/google/bb.STRING:Lcom/google/bb;
        //     9: putfield        com/google/gO.g:Lcom/google/bb;
        //    12: aload_0        
        //    13: bipush          -2
        //    15: aload_0        
        //    16: getfield        com/google/gO.n:I
        //    19: iand           
        //    20: putfield        com/google/gO.n:I
        //    23: aload_0        
        //    24: iconst_0       
        //    25: putfield        com/google/gO.k:Z
        //    28: aload_0        
        //    29: bipush          -3
        //    31: aload_0        
        //    32: getfield        com/google/gO.n:I
        //    35: iand           
        //    36: putfield        com/google/gO.n:I
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        com/google/gO.j:Z
        //    44: aload_0        
        //    45: bipush          -5
        //    47: aload_0        
        //    48: getfield        com/google/gO.n:I
        //    51: iand           
        //    52: putfield        com/google/gO.n:I
        //    55: aload_0        
        //    56: iconst_0       
        //    57: putfield        com/google/gO.l:Z
        //    60: aload_0        
        //    61: bipush          -9
        //    63: aload_0        
        //    64: getfield        com/google/gO.n:I
        //    67: iand           
        //    68: putfield        com/google/gO.n:I
        //    71: aload_0        
        //    72: ldc             ""
        //    74: putfield        com/google/gO.i:Ljava/lang/Object;
        //    77: aload_0        
        //    78: bipush          -17
        //    80: aload_0        
        //    81: getfield        com/google/gO.n:I
        //    84: iand           
        //    85: putfield        com/google/gO.n:I
        //    88: aload_0        
        //    89: iconst_0       
        //    90: putfield        com/google/gO.m:Z
        //    93: aload_0        
        //    94: bipush          -33
        //    96: aload_0        
        //    97: getfield        com/google/gO.n:I
        //   100: iand           
        //   101: putfield        com/google/gO.n:I
        //   104: aload_0        
        //   105: getfield        com/google/gO.h:Lcom/google/b8;
        //   108: astore          4
        //   110: aload           4
        //   112: ifnonnull       139
        //   115: aload_0        
        //   116: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   119: putfield        com/google/gO.f:Ljava/util/List;
        //   122: aload_0        
        //   123: bipush          -65
        //   125: aload_0        
        //   126: getfield        com/google/gO.n:I
        //   129: iand           
        //   130: putfield        com/google/gO.n:I
        //   133: getstatic       com/google/dt.b:Z
        //   136: ifeq            154
        //   139: aload_0        
        //   140: getfield        com/google/gO.h:Lcom/google/b8;
        //   143: invokevirtual   com/google/b8.c:()V
        //   146: aload_0        
        //   147: areturn        
        //   148: astore_1       
        //   149: aload_1        
        //   150: athrow         
        //   151: astore_2       
        //   152: aload_2        
        //   153: athrow         
        //   154: aload_0        
        //   155: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      110    148    151    Ljava/lang/NullPointerException;
        //  115    139    151    154    Ljava/lang/NullPointerException;
        //  139    146    151    154    Ljava/lang/NullPointerException;
        //  149    151    151    154    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0139:
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
    
    public int k() {
        try {
            if (this.h == null) {
                return this.f.size();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.h.a();
    }
    
    public ds l() {
        return ds.p();
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
