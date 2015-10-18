// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;

public final class a7
{
    private static final String[] z;
    private final int a;
    private final String b;
    private final c_ c;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0014\u000eoOYg\u0013`YH?ZcH^3ZlX\ryG.\r\u0003";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = 'z';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0017\u0012aSH\t\u000fc_H57oIN/ZU";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "nZ";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a7(final int a, final String b, final c_ c) {
        if (a < 0) {
            throw new IllegalArgumentException(a7.z[0]);
        }
        Label_0042: {
            if (b != null) {
                if (c != null) {
                    break Label_0042;
                }
            }
            try {
                throw new NullPointerException();
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.a + this.b.length();
    }
    
    public int b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: if_acmpne       7
        //     5: iconst_1       
        //     6: ireturn        
        //     7: aload_1        
        //     8: instanceof      Lcom/google/a7;
        //    11: istore_3       
        //    12: iload_3        
        //    13: ifne            21
        //    16: iconst_0       
        //    17: ireturn        
        //    18: astore_2       
        //    19: aload_2        
        //    20: athrow         
        //    21: aload_1        
        //    22: checkcast       Lcom/google/a7;
        //    25: astore          4
        //    27: aload_0        
        //    28: getfield        com/google/a7.b:Ljava/lang/String;
        //    31: aload           4
        //    33: getfield        com/google/a7.b:Ljava/lang/String;
        //    36: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    39: istore          8
        //    41: iload           8
        //    43: ifeq            85
        //    46: aload_0        
        //    47: getfield        com/google/a7.a:I
        //    50: istore          9
        //    52: aload           4
        //    54: getfield        com/google/a7.a:I
        //    57: istore          10
        //    59: iload           9
        //    61: iload           10
        //    63: if_icmpne       85
        //    66: aload_0        
        //    67: getfield        com/google/a7.c:Lcom/google/c_;
        //    70: aload           4
        //    72: getfield        com/google/a7.c:Lcom/google/c_;
        //    75: invokevirtual   com/google/c_.equals:(Ljava/lang/Object;)Z
        //    78: istore          11
        //    80: iload           11
        //    82: ifne            5
        //    85: iconst_0       
        //    86: ireturn        
        //    87: astore          5
        //    89: aload           5
        //    91: athrow         
        //    92: astore          6
        //    94: aload           6
        //    96: athrow         
        //    97: astore          7
        //    99: aload           7
        //   101: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      12     18     21     Ljava/lang/IllegalArgumentException;
        //  27     41     87     92     Ljava/lang/IllegalArgumentException;
        //  46     59     92     97     Ljava/lang/IllegalArgumentException;
        //  66     80     97     102    Ljava/lang/IllegalArgumentException;
        //  89     92     92     97     Ljava/lang/IllegalArgumentException;
        //  94     97     97     102    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 54, Size: 54
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
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public String toString() {
        return a7.z[1] + this.b() + "," + this.a() + a7.z[2] + this.b;
    }
}
