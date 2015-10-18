// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;

public final class e
{
    static final String a;
    static final String b;
    
    static {
        a = String.valueOf(Long.MIN_VALUE).substring(1);
        b = String.valueOf(Long.MAX_VALUE);
    }
    
    public static double a(final String s) {
        if ("2.2250738585072012e-308".equals(s)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(s);
    }
    
    public static double a(final String s, final double n) {
        if (s != null) {
            final String trim = s.trim();
            if (trim.length() != 0) {
                try {
                    return a(trim);
                }
                catch (NumberFormatException ex) {
                    return n;
                }
            }
        }
        return n;
    }
    
    public static int a(final String p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: aload_0        
        //     3: ifnonnull       8
        //     6: iload_1        
        //     7: ireturn        
        //     8: aload_0        
        //     9: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    12: astore_3       
        //    13: aload_3        
        //    14: invokevirtual   java/lang/String.length:()I
        //    17: istore          4
        //    19: iload           4
        //    21: ifeq            6
        //    24: iload           4
        //    26: ifge            139
        //    29: aload_3        
        //    30: iconst_0       
        //    31: invokevirtual   java/lang/String.charAt:(I)C
        //    34: istore          13
        //    36: iload           13
        //    38: bipush          43
        //    40: if_icmpne       96
        //    43: aload_3        
        //    44: iconst_1       
        //    45: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    48: astore          6
        //    50: aload           6
        //    52: invokevirtual   java/lang/String.length:()I
        //    55: istore          5
        //    57: iload_2        
        //    58: iload           5
        //    60: if_icmpge       121
        //    63: aload           6
        //    65: iload_2        
        //    66: invokevirtual   java/lang/String.charAt:(I)C
        //    69: istore          9
        //    71: iload           9
        //    73: bipush          57
        //    75: if_icmpgt       85
        //    78: iload           9
        //    80: bipush          48
        //    82: if_icmpge       115
        //    85: aload           6
        //    87: invokestatic    com/fasterxml/jackson/core/io/e.a:(Ljava/lang/String;)D
        //    90: dstore          11
        //    92: dload           11
        //    94: d2i            
        //    95: ireturn        
        //    96: iload           13
        //    98: bipush          45
        //   100: if_icmpne       139
        //   103: iconst_1       
        //   104: istore_2       
        //   105: iload           4
        //   107: istore          5
        //   109: aload_3        
        //   110: astore          6
        //   112: goto            57
        //   115: iinc            2, 1
        //   118: goto            57
        //   121: aload           6
        //   123: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   126: istore          8
        //   128: iload           8
        //   130: ireturn        
        //   131: astore          10
        //   133: iload_1        
        //   134: ireturn        
        //   135: astore          7
        //   137: iload_1        
        //   138: ireturn        
        //   139: iload           4
        //   141: istore          5
        //   143: aload_3        
        //   144: astore          6
        //   146: iconst_0       
        //   147: istore_2       
        //   148: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  85     92     131    135    Ljava/lang/NumberFormatException;
        //  121    128    135    139    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
    
    public static int a(final char[] array, int n, int n2) {
        int n3 = -48 + array[n];
        Label_0182: {
            if (n2 <= 4) {
                break Label_0182;
            }
            final int n4 = n3 * 10;
            final int n5 = n + 1;
            final int n6 = 10 * (n4 + (-48 + array[n5]));
            final int n7 = n5 + 1;
            final int n8 = 10 * (n6 + (-48 + array[n7]));
            final int n9 = n7 + 1;
            final int n10 = 10 * (n8 + (-48 + array[n9]));
            n = n9 + 1;
            n3 = n10 + (-48 + array[n]);
            n2 -= 4;
            if (n2 <= 4) {
                break Label_0182;
            }
            final int n11 = n3 * 10;
            final int n12 = n + 1;
            final int n13 = 10 * (n11 + (-48 + array[n12]));
            final int n14 = n12 + 1;
            final int n15 = 10 * (n13 + (-48 + array[n14]));
            final int n16 = n14 + 1;
            n3 = 10 * (n15 + (-48 + array[n16])) + (-48 + array[n16 + 1]);
            return n3;
        }
        if (n2 <= 1) {
            return n3;
        }
        final int n17 = n3 * 10;
        final int n18 = n + 1;
        n3 = n17 + (-48 + array[n18]);
        if (n2 <= 2) {
            return n3;
        }
        final int n19 = n3 * 10;
        final int n20 = n18 + 1;
        n3 = n19 + (-48 + array[n20]);
        if (n2 > 3) {
            return n3 * 10 + (-48 + array[n20 + 1]);
        }
        return n3;
    }
    
    public static long a(final String p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_3       
        //     2: aload_0        
        //     3: ifnonnull       8
        //     6: lload_1        
        //     7: lreturn        
        //     8: aload_0        
        //     9: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    12: astore          4
        //    14: aload           4
        //    16: invokevirtual   java/lang/String.length:()I
        //    19: istore          5
        //    21: iload           5
        //    23: ifeq            6
        //    26: iload           5
        //    28: ifge            144
        //    31: aload           4
        //    33: iconst_0       
        //    34: invokevirtual   java/lang/String.charAt:(I)C
        //    37: istore          15
        //    39: iload           15
        //    41: bipush          43
        //    43: if_icmpne       100
        //    46: aload           4
        //    48: iconst_1       
        //    49: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    52: astore          7
        //    54: aload           7
        //    56: invokevirtual   java/lang/String.length:()I
        //    59: istore          6
        //    61: iload_3        
        //    62: iload           6
        //    64: if_icmpge       126
        //    67: aload           7
        //    69: iload_3        
        //    70: invokevirtual   java/lang/String.charAt:(I)C
        //    73: istore          11
        //    75: iload           11
        //    77: bipush          57
        //    79: if_icmpgt       89
        //    82: iload           11
        //    84: bipush          48
        //    86: if_icmpge       120
        //    89: aload           7
        //    91: invokestatic    com/fasterxml/jackson/core/io/e.a:(Ljava/lang/String;)D
        //    94: dstore          13
        //    96: dload           13
        //    98: d2l            
        //    99: lreturn        
        //   100: iload           15
        //   102: bipush          45
        //   104: if_icmpne       144
        //   107: iconst_1       
        //   108: istore_3       
        //   109: iload           5
        //   111: istore          6
        //   113: aload           4
        //   115: astore          7
        //   117: goto            61
        //   120: iinc            3, 1
        //   123: goto            61
        //   126: aload           7
        //   128: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   131: lstore          9
        //   133: lload           9
        //   135: lreturn        
        //   136: astore          12
        //   138: lload_1        
        //   139: lreturn        
        //   140: astore          8
        //   142: lload_1        
        //   143: lreturn        
        //   144: iload           5
        //   146: istore          6
        //   148: aload           4
        //   150: astore          7
        //   152: iconst_0       
        //   153: istore_3       
        //   154: goto            61
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  89     96     136    140    Ljava/lang/NumberFormatException;
        //  126    133    140    144    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0126:
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
    
    public static BigDecimal a(final char[] array) {
        return c(array, 0, array.length);
    }
    
    public static boolean a(final char[] array, final int n, final int n2, final boolean b) {
        String s;
        if (b) {
            s = e.a;
        }
        else {
            s = e.b;
        }
        final int length = s.length();
        if (n2 >= length) {
            if (n2 > length) {
                return false;
            }
            for (int i = 0; i < length; ++i) {
                final char c = (char)(array[n + i] - s.charAt(i));
                if (c != '\0') {
                    return c < '\0';
                }
            }
        }
        return true;
    }
    
    public static long b(final char[] array, final int n, final int n2) {
        final int n3 = n2 - 9;
        return 1000000000L * a(array, n, n3) + a(array, n3 + n, 9);
    }
    
    private static NumberFormatException b(final String s) {
        return new NumberFormatException("Value \"" + s + "\" can not be represented as BigDecimal");
    }
    
    public static BigDecimal c(final char[] array, final int n, final int n2) {
        try {
            return new BigDecimal(array, n, n2);
        }
        catch (NumberFormatException ex) {
            throw b(new String(array, n, n2));
        }
    }
}
