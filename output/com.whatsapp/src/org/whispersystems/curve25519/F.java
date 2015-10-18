// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class F implements V
{
    private static final String z;
    
    static {
        final char[] charArray = "7,101UV".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0004';
                    break;
                }
                case 0: {
                    c2 = 'd';
                    break;
                }
                case 1: {
                    c2 = 'd';
                    break;
                }
                case 2: {
                    c2 = 'p';
                    break;
                }
                case 3: {
                    c2 = '\u001d';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public void a(final byte[] p0, final byte[] p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/curve25519/ai.b:Z
        //     3: istore          5
        //     5: getstatic       org/whispersystems/curve25519/F.z:Ljava/lang/String;
        //     8: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //    11: astore          7
        //    13: aload           7
        //    15: aload_2        
        //    16: iconst_0       
        //    17: lload_3        
        //    18: l2i            
        //    19: invokevirtual   java/security/MessageDigest.update:([BII)V
        //    22: aload           7
        //    24: invokevirtual   java/security/MessageDigest.digest:()[B
        //    27: astore          8
        //    29: aload           8
        //    31: iconst_0       
        //    32: aload_1        
        //    33: iconst_0       
        //    34: aload           8
        //    36: arraylength    
        //    37: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    40: getstatic       org/whispersystems/curve25519/Q.b:Z
        //    43: istore          11
        //    45: iload           11
        //    47: ifeq            63
        //    50: iconst_0       
        //    51: istore          12
        //    53: iload           5
        //    55: ifeq            86
        //    58: iload           12
        //    60: putstatic       org/whispersystems/curve25519/ai.b:Z
        //    63: return         
        //    64: astore          6
        //    66: new             Ljava/lang/AssertionError;
        //    69: dup            
        //    70: aload           6
        //    72: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //    75: athrow         
        //    76: astore          9
        //    78: aload           9
        //    80: athrow         
        //    81: astore          10
        //    83: aload           10
        //    85: athrow         
        //    86: iconst_1       
        //    87: istore          12
        //    89: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  5      40     64     76     Ljava/security/NoSuchAlgorithmException;
        //  40     45     76     86     Ljava/security/NoSuchAlgorithmException;
        //  78     81     81     86     Ljava/security/NoSuchAlgorithmException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
