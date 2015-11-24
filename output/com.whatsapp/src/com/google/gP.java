// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Arrays;

public abstract class gP extends gj
{
    static final int[][] b;
    static final int[] d;
    static final int[][] e;
    static final int[] h;
    private final StringBuilder c;
    private final hE f;
    private final gX g;
    
    static {
        h = new int[] { 1, 1, 1 };
        d = new int[] { 1, 1, 1, 1, 1 };
        b = new int[][] { { 3, 2, 1, 1 }, { 2, 2, 2, 1 }, { 2, 1, 2, 2 }, { 1, 4, 1, 1 }, { 1, 1, 3, 2 }, { 1, 2, 3, 1 }, { 1, 1, 1, 4 }, { 1, 3, 1, 2 }, { 1, 2, 1, 3 }, { 3, 1, 1, 2 } };
        e = new int[20][];
        System.arraycopy(gP.b, 0, gP.e, 0, 10);
        for (int i = 10; i < 20; ++i) {
            final int[] array = gP.b[i - 10];
            final int[] array2 = new int[array.length];
            for (int j = 0; j < array.length; ++j) {
                array2[j] = array[-1 + (array.length - j)];
            }
            gP.e[i] = array2;
        }
    }
    
    protected gP() {
        this.c = new StringBuilder(20);
        this.f = new hE();
        this.g = new gX();
    }
    
    static int a(final hN hn, final int[] array, final int n, final int[][] array2) {
        final boolean a = gj.a;
        gj.b(hn, n, array);
        float n2 = 0.48f;
        int n3 = -1;
        final int length = array2.length;
        int i = 0;
        while (i < length) {
            float a2 = gj.a(array, array2[i], 0.7f);
            if (a2 < n2) {
                n3 = i;
            }
            else {
                a2 = n2;
            }
            ++i;
            if (a) {
                break;
            }
            n2 = a2;
        }
        if (n3 >= 0) {
            return n3;
        }
        throw fv.a();
    }
    
    static boolean a(final CharSequence charSequence) {
        final boolean a = gj.a;
        final int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 2;
        int n = 0;
        while (i >= 0) {
            final int n2 = -48 + charSequence.charAt(i);
            if (n2 < 0 || n2 > 9) {
                throw fD.a();
            }
            n += n2;
            i -= 2;
            if (a) {
                break;
            }
        }
        final int n3 = n * 3;
        final int n4 = length - 1;
        int n5 = n3;
        int j = n4;
        while (j >= 0) {
            final int n6 = -48 + charSequence.charAt(j);
            if (n6 < 0 || n6 > 9) {
                throw fD.a();
            }
            n5 += n6;
            j -= 2;
            if (a) {
                break;
            }
        }
        return n5 % 10 == 0;
    }
    
    static int[] a(final hN hn) {
        final boolean a = gj.a;
        int[] a2 = null;
        final int[] array = new int[gP.h.length];
        int n = 0;
        boolean a3 = false;
        while (!a3) {
            Arrays.fill(array, 0, gP.h.length, 0);
            a2 = a(hn, n, false, gP.h, array);
            final int n2 = a2[0];
            n = a2[1];
            final int n3 = n2 - (n - n2);
            if (n3 >= 0) {
                a3 = hn.a(n3, n2, false);
            }
            if (a) {
                break;
            }
        }
        return a2;
    }
    
    static int[] a(final hN hn, final int n, final boolean b, final int[] array) {
        return a(hn, n, b, array, new int[array.length]);
    }
    
    private static int[] a(final hN hn, final int n, final boolean b, final int[] array, final int[] array2) {
        final boolean a = gj.a;
        final int length = array.length;
        final int b2 = hn.b();
        int n2;
        if (b) {
            n2 = hn.b(n);
        }
        else {
            n2 = hn.d(n);
        }
        int n3 = 0;
        int i = n2;
        boolean b3 = b;
        while (i < b2) {
            Label_0187: {
                if (b3 ^ hn.a(i)) {
                    ++array2[n3];
                    if (!a) {
                        break Label_0187;
                    }
                }
                Label_0173: {
                    if (n3 == length - 1) {
                        if (gj.a(array2, array, 0.7f) < 0.48f) {
                            return new int[] { n2, i };
                        }
                        n2 += array2[0] + array2[1];
                        System.arraycopy(array2, 2, array2, 0, length - 2);
                        array2[length - 1] = (array2[length - 2] = 0);
                        --n3;
                        if (!a) {
                            break Label_0173;
                        }
                    }
                    ++n3;
                }
                array2[n3] = 1;
                b3 = !b3;
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    protected abstract int a(final hN p0, final int[] p1, final StringBuilder p2);
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        return this.a(n, hn, a(hn), map);
    }
    
    public aU a(final int p0, final hN p1, final int[] p2, final Map p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/gj.a:Z
        //     3: istore          5
        //     5: aload           4
        //     7: ifnonnull       184
        //    10: aconst_null    
        //    11: astore          6
        //    13: aload           6
        //    15: ifnull          44
        //    18: aload           6
        //    20: new             Lcom/google/cs;
        //    23: dup            
        //    24: aload_3        
        //    25: iconst_0       
        //    26: iaload         
        //    27: aload_3        
        //    28: iconst_1       
        //    29: iaload         
        //    30: iadd           
        //    31: i2f            
        //    32: fconst_2       
        //    33: fdiv           
        //    34: iload_1        
        //    35: i2f            
        //    36: invokespecial   com/google/cs.<init>:(FF)V
        //    39: invokeinterface com/google/fs.a:(Lcom/google/cs;)V
        //    44: aload_0        
        //    45: getfield        com/google/gP.c:Ljava/lang/StringBuilder;
        //    48: astore          7
        //    50: aload           7
        //    52: iconst_0       
        //    53: invokevirtual   java/lang/StringBuilder.setLength:(I)V
        //    56: aload_0        
        //    57: aload_2        
        //    58: aload_3        
        //    59: aload           7
        //    61: invokevirtual   com/google/gP.a:(Lcom/google/hN;[ILjava/lang/StringBuilder;)I
        //    64: istore          8
        //    66: aload           6
        //    68: ifnull          90
        //    71: aload           6
        //    73: new             Lcom/google/cs;
        //    76: dup            
        //    77: iload           8
        //    79: i2f            
        //    80: iload_1        
        //    81: i2f            
        //    82: invokespecial   com/google/cs.<init>:(FF)V
        //    85: invokeinterface com/google/fs.a:(Lcom/google/cs;)V
        //    90: aload_0        
        //    91: aload_2        
        //    92: iload           8
        //    94: invokevirtual   com/google/gP.a:(Lcom/google/hN;I)[I
        //    97: astore          9
        //    99: aload           6
        //   101: ifnull          132
        //   104: aload           6
        //   106: new             Lcom/google/cs;
        //   109: dup            
        //   110: aload           9
        //   112: iconst_0       
        //   113: iaload         
        //   114: aload           9
        //   116: iconst_1       
        //   117: iaload         
        //   118: iadd           
        //   119: i2f            
        //   120: fconst_2       
        //   121: fdiv           
        //   122: iload_1        
        //   123: i2f            
        //   124: invokespecial   com/google/cs.<init>:(FF)V
        //   127: invokeinterface com/google/fs.a:(Lcom/google/cs;)V
        //   132: aload           9
        //   134: iconst_1       
        //   135: iaload         
        //   136: istore          10
        //   138: iload           10
        //   140: iload           10
        //   142: aload           9
        //   144: iconst_0       
        //   145: iaload         
        //   146: isub           
        //   147: iadd           
        //   148: istore          11
        //   150: iload           11
        //   152: aload_2        
        //   153: invokevirtual   com/google/hN.b:()I
        //   156: if_icmpge       175
        //   159: aload_2        
        //   160: iload           10
        //   162: iload           11
        //   164: iconst_0       
        //   165: invokevirtual   com/google/hN.a:(IIZ)Z
        //   168: istore          14
        //   170: iload           14
        //   172: ifne            222
        //   175: invokestatic    com/google/fv.a:()Lcom/google/fv;
        //   178: athrow         
        //   179: astore          13
        //   181: aload           13
        //   183: athrow         
        //   184: aload           4
        //   186: getstatic       com/google/bj.NEED_RESULT_POINT_CALLBACK:Lcom/google/bj;
        //   189: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   194: checkcast       Lcom/google/fs;
        //   197: astore          6
        //   199: goto            13
        //   202: astore          38
        //   204: aload           38
        //   206: athrow         
        //   207: astore          37
        //   209: aload           37
        //   211: athrow         
        //   212: astore          36
        //   214: aload           36
        //   216: athrow         
        //   217: astore          12
        //   219: aload           12
        //   221: athrow         
        //   222: aload           7
        //   224: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   227: astore          15
        //   229: aload           15
        //   231: invokevirtual   java/lang/String.length:()I
        //   234: bipush          8
        //   236: if_icmpge       248
        //   239: invokestatic    com/google/fD.a:()Lcom/google/fD;
        //   242: athrow         
        //   243: astore          16
        //   245: aload           16
        //   247: athrow         
        //   248: aload_0        
        //   249: aload           15
        //   251: invokevirtual   com/google/gP.a:(Ljava/lang/String;)Z
        //   254: ifne            266
        //   257: invokestatic    com/google/fh.a:()Lcom/google/fh;
        //   260: athrow         
        //   261: astore          17
        //   263: aload           17
        //   265: athrow         
        //   266: aload_3        
        //   267: iconst_1       
        //   268: iaload         
        //   269: aload_3        
        //   270: iconst_0       
        //   271: iaload         
        //   272: iadd           
        //   273: i2f            
        //   274: fconst_2       
        //   275: fdiv           
        //   276: fstore          18
        //   278: aload           9
        //   280: iconst_1       
        //   281: iaload         
        //   282: aload           9
        //   284: iconst_0       
        //   285: iaload         
        //   286: iadd           
        //   287: i2f            
        //   288: fconst_2       
        //   289: fdiv           
        //   290: fstore          19
        //   292: aload_0        
        //   293: invokevirtual   com/google/gP.a:()Lcom/google/d3;
        //   296: astore          20
        //   298: iconst_2       
        //   299: anewarray       Lcom/google/cs;
        //   302: astore          21
        //   304: aload           21
        //   306: iconst_0       
        //   307: new             Lcom/google/cs;
        //   310: dup            
        //   311: fload           18
        //   313: iload_1        
        //   314: i2f            
        //   315: invokespecial   com/google/cs.<init>:(FF)V
        //   318: aastore        
        //   319: aload           21
        //   321: iconst_1       
        //   322: new             Lcom/google/cs;
        //   325: dup            
        //   326: fload           19
        //   328: iload_1        
        //   329: i2f            
        //   330: invokespecial   com/google/cs.<init>:(FF)V
        //   333: aastore        
        //   334: new             Lcom/google/aU;
        //   337: dup            
        //   338: aload           15
        //   340: aconst_null    
        //   341: aload           21
        //   343: aload           20
        //   345: invokespecial   com/google/aU.<init>:(Ljava/lang/String;[B[Lcom/google/cs;Lcom/google/d3;)V
        //   348: astore          22
        //   350: aload_0        
        //   351: getfield        com/google/gP.f:Lcom/google/hE;
        //   354: iload_1        
        //   355: aload_2        
        //   356: aload           9
        //   358: iconst_1       
        //   359: iaload         
        //   360: invokevirtual   com/google/hE.a:(ILcom/google/hN;I)Lcom/google/aU;
        //   363: astore          34
        //   365: aload           22
        //   367: getstatic       com/google/A.UPC_EAN_EXTENSION:Lcom/google/A;
        //   370: aload           34
        //   372: invokevirtual   com/google/aU.a:()Ljava/lang/String;
        //   375: invokevirtual   com/google/aU.a:(Lcom/google/A;Ljava/lang/Object;)V
        //   378: aload           22
        //   380: aload           34
        //   382: invokevirtual   com/google/aU.d:()Ljava/util/Map;
        //   385: invokevirtual   com/google/aU.a:(Ljava/util/Map;)V
        //   388: aload           22
        //   390: aload           34
        //   392: invokevirtual   com/google/aU.c:()[Lcom/google/cs;
        //   395: invokevirtual   com/google/aU.a:([Lcom/google/cs;)V
        //   398: aload           34
        //   400: invokevirtual   com/google/aU.a:()Ljava/lang/String;
        //   403: invokevirtual   java/lang/String.length:()I
        //   406: istore          35
        //   408: iload           35
        //   410: istore          24
        //   412: aload           4
        //   414: ifnonnull       491
        //   417: aconst_null    
        //   418: astore          25
        //   420: aload           25
        //   422: ifnull          512
        //   425: aload           25
        //   427: arraylength    
        //   428: istore          30
        //   430: iconst_0       
        //   431: istore          31
        //   433: iconst_0       
        //   434: istore          32
        //   436: iload           32
        //   438: iload           30
        //   440: if_icmpge       469
        //   443: iload           24
        //   445: aload           25
        //   447: iload           32
        //   449: iaload         
        //   450: if_icmpne       461
        //   453: iconst_1       
        //   454: istore          31
        //   456: iload           5
        //   458: ifeq            469
        //   461: iinc            32, 1
        //   464: iload           5
        //   466: ifeq            436
        //   469: iload           31
        //   471: ifne            512
        //   474: invokestatic    com/google/fv.a:()Lcom/google/fv;
        //   477: athrow         
        //   478: astore          33
        //   480: aload           33
        //   482: athrow         
        //   483: astore          23
        //   485: iconst_0       
        //   486: istore          24
        //   488: goto            412
        //   491: aload           4
        //   493: getstatic       com/google/bj.ALLOWED_EAN_EXTENSIONS:Lcom/google/bj;
        //   496: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   501: checkcast       [I
        //   504: checkcast       [I
        //   507: astore          25
        //   509: goto            420
        //   512: aload           20
        //   514: getstatic       com/google/d3.EAN_13:Lcom/google/d3;
        //   517: if_acmpeq       532
        //   520: getstatic       com/google/d3.UPC_A:Lcom/google/d3;
        //   523: astore          29
        //   525: aload           20
        //   527: aload           29
        //   529: if_acmpne       558
        //   532: aload_0        
        //   533: getfield        com/google/gP.g:Lcom/google/gX;
        //   536: aload           15
        //   538: invokevirtual   com/google/gX.a:(Ljava/lang/String;)Ljava/lang/String;
        //   541: astore          27
        //   543: aload           27
        //   545: ifnull          558
        //   548: aload           22
        //   550: getstatic       com/google/A.POSSIBLE_COUNTRY:Lcom/google/A;
        //   553: aload           27
        //   555: invokevirtual   com/google/aU.a:(Lcom/google/A;Ljava/lang/Object;)V
        //   558: aload           22
        //   560: areturn        
        //   561: astore          26
        //   563: aload           26
        //   565: athrow         
        //   566: astore          28
        //   568: aload           28
        //   570: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  18     44     202    207    Lcom/google/fN;
        //  71     90     207    212    Lcom/google/fN;
        //  104    132    212    217    Lcom/google/fN;
        //  150    170    217    222    Lcom/google/fN;
        //  175    179    179    184    Lcom/google/fN;
        //  219    222    179    184    Lcom/google/fN;
        //  229    243    243    248    Lcom/google/fN;
        //  248    261    261    266    Lcom/google/fN;
        //  350    408    483    491    Lcom/google/fN;
        //  474    478    478    483    Lcom/google/fN;
        //  512    525    561    566    Lcom/google/fN;
        //  548    558    566    571    Lcom/google/fN;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 295, Size: 295
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
    
    abstract d3 a();
    
    boolean a(final String s) {
        return a((CharSequence)s);
    }
    
    int[] a(final hN hn, final int n) {
        return a(hn, n, false, gP.h);
    }
}
