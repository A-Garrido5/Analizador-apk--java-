// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.text.DecimalFormat;
import java.text.NumberFormat;

final class cg
{
    private static final NumberFormat a;
    private static final String[] b;
    private static final NumberFormat c;
    private static final String[] z;
    
    static {
        final String[] array = new String[4];
        String s = "\u0014gl;\u001e\u0014gl;\u001e";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0424:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '.';
                        break;
                    }
                    case 0: {
                        c3 = '$';
                        break;
                    }
                    case 1: {
                        c3 = 'W';
                        break;
                    }
                    case 2: {
                        c3 = '\\';
                        break;
                    }
                    case 3: {
                        c3 = '\u000b';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "\u007f~b\u0015\u001e\u0015J";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "\u0014gl;\u001e\u0014gl;";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "\u0014gl";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    z = array3;
                    a = new DecimalFormat(cg.z[2]);
                    c = new DecimalFormat(cg.z[3]);
                    array2 = (array3 = new String[6]);
                    s = ".\u0016\u001eHja\u0011\u001bCgn\u001c\u0010F`k\u0007\rY}p\u0002\n\\v}\r\uffa6\u00173:\uffac|\ufff7\f\u0007sy-\t\f~v \u0002\tys;\u001f\u0016dh>\u0018\u0013oe1\uffdf\uffd6\uffa4\uffa8\ufff3";
                    n = 3;
                    n2 = 0;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    s = "D6>hJA1;cGN<0f@K'-y]P\"*|V]-\uffa6\u00173:\uffac'\ufff7SZ(g7\u0013\u001ah\u0007Wsz\b|'\u0000\u000bm\u001c*R\uffd8\uffa2\uffaa\ufff7\uffde\uffd6\uffa4\uffa8\ufffc";
                    n2 = 1;
                    array2 = array3;
                    n = 4;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    s = "\u00e4\u0096\u009e\u00c8\u00ea\u00e1\u0091\u009b\u00c3\u00e7\u00ee\u009c\u0090\u00c6\u00e0\u00eb\u0087\u008d\u00d9\u00fd\u00f0\u0082\u008a\u00dc\u00f6\u00fd\u008d\uffa6\u00173:\u008c\u0080\u00d6\u00f0\u00fb\u00fd\u00f0º\u009c\u0097\u00e2\u00e5±\u0092\u0099\u00e9\u00dc\u008a¬§\u00d3\u00d9\u008d©¬\u00de\uffab+\uffd7\uffd7\uffa3\uffa4";
                    n = 5;
                    n2 = 2;
                    array2 = array3;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    s = "\u00c4¶¾\u00e8\u00ca\u00c1±»\u00e3\u00c7\u00ce¼°\u00e6\u00c0\u00cb§\u00ad\u00f9\u00dd\u00d0¢ª\u00fc\u00d6\u00dd\u00ad\uffa6\u00173:\uffac§\u00f7\u00d3\u00da¨\u00fd£\u0085\u008b\u00e7\u00e8¼\u0096\u009f\u00e8\u00d6\u0080¢©\u00d9\u00d3\u009b¿¶\u00c4\u00c8\ufffc\u000e\uffd6\uffae\uffa8\ufff3";
                    n = 6;
                    n2 = 3;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    array2[n2] = intern;
                    s = "$V^\b*!Q[\u0003'.\\P\u0006 +GM\u0019=0BJ\u001c6=M\uffa6\ufff7\uffd2?\uffac@\u00160;\u00c8\u00fc©\u008d\u0080\u00f2\u00fa¬\u0087\u0089\u00f9\u00ea\u009e¸³\u00cf\u00c5\u0091µ¸\u00ca\u00c2\ufffc\u000e\uffd6\uffa4\uffa5\ufff3";
                    n = 7;
                    n2 = 4;
                    array2 = array3;
                    continue;
                }
                case 7: {
                    array2[n2] = intern;
                    n2 = 5;
                    s = "$V^\b*!Q[\u0003'.\\P\u0006 +GM\u0019=0BJ\u001c6=MG\u00173:H|*\f\u0007sy-\t\f~v \u0002\tys;\u001f\u0016dh>\u0018\u0013oe1\u0015\u0018jb4";
                    n = 8;
                    array2 = array3;
                    continue;
                }
                case 8: {
                    break Label_0424;
                }
            }
        }
        array2[n2] = intern;
        b = array3;
    }
    
    private static int a(final int n, final byte[] array) {
        int n2 = 1;
        final int n3 = n - 1;
        try {
            if ((array[n3 / 6] & n2 << 5 - n3 % 6) == 0x0) {
                n2 = 0;
            }
            return n2;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private static int a(final byte[] array) {
        return a(array, new byte[] { 53, 54, 43, 44, 45, 46, 47, 48, 37, 38 });
    }
    
    private static int a(final byte[] array, final byte[] array2) {
        int i = 0;
        final int b = gA.b;
        try {
            if (array2.length == 0) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        int n = 0;
        while (i < array2.length) {
            n += a(array2[i], array) << -1 + (array2.length - i);
            ++i;
            if (b != 0) {
                break;
            }
        }
        return n;
    }
    
    static aS a(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/gA.b:I
        //     3: istore_2       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: sipush          144
        //    11: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    14: astore_3       
        //    15: iload_1        
        //    16: tableswitch {
        //                4: 66
        //                5: 66
        //                6: 274
        //                7: 290
        //          default: 48
        //        }
        //    48: new             Lcom/google/aS;
        //    51: dup            
        //    52: aload_0        
        //    53: aload_3        
        //    54: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    57: aconst_null    
        //    58: iload_1        
        //    59: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    62: invokespecial   com/google/aS.<init>:([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        //    65: areturn        
        //    66: iload_1        
        //    67: iconst_2       
        //    68: if_icmpne       109
        //    71: aload_0        
        //    72: invokestatic    com/google/cg.e:([B)I
        //    75: istore          17
        //    77: new             Ljava/text/DecimalFormat;
        //    80: dup            
        //    81: getstatic       com/google/cg.z:[Ljava/lang/String;
        //    84: iconst_0       
        //    85: aaload         
        //    86: iconst_0       
        //    87: aload_0        
        //    88: invokestatic    com/google/cg.c:([B)I
        //    91: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    94: invokespecial   java/text/DecimalFormat.<init>:(Ljava/lang/String;)V
        //    97: iload           17
        //    99: i2l            
        //   100: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //   103: astore          7
        //   105: iload_2        
        //   106: ifeq            115
        //   109: aload_0        
        //   110: invokestatic    com/google/cg.b:([B)Ljava/lang/String;
        //   113: astore          7
        //   115: getstatic       com/google/cg.c:Ljava/text/NumberFormat;
        //   118: aload_0        
        //   119: invokestatic    com/google/cg.a:([B)I
        //   122: i2l            
        //   123: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //   126: astore          8
        //   128: getstatic       com/google/cg.c:Ljava/text/NumberFormat;
        //   131: aload_0        
        //   132: invokestatic    com/google/cg.d:([B)I
        //   135: i2l            
        //   136: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //   139: astore          9
        //   141: aload_3        
        //   142: aload_0        
        //   143: bipush          10
        //   145: bipush          84
        //   147: invokestatic    com/google/cg.a:([BII)Ljava/lang/String;
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: pop            
        //   154: aload_3        
        //   155: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   158: getstatic       com/google/cg.z:[Ljava/lang/String;
        //   161: iconst_1       
        //   162: aaload         
        //   163: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   166: istore          14
        //   168: iload           14
        //   170: ifeq            224
        //   173: aload_3        
        //   174: bipush          9
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: aload           7
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: bipush          29
        //   190: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   193: aload           8
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: bipush          29
        //   200: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   203: aload           9
        //   205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   208: bipush          29
        //   210: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   213: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   216: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //   219: pop            
        //   220: iload_2        
        //   221: ifeq            48
        //   224: aload_3        
        //   225: iconst_0       
        //   226: new             Ljava/lang/StringBuilder;
        //   229: dup            
        //   230: invokespecial   java/lang/StringBuilder.<init>:()V
        //   233: aload           7
        //   235: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   238: bipush          29
        //   240: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   243: aload           8
        //   245: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: bipush          29
        //   250: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   253: aload           9
        //   255: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   258: bipush          29
        //   260: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   266: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //   269: pop            
        //   270: iload_2        
        //   271: ifeq            48
        //   274: aload_3        
        //   275: aload_0        
        //   276: iconst_1       
        //   277: bipush          93
        //   279: invokestatic    com/google/cg.a:([BII)Ljava/lang/String;
        //   282: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   285: pop            
        //   286: iload_2        
        //   287: ifeq            48
        //   290: aload_3        
        //   291: aload_0        
        //   292: iconst_1       
        //   293: bipush          77
        //   295: invokestatic    com/google/cg.a:([BII)Ljava/lang/String;
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: pop            
        //   302: goto            48
        //   305: astore          4
        //   307: aload           4
        //   309: athrow         
        //   310: astore          10
        //   312: aload           10
        //   314: athrow         
        //   315: astore          11
        //   317: aload           11
        //   319: athrow         
        //   320: astore          12
        //   322: aload           12
        //   324: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  141    168    310    315    Ljava/lang/IllegalArgumentException;
        //  173    220    315    320    Ljava/lang/IllegalArgumentException;
        //  224    270    320    325    Ljava/lang/IllegalArgumentException;
        //  274    286    305    310    Ljava/lang/IllegalArgumentException;
        //  290    302    305    310    Ljava/lang/IllegalArgumentException;
        //  312    315    315    320    Ljava/lang/IllegalArgumentException;
        //  317    320    320    325    Ljava/lang/IllegalArgumentException;
        //  322    325    305    310    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 145, Size: 145
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
    
    private static String a(final byte[] p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/gA.b:I
        //     3: istore_3       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: astore          4
        //    13: iconst_m1      
        //    14: istore          5
        //    16: iconst_0       
        //    17: istore          6
        //    19: iconst_0       
        //    20: istore          7
        //    22: iload_1        
        //    23: istore          8
        //    25: iload           8
        //    27: iload_1        
        //    28: iload_2        
        //    29: iadd           
        //    30: if_icmpge       154
        //    33: getstatic       com/google/cg.b:[Ljava/lang/String;
        //    36: iload           6
        //    38: aaload         
        //    39: aload_0        
        //    40: iload           8
        //    42: baload         
        //    43: invokevirtual   java/lang/String.charAt:(I)C
        //    46: istore          10
        //    48: iload           10
        //    50: tableswitch {
        //           131040: 221
        //           131041: 221
        //           131042: 221
        //           131043: 221
        //           131044: 221
        //           131045: 239
        //           131046: 253
        //           131047: 201
        //           131048: 211
        //           131049: 370
        //           131050: 112
        //           131051: 267
        //          default: 112
        //        }
        //   112: aload           4
        //   114: iload           10
        //   116: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: iload           7
        //   122: istore          19
        //   124: iload           6
        //   126: istore          14
        //   128: iload           19
        //   130: istore          12
        //   132: iload           5
        //   134: iconst_1       
        //   135: isub           
        //   136: istore          15
        //   138: iload           5
        //   140: ifne            147
        //   143: iload           12
        //   145: istore          14
        //   147: iinc            8, 1
        //   150: iload_3        
        //   151: ifeq            414
        //   154: aload           4
        //   156: invokevirtual   java/lang/StringBuilder.length:()I
        //   159: ifle            195
        //   162: aload           4
        //   164: iconst_m1      
        //   165: aload           4
        //   167: invokevirtual   java/lang/StringBuilder.length:()I
        //   170: iadd           
        //   171: invokevirtual   java/lang/StringBuilder.charAt:(I)C
        //   174: ldc             65532
        //   176: if_icmpne       195
        //   179: aload           4
        //   181: iconst_m1      
        //   182: aload           4
        //   184: invokevirtual   java/lang/StringBuilder.length:()I
        //   187: iadd           
        //   188: invokevirtual   java/lang/StringBuilder.setLength:(I)V
        //   191: iload_3        
        //   192: ifeq            154
        //   195: aload           4
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: areturn        
        //   201: iconst_m1      
        //   202: istore          5
        //   204: iconst_0       
        //   205: istore          6
        //   207: iload_3        
        //   208: ifeq            447
        //   211: iconst_1       
        //   212: istore          6
        //   214: iconst_m1      
        //   215: istore          5
        //   217: iload_3        
        //   218: ifeq            447
        //   221: iload           6
        //   223: istore          7
        //   225: iload           10
        //   227: ldc             65520
        //   229: isub           
        //   230: istore          6
        //   232: iconst_1       
        //   233: istore          5
        //   235: iload_3        
        //   236: ifeq            447
        //   239: iload           6
        //   241: istore          7
        //   243: iconst_2       
        //   244: istore          5
        //   246: iconst_0       
        //   247: istore          6
        //   249: iload_3        
        //   250: ifeq            447
        //   253: iload           6
        //   255: istore          7
        //   257: iconst_3       
        //   258: istore          5
        //   260: iconst_0       
        //   261: istore          6
        //   263: iload_3        
        //   264: ifeq            447
        //   267: iload           8
        //   269: iconst_1       
        //   270: iadd           
        //   271: istore          20
        //   273: aload_0        
        //   274: iload           20
        //   276: baload         
        //   277: bipush          24
        //   279: ishl           
        //   280: istore          21
        //   282: iload           20
        //   284: iconst_1       
        //   285: iadd           
        //   286: istore          22
        //   288: iload           21
        //   290: aload_0        
        //   291: iload           22
        //   293: baload         
        //   294: bipush          18
        //   296: ishl           
        //   297: iadd           
        //   298: istore          23
        //   300: iload           22
        //   302: iconst_1       
        //   303: iadd           
        //   304: istore          24
        //   306: iload           23
        //   308: aload_0        
        //   309: iload           24
        //   311: baload         
        //   312: bipush          12
        //   314: ishl           
        //   315: iadd           
        //   316: istore          25
        //   318: iload           24
        //   320: iconst_1       
        //   321: iadd           
        //   322: istore          26
        //   324: iload           25
        //   326: aload_0        
        //   327: iload           26
        //   329: baload         
        //   330: bipush          6
        //   332: ishl           
        //   333: iadd           
        //   334: istore          27
        //   336: iload           26
        //   338: iconst_1       
        //   339: iadd           
        //   340: istore          8
        //   342: iload           27
        //   344: aload_0        
        //   345: iload           8
        //   347: baload         
        //   348: iadd           
        //   349: istore          28
        //   351: aload           4
        //   353: getstatic       com/google/cg.a:Ljava/text/NumberFormat;
        //   356: iload           28
        //   358: i2l            
        //   359: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: pop            
        //   366: iload_3        
        //   367: ifeq            447
        //   370: iload           6
        //   372: istore          11
        //   374: iload           7
        //   376: istore          12
        //   378: iload           8
        //   380: istore          13
        //   382: iload_3        
        //   383: ifeq            433
        //   386: iload           12
        //   388: istore          7
        //   390: iload           11
        //   392: istore          6
        //   394: iconst_m1      
        //   395: istore          5
        //   397: iload           13
        //   399: istore          8
        //   401: goto            112
        //   404: astore          17
        //   406: aload           17
        //   408: athrow         
        //   409: astore          9
        //   411: aload           9
        //   413: athrow         
        //   414: iload           15
        //   416: istore          5
        //   418: iload           14
        //   420: istore          16
        //   422: iload           12
        //   424: istore          7
        //   426: iload           16
        //   428: istore          6
        //   430: goto            25
        //   433: iload           11
        //   435: istore          14
        //   437: iconst_m1      
        //   438: istore          5
        //   440: iload           13
        //   442: istore          8
        //   444: goto            132
        //   447: iload           7
        //   449: istore          30
        //   451: iload           6
        //   453: istore          14
        //   455: iload           30
        //   457: istore          12
        //   459: goto            132
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  112    120    404    409    Ljava/lang/IllegalArgumentException;
        //  162    191    409    414    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0195:
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
    
    private static String b(final byte[] array) {
        return String.valueOf(new char[] { cg.b[0].charAt(a(array, new byte[] { 39, 40, 41, 42, 31, 32 })), cg.b[0].charAt(a(array, new byte[] { 33, 34, 35, 36, 25, 26 })), cg.b[0].charAt(a(array, new byte[] { 27, 28, 29, 30, 19, 20 })), cg.b[0].charAt(a(array, new byte[] { 21, 22, 23, 24, 13, 14 })), cg.b[0].charAt(a(array, new byte[] { 15, 16, 17, 18, 7, 8 })), cg.b[0].charAt(a(array, new byte[] { 9, 10, 11, 12, 1, 2 })) });
    }
    
    private static int c(final byte[] array) {
        return a(array, new byte[] { 39, 40, 41, 42, 31, 32 });
    }
    
    private static int d(final byte[] array) {
        return a(array, new byte[] { 55, 56, 57, 58, 59, 60, 49, 50, 51, 52 });
    }
    
    private static int e(final byte[] array) {
        return a(array, new byte[] { 33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2 });
    }
}
