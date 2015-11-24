// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class a3 extends a
{
    private static final String[] z;
    final bb a;
    final bf b;
    
    static {
        final String[] z2 = new String[10];
        String s = "\u001f9C(\u001f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '~';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '\'';
                        break;
                    }
                    case 3: {
                        c2 = 'A';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0006%W$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001f5J$\n\u000b,B";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u00009T4\u0013\u0017";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u00015]$";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001b,";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0016)W-\u0017\u0011=S$";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0007.K";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0007.K";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0016)U \n\u001b3I";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a3(final bf b, final bb a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        try {
            if (this.a != null) {
                this.a.a(n);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    @Override
    public void a(final c0 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/whatsapp/protocol/bi.O:I
        //     5: istore          4
        //     7: aload_1        
        //     8: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //    11: iconst_0       
        //    12: aaload         
        //    13: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //    16: astore          5
        //    18: aload           5
        //    20: ifnull          95
        //    23: aload           5
        //    25: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //    28: bipush          7
        //    30: aaload         
        //    31: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    34: astore          24
        //    36: aload           5
        //    38: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //    41: iconst_5       
        //    42: aaload         
        //    43: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    46: astore          25
        //    48: aload           5
        //    50: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //    53: iconst_3       
        //    54: aaload         
        //    55: invokevirtual   com/whatsapp/protocol/c0.c:(Ljava/lang/String;)Ljava/lang/String;
        //    58: astore          26
        //    60: aload           26
        //    62: ifnonnull       348
        //    65: iconst_0       
        //    66: istore          28
        //    68: aload_0        
        //    69: getfield        com/whatsapp/protocol/a3.a:Lcom/whatsapp/protocol/bb;
        //    72: ifnull          90
        //    75: aload_0        
        //    76: getfield        com/whatsapp/protocol/a3.a:Lcom/whatsapp/protocol/bb;
        //    79: aload           24
        //    81: aload           25
        //    83: iload           28
        //    85: invokeinterface com/whatsapp/protocol/bb.a:(Ljava/lang/String;Ljava/lang/String;I)V
        //    90: iload           4
        //    92: ifeq            347
        //    95: aload_1        
        //    96: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //    99: bipush          6
        //   101: aaload         
        //   102: invokevirtual   com/whatsapp/protocol/c0.b:(Ljava/lang/String;)Lcom/whatsapp/protocol/c0;
        //   105: astore          6
        //   107: aload           6
        //   109: ifnull          347
        //   112: aload           6
        //   114: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   117: astore          8
        //   119: aload           8
        //   121: ifnull          347
        //   124: new             Lcom/whatsapp/protocol/cb;
        //   127: dup            
        //   128: invokespecial   com/whatsapp/protocol/cb.<init>:()V
        //   131: astore          9
        //   133: iload_3        
        //   134: aload           6
        //   136: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   139: arraylength    
        //   140: if_icmpge       329
        //   143: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //   146: iconst_1       
        //   147: aaload         
        //   148: aload           6
        //   150: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   153: iload_3        
        //   154: aaload         
        //   155: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //   158: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   161: ifeq            187
        //   164: aload           9
        //   166: aload           6
        //   168: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   171: iload_3        
        //   172: aaload         
        //   173: getfield        com/whatsapp/protocol/bm.b:Ljava/lang/String;
        //   176: invokestatic    com/whatsapp/protocol/bi.a:(Ljava/lang/String;)B
        //   179: putfield        com/whatsapp/protocol/cb.f:B
        //   182: iload           4
        //   184: ifeq            321
        //   187: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //   190: iconst_2       
        //   191: aaload         
        //   192: aload           6
        //   194: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   197: iload_3        
        //   198: aaload         
        //   199: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //   202: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   205: istore          17
        //   207: iload           17
        //   209: ifeq            232
        //   212: aload           9
        //   214: aload           6
        //   216: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   219: iload_3        
        //   220: aaload         
        //   221: getfield        com/whatsapp/protocol/bm.b:Ljava/lang/String;
        //   224: putfield        com/whatsapp/protocol/cb.c:Ljava/lang/String;
        //   227: iload           4
        //   229: ifeq            321
        //   232: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //   235: bipush          8
        //   237: aaload         
        //   238: aload           6
        //   240: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   243: iload_3        
        //   244: aaload         
        //   245: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //   248: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   251: istore          18
        //   253: iload           18
        //   255: ifeq            278
        //   258: aload           9
        //   260: aload           6
        //   262: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   265: iload_3        
        //   266: aaload         
        //   267: getfield        com/whatsapp/protocol/bm.b:Ljava/lang/String;
        //   270: putfield        com/whatsapp/protocol/cb.a:Ljava/lang/String;
        //   273: iload           4
        //   275: ifeq            321
        //   278: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //   281: iconst_4       
        //   282: aaload         
        //   283: aload           6
        //   285: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   288: iload_3        
        //   289: aaload         
        //   290: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //   293: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   296: istore          19
        //   298: iload           19
        //   300: ifeq            417
        //   303: aload           9
        //   305: aload           6
        //   307: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   310: iload_3        
        //   311: aaload         
        //   312: getfield        com/whatsapp/protocol/bm.b:Ljava/lang/String;
        //   315: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   318: putfield        com/whatsapp/protocol/cb.d:J
        //   321: iinc            3, 1
        //   324: iload           4
        //   326: ifeq            133
        //   329: aload_0        
        //   330: getfield        com/whatsapp/protocol/a3.a:Lcom/whatsapp/protocol/bb;
        //   333: ifnull          347
        //   336: aload_0        
        //   337: getfield        com/whatsapp/protocol/a3.a:Lcom/whatsapp/protocol/bb;
        //   340: aload           9
        //   342: invokeinterface com/whatsapp/protocol/bb.a:(Lcom/whatsapp/protocol/cb;)V
        //   347: return         
        //   348: aload           26
        //   350: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   353: istore          30
        //   355: iload           30
        //   357: istore          28
        //   359: goto            68
        //   362: astore          27
        //   364: iconst_0       
        //   365: istore          28
        //   367: goto            68
        //   370: astore          29
        //   372: aload           29
        //   374: athrow         
        //   375: astore          7
        //   377: aload           7
        //   379: athrow         
        //   380: astore          11
        //   382: aload           11
        //   384: athrow         
        //   385: astore          12
        //   387: aload           12
        //   389: athrow         
        //   390: astore          13
        //   392: aload           13
        //   394: athrow         
        //   395: astore          14
        //   397: aload           14
        //   399: athrow         
        //   400: astore          15
        //   402: aload           15
        //   404: athrow         
        //   405: astore          16
        //   407: aload           16
        //   409: athrow         
        //   410: astore          23
        //   412: iload           4
        //   414: ifeq            321
        //   417: getstatic       com/whatsapp/protocol/a3.z:[Ljava/lang/String;
        //   420: bipush          9
        //   422: aaload         
        //   423: aload           6
        //   425: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   428: iload_3        
        //   429: aaload         
        //   430: getfield        com/whatsapp/protocol/bm.a:Ljava/lang/String;
        //   433: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   436: istore          21
        //   438: iload           21
        //   440: ifeq            321
        //   443: aload           9
        //   445: aload           6
        //   447: getfield        com/whatsapp/protocol/c0.c:[Lcom/whatsapp/protocol/bm;
        //   450: iload_3        
        //   451: aaload         
        //   452: getfield        com/whatsapp/protocol/bm.b:Ljava/lang/String;
        //   455: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   458: putfield        com/whatsapp/protocol/cb.e:I
        //   461: goto            321
        //   464: astore          22
        //   466: goto            321
        //   469: astore          20
        //   471: aload           20
        //   473: athrow         
        //   474: astore          10
        //   476: aload           10
        //   478: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  68     90     370    375    Ljava/lang/NumberFormatException;
        //  112    119    375    380    Ljava/lang/NumberFormatException;
        //  143    182    380    385    Ljava/lang/NumberFormatException;
        //  187    207    385    390    Ljava/lang/NumberFormatException;
        //  212    227    390    395    Ljava/lang/NumberFormatException;
        //  232    253    395    400    Ljava/lang/NumberFormatException;
        //  258    273    400    405    Ljava/lang/NumberFormatException;
        //  278    298    405    410    Ljava/lang/NumberFormatException;
        //  303    321    410    417    Ljava/lang/NumberFormatException;
        //  329    347    474    479    Ljava/lang/NumberFormatException;
        //  348    355    362    370    Ljava/lang/NumberFormatException;
        //  382    385    385    390    Ljava/lang/NumberFormatException;
        //  387    390    390    395    Ljava/lang/NumberFormatException;
        //  392    395    395    400    Ljava/lang/NumberFormatException;
        //  397    400    400    405    Ljava/lang/NumberFormatException;
        //  402    405    405    410    Ljava/lang/NumberFormatException;
        //  417    438    469    474    Ljava/lang/NumberFormatException;
        //  443    461    464    469    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 226, Size: 226
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
