// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class a2d
{
    public final String a;
    public final boolean b;
    public final String c;
    public final String[] d;
    public final String e;
    public final int[] f;
    public final int[] g;
    public final String[] h;
    public final String[] i;
    public final int j;
    public final String[] k;
    public final String l;
    
    private a2d(final String[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: arraylength    
        //     6: bipush          12
        //     8: if_icmpge       19
        //    11: new             Ljava/lang/IllegalArgumentException;
        //    14: dup            
        //    15: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    18: athrow         
        //    19: aload_1        
        //    20: iconst_0       
        //    21: aaload         
        //    22: astore_2       
        //    23: aload_1        
        //    24: iconst_1       
        //    25: aaload         
        //    26: astore_3       
        //    27: aload_1        
        //    28: iconst_2       
        //    29: aaload         
        //    30: astore          4
        //    32: aload_1        
        //    33: iconst_3       
        //    34: aaload         
        //    35: astore          5
        //    37: aload_1        
        //    38: iconst_4       
        //    39: aaload         
        //    40: astore          6
        //    42: aload_1        
        //    43: iconst_5       
        //    44: aaload         
        //    45: astore          7
        //    47: aload_3        
        //    48: ifnull          56
        //    51: aload           4
        //    53: ifnonnull       69
        //    56: new             Ljava/lang/IllegalArgumentException;
        //    59: dup            
        //    60: invokespecial   java/lang/IllegalArgumentException.<init>:()V
        //    63: athrow         
        //    64: astore          8
        //    66: aload           8
        //    68: athrow         
        //    69: aload_0        
        //    70: aload_3        
        //    71: putfield        com/whatsapp/a2d.e:Ljava/lang/String;
        //    74: aload_0        
        //    75: aload_2        
        //    76: putfield        com/whatsapp/a2d.l:Ljava/lang/String;
        //    79: aload_0        
        //    80: aload           4
        //    82: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    85: putfield        com/whatsapp/a2d.j:I
        //    88: aload           5
        //    90: ifnull          361
        //    93: aload           5
        //    95: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    98: invokevirtual   java/lang/String.length:()I
        //   101: ifle            361
        //   104: aload           5
        //   106: invokestatic    com/whatsapp/vi.b:(Ljava/lang/String;)[I
        //   109: astore          37
        //   111: aload           37
        //   113: astore          11
        //   115: aload_0        
        //   116: aload           11
        //   118: putfield        com/whatsapp/a2d.g:[I
        //   121: aload           6
        //   123: ifnull          377
        //   126: aload           6
        //   128: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   131: invokevirtual   java/lang/String.length:()I
        //   134: ifle            377
        //   137: aload           6
        //   139: invokestatic    com/whatsapp/vi.b:(Ljava/lang/String;)[I
        //   142: astore          36
        //   144: aload           36
        //   146: astore          14
        //   148: aload_0        
        //   149: aload           14
        //   151: putfield        com/whatsapp/a2d.f:[I
        //   154: aload           7
        //   156: ifnull          393
        //   159: aload           7
        //   161: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   164: invokevirtual   java/lang/String.length:()I
        //   167: ifle            393
        //   170: aload           7
        //   172: ldc             ","
        //   174: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   177: astore          35
        //   179: aload           35
        //   181: astore          17
        //   183: aload_0        
        //   184: aload           17
        //   186: putfield        com/whatsapp/a2d.k:[Ljava/lang/String;
        //   189: aload_1        
        //   190: bipush          7
        //   192: aaload         
        //   193: invokevirtual   java/lang/String.length:()I
        //   196: istore          21
        //   198: iload           21
        //   200: ifgt            234
        //   203: aload_1        
        //   204: bipush          8
        //   206: aaload         
        //   207: invokevirtual   java/lang/String.length:()I
        //   210: istore          33
        //   212: iload           33
        //   214: ifgt            234
        //   217: aload_1        
        //   218: bipush          9
        //   220: aaload         
        //   221: invokevirtual   java/lang/String.length:()I
        //   224: istore          34
        //   226: iconst_0       
        //   227: istore          22
        //   229: iload           34
        //   231: ifle            237
        //   234: iconst_1       
        //   235: istore          22
        //   237: aload_0        
        //   238: iload           22
        //   240: putfield        com/whatsapp/a2d.b:Z
        //   243: aload_0        
        //   244: getfield        com/whatsapp/a2d.b:Z
        //   247: ifeq            419
        //   250: aload_1        
        //   251: bipush          7
        //   253: aaload         
        //   254: ldc             ";"
        //   256: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   259: astore          32
        //   261: aload           32
        //   263: astore          24
        //   265: aload_0        
        //   266: aload           24
        //   268: putfield        com/whatsapp/a2d.i:[Ljava/lang/String;
        //   271: aload_0        
        //   272: getfield        com/whatsapp/a2d.b:Z
        //   275: ifeq            430
        //   278: aload_1        
        //   279: bipush          8
        //   281: aaload         
        //   282: ldc             ";"
        //   284: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   287: astore          31
        //   289: aload           31
        //   291: astore          26
        //   293: aload_0        
        //   294: aload           26
        //   296: putfield        com/whatsapp/a2d.d:[Ljava/lang/String;
        //   299: aload_0        
        //   300: getfield        com/whatsapp/a2d.b:Z
        //   303: istore          28
        //   305: aconst_null    
        //   306: astore          29
        //   308: iload           28
        //   310: ifeq            328
        //   313: aload_1        
        //   314: bipush          9
        //   316: aaload         
        //   317: ldc             ";"
        //   319: invokestatic    android/text/TextUtils.split:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   322: astore          30
        //   324: aload           30
        //   326: astore          29
        //   328: aload_0        
        //   329: aload           29
        //   331: putfield        com/whatsapp/a2d.h:[Ljava/lang/String;
        //   334: aload_0        
        //   335: aload_1        
        //   336: bipush          10
        //   338: aaload         
        //   339: putfield        com/whatsapp/a2d.a:Ljava/lang/String;
        //   342: aload_0        
        //   343: aload_1        
        //   344: bipush          11
        //   346: aaload         
        //   347: putfield        com/whatsapp/a2d.c:Ljava/lang/String;
        //   350: return         
        //   351: astore          9
        //   353: aload           9
        //   355: athrow         
        //   356: astore          10
        //   358: aload           10
        //   360: athrow         
        //   361: aconst_null    
        //   362: astore          11
        //   364: goto            115
        //   367: astore          12
        //   369: aload           12
        //   371: athrow         
        //   372: astore          13
        //   374: aload           13
        //   376: athrow         
        //   377: aconst_null    
        //   378: astore          14
        //   380: goto            148
        //   383: astore          15
        //   385: aload           15
        //   387: athrow         
        //   388: astore          16
        //   390: aload           16
        //   392: athrow         
        //   393: aconst_null    
        //   394: astore          17
        //   396: goto            183
        //   399: astore          18
        //   401: aload           18
        //   403: athrow         
        //   404: astore          19
        //   406: aload           19
        //   408: athrow         
        //   409: astore          20
        //   411: aload           20
        //   413: athrow         
        //   414: astore          23
        //   416: aload           23
        //   418: athrow         
        //   419: aconst_null    
        //   420: astore          24
        //   422: goto            265
        //   425: astore          25
        //   427: aload           25
        //   429: athrow         
        //   430: aconst_null    
        //   431: astore          26
        //   433: goto            293
        //   436: astore          27
        //   438: aload           27
        //   440: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  56     64     64     69     Ljava/lang/IllegalArgumentException;
        //  69     88     351    356    Ljava/lang/IllegalArgumentException;
        //  93     111    356    361    Ljava/lang/IllegalArgumentException;
        //  115    121    367    372    Ljava/lang/IllegalArgumentException;
        //  126    144    372    377    Ljava/lang/IllegalArgumentException;
        //  148    154    383    388    Ljava/lang/IllegalArgumentException;
        //  159    179    388    393    Ljava/lang/IllegalArgumentException;
        //  183    198    399    404    Ljava/lang/IllegalArgumentException;
        //  203    212    404    409    Ljava/lang/IllegalArgumentException;
        //  217    226    409    414    Ljava/lang/IllegalArgumentException;
        //  237    261    414    419    Ljava/lang/IllegalArgumentException;
        //  265    289    425    430    Ljava/lang/IllegalArgumentException;
        //  293    305    436    441    Ljava/lang/IllegalArgumentException;
        //  313    324    436    441    Ljava/lang/IllegalArgumentException;
        //  353    356    356    361    Ljava/lang/IllegalArgumentException;
        //  369    372    372    377    Ljava/lang/IllegalArgumentException;
        //  385    388    388    393    Ljava/lang/IllegalArgumentException;
        //  401    404    404    409    Ljava/lang/IllegalArgumentException;
        //  406    409    409    414    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 234, Size: 234
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    a2d(final String[] array, final gn gn) {
        this(array);
    }
    
    public int a() {
        final boolean i = App.I;
        Label_0032: {
            try {
                if (this.f == null) {
                    return 14;
                }
                final a2d a2d = this;
                final int[] array = a2d.f;
                final int n = array.length;
                if (n == 0) {
                    return 14;
                }
                break Label_0032;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final a2d a2d = this;
                final int[] array = a2d.f;
                final int n = array.length;
                if (n == 0) {
                    return 14;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        int n2 = this.f[0];
        int j = 1;
        while (j < this.f.length) {
            if (this.f[j] > n2) {
                n2 = this.f[j];
            }
            ++j;
            if (i) {
                return n2;
            }
        }
        return n2;
        n2 = 14;
        return n2;
    }
    
    public int a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/a2d.b:()I
        //     8: istore          4
        //    10: iload_1        
        //    11: iload           4
        //    13: if_icmpge       25
        //    16: iconst_m1      
        //    17: istore          10
        //    19: iload           10
        //    21: ireturn        
        //    22: astore_3       
        //    23: aload_3        
        //    24: athrow         
        //    25: aload_0        
        //    26: invokevirtual   com/whatsapp/a2d.a:()I
        //    29: istore          6
        //    31: iload_1        
        //    32: iload           6
        //    34: if_icmple       44
        //    37: iconst_1       
        //    38: ireturn        
        //    39: astore          5
        //    41: aload           5
        //    43: athrow         
        //    44: aload_0        
        //    45: getfield        com/whatsapp/a2d.f:[I
        //    48: astore          9
        //    50: iconst_0       
        //    51: istore          10
        //    53: aload           9
        //    55: ifnull          19
        //    58: aload_0        
        //    59: getfield        com/whatsapp/a2d.f:[I
        //    62: arraylength    
        //    63: istore          11
        //    65: iconst_0       
        //    66: istore          10
        //    68: iload           11
        //    70: ifeq            19
        //    73: iconst_0       
        //    74: istore          12
        //    76: iload           12
        //    78: aload_0        
        //    79: getfield        com/whatsapp/a2d.f:[I
        //    82: arraylength    
        //    83: if_icmpge       111
        //    86: aload_0        
        //    87: getfield        com/whatsapp/a2d.f:[I
        //    90: iload           12
        //    92: iaload         
        //    93: istore          14
        //    95: iconst_0       
        //    96: istore          10
        //    98: iload           14
        //   100: iload_1        
        //   101: if_icmpeq       19
        //   104: iinc            12, 1
        //   107: iload_2        
        //   108: ifeq            76
        //   111: iconst_1       
        //   112: ireturn        
        //   113: astore          7
        //   115: aload           7
        //   117: athrow         
        //   118: astore          8
        //   120: aload           8
        //   122: athrow         
        //   123: astore          13
        //   125: aload           13
        //   127: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     22     25     Ljava/lang/IllegalArgumentException;
        //  25     31     39     44     Ljava/lang/IllegalArgumentException;
        //  44     50     113    118    Ljava/lang/IllegalArgumentException;
        //  58     65     118    123    Ljava/lang/IllegalArgumentException;
        //  86     95     123    128    Ljava/lang/IllegalArgumentException;
        //  115    118    118    123    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    public String a(final String s) {
        final boolean i = App.I;
        int n = 0;
        do {
            if (n >= s.length()) {
                return s;
            }
            try {
                if (this.k == null) {
                    return s;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            int n2 = 0;
            int n3 = 0;
        Label_0090_Outer:
            while (true) {
                while (true) {
                    if (n2 < this.k.length && n3 == 0) {
                        try {
                            if (this.k[n2].charAt(0) == s.charAt(n)) {
                                n3 = 1;
                            }
                            ++n2;
                            if (!i) {
                                continue Label_0090_Outer;
                            }
                            if (n3 == 0) {
                                final String s2 = s;
                                final int n4 = n;
                                final String substring = s2.substring(n4);
                                return substring;
                            }
                            break;
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                        try {
                            final String s2 = s;
                            final int n4 = n;
                            final String substring2;
                            final String substring = substring2 = s2.substring(n4);
                            return substring2;
                        }
                        catch (IllegalArgumentException ex3) {
                            throw ex3;
                        }
                        break;
                    }
                    continue;
                }
            }
            ++n;
        } while (!i);
        return s;
    }
    
    public int b() {
        final boolean i = App.I;
        Label_0032: {
            try {
                if (this.f == null) {
                    return 5;
                }
                final a2d a2d = this;
                final int[] array = a2d.f;
                final int n = array.length;
                if (n == 0) {
                    return 5;
                }
                break Label_0032;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final a2d a2d = this;
                final int[] array = a2d.f;
                final int n = array.length;
                if (n == 0) {
                    return 5;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        int n2 = this.f[0];
        int j = 1;
        while (j < this.f.length) {
            if (this.f[j] < n2) {
                n2 = this.f[j];
            }
            ++j;
            if (i) {
                return n2;
            }
        }
        return n2;
        n2 = 5;
        return n2;
    }
}
