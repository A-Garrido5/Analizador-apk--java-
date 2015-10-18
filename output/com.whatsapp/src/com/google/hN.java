// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;

public final class hN implements Cloneable
{
    public static int b;
    private int a;
    private int[] c;
    
    public hN() {
        this.a = 0;
        this.c = new int[1];
    }
    
    public hN(final int a) {
        this.a = a;
        this.c = c(a);
    }
    
    hN(final int[] c, final int a) {
        this.c = c;
        this.a = a;
    }
    
    private static int[] c(final int n) {
        return new int[(n + 31) / 32];
    }
    
    public void a() {
        final int b = hN.b;
        final int[] c = new int[this.c.length];
        final int n = (-1 + this.a) / 32;
        final int n2 = n + 1;
        int i = 0;
        while (i < n2) {
            final long n3 = this.c[i];
            final long n4 = (0x55555555L & n3 >> 1) | (n3 & 0x55555555L) << 1;
            final long n5 = (0x33333333L & n4 >> 2) | (n4 & 0x33333333L) << 2;
            final long n6 = (0xF0F0F0FL & n5 >> 4) | (n5 & 0xF0F0F0FL) << 4;
            final long n7 = (0xFF00FFL & n6 >> 8) | (n6 & 0xFF00FFL) << 8;
            c[n - i] = (int)((0xFFFFL & n7 >> 16) | (n7 & 0xFFFFL) << 16);
            ++i;
            if (b != 0) {
                break;
            }
        }
        if (this.a != n2 * 32) {
            final int n8 = n2 * 32 - this.a;
            int n9 = 1;
            int j = 0;
            while (j < 31 - n8) {
                n9 = (0x1 | n9 << 1);
                ++j;
                if (b != 0) {
                    break;
                }
            }
            int n10 = n9 & c[0] >> n8;
            int k = 1;
            while (k < n2) {
                final int n11 = c[k];
                c[k - 1] = (n10 | n11 << 32 - n8);
                n10 = (n9 & n11 >> n8);
                ++k;
                if (b != 0) {
                    break;
                }
            }
            c[n2 - 1] = n10;
        }
        this.c = c;
    }
    
    public void a(final int n, final int n2) {
        this.c[n / 32] = n2;
    }
    
    public boolean a(final int n) {
        try {
            if ((this.c[n / 32] & 1 << (n & 0x1F)) != 0x0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
    
    public boolean a(final int n, final int n2, final boolean b) {
        final int b2 = hN.b;
        if (n2 < n) {
            try {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        boolean b3 = false;
        Label_0031: {
            if (n2 == n) {
                b3 = true;
            }
            else {
                final int n3 = n2 - 1;
                final int n4 = n / 32;
                final int n5 = n3 / 32;
                int n6 = n4;
            Label_0132_Outer:
                while (true) {
                    if (n6 > n5) {
                        return true;
                    }
                Label_0184_Outer:
                    while (true) {
                        int n7 = 0;
                        int n11 = 0;
                        Label_0084: {
                            while (true) {
                                Label_0073: {
                                    if (n6 > n4) {
                                        n7 = 0;
                                        break Label_0073;
                                    }
                                    int n10 = 0;
                                    Label_0175: {
                                        break Label_0175;
                                        while (true) {
                                            while (true) {
                                                Label_0199: {
                                                    try {
                                                        final int n9;
                                                        final int n8 = this.c[n6] & n9;
                                                        if (!b) {
                                                            break Label_0199;
                                                        }
                                                        b3 = false;
                                                        if (n8 != n9) {
                                                            break Label_0031;
                                                        }
                                                        n10 = n6 + 1;
                                                        if (b2 != 0) {
                                                            return true;
                                                        }
                                                        break;
                                                        n11 = (n3 & 0x1F);
                                                        break Label_0084;
                                                        n7 = (n & 0x1F);
                                                        break Label_0073;
                                                    }
                                                    catch (IllegalArgumentException ex2) {
                                                        throw ex2;
                                                    }
                                                }
                                                final int n9 = 0;
                                                continue Label_0184_Outer;
                                            }
                                        }
                                    }
                                    n6 = n10;
                                    continue Label_0132_Outer;
                                }
                                if (n6 >= n5) {
                                    continue;
                                }
                                break;
                            }
                            n11 = 31;
                        }
                        if (n7 != 0 || n11 != 31 || b2 != 0) {
                            int i = n7;
                            int n9 = 0;
                            while (i <= n11) {
                                n9 |= 1 << i;
                                ++i;
                                if (b2 != 0) {
                                    break;
                                }
                            }
                            continue Label_0184_Outer;
                        }
                        int n9 = -1;
                        continue Label_0184_Outer;
                    }
                }
            }
        }
        return b3;
    }
    
    public int b() {
        return this.a;
    }
    
    public int b(final int n) {
        while (true) {
            final int b = hN.b;
            try {
                if (n >= this.a) {
                    return this.a;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            int n2 = n / 32;
            int i = (-1 ^ this.c[n2]) & (-1 ^ -1 + (1 << (n & 0x1F)));
            while (i == 0) {
                ++n2;
                try {
                    if (n2 == this.c.length) {
                        return this.a;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                i = (-1 ^ this.c[n2]);
                if (b != 0) {
                    break;
                }
            }
            final int a = n2 * 32 + Integer.numberOfTrailingZeros(i);
            try {
                if (a > this.a) {
                    return this.a;
                }
                return a;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
    }
    
    public void c() {
        final int b = hN.b;
        final int length = this.c.length;
        int i = 0;
        while (i < length) {
            this.c[i] = 0;
            ++i;
            if (b != 0) {
                break;
            }
        }
    }
    
    public Object clone() {
        return this.d();
    }
    
    public int d(final int n) {
        while (true) {
            final int b = hN.b;
            try {
                if (n >= this.a) {
                    return this.a;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            int n2 = n / 32;
            int i = this.c[n2] & (-1 ^ -1 + (1 << (n & 0x1F)));
            while (i == 0) {
                ++n2;
                try {
                    if (n2 == this.c.length) {
                        return this.a;
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                i = this.c[n2];
                if (b != 0) {
                    break;
                }
            }
            final int a = n2 * 32 + Integer.numberOfTrailingZeros(i);
            try {
                if (a > this.a) {
                    return this.a;
                }
                return a;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
    }
    
    public hN d() {
        return new hN(this.c.clone(), this.a);
    }
    
    public void e(final int n) {
        final int[] c = this.c;
        final int n2 = n / 32;
        c[n2] |= 1 << (n & 0x1F);
    }
    
    public int[] e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        while (true) {
            try {
                if (!(o instanceof hN)) {
                    return false;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            final hN hn = (hN)o;
            try {
                if (this.a != hn.a) {
                    return false;
                }
                final hN hn2 = this;
                final int[] array = hn2.c;
                final hN hn3 = hn;
                final int[] array2 = hn3.c;
                final boolean b = Arrays.equals(array, array2);
                if (b) {
                    return true;
                }
                return false;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
            try {
                final hN hn2 = this;
                final int[] array = hn2.c;
                final hN hn3 = hn;
                final int[] array2 = hn3.c;
                final boolean b = Arrays.equals(array, array2);
                if (b) {
                    return true;
                }
                return false;
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public int hashCode() {
        return 31 * this.a + Arrays.hashCode(this.c);
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/hN.b:I
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: aload_0        
        //     9: getfield        com/google/hN.a:I
        //    12: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    15: astore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: aload_0        
        //    20: getfield        com/google/hN.a:I
        //    23: if_icmpge       70
        //    26: iload_3        
        //    27: bipush          7
        //    29: iand           
        //    30: ifne            40
        //    33: aload_2        
        //    34: bipush          32
        //    36: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    39: pop            
        //    40: aload_0        
        //    41: iload_3        
        //    42: invokevirtual   com/google/hN.a:(I)Z
        //    45: istore          5
        //    47: iload           5
        //    49: ifeq            85
        //    52: bipush          88
        //    54: istore          6
        //    56: aload_2        
        //    57: iload           6
        //    59: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    62: pop            
        //    63: iinc            3, 1
        //    66: iload_1        
        //    67: ifeq            18
        //    70: aload_2        
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: areturn        
        //    75: astore          8
        //    77: aload           8
        //    79: athrow         
        //    80: astore          4
        //    82: aload           4
        //    84: athrow         
        //    85: bipush          46
        //    87: istore          6
        //    89: goto            56
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  33     40     75     80     Ljava/lang/IllegalArgumentException;
        //  40     47     80     85     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
}
