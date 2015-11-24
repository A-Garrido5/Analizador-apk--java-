// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.paddings;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.crypto.OutputLengthException;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;

public class PaddedBufferedBlockCipher extends BufferedBlockCipher
{
    public static int a;
    private static final String[] z;
    BlockCipherPadding padding;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "]\u0000Jg=S\rVpv\u0011\bWpr\\\u0011UviTAP}=U\u0004ZadA\u0015P|s".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001d';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = 'a';
                    break;
                }
                case 2: {
                    c2 = '9';
                    break;
                }
                case 3: {
                    c2 = '\u0013';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "^\u0014MchEA[f{W\u0004K3i^\u000e\u0019`u^\u0013M".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u001d';
                    break;
                }
                case 0: {
                    c4 = '1';
                    break;
                }
                case 1: {
                    c4 = 'a';
                    break;
                }
                case 2: {
                    c4 = '9';
                    break;
                }
                case 3: {
                    c4 = '\u0013';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "r\u0000W4i\u0011\tXex\u0011\u0000\u0019}xV\u0000MzkTAP}mD\u0015\u0019\u007fx_\u0006M{<".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u001d';
                    break;
                }
                case 0: {
                    c6 = '1';
                    break;
                }
                case 1: {
                    c6 = 'a';
                    break;
                }
                case 2: {
                    c6 = '9';
                    break;
                }
                case 3: {
                    c6 = '\u0013';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "^\u0014MchEA[f{W\u0004K3i^\u000e\u0019`u^\u0013M".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u001d';
                    break;
                }
                case 0: {
                    c8 = '1';
                    break;
                }
                case 1: {
                    c8 = 'a';
                    break;
                }
                case 2: {
                    c8 = '9';
                    break;
                }
                case 3: {
                    c8 = '\u0013';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
    }
    
    public PaddedBufferedBlockCipher(final BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }
    
    public PaddedBufferedBlockCipher(final BlockCipher cipher, final BlockCipherPadding padding) {
        this.cipher = cipher;
        this.padding = padding;
        this.buf = new byte[cipher.getBlockSize()];
        this.bufOff = 0;
    }
    
    @Override
    public int doFinal(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //     8: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //    13: istore          4
        //    15: aload_0        
        //    16: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.forEncryption:Z
        //    19: ifeq            159
        //    22: aload_0        
        //    23: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.bufOff:I
        //    26: istore          15
        //    28: iload           15
        //    30: iload           4
        //    32: if_icmpne       292
        //    35: iload_2        
        //    36: iload           4
        //    38: iconst_2       
        //    39: imul           
        //    40: iadd           
        //    41: istore          18
        //    43: aload_1        
        //    44: arraylength    
        //    45: istore          19
        //    47: iload           18
        //    49: iload           19
        //    51: if_icmple       86
        //    54: aload_0        
        //    55: invokevirtual   org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.reset:()V
        //    58: new             Lorg/spongycastle/crypto/OutputLengthException;
        //    61: dup            
        //    62: getstatic       org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.z:[Ljava/lang/String;
        //    65: iconst_1       
        //    66: aaload         
        //    67: invokespecial   org/spongycastle/crypto/OutputLengthException.<init>:(Ljava/lang/String;)V
        //    70: athrow         
        //    71: astore          7
        //    73: aload           7
        //    75: athrow         
        //    76: astore          5
        //    78: aload           5
        //    80: athrow         
        //    81: astore          6
        //    83: aload           6
        //    85: athrow         
        //    86: aload_0        
        //    87: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //    90: aload_0        
        //    91: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //    94: iconst_0       
        //    95: aload_1        
        //    96: iload_2        
        //    97: invokeinterface org/spongycastle/crypto/BlockCipher.processBlock:([BI[BI)I
        //   102: istore          16
        //   104: aload_0        
        //   105: iconst_0       
        //   106: putfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.bufOff:I
        //   109: aload_0        
        //   110: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.padding:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;
        //   113: aload_0        
        //   114: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //   117: aload_0        
        //   118: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.bufOff:I
        //   121: invokeinterface org/spongycastle/crypto/paddings/BlockCipherPadding.addPadding:([BI)I
        //   126: pop            
        //   127: iload           16
        //   129: aload_0        
        //   130: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //   133: aload_0        
        //   134: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //   137: iconst_0       
        //   138: aload_1        
        //   139: iload_2        
        //   140: iload           16
        //   142: iadd           
        //   143: invokeinterface org/spongycastle/crypto/BlockCipher.processBlock:([BI[BI)I
        //   148: iadd           
        //   149: istore          13
        //   151: aload_0        
        //   152: invokevirtual   org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.reset:()V
        //   155: iload_3        
        //   156: ifeq            263
        //   159: aload_0        
        //   160: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.bufOff:I
        //   163: istore          9
        //   165: iload           9
        //   167: iload           4
        //   169: if_icmpne       202
        //   172: aload_0        
        //   173: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //   176: aload_0        
        //   177: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //   180: iconst_0       
        //   181: aload_0        
        //   182: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //   185: iconst_0       
        //   186: invokeinterface org/spongycastle/crypto/BlockCipher.processBlock:([BI[BI)I
        //   191: istore          11
        //   193: aload_0        
        //   194: iconst_0       
        //   195: putfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.bufOff:I
        //   198: iload_3        
        //   199: ifeq            229
        //   202: aload_0        
        //   203: invokevirtual   org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.reset:()V
        //   206: new             Lorg/spongycastle/crypto/DataLengthException;
        //   209: dup            
        //   210: getstatic       org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.z:[Ljava/lang/String;
        //   213: iconst_0       
        //   214: aaload         
        //   215: invokespecial   org/spongycastle/crypto/DataLengthException.<init>:(Ljava/lang/String;)V
        //   218: athrow         
        //   219: astore          10
        //   221: aload           10
        //   223: athrow         
        //   224: astore          8
        //   226: aload           8
        //   228: athrow         
        //   229: iload           11
        //   231: aload_0        
        //   232: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.padding:Lorg/spongycastle/crypto/paddings/BlockCipherPadding;
        //   235: aload_0        
        //   236: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //   239: invokeinterface org/spongycastle/crypto/paddings/BlockCipherPadding.padCount:([B)I
        //   244: isub           
        //   245: istore          13
        //   247: aload_0        
        //   248: getfield        org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.buf:[B
        //   251: iconst_0       
        //   252: aload_1        
        //   253: iload_2        
        //   254: iload           13
        //   256: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   259: aload_0        
        //   260: invokevirtual   org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.reset:()V
        //   263: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   266: ifeq            275
        //   269: iload_3        
        //   270: iconst_1       
        //   271: iadd           
        //   272: putstatic       org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.a:I
        //   275: iload           13
        //   277: ireturn        
        //   278: astore          12
        //   280: aload_0        
        //   281: invokevirtual   org/spongycastle/crypto/paddings/PaddedBufferedBlockCipher.reset:()V
        //   284: aload           12
        //   286: athrow         
        //   287: astore          14
        //   289: aload           14
        //   291: athrow         
        //   292: iconst_0       
        //   293: istore          16
        //   295: goto            109
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  15     28     76     81     Ljava/lang/IllegalArgumentException;
        //  43     47     81     86     Ljava/lang/IllegalArgumentException;
        //  54     71     71     76     Ljava/lang/IllegalArgumentException;
        //  78     81     81     86     Ljava/lang/IllegalArgumentException;
        //  83     86     71     76     Ljava/lang/IllegalArgumentException;
        //  151    155    224    229    Ljava/lang/IllegalArgumentException;
        //  159    165    224    229    Ljava/lang/IllegalArgumentException;
        //  193    198    219    224    Ljava/lang/IllegalArgumentException;
        //  202    219    219    224    Ljava/lang/IllegalArgumentException;
        //  229    259    278    287    Any
        //  263    275    287    292    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0263:
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
    public int getOutputSize(final int n) {
        int n2 = n + this.bufOff;
        final int n3 = n2 % this.buf.length;
        if (n3 == 0) {
            try {
                if (this.forEncryption) {
                    n2 += this.buf.length;
                }
                return n2;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return n2 - n3 + this.buf.length;
    }
    
    @Override
    public int getUpdateOutputSize(final int n) {
        final int n2 = n + this.bufOff;
        final int n3 = n2 % this.buf.length;
        if (n3 == 0) {
            try {
                return Math.max(0, n2 - this.buf.length);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        return n2 - n3;
    }
    
    @Override
    public void init(final boolean forEncryption, final CipherParameters cipherParameters) {
        this.forEncryption = forEncryption;
        this.reset();
        Label_0057: {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                break Label_0057;
            }
            final ParametersWithRandom parametersWithRandom = (ParametersWithRandom)cipherParameters;
            try {
                this.padding.init(parametersWithRandom.getRandom());
                this.cipher.init(forEncryption, parametersWithRandom.getParameters());
                if (PaddedBufferedBlockCipher.a != 0) {
                    this.padding.init(null);
                    this.cipher.init(forEncryption, cipherParameters);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public int processByte(final byte b, final byte[] array, final int n) {
        int processBlock;
        if (this.bufOff == this.buf.length) {
            processBlock = this.cipher.processBlock(this.buf, 0, array, n);
            this.bufOff = 0;
        }
        else {
            processBlock = 0;
        }
        this.buf[this.bufOff++] = b;
        return processBlock;
    }
    
    @Override
    public int processBytes(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        final int a = PaddedBufferedBlockCipher.a;
        if (n2 < 0) {
            try {
                throw new IllegalArgumentException(PaddedBufferedBlockCipher.z[2]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        final int blockSize = this.getBlockSize();
        final int updateOutputSize = this.getUpdateOutputSize(n2);
        if (updateOutputSize > 0) {
            final int n4 = updateOutputSize + n3;
            try {
                if (n4 > array2.length) {
                    throw new OutputLengthException(PaddedBufferedBlockCipher.z[3]);
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        final int n5 = this.buf.length - this.bufOff;
        Label_0221: {
            int n6 = 0;
            int i = 0;
            int n7 = 0;
            Block_6: {
                if (n2 > n5) {
                    System.arraycopy(array, n, this.buf, this.bufOff, n5);
                    n6 = 0 + this.cipher.processBlock(this.buf, 0, array2, n3);
                    this.bufOff = 0;
                    i = n2 - n5;
                    n7 = n5 + n;
                    while (i > this.buf.length) {
                        n6 += this.cipher.processBlock(array, n7, array2, n3 + n6);
                        i -= blockSize;
                        n7 += blockSize;
                        if (a != 0) {
                            break Block_6;
                        }
                    }
                    break Label_0221;
                }
                i = n2;
                n7 = n;
                n6 = 0;
                break Label_0221;
            }
            while (true) {
                while (true) {
                    try {
                        final boolean a2 = BaseKeyGenerator.a;
                        final boolean a3 = false;
                        if (a2) {
                            BaseKeyGenerator.a = a3;
                            System.arraycopy(array, n7, this.buf, this.bufOff, i);
                            this.bufOff += i;
                            return n6;
                        }
                    }
                    catch (IllegalArgumentException ex3) {
                        throw ex3;
                    }
                    final boolean a3 = true;
                    continue;
                }
            }
        }
    }
}
