// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.UnsupportedEncodingException;
import java.io.OutputStream;

public final class ep
{
    private static final String[] z;
    private final OutputStream a;
    private final int b;
    private final byte[] c;
    private int d;
    
    static {
        final String[] z2 = new String[7];
        final char[] charArray = "65XD C\u000fq\u001d8\u0010\u0014n\u0019w\u0011\u0015{\r6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0018';
                    break;
                }
                case 0: {
                    c2 = 'c';
                    break;
                }
                case 1: {
                    c2 = 'a';
                    break;
                }
                case 2: {
                    c2 = '\u001e';
                    break;
                }
                case 3: {
                    c2 = 'i';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "65XD ".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0018';
                    break;
                }
                case 0: {
                    c4 = 'c';
                    break;
                }
                case 1: {
                    c4 = 'a';
                    break;
                }
                case 2: {
                    c4 = '\u001e';
                    break;
                }
                case 3: {
                    c4 = 'i';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "'\bzIv\f\u0015>\u001ej\n\u0015{Iy\u0010As\u001c{\u000bAz\bl\u0002A\u007f\u001a8\u0006\u0019n\f{\u0017\u0004zG".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0018';
                    break;
                }
                case 0: {
                    c6 = 'c';
                    break;
                }
                case 1: {
                    c6 = 'a';
                    break;
                }
                case 2: {
                    c6 = '\u001e';
                    break;
                }
                case 3: {
                    c6 = 'i';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0010\u0011\u007f\n}/\u0004x\u001d0JA}\bvC\u000ep\u0005aC\u0003{I{\u0002\rr\f|C\u000epI[\f\u0005{\rW\u0016\u0015n\u001cl0\u0015l\fy\u000e\u0012>\u001dp\u0002\u0015>\bj\u0006Ai\u001bq\u0017\bp\u000e8\u0017\u000e>\b8\u0005\r\u007f\u001d8\u0002\u0013l\baM".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0018';
                    break;
                }
                case 0: {
                    c8 = 'c';
                    break;
                }
                case 1: {
                    c8 = 'a';
                    break;
                }
                case 2: {
                    c8 = '\u001e';
                    break;
                }
                case 3: {
                    c8 = 'i';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "65XD ".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0018';
                    break;
                }
                case 0: {
                    c10 = 'c';
                    break;
                }
                case 1: {
                    c10 = 'a';
                    break;
                }
                case 2: {
                    c10 = '\u001e';
                    break;
                }
                case 3: {
                    c10 = 'i';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "0\nw\u00198\u0005\u0000w\u0005}\u0007^>:p\f\u0014r\r8\r\u0004h\fjC\t\u007f\u0019h\u0006\u000f0".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u0018';
                    break;
                }
                case 0: {
                    c12 = 'c';
                    break;
                }
                case 1: {
                    c12 = 'a';
                    break;
                }
                case 2: {
                    c12 = '\u001e';
                    break;
                }
                case 3: {
                    c12 = 'i';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "1\u0004\u007f\r8\u0005\u0000w\u0005}\u0007^>:p\f\u0014r\r8\r\u0004h\fjC\t\u007f\u0019h\u0006\u000f".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u0018';
                    break;
                }
                case 0: {
                    c14 = 'c';
                    break;
                }
                case 1: {
                    c14 = 'a';
                    break;
                }
                case 2: {
                    c14 = '\u001e';
                    break;
                }
                case 3: {
                    c14 = 'i';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        z = z2;
    }
    
    private ep(final byte[] c, final int d, final int n) {
        this.a = null;
        this.c = c;
        this.d = d;
        this.b = d + n;
    }
    
    public static int a(final double n) {
        return 8;
    }
    
    public static int a(final int n, final double n2) {
        return k(n) + a(n2);
    }
    
    public static int a(final int n, final cQ cq) {
        return k(n) + a(cq);
    }
    
    public static int a(final int n, final ci ci) {
        return 2 * k(1) + b(2, n) + f(3, ci);
    }
    
    public static int a(final int n, final hv hv) {
        return 2 * k(1) + b(2, n) + b(3, hv);
    }
    
    public static int a(final int n, final boolean b) {
        return k(n) + a(b);
    }
    
    public static int a(final cQ cq) {
        final int a = cq.a();
        return a + o(a);
    }
    
    public static int a(final ci ci) {
        return ci.getSerializedSize();
    }
    
    public static int a(final hv hv) {
        return o(hv.c()) + hv.c();
    }
    
    public static int a(final boolean b) {
        return 1;
    }
    
    public static int b(final float n) {
        return 4;
    }
    
    public static int b(final int n) {
        return c(n);
    }
    
    public static int b(final int n, final int n2) {
        return k(n) + r(n2);
    }
    
    public static int b(final int n, final cQ cq) {
        return 2 * k(1) + b(2, n) + a(3, cq);
    }
    
    public static int b(final int n, final hv hv) {
        return k(n) + a(hv);
    }
    
    public static int b(final ci ci) {
        final int serializedSize = ci.getSerializedSize();
        return serializedSize + o(serializedSize);
    }
    
    public static int b(final String s) {
        try {
            final byte[] bytes = s.getBytes(ep.z[1]);
            return bytes.length + o(bytes.length);
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ep.z[0], ex);
        }
    }
    
    public static ep b(final byte[] array) {
        return b(array, 0, array.length);
    }
    
    public static ep b(final byte[] array, final int n, final int n2) {
        return new ep(array, n, n2);
    }
    
    private void b() {
        try {
            if (this.a == null) {
                throw new gx();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        this.a.write(this.c, 0, this.d);
        this.d = 0;
    }
    
    public static int c(final int n) {
        if (n >= 0) {
            try {
                return o(n);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        return 10;
    }
    
    public static int c(final int n, final int n2) {
        return k(n) + c(n2);
    }
    
    public static int c(final int n, final ci ci) {
        return 2 * k(n) + a(ci);
    }
    
    public static int c(final long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if ((0xFFFFFFFFFFFFC000L & n) == 0x0L) {
            return 2;
        }
        if ((0xFFFFFFFFFFE00000L & n) == 0x0L) {
            return 3;
        }
        if ((0xFFFFFFFFF0000000L & n) == 0x0L) {
            return 4;
        }
        if ((0xFFFFFFF800000000L & n) == 0x0L) {
            return 5;
        }
        if ((0xFFFFFC0000000000L & n) == 0x0L) {
            return 6;
        }
        if ((0xFFFE000000000000L & n) == 0x0L) {
            return 7;
        }
        if ((0xFF00000000000000L & n) == 0x0L) {
            return 8;
        }
        if ((Long.MIN_VALUE & n) == 0x0L) {
            return 9;
        }
        return 10;
    }
    
    public static int d(final int n, final long n2) {
        return k(n) + m(n2);
    }
    
    public static long d(final long n) {
        return n << 1 ^ n >> 63;
    }
    
    public static int e(final int n, final long n2) {
        return k(n) + k(n2);
    }
    
    public static int e(final long n) {
        return 8;
    }
    
    public static int f(final int n) {
        return n << 1 ^ n >> 31;
    }
    
    public static int f(final int n, final int n2) {
        return k(n) + i(n2);
    }
    
    public static int f(final int n, final long n2) {
        return k(n) + n(n2);
    }
    
    public static int f(final int n, final ci ci) {
        return k(n) + b(ci);
    }
    
    public static int g(final int n) {
        return o(f(n));
    }
    
    public static int h(final int n, final int n2) {
        return k(n) + b(n2);
    }
    
    public static int i(final int n) {
        return 4;
    }
    
    public static int j(final long n) {
        return c(d(n));
    }
    
    public static int k(final int n) {
        return o(cp.a(n, 0));
    }
    
    public static int k(final long n) {
        return c(n);
    }
    
    public static int l(final int n) {
        return 4;
    }
    
    public static int m(final long n) {
        return 8;
    }
    
    public static int n(final long n) {
        return c(n);
    }
    
    public static int o(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((0xF0000000 & n) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int r(final int n) {
        return o(n);
    }
    
    public void a() {
        try {
            if (this.c() != 0) {
                throw new IllegalStateException(ep.z[2]);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public void a(final byte b) {
        try {
            if (this.d == this.b) {
                this.b();
            }
            this.c[this.d++] = b;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public void a(final float n) {
        this.j(Float.floatToRawIntBits(n));
    }
    
    public void a(final int n) {
        this.j(n);
    }
    
    public void a(final int n, final int n2) {
        this.d(n, 0);
        this.e(n2);
    }
    
    public void a(final int n, final long n2) {
        this.d(n, 0);
        this.h(n2);
    }
    
    public void a(final long n) {
        this.g(n);
    }
    
    public void a(final hv p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        com/google/ep.b:I
        //     9: aload_0        
        //    10: getfield        com/google/ep.d:I
        //    13: isub           
        //    14: iload_3        
        //    15: if_icmplt       47
        //    18: aload_1        
        //    19: aload_0        
        //    20: getfield        com/google/ep.c:[B
        //    23: iload_2        
        //    24: aload_0        
        //    25: getfield        com/google/ep.d:I
        //    28: iload_3        
        //    29: invokevirtual   com/google/hv.b:([BIII)V
        //    32: aload_0        
        //    33: iload_3        
        //    34: aload_0        
        //    35: getfield        com/google/ep.d:I
        //    38: iadd           
        //    39: putfield        com/google/ep.d:I
        //    42: iload           4
        //    44: ifeq            269
        //    47: aload_0        
        //    48: getfield        com/google/ep.b:I
        //    51: aload_0        
        //    52: getfield        com/google/ep.d:I
        //    55: isub           
        //    56: istore          6
        //    58: aload_1        
        //    59: aload_0        
        //    60: getfield        com/google/ep.c:[B
        //    63: iload_2        
        //    64: aload_0        
        //    65: getfield        com/google/ep.d:I
        //    68: iload           6
        //    70: invokevirtual   com/google/hv.b:([BIII)V
        //    73: iload_2        
        //    74: iload           6
        //    76: iadd           
        //    77: istore          7
        //    79: iload_3        
        //    80: iload           6
        //    82: isub           
        //    83: istore          8
        //    85: aload_0        
        //    86: aload_0        
        //    87: getfield        com/google/ep.b:I
        //    90: putfield        com/google/ep.d:I
        //    93: aload_0        
        //    94: invokespecial   com/google/ep.b:()V
        //    97: iload           8
        //    99: aload_0        
        //   100: getfield        com/google/ep.b:I
        //   103: if_icmpgt       130
        //   106: aload_1        
        //   107: aload_0        
        //   108: getfield        com/google/ep.c:[B
        //   111: iload           7
        //   113: iconst_0       
        //   114: iload           8
        //   116: invokevirtual   com/google/hv.b:([BIII)V
        //   119: aload_0        
        //   120: iload           8
        //   122: putfield        com/google/ep.d:I
        //   125: iload           4
        //   127: ifeq            269
        //   130: aload_1        
        //   131: invokevirtual   com/google/hv.h:()Ljava/io/InputStream;
        //   134: astore          10
        //   136: iload           7
        //   138: i2l            
        //   139: lstore          11
        //   141: iload           7
        //   143: i2l            
        //   144: lstore          13
        //   146: lload           11
        //   148: aload           10
        //   150: lload           13
        //   152: invokevirtual   java/io/InputStream.skip:(J)J
        //   155: lcmp           
        //   156: ifeq            187
        //   159: new             Ljava/lang/IllegalStateException;
        //   162: dup            
        //   163: getstatic       com/google/ep.z:[Ljava/lang/String;
        //   166: iconst_5       
        //   167: aaload         
        //   168: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   171: athrow         
        //   172: astore          15
        //   174: aload           15
        //   176: athrow         
        //   177: astore          5
        //   179: aload           5
        //   181: athrow         
        //   182: astore          9
        //   184: aload           9
        //   186: athrow         
        //   187: iload           8
        //   189: ifle            269
        //   192: iload           8
        //   194: aload_0        
        //   195: getfield        com/google/ep.b:I
        //   198: invokestatic    java/lang/Math.min:(II)I
        //   201: istore          16
        //   203: aload           10
        //   205: aload_0        
        //   206: getfield        com/google/ep.c:[B
        //   209: iconst_0       
        //   210: iload           16
        //   212: invokevirtual   java/io/InputStream.read:([BII)I
        //   215: istore          17
        //   217: iload           17
        //   219: iload           16
        //   221: if_icmpeq       243
        //   224: new             Ljava/lang/IllegalStateException;
        //   227: dup            
        //   228: getstatic       com/google/ep.z:[Ljava/lang/String;
        //   231: bipush          6
        //   233: aaload         
        //   234: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   237: athrow         
        //   238: astore          18
        //   240: aload           18
        //   242: athrow         
        //   243: aload_0        
        //   244: getfield        com/google/ep.a:Ljava/io/OutputStream;
        //   247: aload_0        
        //   248: getfield        com/google/ep.c:[B
        //   251: iconst_0       
        //   252: iload           17
        //   254: invokevirtual   java/io/OutputStream.write:([BII)V
        //   257: iload           8
        //   259: iload           17
        //   261: isub           
        //   262: istore          8
        //   264: iload           4
        //   266: ifeq            187
        //   269: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      42     177    182    Ljava/lang/RuntimeException;
        //  85     125    182    187    Ljava/lang/RuntimeException;
        //  146    172    172    177    Ljava/lang/RuntimeException;
        //  224    238    238    243    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0130:
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
    
    public void a(final String s) {
        final byte[] bytes = s.getBytes(ep.z[4]);
        this.q(bytes.length);
        this.a(bytes);
    }
    
    public void a(final byte[] array) {
        this.a(array, 0, array.length);
    }
    
    public void a(final byte[] p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/dt.b:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        com/google/ep.b:I
        //     9: aload_0        
        //    10: getfield        com/google/ep.d:I
        //    13: isub           
        //    14: iload_3        
        //    15: if_icmplt       47
        //    18: aload_1        
        //    19: iload_2        
        //    20: aload_0        
        //    21: getfield        com/google/ep.c:[B
        //    24: aload_0        
        //    25: getfield        com/google/ep.d:I
        //    28: iload_3        
        //    29: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    32: aload_0        
        //    33: iload_3        
        //    34: aload_0        
        //    35: getfield        com/google/ep.d:I
        //    38: iadd           
        //    39: putfield        com/google/ep.d:I
        //    42: iload           4
        //    44: ifeq            146
        //    47: aload_0        
        //    48: getfield        com/google/ep.b:I
        //    51: aload_0        
        //    52: getfield        com/google/ep.d:I
        //    55: isub           
        //    56: istore          6
        //    58: aload_1        
        //    59: iload_2        
        //    60: aload_0        
        //    61: getfield        com/google/ep.c:[B
        //    64: aload_0        
        //    65: getfield        com/google/ep.d:I
        //    68: iload           6
        //    70: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    73: iload_2        
        //    74: iload           6
        //    76: iadd           
        //    77: istore          7
        //    79: iload_3        
        //    80: iload           6
        //    82: isub           
        //    83: istore          8
        //    85: aload_0        
        //    86: aload_0        
        //    87: getfield        com/google/ep.b:I
        //    90: putfield        com/google/ep.d:I
        //    93: aload_0        
        //    94: invokespecial   com/google/ep.b:()V
        //    97: aload_0        
        //    98: getfield        com/google/ep.b:I
        //   101: istore          11
        //   103: iload           8
        //   105: iload           11
        //   107: if_icmpgt       134
        //   110: aload_1        
        //   111: iload           7
        //   113: aload_0        
        //   114: getfield        com/google/ep.c:[B
        //   117: iconst_0       
        //   118: iload           8
        //   120: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   123: aload_0        
        //   124: iload           8
        //   126: putfield        com/google/ep.d:I
        //   129: iload           4
        //   131: ifeq            146
        //   134: aload_0        
        //   135: getfield        com/google/ep.a:Ljava/io/OutputStream;
        //   138: aload_1        
        //   139: iload           7
        //   141: iload           8
        //   143: invokevirtual   java/io/OutputStream.write:([BII)V
        //   146: return         
        //   147: astore          5
        //   149: aload           5
        //   151: athrow         
        //   152: astore          9
        //   154: aload           9
        //   156: athrow         
        //   157: astore          10
        //   159: aload           10
        //   161: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  5      42     147    152    Ljava/lang/RuntimeException;
        //  85     103    152    157    Ljava/lang/RuntimeException;
        //  110    129    157    162    Ljava/lang/RuntimeException;
        //  134    146    157    162    Ljava/lang/RuntimeException;
        //  154    157    157    162    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 87, Size: 87
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
    
    public void b(final double n) {
        this.g(Double.doubleToRawLongBits(n));
    }
    
    public void b(final int n, final double n2) {
        this.d(n, 1);
        this.b(n2);
    }
    
    public void b(final int n, final long n2) {
        this.d(n, 0);
        this.i(n2);
    }
    
    public void b(final int n, final ci ci) {
        this.d(n, 3);
        this.d(ci);
        this.d(n, 4);
    }
    
    public void b(final int n, final boolean b) {
        this.d(n, 0);
        this.b(b);
    }
    
    public void b(final long n) {
        this.f(d(n));
    }
    
    public void b(final hv hv) {
        this.q(hv.c());
        this.c(hv);
    }
    
    public void b(final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.d(n);
    }
    
    public int c() {
        try {
            if (this.a == null) {
                return this.b - this.d;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        throw new UnsupportedOperationException(ep.z[3]);
    }
    
    public void c(final int n, final long n2) {
        this.d(n, 1);
        this.a(n2);
    }
    
    public void c(final int n, final hv hv) {
        this.d(n, 2);
        this.b(hv);
    }
    
    public void c(final ci ci) {
        this.q(ci.getSerializedSize());
        ci.writeTo(this);
    }
    
    public void c(final hv hv) {
        this.a(hv, 0, hv.c());
    }
    
    public void d(final int n) {
        this.a((byte)n);
    }
    
    public void d(final int n, final int n2) {
        this.q(cp.a(n, n2));
    }
    
    public void d(final int n, final ci ci) {
        this.d(1, 3);
        this.a(2, n);
        this.e(3, ci);
        this.d(1, 4);
    }
    
    public void d(final int n, final hv hv) {
        this.d(1, 3);
        this.a(2, n);
        this.c(3, hv);
        this.d(1, 4);
    }
    
    public void d(final ci ci) {
        ci.writeTo(this);
    }
    
    public void e(final int n) {
        this.q(n);
    }
    
    public void e(final int n, final int n2) {
        this.d(n, 0);
        this.m(n2);
    }
    
    public void e(final int n, final ci ci) {
        this.d(n, 2);
        this.c(ci);
    }
    
    public void f(long n) {
        while (true) {
            if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
                final int n2 = (int)n;
                try {
                    this.d(n2);
                    return;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            this.d(0x80 | (0x7F & (int)n));
            n >>>= 7;
        }
    }
    
    public void g(final int n, final int n2) {
        this.d(n, 0);
        this.n(n2);
    }
    
    public void g(final long n) {
        this.d(0xFF & (int)n);
        this.d(0xFF & (int)(n >> 8));
        this.d(0xFF & (int)(n >> 16));
        this.d(0xFF & (int)(n >> 24));
        this.d(0xFF & (int)(n >> 32));
        this.d(0xFF & (int)(n >> 40));
        this.d(0xFF & (int)(n >> 48));
        this.d(0xFF & (int)(n >> 56));
    }
    
    public void h(final int n) {
        this.j(n);
    }
    
    public void h(final long n) {
        this.f(n);
    }
    
    public void i(final int n, final int n2) {
        this.d(n, 5);
        this.a(n2);
    }
    
    public void i(final long n) {
        this.f(n);
    }
    
    public void j(final int n) {
        this.d(n & 0xFF);
        this.d(0xFF & n >> 8);
        this.d(0xFF & n >> 16);
        this.d(0xFF & n >> 24);
    }
    
    public void l(final long n) {
        this.g(n);
    }
    
    public void m(final int n) {
        Label_0015: {
            if (n < 0) {
                break Label_0015;
            }
            try {
                this.q(n);
                if (dt.b) {
                    this.f((long)n);
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    public void n(final int n) {
        this.m(n);
    }
    
    public void p(final int n) {
        this.q(f(n));
    }
    
    public void q(int n) {
        while (true) {
            if ((n & 0xFFFFFF80) == 0x0) {
                try {
                    this.d(n);
                    return;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            this.d(0x80 | (n & 0x7F));
            n >>>= 7;
        }
    }
}
