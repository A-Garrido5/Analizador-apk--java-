// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.List;

public class O
{
    private static final String[] z;
    private Long a;
    private final j b;
    private Long c;
    private boolean d;
    private List e;
    private final long f;
    
    static {
        final String[] z2 = new String[9];
        final char[] charArray = "\u0005&H\u001dy\u000f&\u001b\ry\u0006-T\u001a8\n&\u001b\u0000m\u0004/".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0018';
                    break;
                }
                case 0: {
                    c2 = 'h';
                    break;
                }
                case 1: {
                    c2 = 'C';
                    break;
                }
                case 2: {
                    c2 = ';';
                    break;
                }
                case 3: {
                    c2 = 'n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "-1I\u0001jRcA\u000bj\u0007cT\u001cq\u000fcO\u0007u\rc\u0016C8\u000b\"U\u0000w\u001ccX\u0001u\u00186O\u000b8\f&W\u000fa".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0018';
                    break;
                }
                case 0: {
                    c4 = 'h';
                    break;
                }
                case 1: {
                    c4 = 'C';
                    break;
                }
                case 2: {
                    c4 = ';';
                    break;
                }
                case 3: {
                    c4 = 'n';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "-1I\u0001jRct\u001cq\u000f\u0017R\u0003}H}\u001b*}\u001b7i\rn<*V\u000b".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0018';
                    break;
                }
                case 0: {
                    c6 = 'h';
                    break;
                }
                case 1: {
                    c6 = 'C';
                    break;
                }
                case 2: {
                    c6 = ';';
                    break;
                }
                case 3: {
                    c6 = 'n';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "!-]\u0001\"H3I\u0001{\r0H\u0007v\u000fcO\u0007u\rc\u0005Nl\u00077Z\u00028\u0006&O\u0019w\u001a(\u001b\u001aq\u0005&\u001b\faHr\u001b\u0003kHn\u0005Ny\u001b0N\u0003}H9^\u001cwH'^\u0002y\u0011".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0018';
                    break;
                }
                case 0: {
                    c8 = 'h';
                    break;
                }
                case 1: {
                    c8 = 'C';
                    break;
                }
                case 2: {
                    c8 = ';';
                    break;
                }
                case 3: {
                    c8 = 'n';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "-1I\u0001jRcA\u000bj\u0007cT\u001cq\u000fcO\u0007u\rc\u0016C8\u000b\"U\u0000w\u001ccX\u0001u\u00186O\u000b8\f&W\u000faG,]\bk\r7".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0018';
                    break;
                }
                case 0: {
                    c10 = 'h';
                    break;
                }
                case 1: {
                    c10 = 'C';
                    break;
                }
                case 2: {
                    c10 = ';';
                    break;
                }
                case 3: {
                    c10 = 'n';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "?\"I\u0000q\u0006$\u0001Nb\r1TNj\u000b5u\u001ah<*V\u000b8\u00071\u001b\u0016u\u00017u\u001ah<*V\u000b".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u0018';
                    break;
                }
                case 0: {
                    c12 = 'h';
                    break;
                }
                case 1: {
                    c12 = 'C';
                    break;
                }
                case 2: {
                    c12 = ';';
                    break;
                }
                case 3: {
                    c12 = 'n';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "?\"I\u0000q\u0006$\u0001Nh\u001a,X\u000bk\u001b*U\t8\u001c*V\u000b8VcO\u0001l\t/\u001b\u0000}\u001c4T\u001csH7R\u0003}".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u0018';
                    break;
                }
                case 0: {
                    c14 = 'h';
                    break;
                }
                case 1: {
                    c14 = 'C';
                    break;
                }
                case 2: {
                    c14 = ';';
                    break;
                }
                case 3: {
                    c14 = 'n';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "-1I\u0001jRcC\u0003q\u001c\u0017R\u0003}H\u007f\u001b\u001c{\u001e\u0017R\u0003}".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\u0018';
                    break;
                }
                case 0: {
                    c16 = 'h';
                    break;
                }
                case 1: {
                    c16 = 'C';
                    break;
                }
                case 2: {
                    c16 = ';';
                    break;
                }
                case 3: {
                    c16 = 'n';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "-1I\u0001jRct\u001cq\u000f\u0017R\u0003}H}\u001b*}\u001b7i\rn<*V\u000b".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\u0018';
                    break;
                }
                case 0: {
                    c18 = 'h';
                    break;
                }
                case 1: {
                    c18 = 'C';
                    break;
                }
                case 2: {
                    c18 = ';';
                    break;
                }
                case 3: {
                    c18 = 'n';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        z = z2;
    }
    
    public O(final j b, final long f, final List e, final boolean b2) {
        if (b == null) {
            throw new IllegalArgumentException(O.z[0]);
        }
        try {
            this.f = f;
            this.b = b;
            this.e = e;
            if (b2) {
                this.b();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public O(final j j, final long n, final boolean b) {
        this(j, n, null, b);
    }
    
    public Long a() {
        return this.c;
    }
    
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/b.f:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        org/O.d:Z
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            17
        //    13: return         
        //    14: astore_2       
        //    15: aload_2        
        //    16: athrow         
        //    17: aload_0        
        //    18: iconst_1       
        //    19: putfield        org/O.d:Z
        //    22: aload_0        
        //    23: getfield        org/O.e:Ljava/util/List;
        //    26: ifnonnull       40
        //    29: aload_0        
        //    30: new             Ljava/util/ArrayList;
        //    33: dup            
        //    34: invokespecial   java/util/ArrayList.<init>:()V
        //    37: putfield        org/O.e:Ljava/util/List;
        //    40: aload_0        
        //    41: getfield        org/O.b:Lorg/j;
        //    44: invokeinterface org/j.c:()Lorg/b;
        //    49: astore          5
        //    51: aload           5
        //    53: invokevirtual   org/b.f:()J
        //    56: lstore          6
        //    58: aload_0        
        //    59: getfield        org/O.b:Lorg/j;
        //    62: invokeinterface org/j.a:()Lorg/b;
        //    67: astore          8
        //    69: aload           8
        //    71: invokevirtual   org/b.f:()J
        //    74: lstore          9
        //    76: aload_0        
        //    77: getfield        org/O.b:Lorg/j;
        //    80: invokeinterface org/j.b:()Lorg/b;
        //    85: astore          11
        //    87: aload           11
        //    89: invokevirtual   org/b.f:()J
        //    92: lstore          12
        //    94: aload           5
        //    96: invokevirtual   org/b.h:()J
        //    99: lstore          22
        //   101: lload           22
        //   103: lconst_0       
        //   104: lcmp           
        //   105: ifne            174
        //   108: aload           11
        //   110: invokevirtual   org/b.h:()J
        //   113: lstore          50
        //   115: lload           50
        //   117: lconst_0       
        //   118: lcmp           
        //   119: ifeq            155
        //   122: aload_0        
        //   123: lload           12
        //   125: aload_0        
        //   126: getfield        org/O.f:J
        //   129: lsub           
        //   130: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   133: putfield        org/O.c:Ljava/lang/Long;
        //   136: aload_0        
        //   137: getfield        org/O.e:Ljava/util/List;
        //   140: getstatic       org/O.z:[Ljava/lang/String;
        //   143: iconst_1       
        //   144: aaload         
        //   145: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   150: pop            
        //   151: iload_1        
        //   152: ifeq            13
        //   155: aload_0        
        //   156: getfield        org/O.e:Ljava/util/List;
        //   159: getstatic       org/O.z:[Ljava/lang/String;
        //   162: iconst_4       
        //   163: aaload         
        //   164: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   169: pop            
        //   170: iload_1        
        //   171: ifeq            13
        //   174: aload           8
        //   176: invokevirtual   org/b.h:()J
        //   179: lstore          24
        //   181: lload           24
        //   183: lconst_0       
        //   184: lcmp           
        //   185: ifeq            202
        //   188: aload           11
        //   190: invokevirtual   org/b.h:()J
        //   193: lstore          48
        //   195: lload           48
        //   197: lconst_0       
        //   198: lcmp           
        //   199: ifne            326
        //   202: aload_0        
        //   203: getfield        org/O.e:Ljava/util/List;
        //   206: getstatic       org/O.z:[Ljava/lang/String;
        //   209: iconst_5       
        //   210: aaload         
        //   211: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   216: pop            
        //   217: aload_0        
        //   218: getfield        org/O.f:J
        //   221: lstore          27
        //   223: lload           6
        //   225: lload           27
        //   227: lcmp           
        //   228: ifle            250
        //   231: aload_0        
        //   232: getfield        org/O.e:Ljava/util/List;
        //   235: getstatic       org/O.z:[Ljava/lang/String;
        //   238: iconst_2       
        //   239: aaload         
        //   240: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   245: pop            
        //   246: iload_1        
        //   247: ifeq            264
        //   250: aload_0        
        //   251: aload_0        
        //   252: getfield        org/O.f:J
        //   255: lload           6
        //   257: lsub           
        //   258: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   261: putfield        org/O.a:Ljava/lang/Long;
        //   264: aload           8
        //   266: invokevirtual   org/b.h:()J
        //   269: lstore          32
        //   271: lload           32
        //   273: lconst_0       
        //   274: lcmp           
        //   275: ifeq            298
        //   278: lload           9
        //   280: lload           6
        //   282: lsub           
        //   283: lstore          45
        //   285: aload_0        
        //   286: lload           45
        //   288: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   291: putfield        org/O.c:Ljava/lang/Long;
        //   294: iload_1        
        //   295: ifeq            13
        //   298: aload           11
        //   300: invokevirtual   org/b.h:()J
        //   303: lconst_0       
        //   304: lcmp           
        //   305: ifeq            13
        //   308: aload_0        
        //   309: lload           12
        //   311: aload_0        
        //   312: getfield        org/O.f:J
        //   315: lsub           
        //   316: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   319: putfield        org/O.c:Ljava/lang/Long;
        //   322: iload_1        
        //   323: ifeq            13
        //   326: aload_0        
        //   327: getfield        org/O.f:J
        //   330: lload           6
        //   332: lsub           
        //   333: lstore          34
        //   335: lload           12
        //   337: lload           9
        //   339: lcmp           
        //   340: ifge            363
        //   343: aload_0        
        //   344: getfield        org/O.e:Ljava/util/List;
        //   347: getstatic       org/O.z:[Ljava/lang/String;
        //   350: bipush          7
        //   352: aaload         
        //   353: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   358: pop            
        //   359: iload_1        
        //   360: ifeq            444
        //   363: lload           12
        //   365: lload           9
        //   367: lsub           
        //   368: lstore          36
        //   370: lload           36
        //   372: lload           34
        //   374: lcmp           
        //   375: ifgt            389
        //   378: lload           34
        //   380: lload           36
        //   382: lsub           
        //   383: lstore          34
        //   385: iload_1        
        //   386: ifeq            444
        //   389: lload           36
        //   391: lload           34
        //   393: lsub           
        //   394: lconst_1       
        //   395: lcmp           
        //   396: ifne            428
        //   399: lload           34
        //   401: lconst_0       
        //   402: lcmp           
        //   403: ifeq            444
        //   406: aload_0        
        //   407: getfield        org/O.e:Ljava/util/List;
        //   410: getstatic       org/O.z:[Ljava/lang/String;
        //   413: iconst_3       
        //   414: aaload         
        //   415: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   420: pop            
        //   421: lconst_0       
        //   422: lstore          34
        //   424: iload_1        
        //   425: ifeq            444
        //   428: aload_0        
        //   429: getfield        org/O.e:Ljava/util/List;
        //   432: getstatic       org/O.z:[Ljava/lang/String;
        //   435: bipush          6
        //   437: aaload         
        //   438: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   443: pop            
        //   444: aload_0        
        //   445: lload           34
        //   447: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   450: putfield        org/O.a:Ljava/lang/Long;
        //   453: lload           6
        //   455: aload_0        
        //   456: getfield        org/O.f:J
        //   459: lcmp           
        //   460: ifle            479
        //   463: aload_0        
        //   464: getfield        org/O.e:Ljava/util/List;
        //   467: getstatic       org/O.z:[Ljava/lang/String;
        //   470: bipush          8
        //   472: aaload         
        //   473: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   478: pop            
        //   479: aload_0        
        //   480: lload           9
        //   482: lload           6
        //   484: lsub           
        //   485: lload           12
        //   487: aload_0        
        //   488: getfield        org/O.f:J
        //   491: lsub           
        //   492: ladd           
        //   493: ldc2_w          2
        //   496: ldiv           
        //   497: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   500: putfield        org/O.c:Ljava/lang/Long;
        //   503: return         
        //   504: astore          4
        //   506: aload           4
        //   508: athrow         
        //   509: astore          14
        //   511: aload           14
        //   513: athrow         
        //   514: astore          15
        //   516: aload           15
        //   518: athrow         
        //   519: astore          16
        //   521: aload           16
        //   523: athrow         
        //   524: astore          17
        //   526: aload           17
        //   528: athrow         
        //   529: astore          18
        //   531: aload           18
        //   533: athrow         
        //   534: astore          19
        //   536: aload           19
        //   538: athrow         
        //   539: astore          20
        //   541: aload           20
        //   543: athrow         
        //   544: astore          21
        //   546: aload           21
        //   548: athrow         
        //   549: astore          29
        //   551: aload           29
        //   553: athrow         
        //   554: astore          30
        //   556: aload           30
        //   558: athrow         
        //   559: astore          31
        //   561: aload           31
        //   563: athrow         
        //   564: astore          43
        //   566: aload           43
        //   568: athrow         
        //   569: astore          38
        //   571: aload           38
        //   573: athrow         
        //   574: astore          40
        //   576: aload           40
        //   578: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      9      14     17     Ljava/lang/IllegalArgumentException;
        //  17     40     504    509    Ljava/lang/IllegalArgumentException;
        //  94     101    509    514    Ljava/lang/IllegalArgumentException;
        //  108    115    514    519    Ljava/lang/IllegalArgumentException;
        //  122    151    519    524    Ljava/lang/IllegalArgumentException;
        //  155    170    524    529    Ljava/lang/IllegalArgumentException;
        //  174    181    529    534    Ljava/lang/IllegalArgumentException;
        //  188    195    534    539    Ljava/lang/IllegalArgumentException;
        //  202    223    539    544    Ljava/lang/IllegalArgumentException;
        //  231    246    544    549    Ljava/lang/IllegalArgumentException;
        //  250    264    544    549    Ljava/lang/IllegalArgumentException;
        //  264    271    549    554    Ljava/lang/IllegalArgumentException;
        //  285    294    554    559    Ljava/lang/IllegalArgumentException;
        //  298    322    559    564    Ljava/lang/IllegalArgumentException;
        //  343    359    564    569    Ljava/lang/IllegalArgumentException;
        //  428    444    569    574    Ljava/lang/IllegalArgumentException;
        //  444    479    574    579    Ljava/lang/IllegalArgumentException;
        //  511    514    514    519    Ljava/lang/IllegalArgumentException;
        //  516    519    519    524    Ljava/lang/IllegalArgumentException;
        //  521    524    524    529    Ljava/lang/IllegalArgumentException;
        //  526    529    529    534    Ljava/lang/IllegalArgumentException;
        //  531    534    534    539    Ljava/lang/IllegalArgumentException;
        //  536    539    539    544    Ljava/lang/IllegalArgumentException;
        //  541    544    544    549    Ljava/lang/IllegalArgumentException;
        //  551    554    554    559    Ljava/lang/IllegalArgumentException;
        //  556    559    559    564    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 292, Size: 292
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
