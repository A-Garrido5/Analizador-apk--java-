// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class ch
{
    private static final String[] z;
    private final cP[] a;
    private volatile boolean b;
    private String[] c;
    private final bl d;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "D\u0018\u0003l\u001ad\t\u001az\u001at\u001f\u000fl\u001a~\u001f\u001e?Rq\u0006\u000f?_h\u0004\u000fqIy\u001f\u0004l\u0014".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ':';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = 'p';
                    break;
                }
                case 2: {
                    c2 = 'j';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "V\u0019\u000fs^T\u0015\u0019|Hy\u0000\u001epH0\u0014\u0005zI0\u001e\u0005k\u001a}\u0011\u001e|R0\u001d\u000flIq\u0017\u000f?Ni\u0000\u000f1".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = ':';
                    break;
                }
                case 0: {
                    c4 = '\u0010';
                    break;
                }
                case 1: {
                    c4 = 'p';
                    break;
                }
                case 2: {
                    c4 = 'j';
                    break;
                }
                case 3: {
                    c4 = '\u001f';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    public ch(final bl d, final String[] c) {
        this.d = d;
        this.c = c;
        this.a = new cP[d.f().size()];
        this.b = false;
    }
    
    static bl a(final ch ch) {
        return ch.d;
    }
    
    static cP a(final ch ch, final hg hg) {
        return ch.a(hg);
    }
    
    private cP a(final hg hg) {
        try {
            if (hg.m() != this.d) {
                throw new IllegalArgumentException(ch.z[1]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (hg.e()) {
                throw new IllegalArgumentException(ch.z[0]);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return this.a[hg.k()];
    }
    
    public ch a(final Class p0, final Class p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        com/google/ch.b:Z
        //     8: istore          5
        //    10: iload           5
        //    12: ifeq            22
        //    15: aload_0        
        //    16: areturn        
        //    17: astore          4
        //    19: aload           4
        //    21: athrow         
        //    22: aload_0        
        //    23: monitorenter   
        //    24: aload_0        
        //    25: getfield        com/google/ch.b:Z
        //    28: ifeq            42
        //    31: aload_0        
        //    32: monitorexit    
        //    33: aload_0        
        //    34: areturn        
        //    35: astore          6
        //    37: aload_0        
        //    38: monitorexit    
        //    39: aload           6
        //    41: athrow         
        //    42: iconst_0       
        //    43: istore          7
        //    45: iload           7
        //    47: aload_0        
        //    48: getfield        com/google/ch.a:[Lcom/google/cP;
        //    51: arraylength    
        //    52: if_icmpge       338
        //    55: aload_0        
        //    56: getfield        com/google/ch.d:Lcom/google/bl;
        //    59: invokevirtual   com/google/bl.f:()Ljava/util/List;
        //    62: iload           7
        //    64: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    69: checkcast       Lcom/google/hg;
        //    72: astore          8
        //    74: aload           8
        //    76: invokevirtual   com/google/hg.b:()Z
        //    79: ifeq            207
        //    82: aload           8
        //    84: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //    87: astore          24
        //    89: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //    92: astore          25
        //    94: aload           24
        //    96: aload           25
        //    98: if_acmpne       130
        //   101: aload_0        
        //   102: getfield        com/google/ch.a:[Lcom/google/cP;
        //   105: iload           7
        //   107: new             Lcom/google/bJ;
        //   110: dup            
        //   111: aload           8
        //   113: aload_0        
        //   114: getfield        com/google/ch.c:[Ljava/lang/String;
        //   117: iload           7
        //   119: aaload         
        //   120: aload_1        
        //   121: aload_2        
        //   122: invokespecial   com/google/bJ.<init>:(Lcom/google/hg;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
        //   125: aastore        
        //   126: iload_3        
        //   127: ifeq            328
        //   130: aload           8
        //   132: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   135: astore          26
        //   137: getstatic       com/google/hD.ENUM:Lcom/google/hD;
        //   140: astore          27
        //   142: aload           26
        //   144: aload           27
        //   146: if_acmpne       178
        //   149: aload_0        
        //   150: getfield        com/google/ch.a:[Lcom/google/cP;
        //   153: iload           7
        //   155: new             Lcom/google/bG;
        //   158: dup            
        //   159: aload           8
        //   161: aload_0        
        //   162: getfield        com/google/ch.c:[Ljava/lang/String;
        //   165: iload           7
        //   167: aaload         
        //   168: aload_1        
        //   169: aload_2        
        //   170: invokespecial   com/google/bG.<init>:(Lcom/google/hg;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
        //   173: aastore        
        //   174: iload_3        
        //   175: ifeq            328
        //   178: aload_0        
        //   179: getfield        com/google/ch.a:[Lcom/google/cP;
        //   182: iload           7
        //   184: new             Lcom/google/b3;
        //   187: dup            
        //   188: aload           8
        //   190: aload_0        
        //   191: getfield        com/google/ch.c:[Ljava/lang/String;
        //   194: iload           7
        //   196: aaload         
        //   197: aload_1        
        //   198: aload_2        
        //   199: invokespecial   com/google/b3.<init>:(Lcom/google/hg;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
        //   202: aastore        
        //   203: iload_3        
        //   204: ifeq            328
        //   207: aload           8
        //   209: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   212: astore          19
        //   214: getstatic       com/google/hD.MESSAGE:Lcom/google/hD;
        //   217: astore          20
        //   219: aload           19
        //   221: aload           20
        //   223: if_acmpne       255
        //   226: aload_0        
        //   227: getfield        com/google/ch.a:[Lcom/google/cP;
        //   230: iload           7
        //   232: new             Lcom/google/hY;
        //   235: dup            
        //   236: aload           8
        //   238: aload_0        
        //   239: getfield        com/google/ch.c:[Ljava/lang/String;
        //   242: iload           7
        //   244: aaload         
        //   245: aload_1        
        //   246: aload_2        
        //   247: invokespecial   com/google/hY.<init>:(Lcom/google/hg;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
        //   250: aastore        
        //   251: iload_3        
        //   252: ifeq            328
        //   255: aload           8
        //   257: invokevirtual   com/google/hg.n:()Lcom/google/hD;
        //   260: astore          21
        //   262: getstatic       com/google/hD.ENUM:Lcom/google/hD;
        //   265: astore          22
        //   267: aload           21
        //   269: aload           22
        //   271: if_acmpne       303
        //   274: aload_0        
        //   275: getfield        com/google/ch.a:[Lcom/google/cP;
        //   278: iload           7
        //   280: new             Lcom/google/h5;
        //   283: dup            
        //   284: aload           8
        //   286: aload_0        
        //   287: getfield        com/google/ch.c:[Ljava/lang/String;
        //   290: iload           7
        //   292: aaload         
        //   293: aload_1        
        //   294: aload_2        
        //   295: invokespecial   com/google/h5.<init>:(Lcom/google/hg;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
        //   298: aastore        
        //   299: iload_3        
        //   300: ifeq            328
        //   303: aload_0        
        //   304: getfield        com/google/ch.a:[Lcom/google/cP;
        //   307: iload           7
        //   309: new             Lcom/google/hk;
        //   312: dup            
        //   313: aload           8
        //   315: aload_0        
        //   316: getfield        com/google/ch.c:[Ljava/lang/String;
        //   319: iload           7
        //   321: aaload         
        //   322: aload_1        
        //   323: aload_2        
        //   324: invokespecial   com/google/hk.<init>:(Lcom/google/hg;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
        //   327: aastore        
        //   328: iload           7
        //   330: iconst_1       
        //   331: iadd           
        //   332: istore          23
        //   334: iload_3        
        //   335: ifeq            402
        //   338: aload_0        
        //   339: iconst_1       
        //   340: putfield        com/google/ch.b:Z
        //   343: aload_0        
        //   344: aconst_null    
        //   345: putfield        com/google/ch.c:[Ljava/lang/String;
        //   348: aload_0        
        //   349: monitorexit    
        //   350: aload_0        
        //   351: areturn        
        //   352: astore          9
        //   354: aload           9
        //   356: athrow         
        //   357: astore          10
        //   359: aload           10
        //   361: athrow         
        //   362: astore          11
        //   364: aload           11
        //   366: athrow         
        //   367: astore          12
        //   369: aload           12
        //   371: athrow         
        //   372: astore          13
        //   374: aload           13
        //   376: athrow         
        //   377: astore          14
        //   379: aload           14
        //   381: athrow         
        //   382: astore          15
        //   384: aload           15
        //   386: athrow         
        //   387: astore          16
        //   389: aload           16
        //   391: athrow         
        //   392: astore          17
        //   394: aload           17
        //   396: athrow         
        //   397: astore          18
        //   399: aload           18
        //   401: athrow         
        //   402: iload           23
        //   404: istore          7
        //   406: goto            45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     17     22     Ljava/lang/IllegalArgumentException;
        //  24     33     35     42     Any
        //  37     39     35     42     Any
        //  45     74     35     42     Any
        //  74     94     352    357    Ljava/lang/IllegalArgumentException;
        //  74     94     35     42     Any
        //  101    126    357    362    Ljava/lang/IllegalArgumentException;
        //  101    126    35     42     Any
        //  130    142    362    367    Ljava/lang/IllegalArgumentException;
        //  130    142    35     42     Any
        //  149    174    367    372    Ljava/lang/IllegalArgumentException;
        //  149    174    35     42     Any
        //  178    203    372    377    Ljava/lang/IllegalArgumentException;
        //  178    203    35     42     Any
        //  207    219    377    382    Ljava/lang/IllegalArgumentException;
        //  207    219    35     42     Any
        //  226    251    382    387    Ljava/lang/IllegalArgumentException;
        //  226    251    35     42     Any
        //  255    267    387    392    Ljava/lang/IllegalArgumentException;
        //  255    267    35     42     Any
        //  274    299    392    397    Ljava/lang/IllegalArgumentException;
        //  274    299    35     42     Any
        //  303    328    397    402    Ljava/lang/IllegalArgumentException;
        //  303    328    35     42     Any
        //  338    350    35     42     Any
        //  354    357    357    362    Ljava/lang/IllegalArgumentException;
        //  354    357    35     42     Any
        //  359    362    362    367    Ljava/lang/IllegalArgumentException;
        //  359    362    35     42     Any
        //  364    367    367    372    Ljava/lang/IllegalArgumentException;
        //  364    367    35     42     Any
        //  369    372    372    377    Ljava/lang/IllegalArgumentException;
        //  369    372    35     42     Any
        //  374    377    377    382    Ljava/lang/IllegalArgumentException;
        //  374    377    35     42     Any
        //  379    382    382    387    Ljava/lang/IllegalArgumentException;
        //  379    382    35     42     Any
        //  384    387    387    392    Ljava/lang/IllegalArgumentException;
        //  384    387    35     42     Any
        //  389    392    392    397    Ljava/lang/IllegalArgumentException;
        //  389    392    35     42     Any
        //  394    397    397    402    Ljava/lang/IllegalArgumentException;
        //  394    397    35     42     Any
        //  399    402    35     42     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 218, Size: 218
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
}
