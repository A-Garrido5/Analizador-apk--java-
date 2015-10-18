// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.UnsupportedEncodingException;
import java.util.Collection;

final class dJ
{
    private static final char[] a;
    private static final char[] b;
    private static final char[] c;
    private static final char[] d;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "52\u001a'SIX\n.";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'k';
                        break;
                    }
                    case 0: {
                        c3 = '|';
                        break;
                    }
                    case 1: {
                        c3 = 'a';
                        break;
                    }
                    case 2: {
                        c3 = 'U';
                        break;
                    }
                    case 3: {
                        c3 = '\u001f';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ",\r4k\r\u0013\u00138?\u000f\u0013\u0004&?\u0005\u0013\u0015ul\u001e\f\u0011:m\u001f\\\u00130n\u001e\u0015\u00130{K\u0019\u000f6p\u000f\u0015\u000f2%K";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'Hk\u0001[J|";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "be";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "be";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "'Hk\u0001[I|";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        d = new char[] { '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        a = new char[] { '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_' };
        b = new char[] { '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        c = new char[] { '`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', '\u007f' };
    }
    
    private static int a(final int n, final int n2) {
        final int n3 = n - (1 + n2 * 149 % 255);
        if (n3 >= 0) {
            return n3;
        }
        return n3 + 256;
    }
    
    static aS a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ef.f:I
        //     3: istore_1       
        //     4: new             Lcom/google/aL;
        //     7: dup            
        //     8: aload_0        
        //     9: invokespecial   com/google/aL.<init>:([B)V
        //    12: astore_2       
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: bipush          100
        //    19: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    22: astore_3       
        //    23: new             Ljava/lang/StringBuilder;
        //    26: dup            
        //    27: iconst_0       
        //    28: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    31: astore          4
        //    33: new             Ljava/util/ArrayList;
        //    36: dup            
        //    37: iconst_1       
        //    38: invokespecial   java/util/ArrayList.<init>:(I)V
        //    41: astore          5
        //    43: getstatic       com/google/at.ASCII_ENCODE:Lcom/google/at;
        //    46: astore          6
        //    48: aload           6
        //    50: getstatic       com/google/at.ASCII_ENCODE:Lcom/google/at;
        //    53: if_acmpne       69
        //    56: aload_2        
        //    57: aload_3        
        //    58: aload           4
        //    60: invokestatic    com/google/dJ.a:(Lcom/google/aL;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Lcom/google/at;
        //    63: astore          6
        //    65: iload_1        
        //    66: ifeq            177
        //    69: getstatic       com/google/c8.a:[I
        //    72: aload           6
        //    74: invokevirtual   com/google/at.ordinal:()I
        //    77: iaload         
        //    78: istore          13
        //    80: iload           13
        //    82: tableswitch {
        //                2: 125
        //                3: 134
        //                4: 143
        //                5: 152
        //                6: 161
        //          default: 116
        //        }
        //   116: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   119: athrow         
        //   120: astore          12
        //   122: aload           12
        //   124: athrow         
        //   125: aload_2        
        //   126: aload_3        
        //   127: invokestatic    com/google/dJ.b:(Lcom/google/aL;Ljava/lang/StringBuilder;)V
        //   130: iload_1        
        //   131: ifeq            172
        //   134: aload_2        
        //   135: aload_3        
        //   136: invokestatic    com/google/dJ.a:(Lcom/google/aL;Ljava/lang/StringBuilder;)V
        //   139: iload_1        
        //   140: ifeq            172
        //   143: aload_2        
        //   144: aload_3        
        //   145: invokestatic    com/google/dJ.c:(Lcom/google/aL;Ljava/lang/StringBuilder;)V
        //   148: iload_1        
        //   149: ifeq            172
        //   152: aload_2        
        //   153: aload_3        
        //   154: invokestatic    com/google/dJ.d:(Lcom/google/aL;Ljava/lang/StringBuilder;)V
        //   157: iload_1        
        //   158: ifeq            172
        //   161: aload_2        
        //   162: aload_3        
        //   163: aload           5
        //   165: invokestatic    com/google/dJ.a:(Lcom/google/aL;Ljava/lang/StringBuilder;Ljava/util/Collection;)V
        //   168: iload_1        
        //   169: ifne            116
        //   172: getstatic       com/google/at.ASCII_ENCODE:Lcom/google/at;
        //   175: astore          6
        //   177: aload           6
        //   179: getstatic       com/google/at.PAD_ENCODE:Lcom/google/at;
        //   182: if_acmpeq       196
        //   185: aload_2        
        //   186: invokevirtual   com/google/aL.c:()I
        //   189: istore          21
        //   191: iload           21
        //   193: ifgt            48
        //   196: aload           4
        //   198: invokevirtual   java/lang/StringBuilder.length:()I
        //   201: ifle            211
        //   204: aload_3        
        //   205: aload           4
        //   207: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
        //   210: pop            
        //   211: aload_3        
        //   212: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   215: astore          17
        //   217: aload           5
        //   219: invokeinterface java/util/List.isEmpty:()Z
        //   224: istore          18
        //   226: iload           18
        //   228: ifeq            288
        //   231: aconst_null    
        //   232: astore          19
        //   234: new             Lcom/google/aS;
        //   237: dup            
        //   238: aload_0        
        //   239: aload           17
        //   241: aload           19
        //   243: aconst_null    
        //   244: invokespecial   com/google/aS.<init>:([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        //   247: areturn        
        //   248: astore          7
        //   250: aload           7
        //   252: athrow         
        //   253: astore          8
        //   255: aload           8
        //   257: athrow         
        //   258: astore          9
        //   260: aload           9
        //   262: athrow         
        //   263: astore          10
        //   265: aload           10
        //   267: athrow         
        //   268: astore          11
        //   270: aload           11
        //   272: athrow         
        //   273: astore          14
        //   275: aload           14
        //   277: athrow         
        //   278: astore          15
        //   280: aload           15
        //   282: athrow         
        //   283: astore          16
        //   285: aload           16
        //   287: athrow         
        //   288: aload           5
        //   290: astore          19
        //   292: goto            234
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  69     80     248    253    Ljava/lang/IllegalStateException;
        //  116    120    120    125    Ljava/lang/IllegalStateException;
        //  125    130    253    258    Ljava/lang/IllegalStateException;
        //  134    139    258    263    Ljava/lang/IllegalStateException;
        //  143    148    263    268    Ljava/lang/IllegalStateException;
        //  152    157    268    273    Ljava/lang/IllegalStateException;
        //  161    168    120    125    Ljava/lang/IllegalStateException;
        //  177    191    273    278    Ljava/lang/IllegalStateException;
        //  196    211    278    283    Ljava/lang/IllegalStateException;
        //  211    226    283    288    Ljava/lang/IllegalStateException;
        //  250    253    253    258    Ljava/lang/IllegalStateException;
        //  255    258    258    263    Ljava/lang/IllegalStateException;
        //  260    263    263    268    Ljava/lang/IllegalStateException;
        //  265    268    268    273    Ljava/lang/IllegalStateException;
        //  270    273    120    125    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 134, Size: 134
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
    
    private static at a(final aL p0, final StringBuilder p1, final StringBuilder p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/google/ef.f:I
        //     5: istore          4
        //     7: aload_0        
        //     8: bipush          8
        //    10: invokevirtual   com/google/aL.a:(I)I
        //    13: istore          5
        //    15: iload           5
        //    17: ifne            24
        //    20: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //    23: athrow         
        //    24: iload           5
        //    26: sipush          128
        //    29: if_icmpgt       58
        //    32: iload_3        
        //    33: ifeq            436
        //    36: iload           5
        //    38: sipush          128
        //    41: iadd           
        //    42: istore          35
        //    44: aload_1        
        //    45: iload           35
        //    47: iconst_1       
        //    48: isub           
        //    49: i2c            
        //    50: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    53: pop            
        //    54: getstatic       com/google/at.ASCII_ENCODE:Lcom/google/at;
        //    57: areturn        
        //    58: iload           5
        //    60: sipush          129
        //    63: if_icmpne       79
        //    66: getstatic       com/google/at.PAD_ENCODE:Lcom/google/at;
        //    69: astore          34
        //    71: aload           34
        //    73: areturn        
        //    74: astore          33
        //    76: aload           33
        //    78: athrow         
        //    79: iload           5
        //    81: sipush          229
        //    84: if_icmpgt       121
        //    87: iload           5
        //    89: sipush          130
        //    92: isub           
        //    93: istore          28
        //    95: iload           28
        //    97: bipush          10
        //    99: if_icmpge       109
        //   102: aload_1        
        //   103: bipush          48
        //   105: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   108: pop            
        //   109: aload_1        
        //   110: iload           28
        //   112: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   115: pop            
        //   116: iload           4
        //   118: ifeq            209
        //   121: iload           5
        //   123: sipush          230
        //   126: if_icmpne       152
        //   129: getstatic       com/google/at.C40_ENCODE:Lcom/google/at;
        //   132: astore          27
        //   134: aload           27
        //   136: areturn        
        //   137: astore          31
        //   139: aload           31
        //   141: athrow         
        //   142: astore          29
        //   144: aload           29
        //   146: athrow         
        //   147: astore          26
        //   149: aload           26
        //   151: athrow         
        //   152: iload           5
        //   154: sipush          231
        //   157: if_icmpne       173
        //   160: getstatic       com/google/at.BASE256_ENCODE:Lcom/google/at;
        //   163: astore          25
        //   165: aload           25
        //   167: areturn        
        //   168: astore          24
        //   170: aload           24
        //   172: athrow         
        //   173: iload           5
        //   175: sipush          232
        //   178: if_icmpne       193
        //   181: aload_1        
        //   182: bipush          29
        //   184: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   187: pop            
        //   188: iload           4
        //   190: ifeq            209
        //   193: iload           5
        //   195: sipush          233
        //   198: if_icmpeq       209
        //   201: iload           5
        //   203: sipush          234
        //   206: if_icmpne       235
        //   209: aload_0        
        //   210: invokevirtual   com/google/aL.c:()I
        //   213: ifgt            7
        //   216: getstatic       com/google/at.ASCII_ENCODE:Lcom/google/at;
        //   219: areturn        
        //   220: astore          20
        //   222: aload           20
        //   224: athrow         
        //   225: astore          21
        //   227: aload           21
        //   229: athrow         
        //   230: astore          22
        //   232: aload           22
        //   234: athrow         
        //   235: iload           5
        //   237: sipush          235
        //   240: if_icmpne       250
        //   243: iconst_1       
        //   244: istore_3       
        //   245: iload           4
        //   247: ifeq            209
        //   250: iload           5
        //   252: sipush          236
        //   255: if_icmpne       284
        //   258: aload_1        
        //   259: getstatic       com/google/dJ.z:[Ljava/lang/String;
        //   262: iconst_5       
        //   263: aaload         
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: pop            
        //   268: aload_2        
        //   269: iconst_0       
        //   270: getstatic       com/google/dJ.z:[Ljava/lang/String;
        //   273: iconst_4       
        //   274: aaload         
        //   275: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //   278: pop            
        //   279: iload           4
        //   281: ifeq            209
        //   284: iload           5
        //   286: sipush          237
        //   289: if_icmpne       318
        //   292: aload_1        
        //   293: getstatic       com/google/dJ.z:[Ljava/lang/String;
        //   296: iconst_2       
        //   297: aaload         
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: pop            
        //   302: aload_2        
        //   303: iconst_0       
        //   304: getstatic       com/google/dJ.z:[Ljava/lang/String;
        //   307: iconst_3       
        //   308: aaload         
        //   309: invokevirtual   java/lang/StringBuilder.insert:(ILjava/lang/String;)Ljava/lang/StringBuilder;
        //   312: pop            
        //   313: iload           4
        //   315: ifeq            209
        //   318: iload           5
        //   320: sipush          238
        //   323: if_icmpne       354
        //   326: getstatic       com/google/at.ANSIX12_ENCODE:Lcom/google/at;
        //   329: astore          12
        //   331: aload           12
        //   333: areturn        
        //   334: astore          16
        //   336: aload           16
        //   338: athrow         
        //   339: astore          17
        //   341: aload           17
        //   343: athrow         
        //   344: astore          13
        //   346: aload           13
        //   348: athrow         
        //   349: astore          11
        //   351: aload           11
        //   353: athrow         
        //   354: iload           5
        //   356: sipush          239
        //   359: if_icmpne       375
        //   362: getstatic       com/google/at.TEXT_ENCODE:Lcom/google/at;
        //   365: astore          10
        //   367: aload           10
        //   369: areturn        
        //   370: astore          9
        //   372: aload           9
        //   374: athrow         
        //   375: iload           5
        //   377: sipush          240
        //   380: if_icmpne       396
        //   383: getstatic       com/google/at.EDIFACT_ENCODE:Lcom/google/at;
        //   386: astore          8
        //   388: aload           8
        //   390: areturn        
        //   391: astore          7
        //   393: aload           7
        //   395: athrow         
        //   396: iload           5
        //   398: sipush          241
        //   401: if_icmpeq       209
        //   404: iload           5
        //   406: sipush          242
        //   409: if_icmplt       209
        //   412: iload           5
        //   414: sipush          254
        //   417: if_icmpne       427
        //   420: aload_0        
        //   421: invokevirtual   com/google/aL.c:()I
        //   424: ifeq            209
        //   427: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   430: athrow         
        //   431: astore          6
        //   433: aload           6
        //   435: athrow         
        //   436: iload           5
        //   438: istore          35
        //   440: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  66     71     74     79     Ljava/lang/IllegalStateException;
        //  102    109    137    142    Ljava/lang/IllegalStateException;
        //  109    116    142    147    Ljava/lang/IllegalStateException;
        //  129    134    147    152    Ljava/lang/IllegalStateException;
        //  144    147    147    152    Ljava/lang/IllegalStateException;
        //  160    165    168    173    Ljava/lang/IllegalStateException;
        //  181    188    220    235    Ljava/lang/IllegalStateException;
        //  222    225    225    235    Ljava/lang/IllegalStateException;
        //  227    230    230    235    Ljava/lang/IllegalStateException;
        //  258    279    334    344    Ljava/lang/IllegalStateException;
        //  292    313    344    349    Ljava/lang/IllegalStateException;
        //  326    331    349    354    Ljava/lang/IllegalStateException;
        //  336    339    339    344    Ljava/lang/IllegalStateException;
        //  341    344    344    349    Ljava/lang/IllegalStateException;
        //  346    349    349    354    Ljava/lang/IllegalStateException;
        //  362    367    370    375    Ljava/lang/IllegalStateException;
        //  383    388    391    396    Ljava/lang/IllegalStateException;
        //  420    427    431    436    Ljava/lang/IllegalStateException;
        //  427    431    431    436    Ljava/lang/IllegalStateException;
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
    
    private static void a(final int n, final int n2, final int[] array) {
        final int n3 = -1 + (n2 + (n << 8));
        final int n4 = n3 / 1600;
        array[0] = n4;
        final int n5 = n3 - n4 * 1600;
        array[2] = n5 - (array[1] = n5 / 40) * 40;
    }
    
    private static void a(final aL p0, final StringBuilder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ef.f:I
        //     3: istore_2       
        //     4: iconst_3       
        //     5: newarray        I
        //     7: astore_3       
        //     8: iconst_0       
        //     9: istore          4
        //    11: iconst_0       
        //    12: istore          5
        //    14: aload_0        
        //    15: invokevirtual   com/google/aL.c:()I
        //    18: bipush          8
        //    20: if_icmpne       24
        //    23: return         
        //    24: aload_0        
        //    25: bipush          8
        //    27: invokevirtual   com/google/aL.a:(I)I
        //    30: istore          6
        //    32: iload           6
        //    34: sipush          254
        //    37: if_icmpeq       23
        //    40: iload           6
        //    42: aload_0        
        //    43: bipush          8
        //    45: invokevirtual   com/google/aL.a:(I)I
        //    48: aload_3        
        //    49: invokestatic    com/google/dJ.a:(II[I)V
        //    52: iconst_0       
        //    53: istore          7
        //    55: iload           7
        //    57: iconst_3       
        //    58: if_icmpge       445
        //    61: aload_3        
        //    62: iload           7
        //    64: iaload         
        //    65: istore          8
        //    67: iload           4
        //    69: tableswitch {
        //                0: 104
        //                1: 195
        //                2: 491
        //                3: 484
        //          default: 100
        //        }
        //   100: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   103: athrow         
        //   104: iload           8
        //   106: iconst_3       
        //   107: if_icmpge       120
        //   110: iload           8
        //   112: iconst_1       
        //   113: iadd           
        //   114: istore          4
        //   116: iload_2        
        //   117: ifeq            438
        //   120: getstatic       com/google/dJ.b:[C
        //   123: arraylength    
        //   124: istore          31
        //   126: iload           8
        //   128: iload           31
        //   130: if_icmpge       176
        //   133: getstatic       com/google/dJ.b:[C
        //   136: iload           8
        //   138: caload         
        //   139: istore          33
        //   141: iload           5
        //   143: ifeq            165
        //   146: aload_1        
        //   147: iload           33
        //   149: sipush          128
        //   152: iadd           
        //   153: i2c            
        //   154: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   157: pop            
        //   158: iload_2        
        //   159: ifeq            478
        //   162: iconst_0       
        //   163: istore          5
        //   165: aload_1        
        //   166: iload           33
        //   168: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   171: pop            
        //   172: iload_2        
        //   173: ifeq            438
        //   176: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   179: athrow         
        //   180: astore          32
        //   182: aload           32
        //   184: athrow         
        //   185: astore          30
        //   187: aload           30
        //   189: athrow         
        //   190: astore          34
        //   192: aload           34
        //   194: athrow         
        //   195: iload           5
        //   197: ifeq            471
        //   200: aload_1        
        //   201: iload           8
        //   203: sipush          128
        //   206: iadd           
        //   207: i2c            
        //   208: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   211: pop            
        //   212: iload_2        
        //   213: ifeq            465
        //   216: iconst_0       
        //   217: istore          9
        //   219: iload           8
        //   221: i2c            
        //   222: istore          26
        //   224: aload_1        
        //   225: iload           26
        //   227: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   230: pop            
        //   231: iload_2        
        //   232: ifeq            431
        //   235: getstatic       com/google/dJ.a:[C
        //   238: arraylength    
        //   239: istore          11
        //   241: iload           8
        //   243: iload           11
        //   245: if_icmpge       291
        //   248: getstatic       com/google/dJ.a:[C
        //   251: iload           8
        //   253: caload         
        //   254: istore          22
        //   256: iload           9
        //   258: ifeq            280
        //   261: aload_1        
        //   262: iload           22
        //   264: sipush          128
        //   267: iadd           
        //   268: i2c            
        //   269: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   272: pop            
        //   273: iload_2        
        //   274: ifeq            459
        //   277: iconst_0       
        //   278: istore          9
        //   280: aload_1        
        //   281: iload           22
        //   283: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   286: pop            
        //   287: iload_2        
        //   288: ifeq            352
        //   291: iload           8
        //   293: bipush          27
        //   295: if_icmpne       309
        //   298: aload_1        
        //   299: bipush          29
        //   301: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   304: pop            
        //   305: iload_2        
        //   306: ifeq            352
        //   309: iload           8
        //   311: bipush          30
        //   313: if_icmpne       323
        //   316: iconst_1       
        //   317: istore          9
        //   319: iload_2        
        //   320: ifeq            352
        //   323: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   326: athrow         
        //   327: astore          12
        //   329: aload           12
        //   331: athrow         
        //   332: astore          27
        //   334: aload           27
        //   336: athrow         
        //   337: astore          10
        //   339: aload           10
        //   341: athrow         
        //   342: astore          23
        //   344: aload           23
        //   346: athrow         
        //   347: astore          20
        //   349: aload           20
        //   351: athrow         
        //   352: iload_2        
        //   353: ifeq            431
        //   356: getstatic       com/google/dJ.c:[C
        //   359: arraylength    
        //   360: istore          14
        //   362: iload           8
        //   364: iload           14
        //   366: if_icmpge       412
        //   369: getstatic       com/google/dJ.c:[C
        //   372: iload           8
        //   374: caload         
        //   375: istore          16
        //   377: iload           9
        //   379: ifeq            401
        //   382: aload_1        
        //   383: iload           16
        //   385: sipush          128
        //   388: iadd           
        //   389: i2c            
        //   390: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   393: pop            
        //   394: iload_2        
        //   395: ifeq            453
        //   398: iconst_0       
        //   399: istore          9
        //   401: aload_1        
        //   402: iload           16
        //   404: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   407: pop            
        //   408: iload_2        
        //   409: ifeq            431
        //   412: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   415: athrow         
        //   416: astore          15
        //   418: aload           15
        //   420: athrow         
        //   421: astore          13
        //   423: aload           13
        //   425: athrow         
        //   426: astore          17
        //   428: aload           17
        //   430: athrow         
        //   431: iload           9
        //   433: istore          5
        //   435: iconst_0       
        //   436: istore          4
        //   438: iinc            7, 1
        //   441: iload_2        
        //   442: ifeq            55
        //   445: aload_0        
        //   446: invokevirtual   com/google/aL.c:()I
        //   449: ifgt            14
        //   452: return         
        //   453: iconst_0       
        //   454: istore          9
        //   456: goto            408
        //   459: iconst_0       
        //   460: istore          9
        //   462: goto            287
        //   465: iconst_0       
        //   466: istore          9
        //   468: goto            231
        //   471: iload           5
        //   473: istore          9
        //   475: goto            219
        //   478: iconst_0       
        //   479: istore          5
        //   481: goto            172
        //   484: iload           5
        //   486: istore          9
        //   488: goto            356
        //   491: iload           5
        //   493: istore          9
        //   495: goto            235
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  120    126    185    190    Ljava/lang/IllegalStateException;
        //  165    172    190    195    Ljava/lang/IllegalStateException;
        //  176    180    180    185    Ljava/lang/IllegalStateException;
        //  224    231    332    337    Ljava/lang/IllegalStateException;
        //  235    241    337    342    Ljava/lang/IllegalStateException;
        //  280    287    342    347    Ljava/lang/IllegalStateException;
        //  298    305    347    352    Ljava/lang/IllegalStateException;
        //  323    327    327    332    Ljava/lang/IllegalStateException;
        //  356    362    421    426    Ljava/lang/IllegalStateException;
        //  401    408    426    431    Ljava/lang/IllegalStateException;
        //  412    416    416    421    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 247, Size: 247
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
    
    private static void a(final aL al, final StringBuilder sb, final Collection collection) {
        int n = 0;
        final int f = ef.f;
        final int n2 = 1 + al.b();
        final int a = al.a(8);
        final int n3 = n2 + 1;
        final int a2 = a(a, n2);
        int n5 = 0;
        int n6 = 0;
        Label_0112: {
            if (a2 == 0) {
                final int n4 = al.c() / 8;
                if (f == 0) {
                    n5 = n3;
                    n6 = n4;
                    break Label_0112;
                }
            }
            if (a2 >= 250 || f != 0) {
                final int n7 = 250 * (a2 - 249);
                final int a3 = al.a(8);
                final int n8 = n3 + 1;
                n6 = n7 + a(a3, n3);
                n5 = n8;
            }
            else {
                n5 = n3;
                n6 = a2;
            }
        }
        if (n6 < 0) {
            try {
                throw fD.a();
            }
            catch (UnsupportedEncodingException ex) {
                throw ex;
            }
        }
        final byte[] array = new byte[n6];
        while (true) {
            final int n9;
            Label_0252: {
                if (n < n6) {
                    try {
                        if (al.c() < 8) {
                            throw fD.a();
                        }
                    }
                    catch (UnsupportedEncodingException ex2) {
                        throw ex2;
                    }
                    final int a4 = al.a(8);
                    n9 = n5 + 1;
                    array[n] = (byte)a(a4, n5);
                    ++n;
                    if (f == 0) {
                        break Label_0252;
                    }
                }
                collection.add(array);
                try {
                    sb.append(new String(array, dJ.z[0]));
                    return;
                }
                catch (UnsupportedEncodingException ex3) {
                    throw new IllegalStateException(dJ.z[1] + ex3);
                }
            }
            n5 = n9;
        }
    }
    
    private static void b(final aL p0, final StringBuilder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ef.f:I
        //     3: istore_2       
        //     4: iconst_3       
        //     5: newarray        I
        //     7: astore_3       
        //     8: iconst_0       
        //     9: istore          4
        //    11: iconst_0       
        //    12: istore          5
        //    14: aload_0        
        //    15: invokevirtual   com/google/aL.c:()I
        //    18: bipush          8
        //    20: if_icmpne       24
        //    23: return         
        //    24: aload_0        
        //    25: bipush          8
        //    27: invokevirtual   com/google/aL.a:(I)I
        //    30: istore          6
        //    32: iload           6
        //    34: sipush          254
        //    37: if_icmpeq       23
        //    40: iload           6
        //    42: aload_0        
        //    43: bipush          8
        //    45: invokevirtual   com/google/aL.a:(I)I
        //    48: aload_3        
        //    49: invokestatic    com/google/dJ.a:(II[I)V
        //    52: iconst_0       
        //    53: istore          7
        //    55: iload           7
        //    57: iconst_3       
        //    58: if_icmpge       418
        //    61: aload_3        
        //    62: iload           7
        //    64: iaload         
        //    65: istore          8
        //    67: iload           4
        //    69: tableswitch {
        //                0: 109
        //                1: 200
        //                2: 469
        //                3: 462
        //          default: 100
        //        }
        //   100: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   103: athrow         
        //   104: astore          16
        //   106: aload           16
        //   108: athrow         
        //   109: iload           8
        //   111: iconst_3       
        //   112: if_icmpge       125
        //   115: iload           8
        //   117: iconst_1       
        //   118: iadd           
        //   119: istore          4
        //   121: iload_2        
        //   122: ifeq            411
        //   125: getstatic       com/google/dJ.d:[C
        //   128: arraylength    
        //   129: istore          29
        //   131: iload           8
        //   133: iload           29
        //   135: if_icmpge       181
        //   138: getstatic       com/google/dJ.d:[C
        //   141: iload           8
        //   143: caload         
        //   144: istore          31
        //   146: iload           5
        //   148: ifeq            170
        //   151: aload_1        
        //   152: iload           31
        //   154: sipush          128
        //   157: iadd           
        //   158: i2c            
        //   159: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   162: pop            
        //   163: iload_2        
        //   164: ifeq            456
        //   167: iconst_0       
        //   168: istore          5
        //   170: aload_1        
        //   171: iload           31
        //   173: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   176: pop            
        //   177: iload_2        
        //   178: ifeq            411
        //   181: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   184: athrow         
        //   185: astore          30
        //   187: aload           30
        //   189: athrow         
        //   190: astore          28
        //   192: aload           28
        //   194: athrow         
        //   195: astore          32
        //   197: aload           32
        //   199: athrow         
        //   200: iload           5
        //   202: ifeq            449
        //   205: aload_1        
        //   206: iload           8
        //   208: sipush          128
        //   211: iadd           
        //   212: i2c            
        //   213: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   216: pop            
        //   217: iload_2        
        //   218: ifeq            443
        //   221: iconst_0       
        //   222: istore          9
        //   224: iload           8
        //   226: i2c            
        //   227: istore          24
        //   229: aload_1        
        //   230: iload           24
        //   232: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   235: pop            
        //   236: iload_2        
        //   237: ifeq            404
        //   240: getstatic       com/google/dJ.a:[C
        //   243: arraylength    
        //   244: istore          11
        //   246: iload           8
        //   248: iload           11
        //   250: if_icmpge       296
        //   253: getstatic       com/google/dJ.a:[C
        //   256: iload           8
        //   258: caload         
        //   259: istore          20
        //   261: iload           9
        //   263: ifeq            285
        //   266: aload_1        
        //   267: iload           20
        //   269: sipush          128
        //   272: iadd           
        //   273: i2c            
        //   274: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   277: pop            
        //   278: iload_2        
        //   279: ifeq            437
        //   282: iconst_0       
        //   283: istore          9
        //   285: aload_1        
        //   286: iload           20
        //   288: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   291: pop            
        //   292: iload_2        
        //   293: ifeq            357
        //   296: iload           8
        //   298: bipush          27
        //   300: if_icmpne       314
        //   303: aload_1        
        //   304: bipush          29
        //   306: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   309: pop            
        //   310: iload_2        
        //   311: ifeq            357
        //   314: iload           8
        //   316: bipush          30
        //   318: if_icmpne       328
        //   321: iconst_1       
        //   322: istore          9
        //   324: iload_2        
        //   325: ifeq            357
        //   328: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   331: athrow         
        //   332: astore          12
        //   334: aload           12
        //   336: athrow         
        //   337: astore          25
        //   339: aload           25
        //   341: athrow         
        //   342: astore          10
        //   344: aload           10
        //   346: athrow         
        //   347: astore          21
        //   349: aload           21
        //   351: athrow         
        //   352: astore          18
        //   354: aload           18
        //   356: athrow         
        //   357: iload_2        
        //   358: ifeq            404
        //   361: iload           9
        //   363: ifeq            385
        //   366: aload_1        
        //   367: iload           8
        //   369: sipush          224
        //   372: iadd           
        //   373: i2c            
        //   374: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   377: pop            
        //   378: iload_2        
        //   379: ifeq            431
        //   382: iconst_0       
        //   383: istore          9
        //   385: iload           8
        //   387: bipush          96
        //   389: iadd           
        //   390: i2c            
        //   391: istore          13
        //   393: aload_1        
        //   394: iload           13
        //   396: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   399: pop            
        //   400: iload_2        
        //   401: ifne            100
        //   404: iload           9
        //   406: istore          5
        //   408: iconst_0       
        //   409: istore          4
        //   411: iinc            7, 1
        //   414: iload_2        
        //   415: ifeq            55
        //   418: aload_0        
        //   419: invokevirtual   com/google/aL.c:()I
        //   422: ifgt            14
        //   425: return         
        //   426: astore          14
        //   428: aload           14
        //   430: athrow         
        //   431: iconst_0       
        //   432: istore          9
        //   434: goto            400
        //   437: iconst_0       
        //   438: istore          9
        //   440: goto            292
        //   443: iconst_0       
        //   444: istore          9
        //   446: goto            236
        //   449: iload           5
        //   451: istore          9
        //   453: goto            224
        //   456: iconst_0       
        //   457: istore          5
        //   459: goto            177
        //   462: iload           5
        //   464: istore          9
        //   466: goto            361
        //   469: iload           5
        //   471: istore          9
        //   473: goto            240
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  100    104    104    109    Ljava/lang/IllegalStateException;
        //  125    131    190    195    Ljava/lang/IllegalStateException;
        //  170    177    195    200    Ljava/lang/IllegalStateException;
        //  181    185    185    190    Ljava/lang/IllegalStateException;
        //  229    236    337    342    Ljava/lang/IllegalStateException;
        //  240    246    342    347    Ljava/lang/IllegalStateException;
        //  285    292    347    352    Ljava/lang/IllegalStateException;
        //  303    310    352    357    Ljava/lang/IllegalStateException;
        //  328    332    332    337    Ljava/lang/IllegalStateException;
        //  393    400    426    431    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 237, Size: 237
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
    
    private static void c(final aL p0, final StringBuilder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/ef.f:I
        //     3: istore_2       
        //     4: iconst_3       
        //     5: newarray        I
        //     7: astore_3       
        //     8: aload_0        
        //     9: invokevirtual   com/google/aL.c:()I
        //    12: bipush          8
        //    14: if_icmpne       18
        //    17: return         
        //    18: aload_0        
        //    19: bipush          8
        //    21: invokevirtual   com/google/aL.a:(I)I
        //    24: istore          4
        //    26: iload           4
        //    28: sipush          254
        //    31: if_icmpeq       17
        //    34: iload           4
        //    36: aload_0        
        //    37: bipush          8
        //    39: invokevirtual   com/google/aL.a:(I)I
        //    42: aload_3        
        //    43: invokestatic    com/google/dJ.a:(II[I)V
        //    46: iconst_0       
        //    47: istore          5
        //    49: iload           5
        //    51: iconst_3       
        //    52: if_icmpge       246
        //    55: aload_3        
        //    56: iload           5
        //    58: iaload         
        //    59: istore          6
        //    61: iload           6
        //    63: ifne            77
        //    66: aload_1        
        //    67: bipush          13
        //    69: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: iload_2        
        //    74: ifeq            239
        //    77: iload           6
        //    79: iconst_1       
        //    80: if_icmpne       94
        //    83: aload_1        
        //    84: bipush          42
        //    86: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    89: pop            
        //    90: iload_2        
        //    91: ifeq            239
        //    94: iload           6
        //    96: iconst_2       
        //    97: if_icmpne       111
        //   100: aload_1        
        //   101: bipush          62
        //   103: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   106: pop            
        //   107: iload_2        
        //   108: ifeq            239
        //   111: iload           6
        //   113: iconst_3       
        //   114: if_icmpne       128
        //   117: aload_1        
        //   118: bipush          32
        //   120: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   123: pop            
        //   124: iload_2        
        //   125: ifeq            239
        //   128: iload           6
        //   130: bipush          14
        //   132: if_icmpge       154
        //   135: iload           6
        //   137: bipush          44
        //   139: iadd           
        //   140: i2c            
        //   141: istore          10
        //   143: aload_1        
        //   144: iload           10
        //   146: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   149: pop            
        //   150: iload_2        
        //   151: ifeq            239
        //   154: iload           6
        //   156: bipush          40
        //   158: if_icmpge       180
        //   161: iload           6
        //   163: bipush          51
        //   165: iadd           
        //   166: i2c            
        //   167: istore          8
        //   169: aload_1        
        //   170: iload           8
        //   172: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   175: pop            
        //   176: iload_2        
        //   177: ifeq            239
        //   180: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   183: athrow         
        //   184: astore          7
        //   186: aload           7
        //   188: athrow         
        //   189: astore          23
        //   191: aload           23
        //   193: athrow         
        //   194: astore          24
        //   196: aload           24
        //   198: athrow         
        //   199: astore          20
        //   201: aload           20
        //   203: athrow         
        //   204: astore          21
        //   206: aload           21
        //   208: athrow         
        //   209: astore          17
        //   211: aload           17
        //   213: athrow         
        //   214: astore          18
        //   216: aload           18
        //   218: athrow         
        //   219: astore          14
        //   221: aload           14
        //   223: athrow         
        //   224: astore          15
        //   226: aload           15
        //   228: athrow         
        //   229: astore          11
        //   231: aload           11
        //   233: athrow         
        //   234: astore          12
        //   236: aload           12
        //   238: athrow         
        //   239: iinc            5, 1
        //   242: iload_2        
        //   243: ifeq            49
        //   246: aload_0        
        //   247: invokevirtual   com/google/aL.c:()I
        //   250: ifgt            8
        //   253: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  66     73     189    199    Ljava/lang/IllegalStateException;
        //  83     90     199    209    Ljava/lang/IllegalStateException;
        //  100    107    209    219    Ljava/lang/IllegalStateException;
        //  117    124    219    229    Ljava/lang/IllegalStateException;
        //  143    150    229    239    Ljava/lang/IllegalStateException;
        //  169    176    184    189    Ljava/lang/IllegalStateException;
        //  180    184    184    189    Ljava/lang/IllegalStateException;
        //  191    194    194    199    Ljava/lang/IllegalStateException;
        //  196    199    199    209    Ljava/lang/IllegalStateException;
        //  201    204    204    209    Ljava/lang/IllegalStateException;
        //  206    209    209    219    Ljava/lang/IllegalStateException;
        //  211    214    214    219    Ljava/lang/IllegalStateException;
        //  216    219    219    229    Ljava/lang/IllegalStateException;
        //  221    224    224    229    Ljava/lang/IllegalStateException;
        //  226    229    229    239    Ljava/lang/IllegalStateException;
        //  231    234    234    239    Ljava/lang/IllegalStateException;
        //  236    239    184    189    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 137, Size: 137
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
    
    private static void d(final aL al, final StringBuilder sb) {
        final int f = ef.f;
    Label_0013:
        while (al.c() > 16) {
            int n2;
            for (int i = 0; i < 4; i = n2) {
                int a = al.a(6);
                if (a == 31) {
                    final int n = 8 - al.a();
                    if (n == 8) {
                        break Label_0013;
                    }
                    try {
                        al.a(n);
                        return;
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                }
                if ((a & 0x20) == 0x0) {
                    a |= 0x40;
                }
                sb.append((char)a);
                n2 = i + 1;
                if (f != 0) {
                    break;
                }
            }
            if (al.c() <= 0) {
                return;
            }
        }
    }
}
