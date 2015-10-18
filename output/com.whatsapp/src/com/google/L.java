// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;

public final class L implements Cloneable
{
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;
    
    static {
        final String[] z2 = new String[6];
        String s = ">\t";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = ')';
                        break;
                    }
                    case 2: {
                        c2 = ',';
                        break;
                    }
                    case 3: {
                        c2 = '\u0015';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "F\t";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "$FX}V\u0002@Ap\u0018\u0015@C{\u0005FDYf\u0002FKI5\u0011\u0014LMa\u0013\u0014\tX}\u0017\b\t\u001c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ".LEr\u001e\u0012\tM{\u0012F^Eq\u0002\u000e\tA`\u0005\u0012\tNpV\u0007]\fy\u0013\u0007ZX5G";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "2AI5\u0004\u0003NEz\u0018FDYf\u0002FOEaV\u000fG_|\u0012\u0003\tX}\u0013FDMa\u0004\u000fQ";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "*LJaV\u0007GH5\u0002\tY\fx\u0003\u0015]\fw\u0013FGC{\u0018\u0003NMa\u001f\u0010L";
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
    }
    
    public L(final int n) {
        this(n, n);
    }
    
    public L(final int b, final int a) {
        Label_0030: {
            if (b >= 1) {
                if (a >= 1) {
                    break Label_0030;
                }
            }
            try {
                throw new IllegalArgumentException(L.z[2]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.b = b;
        this.a = a;
        this.c = (b + 31) / 32;
        this.d = new int[a * this.c];
    }
    
    private L(final int b, final int a, final int c, final int[] d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return this.a;
    }
    
    public void a(final int n, int i, final int n2, final int n3) {
        final int b = hN.b;
        Label_0031: {
            if (i >= 0) {
                if (n >= 0) {
                    break Label_0031;
                }
            }
            try {
                throw new IllegalArgumentException(L.z[5]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        Label_0060: {
            if (n3 >= 1) {
                if (n2 >= 1) {
                    break Label_0060;
                }
            }
            try {
                throw new IllegalArgumentException(L.z[3]);
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int n4 = n + n2;
        final int n5 = i + n3;
        try {
            Label_0093: {
                if (n5 > this.a) {
                    break Label_0093;
                }
                try {
                    if (n4 > this.b) {
                        throw new IllegalArgumentException(L.z[4]);
                    }
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
        while (i < n5) {
            final int n6 = i * this.c;
            int j = n;
            while (j < n4) {
                final int[] d = this.d;
                final int n7 = n6 + j / 32;
                d[n7] |= 1 << (j & 0x1F);
                ++j;
                if (b != 0) {
                    break;
                }
            }
            ++i;
            if (b != 0) {
                break;
            }
        }
    }
    
    public void a(final int n, final hN hn) {
        System.arraycopy(hn.e(), 0, this.d, n * this.c, this.c);
    }
    
    public boolean a(final int n, final int n2) {
        final int n3 = n2 * this.c + n / 32;
        try {
            if ((0x1 & this.d[n3] >>> (n & 0x1F)) != 0x0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public hN b(final int p0, final hN p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/hN.b:I
        //     3: istore_3       
        //     4: aload_2        
        //     5: ifnull          27
        //     8: aload_2        
        //     9: invokevirtual   com/google/hN.b:()I
        //    12: istore          9
        //    14: aload_0        
        //    15: getfield        com/google/L.b:I
        //    18: istore          10
        //    20: iload           9
        //    22: iload           10
        //    24: if_icmpge       109
        //    27: new             Lcom/google/hN;
        //    30: dup            
        //    31: aload_0        
        //    32: getfield        com/google/L.b:I
        //    35: invokespecial   com/google/hN.<init>:(I)V
        //    38: astore          4
        //    40: iload_3        
        //    41: ifeq            49
        //    44: aload           4
        //    46: invokevirtual   com/google/hN.c:()V
        //    49: iload_1        
        //    50: aload_0        
        //    51: getfield        com/google/L.c:I
        //    54: imul           
        //    55: istore          5
        //    57: iconst_0       
        //    58: istore          6
        //    60: iload           6
        //    62: aload_0        
        //    63: getfield        com/google/L.c:I
        //    66: if_icmpge       96
        //    69: aload           4
        //    71: iload           6
        //    73: bipush          32
        //    75: imul           
        //    76: aload_0        
        //    77: getfield        com/google/L.d:[I
        //    80: iload           5
        //    82: iload           6
        //    84: iadd           
        //    85: iaload         
        //    86: invokevirtual   com/google/hN.a:(II)V
        //    89: iinc            6, 1
        //    92: iload_3        
        //    93: ifeq            60
        //    96: aload           4
        //    98: areturn        
        //    99: astore          8
        //   101: aload           8
        //   103: athrow         
        //   104: astore          7
        //   106: aload           7
        //   108: athrow         
        //   109: aload_2        
        //   110: astore          4
        //   112: goto            44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      20     99     104    Ljava/lang/IllegalArgumentException;
        //  44     49     104    109    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public void b(final int n, final int n2) {
        final int n3 = n2 * this.c + n / 32;
        final int[] d = this.d;
        d[n3] |= 1 << (n & 0x1F);
    }
    
    public int[] b() {
        final int b = hN.b;
        final int b2 = this.b;
        int a = this.a;
        int n = b2;
        int n2 = -1;
        int n3 = -1;
        int i = 0;
        while (i < this.a) {
            int n4 = n;
            int n5 = a;
            int n6 = n2;
            int n7 = n3;
            int j = 0;
            while (j < this.c) {
                final int n8 = this.d[j + i * this.c];
                if (n8 != 0) {
                    if (i < n5) {
                        n5 = i;
                    }
                    if (i > n7) {
                        n7 = i;
                    }
                    if (j * 32 < n4) {
                        int n9 = 0;
                        while (n8 << 31 - n9 == 0) {
                            ++n9;
                            if (b != 0) {
                                break;
                            }
                        }
                        if (n9 + j * 32 < n4) {
                            n4 = n9 + j * 32;
                        }
                    }
                    if (31 + j * 32 > n6) {
                        int n10 = 31;
                        while (n8 >>> n10 == 0) {
                            --n10;
                            if (b != 0) {
                                break;
                            }
                        }
                        if (n10 + j * 32 > n6) {
                            n6 = n10 + j * 32;
                        }
                    }
                }
                ++j;
                if (b != 0) {
                    break;
                }
            }
            n3 = n7;
            n2 = n6;
            a = n5;
            n = n4;
            ++i;
            if (b != 0) {
                break;
            }
        }
        final int n11 = n2 - n;
        final int n12 = n3 - a;
        if (n11 < 0 || n12 < 0) {
            return null;
        }
        return new int[] { n, a, n11, n12 };
    }
    
    public void c(final int n, final int n2) {
        final int n3 = n2 * this.c + n / 32;
        final int[] d = this.d;
        d[n3] ^= 1 << (n & 0x1F);
    }
    
    public int[] c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/hN.b:I
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: iload_2        
        //     7: aload_0        
        //     8: getfield        com/google/L.d:[I
        //    11: arraylength    
        //    12: if_icmpge       35
        //    15: aload_0        
        //    16: getfield        com/google/L.d:[I
        //    19: iload_2        
        //    20: iaload         
        //    21: istore          10
        //    23: iload           10
        //    25: ifne            35
        //    28: iinc            2, 1
        //    31: iload_1        
        //    32: ifeq            6
        //    35: aload_0        
        //    36: getfield        com/google/L.d:[I
        //    39: arraylength    
        //    40: istore          4
        //    42: iload_2        
        //    43: iload           4
        //    45: if_icmpne       58
        //    48: aconst_null    
        //    49: areturn        
        //    50: astore          9
        //    52: aload           9
        //    54: athrow         
        //    55: astore_3       
        //    56: aload_3        
        //    57: athrow         
        //    58: iload_2        
        //    59: aload_0        
        //    60: getfield        com/google/L.c:I
        //    63: idiv           
        //    64: istore          5
        //    66: bipush          32
        //    68: iload_2        
        //    69: aload_0        
        //    70: getfield        com/google/L.c:I
        //    73: irem           
        //    74: imul           
        //    75: istore          6
        //    77: aload_0        
        //    78: getfield        com/google/L.d:[I
        //    81: iload_2        
        //    82: iaload         
        //    83: istore          7
        //    85: iconst_0       
        //    86: istore          8
        //    88: iload           7
        //    90: bipush          31
        //    92: iload           8
        //    94: isub           
        //    95: ishl           
        //    96: ifne            106
        //    99: iinc            8, 1
        //   102: iload_1        
        //   103: ifeq            88
        //   106: iconst_2       
        //   107: newarray        I
        //   109: dup            
        //   110: iconst_0       
        //   111: iload           6
        //   113: iload           8
        //   115: iadd           
        //   116: iastore        
        //   117: dup            
        //   118: iconst_1       
        //   119: iload           5
        //   121: iastore        
        //   122: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  15     23     50     55     Ljava/lang/IllegalArgumentException;
        //  35     42     55     58     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public Object clone() {
        return this.d();
    }
    
    public L d() {
        return new L(this.b, this.a, this.c, this.d.clone());
    }
    
    public int[] e() {
        final int b = hN.b;
        int n = -1 + this.d.length;
    Label_0036_Outer:
        while (true) {
            while (true) {
                if (n >= 0) {
                    try {
                        if (this.d[n] == 0) {
                            --n;
                            if (b == 0) {
                                continue Label_0036_Outer;
                            }
                        }
                        if (n < 0) {
                            return null;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    break;
                }
                continue;
            }
        }
        final int n2 = n / this.c;
        final int n3 = 32 * (n % this.c);
        final int n4 = this.d[n];
        int n5 = 31;
        while (n4 >>> n5 == 0) {
            --n5;
            if (b != 0) {
                break;
            }
        }
        return new int[] { n3 + n5, n2 };
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: instanceof      Lcom/google/L;
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifne            14
        //     9: iconst_0       
        //    10: ireturn        
        //    11: astore_2       
        //    12: aload_2        
        //    13: athrow         
        //    14: aload_1        
        //    15: checkcast       Lcom/google/L;
        //    18: astore          4
        //    20: aload_0        
        //    21: getfield        com/google/L.b:I
        //    24: istore          9
        //    26: aload           4
        //    28: getfield        com/google/L.b:I
        //    31: istore          10
        //    33: iload           9
        //    35: iload           10
        //    37: if_icmpne       9
        //    40: aload_0        
        //    41: getfield        com/google/L.a:I
        //    44: istore          11
        //    46: aload           4
        //    48: getfield        com/google/L.a:I
        //    51: istore          12
        //    53: iload           11
        //    55: iload           12
        //    57: if_icmpne       9
        //    60: aload_0        
        //    61: getfield        com/google/L.c:I
        //    64: istore          13
        //    66: aload           4
        //    68: getfield        com/google/L.c:I
        //    71: istore          14
        //    73: iload           13
        //    75: iload           14
        //    77: if_icmpne       9
        //    80: aload_0        
        //    81: getfield        com/google/L.d:[I
        //    84: aload           4
        //    86: getfield        com/google/L.d:[I
        //    89: invokestatic    java/util/Arrays.equals:([I[I)Z
        //    92: istore          15
        //    94: iload           15
        //    96: ifeq            9
        //    99: iconst_1       
        //   100: ireturn        
        //   101: astore          5
        //   103: aload           5
        //   105: athrow         
        //   106: astore          6
        //   108: aload           6
        //   110: athrow         
        //   111: astore          7
        //   113: aload           7
        //   115: athrow         
        //   116: astore          8
        //   118: aload           8
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      11     14     Ljava/lang/IllegalArgumentException;
        //  20     33     101    106    Ljava/lang/IllegalArgumentException;
        //  40     53     106    111    Ljava/lang/IllegalArgumentException;
        //  60     73     111    116    Ljava/lang/IllegalArgumentException;
        //  80     94     116    121    Ljava/lang/IllegalArgumentException;
        //  103    106    106    111    Ljava/lang/IllegalArgumentException;
        //  108    111    111    116    Ljava/lang/IllegalArgumentException;
        //  113    116    116    121    Ljava/lang/IllegalArgumentException;
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
    
    public void f() {
        final int b = hN.b;
        final int g = this.g();
        final int a = this.a();
        hN b2 = new hN(g);
        hN b3 = new hN(g);
        int i = 0;
        while (i < (a + 1) / 2) {
            b2 = this.b(i, b2);
            b3 = this.b(a - 1 - i, b3);
            b2.a();
            b3.a();
            this.a(i, b3);
            this.a(a - 1 - i, b2);
            ++i;
            if (b != 0) {
                break;
            }
        }
    }
    
    public int g() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * this.b + this.b) + this.a) + this.c) + Arrays.hashCode(this.d);
    }
    
    @Override
    public String toString() {
        final int b = hN.b;
        final StringBuilder sb = new StringBuilder(this.a * (1 + this.b));
        int n = 0;
    Label_0076_Outer:
        while (true) {
            while (true) {
                while (true) {
                    int n2 = 0;
                    Label_0036: {
                        if (n < this.a) {
                            n2 = 0;
                            break Label_0036;
                        }
                        Label_0090: {
                            break Label_0090;
                            while (true) {
                                while (true) {
                                    try {
                                        if (this.a(n2, n)) {
                                            final String s = L.z[0];
                                            sb.append(s);
                                            ++n2;
                                            if (b == 0) {
                                                break;
                                            }
                                            sb.append('\n');
                                            ++n;
                                            if (b != 0) {
                                                return sb.toString();
                                            }
                                            continue Label_0076_Outer;
                                        }
                                    }
                                    catch (IllegalArgumentException ex) {
                                        throw ex;
                                    }
                                    final String s = L.z[1];
                                    continue Label_0076_Outer;
                                }
                            }
                        }
                    }
                    if (n2 < this.b) {
                        continue Label_0076_Outer;
                    }
                    break;
                }
                continue;
            }
        }
    }
}
