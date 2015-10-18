// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes;

import org.spongycastle.util.Arrays;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.BlockCipher;

public class CBCBlockCipher implements BlockCipher
{
    private static final String[] z;
    private byte[] IV;
    private int blockSize;
    private byte[] cbcNextV;
    private byte[] cbcV;
    private BlockCipher cipher;
    private boolean encrypting;
    
    static {
        final String[] z2 = new String[6];
        final char[] charArray = "7=0yQ~15jC;!`xJ1s3dJ,'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '%';
                    break;
                }
                case 0: {
                    c2 = '^';
                    break;
                }
                case 1: {
                    c2 = 'S';
                    break;
                }
                case 2: {
                    c2 = '@';
                    break;
                }
                case 3: {
                    c2 = '\f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "7=0yQ~15jC;!`xJ1s3dJ,'".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '%';
                    break;
                }
                case 0: {
                    c4 = '^';
                    break;
                }
                case 1: {
                    c4 = 'S';
                    break;
                }
                case 2: {
                    c4 = '@';
                    break;
                }
                case 3: {
                    c4 = '\f';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "q\u0010\u0002O".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '%';
                    break;
                }
                case 0: {
                    c6 = '^';
                    break;
                }
                case 1: {
                    c6 = 'S';
                    break;
                }
                case 2: {
                    c6 = '@';
                    break;
                }
                case 3: {
                    c6 = '\f';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "=2.bJ*s#dD04%,@002uU*:.k\u0005-'!x@~$)xM1&4,U,<6eA7=',N;*n".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '%';
                    break;
                }
                case 0: {
                    c8 = '^';
                    break;
                }
                case 1: {
                    c8 = 'S';
                    break;
                }
                case 2: {
                    c8 = '@';
                    break;
                }
                case 3: {
                    c8 = '\f';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "7=)xL??)\u007fD*:/b\u0005(6#xJ,s-yV*s\"i\u0005*;%,V?>%,I;='xM~23,G2<#g\u0005-::i".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '%';
                    break;
                }
                case 0: {
                    c10 = '^';
                    break;
                }
                case 1: {
                    c10 = 'S';
                    break;
                }
                case 2: {
                    c10 = '@';
                    break;
                }
                case 3: {
                    c10 = '\f';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "=2.bJ*s#dD04%,@002uU*:.k\u0005-'!x@~$)xM1&4,U,<6eA7=',N;*n".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '%';
                    break;
                }
                case 0: {
                    c12 = '^';
                    break;
                }
                case 1: {
                    c12 = 'S';
                    break;
                }
                case 2: {
                    c12 = '@';
                    break;
                }
                case 3: {
                    c12 = '\f';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        z = z2;
    }
    
    public CBCBlockCipher(final BlockCipher cipher) {
        this.cipher = null;
        this.cipher = cipher;
        this.blockSize = cipher.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.cbcV = new byte[this.blockSize];
        this.cbcNextV = new byte[this.blockSize];
    }
    
    private int decryptBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        int i = 0;
        final boolean a = SICBlockCipher.a;
        try {
            if (n + this.blockSize > array.length) {
                throw new DataLengthException(CBCBlockCipher.z[1]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        System.arraycopy(array, n, this.cbcNextV, 0, this.blockSize);
        final int processBlock = this.cipher.processBlock(array, n, array2, n2);
        while (i < this.blockSize) {
            final int n3 = n2 + i;
            array2[n3] ^= this.cbcV[i];
            ++i;
            if (a) {
                break;
            }
        }
        final byte[] cbcV = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = cbcV;
        return processBlock;
    }
    
    private int encryptBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        final boolean a = SICBlockCipher.a;
        try {
            if (n + this.blockSize > array.length) {
                throw new DataLengthException(CBCBlockCipher.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        int i = 0;
        while (i < this.blockSize) {
            final byte[] cbcV = this.cbcV;
            cbcV[i] ^= array[n + i];
            ++i;
            if (a) {
                break;
            }
        }
        final int processBlock = this.cipher.processBlock(this.cbcV, 0, array2, n2);
        System.arraycopy(array2, n2, this.cbcV, 0, this.cbcV.length);
        return processBlock;
    }
    
    @Override
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + CBCBlockCipher.z[2];
    }
    
    @Override
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }
    
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
    
    @Override
    public void init(final boolean p0, final CipherParameters p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/modes/SICBlockCipher.a:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/spongycastle/crypto/modes/CBCBlockCipher.encrypting:Z
        //     8: istore          4
        //    10: aload_0        
        //    11: iload_1        
        //    12: putfield        org/spongycastle/crypto/modes/CBCBlockCipher.encrypting:Z
        //    15: aload_2        
        //    16: instanceof      Lorg/spongycastle/crypto/params/ParametersWithIV;
        //    19: ifeq            150
        //    22: aload_2        
        //    23: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //    26: astore          8
        //    28: aload           8
        //    30: invokevirtual   org/spongycastle/crypto/params/ParametersWithIV.getIV:()[B
        //    33: astore          9
        //    35: aload           9
        //    37: arraylength    
        //    38: aload_0        
        //    39: getfield        org/spongycastle/crypto/modes/CBCBlockCipher.blockSize:I
        //    42: if_icmpeq       63
        //    45: new             Ljava/lang/IllegalArgumentException;
        //    48: dup            
        //    49: getstatic       org/spongycastle/crypto/modes/CBCBlockCipher.z:[Ljava/lang/String;
        //    52: iconst_4       
        //    53: aaload         
        //    54: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    57: athrow         
        //    58: astore          10
        //    60: aload           10
        //    62: athrow         
        //    63: aload           9
        //    65: iconst_0       
        //    66: aload_0        
        //    67: getfield        org/spongycastle/crypto/modes/CBCBlockCipher.IV:[B
        //    70: iconst_0       
        //    71: aload           9
        //    73: arraylength    
        //    74: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    77: aload_0        
        //    78: invokevirtual   org/spongycastle/crypto/modes/CBCBlockCipher.reset:()V
        //    81: aload           8
        //    83: invokevirtual   org/spongycastle/crypto/params/ParametersWithIV.getParameters:()Lorg/spongycastle/crypto/CipherParameters;
        //    86: astore          14
        //    88: aload           14
        //    90: ifnull          112
        //    93: aload_0        
        //    94: getfield        org/spongycastle/crypto/modes/CBCBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //    97: iload_1        
        //    98: aload           8
        //   100: invokevirtual   org/spongycastle/crypto/params/ParametersWithIV.getParameters:()Lorg/spongycastle/crypto/CipherParameters;
        //   103: invokeinterface org/spongycastle/crypto/BlockCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   108: iload_3        
        //   109: ifeq            146
        //   112: iload           4
        //   114: iload_1        
        //   115: if_icmpeq       146
        //   118: new             Ljava/lang/IllegalArgumentException;
        //   121: dup            
        //   122: getstatic       org/spongycastle/crypto/modes/CBCBlockCipher.z:[Ljava/lang/String;
        //   125: iconst_3       
        //   126: aaload         
        //   127: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   130: athrow         
        //   131: astore          13
        //   133: aload           13
        //   135: athrow         
        //   136: astore          11
        //   138: aload           11
        //   140: athrow         
        //   141: astore          12
        //   143: aload           12
        //   145: athrow         
        //   146: iload_3        
        //   147: ifeq            207
        //   150: aload_0        
        //   151: invokevirtual   org/spongycastle/crypto/modes/CBCBlockCipher.reset:()V
        //   154: aload_2        
        //   155: ifnull          173
        //   158: aload_0        
        //   159: getfield        org/spongycastle/crypto/modes/CBCBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //   162: iload_1        
        //   163: aload_2        
        //   164: invokeinterface org/spongycastle/crypto/BlockCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   169: iload_3        
        //   170: ifeq            207
        //   173: iload           4
        //   175: iload_1        
        //   176: if_icmpeq       207
        //   179: new             Ljava/lang/IllegalArgumentException;
        //   182: dup            
        //   183: getstatic       org/spongycastle/crypto/modes/CBCBlockCipher.z:[Ljava/lang/String;
        //   186: iconst_5       
        //   187: aaload         
        //   188: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   191: athrow         
        //   192: astore          7
        //   194: aload           7
        //   196: athrow         
        //   197: astore          5
        //   199: aload           5
        //   201: athrow         
        //   202: astore          6
        //   204: aload           6
        //   206: athrow         
        //   207: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  35     58     58     63     Ljava/lang/IllegalArgumentException;
        //  63     88     136    141    Ljava/lang/IllegalArgumentException;
        //  93     108    141    146    Ljava/lang/IllegalArgumentException;
        //  118    131    131    136    Ljava/lang/IllegalArgumentException;
        //  138    141    141    146    Ljava/lang/IllegalArgumentException;
        //  143    146    131    136    Ljava/lang/IllegalArgumentException;
        //  150    154    197    202    Ljava/lang/IllegalArgumentException;
        //  158    169    202    207    Ljava/lang/IllegalArgumentException;
        //  179    192    192    197    Ljava/lang/IllegalArgumentException;
        //  199    202    202    207    Ljava/lang/IllegalArgumentException;
        //  204    207    192    197    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0112:
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
    public int processBlock(final byte[] array, final int n, final byte[] array2, final int n2) {
        try {
            if (this.encrypting) {
                return this.encryptBlock(array, n, array2, n2);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return this.decryptBlock(array, n, array2, n2);
    }
    
    @Override
    public void reset() {
        System.arraycopy(this.IV, 0, this.cbcV, 0, this.IV.length);
        Arrays.fill(this.cbcNextV, (byte)0);
        this.cipher.reset();
    }
}
