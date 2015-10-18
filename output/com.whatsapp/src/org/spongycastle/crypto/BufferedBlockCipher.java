// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class BufferedBlockCipher
{
    private static final String[] z;
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;
    
    static {
        final String[] z2 = new String[6];
        final char[] charArray = "\u0015\u0010n\u001d\u0010\u001f\u001en\\R\u001d\u001ey\u0017\u0010\u0002\u0018`\u0019\u0010\u0010\u001ds\u001b^\u0014\u0015".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '0';
                    break;
                }
                case 0: {
                    c2 = 'q';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = '\u001a';
                    break;
                }
                case 3: {
                    c2 = '|';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u001e\u0004n\fE\u0005Qx\tV\u0017\u0014h\\D\u001e\u001e:\u000fX\u001e\u0003n\\V\u001e\u0003:\u0018_7\u0018t\u001d\\YX".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '0';
                    break;
                }
                case 0: {
                    c4 = 'q';
                    break;
                }
                case 1: {
                    c4 = 'q';
                    break;
                }
                case 2: {
                    c4 = '\u001a';
                    break;
                }
                case 3: {
                    c4 = '|';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "!6J".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '0';
                    break;
                }
                case 0: {
                    c6 = 'q';
                    break;
                }
                case 1: {
                    c6 = 'q';
                    break;
                }
                case 2: {
                    c6 = '\u001a';
                    break;
                }
                case 3: {
                    c6 = '|';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = ">\u0001\u007f\u0012`6!".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '0';
                    break;
                }
                case 0: {
                    c8 = 'q';
                    break;
                }
                case 1: {
                    c8 = 'q';
                    break;
                }
                case 2: {
                    c8 = '\u001a';
                    break;
                }
                case 3: {
                    c8 = '|';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u001e\u0004n\fE\u0005Qx\tV\u0017\u0014h\\D\u001e\u001e:\u000fX\u001e\u0003n".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '0';
                    break;
                }
                case 0: {
                    c10 = 'q';
                    break;
                }
                case 1: {
                    c10 = 'q';
                    break;
                }
                case 2: {
                    c10 = '\u001a';
                    break;
                }
                case 3: {
                    c10 = '|';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "2\u0010t[DQ\u0019{\nUQ\u0010:\u0012U\u0016\u0010n\u0015F\u0014Qs\u0012@\u0004\u0005:\u0010U\u001f\u0016n\u0014\u0011".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '0';
                    break;
                }
                case 0: {
                    c12 = 'q';
                    break;
                }
                case 1: {
                    c12 = 'q';
                    break;
                }
                case 2: {
                    c12 = '\u001a';
                    break;
                }
                case 3: {
                    c12 = '|';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        z = z2;
    }
    
    protected BufferedBlockCipher() {
    }
    
    public BufferedBlockCipher(final BlockCipher p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       org/spongycastle/crypto/DataLengthException.a:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        org/spongycastle/crypto/BufferedBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //    15: aload_0        
        //    16: aload_1        
        //    17: invokeinterface org/spongycastle/crypto/BlockCipher.getBlockSize:()I
        //    22: newarray        B
        //    24: putfield        org/spongycastle/crypto/BufferedBlockCipher.buf:[B
        //    27: aload_0        
        //    28: iconst_0       
        //    29: putfield        org/spongycastle/crypto/BufferedBlockCipher.bufOff:I
        //    32: aload_1        
        //    33: invokeinterface org/spongycastle/crypto/BlockCipher.getAlgorithmName:()Ljava/lang/String;
        //    38: astore          4
        //    40: iconst_1       
        //    41: aload           4
        //    43: bipush          47
        //    45: invokevirtual   java/lang/String.indexOf:(I)I
        //    48: iadd           
        //    49: istore          5
        //    51: iload           5
        //    53: ifle            162
        //    56: aload           4
        //    58: getstatic       org/spongycastle/crypto/BufferedBlockCipher.z:[Ljava/lang/String;
        //    61: iconst_2       
        //    62: aaload         
        //    63: iload           5
        //    65: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;I)Z
        //    68: istore          17
        //    70: iload           17
        //    72: ifeq            162
        //    75: iload_2        
        //    76: istore          6
        //    78: aload_0        
        //    79: iload           6
        //    81: putfield        org/spongycastle/crypto/BufferedBlockCipher.pgpCFB:Z
        //    84: aload_0        
        //    85: getfield        org/spongycastle/crypto/BufferedBlockCipher.pgpCFB:Z
        //    88: istore          12
        //    90: iload           12
        //    92: ifne            106
        //    95: aload_1        
        //    96: instanceof      Lorg/spongycastle/crypto/StreamCipher;
        //    99: istore          15
        //   101: iload           15
        //   103: ifeq            115
        //   106: aload_0        
        //   107: iconst_1       
        //   108: putfield        org/spongycastle/crypto/BufferedBlockCipher.partialBlockOkay:Z
        //   111: iload_3        
        //   112: ifeq            144
        //   115: iload           5
        //   117: ifle            193
        //   120: aload           4
        //   122: getstatic       org/spongycastle/crypto/BufferedBlockCipher.z:[Ljava/lang/String;
        //   125: iconst_3       
        //   126: aaload         
        //   127: iload           5
        //   129: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;I)Z
        //   132: istore          14
        //   134: iload           14
        //   136: ifeq            193
        //   139: aload_0        
        //   140: iload_2        
        //   141: putfield        org/spongycastle/crypto/BufferedBlockCipher.partialBlockOkay:Z
        //   144: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   147: ifeq            156
        //   150: iload_3        
        //   151: iconst_1       
        //   152: iadd           
        //   153: putstatic       org/spongycastle/crypto/DataLengthException.a:I
        //   156: return         
        //   157: astore          16
        //   159: aload           16
        //   161: athrow         
        //   162: iconst_0       
        //   163: istore          6
        //   165: goto            78
        //   168: astore          7
        //   170: aload           7
        //   172: athrow         
        //   173: astore          8
        //   175: aload           8
        //   177: athrow         
        //   178: astore          9
        //   180: aload           9
        //   182: athrow         
        //   183: astore          10
        //   185: aload           10
        //   187: athrow         
        //   188: astore          11
        //   190: aload           11
        //   192: athrow         
        //   193: iconst_0       
        //   194: istore_2       
        //   195: goto            139
        //   198: astore          13
        //   200: aload           13
        //   202: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  56     70     157    162    Ljava/lang/IllegalArgumentException;
        //  78     90     168    173    Ljava/lang/IllegalArgumentException;
        //  95     101    173    178    Ljava/lang/IllegalArgumentException;
        //  106    111    178    188    Ljava/lang/IllegalArgumentException;
        //  120    134    188    193    Ljava/lang/IllegalArgumentException;
        //  144    156    198    203    Ljava/lang/IllegalArgumentException;
        //  170    173    173    178    Ljava/lang/IllegalArgumentException;
        //  175    178    178    188    Ljava/lang/IllegalArgumentException;
        //  180    183    183    188    Ljava/lang/IllegalArgumentException;
        //  185    188    188    193    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 105, Size: 105
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    public int doFinal(final byte[] array, final int n) {
        try {
            if (n + this.bufOff > array.length) {
                throw new OutputLengthException(BufferedBlockCipher.z[1]);
            }
        }
        catch (IllegalArgumentException ex) {
            try {
                throw ex;
            }
            finally {
                this.reset();
            }
        }
        int bufOff2 = 0;
        Label_0127: {
            try {
                final int bufOff = this.bufOff;
                bufOff2 = 0;
                if (bufOff == 0) {
                    break Label_0127;
                }
                if (!this.partialBlockOkay) {
                    try {
                        throw new DataLengthException(BufferedBlockCipher.z[0]);
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            this.cipher.processBlock(this.buf, 0, this.buf, 0);
            bufOff2 = this.bufOff;
            this.bufOff = 0;
            System.arraycopy(this.buf, 0, array, n, bufOff2);
        }
        this.reset();
        return bufOff2;
    }
    
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }
    
    public int getOutputSize(final int n) {
        return n + this.bufOff;
    }
    
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
    
    public int getUpdateOutputSize(final int n) {
        final int n2 = n + this.bufOff;
        if (this.pgpCFB) {
            final int n3 = n2 % this.buf.length - (2 + this.cipher.getBlockSize());
            if (DataLengthException.a == 0) {
                return n2 - n3;
            }
        }
        final int n3 = n2 % this.buf.length;
        return n2 - n3;
    }
    
    public void init(final boolean forEncryption, final CipherParameters cipherParameters) {
        this.forEncryption = forEncryption;
        this.reset();
        this.cipher.init(forEncryption, cipherParameters);
    }
    
    public int processByte(final byte b, final byte[] array, final int n) {
        this.buf[this.bufOff++] = b;
        if (this.bufOff == this.buf.length) {
            final int processBlock = this.cipher.processBlock(this.buf, 0, array, n);
            this.bufOff = 0;
            return processBlock;
        }
        return 0;
    }
    
    public int processBytes(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        final int a = DataLengthException.a;
        if (n2 < 0) {
            try {
                throw new IllegalArgumentException(BufferedBlockCipher.z[5]);
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
                    throw new OutputLengthException(BufferedBlockCipher.z[4]);
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
                        if (BaseKeyGenerator.a) {
                            final boolean a2 = false;
                            BaseKeyGenerator.a = a2;
                            System.arraycopy(array, n7, this.buf, this.bufOff, i);
                            this.bufOff += i;
                            if (this.bufOff == this.buf.length) {
                                n6 += this.cipher.processBlock(this.buf, 0, array2, n3 + n6);
                                this.bufOff = 0;
                            }
                            return n6;
                        }
                    }
                    catch (IllegalArgumentException ex3) {
                        throw ex3;
                    }
                    final boolean a2 = true;
                    continue;
                }
            }
        }
    }
    
    public void reset() {
        final int a = DataLengthException.a;
        int i = 0;
        while (i < this.buf.length) {
            this.buf[i] = 0;
            ++i;
            if (a != 0) {
                break;
            }
        }
        this.bufOff = 0;
        this.cipher.reset();
    }
}
