// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class bB
{
    private static final bB a;
    private static final String[] z;
    private final gh b;
    private boolean c;
    private boolean d;
    
    static {
        final String[] z2 = new String[12];
        final char[] charArray = "Vr\b>}V~\u00043YMa\f\u001cDA{\rr\u0004\u0004t\b4CKcI2LJs\u0005?\rAz\u000b?I@r\rz@Ad\u001a;JAdG".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '-';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = 'i';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "Vr\b>}V~\u00043YMa\f\u001cDA{\rr\u0004\u0004t\b4CKcI2LJs\u0005?\rJr\u001a.H@7\u000e(BQg\u001at".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '-';
                    break;
                }
                case 0: {
                    c4 = '$';
                    break;
                }
                case 1: {
                    c4 = '\u0017';
                    break;
                }
                case 2: {
                    c4 = 'i';
                    break;
                }
                case 3: {
                    c4 = 'Z';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "Vr\b>}V~\u00043YMa\f\u001cDA{\rr\u0004\u0004t\b4CKcI2LJs\u0005?\rAy\u001c7^\n".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '-';
                    break;
                }
                case 0: {
                    c6 = '$';
                    break;
                }
                case 1: {
                    c6 = '\u0017';
                    break;
                }
                case 2: {
                    c6 = 'i';
                    break;
                }
                case 3: {
                    c6 = 'Z';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "p\u007f\f(H\u0004~\u001azCK7\u001e;T\u0004c\u0006zJAcI2HVrEzOQcI.EA7\n5@T~\u0005?_\u0004c\u00013COdI5YLr\u001b-DWrG".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '-';
                    break;
                }
                case 0: {
                    c8 = '$';
                    break;
                }
                case 1: {
                    c8 = '\u0017';
                    break;
                }
                case 2: {
                    c8 = 'i';
                    break;
                }
                case 3: {
                    c8 = 'Z';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "Cr\u001d\bHTr\b.H@Q\u0000?A@?@zNEyI5CHnI8H\u0004t\b6AAsI5C\u0004e\f*HEc\f>\rB~\f6IW9".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '-';
                    break;
                }
                case 0: {
                    c10 = '$';
                    break;
                }
                case 1: {
                    c10 = '\u0017';
                    break;
                }
                case 2: {
                    c10 = 'i';
                    break;
                }
                case 3: {
                    c10 = 'Z';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "Cr\u001d\bHTr\b.H@Q\u0000?A@?@zNEyI5CHnI8H\u0004t\b6AAsI5C\u0004e\f*HEc\f>\rB~\f6IW9".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '-';
                    break;
                }
                case 0: {
                    c12 = '$';
                    break;
                }
                case 1: {
                    c12 = '\u0017';
                    break;
                }
                case 2: {
                    c12 = 'i';
                    break;
                }
                case 3: {
                    c12 = 'Z';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "p\u007f\f(H\u0004~\u001azCK7\u001e;T\u0004c\u0006zJAcI2HVrEzOQcI.EA7\n5@T~\u0005?_\u0004c\u00013COdI5YLr\u001b-DWrG".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '-';
                    break;
                }
                case 0: {
                    c14 = '$';
                    break;
                }
                case 1: {
                    c14 = '\u0017';
                    break;
                }
                case 2: {
                    c14 = 'i';
                    break;
                }
                case 3: {
                    c14 = 'Z';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "se\u00064J\u0004x\u000b0HGcI.TTrI/^AsI-DP\u007fI*_Kc\u00069BH7\u0004?^Wv\u000e?\rVr\u000f6HGc\u00005C\n".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '-';
                    break;
                }
                case 0: {
                    c16 = '$';
                    break;
                }
                case 1: {
                    c16 = '\u0017';
                    break;
                }
                case 2: {
                    c16 = 'i';
                    break;
                }
                case 3: {
                    c16 = 'Z';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "se\u00064J\u0004x\u000b0HGcI.TTrI/^AsI-DP\u007fI*_Kc\u00069BH7\u0004?^Wv\u000e?\rVr\u000f6HGc\u00005C\n".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '-';
                    break;
                }
                case 0: {
                    c18 = '$';
                    break;
                }
                case 1: {
                    c18 = '\u0017';
                    break;
                }
                case 2: {
                    c18 = 'i';
                    break;
                }
                case 3: {
                    c18 = 'Z';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "Es\r\bHTr\b.H@Q\u0000?A@?@zNEyI5CHnI8H\u0004t\b6AAsI5C\u0004e\f*HEc\f>\rB~\f6IW9".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '-';
                    break;
                }
                case 0: {
                    c20 = '$';
                    break;
                }
                case 1: {
                    c20 = '\u0017';
                    break;
                }
                case 2: {
                    c20 = 'i';
                    break;
                }
                case 3: {
                    c20 = 'Z';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "se\u00064J\u0004x\u000b0HGcI.TTrI/^AsI-DP\u007fI*_Kc\u00069BH7\u0004?^Wv\u000e?\rVr\u000f6HGc\u00005C\n".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '-';
                    break;
                }
                case 0: {
                    c22 = '$';
                    break;
                }
                case 1: {
                    c22 = '\u0017';
                    break;
                }
                case 2: {
                    c22 = 'i';
                    break;
                }
                case 3: {
                    c22 = 'Z';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "Lv\u001a\u001cDA{\rr\u0004\u0004t\b4\rKy\u0005#\rFrI9LH{\f>\rKyI4BJ:\u001b?]Av\u001d?I\u0004q\u0000?A@dG".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '-';
                    break;
                }
                case 0: {
                    c24 = '$';
                    break;
                }
                case 1: {
                    c24 = '\u0017';
                    break;
                }
                case 2: {
                    c24 = 'i';
                    break;
                }
                case 3: {
                    c24 = 'Z';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        z = z2;
        a = new bB(true);
    }
    
    private bB() {
        this.d = false;
        this.b = gh.a(16);
    }
    
    private bB(final boolean b) {
        this.d = false;
        this.b = gh.a(0);
        this.b();
    }
    
    private static int a(final el el, final int n, final Object o) {
        int k = ep.k(n);
        if (el == el.GROUP) {
            k *= 2;
        }
        return k + b(el, o);
    }
    
    static int a(final el el, final boolean b) {
        if (b) {
            return 2;
        }
        return el.getWireType();
    }
    
    private int a(final Map.Entry p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //     6: checkcast       Lcom/google/aK;
        //     9: astore_2       
        //    10: aload_1        
        //    11: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    16: astore_3       
        //    17: aload_2        
        //    18: invokeinterface com/google/aK.d:()Lcom/google/es;
        //    23: astore          8
        //    25: getstatic       com/google/es.MESSAGE:Lcom/google/es;
        //    28: astore          9
        //    30: aload           8
        //    32: aload           9
        //    34: if_acmpne       138
        //    37: aload_2        
        //    38: invokeinterface com/google/aK.b:()Z
        //    43: istore          10
        //    45: iload           10
        //    47: ifne            138
        //    50: aload_2        
        //    51: invokeinterface com/google/aK.a:()Z
        //    56: istore          11
        //    58: iload           11
        //    60: ifne            138
        //    63: aload_3        
        //    64: instanceof      Lcom/google/cQ;
        //    67: ifeq            116
        //    70: aload_1        
        //    71: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    76: checkcast       Lcom/google/aK;
        //    79: invokeinterface com/google/aK.c:()I
        //    84: aload_3        
        //    85: checkcast       Lcom/google/cQ;
        //    88: invokestatic    com/google/ep.b:(ILcom/google/cQ;)I
        //    91: istore          12
        //    93: iload           12
        //    95: ireturn        
        //    96: astore          4
        //    98: aload           4
        //   100: athrow         
        //   101: astore          5
        //   103: aload           5
        //   105: athrow         
        //   106: astore          6
        //   108: aload           6
        //   110: athrow         
        //   111: astore          7
        //   113: aload           7
        //   115: athrow         
        //   116: aload_1        
        //   117: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   122: checkcast       Lcom/google/aK;
        //   125: invokeinterface com/google/aK.c:()I
        //   130: aload_3        
        //   131: checkcast       Lcom/google/ci;
        //   134: invokestatic    com/google/ep.a:(ILcom/google/ci;)I
        //   137: ireturn        
        //   138: aload_2        
        //   139: aload_3        
        //   140: invokestatic    com/google/bB.b:(Lcom/google/aK;Ljava/lang/Object;)I
        //   143: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  17     30     96     101    Ljava/lang/IllegalArgumentException;
        //  37     45     101    106    Ljava/lang/IllegalArgumentException;
        //  50     58     106    111    Ljava/lang/IllegalArgumentException;
        //  63     93     111    116    Ljava/lang/IllegalArgumentException;
        //  98     101    101    106    Ljava/lang/IllegalArgumentException;
        //  103    106    106    111    Ljava/lang/IllegalArgumentException;
        //  108    111    111    116    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 62, Size: 62
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
    
    public static Object a(final cL cl, final el el) {
        try {
            switch (ct.a[el.ordinal()]) {
                default: {
                    throw new RuntimeException(bB.z[3]);
                }
                case 1: {
                    return cl.u();
                }
                case 2: {
                    break;
                }
                case 3: {
                    return cl.k();
                }
                case 4: {
                    return cl.t();
                }
                case 5: {
                    return cl.j();
                }
                case 6: {
                    return cl.n();
                }
                case 7: {
                    return cl.p();
                }
                case 8: {
                    return cl.x();
                }
                case 9: {
                    return cl.h();
                }
                case 10: {
                    return cl.e();
                }
                case 11: {
                    return cl.l();
                }
                case 12: {
                    return cl.w();
                }
                case 13: {
                    return cl.z();
                }
                case 14: {
                    return cl.v();
                }
                case 15: {
                    return cl.d();
                }
                case 16: {
                    throw new IllegalArgumentException(bB.z[1]);
                }
                case 17: {
                    throw new IllegalArgumentException(bB.z[0]);
                }
                case 18: {
                    throw new IllegalArgumentException(bB.z[2]);
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return cl.y();
    }
    
    public static void a(final aK p0, final Object p1, final ep p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokeinterface com/google/aK.e:()Lcom/google/el;
        //    10: astore          4
        //    12: aload_0        
        //    13: invokeinterface com/google/aK.c:()I
        //    18: istore          5
        //    20: aload_0        
        //    21: invokeinterface com/google/aK.b:()Z
        //    26: ifeq            182
        //    29: aload_1        
        //    30: checkcast       Ljava/util/List;
        //    33: astore          9
        //    35: aload_0        
        //    36: invokeinterface com/google/aK.a:()Z
        //    41: ifeq            140
        //    44: aload_2        
        //    45: iload           5
        //    47: iconst_2       
        //    48: invokevirtual   com/google/ep.d:(II)V
        //    51: iconst_0       
        //    52: istore          11
        //    54: aload           9
        //    56: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    61: astore          12
        //    63: aload           12
        //    65: invokeinterface java/util/Iterator.hasNext:()Z
        //    70: ifeq            94
        //    73: iload           11
        //    75: aload           4
        //    77: aload           12
        //    79: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    84: invokestatic    com/google/bB.b:(Lcom/google/el;Ljava/lang/Object;)I
        //    87: iadd           
        //    88: istore          11
        //    90: iload_3        
        //    91: ifeq            63
        //    94: aload_2        
        //    95: iload           11
        //    97: invokevirtual   com/google/ep.q:(I)V
        //   100: aload           9
        //   102: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   107: astore          13
        //   109: aload           13
        //   111: invokeinterface java/util/Iterator.hasNext:()Z
        //   116: ifeq            136
        //   119: aload_2        
        //   120: aload           4
        //   122: aload           13
        //   124: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   129: invokestatic    com/google/bB.a:(Lcom/google/ep;Lcom/google/el;Ljava/lang/Object;)V
        //   132: iload_3        
        //   133: ifeq            109
        //   136: iload_3        
        //   137: ifeq            178
        //   140: aload           9
        //   142: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   147: astore          10
        //   149: aload           10
        //   151: invokeinterface java/util/Iterator.hasNext:()Z
        //   156: ifeq            178
        //   159: aload_2        
        //   160: aload           4
        //   162: iload           5
        //   164: aload           10
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: invokestatic    com/google/bB.a:(Lcom/google/ep;Lcom/google/el;ILjava/lang/Object;)V
        //   174: iload_3        
        //   175: ifeq            149
        //   178: iload_3        
        //   179: ifeq            232
        //   182: aload_1        
        //   183: instanceof      Lcom/google/cQ;
        //   186: istore          8
        //   188: iload           8
        //   190: ifeq            212
        //   193: aload_2        
        //   194: aload           4
        //   196: iload           5
        //   198: aload_1        
        //   199: checkcast       Lcom/google/cQ;
        //   202: invokevirtual   com/google/cQ.c:()Lcom/google/ci;
        //   205: invokestatic    com/google/bB.a:(Lcom/google/ep;Lcom/google/el;ILjava/lang/Object;)V
        //   208: iload_3        
        //   209: ifeq            232
        //   212: aload_2        
        //   213: aload           4
        //   215: iload           5
        //   217: aload_1        
        //   218: invokestatic    com/google/bB.a:(Lcom/google/ep;Lcom/google/el;ILjava/lang/Object;)V
        //   221: return         
        //   222: astore          6
        //   224: aload           6
        //   226: athrow         
        //   227: astore          7
        //   229: aload           7
        //   231: athrow         
        //   232: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  182    188    222    227    Ljava/lang/IllegalArgumentException;
        //  193    208    227    232    Ljava/lang/IllegalArgumentException;
        //  212    221    227    232    Ljava/lang/IllegalArgumentException;
        //  224    227    227    232    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0212:
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
    
    private static void a(final el el, final Object o) {
        final boolean b = dt.b;
        if (o == null) {
            try {
                throw new NullPointerException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int n = ct.b[el.getJavaType().ordinal()];
        int n2 = 0;
        while (true) {
            boolean b2 = false;
            Label_0231: {
                while (true) {
                    Block_3: {
                        switch (n) {
                            case 1: {
                                b2 = (o instanceof Integer);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 2: {
                                b2 = (o instanceof Long);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 3: {
                                b2 = (o instanceof Float);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 4: {
                                b2 = (o instanceof Double);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 5: {
                                b2 = (o instanceof Boolean);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 6: {
                                b2 = (o instanceof String);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 7: {
                                b2 = (o instanceof hv);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 8: {
                                b2 = (o instanceof fc);
                                if (b) {
                                    break Block_3;
                                }
                                break Label_0231;
                            }
                            case 9: {
                                Label_0238: {
                                    try {
                                        if (o instanceof ci) {
                                            break Label_0238;
                                        }
                                        final Object o2 = o;
                                        final boolean b3 = o2 instanceof cQ;
                                        n2 = 0;
                                        final boolean b4 = b3;
                                        if (b4) {
                                            break Label_0238;
                                        }
                                        break;
                                    }
                                    catch (IllegalArgumentException ex2) {
                                        throw ex2;
                                    }
                                    try {
                                        final Object o2 = o;
                                        final boolean b3 = o2 instanceof cQ;
                                        n2 = 0;
                                        final boolean b4 = b3;
                                        if (b4) {
                                            break Label_0238;
                                        }
                                        break;
                                    }
                                    catch (IllegalArgumentException ex3) {
                                        throw ex3;
                                    }
                                    return;
                                }
                                n2 = 1;
                                break;
                            }
                        }
                    }
                    if (n2 == 0) {
                        try {
                            throw new IllegalArgumentException(bB.z[7]);
                        }
                        catch (IllegalArgumentException ex4) {
                            throw ex4;
                        }
                        continue;
                    }
                    break;
                }
                return;
            }
            n2 = (b2 ? 1 : 0);
            continue;
        }
    }
    
    private static void a(final ep p0, final el p1, final int p2, final Object p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/el.GROUP:Lcom/google/el;
        //     3: astore          6
        //     5: aload_1        
        //     6: aload           6
        //     8: if_acmpne       26
        //    11: aload_0        
        //    12: iload_2        
        //    13: aload_3        
        //    14: checkcast       Lcom/google/ci;
        //    17: invokevirtual   com/google/ep.b:(ILcom/google/ci;)V
        //    20: getstatic       com/google/dt.b:Z
        //    23: ifeq            53
        //    26: aload_0        
        //    27: iload_2        
        //    28: aload_1        
        //    29: iconst_0       
        //    30: invokestatic    com/google/bB.a:(Lcom/google/el;Z)I
        //    33: invokevirtual   com/google/ep.d:(II)V
        //    36: aload_0        
        //    37: aload_1        
        //    38: aload_3        
        //    39: invokestatic    com/google/bB.a:(Lcom/google/ep;Lcom/google/el;Ljava/lang/Object;)V
        //    42: return         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: astore          5
        //    50: aload           5
        //    52: athrow         
        //    53: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      43     48     Ljava/lang/IllegalArgumentException;
        //  11     26     48     53     Ljava/lang/IllegalArgumentException;
        //  26     42     48     53     Ljava/lang/IllegalArgumentException;
        //  45     48     48     53     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    private static void a(final ep p0, final el p1, final Object p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: getstatic       com/google/ct.a:[I
        //     7: aload_1        
        //     8: invokevirtual   com/google/el.ordinal:()I
        //    11: iaload         
        //    12: istore          22
        //    14: iload           22
        //    16: tableswitch {
        //                2: 105
        //                3: 120
        //                4: 135
        //                5: 150
        //                6: 165
        //                7: 180
        //                8: 195
        //                9: 210
        //               10: 225
        //               11: 261
        //               12: 273
        //               13: 288
        //               14: 303
        //               15: 318
        //               16: 333
        //               17: 237
        //               18: 249
        //               19: 348
        //          default: 104
        //        }
        //   104: return         
        //   105: aload_0        
        //   106: aload_2        
        //   107: checkcast       Ljava/lang/Double;
        //   110: invokevirtual   java/lang/Double.doubleValue:()D
        //   113: invokevirtual   com/google/ep.b:(D)V
        //   116: iload_3        
        //   117: ifeq            104
        //   120: aload_0        
        //   121: aload_2        
        //   122: checkcast       Ljava/lang/Float;
        //   125: invokevirtual   java/lang/Float.floatValue:()F
        //   128: invokevirtual   com/google/ep.a:(F)V
        //   131: iload_3        
        //   132: ifeq            104
        //   135: aload_0        
        //   136: aload_2        
        //   137: checkcast       Ljava/lang/Long;
        //   140: invokevirtual   java/lang/Long.longValue:()J
        //   143: invokevirtual   com/google/ep.h:(J)V
        //   146: iload_3        
        //   147: ifeq            104
        //   150: aload_0        
        //   151: aload_2        
        //   152: checkcast       Ljava/lang/Long;
        //   155: invokevirtual   java/lang/Long.longValue:()J
        //   158: invokevirtual   com/google/ep.i:(J)V
        //   161: iload_3        
        //   162: ifeq            104
        //   165: aload_0        
        //   166: aload_2        
        //   167: checkcast       Ljava/lang/Integer;
        //   170: invokevirtual   java/lang/Integer.intValue:()I
        //   173: invokevirtual   com/google/ep.m:(I)V
        //   176: iload_3        
        //   177: ifeq            104
        //   180: aload_0        
        //   181: aload_2        
        //   182: checkcast       Ljava/lang/Long;
        //   185: invokevirtual   java/lang/Long.longValue:()J
        //   188: invokevirtual   com/google/ep.a:(J)V
        //   191: iload_3        
        //   192: ifeq            104
        //   195: aload_0        
        //   196: aload_2        
        //   197: checkcast       Ljava/lang/Integer;
        //   200: invokevirtual   java/lang/Integer.intValue:()I
        //   203: invokevirtual   com/google/ep.a:(I)V
        //   206: iload_3        
        //   207: ifeq            104
        //   210: aload_0        
        //   211: aload_2        
        //   212: checkcast       Ljava/lang/Boolean;
        //   215: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   218: invokevirtual   com/google/ep.b:(Z)V
        //   221: iload_3        
        //   222: ifeq            104
        //   225: aload_0        
        //   226: aload_2        
        //   227: checkcast       Ljava/lang/String;
        //   230: invokevirtual   com/google/ep.a:(Ljava/lang/String;)V
        //   233: iload_3        
        //   234: ifeq            104
        //   237: aload_0        
        //   238: aload_2        
        //   239: checkcast       Lcom/google/ci;
        //   242: invokevirtual   com/google/ep.d:(Lcom/google/ci;)V
        //   245: iload_3        
        //   246: ifeq            104
        //   249: aload_0        
        //   250: aload_2        
        //   251: checkcast       Lcom/google/ci;
        //   254: invokevirtual   com/google/ep.c:(Lcom/google/ci;)V
        //   257: iload_3        
        //   258: ifeq            104
        //   261: aload_0        
        //   262: aload_2        
        //   263: checkcast       Lcom/google/hv;
        //   266: invokevirtual   com/google/ep.b:(Lcom/google/hv;)V
        //   269: iload_3        
        //   270: ifeq            104
        //   273: aload_0        
        //   274: aload_2        
        //   275: checkcast       Ljava/lang/Integer;
        //   278: invokevirtual   java/lang/Integer.intValue:()I
        //   281: invokevirtual   com/google/ep.e:(I)V
        //   284: iload_3        
        //   285: ifeq            104
        //   288: aload_0        
        //   289: aload_2        
        //   290: checkcast       Ljava/lang/Integer;
        //   293: invokevirtual   java/lang/Integer.intValue:()I
        //   296: invokevirtual   com/google/ep.h:(I)V
        //   299: iload_3        
        //   300: ifeq            104
        //   303: aload_0        
        //   304: aload_2        
        //   305: checkcast       Ljava/lang/Long;
        //   308: invokevirtual   java/lang/Long.longValue:()J
        //   311: invokevirtual   com/google/ep.l:(J)V
        //   314: iload_3        
        //   315: ifeq            104
        //   318: aload_0        
        //   319: aload_2        
        //   320: checkcast       Ljava/lang/Integer;
        //   323: invokevirtual   java/lang/Integer.intValue:()I
        //   326: invokevirtual   com/google/ep.p:(I)V
        //   329: iload_3        
        //   330: ifeq            104
        //   333: aload_0        
        //   334: aload_2        
        //   335: checkcast       Ljava/lang/Long;
        //   338: invokevirtual   java/lang/Long.longValue:()J
        //   341: invokevirtual   com/google/ep.b:(J)V
        //   344: iload_3        
        //   345: ifeq            104
        //   348: aload_0        
        //   349: aload_2        
        //   350: checkcast       Lcom/google/fc;
        //   353: invokeinterface com/google/fc.getNumber:()I
        //   358: invokevirtual   com/google/ep.n:(I)V
        //   361: return         
        //   362: astore          21
        //   364: aload           21
        //   366: athrow         
        //   367: astore          4
        //   369: aload           4
        //   371: athrow         
        //   372: astore          5
        //   374: aload           5
        //   376: athrow         
        //   377: astore          6
        //   379: aload           6
        //   381: athrow         
        //   382: astore          7
        //   384: aload           7
        //   386: athrow         
        //   387: astore          8
        //   389: aload           8
        //   391: athrow         
        //   392: astore          9
        //   394: aload           9
        //   396: athrow         
        //   397: astore          10
        //   399: aload           10
        //   401: athrow         
        //   402: astore          11
        //   404: aload           11
        //   406: athrow         
        //   407: astore          12
        //   409: aload           12
        //   411: athrow         
        //   412: astore          13
        //   414: aload           13
        //   416: athrow         
        //   417: astore          14
        //   419: aload           14
        //   421: athrow         
        //   422: astore          15
        //   424: aload           15
        //   426: athrow         
        //   427: astore          16
        //   429: aload           16
        //   431: athrow         
        //   432: astore          17
        //   434: aload           17
        //   436: athrow         
        //   437: astore          18
        //   439: aload           18
        //   441: athrow         
        //   442: astore          19
        //   444: aload           19
        //   446: athrow         
        //   447: astore          20
        //   449: aload           20
        //   451: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      14     367    372    Ljava/lang/IllegalArgumentException;
        //  105    116    372    377    Ljava/lang/IllegalArgumentException;
        //  120    131    377    382    Ljava/lang/IllegalArgumentException;
        //  135    146    382    387    Ljava/lang/IllegalArgumentException;
        //  150    161    387    392    Ljava/lang/IllegalArgumentException;
        //  165    176    392    397    Ljava/lang/IllegalArgumentException;
        //  180    191    397    402    Ljava/lang/IllegalArgumentException;
        //  195    206    402    407    Ljava/lang/IllegalArgumentException;
        //  210    221    407    412    Ljava/lang/IllegalArgumentException;
        //  225    233    412    417    Ljava/lang/IllegalArgumentException;
        //  237    245    417    422    Ljava/lang/IllegalArgumentException;
        //  249    257    422    427    Ljava/lang/IllegalArgumentException;
        //  261    269    427    432    Ljava/lang/IllegalArgumentException;
        //  273    284    432    437    Ljava/lang/IllegalArgumentException;
        //  288    299    437    442    Ljava/lang/IllegalArgumentException;
        //  303    314    442    447    Ljava/lang/IllegalArgumentException;
        //  318    329    447    452    Ljava/lang/IllegalArgumentException;
        //  333    344    362    367    Ljava/lang/IllegalArgumentException;
        //  348    361    362    367    Ljava/lang/IllegalArgumentException;
        //  369    372    372    377    Ljava/lang/IllegalArgumentException;
        //  374    377    377    382    Ljava/lang/IllegalArgumentException;
        //  379    382    382    387    Ljava/lang/IllegalArgumentException;
        //  384    387    387    392    Ljava/lang/IllegalArgumentException;
        //  389    392    392    397    Ljava/lang/IllegalArgumentException;
        //  394    397    397    402    Ljava/lang/IllegalArgumentException;
        //  399    402    402    407    Ljava/lang/IllegalArgumentException;
        //  404    407    407    412    Ljava/lang/IllegalArgumentException;
        //  409    412    412    417    Ljava/lang/IllegalArgumentException;
        //  414    417    417    422    Ljava/lang/IllegalArgumentException;
        //  419    422    422    427    Ljava/lang/IllegalArgumentException;
        //  424    427    427    432    Ljava/lang/IllegalArgumentException;
        //  429    432    432    437    Ljava/lang/IllegalArgumentException;
        //  434    437    437    442    Ljava/lang/IllegalArgumentException;
        //  439    442    442    447    Ljava/lang/IllegalArgumentException;
        //  444    447    447    452    Ljava/lang/IllegalArgumentException;
        //  449    452    362    367    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 185, Size: 185
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
    
    private void a(final Map.Entry p0, final ep p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //     6: checkcast       Lcom/google/aK;
        //     9: astore_3       
        //    10: aload_3        
        //    11: invokeinterface com/google/aK.d:()Lcom/google/es;
        //    16: astore          8
        //    18: getstatic       com/google/es.MESSAGE:Lcom/google/es;
        //    21: astore          9
        //    23: aload           8
        //    25: aload           9
        //    27: if_acmpne       89
        //    30: aload_3        
        //    31: invokeinterface com/google/aK.b:()Z
        //    36: istore          10
        //    38: iload           10
        //    40: ifne            89
        //    43: aload_3        
        //    44: invokeinterface com/google/aK.a:()Z
        //    49: istore          11
        //    51: iload           11
        //    53: ifne            89
        //    56: aload_2        
        //    57: aload_1        
        //    58: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    63: checkcast       Lcom/google/aK;
        //    66: invokeinterface com/google/aK.c:()I
        //    71: aload_1        
        //    72: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    77: checkcast       Lcom/google/ci;
        //    80: invokevirtual   com/google/ep.d:(ILcom/google/ci;)V
        //    83: getstatic       com/google/dt.b:Z
        //    86: ifeq            100
        //    89: aload_3        
        //    90: aload_1        
        //    91: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    96: aload_2        
        //    97: invokestatic    com/google/bB.a:(Lcom/google/aK;Ljava/lang/Object;Lcom/google/ep;)V
        //   100: return         
        //   101: astore          4
        //   103: aload           4
        //   105: athrow         
        //   106: astore          5
        //   108: aload           5
        //   110: athrow         
        //   111: astore          6
        //   113: aload           6
        //   115: athrow         
        //   116: astore          7
        //   118: aload           7
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  10     23     101    106    Ljava/lang/IllegalArgumentException;
        //  30     38     106    111    Ljava/lang/IllegalArgumentException;
        //  43     51     111    116    Ljava/lang/IllegalArgumentException;
        //  56     89     116    121    Ljava/lang/IllegalArgumentException;
        //  89     100    116    121    Ljava/lang/IllegalArgumentException;
        //  103    106    106    111    Ljava/lang/IllegalArgumentException;
        //  108    111    111    116    Ljava/lang/IllegalArgumentException;
        //  113    116    116    121    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
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
    
    private void a(final Map p0, final Map.Entry p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //     6: checkcast       Lcom/google/aK;
        //     9: astore_3       
        //    10: aload_2        
        //    11: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    16: astore          4
        //    18: aload           4
        //    20: instanceof      Lcom/google/cQ;
        //    23: istore          7
        //    25: iload           7
        //    27: ifeq            52
        //    30: aload_1        
        //    31: aload_3        
        //    32: aload           4
        //    34: checkcast       Lcom/google/cQ;
        //    37: invokevirtual   com/google/cQ.c:()Lcom/google/ci;
        //    40: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    45: pop            
        //    46: getstatic       com/google/dt.b:Z
        //    49: ifeq            73
        //    52: aload_1        
        //    53: aload_3        
        //    54: aload           4
        //    56: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    61: pop            
        //    62: return         
        //    63: astore          5
        //    65: aload           5
        //    67: athrow         
        //    68: astore          6
        //    70: aload           6
        //    72: athrow         
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  18     25     63     68     Ljava/lang/IllegalArgumentException;
        //  30     52     68     73     Ljava/lang/IllegalArgumentException;
        //  52     62     68     73     Ljava/lang/IllegalArgumentException;
        //  65     68     68     73     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
    
    public static int b(final aK ak, final Object o) {
        while (true) {
            int n = 0;
            final boolean b = dt.b;
            final el e = ak.e();
            final int c = ak.c();
            try {
                if (!ak.b()) {
                    return a(e, c, o);
                }
                if (ak.a()) {
                    final Iterator<Object> iterator = ((List)o).iterator();
                    while (iterator.hasNext()) {
                        n += b(e, iterator.next());
                        if (b) {
                            break;
                        }
                    }
                    n = n + ep.k(c) + ep.o(n);
                    return n;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final Iterator<Object> iterator2 = ((List)o).iterator();
            while (iterator2.hasNext()) {
                n += a(e, c, iterator2.next());
                if (b) {
                    return n;
                }
            }
            return n;
        }
    }
    
    private static int b(final el el, final Object o) {
        Label_0284: {
            try {
                switch (ct.a[el.ordinal()]) {
                    default: {
                        throw new RuntimeException(bB.z[6]);
                    }
                    case 1: {
                        return ep.a((double)o);
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        return ep.n((long)o);
                    }
                    case 4: {
                        return ep.k((long)o);
                    }
                    case 5: {
                        return ep.c((int)o);
                    }
                    case 6: {
                        return ep.m((long)o);
                    }
                    case 7: {
                        return ep.i((int)o);
                    }
                    case 8: {
                        return ep.a((boolean)o);
                    }
                    case 9: {
                        return ep.b((String)o);
                    }
                    case 16: {
                        return ep.a((ci)o);
                    }
                    case 10: {
                        return ep.a((hv)o);
                    }
                    case 11: {
                        return ep.r((int)o);
                    }
                    case 12: {
                        return ep.l((int)o);
                    }
                    case 13: {
                        return ep.e((long)o);
                    }
                    case 14: {
                        return ep.g((int)o);
                    }
                    case 15: {
                        return ep.j((long)o);
                    }
                    case 17: {
                        break Label_0284;
                    }
                    case 18: {
                        return ep.b(((fc)o).getNumber());
                    }
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            return ep.b((float)o);
            try {
                if (o instanceof cQ) {
                    return ep.a((cQ)o);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return ep.b((ci)o);
    }
    
    private void b(final Map.Entry p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    10: checkcast       Lcom/google/aK;
        //    13: astore_3       
        //    14: aload_1        
        //    15: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    20: astore          4
        //    22: aload           4
        //    24: instanceof      Lcom/google/cQ;
        //    27: ifeq            224
        //    30: aload           4
        //    32: checkcast       Lcom/google/cQ;
        //    35: invokevirtual   com/google/cQ.c:()Lcom/google/ci;
        //    38: astore          5
        //    40: aload_3        
        //    41: invokeinterface com/google/aK.b:()Z
        //    46: ifeq            106
        //    49: aload_0        
        //    50: aload_3        
        //    51: invokevirtual   com/google/bB.c:(Lcom/google/aK;)Ljava/lang/Object;
        //    54: astore          15
        //    56: aload           15
        //    58: ifnonnull       86
        //    61: aload_0        
        //    62: getfield        com/google/bB.b:Lcom/google/gh;
        //    65: aload_3        
        //    66: new             Ljava/util/ArrayList;
        //    69: dup            
        //    70: aload           5
        //    72: checkcast       Ljava/util/List;
        //    75: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //    78: invokevirtual   com/google/gh.a:(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
        //    81: pop            
        //    82: iload_2        
        //    83: ifeq            102
        //    86: aload           15
        //    88: checkcast       Ljava/util/List;
        //    91: aload           5
        //    93: checkcast       Ljava/util/List;
        //    96: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   101: pop            
        //   102: iload_2        
        //   103: ifeq            203
        //   106: aload_3        
        //   107: invokeinterface com/google/aK.d:()Lcom/google/es;
        //   112: astore          7
        //   114: getstatic       com/google/es.MESSAGE:Lcom/google/es;
        //   117: astore          8
        //   119: aload           7
        //   121: aload           8
        //   123: if_acmpne       192
        //   126: aload_0        
        //   127: aload_3        
        //   128: invokevirtual   com/google/bB.c:(Lcom/google/aK;)Ljava/lang/Object;
        //   131: astore          11
        //   133: aload           11
        //   135: ifnonnull       153
        //   138: aload_0        
        //   139: getfield        com/google/bB.b:Lcom/google/gh;
        //   142: aload_3        
        //   143: aload           5
        //   145: invokevirtual   com/google/gh.a:(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
        //   148: pop            
        //   149: iload_2        
        //   150: ifeq            188
        //   153: aload_0        
        //   154: getfield        com/google/bB.b:Lcom/google/gh;
        //   157: aload_3        
        //   158: aload_3        
        //   159: aload           11
        //   161: checkcast       Lcom/google/ci;
        //   164: invokeinterface com/google/ci.toBuilder:()Lcom/google/aJ;
        //   169: aload           5
        //   171: checkcast       Lcom/google/ci;
        //   174: invokeinterface com/google/aK.a:(Lcom/google/aJ;Lcom/google/ci;)Lcom/google/aJ;
        //   179: invokeinterface com/google/aJ.build:()Lcom/google/ci;
        //   184: invokevirtual   com/google/gh.a:(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
        //   187: pop            
        //   188: iload_2        
        //   189: ifeq            203
        //   192: aload_0        
        //   193: getfield        com/google/bB.b:Lcom/google/gh;
        //   196: aload_3        
        //   197: aload           5
        //   199: invokevirtual   com/google/gh.a:(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
        //   202: pop            
        //   203: return         
        //   204: astore          16
        //   206: aload           16
        //   208: athrow         
        //   209: astore          6
        //   211: aload           6
        //   213: athrow         
        //   214: astore          12
        //   216: aload           12
        //   218: athrow         
        //   219: astore          9
        //   221: aload           9
        //   223: athrow         
        //   224: aload           4
        //   226: astore          5
        //   228: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  61     82     204    209    Ljava/lang/IllegalArgumentException;
        //  86     102    204    209    Ljava/lang/IllegalArgumentException;
        //  106    119    209    214    Ljava/lang/IllegalArgumentException;
        //  138    149    214    219    Ljava/lang/IllegalArgumentException;
        //  153    188    214    219    Ljava/lang/IllegalArgumentException;
        //  192    203    219    224    Ljava/lang/IllegalArgumentException;
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
    
    private boolean c(final Map.Entry entry) {
        Label_0111: {
            boolean b;
            while (true) {
                b = dt.b;
                final aK ak = entry.getKey();
                while (true) {
                    Label_0103: {
                        ci ci;
                        try {
                            if (ak.d() != es.MESSAGE) {
                                return true;
                            }
                            if (!ak.b()) {
                                break Label_0111;
                            }
                            final Iterator iterator = ((List)entry.getValue()).iterator();
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final ci ci2;
                            ci = (ci2 = iterator.next());
                            final boolean initialized = ci2.isInitialized();
                            final boolean initialized2 = initialized;
                            if (!initialized2) {
                                return false;
                            }
                            break Label_0103;
                        }
                        catch (IllegalArgumentException ex) {
                            throw ex;
                        }
                        try {
                            final ci ci2 = ci;
                            final boolean initialized2;
                            final boolean initialized = initialized2 = ci2.isInitialized();
                            if (!initialized2) {
                                return false;
                            }
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                    if (b) {
                        break;
                    }
                    continue;
                }
            }
            if (!b) {
                return true;
            }
        }
        final V value = entry.getValue();
        Label_0156: {
            try {
                if (!(value instanceof ci)) {
                    break Label_0156;
                }
                final ci ci3 = (ci)value;
                final ci ci4 = ci3;
                final boolean b3 = ci4.isInitialized();
                if (!b3) {
                    return false;
                }
                return true;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            try {
                final ci ci3 = (ci)value;
                final ci ci4 = ci3;
                final boolean b3 = ci4.isInitialized();
                if (!b3) {
                    return false;
                }
                return true;
            }
            catch (IllegalArgumentException ex4) {
                throw ex4;
            }
            try {
                if (value instanceof cQ) {
                    return true;
                }
            }
            catch (IllegalArgumentException ex5) {
                throw ex5;
            }
        }
        throw new IllegalArgumentException(bB.z[8]);
    }
    
    public static bB d() {
        return bB.a;
    }
    
    public static bB j() {
        return new bB();
    }
    
    public Object a(final aK ak, final int n) {
        try {
            if (!ak.b()) {
                throw new IllegalArgumentException(bB.z[4]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final Object c = this.c(ak);
        if (c == null) {
            try {
                throw new IndexOutOfBoundsException();
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return ((List<Object>)c).get(n);
    }
    
    public Map a() {
        final boolean b = dt.b;
        if (this.d) {
            final gh a = gh.a(16);
            int i = 0;
            while (i < this.b.f()) {
                this.a(a, this.b.c(i));
                ++i;
                if (b) {
                    break;
                }
            }
            final Iterator<Map.Entry> iterator = this.b.d().iterator();
            while (iterator.hasNext()) {
                this.a(a, (Map.Entry)iterator.next());
                if (b) {
                    break;
                }
            }
            try {
                if (this.b.c()) {
                    a.a();
                }
                return a;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        try {
            if (this.b.c()) {
                return this.b;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return Collections.unmodifiableMap((Map<?, ?>)this.b);
    }
    
    public void a(final aK p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore_3       
        //     4: aload_1        
        //     5: invokeinterface com/google/aK.b:()Z
        //    10: istore          6
        //    12: iload           6
        //    14: ifeq            162
        //    17: aload_2        
        //    18: instanceof      Ljava/util/List;
        //    21: ifne            48
        //    24: new             Ljava/lang/IllegalArgumentException;
        //    27: dup            
        //    28: getstatic       com/google/bB.z:[Ljava/lang/String;
        //    31: bipush          10
        //    33: aaload         
        //    34: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    37: athrow         
        //    38: astore          5
        //    40: aload           5
        //    42: athrow         
        //    43: astore          4
        //    45: aload           4
        //    47: athrow         
        //    48: new             Ljava/util/ArrayList;
        //    51: dup            
        //    52: invokespecial   java/util/ArrayList.<init>:()V
        //    55: astore          7
        //    57: aload           7
        //    59: aload_2        
        //    60: checkcast       Ljava/util/List;
        //    63: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //    68: pop            
        //    69: aload           7
        //    71: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    76: astore          12
        //    78: aload           12
        //    80: invokeinterface java/util/Iterator.hasNext:()Z
        //    85: ifeq            112
        //    88: aload           12
        //    90: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    95: astore          13
        //    97: aload_1        
        //    98: invokeinterface com/google/aK.e:()Lcom/google/el;
        //   103: aload           13
        //   105: invokestatic    com/google/bB.a:(Lcom/google/el;Ljava/lang/Object;)V
        //   108: iload_3        
        //   109: ifeq            78
        //   112: iload_3        
        //   113: ifeq            127
        //   116: aload_1        
        //   117: invokeinterface com/google/aK.e:()Lcom/google/el;
        //   122: aload           7
        //   124: invokestatic    com/google/bB.a:(Lcom/google/el;Ljava/lang/Object;)V
        //   127: aload           7
        //   129: instanceof      Lcom/google/cQ;
        //   132: ifeq            140
        //   135: aload_0        
        //   136: iconst_1       
        //   137: putfield        com/google/bB.d:Z
        //   140: aload_0        
        //   141: getfield        com/google/bB.b:Lcom/google/gh;
        //   144: aload_1        
        //   145: aload           7
        //   147: invokevirtual   com/google/gh.a:(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
        //   150: pop            
        //   151: return         
        //   152: astore          8
        //   154: aload           8
        //   156: athrow         
        //   157: astore          9
        //   159: aload           9
        //   161: athrow         
        //   162: aload_2        
        //   163: astore          7
        //   165: goto            116
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      12     43     48     Ljava/lang/IllegalArgumentException;
        //  17     38     38     43     Ljava/lang/IllegalArgumentException;
        //  45     48     38     43     Ljava/lang/IllegalArgumentException;
        //  116    127    152    157    Ljava/lang/IllegalArgumentException;
        //  127    140    157    162    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0127:
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
    
    public void a(final bB bb) {
        final boolean b = dt.b;
        int i = 0;
        while (i < bb.b.f()) {
            this.b(bb.b.c(i));
            ++i;
            if (b) {
                break;
            }
        }
        final Iterator<Map.Entry> iterator = bb.b.d().iterator();
        while (iterator.hasNext()) {
            this.b((Map.Entry)iterator.next());
            if (b) {
                break;
            }
        }
    }
    
    public void a(final ep ep) {
        final boolean b = dt.b;
        int i = 0;
        while (i < this.b.f()) {
            this.a(this.b.c(i), ep);
            ++i;
            if (b) {
                break;
            }
        }
        final Iterator<Map.Entry> iterator = this.b.d().iterator();
        while (iterator.hasNext()) {
            this.a((Map.Entry)iterator.next(), ep);
            if (b) {
                break;
            }
        }
    }
    
    public boolean a(final aK ak) {
        try {
            if (ak.b()) {
                throw new IllegalArgumentException(bB.z[11]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.b.get(ak) != null) {
                return true;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public int b(final aK ak) {
        try {
            if (!ak.b()) {
                throw new IllegalArgumentException(bB.z[5]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final Object c = this.c(ak);
        if (c == null) {
            return 0;
        }
        return ((List)c).size();
    }
    
    public void b() {
        try {
            if (this.c) {
                return;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.b.a();
        this.c = true;
    }
    
    public void b(final ep ep) {
        final boolean b = dt.b;
        int n;
        for (int i = 0; i < this.b.f(); i = n) {
            final Map.Entry c = this.b.c(i);
            a(c.getKey(), c.getValue(), ep);
            n = i + 1;
            if (b) {
                break;
            }
        }
        for (final Map.Entry<aK, V> entry : this.b.d()) {
            a(entry.getKey(), entry.getValue(), ep);
            if (b) {
                break;
            }
        }
    }
    
    public int c() {
        int i = 0;
        final boolean b = dt.b;
        int n = 0;
        while (i < this.b.f()) {
            n += this.a(this.b.c(i));
            ++i;
            if (b) {
                break;
            }
        }
        final Iterator<Map.Entry> iterator = this.b.d().iterator();
        while (iterator.hasNext()) {
            n += this.a((Map.Entry)iterator.next());
            if (b) {
                break;
            }
        }
        return n;
    }
    
    public Object c(final aK ak) {
        Object o = this.b.get(ak);
        try {
            if (o instanceof cQ) {
                o = ((cQ)o).c();
            }
            return o;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void c(final aK ak, final Object o) {
        try {
            if (!ak.b()) {
                throw new IllegalArgumentException(bB.z[9]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        a(ak.e(), o);
        final Object c = this.c(ak);
        List<Object> list2 = null;
        Label_0081: {
            if (c == null) {
                final ArrayList<Object> list = new ArrayList<Object>();
                this.b.a(ak, list);
                if (!dt.b) {
                    list2 = list;
                    break Label_0081;
                }
            }
            list2 = (List<Object>)c;
        }
        list2.add(o);
    }
    
    public Object clone() {
        return this.h();
    }
    
    public boolean e() {
        final boolean b = dt.b;
        int n = 0;
        while (true) {
            Label_0050: {
                if (n >= this.b.f()) {
                    break Label_0050;
                }
                try {
                    if (!this.c(this.b.c(n))) {
                        return false;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                ++n;
                if (!b) {
                    continue;
                }
            }
            final Iterator iterator = this.b.d().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    return true;
                }
                final Map.Entry entry = iterator.next();
                try {
                    if (!this.c((Map.Entry)entry)) {
                        return false;
                    }
                    if (b) {
                        return true;
                    }
                    continue;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
    }
    
    public int f() {
        final boolean b = dt.b;
        int i = 0;
        int n = 0;
        while (i < this.b.f()) {
            final Map.Entry c = this.b.c(i);
            n += b(c.getKey(), c.getValue());
            final int n2 = i + 1;
            if (b) {
                break;
            }
            i = n2;
        }
        for (final Map.Entry<aK, V> entry : this.b.d()) {
            n += b(entry.getKey(), entry.getValue());
            if (b) {
                break;
            }
        }
        return n;
    }
    
    public Iterator g() {
        try {
            if (this.d) {
                return new dx(this.b.entrySet().iterator());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.b.entrySet().iterator();
    }
    
    public bB h() {
        final boolean b = dt.b;
        final bB j = j();
        int n;
        for (int i = 0; i < this.b.f(); i = n) {
            final Map.Entry c = this.b.c(i);
            j.a(c.getKey(), c.getValue());
            n = i + 1;
            if (b) {
                break;
            }
        }
        for (final Map.Entry<aK, V> entry : this.b.d()) {
            j.a(entry.getKey(), entry.getValue());
            if (b) {
                break;
            }
        }
        j.d = this.d;
        return j;
    }
    
    public boolean i() {
        return this.c;
    }
}
