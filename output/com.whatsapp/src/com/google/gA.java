// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public final class gA
{
    public static int b;
    private final cO a;
    
    public gA() {
        this.a = new cO(gN.d);
    }
    
    private void a(final byte[] p0, final int p1, final int p2, final int p3, final int p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore          6
        //     3: getstatic       com/google/gA.b:I
        //     6: istore          7
        //     8: iload_3        
        //     9: iload           4
        //    11: iadd           
        //    12: istore          8
        //    14: iload           5
        //    16: ifne            143
        //    19: iconst_1       
        //    20: istore          9
        //    22: iload           8
        //    24: iload           9
        //    26: idiv           
        //    27: newarray        I
        //    29: astore          10
        //    31: iconst_0       
        //    32: istore          11
        //    34: iload           11
        //    36: iload           8
        //    38: if_icmpge       83
        //    41: iload           5
        //    43: ifeq            57
        //    46: iload           11
        //    48: iconst_2       
        //    49: irem           
        //    50: iload           5
        //    52: iconst_1       
        //    53: isub           
        //    54: if_icmpne       75
        //    57: aload           10
        //    59: iload           11
        //    61: iload           9
        //    63: idiv           
        //    64: sipush          255
        //    67: aload_1        
        //    68: iload           11
        //    70: iload_2        
        //    71: iadd           
        //    72: baload         
        //    73: iand           
        //    74: iastore        
        //    75: iinc            11, 1
        //    78: iload           7
        //    80: ifeq            34
        //    83: aload_0        
        //    84: getfield        com/google/gA.a:Lcom/google/cO;
        //    87: aload           10
        //    89: iload           4
        //    91: iload           9
        //    93: idiv           
        //    94: invokevirtual   com/google/cO.a:([II)V
        //    97: iload           6
        //    99: iload_3        
        //   100: if_icmpge       142
        //   103: iload           5
        //   105: ifeq            119
        //   108: iload           6
        //   110: iconst_2       
        //   111: irem           
        //   112: iload           5
        //   114: iconst_1       
        //   115: isub           
        //   116: if_icmpne       134
        //   119: aload_1        
        //   120: iload           6
        //   122: iload_2        
        //   123: iadd           
        //   124: aload           10
        //   126: iload           6
        //   128: iload           9
        //   130: idiv           
        //   131: iaload         
        //   132: i2b            
        //   133: bastore        
        //   134: iinc            6, 1
        //   137: iload           7
        //   139: ifeq            97
        //   142: return         
        //   143: iconst_2       
        //   144: istore          9
        //   146: goto            22
        //   149: astore          14
        //   151: aload           14
        //   153: athrow         
        //   154: astore          12
        //   156: invokestatic    com/google/fh.a:()Lcom/google/fh;
        //   159: athrow         
        //   160: astore          13
        //   162: aload           13
        //   164: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  57     75     149    154    Lcom/google/dA;
        //  83     97     154    160    Lcom/google/dA;
        //  119    134    160    165    Lcom/google/dA;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
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
    
    public aS a(final L l, final Map map) {
        final int b = gA.b;
        final byte[] a = new b(l).a();
        this.a(a, 0, 10, 10, 0);
        final byte b2 = (byte)(0xF & a[0]);
        byte[] array = null;
        Label_0156: {
            Label_0120: {
                switch (b2) {
                    case 2:
                    case 3:
                    case 4: {
                        this.a(a, 20, 84, 40, 1);
                        this.a(a, 20, 84, 40, 2);
                        array = new byte[94];
                        if (b != 0) {
                            ++fN.a;
                            break Label_0120;
                        }
                        break Label_0156;
                    }
                    case 5: {
                        this.a(a, 20, 68, 56, 1);
                        this.a(a, 20, 68, 56, 2);
                        array = new byte[78];
                        if (b == 0) {
                            break Label_0156;
                        }
                        break;
                    }
                }
            }
            throw fD.a();
        }
        System.arraycopy(a, 0, array, 0, 10);
        System.arraycopy(a, 20, array, 10, -10 + array.length);
        return cg.a(array, b2);
    }
}
