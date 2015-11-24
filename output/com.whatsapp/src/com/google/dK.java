// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class dK
{
    private static final String z;
    private final L a;
    private final L b;
    private final ef c;
    
    static {
        final char[] charArray = "shg\u0013(Dhe\u0018fXg*\u0014/CLk\u0004/O!g\u00035C!g\u00172Ti*\u0002.R!|\u00134Dhe\u0018fDhp\u0013".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'F';
                    break;
                }
                case 0: {
                    c2 = '7';
                    break;
                }
                case 1: {
                    c2 = '\u0001';
                    break;
                }
                case 2: {
                    c2 = '\n';
                    break;
                }
                case 3: {
                    c2 = 'v';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    dK(final L l) {
        final int a = l.a();
        Label_0035: {
            if (a >= 8 && a <= 144) {
                if ((a & 0x1) == 0x0) {
                    break Label_0035;
                }
            }
            try {
                throw fD.a();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.c = a(l);
        this.a = this.b(l);
        this.b = new L(this.a.g(), this.a.a());
    }
    
    private static ef a(final L l) {
        return ef.a(l.a(), l.g());
    }
    
    int a(final int n, final int n2) {
        final int f = ef.f;
        while (true) {
            Label_0217: {
                if (!this.b(n - 1, 0, n, n2)) {
                    break Label_0217;
                }
                final int n3 = 1;
                int n4 = n3 << 1;
                if (this.b(n - 1, n2 - 1, n, n2)) {
                    n4 |= 0x1;
                }
                int n5 = n4 << 1;
                if (this.b(0, n2 - 3, n, n2)) {
                    n5 |= 0x1;
                }
                int n6 = n5 << 1;
                if (this.b(0, n2 - 2, n, n2)) {
                    n6 |= 0x1;
                }
                int n7 = n6 << 1;
                if (this.b(0, n2 - 1, n, n2)) {
                    n7 |= 0x1;
                }
                int n8 = n7 << 1;
                if (this.b(1, n2 - 3, n, n2)) {
                    n8 |= 0x1;
                }
                int n9 = n8 << 1;
                if (this.b(1, n2 - 2, n, n2)) {
                    n9 |= 0x1;
                }
                int n10 = n9 << 1;
                if (this.b(1, n2 - 1, n, n2)) {
                    n10 |= 0x1;
                }
                try {
                    if (fN.a != 0) {
                        ef.f = f + 1;
                    }
                    return n10;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            final int n3 = 0;
            continue;
        }
    }
    
    int a(final int n, final int n2, final int n3, final int n4) {
        final int f = ef.f;
        final boolean b = this.b(n - 2, n2 - 2, n3, n4);
        int n5 = 0;
        if (b) {
            n5 = 1;
        }
        int n6 = n5 << 1;
        if (this.b(n - 2, n2 - 1, n3, n4)) {
            n6 |= 0x1;
        }
        int n7 = n6 << 1;
        if (this.b(n - 1, n2 - 2, n3, n4)) {
            n7 |= 0x1;
        }
        int n8 = n7 << 1;
        if (this.b(n - 1, n2 - 1, n3, n4)) {
            n8 |= 0x1;
        }
        int n9 = n8 << 1;
        if (this.b(n - 1, n2, n3, n4)) {
            n9 |= 0x1;
        }
        int n10 = n9 << 1;
        if (this.b(n, n2 - 2, n3, n4)) {
            n10 |= 0x1;
        }
        int n11 = n10 << 1;
        if (this.b(n, n2 - 1, n3, n4)) {
            n11 |= 0x1;
        }
        int n12 = n11 << 1;
        if (this.b(n, n2, n3, n4)) {
            n12 |= 0x1;
        }
        if (f != 0) {
            ++fN.a;
        }
        return n12;
    }
    
    ef a() {
        return this.c;
    }
    
    int b(final int n, final int n2) {
        int n3;
        if (this.b(n - 3, 0, n, n2)) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4 = n3 << 1;
        if (this.b(n - 2, 0, n, n2)) {
            n4 |= 0x1;
        }
        int n5 = n4 << 1;
        if (this.b(n - 1, 0, n, n2)) {
            n5 |= 0x1;
        }
        int n6 = n5 << 1;
        if (this.b(0, n2 - 4, n, n2)) {
            n6 |= 0x1;
        }
        int n7 = n6 << 1;
        if (this.b(0, n2 - 3, n, n2)) {
            n7 |= 0x1;
        }
        int n8 = n7 << 1;
        if (this.b(0, n2 - 2, n, n2)) {
            n8 |= 0x1;
        }
        int n9 = n8 << 1;
        if (this.b(0, n2 - 1, n, n2)) {
            n9 |= 0x1;
        }
        int n10 = n9 << 1;
        if (this.b(1, n2 - 1, n, n2)) {
            n10 |= 0x1;
        }
        return n10;
    }
    
    L b(final L l) {
        final int f = ef.f;
        final int e = this.c.e();
        final int a = this.c.a();
        try {
            if (l.a() != e) {
                throw new IllegalArgumentException(dK.z);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final int h = this.c.h();
        final int f2 = this.c.f();
        final int n = e / h;
        final int n2 = a / f2;
        final L i = new L(n2 * f2, n * h);
        int n11;
        for (int j = 0; j < n; j = n11) {
            final int n3 = j * h;
            int n10;
            for (int k = 0; k < n2; k = n10) {
                final int n4 = k * f2;
                int n9;
                for (int n5 = 0; n5 < h; n5 = n9) {
                    final int n6 = n5 + (1 + j * (h + 2));
                    final int n7 = n3 + n5;
                    int n8 = 0;
                    while (n8 < f2) {
                        if (l.a(n8 + (1 + k * (f2 + 2)), n6)) {
                            i.b(n4 + n8, n7);
                        }
                        ++n8;
                        if (f != 0) {
                            break;
                        }
                    }
                    n9 = n5 + 1;
                    if (f != 0) {
                        break;
                    }
                }
                n10 = k + 1;
                if (f != 0) {
                    break;
                }
            }
            n11 = j + 1;
            if (f != 0) {
                break;
            }
        }
        return i;
    }
    
    boolean b(final int n, final int n2, final int n3, final int n4) {
        int n5;
        int n6;
        if (n < 0) {
            n5 = n + n3;
            n6 = n2 + (4 - (0x7 & n3 + 4));
        }
        else {
            n6 = n2;
            n5 = n;
        }
        if (n6 < 0) {
            n6 += n4;
            n5 += 4 - (0x7 & n4 + 4);
        }
        this.b.b(n6, n5);
        return this.a.a(n6, n5);
    }
    
    byte[] b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/dK.c:Lcom/google/ef;
        //     8: invokevirtual   com/google/ef.g:()I
        //    11: newarray        B
        //    13: astore_2       
        //    14: iconst_4       
        //    15: istore_3       
        //    16: iconst_0       
        //    17: istore          4
        //    19: aload_0        
        //    20: getfield        com/google/dK.a:Lcom/google/L;
        //    23: invokevirtual   com/google/L.a:()I
        //    26: istore          5
        //    28: aload_0        
        //    29: getfield        com/google/dK.a:Lcom/google/L;
        //    32: invokevirtual   com/google/L.g:()I
        //    35: istore          6
        //    37: iconst_0       
        //    38: istore          7
        //    40: iconst_0       
        //    41: istore          8
        //    43: iconst_0       
        //    44: istore          9
        //    46: iconst_0       
        //    47: istore          10
        //    49: iconst_0       
        //    50: istore          11
        //    52: iload_3        
        //    53: iload           5
        //    55: if_icmpne       104
        //    58: iload           4
        //    60: ifne            104
        //    63: iload           7
        //    65: ifne            104
        //    68: iload           11
        //    70: iconst_1       
        //    71: iadd           
        //    72: istore          23
        //    74: aload_2        
        //    75: iload           11
        //    77: aload_0        
        //    78: iload           5
        //    80: iload           6
        //    82: invokevirtual   com/google/dK.d:(II)I
        //    85: i2b            
        //    86: bastore        
        //    87: iinc            3, -2
        //    90: iinc            4, 2
        //    93: iconst_1       
        //    94: istore          7
        //    96: iload_1        
        //    97: ifeq            473
        //   100: iload           23
        //   102: istore          11
        //   104: iload_3        
        //   105: iload           5
        //   107: iconst_2       
        //   108: isub           
        //   109: if_icmpne       165
        //   112: iload           4
        //   114: ifne            165
        //   117: iload           6
        //   119: iconst_3       
        //   120: iand           
        //   121: ifeq            165
        //   124: iload           8
        //   126: ifne            165
        //   129: iload           11
        //   131: iconst_1       
        //   132: iadd           
        //   133: istore          23
        //   135: aload_2        
        //   136: iload           11
        //   138: aload_0        
        //   139: iload           5
        //   141: iload           6
        //   143: invokevirtual   com/google/dK.b:(II)I
        //   146: i2b            
        //   147: bastore        
        //   148: iinc            3, -2
        //   151: iinc            4, 2
        //   154: iconst_1       
        //   155: istore          8
        //   157: iload_1        
        //   158: ifeq            473
        //   161: iload           23
        //   163: istore          11
        //   165: iload_3        
        //   166: iload           5
        //   168: iconst_4       
        //   169: iadd           
        //   170: if_icmpne       228
        //   173: iload           4
        //   175: iconst_2       
        //   176: if_icmpne       228
        //   179: iload           6
        //   181: bipush          7
        //   183: iand           
        //   184: ifne            228
        //   187: iload           9
        //   189: ifne            228
        //   192: iload           11
        //   194: iconst_1       
        //   195: iadd           
        //   196: istore          23
        //   198: aload_2        
        //   199: iload           11
        //   201: aload_0        
        //   202: iload           5
        //   204: iload           6
        //   206: invokevirtual   com/google/dK.a:(II)I
        //   209: i2b            
        //   210: bastore        
        //   211: iinc            3, -2
        //   214: iinc            4, 2
        //   217: iconst_1       
        //   218: istore          9
        //   220: iload_1        
        //   221: ifeq            473
        //   224: iload           23
        //   226: istore          11
        //   228: iload_3        
        //   229: iload           5
        //   231: iconst_2       
        //   232: isub           
        //   233: if_icmpne       562
        //   236: iload           4
        //   238: ifne            562
        //   241: iload           6
        //   243: bipush          7
        //   245: iand           
        //   246: iconst_4       
        //   247: if_icmpne       562
        //   250: iload           10
        //   252: ifne            562
        //   255: iload           11
        //   257: iconst_1       
        //   258: iadd           
        //   259: istore          23
        //   261: aload_2        
        //   262: iload           11
        //   264: aload_0        
        //   265: iload           5
        //   267: iload           6
        //   269: invokevirtual   com/google/dK.c:(II)I
        //   272: i2b            
        //   273: bastore        
        //   274: iinc            3, -2
        //   277: iinc            4, 2
        //   280: iconst_1       
        //   281: istore          10
        //   283: iload_1        
        //   284: ifeq            473
        //   287: iload_3        
        //   288: istore          14
        //   290: iload           4
        //   292: istore          15
        //   294: iload           23
        //   296: istore          13
        //   298: iload           14
        //   300: iload           5
        //   302: if_icmpge       555
        //   305: iload           15
        //   307: iflt            555
        //   310: aload_0        
        //   311: getfield        com/google/dK.b:Lcom/google/L;
        //   314: iload           15
        //   316: iload           14
        //   318: invokevirtual   com/google/L.a:(II)Z
        //   321: ifne            555
        //   324: iload           13
        //   326: iconst_1       
        //   327: iadd           
        //   328: istore          16
        //   330: aload_2        
        //   331: iload           13
        //   333: aload_0        
        //   334: iload           14
        //   336: iload           15
        //   338: iload           5
        //   340: iload           6
        //   342: invokevirtual   com/google/dK.a:(IIII)I
        //   345: i2b            
        //   346: bastore        
        //   347: iinc            14, -2
        //   350: iload           15
        //   352: iconst_2       
        //   353: iadd           
        //   354: istore          17
        //   356: iload           14
        //   358: iflt            368
        //   361: iload           17
        //   363: iload           6
        //   365: if_icmplt       544
        //   368: iload           14
        //   370: iconst_1       
        //   371: iadd           
        //   372: istore          18
        //   374: iload           17
        //   376: iconst_3       
        //   377: iadd           
        //   378: istore          19
        //   380: iload           18
        //   382: istore          20
        //   384: iload           19
        //   386: istore          21
        //   388: iload           16
        //   390: istore          22
        //   392: iload           20
        //   394: iflt            537
        //   397: iload           21
        //   399: iload           6
        //   401: if_icmpge       537
        //   404: aload_0        
        //   405: getfield        com/google/dK.b:Lcom/google/L;
        //   408: iload           21
        //   410: iload           20
        //   412: invokevirtual   com/google/L.a:(II)Z
        //   415: ifne            537
        //   418: iload           22
        //   420: iconst_1       
        //   421: iadd           
        //   422: istore          23
        //   424: aload_2        
        //   425: iload           22
        //   427: aload_0        
        //   428: iload           20
        //   430: iload           21
        //   432: iload           5
        //   434: iload           6
        //   436: invokevirtual   com/google/dK.a:(IIII)I
        //   439: i2b            
        //   440: bastore        
        //   441: iinc            20, 2
        //   444: iload           21
        //   446: iconst_2       
        //   447: isub           
        //   448: istore          24
        //   450: iload           20
        //   452: iload           5
        //   454: if_icmpge       462
        //   457: iload           24
        //   459: ifge            526
        //   462: iload           20
        //   464: iconst_3       
        //   465: iadd           
        //   466: istore_3       
        //   467: iload           24
        //   469: iconst_1       
        //   470: iadd           
        //   471: istore          4
        //   473: iload_3        
        //   474: iload           5
        //   476: if_icmplt       519
        //   479: iload           4
        //   481: iload           6
        //   483: if_icmplt       519
        //   486: iload           23
        //   488: aload_0        
        //   489: getfield        com/google/dK.c:Lcom/google/ef;
        //   492: invokevirtual   com/google/ef.g:()I
        //   495: if_icmpeq       517
        //   498: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   501: athrow         
        //   502: astore          25
        //   504: aload           25
        //   506: athrow         
        //   507: astore          27
        //   509: aload           27
        //   511: athrow         
        //   512: astore          26
        //   514: aload           26
        //   516: athrow         
        //   517: aload_2        
        //   518: areturn        
        //   519: iload           23
        //   521: istore          11
        //   523: goto            52
        //   526: iload           24
        //   528: istore          21
        //   530: iload           23
        //   532: istore          22
        //   534: goto            392
        //   537: iload           22
        //   539: istore          23
        //   541: goto            441
        //   544: iload           17
        //   546: istore          15
        //   548: iload           16
        //   550: istore          13
        //   552: goto            298
        //   555: iload           13
        //   557: istore          16
        //   559: goto            347
        //   562: iload           4
        //   564: istore          12
        //   566: iload           11
        //   568: istore          13
        //   570: iload_3        
        //   571: istore          14
        //   573: iload           12
        //   575: istore          15
        //   577: goto            298
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  310    324    507    512    Ljava/lang/IllegalArgumentException;
        //  330    347    507    512    Ljava/lang/IllegalArgumentException;
        //  404    418    512    517    Ljava/lang/IllegalArgumentException;
        //  424    441    512    517    Ljava/lang/IllegalArgumentException;
        //  486    502    502    507    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0441:
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
    
    int c(final int n, final int n2) {
        int n3;
        if (this.b(n - 3, 0, n, n2)) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4 = n3 << 1;
        if (this.b(n - 2, 0, n, n2)) {
            n4 |= 0x1;
        }
        int n5 = n4 << 1;
        if (this.b(n - 1, 0, n, n2)) {
            n5 |= 0x1;
        }
        int n6 = n5 << 1;
        if (this.b(0, n2 - 2, n, n2)) {
            n6 |= 0x1;
        }
        int n7 = n6 << 1;
        if (this.b(0, n2 - 1, n, n2)) {
            n7 |= 0x1;
        }
        int n8 = n7 << 1;
        if (this.b(1, n2 - 1, n, n2)) {
            n8 |= 0x1;
        }
        int n9 = n8 << 1;
        if (this.b(2, n2 - 1, n, n2)) {
            n9 |= 0x1;
        }
        int n10 = n9 << 1;
        if (this.b(3, n2 - 1, n, n2)) {
            n10 |= 0x1;
        }
        return n10;
    }
    
    int d(final int n, final int n2) {
        int n3;
        if (this.b(n - 1, 0, n, n2)) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        int n4 = n3 << 1;
        if (this.b(n - 1, 1, n, n2)) {
            n4 |= 0x1;
        }
        int n5 = n4 << 1;
        if (this.b(n - 1, 2, n, n2)) {
            n5 |= 0x1;
        }
        int n6 = n5 << 1;
        if (this.b(0, n2 - 2, n, n2)) {
            n6 |= 0x1;
        }
        int n7 = n6 << 1;
        if (this.b(0, n2 - 1, n, n2)) {
            n7 |= 0x1;
        }
        int n8 = n7 << 1;
        if (this.b(1, n2 - 1, n, n2)) {
            n8 |= 0x1;
        }
        int n9 = n8 << 1;
        if (this.b(2, n2 - 1, n, n2)) {
            n9 |= 0x1;
        }
        int n10 = n9 << 1;
        if (this.b(3, n2 - 1, n, n2)) {
            n10 |= 0x1;
        }
        return n10;
    }
}
