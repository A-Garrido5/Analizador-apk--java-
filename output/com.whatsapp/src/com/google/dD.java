// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collections;
import java.io.Serializable;

public abstract class dD extends di implements Serializable
{
    private static final long serialVersionUID = 1L;
    private static final String z;
    
    static {
        final char[] charArray = "ai\u0017L\u0018\\r^LMEq\u0011L]Q!\nP\u0018Wd^PNPs\fV\\Qd\u0010\u001fZL!\rJZVm\u001fLKPrP".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '8';
                    break;
                }
                case 0: {
                    c2 = '5';
                    break;
                }
                case 1: {
                    c2 = '\u0001';
                    break;
                }
                case 2: {
                    c2 = '~';
                    break;
                }
                case 3: {
                    c2 = '?';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected dD() {
    }
    
    protected dD(final gm gm) {
    }
    
    public static ax a(final ci ci, final ci ci2, final dw dw, final int n, final el el, final boolean b) {
        return new ax(ci, Collections.emptyList(), ci2, new Z(dw, n, el, true, b, null), null);
    }
    
    public static ax a(final ci ci, final Object o, final ci ci2, final dw dw, final int n, final el el) {
        return new ax(ci, o, ci2, new Z(dw, n, el, false, false, null), null);
    }
    
    static boolean a(final bB bb, final ci ci, final cL cl, final fu fu, final int n) {
        return b(bb, ci, cl, fu, n);
    }
    
    private static boolean b(final bB p0, final ci p1, final cL p2, final fu p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore          5
        //     3: getstatic       com/google/dt.b:Z
        //     6: istore          6
        //     8: iload           4
        //    10: invokestatic    com/google/cp.a:(I)I
        //    13: istore          7
        //    15: aload_3        
        //    16: aload_1        
        //    17: iload           4
        //    19: invokestatic    com/google/cp.b:(I)I
        //    22: invokevirtual   com/google/fu.a:(Lcom/google/ci;I)Lcom/google/ax;
        //    25: astore          8
        //    27: aload           8
        //    29: ifnonnull       619
        //    32: iload           6
        //    34: ifeq            609
        //    37: iload           5
        //    39: istore          9
        //    41: aload           8
        //    43: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //    46: invokevirtual   com/google/Z.e:()Lcom/google/el;
        //    49: iconst_0       
        //    50: invokestatic    com/google/bB.a:(Lcom/google/el;Z)I
        //    53: istore          11
        //    55: iload           7
        //    57: iload           11
        //    59: if_icmpne       70
        //    62: iconst_0       
        //    63: istore          12
        //    65: iload           6
        //    67: ifeq            146
        //    70: aload           8
        //    72: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //    75: invokestatic    com/google/Z.c:(Lcom/google/Z;)Z
        //    78: istore          36
        //    80: iconst_0       
        //    81: istore          12
        //    83: iload           36
        //    85: ifeq            142
        //    88: aload           8
        //    90: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //    93: invokestatic    com/google/Z.b:(Lcom/google/Z;)Lcom/google/el;
        //    96: invokevirtual   com/google/el.isPackable:()Z
        //    99: istore          37
        //   101: iconst_0       
        //   102: istore          12
        //   104: iload           37
        //   106: ifeq            142
        //   109: aload           8
        //   111: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   114: invokevirtual   com/google/Z.e:()Lcom/google/el;
        //   117: iconst_1       
        //   118: invokestatic    com/google/bB.a:(Lcom/google/el;Z)I
        //   121: istore          38
        //   123: iconst_0       
        //   124: istore          12
        //   126: iload           7
        //   128: iload           38
        //   130: if_icmpne       142
        //   133: iload           6
        //   135: ifeq            602
        //   138: iload           5
        //   140: istore          12
        //   142: iload           5
        //   144: istore          9
        //   146: iload           9
        //   148: ifeq            186
        //   151: aload_2        
        //   152: iload           4
        //   154: invokevirtual   com/google/cL.d:(I)Z
        //   157: istore          33
        //   159: iload           33
        //   161: istore          5
        //   163: iload           5
        //   165: ireturn        
        //   166: astore          10
        //   168: aload           10
        //   170: athrow         
        //   171: astore          34
        //   173: aload           34
        //   175: athrow         
        //   176: astore          35
        //   178: aload           35
        //   180: athrow         
        //   181: astore          32
        //   183: aload           32
        //   185: athrow         
        //   186: iload           12
        //   188: ifeq            318
        //   191: aload_2        
        //   192: aload_2        
        //   193: invokevirtual   com/google/cL.i:()I
        //   196: invokevirtual   com/google/cL.c:(I)I
        //   199: istore          26
        //   201: aload           8
        //   203: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   206: invokevirtual   com/google/Z.e:()Lcom/google/el;
        //   209: getstatic       com/google/el.ENUM:Lcom/google/el;
        //   212: if_acmpne       270
        //   215: aload_2        
        //   216: invokevirtual   com/google/cL.s:()I
        //   219: istore          28
        //   221: iload           28
        //   223: ifle            307
        //   226: aload_2        
        //   227: invokevirtual   com/google/cL.g:()I
        //   230: istore          29
        //   232: aload           8
        //   234: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   237: invokevirtual   com/google/Z.a:()Lcom/google/dw;
        //   240: iload           29
        //   242: invokeinterface com/google/dw.a:(I)Lcom/google/fc;
        //   247: astore          30
        //   249: aload           30
        //   251: ifnull          163
        //   254: aload_0        
        //   255: aload           8
        //   257: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   260: aload           30
        //   262: invokevirtual   com/google/bB.c:(Lcom/google/aK;Ljava/lang/Object;)V
        //   265: iload           6
        //   267: ifeq            215
        //   270: aload_2        
        //   271: invokevirtual   com/google/cL.s:()I
        //   274: ifle            307
        //   277: aload_2        
        //   278: aload           8
        //   280: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   283: invokevirtual   com/google/Z.e:()Lcom/google/el;
        //   286: invokestatic    com/google/bB.a:(Lcom/google/cL;Lcom/google/el;)Ljava/lang/Object;
        //   289: astore          31
        //   291: aload_0        
        //   292: aload           8
        //   294: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   297: aload           31
        //   299: invokevirtual   com/google/bB.c:(Lcom/google/aK;Ljava/lang/Object;)V
        //   302: iload           6
        //   304: ifeq            270
        //   307: aload_2        
        //   308: iload           26
        //   310: invokevirtual   com/google/cL.a:(I)V
        //   313: iload           6
        //   315: ifeq            163
        //   318: getstatic       com/google/cM.a:[I
        //   321: aload           8
        //   323: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   326: invokevirtual   com/google/Z.d:()Lcom/google/es;
        //   329: invokevirtual   com/google/es.ordinal:()I
        //   332: iaload         
        //   333: istore          14
        //   335: iload           14
        //   337: tableswitch {
        //                2: 434
        //                3: 550
        //          default: 360
        //        }
        //   360: aload_2        
        //   361: aload           8
        //   363: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   366: invokevirtual   com/google/Z.e:()Lcom/google/el;
        //   369: invokestatic    com/google/bB.a:(Lcom/google/cL;Lcom/google/el;)Ljava/lang/Object;
        //   372: astore          16
        //   374: aload           8
        //   376: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   379: invokevirtual   com/google/Z.b:()Z
        //   382: istore          19
        //   384: iload           19
        //   386: ifeq            405
        //   389: aload_0        
        //   390: aload           8
        //   392: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   395: aload           16
        //   397: invokevirtual   com/google/bB.c:(Lcom/google/aK;Ljava/lang/Object;)V
        //   400: iload           6
        //   402: ifeq            163
        //   405: aload_0        
        //   406: aload           8
        //   408: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   411: aload           16
        //   413: invokevirtual   com/google/bB.a:(Lcom/google/aK;Ljava/lang/Object;)V
        //   416: iload           5
        //   418: ireturn        
        //   419: astore          18
        //   421: aload           18
        //   423: athrow         
        //   424: astore          27
        //   426: aload           27
        //   428: athrow         
        //   429: astore          13
        //   431: aload           13
        //   433: athrow         
        //   434: aload           8
        //   436: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   439: invokevirtual   com/google/Z.b:()Z
        //   442: ifne            596
        //   445: aload_0        
        //   446: aload           8
        //   448: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   451: invokevirtual   com/google/bB.c:(Lcom/google/aK;)Ljava/lang/Object;
        //   454: checkcast       Lcom/google/ci;
        //   457: astore          25
        //   459: aload           25
        //   461: ifnull          596
        //   464: aload           25
        //   466: invokeinterface com/google/ci.toBuilder:()Lcom/google/aJ;
        //   471: astore          20
        //   473: aload           20
        //   475: ifnonnull       490
        //   478: aload           8
        //   480: invokestatic    com/google/ax.c:(Lcom/google/ax;)Lcom/google/ci;
        //   483: invokeinterface com/google/ci.newBuilderForType:()Lcom/google/aJ;
        //   488: astore          20
        //   490: aload           8
        //   492: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   495: invokevirtual   com/google/Z.e:()Lcom/google/el;
        //   498: astore          23
        //   500: getstatic       com/google/el.GROUP:Lcom/google/el;
        //   503: astore          24
        //   505: aload           23
        //   507: aload           24
        //   509: if_acmpne       529
        //   512: aload_2        
        //   513: aload           8
        //   515: invokevirtual   com/google/ax.a:()I
        //   518: aload           20
        //   520: aload_3        
        //   521: invokevirtual   com/google/cL.a:(ILcom/google/aJ;Lcom/google/fu;)V
        //   524: iload           6
        //   526: ifeq            536
        //   529: aload_2        
        //   530: aload           20
        //   532: aload_3        
        //   533: invokevirtual   com/google/cL.a:(Lcom/google/aJ;Lcom/google/fu;)V
        //   536: aload           20
        //   538: invokeinterface com/google/aJ.build:()Lcom/google/ci;
        //   543: astore          16
        //   545: iload           6
        //   547: ifeq            374
        //   550: aload_2        
        //   551: invokevirtual   com/google/cL.g:()I
        //   554: istore          15
        //   556: aload           8
        //   558: invokestatic    com/google/ax.a:(Lcom/google/ax;)Lcom/google/Z;
        //   561: invokevirtual   com/google/Z.a:()Lcom/google/dw;
        //   564: iload           15
        //   566: invokeinterface com/google/dw.a:(I)Lcom/google/fc;
        //   571: astore          16
        //   573: aload           16
        //   575: ifnonnull       374
        //   578: iload           5
        //   580: ireturn        
        //   581: astore          21
        //   583: aload           21
        //   585: athrow         
        //   586: astore          22
        //   588: aload           22
        //   590: athrow         
        //   591: astore          17
        //   593: aload           17
        //   595: athrow         
        //   596: aconst_null    
        //   597: astore          20
        //   599: goto            473
        //   602: iload           5
        //   604: istore          12
        //   606: goto            146
        //   609: iload           5
        //   611: istore          9
        //   613: iconst_0       
        //   614: istore          12
        //   616: goto            146
        //   619: iconst_0       
        //   620: istore          9
        //   622: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  41     55     166    171    Ljava/lang/UnsupportedOperationException;
        //  70     80     171    176    Ljava/lang/UnsupportedOperationException;
        //  88     101    176    181    Ljava/lang/UnsupportedOperationException;
        //  109    123    176    181    Ljava/lang/UnsupportedOperationException;
        //  151    159    181    186    Ljava/lang/UnsupportedOperationException;
        //  173    176    176    181    Ljava/lang/UnsupportedOperationException;
        //  201    215    424    429    Ljava/lang/UnsupportedOperationException;
        //  215    221    424    429    Ljava/lang/UnsupportedOperationException;
        //  307    313    429    434    Ljava/lang/UnsupportedOperationException;
        //  318    335    429    434    Ljava/lang/UnsupportedOperationException;
        //  374    384    591    596    Ljava/lang/UnsupportedOperationException;
        //  389    400    419    424    Ljava/lang/UnsupportedOperationException;
        //  405    416    419    424    Ljava/lang/UnsupportedOperationException;
        //  490    505    581    586    Ljava/lang/UnsupportedOperationException;
        //  512    524    586    591    Ljava/lang/UnsupportedOperationException;
        //  529    536    586    591    Ljava/lang/UnsupportedOperationException;
        //  583    586    586    591    Ljava/lang/UnsupportedOperationException;
        //  593    596    419    424    Ljava/lang/UnsupportedOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 271, Size: 271
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
    
    protected void a() {
    }
    
    protected boolean a(final cL cl, final fu fu, final int n) {
        return cl.d(n);
    }
    
    @Override
    public du getParserForType() {
        throw new UnsupportedOperationException(dD.z);
    }
    
    protected Object writeReplace() {
        return new dp(this);
    }
}
