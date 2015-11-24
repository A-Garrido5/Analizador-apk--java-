// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class gY extends gk
{
    private static final int[] h;
    private static final int[][] i;
    private static final int[][] j;
    private static final int[] k;
    private static final int[] n;
    private static final int[][] o;
    public static int q;
    private final List l;
    private final int[] m;
    private boolean p;
    private final List r;
    
    static {
        n = new int[] { 7, 5, 4, 3, 1 };
        k = new int[] { 4, 20, 52, 104, 204 };
        h = new int[] { 0, 348, 1388, 2948, 3988 };
        j = new int[][] { { 1, 8, 4, 1 }, { 3, 6, 4, 1 }, { 3, 4, 6, 1 }, { 3, 2, 8, 1 }, { 2, 6, 5, 1 }, { 2, 2, 9, 1 } };
        o = new int[][] { { 1, 3, 9, 27, 81, 32, 96, 77 }, { 20, 60, 180, 118, 143, 7, 21, 63 }, { 189, 145, 13, 39, 117, 140, 209, 205 }, { 193, 157, 49, 147, 19, 57, 171, 91 }, { 62, 186, 136, 197, 169, 85, 44, 132 }, { 185, 133, 188, 142, 4, 12, 36, 108 }, { 113, 128, 173, 97, 80, 29, 87, 50 }, { 150, 28, 84, 41, 123, 158, 52, 156 }, { 46, 138, 203, 187, 139, 206, 196, 166 }, { 76, 17, 51, 153, 37, 111, 122, 155 }, { 43, 129, 176, 106, 107, 110, 119, 146 }, { 16, 48, 144, 10, 30, 90, 59, 177 }, { 109, 116, 137, 200, 178, 112, 125, 164 }, { 70, 210, 208, 202, 184, 130, 179, 115 }, { 134, 191, 151, 31, 93, 68, 204, 190 }, { 148, 22, 66, 198, 172, 94, 71, 2 }, { 6, 18, 54, 162, 64, 192, 154, 40 }, { 120, 149, 25, 75, 14, 42, 126, 167 }, { 79, 26, 78, 23, 69, 207, 199, 175 }, { 103, 98, 83, 38, 114, 131, 182, 124 }, { 161, 61, 183, 127, 170, 88, 53, 159 }, { 55, 165, 73, 8, 24, 72, 5, 15 }, { 45, 135, 194, 160, 58, 174, 100, 89 } };
        i = new int[][] { { 0, 0 }, { 0, 1, 1 }, { 0, 2, 1, 3 }, { 0, 4, 1, 3, 2 }, { 0, 4, 1, 3, 3, 5 }, { 0, 4, 1, 3, 4, 5, 5 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { 0, 0, 1, 1, 2, 2, 3, 4, 4 }, { 0, 0, 1, 1, 2, 2, 3, 4, 5, 5 }, { 0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5 } };
    }
    
    public gY() {
        this.r = new ArrayList(11);
        this.l = new ArrayList();
        this.m = new int[2];
        this.p = false;
    }
    
    private static int a(final hN hn, final int n) {
        if (hn.a(n)) {
            final int n2 = hn.d(hn.b(n));
            if (gY.q == 0) {
                return n2;
            }
        }
        return hn.b(hn.d(n));
    }
    
    static aU a(final List list) {
        final int q = gY.q;
        final String c = ay.a(bc.a(list)).c();
        final cs[] a = list.get(0).c().a();
        final cs[] a2 = list.get(-1 + list.size()).c().a();
        final aU au = new aU(c, null, new cs[] { a[0], a[1], a2[0], a2[1] }, d3.RSS_EXPANDED);
        if (fN.a != 0) {
            gY.q = q + 1;
        }
        return au;
    }
    
    private bk a(final hN hn, final int n, final boolean b) {
        final int q = gY.q;
        int n3 = 0;
        int b2 = 0;
        int[] f = null;
        Label_0075: {
            if (!b) {
                break Label_0075;
            }
            int n2 = -1 + this.m[0];
            while (true) {
                Label_0045: {
                    if (n2 < 0) {
                        break Label_0045;
                    }
                    try {
                        if (!hn.a(n2)) {
                            --n2;
                            if (q == 0) {
                                continue;
                            }
                        }
                        n3 = n2 + 1;
                        int n4 = this.m[0] - n3;
                        b2 = this.m[1];
                        if (q != 0) {
                            n3 = this.m[0];
                            b2 = hn.b(1 + this.m[1]);
                            n4 = b2 - this.m[1];
                        }
                        f = this.f();
                        System.arraycopy(f, 0, f, 1, -1 + f.length);
                        f[0] = n4;
                        final int[] array = f;
                        final int[][] array2 = gY.j;
                        final int a = gk.a(array, array2);
                        final int a2 = a;
                        final int n5 = 2;
                        final int[] array3 = new int[n5];
                        final int n6 = 0;
                        final int n7 = n3;
                        array3[n6] = n7;
                        final int n8 = 1;
                        final int n9 = b2;
                        array3[n8] = n9;
                        final int n10 = n3;
                        final int n11 = b2;
                        final int n12 = n;
                        return new bk(a2, array3, n10, n11, n12);
                    }
                    catch (fv fv) {
                        throw fv;
                    }
                }
                break;
            }
        }
        try {
            final int[] array = f;
            final int[][] array2 = gY.j;
            final int a2;
            final int a = a2 = gk.a(array, array2);
            final int n5 = 2;
            final int[] array3 = new int[n5];
            final int n6 = 0;
            final int n7 = n3;
            array3[n6] = n7;
            final int n8 = 1;
            final int n9 = b2;
            array3[n8] = n9;
            final int n10 = n3;
            final int n11 = b2;
            final int n12 = n;
            return new bk(a2, array3, n10, n11, n12);
        }
        catch (fv fv2) {
            return null;
        }
    }
    
    private List a(final List p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/gY.q:I
        //     3: istore_3       
        //     4: iload_2        
        //     5: aload_0        
        //     6: getfield        com/google/gY.l:Ljava/util/List;
        //     9: invokeinterface java/util/List.size:()I
        //    14: if_icmpge       216
        //    17: aload_0        
        //    18: getfield        com/google/gY.l:Ljava/util/List;
        //    21: iload_2        
        //    22: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    27: checkcast       Lcom/google/K;
        //    30: astore          4
        //    32: aload_0        
        //    33: getfield        com/google/gY.r:Ljava/util/List;
        //    36: invokeinterface java/util/List.clear:()V
        //    41: aload_1        
        //    42: invokeinterface java/util/List.size:()I
        //    47: istore          5
        //    49: iconst_0       
        //    50: istore          6
        //    52: iload           6
        //    54: iload           5
        //    56: if_icmpge       93
        //    59: aload_0        
        //    60: getfield        com/google/gY.r:Ljava/util/List;
        //    63: aload_1        
        //    64: iload           6
        //    66: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    71: checkcast       Lcom/google/K;
        //    74: invokevirtual   com/google/K.b:()Ljava/util/List;
        //    77: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    82: pop            
        //    83: iload           6
        //    85: iconst_1       
        //    86: iadd           
        //    87: istore          21
        //    89: iload_3        
        //    90: ifeq            220
        //    93: aload_0        
        //    94: getfield        com/google/gY.r:Ljava/util/List;
        //    97: aload           4
        //    99: invokevirtual   com/google/K.b:()Ljava/util/List;
        //   102: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   107: pop            
        //   108: aload_0        
        //   109: getfield        com/google/gY.r:Ljava/util/List;
        //   112: invokestatic    com/google/gY.b:(Ljava/util/List;)Z
        //   115: istore          11
        //   117: iload           11
        //   119: ifne            126
        //   122: iload_3        
        //   123: ifeq            209
        //   126: aload_0        
        //   127: invokespecial   com/google/gY.a:()Z
        //   130: istore          12
        //   132: iload           12
        //   134: ifeq            161
        //   137: aload_0        
        //   138: getfield        com/google/gY.r:Ljava/util/List;
        //   141: astore          19
        //   143: aload           19
        //   145: areturn        
        //   146: astore          7
        //   148: aload           7
        //   150: athrow         
        //   151: astore          8
        //   153: aload           8
        //   155: athrow         
        //   156: astore          9
        //   158: aload           9
        //   160: athrow         
        //   161: new             Ljava/util/ArrayList;
        //   164: dup            
        //   165: invokespecial   java/util/ArrayList.<init>:()V
        //   168: astore          13
        //   170: aload           13
        //   172: aload_1        
        //   173: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   178: pop            
        //   179: aload           13
        //   181: aload           4
        //   183: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   188: pop            
        //   189: iload_2        
        //   190: iconst_1       
        //   191: iadd           
        //   192: istore          16
        //   194: aload_0        
        //   195: aload           13
        //   197: iload           16
        //   199: invokespecial   com/google/gY.a:(Ljava/util/List;I)Ljava/util/List;
        //   202: astore          18
        //   204: aload           18
        //   206: areturn        
        //   207: astore          17
        //   209: iinc            2, 1
        //   212: iload_3        
        //   213: ifeq            4
        //   216: invokestatic    com/google/fv.a:()Lcom/google/fv;
        //   219: athrow         
        //   220: iload           21
        //   222: istore          6
        //   224: goto            52
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  93     117    146    151    Lcom/google/fv;
        //  126    132    151    156    Lcom/google/fv;
        //  137    143    156    161    Lcom/google/fv;
        //  148    151    151    156    Lcom/google/fv;
        //  153    156    156    161    Lcom/google/fv;
        //  194    204    207    209    Lcom/google/fv;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 104, Size: 104
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
    
    private List a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aload_0        
        //     3: getfield        com/google/gY.l:Ljava/util/List;
        //     6: invokeinterface java/util/List.size:()I
        //    11: bipush          25
        //    13: if_icmple       30
        //    16: aload_0        
        //    17: getfield        com/google/gY.l:Ljava/util/List;
        //    20: invokeinterface java/util/List.clear:()V
        //    25: aload_2        
        //    26: areturn        
        //    27: astore_3       
        //    28: aload_3        
        //    29: athrow         
        //    30: aload_0        
        //    31: getfield        com/google/gY.r:Ljava/util/List;
        //    34: invokeinterface java/util/List.clear:()V
        //    39: iload_1        
        //    40: ifeq            50
        //    43: aload_0        
        //    44: getfield        com/google/gY.l:Ljava/util/List;
        //    47: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //    50: aload_0        
        //    51: new             Ljava/util/ArrayList;
        //    54: dup            
        //    55: invokespecial   java/util/ArrayList.<init>:()V
        //    58: iconst_0       
        //    59: invokespecial   com/google/gY.a:(Ljava/util/List;I)Ljava/util/List;
        //    62: astore          7
        //    64: aload           7
        //    66: astore_2       
        //    67: iload_1        
        //    68: ifeq            25
        //    71: aload_0        
        //    72: getfield        com/google/gY.l:Ljava/util/List;
        //    75: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //    78: aload_2        
        //    79: areturn        
        //    80: astore          6
        //    82: aload           6
        //    84: athrow         
        //    85: astore          4
        //    87: aload           4
        //    89: athrow         
        //    90: astore          5
        //    92: aconst_null    
        //    93: astore_2       
        //    94: goto            67
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  2      25     27     30     Lcom/google/fv;
        //  30     39     85     90     Lcom/google/fv;
        //  43     50     85     90     Lcom/google/fv;
        //  50     64     90     97     Lcom/google/fv;
        //  71     78     80     85     Lcom/google/fv;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    private void a(final int n) {
        int n2 = 1;
        final int q = gY.q;
        final int a = gk.a(this.c());
        final int a2 = gk.a(this.b());
        final int n3 = a + a2 - n;
        int n4;
        if ((a & 0x1) == n2) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        int n5;
        if ((a2 & 0x1) == 0x0) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        int n6 = 0;
        int n7 = 0;
        Label_0077: {
            if (a > 13) {
                if (q == 0) {
                    n6 = n2;
                    n7 = 0;
                    break Label_0077;
                }
                n6 = n2;
            }
            else {
                n6 = 0;
            }
            if (a < 4) {
                n7 = n2;
            }
            else {
                n7 = 0;
            }
        }
        int n8 = 0;
        int n9 = 0;
        Label_0103: {
            if (a2 > 13) {
                if (q == 0) {
                    n8 = n2;
                    n9 = 0;
                    break Label_0103;
                }
                n8 = n2;
            }
            else {
                n8 = 0;
            }
            n9 = 0;
            if (a2 < 4) {
                n9 = n2;
            }
        }
        int n10 = 0;
        int n12 = 0;
        Label_0276: {
            if (n3 == n2) {
                int n13;
                if (n4 != 0) {
                    if (n5 != 0) {
                        throw fv.a();
                    }
                    if (q == 0) {
                        n10 = n7;
                        final int n11 = n2;
                        n2 = n9;
                        n12 = n11;
                        break Label_0276;
                    }
                    n13 = n2;
                }
                else {
                    n13 = n6;
                }
                if (n5 == 0) {
                    throw fv.a();
                }
                if (q == 0) {
                    n10 = n7;
                    final int n14 = n9;
                    n12 = n13;
                    n8 = n2;
                    n2 = n14;
                    break Label_0276;
                }
                n6 = n13;
                n8 = n2;
            }
            if (n3 == -1) {
                int n16;
                if (n4 != 0) {
                    if (n5 != 0) {
                        throw fv.a();
                    }
                    if (q == 0) {
                        final int n15 = n9;
                        n12 = n6;
                        n10 = n2;
                        n2 = n15;
                        break Label_0276;
                    }
                    n16 = n2;
                }
                else {
                    n16 = n7;
                }
                if (n5 == 0) {
                    throw fv.a();
                }
                if (q == 0) {
                    final int n17 = n6;
                    n10 = n16;
                    n12 = n17;
                    break Label_0276;
                }
                n7 = n16;
                n9 = n2;
            }
            if (n3 != 0) {
                throw fv.a();
            }
            if (n4 != 0) {
                if (n5 == 0) {
                    throw fv.a();
                }
                int n19;
                if (a < a2) {
                    if (q == 0) {
                        n8 = n2;
                        final int n18 = n9;
                        n12 = n6;
                        n10 = n2;
                        n2 = n18;
                        break Label_0276;
                    }
                    n8 = n2;
                    n19 = n2;
                }
                else {
                    n19 = n7;
                }
                if (q == 0) {
                    n10 = n19;
                    n12 = n2;
                    break Label_0276;
                }
                n10 = n19;
                n12 = n2;
            }
            else {
                n2 = n9;
                n12 = n6;
                n10 = n7;
            }
            if (n5 != 0) {
                throw fv.a();
            }
        }
        if (n10 != 0) {
            if (n12 != 0) {
                throw fv.a();
            }
            gk.b(this.c(), this.d());
        }
        if (n12 != 0) {
            gk.a(this.c(), this.d());
        }
        if (n2 != 0) {
            if (n8 != 0) {
                throw fv.a();
            }
            gk.b(this.b(), this.d());
        }
        if (n8 != 0) {
            gk.a(this.b(), this.a());
        }
    }
    
    private void a(final int n, final boolean b) {
        final int q = gY.q;
        boolean a = false;
        int n2 = 0;
        int i;
        boolean a2;
        int n3;
        for (i = 0; i < this.l.size(); i = n3, n2 = (a2 ? 1 : 0)) {
            final K k = this.l.get(i);
            if (k.a() > n) {
                a = k.a(this.r);
                if (q == 0) {
                    break;
                }
            }
            a2 = k.a(this.r);
            n3 = i + 1;
            if (q != 0) {
                i = n3;
                n2 = (a2 ? 1 : 0);
                break;
            }
        }
        if (!a && n2 == 0 && !a(this.r, (Iterable)this.l)) {
            this.l.add(i, new K(this.r, n, b));
            a(this.r, this.l);
        }
    }
    
    private static void a(final List list, final List list2) {
        final int q = gY.q;
        final Iterator<K> iterator = list2.iterator();
    Label_0172:
        while (iterator.hasNext()) {
            final K k = iterator.next();
            if (k.b().size() != list.size() || q != 0) {
                final Iterator iterator2 = k.b().iterator();
                int n = 1;
            Label_0157:
                while (true) {
                Label_0141_Outer:
                    while (iterator2.hasNext()) {
                        final br br = iterator2.next();
                        final Iterator<br> iterator3 = list.iterator();
                        int n2 = 0;
                        int n4 = 0;
                    Label_0141:
                        while (true) {
                            while (iterator3.hasNext()) {
                                int n3;
                                if (br.equals(iterator3.next())) {
                                    if (q == 0) {
                                        n3 = 1;
                                        break Label_0141;
                                    }
                                    n3 = 1;
                                }
                                else {
                                    n3 = n2;
                                }
                                if (q == 0) {
                                    n2 = n3;
                                    continue Label_0141_Outer;
                                }
                                if (n3 == 0) {
                                    if (q == 0) {
                                        n4 = 0;
                                        break Label_0157;
                                    }
                                    n4 = 0;
                                }
                                else {
                                    n4 = n;
                                }
                                if (q != 0) {
                                    break Label_0157;
                                }
                                n = n4;
                                continue Label_0157;
                            }
                            int n3 = n2;
                            continue Label_0141;
                        }
                        if (n4 != 0) {
                            iterator.remove();
                        }
                        if (q != 0) {
                            break Label_0172;
                        }
                        continue Label_0172;
                    }
                    int n4 = n;
                    continue Label_0157;
                }
            }
        }
    }
    
    private static void a(final int[] array) {
        final int q = gY.q;
        final int length = array.length;
        int i = 0;
        while (i < length / 2) {
            final int n = array[i];
            array[i] = array[-1 + (length - i)];
            array[-1 + (length - i)] = n;
            ++i;
            if (q != 0) {
                break;
            }
        }
    }
    
    private boolean a() {
        int n = 1;
        final int q = gY.q;
        final br br = this.r.get(0);
        final e0 d = br.d();
        final e0 a = br.a();
        if (a == null) {
            return false;
        }
        final int b = a.b();
        int n2 = 2;
        int n3 = b;
        int n4;
        for (int i = n; i < this.r.size(); i = n4) {
            final br br2 = this.r.get(i);
            n3 += br2.d().b();
            ++n2;
            final e0 a2 = br2.a();
            if (a2 != null) {
                n3 += a2.b();
                ++n2;
            }
            n4 = i + 1;
            if (q != 0) {
                break;
            }
        }
        if (n3 % 211 + 211 * (n2 - 4) != d.a()) {
            n = 0;
        }
        return n != 0;
    }
    
    private static boolean a(final bk bk, final boolean b, final boolean b2) {
        return bk.b() != 0 || !b || !b2;
    }
    
    private static boolean a(final Iterable iterable, final Iterable iterable2) {
        final int q = gY.q;
    Label_0145:
        for (final K k : iterable2) {
            final Iterator<br> iterator2 = iterable.iterator();
            int n = 1;
        Label_0134:
            while (true) {
            Label_0118_Outer:
                while (iterator2.hasNext()) {
                    final br br = iterator2.next();
                    final Iterator iterator3 = k.b().iterator();
                    int n2 = 0;
                    int n4 = 0;
                Label_0118:
                    while (true) {
                        while (iterator3.hasNext()) {
                            int n3;
                            if (br.equals(iterator3.next())) {
                                if (q == 0) {
                                    n3 = 1;
                                    break Label_0118;
                                }
                                n3 = 1;
                            }
                            else {
                                n3 = n2;
                            }
                            if (q == 0) {
                                n2 = n3;
                                continue Label_0118_Outer;
                            }
                            if (n3 == 0) {
                                if (q == 0) {
                                    n4 = 0;
                                    break Label_0134;
                                }
                                n4 = 0;
                            }
                            else {
                                n4 = n;
                            }
                            if (q != 0) {
                                break Label_0134;
                            }
                            n = n4;
                            continue Label_0134;
                        }
                        int n3 = n2;
                        continue Label_0118;
                    }
                    if (n4 != 0) {
                        return true;
                    }
                    if (q != 0) {
                        break Label_0145;
                    }
                    continue Label_0145;
                }
                int n4 = n;
                continue Label_0134;
            }
        }
        return false;
    }
    
    private void b(final hN hn, final List list, int n) {
        final int q = gY.q;
        final int[] f = this.f();
        f[1] = (f[0] = 0);
        f[3] = (f[2] = 0);
        final int b = hn.b();
        Label_0088: {
            if (n < 0 || q != 0) {
                if (list.isEmpty()) {
                    n = 0;
                    if (q == 0) {
                        break Label_0088;
                    }
                }
                n = list.get(-1 + list.size()).c().c()[1];
            }
        }
        int n2;
        if (list.size() % 2 != 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.p) {
            if (n2 == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
        }
        boolean b2 = false;
        int i = n;
        while (i < b) {
            b2 = !hn.a(i);
            if (!b2 && q == 0) {
                break;
            }
            ++i;
            if (q != 0) {
                break;
            }
        }
        int j = i;
        final int n3 = i;
        int n4 = 0;
        boolean b3 = b2;
        int n5 = n3;
        while (j < b) {
            Label_0349: {
                if (b3 ^ hn.a(j)) {
                    ++f[n4];
                    if (q == 0) {
                        break Label_0349;
                    }
                }
                Label_0335: {
                    if (n4 == 3) {
                        if (n2 != 0) {
                            a(f);
                        }
                        if (gk.b(f)) {
                            this.m[0] = n5;
                            this.m[1] = j;
                            return;
                        }
                        if (n2 != 0) {
                            a(f);
                        }
                        n5 += f[0] + f[1];
                        f[0] = f[2];
                        f[1] = f[3];
                        f[3] = (f[2] = 0);
                        --n4;
                        if (q == 0) {
                            break Label_0335;
                        }
                    }
                    ++n4;
                }
                f[n4] = 1;
                b3 = !b3;
            }
            ++j;
            if (q != 0) {
                break;
            }
        }
        throw fv.a();
    }
    
    private static boolean b(final List list) {
        final int q = gY.q;
        final int[][] i = gY.i;
        int n3;
        for (int length = i.length, j = 0; j < length; j = n3) {
            final int[] array = i[j];
            if (list.size() <= array.length || q != 0) {
                int k = 0;
                int n = 1;
                while (k < list.size()) {
                    if (list.get(k).c().b() != array[k]) {
                        if (q == 0) {
                            n = 0;
                            break;
                        }
                        n = 0;
                    }
                    final int n2 = k + 1;
                    if (q != 0) {
                        break;
                    }
                    k = n2;
                }
                if (n != 0) {
                    return true;
                }
            }
            n3 = j + 1;
            if (q != 0) {
                break;
            }
        }
        return false;
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        this.r.clear();
        this.p = false;
        try {
            return a(this.a(n, hn));
        }
        catch (fv fv) {
            this.r.clear();
            this.p = true;
            return a(this.a(n, hn));
        }
    }
    
    br a(final hN p0, final List p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_2        
        //     6: invokeinterface java/util/List.size:()I
        //    11: iconst_2       
        //    12: irem           
        //    13: istore          6
        //    15: iload           6
        //    17: ifne            162
        //    20: iconst_1       
        //    21: istore          7
        //    23: aload_0        
        //    24: getfield        com/google/gY.p:Z
        //    27: istore          10
        //    29: iload           10
        //    31: ifeq            228
        //    34: iload           7
        //    36: ifne            178
        //    39: iconst_1       
        //    40: istore          22
        //    42: iload           22
        //    44: istore          11
        //    46: iconst_m1      
        //    47: istore          12
        //    49: iconst_1       
        //    50: istore          13
        //    52: aload_0        
        //    53: aload_1        
        //    54: aload_2        
        //    55: iload           12
        //    57: invokespecial   com/google/gY.b:(Lcom/google/hN;Ljava/util/List;I)V
        //    60: aload_0        
        //    61: aload_1        
        //    62: iload_3        
        //    63: iload           11
        //    65: invokespecial   com/google/gY.a:(Lcom/google/hN;IZ)Lcom/google/bk;
        //    68: astore          14
        //    70: aload           14
        //    72: ifnonnull       92
        //    75: aload_1        
        //    76: aload_0        
        //    77: getfield        com/google/gY.m:[I
        //    80: iconst_0       
        //    81: iaload         
        //    82: invokestatic    com/google/gY.a:(Lcom/google/hN;I)I
        //    85: istore          12
        //    87: iload           4
        //    89: ifeq            95
        //    92: iconst_0       
        //    93: istore          13
        //    95: iload           13
        //    97: ifne            52
        //   100: aload_0        
        //   101: aload_1        
        //   102: aload           14
        //   104: iload           11
        //   106: iconst_1       
        //   107: invokevirtual   com/google/gY.a:(Lcom/google/hN;Lcom/google/bk;ZZ)Lcom/google/e0;
        //   110: astore          15
        //   112: aload_2        
        //   113: invokeinterface java/util/List.isEmpty:()Z
        //   118: ifne            189
        //   121: aload_2        
        //   122: iconst_m1      
        //   123: aload_2        
        //   124: invokeinterface java/util/List.size:()I
        //   129: iadd           
        //   130: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   135: checkcast       Lcom/google/br;
        //   138: invokevirtual   com/google/br.b:()Z
        //   141: istore          21
        //   143: iload           21
        //   145: ifeq            189
        //   148: invokestatic    com/google/fv.a:()Lcom/google/fv;
        //   151: athrow         
        //   152: astore          17
        //   154: aload           17
        //   156: athrow         
        //   157: astore          5
        //   159: aload           5
        //   161: athrow         
        //   162: iconst_0       
        //   163: istore          7
        //   165: goto            23
        //   168: astore          8
        //   170: aload           8
        //   172: athrow         
        //   173: astore          9
        //   175: aload           9
        //   177: athrow         
        //   178: iconst_0       
        //   179: istore          22
        //   181: goto            42
        //   184: astore          16
        //   186: aload           16
        //   188: athrow         
        //   189: aload_0        
        //   190: aload_1        
        //   191: aload           14
        //   193: iload           11
        //   195: iconst_0       
        //   196: invokevirtual   com/google/gY.a:(Lcom/google/hN;Lcom/google/bk;ZZ)Lcom/google/e0;
        //   199: astore          20
        //   201: aload           20
        //   203: astore          19
        //   205: new             Lcom/google/br;
        //   208: dup            
        //   209: aload           15
        //   211: aload           19
        //   213: aload           14
        //   215: iconst_1       
        //   216: invokespecial   com/google/br.<init>:(Lcom/google/e0;Lcom/google/e0;Lcom/google/bk;Z)V
        //   219: areturn        
        //   220: astore          18
        //   222: aconst_null    
        //   223: astore          19
        //   225: goto            205
        //   228: iload           7
        //   230: istore          11
        //   232: goto            46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  5      15     157    162    Lcom/google/fv;
        //  23     29     168    178    Lcom/google/fv;
        //  112    143    184    189    Lcom/google/fv;
        //  148    152    152    157    Lcom/google/fv;
        //  170    173    173    178    Lcom/google/fv;
        //  186    189    152    157    Lcom/google/fv;
        //  189    201    220    228    Lcom/google/fv;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 120, Size: 120
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
    
    e0 a(final hN hn, final bk bk, final boolean b, final boolean b2) {
        final int q = gY.q;
        final int[] e = this.e();
        e[1] = (e[0] = 0);
        e[3] = (e[2] = 0);
        e[5] = (e[4] = 0);
        e[7] = (e[6] = 0);
        Label_0147: {
            if (b2) {
                gj.a(hn, bk.c()[0], e);
                if (q == 0) {
                    break Label_0147;
                }
                ++fN.a;
            }
            gj.b(hn, bk.c()[1], e);
            int i = 0;
            int n = -1 + e.length;
            while (i < n) {
                final int n2 = e[i];
                e[i] = e[n];
                e[n] = n2;
                ++i;
                --n;
                if (q != 0) {
                    break;
                }
            }
        }
        final float n3 = gk.a(e) / 17;
        final float n4 = (bk.c()[1] - bk.c()[0]) / 15.0f;
        if (Math.abs(n3 - n4) / n4 > 0.3f) {
            throw fv.a();
        }
        final int[] c = this.c();
        final int[] b3 = this.b();
        final float[] d = this.d();
        final float[] a = this.a();
        int j = 0;
        while (j < e.length) {
            final float n5 = 1.0f * e[j] / n3;
            int n6 = (int)(0.5f + n5);
            Label_0309: {
                if (n6 < 1) {
                    if (n5 < 0.3f) {
                        throw fv.a();
                    }
                    n6 = 1;
                    if (q == 0) {
                        break Label_0309;
                    }
                }
                if (n6 > 8) {
                    if (n5 > 8.7f) {
                        throw fv.a();
                    }
                    n6 = 8;
                }
            }
            final int n7 = j / 2;
            Label_0363: {
                if ((j & 0x1) == 0x0) {
                    c[n7] = n6;
                    d[n7] = n5 - n6;
                    if (q == 0) {
                        break Label_0363;
                    }
                }
                b3[n7] = n6;
                a[n7] = n5 - n6;
            }
            ++j;
            if (q != 0) {
                break;
            }
        }
        this.a(17);
        final int n8 = 4 * bk.b();
        int n9;
        if (b) {
            n9 = 0;
        }
        else {
            n9 = 2;
        }
        final int n10 = n8 + n9;
        int n11;
        if (b2) {
            n11 = 0;
        }
        else {
            n11 = 1;
        }
        final int n12 = -1 + (n11 + n10);
        final int n13 = -1 + c.length;
        int n14 = 0;
        int n15 = 0;
        int k = n13;
        while (k >= 0) {
            if (a(bk, b, b2)) {
                n14 += gY.o[n12][k * 2] * c[k];
            }
            n15 += c[k];
            --k;
            if (q != 0) {
                break;
            }
        }
        final int n16 = -1 + b3.length;
        int n17 = 0;
        int l = n16;
        while (l >= 0) {
            if (a(bk, b, b2)) {
                n17 += gY.o[n12][1 + l * 2] * b3[l];
            }
            --l;
            if (q != 0) {
                break;
            }
        }
        final int n18 = n14 + n17;
        if ((n15 & 0x1) != 0x0 || n15 > 13 || n15 < 4) {
            throw fv.a();
        }
        final int n19 = (13 - n15) / 2;
        final int n20 = gY.n[n19];
        return new e0(gY.h[n19] + (bm.a(b3, 9 - n20, false) + bm.a(c, n20, true) * gY.k[n19]), n18);
    }
    
    List a(final int n, final hN hn) {
        try {
            while (true) {
                this.r.add(this.a(hn, this.r, n));
            }
        }
        catch (fv fv) {
            try {
                if (this.r.isEmpty()) {
                    throw fv;
                }
            }
            catch (fv fv2) {
                throw fv2;
            }
            while (true) {
                try {
                    if (this.a()) {
                        return this.r;
                    }
                }
                catch (fv fv3) {
                    throw fv3;
                }
                while (true) {
                    while (true) {
                        try {
                            if (!this.l.isEmpty()) {
                                final int n2 = 1;
                                this.a(n, false);
                                if (n2 != 0) {
                                    List list = this.a(false);
                                    if (list != null) {
                                        return list;
                                    }
                                    list = this.a(true);
                                    if (list != null) {
                                        return list;
                                    }
                                }
                                throw fv.a();
                            }
                        }
                        catch (fv fv4) {
                            throw fv4;
                        }
                        final int n2 = 0;
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public void a() {
        this.r.clear();
        this.l.clear();
    }
}
