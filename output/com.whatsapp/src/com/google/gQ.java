// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gQ extends fp implements f
{
    private List e;
    private b8 f;
    private Object g;
    private hv h;
    private Object i;
    private int j;
    private long k;
    private long l;
    private double m;
    
    private gQ() {
        this.e = Collections.emptyList();
        this.g = "";
        this.h = hv.b;
        this.i = "";
        this.j();
    }
    
    private gQ(final dg dg) {
        super(dg);
        this.e = Collections.emptyList();
        this.g = "";
        this.h = hv.b;
        this.i = "";
        this.j();
    }
    
    gQ(final dg dg, final fM fm) {
        this(dg);
    }
    
    private void d() {
        try {
            if ((0x1 & this.j) != 0x1) {
                this.e = new ArrayList(this.e);
                this.j |= 0x1;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private b8 e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: aload_0        
        //     3: getfield        com/google/gQ.f:Lcom/google/b8;
        //     6: astore          4
        //     8: aload           4
        //    10: ifnonnull       60
        //    13: aload_0        
        //    14: getfield        com/google/gQ.e:Ljava/util/List;
        //    17: astore          5
        //    19: aload_0        
        //    20: getfield        com/google/gQ.j:I
        //    23: istore          6
        //    25: iload           6
        //    27: iconst_1       
        //    28: iand           
        //    29: iload_1        
        //    30: if_icmpne       71
        //    33: aload_0        
        //    34: new             Lcom/google/b8;
        //    37: dup            
        //    38: aload           5
        //    40: iload_1        
        //    41: aload_0        
        //    42: invokevirtual   com/google/gQ.a:()Lcom/google/dg;
        //    45: aload_0        
        //    46: invokevirtual   com/google/gQ.f:()Z
        //    49: invokespecial   com/google/b8.<init>:(Ljava/util/List;ZLcom/google/dg;Z)V
        //    52: putfield        com/google/gQ.f:Lcom/google/b8;
        //    55: aload_0        
        //    56: aconst_null    
        //    57: putfield        com/google/gQ.e:Ljava/util/List;
        //    60: aload_0        
        //    61: getfield        com/google/gQ.f:Lcom/google/b8;
        //    64: areturn        
        //    65: astore_2       
        //    66: aload_2        
        //    67: athrow         
        //    68: astore_3       
        //    69: aload_3        
        //    70: athrow         
        //    71: iconst_0       
        //    72: istore_1       
        //    73: goto            33
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      8      65     68     Ljava/lang/NullPointerException;
        //  13     25     68     71     Ljava/lang/NullPointerException;
        //  66     68     68     71     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    private static gQ f() {
        return new gQ();
    }
    
    static gQ g() {
        return f();
    }
    
    private void j() {
        try {
            if (dS.d) {
                this.e();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public dn a(final int n) {
        try {
            if (this.f == null) {
                return this.e.get(n);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return (dn)this.f.a(n);
    }
    
    public dy a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: new             Lcom/google/dy;
        //     5: dup            
        //     6: aload_0        
        //     7: aconst_null    
        //     8: invokespecial   com/google/dy.<init>:(Lcom/google/fp;Lcom/google/fM;)V
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/google/gQ.j:I
        //    16: istore_3       
        //    17: aload_0        
        //    18: getfield        com/google/gQ.f:Lcom/google/b8;
        //    21: astore          6
        //    23: aload           6
        //    25: ifnonnull       75
        //    28: iconst_1       
        //    29: aload_0        
        //    30: getfield        com/google/gQ.j:I
        //    33: iand           
        //    34: iload_1        
        //    35: if_icmpne       60
        //    38: aload_0        
        //    39: aload_0        
        //    40: getfield        com/google/gQ.e:Ljava/util/List;
        //    43: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //    46: putfield        com/google/gQ.e:Ljava/util/List;
        //    49: aload_0        
        //    50: bipush          -2
        //    52: aload_0        
        //    53: getfield        com/google/gQ.j:I
        //    56: iand           
        //    57: putfield        com/google/gQ.j:I
        //    60: aload_2        
        //    61: aload_0        
        //    62: getfield        com/google/gQ.e:Ljava/util/List;
        //    65: invokestatic    com/google/dy.a:(Lcom/google/dy;Ljava/util/List;)Ljava/util/List;
        //    68: pop            
        //    69: getstatic       com/google/dt.b:Z
        //    72: ifeq            87
        //    75: aload_2        
        //    76: aload_0        
        //    77: getfield        com/google/gQ.f:Lcom/google/b8;
        //    80: invokevirtual   com/google/b8.b:()Ljava/util/List;
        //    83: invokestatic    com/google/dy.a:(Lcom/google/dy;Ljava/util/List;)Ljava/util/List;
        //    86: pop            
        //    87: iload_3        
        //    88: iconst_2       
        //    89: iand           
        //    90: iconst_2       
        //    91: if_icmpne       241
        //    94: aload_2        
        //    95: aload_0        
        //    96: getfield        com/google/gQ.g:Ljava/lang/Object;
        //    99: invokestatic    com/google/dy.a:(Lcom/google/dy;Ljava/lang/Object;)Ljava/lang/Object;
        //   102: pop            
        //   103: iload_3        
        //   104: iconst_4       
        //   105: iand           
        //   106: iconst_4       
        //   107: if_icmpne       114
        //   110: iload_1        
        //   111: iconst_2       
        //   112: ior            
        //   113: istore_1       
        //   114: aload_2        
        //   115: aload_0        
        //   116: getfield        com/google/gQ.l:J
        //   119: invokestatic    com/google/dy.b:(Lcom/google/dy;J)J
        //   122: pop2           
        //   123: iload_3        
        //   124: bipush          8
        //   126: iand           
        //   127: bipush          8
        //   129: if_icmpne       136
        //   132: iload_1        
        //   133: iconst_4       
        //   134: ior            
        //   135: istore_1       
        //   136: aload_2        
        //   137: aload_0        
        //   138: getfield        com/google/gQ.k:J
        //   141: invokestatic    com/google/dy.a:(Lcom/google/dy;J)J
        //   144: pop2           
        //   145: iload_3        
        //   146: bipush          16
        //   148: iand           
        //   149: bipush          16
        //   151: if_icmpne       159
        //   154: iload_1        
        //   155: bipush          8
        //   157: ior            
        //   158: istore_1       
        //   159: aload_2        
        //   160: aload_0        
        //   161: getfield        com/google/gQ.m:D
        //   164: invokestatic    com/google/dy.a:(Lcom/google/dy;D)D
        //   167: pop2           
        //   168: iload_3        
        //   169: bipush          32
        //   171: iand           
        //   172: bipush          32
        //   174: if_icmpne       182
        //   177: iload_1        
        //   178: bipush          16
        //   180: ior            
        //   181: istore_1       
        //   182: aload_2        
        //   183: aload_0        
        //   184: getfield        com/google/gQ.h:Lcom/google/hv;
        //   187: invokestatic    com/google/dy.a:(Lcom/google/dy;Lcom/google/hv;)Lcom/google/hv;
        //   190: pop            
        //   191: iload_3        
        //   192: bipush          64
        //   194: iand           
        //   195: bipush          64
        //   197: if_icmpne       205
        //   200: iload_1        
        //   201: bipush          32
        //   203: ior            
        //   204: istore_1       
        //   205: aload_2        
        //   206: aload_0        
        //   207: getfield        com/google/gQ.i:Ljava/lang/Object;
        //   210: invokestatic    com/google/dy.b:(Lcom/google/dy;Ljava/lang/Object;)Ljava/lang/Object;
        //   213: pop            
        //   214: aload_2        
        //   215: iload_1        
        //   216: invokestatic    com/google/dy.a:(Lcom/google/dy;I)I
        //   219: pop            
        //   220: aload_0        
        //   221: invokevirtual   com/google/gQ.b:()V
        //   224: aload_2        
        //   225: areturn        
        //   226: astore          4
        //   228: aload           4
        //   230: athrow         
        //   231: astore          5
        //   233: aload           5
        //   235: athrow         
        //   236: astore          7
        //   238: aload           7
        //   240: athrow         
        //   241: iconst_0       
        //   242: istore_1       
        //   243: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  17     23     226    231    Ljava/lang/NullPointerException;
        //  28     60     231    236    Ljava/lang/NullPointerException;
        //  60     75     236    241    Ljava/lang/NullPointerException;
        //  75     87     236    241    Ljava/lang/NullPointerException;
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
    
    public gQ a(final double m) {
        this.j |= 0x10;
        this.m = m;
        this.c();
        return this;
    }
    
    public gQ a(final long l) {
        this.j |= 0x4;
        this.l = l;
        this.c();
        return this;
    }
    
    public gQ a(final cL p0, final fu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dy.k:Lcom/google/du;
        //     3: aload_1        
        //     4: aload_2        
        //     5: invokeinterface com/google/du.parsePartialFrom:(Lcom/google/cL;Lcom/google/fu;)Ljava/lang/Object;
        //    10: checkcast       Lcom/google/dy;
        //    13: astore          10
        //    15: aload           10
        //    17: ifnull          27
        //    20: aload_0        
        //    21: aload           10
        //    23: invokevirtual   com/google/gQ.a:(Lcom/google/dy;)Lcom/google/gQ;
        //    26: pop            
        //    27: aload_0        
        //    28: areturn        
        //    29: astore          7
        //    31: aload           7
        //    33: invokevirtual   com/google/bg.b:()Lcom/google/ci;
        //    36: checkcast       Lcom/google/dy;
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
        //    61: invokevirtual   com/google/gQ.a:(Lcom/google/dy;)Lcom/google/gQ;
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
    
    public gQ a(final dy p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: invokestatic    com/google/dy.c:()Lcom/google/dy;
        //     7: astore          4
        //     9: aload_1        
        //    10: aload           4
        //    12: if_acmpne       20
        //    15: aload_0        
        //    16: areturn        
        //    17: astore_3       
        //    18: aload_3        
        //    19: athrow         
        //    20: aload_0        
        //    21: getfield        com/google/gQ.f:Lcom/google/b8;
        //    24: astore          9
        //    26: aload           9
        //    28: ifnonnull       112
        //    31: aload_1        
        //    32: invokestatic    com/google/dy.d:(Lcom/google/dy;)Ljava/util/List;
        //    35: invokeinterface java/util/List.isEmpty:()Z
        //    40: istore          31
        //    42: iload           31
        //    44: ifne            218
        //    47: aload_0        
        //    48: getfield        com/google/gQ.e:Ljava/util/List;
        //    51: invokeinterface java/util/List.isEmpty:()Z
        //    56: istore          32
        //    58: iload           32
        //    60: ifeq            86
        //    63: aload_0        
        //    64: aload_1        
        //    65: invokestatic    com/google/dy.d:(Lcom/google/dy;)Ljava/util/List;
        //    68: putfield        com/google/gQ.e:Ljava/util/List;
        //    71: aload_0        
        //    72: bipush          -2
        //    74: aload_0        
        //    75: getfield        com/google/gQ.j:I
        //    78: iand           
        //    79: putfield        com/google/gQ.j:I
        //    82: iload_2        
        //    83: ifeq            104
        //    86: aload_0        
        //    87: invokespecial   com/google/gQ.d:()V
        //    90: aload_0        
        //    91: getfield        com/google/gQ.e:Ljava/util/List;
        //    94: aload_1        
        //    95: invokestatic    com/google/dy.d:(Lcom/google/dy;)Ljava/util/List;
        //    98: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   103: pop            
        //   104: aload_0        
        //   105: invokevirtual   com/google/gQ.c:()V
        //   108: iload_2        
        //   109: ifeq            218
        //   112: aload_1        
        //   113: invokestatic    com/google/dy.d:(Lcom/google/dy;)Ljava/util/List;
        //   116: invokeinterface java/util/List.isEmpty:()Z
        //   121: istore          13
        //   123: iload           13
        //   125: ifne            218
        //   128: aload_0        
        //   129: getfield        com/google/gQ.f:Lcom/google/b8;
        //   132: invokevirtual   com/google/b8.d:()Z
        //   135: istore          25
        //   137: iload           25
        //   139: ifeq            206
        //   142: aload_0        
        //   143: getfield        com/google/gQ.f:Lcom/google/b8;
        //   146: invokevirtual   com/google/b8.f:()V
        //   149: aload_0        
        //   150: aconst_null    
        //   151: putfield        com/google/gQ.f:Lcom/google/b8;
        //   154: aload_0        
        //   155: aload_1        
        //   156: invokestatic    com/google/dy.d:(Lcom/google/dy;)Ljava/util/List;
        //   159: putfield        com/google/gQ.e:Ljava/util/List;
        //   162: aload_0        
        //   163: bipush          -2
        //   165: aload_0        
        //   166: getfield        com/google/gQ.j:I
        //   169: iand           
        //   170: putfield        com/google/gQ.j:I
        //   173: getstatic       com/google/dS.d:Z
        //   176: istore          28
        //   178: aconst_null    
        //   179: astore          29
        //   181: iload           28
        //   183: ifeq            196
        //   186: aload_0        
        //   187: invokespecial   com/google/gQ.e:()Lcom/google/b8;
        //   190: astore          30
        //   192: aload           30
        //   194: astore          29
        //   196: aload_0        
        //   197: aload           29
        //   199: putfield        com/google/gQ.f:Lcom/google/b8;
        //   202: iload_2        
        //   203: ifeq            218
        //   206: aload_0        
        //   207: getfield        com/google/gQ.f:Lcom/google/b8;
        //   210: aload_1        
        //   211: invokestatic    com/google/dy.d:(Lcom/google/dy;)Ljava/util/List;
        //   214: invokevirtual   com/google/b8.a:(Ljava/lang/Iterable;)Lcom/google/b8;
        //   217: pop            
        //   218: aload_1        
        //   219: invokevirtual   com/google/dy.f:()Z
        //   222: ifeq            247
        //   225: aload_0        
        //   226: iconst_2       
        //   227: aload_0        
        //   228: getfield        com/google/gQ.j:I
        //   231: ior            
        //   232: putfield        com/google/gQ.j:I
        //   235: aload_0        
        //   236: aload_1        
        //   237: invokestatic    com/google/dy.a:(Lcom/google/dy;)Ljava/lang/Object;
        //   240: putfield        com/google/gQ.g:Ljava/lang/Object;
        //   243: aload_0        
        //   244: invokevirtual   com/google/gQ.c:()V
        //   247: aload_1        
        //   248: invokevirtual   com/google/dy.h:()Z
        //   251: ifeq            263
        //   254: aload_0        
        //   255: aload_1        
        //   256: invokevirtual   com/google/dy.s:()J
        //   259: invokevirtual   com/google/gQ.a:(J)Lcom/google/gQ;
        //   262: pop            
        //   263: aload_1        
        //   264: invokevirtual   com/google/dy.b:()Z
        //   267: ifeq            279
        //   270: aload_0        
        //   271: aload_1        
        //   272: invokevirtual   com/google/dy.j:()J
        //   275: invokevirtual   com/google/gQ.b:(J)Lcom/google/gQ;
        //   278: pop            
        //   279: aload_1        
        //   280: invokevirtual   com/google/dy.a:()Z
        //   283: ifeq            295
        //   286: aload_0        
        //   287: aload_1        
        //   288: invokevirtual   com/google/dy.w:()D
        //   291: invokevirtual   com/google/gQ.a:(D)Lcom/google/gQ;
        //   294: pop            
        //   295: aload_1        
        //   296: invokevirtual   com/google/dy.d:()Z
        //   299: ifeq            311
        //   302: aload_0        
        //   303: aload_1        
        //   304: invokevirtual   com/google/dy.t:()Lcom/google/hv;
        //   307: invokevirtual   com/google/gQ.a:(Lcom/google/hv;)Lcom/google/gQ;
        //   310: pop            
        //   311: aload_1        
        //   312: invokevirtual   com/google/dy.n:()Z
        //   315: ifeq            341
        //   318: aload_0        
        //   319: bipush          64
        //   321: aload_0        
        //   322: getfield        com/google/gQ.j:I
        //   325: ior            
        //   326: putfield        com/google/gQ.j:I
        //   329: aload_0        
        //   330: aload_1        
        //   331: invokestatic    com/google/dy.c:(Lcom/google/dy;)Ljava/lang/Object;
        //   334: putfield        com/google/gQ.i:Ljava/lang/Object;
        //   337: aload_0        
        //   338: invokevirtual   com/google/gQ.c:()V
        //   341: aload_0        
        //   342: aload_1        
        //   343: invokevirtual   com/google/dy.getUnknownFields:()Lcom/google/ce;
        //   346: invokevirtual   com/google/gQ.b:(Lcom/google/ce;)Lcom/google/fp;
        //   349: pop            
        //   350: aload_0        
        //   351: areturn        
        //   352: astore          5
        //   354: aload           5
        //   356: athrow         
        //   357: astore          6
        //   359: aload           6
        //   361: athrow         
        //   362: astore          7
        //   364: aload           7
        //   366: athrow         
        //   367: astore          8
        //   369: aload           8
        //   371: athrow         
        //   372: astore          34
        //   374: aload           34
        //   376: athrow         
        //   377: astore          10
        //   379: aload           10
        //   381: athrow         
        //   382: astore          11
        //   384: aload           11
        //   386: athrow         
        //   387: astore          12
        //   389: aload           12
        //   391: athrow         
        //   392: astore          26
        //   394: aload           26
        //   396: athrow         
        //   397: astore          14
        //   399: aload           14
        //   401: athrow         
        //   402: astore          15
        //   404: aload           15
        //   406: athrow         
        //   407: astore          16
        //   409: aload           16
        //   411: athrow         
        //   412: astore          17
        //   414: aload           17
        //   416: athrow         
        //   417: astore          18
        //   419: aload           18
        //   421: athrow         
        //   422: astore          19
        //   424: aload           19
        //   426: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      9      17     20     Ljava/lang/NullPointerException;
        //  20     26     352    357    Ljava/lang/NullPointerException;
        //  31     42     357    362    Ljava/lang/NullPointerException;
        //  47     58     362    367    Ljava/lang/NullPointerException;
        //  63     82     367    372    Ljava/lang/NullPointerException;
        //  86     104    367    372    Ljava/lang/NullPointerException;
        //  104    108    372    377    Ljava/lang/NullPointerException;
        //  112    123    377    382    Ljava/lang/NullPointerException;
        //  128    137    382    387    Ljava/lang/NullPointerException;
        //  142    178    387    392    Ljava/lang/NullPointerException;
        //  186    192    387    392    Ljava/lang/NullPointerException;
        //  196    202    392    397    Ljava/lang/NullPointerException;
        //  206    218    392    397    Ljava/lang/NullPointerException;
        //  218    247    397    402    Ljava/lang/NullPointerException;
        //  247    263    402    407    Ljava/lang/NullPointerException;
        //  263    279    407    412    Ljava/lang/NullPointerException;
        //  279    295    412    417    Ljava/lang/NullPointerException;
        //  295    311    417    422    Ljava/lang/NullPointerException;
        //  311    341    422    427    Ljava/lang/NullPointerException;
        //  354    357    357    362    Ljava/lang/NullPointerException;
        //  359    362    362    367    Ljava/lang/NullPointerException;
        //  364    367    367    372    Ljava/lang/NullPointerException;
        //  374    377    377    382    Ljava/lang/NullPointerException;
        //  379    382    382    387    Ljava/lang/NullPointerException;
        //  384    387    387    392    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 217, Size: 217
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
    
    public gQ a(final fm fm) {
        try {
            if (fm instanceof dy) {
                return this.a((dy)fm);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        super.mergeFrom(fm);
        return this;
    }
    
    public gQ a(final hv h) {
        if (h == null) {
            try {
                throw new NullPointerException();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.j |= 0x20;
        this.h = h;
        this.c();
        return this;
    }
    
    public dy b() {
        final dy a = this.a();
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
    
    public gQ b(final long k) {
        this.j |= 0x8;
        this.k = k;
        this.c();
        return this;
    }
    
    @Override
    public ci build() {
        return this.b();
    }
    
    @Override
    public fm build() {
        return this.b();
    }
    
    @Override
    public ci buildPartial() {
        return this.a();
    }
    
    @Override
    public fm buildPartial() {
        return this.a();
    }
    
    public gQ c() {
        return f().a(this.a());
    }
    
    @Override
    public fp clear() {
        return this.k();
    }
    
    @Override
    public fE clone() {
        return this.c();
    }
    
    @Override
    public fp clone() {
        return this.c();
    }
    
    @Override
    public fx clone() {
        return this.c();
    }
    
    @Override
    public Object clone() {
        return this.c();
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
        return hM.A();
    }
    
    public dy h() {
        return dy.c();
    }
    
    public int i() {
        try {
            if (this.f == null) {
                return this.e.size();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.f.a();
    }
    
    @Override
    protected ch internalGetFieldAccessorTable() {
        return hM.k().a(dy.class, gQ.class);
    }
    
    @Override
    public final boolean isInitialized() {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.i()) {
            try {
                if (!this.a(i).isInitialized()) {
                    return false;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            ++i;
            if (b) {
                break;
            }
        }
        return true;
    }
    
    public gQ k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/google/fp.clear:()Lcom/google/fp;
        //     4: pop            
        //     5: aload_0        
        //     6: getfield        com/google/gQ.f:Lcom/google/b8;
        //     9: astore          4
        //    11: aload           4
        //    13: ifnonnull       40
        //    16: aload_0        
        //    17: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    20: putfield        com/google/gQ.e:Ljava/util/List;
        //    23: aload_0        
        //    24: bipush          -2
        //    26: aload_0        
        //    27: getfield        com/google/gQ.j:I
        //    30: iand           
        //    31: putfield        com/google/gQ.j:I
        //    34: getstatic       com/google/dt.b:Z
        //    37: ifeq            47
        //    40: aload_0        
        //    41: getfield        com/google/gQ.f:Lcom/google/b8;
        //    44: invokevirtual   com/google/b8.c:()V
        //    47: aload_0        
        //    48: ldc             ""
        //    50: putfield        com/google/gQ.g:Ljava/lang/Object;
        //    53: aload_0        
        //    54: bipush          -3
        //    56: aload_0        
        //    57: getfield        com/google/gQ.j:I
        //    60: iand           
        //    61: putfield        com/google/gQ.j:I
        //    64: aload_0        
        //    65: lconst_0       
        //    66: putfield        com/google/gQ.l:J
        //    69: aload_0        
        //    70: bipush          -5
        //    72: aload_0        
        //    73: getfield        com/google/gQ.j:I
        //    76: iand           
        //    77: putfield        com/google/gQ.j:I
        //    80: aload_0        
        //    81: lconst_0       
        //    82: putfield        com/google/gQ.k:J
        //    85: aload_0        
        //    86: bipush          -9
        //    88: aload_0        
        //    89: getfield        com/google/gQ.j:I
        //    92: iand           
        //    93: putfield        com/google/gQ.j:I
        //    96: aload_0        
        //    97: dconst_0       
        //    98: putfield        com/google/gQ.m:D
        //   101: aload_0        
        //   102: bipush          -17
        //   104: aload_0        
        //   105: getfield        com/google/gQ.j:I
        //   108: iand           
        //   109: putfield        com/google/gQ.j:I
        //   112: aload_0        
        //   113: getstatic       com/google/hv.b:Lcom/google/hv;
        //   116: putfield        com/google/gQ.h:Lcom/google/hv;
        //   119: aload_0        
        //   120: bipush          -33
        //   122: aload_0        
        //   123: getfield        com/google/gQ.j:I
        //   126: iand           
        //   127: putfield        com/google/gQ.j:I
        //   130: aload_0        
        //   131: ldc             ""
        //   133: putfield        com/google/gQ.i:Ljava/lang/Object;
        //   136: aload_0        
        //   137: bipush          -65
        //   139: aload_0        
        //   140: getfield        com/google/gQ.j:I
        //   143: iand           
        //   144: putfield        com/google/gQ.j:I
        //   147: aload_0        
        //   148: areturn        
        //   149: astore_1       
        //   150: aload_1        
        //   151: athrow         
        //   152: astore_2       
        //   153: aload_2        
        //   154: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      11     149    152    Ljava/lang/NullPointerException;
        //  16     40     152    155    Ljava/lang/NullPointerException;
        //  40     47     152    155    Ljava/lang/NullPointerException;
        //  150    152    152    155    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
