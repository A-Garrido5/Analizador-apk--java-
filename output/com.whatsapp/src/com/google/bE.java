// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class bE
{
    private static final int[] a;
    private static final bE[] b;
    public static int e;
    private final int c;
    private final int d;
    private final int[] f;
    private final hH[] g;
    
    static {
        a = new int[] { 31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017 };
        b = f();
    }
    
    private bE(final int d, final int[] f, final hH[] g) {
        int i = 0;
        this.d = d;
        this.f = f;
        this.g = g;
        final int b = g[0].b();
        final cf[] a = g[0].a();
        final int length = a.length;
        int c = 0;
        while (i < length) {
            final cf cf = a[i];
            c += cf.b() * (b + cf.a());
            ++i;
        }
        this.c = c;
    }
    
    public static bE a(final int n) {
        if (n % 4 != 1) {
            try {
                throw fD.a();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int n2 = n - 17;
        try {
            return b(n2 / 4);
        }
        catch (IllegalArgumentException ex2) {
            throw fD.a();
        }
    }
    
    public static bE b(final int n) {
        if (n >= 1) {
            if (n <= 40) {
                return bE.b[n - 1];
            }
        }
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return bE.b[n - 1];
    }
    
    static bE c(final int n) {
        int i = 0;
        final int e = bE.e;
        int n2 = Integer.MAX_VALUE;
        int n3 = 0;
        while (i < bE.a.length) {
            final int n4 = bE.a[i];
            if (n4 == n) {
                final int n5 = i + 7;
                try {
                    return b(n5);
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            final int a = bH.a(n, n4);
            if (a < n2) {
                n3 = i + 7;
                n2 = a;
            }
            ++i;
            if (e != 0) {
                break;
            }
        }
        if (n2 <= 3) {
            try {
                return b(n3);
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return null;
    }
    
    private static bE[] f() {
        return new bE[] { new bE(1, new int[0], new hH[] { new hH(7, new cf[] { new cf(1, 19) }), new hH(10, new cf[] { new cf(1, 16) }), new hH(13, new cf[] { new cf(1, 13) }), new hH(17, new cf[] { new cf(1, 9) }) }), new bE(2, new int[] { 6, 18 }, new hH[] { new hH(10, new cf[] { new cf(1, 34) }), new hH(16, new cf[] { new cf(1, 28) }), new hH(22, new cf[] { new cf(1, 22) }), new hH(28, new cf[] { new cf(1, 16) }) }), new bE(3, new int[] { 6, 22 }, new hH[] { new hH(15, new cf[] { new cf(1, 55) }), new hH(26, new cf[] { new cf(1, 44) }), new hH(18, new cf[] { new cf(2, 17) }), new hH(22, new cf[] { new cf(2, 13) }) }), new bE(4, new int[] { 6, 26 }, new hH[] { new hH(20, new cf[] { new cf(1, 80) }), new hH(18, new cf[] { new cf(2, 32) }), new hH(26, new cf[] { new cf(2, 24) }), new hH(16, new cf[] { new cf(4, 9) }) }), new bE(5, new int[] { 6, 30 }, new hH[] { new hH(26, new cf[] { new cf(1, 108) }), new hH(24, new cf[] { new cf(2, 43) }), new hH(18, new cf[] { new cf(2, 15), new cf(2, 16) }), new hH(22, new cf[] { new cf(2, 11), new cf(2, 12) }) }), new bE(6, new int[] { 6, 34 }, new hH[] { new hH(18, new cf[] { new cf(2, 68) }), new hH(16, new cf[] { new cf(4, 27) }), new hH(24, new cf[] { new cf(4, 19) }), new hH(28, new cf[] { new cf(4, 15) }) }), new bE(7, new int[] { 6, 22, 38 }, new hH[] { new hH(20, new cf[] { new cf(2, 78) }), new hH(18, new cf[] { new cf(4, 31) }), new hH(18, new cf[] { new cf(2, 14), new cf(4, 15) }), new hH(26, new cf[] { new cf(4, 13), new cf(1, 14) }) }), new bE(8, new int[] { 6, 24, 42 }, new hH[] { new hH(24, new cf[] { new cf(2, 97) }), new hH(22, new cf[] { new cf(2, 38), new cf(2, 39) }), new hH(22, new cf[] { new cf(4, 18), new cf(2, 19) }), new hH(26, new cf[] { new cf(4, 14), new cf(2, 15) }) }), new bE(9, new int[] { 6, 26, 46 }, new hH[] { new hH(30, new cf[] { new cf(2, 116) }), new hH(22, new cf[] { new cf(3, 36), new cf(2, 37) }), new hH(20, new cf[] { new cf(4, 16), new cf(4, 17) }), new hH(24, new cf[] { new cf(4, 12), new cf(4, 13) }) }), new bE(10, new int[] { 6, 28, 50 }, new hH[] { new hH(18, new cf[] { new cf(2, 68), new cf(2, 69) }), new hH(26, new cf[] { new cf(4, 43), new cf(1, 44) }), new hH(24, new cf[] { new cf(6, 19), new cf(2, 20) }), new hH(28, new cf[] { new cf(6, 15), new cf(2, 16) }) }), new bE(11, new int[] { 6, 30, 54 }, new hH[] { new hH(20, new cf[] { new cf(4, 81) }), new hH(30, new cf[] { new cf(1, 50), new cf(4, 51) }), new hH(28, new cf[] { new cf(4, 22), new cf(4, 23) }), new hH(24, new cf[] { new cf(3, 12), new cf(8, 13) }) }), new bE(12, new int[] { 6, 32, 58 }, new hH[] { new hH(24, new cf[] { new cf(2, 92), new cf(2, 93) }), new hH(22, new cf[] { new cf(6, 36), new cf(2, 37) }), new hH(26, new cf[] { new cf(4, 20), new cf(6, 21) }), new hH(28, new cf[] { new cf(7, 14), new cf(4, 15) }) }), new bE(13, new int[] { 6, 34, 62 }, new hH[] { new hH(26, new cf[] { new cf(4, 107) }), new hH(22, new cf[] { new cf(8, 37), new cf(1, 38) }), new hH(24, new cf[] { new cf(8, 20), new cf(4, 21) }), new hH(22, new cf[] { new cf(12, 11), new cf(4, 12) }) }), new bE(14, new int[] { 6, 26, 46, 66 }, new hH[] { new hH(30, new cf[] { new cf(3, 115), new cf(1, 116) }), new hH(24, new cf[] { new cf(4, 40), new cf(5, 41) }), new hH(20, new cf[] { new cf(11, 16), new cf(5, 17) }), new hH(24, new cf[] { new cf(11, 12), new cf(5, 13) }) }), new bE(15, new int[] { 6, 26, 48, 70 }, new hH[] { new hH(22, new cf[] { new cf(5, 87), new cf(1, 88) }), new hH(24, new cf[] { new cf(5, 41), new cf(5, 42) }), new hH(30, new cf[] { new cf(5, 24), new cf(7, 25) }), new hH(24, new cf[] { new cf(11, 12), new cf(7, 13) }) }), new bE(16, new int[] { 6, 26, 50, 74 }, new hH[] { new hH(24, new cf[] { new cf(5, 98), new cf(1, 99) }), new hH(28, new cf[] { new cf(7, 45), new cf(3, 46) }), new hH(24, new cf[] { new cf(15, 19), new cf(2, 20) }), new hH(30, new cf[] { new cf(3, 15), new cf(13, 16) }) }), new bE(17, new int[] { 6, 30, 54, 78 }, new hH[] { new hH(28, new cf[] { new cf(1, 107), new cf(5, 108) }), new hH(28, new cf[] { new cf(10, 46), new cf(1, 47) }), new hH(28, new cf[] { new cf(1, 22), new cf(15, 23) }), new hH(28, new cf[] { new cf(2, 14), new cf(17, 15) }) }), new bE(18, new int[] { 6, 30, 56, 82 }, new hH[] { new hH(30, new cf[] { new cf(5, 120), new cf(1, 121) }), new hH(26, new cf[] { new cf(9, 43), new cf(4, 44) }), new hH(28, new cf[] { new cf(17, 22), new cf(1, 23) }), new hH(28, new cf[] { new cf(2, 14), new cf(19, 15) }) }), new bE(19, new int[] { 6, 30, 58, 86 }, new hH[] { new hH(28, new cf[] { new cf(3, 113), new cf(4, 114) }), new hH(26, new cf[] { new cf(3, 44), new cf(11, 45) }), new hH(26, new cf[] { new cf(17, 21), new cf(4, 22) }), new hH(26, new cf[] { new cf(9, 13), new cf(16, 14) }) }), new bE(20, new int[] { 6, 34, 62, 90 }, new hH[] { new hH(28, new cf[] { new cf(3, 107), new cf(5, 108) }), new hH(26, new cf[] { new cf(3, 41), new cf(13, 42) }), new hH(30, new cf[] { new cf(15, 24), new cf(5, 25) }), new hH(28, new cf[] { new cf(15, 15), new cf(10, 16) }) }), new bE(21, new int[] { 6, 28, 50, 72, 94 }, new hH[] { new hH(28, new cf[] { new cf(4, 116), new cf(4, 117) }), new hH(26, new cf[] { new cf(17, 42) }), new hH(28, new cf[] { new cf(17, 22), new cf(6, 23) }), new hH(30, new cf[] { new cf(19, 16), new cf(6, 17) }) }), new bE(22, new int[] { 6, 26, 50, 74, 98 }, new hH[] { new hH(28, new cf[] { new cf(2, 111), new cf(7, 112) }), new hH(28, new cf[] { new cf(17, 46) }), new hH(30, new cf[] { new cf(7, 24), new cf(16, 25) }), new hH(24, new cf[] { new cf(34, 13) }) }), new bE(23, new int[] { 6, 30, 54, 78, 102 }, new hH[] { new hH(30, new cf[] { new cf(4, 121), new cf(5, 122) }), new hH(28, new cf[] { new cf(4, 47), new cf(14, 48) }), new hH(30, new cf[] { new cf(11, 24), new cf(14, 25) }), new hH(30, new cf[] { new cf(16, 15), new cf(14, 16) }) }), new bE(24, new int[] { 6, 28, 54, 80, 106 }, new hH[] { new hH(30, new cf[] { new cf(6, 117), new cf(4, 118) }), new hH(28, new cf[] { new cf(6, 45), new cf(14, 46) }), new hH(30, new cf[] { new cf(11, 24), new cf(16, 25) }), new hH(30, new cf[] { new cf(30, 16), new cf(2, 17) }) }), new bE(25, new int[] { 6, 32, 58, 84, 110 }, new hH[] { new hH(26, new cf[] { new cf(8, 106), new cf(4, 107) }), new hH(28, new cf[] { new cf(8, 47), new cf(13, 48) }), new hH(30, new cf[] { new cf(7, 24), new cf(22, 25) }), new hH(30, new cf[] { new cf(22, 15), new cf(13, 16) }) }), new bE(26, new int[] { 6, 30, 58, 86, 114 }, new hH[] { new hH(28, new cf[] { new cf(10, 114), new cf(2, 115) }), new hH(28, new cf[] { new cf(19, 46), new cf(4, 47) }), new hH(28, new cf[] { new cf(28, 22), new cf(6, 23) }), new hH(30, new cf[] { new cf(33, 16), new cf(4, 17) }) }), new bE(27, new int[] { 6, 34, 62, 90, 118 }, new hH[] { new hH(30, new cf[] { new cf(8, 122), new cf(4, 123) }), new hH(28, new cf[] { new cf(22, 45), new cf(3, 46) }), new hH(30, new cf[] { new cf(8, 23), new cf(26, 24) }), new hH(30, new cf[] { new cf(12, 15), new cf(28, 16) }) }), new bE(28, new int[] { 6, 26, 50, 74, 98, 122 }, new hH[] { new hH(30, new cf[] { new cf(3, 117), new cf(10, 118) }), new hH(28, new cf[] { new cf(3, 45), new cf(23, 46) }), new hH(30, new cf[] { new cf(4, 24), new cf(31, 25) }), new hH(30, new cf[] { new cf(11, 15), new cf(31, 16) }) }), new bE(29, new int[] { 6, 30, 54, 78, 102, 126 }, new hH[] { new hH(30, new cf[] { new cf(7, 116), new cf(7, 117) }), new hH(28, new cf[] { new cf(21, 45), new cf(7, 46) }), new hH(30, new cf[] { new cf(1, 23), new cf(37, 24) }), new hH(30, new cf[] { new cf(19, 15), new cf(26, 16) }) }), new bE(30, new int[] { 6, 26, 52, 78, 104, 130 }, new hH[] { new hH(30, new cf[] { new cf(5, 115), new cf(10, 116) }), new hH(28, new cf[] { new cf(19, 47), new cf(10, 48) }), new hH(30, new cf[] { new cf(15, 24), new cf(25, 25) }), new hH(30, new cf[] { new cf(23, 15), new cf(25, 16) }) }), new bE(31, new int[] { 6, 30, 56, 82, 108, 134 }, new hH[] { new hH(30, new cf[] { new cf(13, 115), new cf(3, 116) }), new hH(28, new cf[] { new cf(2, 46), new cf(29, 47) }), new hH(30, new cf[] { new cf(42, 24), new cf(1, 25) }), new hH(30, new cf[] { new cf(23, 15), new cf(28, 16) }) }), new bE(32, new int[] { 6, 34, 60, 86, 112, 138 }, new hH[] { new hH(30, new cf[] { new cf(17, 115) }), new hH(28, new cf[] { new cf(10, 46), new cf(23, 47) }), new hH(30, new cf[] { new cf(10, 24), new cf(35, 25) }), new hH(30, new cf[] { new cf(19, 15), new cf(35, 16) }) }), new bE(33, new int[] { 6, 30, 58, 86, 114, 142 }, new hH[] { new hH(30, new cf[] { new cf(17, 115), new cf(1, 116) }), new hH(28, new cf[] { new cf(14, 46), new cf(21, 47) }), new hH(30, new cf[] { new cf(29, 24), new cf(19, 25) }), new hH(30, new cf[] { new cf(11, 15), new cf(46, 16) }) }), new bE(34, new int[] { 6, 34, 62, 90, 118, 146 }, new hH[] { new hH(30, new cf[] { new cf(13, 115), new cf(6, 116) }), new hH(28, new cf[] { new cf(14, 46), new cf(23, 47) }), new hH(30, new cf[] { new cf(44, 24), new cf(7, 25) }), new hH(30, new cf[] { new cf(59, 16), new cf(1, 17) }) }), new bE(35, new int[] { 6, 30, 54, 78, 102, 126, 150 }, new hH[] { new hH(30, new cf[] { new cf(12, 121), new cf(7, 122) }), new hH(28, new cf[] { new cf(12, 47), new cf(26, 48) }), new hH(30, new cf[] { new cf(39, 24), new cf(14, 25) }), new hH(30, new cf[] { new cf(22, 15), new cf(41, 16) }) }), new bE(36, new int[] { 6, 24, 50, 76, 102, 128, 154 }, new hH[] { new hH(30, new cf[] { new cf(6, 121), new cf(14, 122) }), new hH(28, new cf[] { new cf(6, 47), new cf(34, 48) }), new hH(30, new cf[] { new cf(46, 24), new cf(10, 25) }), new hH(30, new cf[] { new cf(2, 15), new cf(64, 16) }) }), new bE(37, new int[] { 6, 28, 54, 80, 106, 132, 158 }, new hH[] { new hH(30, new cf[] { new cf(17, 122), new cf(4, 123) }), new hH(28, new cf[] { new cf(29, 46), new cf(14, 47) }), new hH(30, new cf[] { new cf(49, 24), new cf(10, 25) }), new hH(30, new cf[] { new cf(24, 15), new cf(46, 16) }) }), new bE(38, new int[] { 6, 32, 58, 84, 110, 136, 162 }, new hH[] { new hH(30, new cf[] { new cf(4, 122), new cf(18, 123) }), new hH(28, new cf[] { new cf(13, 46), new cf(32, 47) }), new hH(30, new cf[] { new cf(48, 24), new cf(14, 25) }), new hH(30, new cf[] { new cf(42, 15), new cf(32, 16) }) }), new bE(39, new int[] { 6, 26, 54, 82, 110, 138, 166 }, new hH[] { new hH(30, new cf[] { new cf(20, 117), new cf(4, 118) }), new hH(28, new cf[] { new cf(40, 47), new cf(7, 48) }), new hH(30, new cf[] { new cf(43, 24), new cf(22, 25) }), new hH(30, new cf[] { new cf(10, 15), new cf(67, 16) }) }), new bE(40, new int[] { 6, 30, 58, 86, 114, 142, 170 }, new hH[] { new hH(30, new cf[] { new cf(19, 118), new cf(6, 119) }), new hH(28, new cf[] { new cf(18, 47), new cf(31, 48) }), new hH(30, new cf[] { new cf(34, 24), new cf(34, 25) }), new hH(30, new cf[] { new cf(20, 15), new cf(61, 16) }) }) };
    }
    
    public int a() {
        return this.c;
    }
    
    public hH a(final e e) {
        return this.g[e.ordinal()];
    }
    
    public int[] b() {
        return this.f;
    }
    
    public int c() {
        return 17 + 4 * this.d;
    }
    
    public int d() {
        return this.d;
    }
    
    L e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   com/google/bE.c:()I
        //     8: istore_2       
        //     9: new             Lcom/google/L;
        //    12: dup            
        //    13: iload_2        
        //    14: invokespecial   com/google/L.<init>:(I)V
        //    17: astore_3       
        //    18: aload_3        
        //    19: iconst_0       
        //    20: iconst_0       
        //    21: bipush          9
        //    23: bipush          9
        //    25: invokevirtual   com/google/L.a:(IIII)V
        //    28: aload_3        
        //    29: iload_2        
        //    30: bipush          8
        //    32: isub           
        //    33: iconst_0       
        //    34: bipush          8
        //    36: bipush          9
        //    38: invokevirtual   com/google/L.a:(IIII)V
        //    41: aload_3        
        //    42: iconst_0       
        //    43: iload_2        
        //    44: bipush          8
        //    46: isub           
        //    47: bipush          9
        //    49: bipush          8
        //    51: invokevirtual   com/google/L.a:(IIII)V
        //    54: aload_0        
        //    55: getfield        com/google/bE.f:[I
        //    58: arraylength    
        //    59: istore          4
        //    61: iconst_0       
        //    62: istore          5
        //    64: iload           5
        //    66: iload           4
        //    68: if_icmpge       165
        //    71: bipush          -2
        //    73: aload_0        
        //    74: getfield        com/google/bE.f:[I
        //    77: iload           5
        //    79: iaload         
        //    80: iadd           
        //    81: istore          9
        //    83: iconst_0       
        //    84: istore          10
        //    86: iload           10
        //    88: iload           4
        //    90: if_icmpge       155
        //    93: iload           5
        //    95: ifne            112
        //    98: iload           10
        //   100: ifeq            148
        //   103: iload           10
        //   105: iload           4
        //   107: iconst_1       
        //   108: isub           
        //   109: if_icmpeq       148
        //   112: iload           5
        //   114: iload           4
        //   116: iconst_1       
        //   117: isub           
        //   118: if_icmpne       130
        //   121: iload           10
        //   123: ifne            130
        //   126: iload_1        
        //   127: ifeq            148
        //   130: aload_3        
        //   131: bipush          -2
        //   133: aload_0        
        //   134: getfield        com/google/bE.f:[I
        //   137: iload           10
        //   139: iaload         
        //   140: iadd           
        //   141: iload           9
        //   143: iconst_5       
        //   144: iconst_5       
        //   145: invokevirtual   com/google/L.a:(IIII)V
        //   148: iinc            10, 1
        //   151: iload_1        
        //   152: ifeq            86
        //   155: iload           5
        //   157: iconst_1       
        //   158: iadd           
        //   159: istore          11
        //   161: iload_1        
        //   162: ifeq            257
        //   165: iload_2        
        //   166: bipush          17
        //   168: isub           
        //   169: istore          6
        //   171: aload_3        
        //   172: bipush          6
        //   174: bipush          9
        //   176: iconst_1       
        //   177: iload           6
        //   179: invokevirtual   com/google/L.a:(IIII)V
        //   182: aload_3        
        //   183: bipush          9
        //   185: bipush          6
        //   187: iload_2        
        //   188: bipush          17
        //   190: isub           
        //   191: iconst_1       
        //   192: invokevirtual   com/google/L.a:(IIII)V
        //   195: aload_0        
        //   196: getfield        com/google/bE.d:I
        //   199: bipush          6
        //   201: if_icmple       228
        //   204: aload_3        
        //   205: iload_2        
        //   206: bipush          11
        //   208: isub           
        //   209: iconst_0       
        //   210: iconst_3       
        //   211: bipush          6
        //   213: invokevirtual   com/google/L.a:(IIII)V
        //   216: aload_3        
        //   217: iconst_0       
        //   218: iload_2        
        //   219: bipush          11
        //   221: isub           
        //   222: bipush          6
        //   224: iconst_3       
        //   225: invokevirtual   com/google/L.a:(IIII)V
        //   228: getstatic       com/google/fN.a:I
        //   231: ifeq            240
        //   234: iload_1        
        //   235: iconst_1       
        //   236: iadd           
        //   237: putstatic       com/google/bE.e:I
        //   240: aload_3        
        //   241: areturn        
        //   242: astore          12
        //   244: aload           12
        //   246: athrow         
        //   247: astore          7
        //   249: aload           7
        //   251: athrow         
        //   252: astore          8
        //   254: aload           8
        //   256: athrow         
        //   257: iload           11
        //   259: istore          5
        //   261: goto            64
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  130    148    242    247    Ljava/lang/IllegalArgumentException;
        //  171    228    247    252    Ljava/lang/IllegalArgumentException;
        //  228    240    252    257    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 149, Size: 149
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
    
    @Override
    public String toString() {
        return String.valueOf(this.d);
    }
}
