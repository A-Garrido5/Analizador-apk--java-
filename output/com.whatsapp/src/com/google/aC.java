// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

public final class aC extends AbstractMap implements Serializable
{
    private static final Comparator c;
    static final boolean d;
    private static final String[] z;
    h a;
    private d9 b;
    Comparator e;
    int f;
    private db g;
    int h;
    final h i;
    
    static {
        int d2 = 1;
        final String[] z2 = new String[2];
        final char[] charArray = "l[t@N#F'#O!Bf\u0012A.^b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = ' ';
                    break;
                }
                case 0: {
                    c3 = 'L';
                    break;
                }
                case 1: {
                    c3 = '2';
                    break;
                }
                case 2: {
                    c3 = '\u0007';
                    break;
                }
                case 3: {
                    c3 = '`';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "'W~@\u001dq\u0012i\u0015L ".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c4 = charArray2[n2];
            char c5 = '\0';
            switch (n2 % 5) {
                default: {
                    c5 = ' ';
                    break;
                }
                case 0: {
                    c5 = 'L';
                    break;
                }
                case 1: {
                    c5 = '2';
                    break;
                }
                case 2: {
                    c5 = '\u0007';
                    break;
                }
                case 3: {
                    c5 = '`';
                    break;
                }
            }
            charArray2[n2] = (char)(c5 ^ c4);
        }
        while (true) {
            z2[d2] = new String(charArray2).intern();
            z = z2;
            while (true) {
                try {
                    if (!aC.class.desiredAssertionStatus()) {
                        d = (d2 != 0);
                        c = new dT();
                        return;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                d2 = 0;
                continue;
            }
        }
    }
    
    public aC() {
        this(aC.c);
    }
    
    public aC(Comparator c) {
        this.f = 0;
        this.h = 0;
        this.i = new h();
        if (c == null) {
            c = aC.c;
        }
        this.e = c;
    }
    
    private void a(final h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/google/h.h:Lcom/google/h;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        com/google/h.g:Lcom/google/h;
        //     9: astore_3       
        //    10: aload_3        
        //    11: getfield        com/google/h.h:Lcom/google/h;
        //    14: astore          4
        //    16: aload_3        
        //    17: getfield        com/google/h.g:Lcom/google/h;
        //    20: astore          5
        //    22: aload_1        
        //    23: aload           4
        //    25: putfield        com/google/h.g:Lcom/google/h;
        //    28: aload           4
        //    30: ifnull          39
        //    33: aload           4
        //    35: aload_1        
        //    36: putfield        com/google/h.f:Lcom/google/h;
        //    39: aload_0        
        //    40: aload_1        
        //    41: aload_3        
        //    42: invokespecial   com/google/aC.a:(Lcom/google/h;Lcom/google/h;)V
        //    45: aload_3        
        //    46: aload_1        
        //    47: putfield        com/google/h.h:Lcom/google/h;
        //    50: aload_1        
        //    51: aload_3        
        //    52: putfield        com/google/h.f:Lcom/google/h;
        //    55: aload_2        
        //    56: ifnull          139
        //    59: aload_2        
        //    60: getfield        com/google/h.b:I
        //    63: istore          8
        //    65: iload           8
        //    67: istore          9
        //    69: aload           4
        //    71: ifnull          150
        //    74: aload           4
        //    76: getfield        com/google/h.b:I
        //    79: istore          10
        //    81: aload_1        
        //    82: iconst_1       
        //    83: iload           9
        //    85: iload           10
        //    87: invokestatic    java/lang/Math.max:(II)I
        //    90: iadd           
        //    91: putfield        com/google/h.b:I
        //    94: aload_1        
        //    95: getfield        com/google/h.b:I
        //    98: istore          12
        //   100: iconst_0       
        //   101: istore          13
        //   103: aload           5
        //   105: ifnull          115
        //   108: aload           5
        //   110: getfield        com/google/h.b:I
        //   113: istore          13
        //   115: aload_3        
        //   116: iconst_1       
        //   117: iload           12
        //   119: iload           13
        //   121: invokestatic    java/lang/Math.max:(II)I
        //   124: iadd           
        //   125: putfield        com/google/h.b:I
        //   128: return         
        //   129: astore          6
        //   131: aload           6
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //   139: iconst_0       
        //   140: istore          9
        //   142: goto            69
        //   145: astore          14
        //   147: aload           14
        //   149: athrow         
        //   150: iconst_0       
        //   151: istore          10
        //   153: goto            81
        //   156: astore          11
        //   158: aload           11
        //   160: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  22     28     129    134    Ljava/lang/NullPointerException;
        //  33     39     129    134    Ljava/lang/NullPointerException;
        //  39     55     134    139    Ljava/lang/NullPointerException;
        //  59     65     134    139    Ljava/lang/NullPointerException;
        //  74     81     145    150    Ljava/lang/NullPointerException;
        //  81     100    156    161    Ljava/lang/NullPointerException;
        //  108    115    156    161    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
    
    private void a(final h p0, final h p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/n.e:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: getfield        com/google/h.f:Lcom/google/h;
        //     8: astore          4
        //    10: aload_1        
        //    11: aconst_null    
        //    12: putfield        com/google/h.f:Lcom/google/h;
        //    15: aload_2        
        //    16: ifnull          25
        //    19: aload_2        
        //    20: aload           4
        //    22: putfield        com/google/h.f:Lcom/google/h;
        //    25: aload           4
        //    27: ifnull          115
        //    30: aload           4
        //    32: getfield        com/google/h.h:Lcom/google/h;
        //    35: astore          11
        //    37: aload           11
        //    39: aload_1        
        //    40: if_acmpne       53
        //    43: aload           4
        //    45: aload_2        
        //    46: putfield        com/google/h.h:Lcom/google/h;
        //    49: iload_3        
        //    50: ifeq            120
        //    53: getstatic       com/google/aC.d:Z
        //    56: istore          12
        //    58: iload           12
        //    60: ifne            105
        //    63: aload           4
        //    65: getfield        com/google/h.g:Lcom/google/h;
        //    68: aload_1        
        //    69: if_acmpeq       105
        //    72: new             Ljava/lang/AssertionError;
        //    75: dup            
        //    76: invokespecial   java/lang/AssertionError.<init>:()V
        //    79: athrow         
        //    80: astore          10
        //    82: aload           10
        //    84: athrow         
        //    85: astore          5
        //    87: aload           5
        //    89: athrow         
        //    90: astore          7
        //    92: aload           7
        //    94: athrow         
        //    95: astore          8
        //    97: aload           8
        //    99: athrow         
        //   100: astore          9
        //   102: aload           9
        //   104: athrow         
        //   105: aload           4
        //   107: aload_2        
        //   108: putfield        com/google/h.g:Lcom/google/h;
        //   111: iload_3        
        //   112: ifeq            120
        //   115: aload_0        
        //   116: aload_2        
        //   117: putfield        com/google/aC.a:Lcom/google/h;
        //   120: return         
        //   121: astore          6
        //   123: aload           6
        //   125: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  10     15     85     90     Ljava/lang/NullPointerException;
        //  19     25     85     90     Ljava/lang/NullPointerException;
        //  30     37     90     95     Ljava/lang/NullPointerException;
        //  43     49     95     100    Ljava/lang/NullPointerException;
        //  53     58     100    105    Ljava/lang/NullPointerException;
        //  63     80     80     85     Ljava/lang/NullPointerException;
        //  92     95     95     100    Ljava/lang/NullPointerException;
        //  97     100    100    105    Ljava/lang/NullPointerException;
        //  102    105    80     85     Ljava/lang/NullPointerException;
        //  105    111    121    126    Ljava/lang/NullPointerException;
        //  115    120    121    126    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
    
    private void a(final h p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/n.e:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnull          506
        //     8: aload_1        
        //     9: getfield        com/google/h.h:Lcom/google/h;
        //    12: astore          4
        //    14: aload_1        
        //    15: getfield        com/google/h.g:Lcom/google/h;
        //    18: astore          5
        //    20: aload           4
        //    22: ifnull          165
        //    25: aload           4
        //    27: getfield        com/google/h.b:I
        //    30: istore          6
        //    32: aload           5
        //    34: ifnull          176
        //    37: aload           5
        //    39: getfield        com/google/h.b:I
        //    42: istore          40
        //    44: iload           40
        //    46: istore          7
        //    48: iload           6
        //    50: iload           7
        //    52: isub           
        //    53: istore          8
        //    55: iload           8
        //    57: bipush          -2
        //    59: if_icmpne       237
        //    62: aload           5
        //    64: getfield        com/google/h.h:Lcom/google/h;
        //    67: astore          28
        //    69: aload           5
        //    71: getfield        com/google/h.g:Lcom/google/h;
        //    74: astore          29
        //    76: aload           29
        //    78: ifnull          187
        //    81: aload           29
        //    83: getfield        com/google/h.b:I
        //    86: istore          30
        //    88: aload           28
        //    90: ifnull          198
        //    93: aload           28
        //    95: getfield        com/google/h.b:I
        //    98: istore          31
        //   100: iload           31
        //   102: iload           30
        //   104: isub           
        //   105: istore          32
        //   107: iload           32
        //   109: iconst_m1      
        //   110: if_icmpeq       122
        //   113: iload           32
        //   115: ifne            131
        //   118: iload_2        
        //   119: ifne            131
        //   122: aload_0        
        //   123: aload_1        
        //   124: invokespecial   com/google/aC.a:(Lcom/google/h;)V
        //   127: iload_3        
        //   128: ifeq            225
        //   131: getstatic       com/google/aC.d:Z
        //   134: istore          36
        //   136: iload           36
        //   138: ifne            214
        //   141: iload           32
        //   143: iconst_1       
        //   144: if_icmpeq       214
        //   147: new             Ljava/lang/AssertionError;
        //   150: dup            
        //   151: invokespecial   java/lang/AssertionError.<init>:()V
        //   154: athrow         
        //   155: astore          35
        //   157: aload           35
        //   159: athrow         
        //   160: astore          41
        //   162: aload           41
        //   164: athrow         
        //   165: iconst_0       
        //   166: istore          6
        //   168: goto            32
        //   171: astore          39
        //   173: aload           39
        //   175: athrow         
        //   176: iconst_0       
        //   177: istore          7
        //   179: goto            48
        //   182: astore          38
        //   184: aload           38
        //   186: athrow         
        //   187: iconst_0       
        //   188: istore          30
        //   190: goto            88
        //   193: astore          37
        //   195: aload           37
        //   197: athrow         
        //   198: iconst_0       
        //   199: istore          31
        //   201: goto            100
        //   204: astore          33
        //   206: aload           33
        //   208: athrow         
        //   209: astore          34
        //   211: aload           34
        //   213: athrow         
        //   214: aload_0        
        //   215: aload           5
        //   217: invokespecial   com/google/aC.b:(Lcom/google/h;)V
        //   220: aload_0        
        //   221: aload_1        
        //   222: invokespecial   com/google/aC.a:(Lcom/google/h;)V
        //   225: iload_2        
        //   226: ifeq            233
        //   229: iload_3        
        //   230: ifeq            506
        //   233: iload_3        
        //   234: ifeq            497
        //   237: iload           8
        //   239: iconst_2       
        //   240: if_icmpne       396
        //   243: aload           4
        //   245: getfield        com/google/h.h:Lcom/google/h;
        //   248: astore          17
        //   250: aload           4
        //   252: getfield        com/google/h.g:Lcom/google/h;
        //   255: astore          18
        //   257: aload           18
        //   259: ifnull          346
        //   262: aload           18
        //   264: getfield        com/google/h.b:I
        //   267: istore          19
        //   269: aload           17
        //   271: ifnull          357
        //   274: aload           17
        //   276: getfield        com/google/h.b:I
        //   279: istore          20
        //   281: iload           20
        //   283: iload           19
        //   285: isub           
        //   286: istore          21
        //   288: iload           21
        //   290: iconst_1       
        //   291: if_icmpeq       303
        //   294: iload           21
        //   296: ifne            312
        //   299: iload_2        
        //   300: ifne            312
        //   303: aload_0        
        //   304: aload_1        
        //   305: invokespecial   com/google/aC.b:(Lcom/google/h;)V
        //   308: iload_3        
        //   309: ifeq            384
        //   312: getstatic       com/google/aC.d:Z
        //   315: istore          25
        //   317: iload           25
        //   319: ifne            373
        //   322: iload           21
        //   324: iconst_m1      
        //   325: if_icmpeq       373
        //   328: new             Ljava/lang/AssertionError;
        //   331: dup            
        //   332: invokespecial   java/lang/AssertionError.<init>:()V
        //   335: athrow         
        //   336: astore          24
        //   338: aload           24
        //   340: athrow         
        //   341: astore          27
        //   343: aload           27
        //   345: athrow         
        //   346: iconst_0       
        //   347: istore          19
        //   349: goto            269
        //   352: astore          26
        //   354: aload           26
        //   356: athrow         
        //   357: iconst_0       
        //   358: istore          20
        //   360: goto            281
        //   363: astore          22
        //   365: aload           22
        //   367: athrow         
        //   368: astore          23
        //   370: aload           23
        //   372: athrow         
        //   373: aload_0        
        //   374: aload           4
        //   376: invokespecial   com/google/aC.a:(Lcom/google/h;)V
        //   379: aload_0        
        //   380: aload_1        
        //   381: invokespecial   com/google/aC.b:(Lcom/google/h;)V
        //   384: iload_2        
        //   385: ifeq            392
        //   388: iload_3        
        //   389: ifeq            506
        //   392: iload_3        
        //   393: ifeq            497
        //   396: iload           8
        //   398: ifne            421
        //   401: iload           6
        //   403: iconst_1       
        //   404: iadd           
        //   405: istore          14
        //   407: aload_1        
        //   408: iload           14
        //   410: putfield        com/google/h.b:I
        //   413: iload_2        
        //   414: ifeq            497
        //   417: iload_3        
        //   418: ifeq            506
        //   421: getstatic       com/google/aC.d:Z
        //   424: istore          12
        //   426: iload           12
        //   428: ifne            476
        //   431: iload           8
        //   433: iconst_m1      
        //   434: if_icmpeq       476
        //   437: iload           8
        //   439: iconst_1       
        //   440: if_icmpeq       476
        //   443: new             Ljava/lang/AssertionError;
        //   446: dup            
        //   447: invokespecial   java/lang/AssertionError.<init>:()V
        //   450: athrow         
        //   451: astore          11
        //   453: aload           11
        //   455: athrow         
        //   456: astore          15
        //   458: aload           15
        //   460: athrow         
        //   461: astore          16
        //   463: aload           16
        //   465: athrow         
        //   466: astore          9
        //   468: aload           9
        //   470: athrow         
        //   471: astore          10
        //   473: aload           10
        //   475: athrow         
        //   476: aload_1        
        //   477: iconst_1       
        //   478: iload           6
        //   480: iload           7
        //   482: invokestatic    java/lang/Math.max:(II)I
        //   485: iadd           
        //   486: putfield        com/google/h.b:I
        //   489: iload_2        
        //   490: ifne            497
        //   493: iload_3        
        //   494: ifeq            506
        //   497: aload_1        
        //   498: getfield        com/google/h.f:Lcom/google/h;
        //   501: astore_1       
        //   502: iload_3        
        //   503: ifeq            4
        //   506: return         
        //   507: astore          13
        //   509: aload           13
        //   511: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  25     32     160    165    Ljava/lang/NullPointerException;
        //  37     44     171    176    Ljava/lang/NullPointerException;
        //  81     88     182    187    Ljava/lang/NullPointerException;
        //  93     100    193    198    Ljava/lang/NullPointerException;
        //  122    127    204    209    Ljava/lang/NullPointerException;
        //  131    136    209    214    Ljava/lang/NullPointerException;
        //  147    155    155    160    Ljava/lang/NullPointerException;
        //  206    209    209    214    Ljava/lang/NullPointerException;
        //  211    214    155    160    Ljava/lang/NullPointerException;
        //  262    269    341    346    Ljava/lang/NullPointerException;
        //  274    281    352    357    Ljava/lang/NullPointerException;
        //  303    308    363    368    Ljava/lang/NullPointerException;
        //  312    317    368    373    Ljava/lang/NullPointerException;
        //  328    336    336    341    Ljava/lang/NullPointerException;
        //  365    368    368    373    Ljava/lang/NullPointerException;
        //  370    373    336    341    Ljava/lang/NullPointerException;
        //  407    413    456    466    Ljava/lang/NullPointerException;
        //  421    426    466    476    Ljava/lang/NullPointerException;
        //  443    451    451    456    Ljava/lang/NullPointerException;
        //  458    461    461    466    Ljava/lang/NullPointerException;
        //  463    466    466    476    Ljava/lang/NullPointerException;
        //  468    471    471    476    Ljava/lang/NullPointerException;
        //  473    476    451    456    Ljava/lang/NullPointerException;
        //  476    489    507    512    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 258, Size: 258
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
    
    private boolean a(final Object o, final Object o2) {
        if (o == o2) {
            return true;
        }
        if (o == null) {
            return false;
        }
        try {
            if (o.equals(o2)) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    private void b(final h p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/google/h.h:Lcom/google/h;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        com/google/h.g:Lcom/google/h;
        //     9: astore_3       
        //    10: aload_2        
        //    11: getfield        com/google/h.h:Lcom/google/h;
        //    14: astore          4
        //    16: aload_2        
        //    17: getfield        com/google/h.g:Lcom/google/h;
        //    20: astore          5
        //    22: aload_1        
        //    23: aload           5
        //    25: putfield        com/google/h.h:Lcom/google/h;
        //    28: aload           5
        //    30: ifnull          39
        //    33: aload           5
        //    35: aload_1        
        //    36: putfield        com/google/h.f:Lcom/google/h;
        //    39: aload_0        
        //    40: aload_1        
        //    41: aload_2        
        //    42: invokespecial   com/google/aC.a:(Lcom/google/h;Lcom/google/h;)V
        //    45: aload_2        
        //    46: aload_1        
        //    47: putfield        com/google/h.g:Lcom/google/h;
        //    50: aload_1        
        //    51: aload_2        
        //    52: putfield        com/google/h.f:Lcom/google/h;
        //    55: aload_3        
        //    56: ifnull          139
        //    59: aload_3        
        //    60: getfield        com/google/h.b:I
        //    63: istore          8
        //    65: iload           8
        //    67: istore          9
        //    69: aload           5
        //    71: ifnull          150
        //    74: aload           5
        //    76: getfield        com/google/h.b:I
        //    79: istore          10
        //    81: aload_1        
        //    82: iconst_1       
        //    83: iload           9
        //    85: iload           10
        //    87: invokestatic    java/lang/Math.max:(II)I
        //    90: iadd           
        //    91: putfield        com/google/h.b:I
        //    94: aload_1        
        //    95: getfield        com/google/h.b:I
        //    98: istore          12
        //   100: iconst_0       
        //   101: istore          13
        //   103: aload           4
        //   105: ifnull          115
        //   108: aload           4
        //   110: getfield        com/google/h.b:I
        //   113: istore          13
        //   115: aload_2        
        //   116: iconst_1       
        //   117: iload           12
        //   119: iload           13
        //   121: invokestatic    java/lang/Math.max:(II)I
        //   124: iadd           
        //   125: putfield        com/google/h.b:I
        //   128: return         
        //   129: astore          6
        //   131: aload           6
        //   133: athrow         
        //   134: astore          7
        //   136: aload           7
        //   138: athrow         
        //   139: iconst_0       
        //   140: istore          9
        //   142: goto            69
        //   145: astore          14
        //   147: aload           14
        //   149: athrow         
        //   150: iconst_0       
        //   151: istore          10
        //   153: goto            81
        //   156: astore          11
        //   158: aload           11
        //   160: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  22     28     129    134    Ljava/lang/NullPointerException;
        //  33     39     129    134    Ljava/lang/NullPointerException;
        //  39     55     134    139    Ljava/lang/NullPointerException;
        //  59     65     134    139    Ljava/lang/NullPointerException;
        //  74     81     145    150    Ljava/lang/NullPointerException;
        //  81     100    156    161    Ljava/lang/NullPointerException;
        //  108    115    156    161    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 85, Size: 85
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
    
    private Object writeReplace() {
        return new LinkedHashMap(this);
    }
    
    h a(final Object o) {
        final h b = this.b(o);
        if (b == null) {
            return b;
        }
        try {
            this.b(b, true);
            return b;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    h a(final Object o, final boolean b) {
        final int e = n.e;
        final Comparator e2 = this.e;
        h a = this.a;
        int n = 0;
        Comparable<Object> comparable;
        h h;
        h h2 = null;
        h i = null;
        Comparator comparator;
        Comparator<Object> comparator2;
        Comparator comparator3;
        Object o2;
        boolean b2;
        StringBuilder sb;
        Object o3;
        Class<?> clazz;
        String s;
        StringBuilder sb2;
        String[] array;
        int n2;
        String s2;
        StringBuilder sb3;
        String s3;
        ClassCastException ex2;
        h g;
        Label_0038:Label_0110_Outer:
        while (true) {
            Label_0303: {
                Label_0254: {
                    Label_0210: {
                        while (true) {
                            Label_0127: {
                                if (a == null) {
                                    break Label_0127;
                                }
                                while (true) {
                                    while (true) {
                                        Label_0080: {
                                            try {
                                                if (e2 == aC.c) {
                                                    comparable = (Comparable<Object>)o;
                                                    if (comparable == null) {
                                                        break Label_0080;
                                                    }
                                                    n = comparable.compareTo(a.a);
                                                    if (n == 0) {
                                                        h = a;
                                                        return h;
                                                    }
                                                    break;
                                                }
                                            }
                                            catch (NullPointerException ex) {
                                                throw ex;
                                            }
                                            comparable = null;
                                            continue Label_0038;
                                        }
                                        n = e2.compare(o, a.a);
                                        continue Label_0110_Outer;
                                    }
                                }
                                if (n >= 0) {
                                    break Label_0210;
                                }
                                try {
                                    h2 = a.h;
                                    if (h2 != null || e != 0) {
                                        if (e == 0) {
                                            break Label_0303;
                                        }
                                        a = h2;
                                    }
                                    h = null;
                                    if (!b) {
                                        return h;
                                    }
                                    i = this.i;
                                    if (a != null) {
                                        break Label_0254;
                                    }
                                    comparator = aC.c;
                                    comparator2 = (Comparator<Object>)e2;
                                    comparator3 = comparator;
                                    if (comparator2 != comparator3) {
                                        break Label_0210;
                                    }
                                    try {
                                        o2 = o;
                                        b2 = (o2 instanceof Comparable);
                                        if (!b2) {
                                            sb = new StringBuilder();
                                            o3 = o;
                                            clazz = o3.getClass();
                                            s = clazz.getName();
                                            sb2 = sb.append(s);
                                            array = aC.z;
                                            n2 = 0;
                                            s2 = array[n2];
                                            sb3 = sb2.append(s2);
                                            s3 = sb3.toString();
                                            ex2 = new ClassCastException(s3);
                                            throw ex2;
                                        }
                                        break Label_0210;
                                    }
                                    catch (NullPointerException ex3) {
                                        throw ex3;
                                    }
                                }
                                catch (NullPointerException ex4) {
                                    throw ex4;
                                }
                            }
                            try {
                                comparator = aC.c;
                                comparator2 = (Comparator<Object>)e2;
                                comparator3 = comparator;
                                if (comparator2 != comparator3) {
                                    break Label_0210;
                                }
                                o2 = o;
                                b2 = (o2 instanceof Comparable);
                                if (!b2) {
                                    sb = new StringBuilder();
                                    o3 = o;
                                    clazz = o3.getClass();
                                    s = clazz.getName();
                                    sb2 = sb.append(s);
                                    array = aC.z;
                                    n2 = 0;
                                    s2 = array[n2];
                                    sb3 = sb2.append(s2);
                                    s3 = sb3.toString();
                                    ex2 = new ClassCastException(s3);
                                    throw ex2;
                                }
                                break Label_0210;
                                h2 = a.g;
                                continue;
                            }
                            catch (NullPointerException ex5) {
                                throw ex5;
                            }
                            break;
                        }
                    }
                    g = new h(a, o, i, i.c);
                    this.a = g;
                    if (e == 0) {
                        break Label_0303;
                    }
                }
                g = new h(a, o, i, i.c);
                Label_0289: {
                    if (n >= 0) {
                        break Label_0289;
                    }
                    try {
                        a.h = g;
                        if (e != 0) {
                            a.g = g;
                        }
                        this.a(a, true);
                        ++this.f;
                        ++this.h;
                        return g;
                    }
                    catch (NullPointerException ex6) {
                        throw ex6;
                    }
                }
            }
            a = h2;
            continue Label_0038;
        }
    }
    
    h a(final Entry entry) {
        final h b = this.b(entry.getKey());
        while (true) {
            Label_0049: {
                if (b == null) {
                    break Label_0049;
                }
                try {
                    if (this.a(b.e, entry.getValue())) {
                        final int n = 1;
                        if (n != 0) {
                            return b;
                        }
                        return null;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            final int n = 0;
            continue;
        }
    }
    
    h b(final Object o) {
        h a = null;
        if (o == null) {
            return a;
        }
        try {
            a = this.a(o, false);
            return a;
        }
        catch (ClassCastException ex) {
            try {
                throw ex;
            }
            catch (ClassCastException ex2) {
                return null;
            }
        }
    }
    
    void b(final h p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: iload_2        
        //     5: ifeq            30
        //     8: aload_1        
        //     9: getfield        com/google/h.c:Lcom/google/h;
        //    12: aload_1        
        //    13: getfield        com/google/h.d:Lcom/google/h;
        //    16: putfield        com/google/h.d:Lcom/google/h;
        //    19: aload_1        
        //    20: getfield        com/google/h.d:Lcom/google/h;
        //    23: aload_1        
        //    24: getfield        com/google/h.c:Lcom/google/h;
        //    27: putfield        com/google/h.c:Lcom/google/h;
        //    30: aload_1        
        //    31: getfield        com/google/h.h:Lcom/google/h;
        //    34: astore          4
        //    36: aload_1        
        //    37: getfield        com/google/h.g:Lcom/google/h;
        //    40: astore          5
        //    42: aload_1        
        //    43: getfield        com/google/h.f:Lcom/google/h;
        //    46: astore          6
        //    48: aload           4
        //    50: ifnull          208
        //    53: aload           5
        //    55: ifnull          208
        //    58: aload           4
        //    60: getfield        com/google/h.b:I
        //    63: aload           5
        //    65: getfield        com/google/h.b:I
        //    68: if_icmple       198
        //    71: aload           4
        //    73: invokevirtual   com/google/h.a:()Lcom/google/h;
        //    76: astore          16
        //    78: aload           16
        //    80: astore          11
        //    82: aload_0        
        //    83: aload           11
        //    85: iconst_0       
        //    86: invokevirtual   com/google/aC.b:(Lcom/google/h;Z)V
        //    89: aload_1        
        //    90: getfield        com/google/h.h:Lcom/google/h;
        //    93: astore          12
        //    95: aload           12
        //    97: ifnull          299
        //   100: aload           12
        //   102: getfield        com/google/h.b:I
        //   105: istore          13
        //   107: aload           11
        //   109: aload           12
        //   111: putfield        com/google/h.h:Lcom/google/h;
        //   114: aload           12
        //   116: aload           11
        //   118: putfield        com/google/h.f:Lcom/google/h;
        //   121: aload_1        
        //   122: aconst_null    
        //   123: putfield        com/google/h.h:Lcom/google/h;
        //   126: aload_1        
        //   127: getfield        com/google/h.g:Lcom/google/h;
        //   130: astore          14
        //   132: iconst_0       
        //   133: istore          15
        //   135: aload           14
        //   137: ifnull          166
        //   140: aload           14
        //   142: getfield        com/google/h.b:I
        //   145: istore          15
        //   147: aload           11
        //   149: aload           14
        //   151: putfield        com/google/h.g:Lcom/google/h;
        //   154: aload           14
        //   156: aload           11
        //   158: putfield        com/google/h.f:Lcom/google/h;
        //   161: aload_1        
        //   162: aconst_null    
        //   163: putfield        com/google/h.g:Lcom/google/h;
        //   166: aload           11
        //   168: iconst_1       
        //   169: iload           13
        //   171: iload           15
        //   173: invokestatic    java/lang/Math.max:(II)I
        //   176: iadd           
        //   177: putfield        com/google/h.b:I
        //   180: aload_0        
        //   181: aload_1        
        //   182: aload           11
        //   184: invokespecial   com/google/aC.a:(Lcom/google/h;Lcom/google/h;)V
        //   187: return         
        //   188: astore          17
        //   190: aload           17
        //   192: athrow         
        //   193: astore          10
        //   195: aload           10
        //   197: athrow         
        //   198: aload           5
        //   200: invokevirtual   com/google/h.b:()Lcom/google/h;
        //   203: astore          11
        //   205: goto            82
        //   208: aload           4
        //   210: ifnull          229
        //   213: aload_0        
        //   214: aload_1        
        //   215: aload           4
        //   217: invokespecial   com/google/aC.a:(Lcom/google/h;Lcom/google/h;)V
        //   220: aload_1        
        //   221: aconst_null    
        //   222: putfield        com/google/h.h:Lcom/google/h;
        //   225: iload_3        
        //   226: ifeq            256
        //   229: aload           5
        //   231: ifnull          250
        //   234: aload_0        
        //   235: aload_1        
        //   236: aload           5
        //   238: invokespecial   com/google/aC.a:(Lcom/google/h;Lcom/google/h;)V
        //   241: aload_1        
        //   242: aconst_null    
        //   243: putfield        com/google/h.g:Lcom/google/h;
        //   246: iload_3        
        //   247: ifeq            256
        //   250: aload_0        
        //   251: aload_1        
        //   252: aconst_null    
        //   253: invokespecial   com/google/aC.a:(Lcom/google/h;Lcom/google/h;)V
        //   256: aload_0        
        //   257: aload           6
        //   259: iconst_0       
        //   260: invokespecial   com/google/aC.a:(Lcom/google/h;Z)V
        //   263: aload_0        
        //   264: iconst_m1      
        //   265: aload_0        
        //   266: getfield        com/google/aC.f:I
        //   269: iadd           
        //   270: putfield        com/google/aC.f:I
        //   273: aload_0        
        //   274: iconst_1       
        //   275: aload_0        
        //   276: getfield        com/google/aC.h:I
        //   279: iadd           
        //   280: putfield        com/google/aC.h:I
        //   283: return         
        //   284: astore          8
        //   286: aload           8
        //   288: athrow         
        //   289: astore          9
        //   291: aload           9
        //   293: athrow         
        //   294: astore          7
        //   296: aload           7
        //   298: athrow         
        //   299: iconst_0       
        //   300: istore          13
        //   302: goto            126
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  8      30     188    193    Ljava/lang/NullPointerException;
        //  58     78     193    198    Ljava/lang/NullPointerException;
        //  213    225    284    294    Ljava/lang/NullPointerException;
        //  234    246    294    299    Ljava/lang/NullPointerException;
        //  250    256    294    299    Ljava/lang/NullPointerException;
        //  286    289    289    294    Ljava/lang/NullPointerException;
        //  291    294    294    299    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
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
    public void clear() {
        this.a = null;
        this.f = 0;
        ++this.h;
        final h i = this.i;
        i.c = i;
        i.d = i;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        try {
            if (this.b(o) != null) {
                return true;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public Set entrySet() {
        final d9 b = this.b;
        if (b != null) {
            return b;
        }
        return this.b = new d9(this);
    }
    
    @Override
    public Object get(final Object o) {
        final h b = this.b(o);
        if (b != null) {
            try {
                return b.e;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    @Override
    public Set keySet() {
        final db g = this.g;
        if (g != null) {
            return g;
        }
        return this.g = new db(this);
    }
    
    @Override
    public Object put(final Object o, final Object e) {
        if (o == null) {
            try {
                throw new NullPointerException(aC.z[1]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        final h a = this.a(o, true);
        final Object e2 = a.e;
        a.e = e;
        return e2;
    }
    
    @Override
    public Object remove(final Object o) {
        final h a = this.a(o);
        if (a != null) {
            try {
                return a.e;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        return null;
    }
    
    @Override
    public int size() {
        return this.f;
    }
}
