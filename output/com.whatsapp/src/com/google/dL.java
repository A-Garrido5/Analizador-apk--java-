// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.io.UnsupportedEncodingException;
import java.util.Map;

final class dL
{
    private static final char[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "oG$\u0006";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = '<';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = 'U';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "{O_f\u0012\u000e";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':' };
    }
    
    private static char a(final int n) {
        try {
            if (n >= dL.a.length) {
                throw fD.a();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return dL.a[n];
    }
    
    private static int a(final aL al) {
        final int a = al.a(8);
        if ((a & 0x80) == 0x0) {
            return a & 0x7F;
        }
        if ((a & 0xC0) == 0x80) {
            return al.a(8) | (a & 0x3F) << 8;
        }
        if ((a & 0xE0) == 0xC0) {
            return al.a(16) | (a & 0x1F) << 16;
        }
        throw fD.a();
    }
    
    static aS a(final byte[] p0, final bE p1, final e p2, final Map p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/bE.e:I
        //     3: istore          4
        //     5: new             Lcom/google/aL;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   com/google/aL.<init>:([B)V
        //    13: astore          5
        //    15: new             Ljava/lang/StringBuilder;
        //    18: dup            
        //    19: bipush          50
        //    21: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    24: astore          6
        //    26: new             Ljava/util/ArrayList;
        //    29: dup            
        //    30: iconst_1       
        //    31: invokespecial   java/util/ArrayList.<init>:(I)V
        //    34: astore          7
        //    36: iconst_m1      
        //    37: istore          8
        //    39: iconst_0       
        //    40: istore          9
        //    42: aconst_null    
        //    43: astore          10
        //    45: iconst_m1      
        //    46: istore          11
        //    48: aload           5
        //    50: invokevirtual   com/google/aL.c:()I
        //    53: iconst_4       
        //    54: if_icmpge       67
        //    57: getstatic       com/google/eZ.TERMINATOR:Lcom/google/eZ;
        //    60: astore          58
        //    62: iload           4
        //    64: ifeq            624
        //    67: aload           5
        //    69: iconst_4       
        //    70: invokevirtual   com/google/aL.a:(I)I
        //    73: invokestatic    com/google/eZ.forBits:(I)Lcom/google/eZ;
        //    76: astore          13
        //    78: aload           13
        //    80: astore          14
        //    82: aload           14
        //    84: getstatic       com/google/eZ.TERMINATOR:Lcom/google/eZ;
        //    87: if_acmpeq       605
        //    90: getstatic       com/google/eZ.FNC1_FIRST_POSITION:Lcom/google/eZ;
        //    93: astore          27
        //    95: aload           14
        //    97: aload           27
        //    99: if_acmpeq       114
        //   102: getstatic       com/google/eZ.FNC1_SECOND_POSITION:Lcom/google/eZ;
        //   105: astore          57
        //   107: aload           14
        //   109: aload           57
        //   111: if_acmpne       122
        //   114: iconst_1       
        //   115: istore          9
        //   117: iload           4
        //   119: ifeq            605
        //   122: iload           9
        //   124: istore          28
        //   126: getstatic       com/google/eZ.STRUCTURED_APPEND:Lcom/google/eZ;
        //   129: astore          32
        //   131: aload           14
        //   133: aload           32
        //   135: if_acmpne       214
        //   138: aload           5
        //   140: invokevirtual   com/google/aL.c:()I
        //   143: istore          55
        //   145: iload           55
        //   147: bipush          16
        //   149: if_icmpge       187
        //   152: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   155: athrow         
        //   156: astore          31
        //   158: aload           31
        //   160: athrow         
        //   161: astore          12
        //   163: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   166: athrow         
        //   167: astore          15
        //   169: aload           15
        //   171: athrow         
        //   172: astore          16
        //   174: aload           16
        //   176: athrow         
        //   177: astore          29
        //   179: aload           29
        //   181: athrow         
        //   182: astore          30
        //   184: aload           30
        //   186: athrow         
        //   187: aload           5
        //   189: bipush          8
        //   191: invokevirtual   com/google/aL.a:(I)I
        //   194: istore          8
        //   196: aload           5
        //   198: bipush          8
        //   200: invokevirtual   com/google/aL.a:(I)I
        //   203: istore          56
        //   205: iload           56
        //   207: istore          11
        //   209: iload           4
        //   211: ifeq            499
        //   214: iload           11
        //   216: istore          17
        //   218: iload           8
        //   220: istore          33
        //   222: getstatic       com/google/eZ.ECI:Lcom/google/eZ;
        //   225: astore          35
        //   227: aload           14
        //   229: aload           35
        //   231: if_acmpne       598
        //   234: aload           5
        //   236: invokestatic    com/google/dL.a:(Lcom/google/aL;)I
        //   239: invokestatic    com/google/e4.getCharacterSetECIByValue:(I)Lcom/google/e4;
        //   242: astore          53
        //   244: aload           53
        //   246: astore          20
        //   248: aload           20
        //   250: ifnonnull       267
        //   253: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   256: athrow         
        //   257: astore          54
        //   259: aload           54
        //   261: athrow         
        //   262: astore          34
        //   264: aload           34
        //   266: athrow         
        //   267: iload           4
        //   269: ifeq            650
        //   272: getstatic       com/google/eZ.HANZI:Lcom/google/eZ;
        //   275: astore          37
        //   277: aload           14
        //   279: aload           37
        //   281: if_acmpne       325
        //   284: aload           5
        //   286: iconst_4       
        //   287: invokevirtual   com/google/aL.a:(I)I
        //   290: istore          50
        //   292: aload           5
        //   294: aload           14
        //   296: aload_1        
        //   297: invokevirtual   com/google/eZ.getCharacterCountBits:(Lcom/google/bE;)I
        //   300: invokevirtual   com/google/aL.a:(I)I
        //   303: istore          51
        //   305: iload           50
        //   307: iconst_1       
        //   308: if_icmpne       320
        //   311: aload           5
        //   313: aload           6
        //   315: iload           51
        //   317: invokestatic    com/google/dL.c:(Lcom/google/aL;Ljava/lang/StringBuilder;I)V
        //   320: iload           4
        //   322: ifeq            650
        //   325: aload           5
        //   327: aload           14
        //   329: aload_1        
        //   330: invokevirtual   com/google/eZ.getCharacterCountBits:(Lcom/google/bE;)I
        //   333: invokevirtual   com/google/aL.a:(I)I
        //   336: istore          38
        //   338: aload           14
        //   340: getstatic       com/google/eZ.NUMERIC:Lcom/google/eZ;
        //   343: if_acmpne       360
        //   346: aload           5
        //   348: aload           6
        //   350: iload           38
        //   352: invokestatic    com/google/dL.b:(Lcom/google/aL;Ljava/lang/StringBuilder;I)V
        //   355: iload           4
        //   357: ifeq            650
        //   360: getstatic       com/google/eZ.ALPHANUMERIC:Lcom/google/eZ;
        //   363: astore          47
        //   365: aload           14
        //   367: aload           47
        //   369: if_acmpne       388
        //   372: aload           5
        //   374: aload           6
        //   376: iload           38
        //   378: iload           28
        //   380: invokestatic    com/google/dL.a:(Lcom/google/aL;Ljava/lang/StringBuilder;IZ)V
        //   383: iload           4
        //   385: ifeq            650
        //   388: getstatic       com/google/eZ.BYTE:Lcom/google/eZ;
        //   391: astore          48
        //   393: aload           14
        //   395: aload           48
        //   397: if_acmpne       419
        //   400: aload           5
        //   402: aload           6
        //   404: iload           38
        //   406: aload           20
        //   408: aload           7
        //   410: aload_3        
        //   411: invokestatic    com/google/dL.a:(Lcom/google/aL;Ljava/lang/StringBuilder;ILcom/google/e4;Ljava/util/Collection;Ljava/util/Map;)V
        //   414: iload           4
        //   416: ifeq            650
        //   419: getstatic       com/google/eZ.KANJI:Lcom/google/eZ;
        //   422: astore          49
        //   424: aload           14
        //   426: aload           49
        //   428: if_acmpne       445
        //   431: aload           5
        //   433: aload           6
        //   435: iload           38
        //   437: invokestatic    com/google/dL.a:(Lcom/google/aL;Ljava/lang/StringBuilder;I)V
        //   440: iload           4
        //   442: ifeq            650
        //   445: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   448: athrow         
        //   449: astore          46
        //   451: aload           46
        //   453: athrow         
        //   454: astore          36
        //   456: aload           36
        //   458: athrow         
        //   459: astore          52
        //   461: aload           52
        //   463: athrow         
        //   464: astore          39
        //   466: aload           39
        //   468: athrow         
        //   469: astore          40
        //   471: aload           40
        //   473: athrow         
        //   474: astore          41
        //   476: aload           41
        //   478: athrow         
        //   479: astore          42
        //   481: aload           42
        //   483: athrow         
        //   484: astore          43
        //   486: aload           43
        //   488: athrow         
        //   489: astore          44
        //   491: aload           44
        //   493: athrow         
        //   494: astore          45
        //   496: aload           45
        //   498: athrow         
        //   499: iload           11
        //   501: istore          17
        //   503: iload           8
        //   505: istore          19
        //   507: iload           28
        //   509: istore          18
        //   511: aload           10
        //   513: astore          20
        //   515: getstatic       com/google/eZ.TERMINATOR:Lcom/google/eZ;
        //   518: astore          21
        //   520: aload           14
        //   522: aload           21
        //   524: if_acmpne       631
        //   527: aload           6
        //   529: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   532: astore          23
        //   534: aload           7
        //   536: invokeinterface java/util/List.isEmpty:()Z
        //   541: istore          24
        //   543: iload           24
        //   545: ifeq            582
        //   548: aconst_null    
        //   549: astore          25
        //   551: aload_2        
        //   552: ifnonnull       589
        //   555: aconst_null    
        //   556: astore          26
        //   558: new             Lcom/google/aS;
        //   561: dup            
        //   562: aload_0        
        //   563: aload           23
        //   565: aload           25
        //   567: aload           26
        //   569: iload           19
        //   571: iload           17
        //   573: invokespecial   com/google/aS.<init>:([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V
        //   576: areturn        
        //   577: astore          22
        //   579: aload           22
        //   581: athrow         
        //   582: aload           7
        //   584: astore          25
        //   586: goto            551
        //   589: aload_2        
        //   590: invokevirtual   com/google/e.toString:()Ljava/lang/String;
        //   593: astore          26
        //   595: goto            558
        //   598: aload           10
        //   600: astore          20
        //   602: goto            272
        //   605: iload           11
        //   607: istore          17
        //   609: iload           9
        //   611: istore          18
        //   613: iload           8
        //   615: istore          19
        //   617: aload           10
        //   619: astore          20
        //   621: goto            515
        //   624: aload           58
        //   626: astore          14
        //   628: goto            82
        //   631: aload           20
        //   633: astore          10
        //   635: iload           19
        //   637: istore          8
        //   639: iload           18
        //   641: istore          9
        //   643: iload           17
        //   645: istore          11
        //   647: goto            48
        //   650: iload           28
        //   652: istore          18
        //   654: iload           33
        //   656: istore          19
        //   658: goto            515
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  48     62     161    167    Ljava/lang/IllegalArgumentException;
        //  67     78     161    167    Ljava/lang/IllegalArgumentException;
        //  82     95     167    172    Ljava/lang/IllegalArgumentException;
        //  102    107    172    177    Ljava/lang/IllegalArgumentException;
        //  126    131    177    182    Ljava/lang/IllegalArgumentException;
        //  138    145    182    187    Ljava/lang/IllegalArgumentException;
        //  152    156    156    161    Ljava/lang/IllegalArgumentException;
        //  158    161    161    167    Ljava/lang/IllegalArgumentException;
        //  169    172    172    177    Ljava/lang/IllegalArgumentException;
        //  174    177    161    167    Ljava/lang/IllegalArgumentException;
        //  179    182    182    187    Ljava/lang/IllegalArgumentException;
        //  184    187    156    161    Ljava/lang/IllegalArgumentException;
        //  187    205    161    167    Ljava/lang/IllegalArgumentException;
        //  222    227    262    267    Ljava/lang/IllegalArgumentException;
        //  234    244    161    167    Ljava/lang/IllegalArgumentException;
        //  253    257    257    262    Ljava/lang/IllegalArgumentException;
        //  259    262    161    167    Ljava/lang/IllegalArgumentException;
        //  264    267    161    167    Ljava/lang/IllegalArgumentException;
        //  272    277    454    459    Ljava/lang/IllegalArgumentException;
        //  284    305    161    167    Ljava/lang/IllegalArgumentException;
        //  311    320    459    464    Ljava/lang/IllegalArgumentException;
        //  325    338    161    167    Ljava/lang/IllegalArgumentException;
        //  338    355    464    469    Ljava/lang/IllegalArgumentException;
        //  360    365    469    474    Ljava/lang/IllegalArgumentException;
        //  372    383    474    479    Ljava/lang/IllegalArgumentException;
        //  388    393    479    484    Ljava/lang/IllegalArgumentException;
        //  400    414    484    489    Ljava/lang/IllegalArgumentException;
        //  419    424    489    494    Ljava/lang/IllegalArgumentException;
        //  431    440    494    499    Ljava/lang/IllegalArgumentException;
        //  445    449    449    454    Ljava/lang/IllegalArgumentException;
        //  451    454    161    167    Ljava/lang/IllegalArgumentException;
        //  456    459    161    167    Ljava/lang/IllegalArgumentException;
        //  461    464    161    167    Ljava/lang/IllegalArgumentException;
        //  466    469    469    474    Ljava/lang/IllegalArgumentException;
        //  471    474    474    479    Ljava/lang/IllegalArgumentException;
        //  476    479    479    484    Ljava/lang/IllegalArgumentException;
        //  481    484    484    489    Ljava/lang/IllegalArgumentException;
        //  486    489    489    494    Ljava/lang/IllegalArgumentException;
        //  491    494    494    499    Ljava/lang/IllegalArgumentException;
        //  496    499    449    454    Ljava/lang/IllegalArgumentException;
        //  515    520    161    167    Ljava/lang/IllegalArgumentException;
        //  527    543    577    582    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 313, Size: 313
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
    
    private static void a(final aL al, final StringBuilder sb, int n) {
        final int e = bE.e;
        final int n2 = n * 13;
        try {
            if (n2 > al.c()) {
                throw fD.a();
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw ex;
        }
        final byte[] array = new byte[n * 2];
        int n3 = 0;
        while (true) {
            final int n5;
            Label_0154: {
                if (n > 0) {
                    final int a = al.a(13);
                    int n4 = a / 192 << 8 | a % 192;
                    Label_0094: {
                        if (n4 < 7936) {
                            n4 += 33088;
                            if (e == 0) {
                                break Label_0094;
                            }
                        }
                        n4 += 49472;
                    }
                    array[n3] = (byte)(n4 >> 8);
                    array[n3 + 1] = (byte)n4;
                    n5 = n3 + 2;
                    --n;
                    if (e == 0) {
                        break Label_0154;
                    }
                }
                try {
                    sb.append(new String(array, dL.z[0]));
                    return;
                }
                catch (UnsupportedEncodingException ex2) {
                    throw fD.a();
                }
            }
            n3 = n5;
        }
    }
    
    private static void a(final aL al, final StringBuilder sb, final int n, final e4 e4, final Collection collection, final Map map) {
        final int e5 = bE.e;
        final int n2 = n * 8;
        try {
            if (n2 > al.c()) {
                throw fD.a();
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw ex;
        }
        final byte[] array = new byte[n];
        int i = 0;
        while (i < n) {
            array[i] = (byte)al.a(8);
            ++i;
            if (e5 != 0) {
                break;
            }
        }
        Label_0103: {
            if (e4 != null) {
                break Label_0103;
            }
            String s = bR.a(array, map);
            try {
                while (true) {
                    sb.append(new String(array, s));
                    collection.add(array);
                    return;
                    s = e4.name();
                    continue;
                }
            }
            catch (UnsupportedEncodingException ex2) {
                throw fD.a();
            }
        }
    }
    
    private static void a(final aL p0, final StringBuilder p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/bE.e:I
        //     3: istore          4
        //     5: aload_1        
        //     6: invokevirtual   java/lang/StringBuilder.length:()I
        //     9: istore          5
        //    11: iload_2        
        //    12: istore          6
        //    14: iload           6
        //    16: iconst_1       
        //    17: if_icmple       80
        //    20: aload_0        
        //    21: invokevirtual   com/google/aL.c:()I
        //    24: bipush          11
        //    26: if_icmpge       38
        //    29: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //    32: athrow         
        //    33: astore          19
        //    35: aload           19
        //    37: athrow         
        //    38: aload_0        
        //    39: bipush          11
        //    41: invokevirtual   com/google/aL.a:(I)I
        //    44: istore          20
        //    46: aload_1        
        //    47: iload           20
        //    49: bipush          45
        //    51: idiv           
        //    52: invokestatic    com/google/dL.a:(I)C
        //    55: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    58: pop            
        //    59: aload_1        
        //    60: iload           20
        //    62: bipush          45
        //    64: irem           
        //    65: invokestatic    com/google/dL.a:(I)C
        //    68: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    71: pop            
        //    72: iinc            6, -2
        //    75: iload           4
        //    77: ifeq            14
        //    80: iload           6
        //    82: iconst_1       
        //    83: if_icmpne       118
        //    86: aload_0        
        //    87: invokevirtual   com/google/aL.c:()I
        //    90: bipush          6
        //    92: if_icmpge       104
        //    95: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //    98: athrow         
        //    99: astore          17
        //   101: aload           17
        //   103: athrow         
        //   104: aload_1        
        //   105: aload_0        
        //   106: bipush          6
        //   108: invokevirtual   com/google/aL.a:(I)I
        //   111: invokestatic    com/google/dL.a:(I)C
        //   114: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   117: pop            
        //   118: iload_3        
        //   119: ifeq            216
        //   122: iload           5
        //   124: aload_1        
        //   125: invokevirtual   java/lang/StringBuilder.length:()I
        //   128: if_icmpge       216
        //   131: aload_1        
        //   132: iload           5
        //   134: invokevirtual   java/lang/StringBuilder.charAt:(I)C
        //   137: istore          11
        //   139: iload           11
        //   141: bipush          37
        //   143: if_icmpne       208
        //   146: aload_1        
        //   147: invokevirtual   java/lang/StringBuilder.length:()I
        //   150: istore          12
        //   152: iload           5
        //   154: iload           12
        //   156: iconst_1       
        //   157: isub           
        //   158: if_icmpge       200
        //   161: iload           5
        //   163: iconst_1       
        //   164: iadd           
        //   165: istore          13
        //   167: aload_1        
        //   168: iload           13
        //   170: invokevirtual   java/lang/StringBuilder.charAt:(I)C
        //   173: istore          14
        //   175: iload           14
        //   177: bipush          37
        //   179: if_icmpne       200
        //   182: iload           5
        //   184: iconst_1       
        //   185: iadd           
        //   186: istore          15
        //   188: aload_1        
        //   189: iload           15
        //   191: invokevirtual   java/lang/StringBuilder.deleteCharAt:(I)Ljava/lang/StringBuilder;
        //   194: pop            
        //   195: iload           4
        //   197: ifeq            208
        //   200: aload_1        
        //   201: iload           5
        //   203: bipush          29
        //   205: invokevirtual   java/lang/StringBuilder.setCharAt:(IC)V
        //   208: iinc            5, 1
        //   211: iload           4
        //   213: ifeq            122
        //   216: return         
        //   217: astore          7
        //   219: aload           7
        //   221: athrow         
        //   222: astore          8
        //   224: aload           8
        //   226: athrow         
        //   227: astore          9
        //   229: aload           9
        //   231: athrow         
        //   232: astore          10
        //   234: aload           10
        //   236: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  20     33     33     38     Ljava/lang/IllegalArgumentException;
        //  86     99     99     104    Ljava/lang/IllegalArgumentException;
        //  131    139    217    222    Ljava/lang/IllegalArgumentException;
        //  146    152    222    227    Ljava/lang/IllegalArgumentException;
        //  167    175    227    232    Ljava/lang/IllegalArgumentException;
        //  188    195    232    237    Ljava/lang/IllegalArgumentException;
        //  200    208    232    237    Ljava/lang/IllegalArgumentException;
        //  219    222    222    227    Ljava/lang/IllegalArgumentException;
        //  224    227    227    232    Ljava/lang/IllegalArgumentException;
        //  229    232    232    237    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 121, Size: 121
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
    
    private static void b(final aL al, final StringBuilder sb, final int n) {
        final int e = bE.e;
        int i = n;
        while (i >= 3) {
            try {
                if (al.c() < 10) {
                    throw fD.a();
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final int a = al.a(10);
            if (a >= 1000) {
                try {
                    throw fD.a();
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            sb.append(a(a / 100));
            sb.append(a(a / 10 % 10));
            sb.append(a(a % 10));
            i -= 3;
            if (e != 0) {
                break;
            }
        }
        Label_0183: {
            if (i != 2) {
                break Label_0183;
            }
            try {
                if (al.c() < 7) {
                    throw fD.a();
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            final int a2 = al.a(7);
            if (a2 >= 100) {
                try {
                    throw fD.a();
                }
                catch (IllegalArgumentException ex4) {
                    throw ex4;
                }
            }
            try {
                sb.append(a(a2 / 10));
                sb.append(a(a2 % 10));
                if (e == 0) {
                    return;
                }
                if (i != 1) {
                    return;
                }
                try {
                    if (al.c() < 4) {
                        throw fD.a();
                    }
                }
                catch (IllegalArgumentException ex5) {
                    throw ex5;
                }
            }
            catch (IllegalArgumentException ex6) {
                try {
                    throw ex6;
                }
                catch (IllegalArgumentException ex7) {
                    throw ex7;
                }
            }
        }
        final int a3 = al.a(4);
        if (a3 >= 10) {
            try {
                throw fD.a();
            }
            catch (IllegalArgumentException ex8) {
                throw ex8;
            }
        }
        sb.append(a(a3));
    }
    
    private static void c(final aL al, final StringBuilder sb, int n) {
        final int e = bE.e;
        final int n2 = n * 13;
        try {
            if (n2 > al.c()) {
                throw fD.a();
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw ex;
        }
        final byte[] array = new byte[n * 2];
        int n3 = 0;
        while (true) {
            final int n5;
            Label_0160: {
                if (n > 0) {
                    final int a = al.a(13);
                    int n4 = a / 96 << 8 | a % 96;
                    Label_0092: {
                        if (n4 < 959) {
                            n4 += 41377;
                            if (e == 0) {
                                break Label_0092;
                            }
                        }
                        n4 += 42657;
                    }
                    array[n3] = (byte)(0xFF & n4 >> 8);
                    array[n3 + 1] = (byte)(n4 & 0xFF);
                    n5 = n3 + 2;
                    --n;
                    if (e == 0) {
                        break Label_0160;
                    }
                }
                try {
                    sb.append(new String(array, dL.z[1]));
                    return;
                }
                catch (UnsupportedEncodingException ex2) {
                    throw fD.a();
                }
            }
            n3 = n5;
        }
    }
}
