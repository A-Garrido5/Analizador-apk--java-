// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

abstract class L implements at
{
    private static final String z;
    private final V a;
    private e b;
    
    static {
        final char[] charArray = "\u0014]\u001d\\C>]NJZ:]\u000bKQyU\u000fW\u00025]\u0000HV1\u0019".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\"';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '8';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = '/';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected L(final V a, final e b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final e b) {
        this.b = b;
    }
    
    @Override
    public byte[] a() {
        return this.generatePrivateKey(this.a(32));
    }
    
    @Override
    public byte[] a(final int n) {
        final byte[] array = new byte[n];
        this.b.a(array);
        return array;
    }
    
    @Override
    public abstract boolean b();
    
    @Override
    public byte[] calculateAgreement(final byte[] array, final byte[] array2) {
        final byte[] array3 = new byte[32];
        aq.a(array3, array, array2);
        return array3;
    }
    
    @Override
    public byte[] calculateSignature(final byte[] array, final byte[] array2, final byte[] array3) {
        final byte[] array4 = new byte[64];
        try {
            if (o.a(this.a, array4, array2, array3, array3.length, array) != 0) {
                throw new IllegalArgumentException(L.z);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return array4;
    }
    
    @Override
    public byte[] generatePrivateKey(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/whispersystems/curve25519/ai.b:Z
        //     3: istore_2       
        //     4: bipush          32
        //     6: newarray        B
        //     8: astore_3       
        //     9: aload_1        
        //    10: iconst_0       
        //    11: aload_3        
        //    12: iconst_0       
        //    13: bipush          32
        //    15: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    18: aload_3        
        //    19: iconst_0       
        //    20: sipush          248
        //    23: aload_3        
        //    24: iconst_0       
        //    25: baload         
        //    26: iand           
        //    27: i2b            
        //    28: bastore        
        //    29: aload_3        
        //    30: bipush          31
        //    32: bipush          127
        //    34: aload_3        
        //    35: bipush          31
        //    37: baload         
        //    38: iand           
        //    39: i2b            
        //    40: bastore        
        //    41: aload_3        
        //    42: bipush          31
        //    44: bipush          64
        //    46: aload_3        
        //    47: bipush          31
        //    49: baload         
        //    50: ior            
        //    51: i2b            
        //    52: bastore        
        //    53: iload_2        
        //    54: ifeq            75
        //    57: getstatic       org/whispersystems/curve25519/Q.b:Z
        //    60: istore          6
        //    62: iconst_0       
        //    63: istore          7
        //    65: iload           6
        //    67: ifeq            87
        //    70: iload           7
        //    72: putstatic       org/whispersystems/curve25519/Q.b:Z
        //    75: aload_3        
        //    76: areturn        
        //    77: astore          4
        //    79: aload           4
        //    81: athrow         
        //    82: astore          5
        //    84: aload           5
        //    86: athrow         
        //    87: iconst_1       
        //    88: istore          7
        //    90: goto            70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  9      53     77     82     Ljava/lang/IllegalArgumentException;
        //  57     62     82     87     Ljava/lang/IllegalArgumentException;
        //  79     82     82     87     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0070:
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
    
    @Override
    public byte[] generatePublicKey(final byte[] array) {
        final byte[] array2 = new byte[32];
        o.a(array2, array);
        return array2;
    }
    
    @Override
    public boolean verifySignature(final byte[] array, final byte[] array2, final byte[] array3) {
        try {
            if (o.a(this.a, array3, array, array2, array2.length) == 0) {
                return true;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
}
