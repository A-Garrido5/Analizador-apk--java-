// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;
import java.util.Map;

public abstract class gj implements hV
{
    public static boolean a;
    
    protected static float a(final int[] array, final int[] array2, final float n) {
        final boolean a = gj.a;
        final int length = array.length;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < length) {
            n3 += array[i];
            n2 += array2[i];
            ++i;
            if (a) {
                break;
            }
        }
        final int n4 = n3;
        if (n4 < n2) {
            return Float.POSITIVE_INFINITY;
        }
        final float n5 = n4 / n2;
        final float n6 = n * n5;
        int j = 0;
        float n7 = 0.0f;
        while (j < length) {
            final int n8 = array[j];
            final float n9 = n5 * array2[j];
            float n10;
            if (n8 > n9) {
                n10 = n8 - n9;
            }
            else {
                n10 = n9 - n8;
            }
            if (n10 > n6) {
                return Float.POSITIVE_INFINITY;
            }
            n7 += n10;
            final int n11 = j + 1;
            if (a) {
                break;
            }
            j = n11;
        }
        return n7 / n4;
    }
    
    protected static void a(final hN hn, final int n, final int[] array) {
        final boolean a = gj.a;
        int length = array.length;
        boolean a2 = hn.a(n);
        int n2 = n;
        while (n2 > 0 && length >= 0) {
            --n2;
            if (hn.a(n2) != a2) {
                --length;
                a2 = !a2;
                if (a) {
                    break;
                }
                continue;
            }
        }
        if (length >= 0) {
            throw fv.a();
        }
        b(hn, n2 + 1, array);
    }
    
    private aU b(final c1 p0, final Map p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/gj.a:Z
        //     3: istore_3       
        //     4: aload_1        
        //     5: invokevirtual   com/google/c1.e:()I
        //     8: istore          4
        //    10: aload_1        
        //    11: invokevirtual   com/google/c1.d:()I
        //    14: istore          5
        //    16: new             Lcom/google/hN;
        //    19: dup            
        //    20: iload           4
        //    22: invokespecial   com/google/hN.<init>:(I)V
        //    25: astore          6
        //    27: iload           5
        //    29: iconst_1       
        //    30: ishr           
        //    31: istore          7
        //    33: aload_2        
        //    34: ifnull          365
        //    37: getstatic       com/google/bj.TRY_HARDER:Lcom/google/bj;
        //    40: astore          35
        //    42: aload_2        
        //    43: aload           35
        //    45: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    50: istore          36
        //    52: iload           36
        //    54: ifeq            365
        //    57: iconst_1       
        //    58: istore          8
        //    60: iload           8
        //    62: ifeq            371
        //    65: bipush          8
        //    67: istore          9
        //    69: iconst_1       
        //    70: iload           5
        //    72: iload           9
        //    74: ishr           
        //    75: invokestatic    java/lang/Math.max:(II)I
        //    78: istore          10
        //    80: iload           8
        //    82: ifeq            89
        //    85: iload_3        
        //    86: ifeq            463
        //    89: bipush          15
        //    91: istore          11
        //    93: iconst_0       
        //    94: istore          12
        //    96: iload           12
        //    98: iload           11
        //   100: if_icmpge       445
        //   103: iload           12
        //   105: iconst_1       
        //   106: iadd           
        //   107: iconst_2       
        //   108: idiv           
        //   109: istore          13
        //   111: iload           12
        //   113: iconst_1       
        //   114: iand           
        //   115: ifne            377
        //   118: iconst_1       
        //   119: istore          14
        //   121: iload           14
        //   123: ifeq            383
        //   126: iload           13
        //   128: istore          15
        //   130: iload           7
        //   132: iload           15
        //   134: iload           10
        //   136: imul           
        //   137: iadd           
        //   138: istore          16
        //   140: iload           16
        //   142: iflt            445
        //   145: iload           16
        //   147: iload           5
        //   149: if_icmplt       156
        //   152: iload_3        
        //   153: ifeq            445
        //   156: aload_1        
        //   157: iload           16
        //   159: aload           6
        //   161: invokevirtual   com/google/c1.a:(ILcom/google/hN;)Lcom/google/hN;
        //   164: astore          32
        //   166: aload           32
        //   168: astore          19
        //   170: iconst_0       
        //   171: istore          20
        //   173: iload           20
        //   175: iconst_2       
        //   176: if_icmpge       431
        //   179: iload           20
        //   181: iconst_1       
        //   182: if_icmpne       247
        //   185: aload           19
        //   187: invokevirtual   com/google/hN.a:()V
        //   190: aload_2        
        //   191: ifnull          247
        //   194: getstatic       com/google/bj.NEED_RESULT_POINT_CALLBACK:Lcom/google/bj;
        //   197: astore          28
        //   199: aload_2        
        //   200: aload           28
        //   202: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   207: istore          29
        //   209: iload           29
        //   211: ifeq            247
        //   214: new             Ljava/util/EnumMap;
        //   217: dup            
        //   218: ldc             Lcom/google/bj;.class
        //   220: invokespecial   java/util/EnumMap.<init>:(Ljava/lang/Class;)V
        //   223: astore          30
        //   225: aload           30
        //   227: aload_2        
        //   228: invokeinterface java/util/Map.putAll:(Ljava/util/Map;)V
        //   233: aload           30
        //   235: getstatic       com/google/bj.NEED_RESULT_POINT_CALLBACK:Lcom/google/bj;
        //   238: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   243: pop            
        //   244: aload           30
        //   246: astore_2       
        //   247: aload_0        
        //   248: iload           16
        //   250: aload           19
        //   252: aload_2        
        //   253: invokevirtual   com/google/gj.a:(ILcom/google/hN;Ljava/util/Map;)Lcom/google/aU;
        //   256: astore          23
        //   258: iload           20
        //   260: iconst_1       
        //   261: if_icmpne       352
        //   264: aload           23
        //   266: getstatic       com/google/A.ORIENTATION:Lcom/google/A;
        //   269: sipush          180
        //   272: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   275: invokevirtual   com/google/aU.a:(Lcom/google/A;Ljava/lang/Object;)V
        //   278: aload           23
        //   280: invokevirtual   com/google/aU.c:()[Lcom/google/cs;
        //   283: astore          24
        //   285: aload           24
        //   287: ifnull          352
        //   290: aload           24
        //   292: iconst_0       
        //   293: new             Lcom/google/cs;
        //   296: dup            
        //   297: iload           4
        //   299: i2f            
        //   300: aload           24
        //   302: iconst_0       
        //   303: aaload         
        //   304: invokevirtual   com/google/cs.a:()F
        //   307: fsub           
        //   308: fconst_1       
        //   309: fsub           
        //   310: aload           24
        //   312: iconst_0       
        //   313: aaload         
        //   314: invokevirtual   com/google/cs.b:()F
        //   317: invokespecial   com/google/cs.<init>:(FF)V
        //   320: aastore        
        //   321: aload           24
        //   323: iconst_1       
        //   324: new             Lcom/google/cs;
        //   327: dup            
        //   328: iload           4
        //   330: i2f            
        //   331: aload           24
        //   333: iconst_1       
        //   334: aaload         
        //   335: invokevirtual   com/google/cs.a:()F
        //   338: fsub           
        //   339: fconst_1       
        //   340: fsub           
        //   341: aload           24
        //   343: iconst_1       
        //   344: aaload         
        //   345: invokevirtual   com/google/cs.b:()F
        //   348: invokespecial   com/google/cs.<init>:(FF)V
        //   351: aastore        
        //   352: aload           23
        //   354: areturn        
        //   355: astore          33
        //   357: aload           33
        //   359: athrow         
        //   360: astore          34
        //   362: aload           34
        //   364: athrow         
        //   365: iconst_0       
        //   366: istore          8
        //   368: goto            60
        //   371: iconst_5       
        //   372: istore          9
        //   374: goto            69
        //   377: iconst_0       
        //   378: istore          14
        //   380: goto            121
        //   383: iload           13
        //   385: ineg           
        //   386: istore          15
        //   388: goto            130
        //   391: astore          17
        //   393: iload_3        
        //   394: ifeq            435
        //   397: aload           6
        //   399: astore          19
        //   401: goto            170
        //   404: astore          26
        //   406: aload           26
        //   408: athrow         
        //   409: astore          27
        //   411: aload           27
        //   413: athrow         
        //   414: astore          25
        //   416: aload           25
        //   418: athrow         
        //   419: astore          21
        //   421: iload           20
        //   423: iconst_1       
        //   424: iadd           
        //   425: istore          22
        //   427: iload_3        
        //   428: ifeq            456
        //   431: aload           19
        //   433: astore          6
        //   435: iload           12
        //   437: iconst_1       
        //   438: iadd           
        //   439: istore          18
        //   441: iload_3        
        //   442: ifeq            449
        //   445: invokestatic    com/google/fv.a:()Lcom/google/fv;
        //   448: athrow         
        //   449: iload           18
        //   451: istore          12
        //   453: goto            96
        //   456: iload           22
        //   458: istore          20
        //   460: goto            173
        //   463: iload           5
        //   465: istore          11
        //   467: goto            93
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  37     52     355    365    Lcom/google/fv;
        //  156    166    391    404    Lcom/google/fv;
        //  185    190    404    409    Lcom/google/fv;
        //  194    209    409    414    Lcom/google/fv;
        //  247    258    419    431    Lcom/google/fN;
        //  264    285    419    431    Lcom/google/fN;
        //  290    352    414    419    Lcom/google/fv;
        //  290    352    419    431    Lcom/google/fN;
        //  357    360    360    365    Lcom/google/fv;
        //  406    409    409    414    Lcom/google/fv;
        //  416    419    419    431    Lcom/google/fN;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 239, Size: 239
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
    
    protected static void b(final hN hn, final int n, final int[] array) {
        final boolean a = gj.a;
        final int length = array.length;
        Arrays.fill(array, 0, length, 0);
        final int b = hn.b();
        if (n >= b) {
            throw fv.a();
        }
        final boolean b2 = !hn.a(n);
        int i = n;
        boolean b3 = b2;
        int n2 = 0;
    Label_0134:
        while (true) {
            while (i < b) {
                int n3 = 0;
                Label_0120: {
                    if (b3 ^ hn.a(i)) {
                        ++array[n2];
                        if (!a) {
                            n3 = n2;
                            break Label_0120;
                        }
                    }
                    n3 = n2 + 1;
                    if (n3 == length && !a) {
                        final int n4 = i;
                        final int n5 = n3;
                        break Label_0134;
                    }
                    array[n3] = 1;
                    b3 = !b3;
                }
                final int n4 = i + 1;
                if (!a) {
                    i = n4;
                    n2 = n3;
                    continue;
                }
                final int n5 = n3;
                if (n5 != length && (n5 != length - 1 || n4 != b)) {
                    throw fv.a();
                }
                return;
            }
            final int n5 = n2;
            final int n4 = i;
            continue Label_0134;
        }
    }
    
    public abstract aU a(final int p0, final hN p1, final Map p2);
    
    @Override
    public aU a(final c1 p0, final Map p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: getstatic       com/google/gj.a:Z
        //     5: istore          4
        //     7: aload_0        
        //     8: aload_1        
        //     9: aload_2        
        //    10: invokespecial   com/google/gj.b:(Lcom/google/c1;Ljava/util/Map;)Lcom/google/aU;
        //    13: astore          19
        //    15: aload           19
        //    17: areturn        
        //    18: astore          5
        //    20: aload_2        
        //    21: ifnull          215
        //    24: aload_2        
        //    25: getstatic       com/google/bj.TRY_HARDER:Lcom/google/bj;
        //    28: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    33: istore          18
        //    35: iload           18
        //    37: ifeq            215
        //    40: iconst_1       
        //    41: istore          6
        //    43: iload           6
        //    45: ifeq            231
        //    48: aload_1        
        //    49: invokevirtual   com/google/c1.b:()Z
        //    52: istore          8
        //    54: iload           8
        //    56: ifeq            231
        //    59: aload_1        
        //    60: invokevirtual   com/google/c1.a:()Lcom/google/c1;
        //    63: astore          9
        //    65: aload_0        
        //    66: aload           9
        //    68: aload_2        
        //    69: invokespecial   com/google/gj.b:(Lcom/google/c1;Ljava/util/Map;)Lcom/google/aU;
        //    72: astore          10
        //    74: aload           10
        //    76: invokevirtual   com/google/aU.d:()Ljava/util/Map;
        //    79: astore          11
        //    81: aload           11
        //    83: ifnull          234
        //    86: aload           11
        //    88: getstatic       com/google/A.ORIENTATION:Lcom/google/A;
        //    91: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    96: istore          16
        //    98: iload           16
        //   100: ifeq            234
        //   103: sipush          270
        //   106: aload           11
        //   108: getstatic       com/google/A.ORIENTATION:Lcom/google/A;
        //   111: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   116: checkcast       Ljava/lang/Integer;
        //   119: invokevirtual   java/lang/Integer.intValue:()I
        //   122: iadd           
        //   123: sipush          360
        //   126: irem           
        //   127: istore          12
        //   129: aload           10
        //   131: getstatic       com/google/A.ORIENTATION:Lcom/google/A;
        //   134: iload           12
        //   136: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   139: invokevirtual   com/google/aU.a:(Lcom/google/A;Ljava/lang/Object;)V
        //   142: aload           10
        //   144: invokevirtual   com/google/aU.c:()[Lcom/google/cs;
        //   147: astore          13
        //   149: aload           13
        //   151: ifnull          207
        //   154: aload           9
        //   156: invokevirtual   com/google/c1.d:()I
        //   159: istore          14
        //   161: iload_3        
        //   162: aload           13
        //   164: arraylength    
        //   165: if_icmpge       207
        //   168: aload           13
        //   170: iload_3        
        //   171: new             Lcom/google/cs;
        //   174: dup            
        //   175: iload           14
        //   177: i2f            
        //   178: aload           13
        //   180: iload_3        
        //   181: aaload         
        //   182: invokevirtual   com/google/cs.b:()F
        //   185: fsub           
        //   186: fconst_1       
        //   187: fsub           
        //   188: aload           13
        //   190: iload_3        
        //   191: aaload         
        //   192: invokevirtual   com/google/cs.a:()F
        //   195: invokespecial   com/google/cs.<init>:(FF)V
        //   198: aastore        
        //   199: iinc            3, 1
        //   202: iload           4
        //   204: ifeq            161
        //   207: aload           10
        //   209: areturn        
        //   210: astore          17
        //   212: aload           17
        //   214: athrow         
        //   215: iconst_0       
        //   216: istore          6
        //   218: goto            43
        //   221: astore          7
        //   223: aload           7
        //   225: athrow         
        //   226: astore          15
        //   228: aload           15
        //   230: athrow         
        //   231: aload           5
        //   233: athrow         
        //   234: sipush          270
        //   237: istore          12
        //   239: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  7      15     18     242    Lcom/google/fv;
        //  24     35     210    215    Lcom/google/fv;
        //  48     54     221    226    Lcom/google/fv;
        //  86     98     226    231    Lcom/google/fv;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 116, Size: 116
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    @Override
    public void a() {
    }
}
