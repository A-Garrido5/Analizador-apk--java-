// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.MemoableResetException;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Memoable;

public class SHA512tDigest extends LongDigest
{
    private static final String[] z;
    private long H1t;
    private long H2t;
    private long H3t;
    private long H4t;
    private long H5t;
    private long H6t;
    private long H7t;
    private long H8t;
    private int digestLength;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = ">c{wJ.Fy|^.b<{W;zl`V*xusM?*u|\u00195~twK".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = 'Z';
                    break;
                }
                case 1: {
                    c2 = '\n';
                    break;
                }
                case 2: {
                    c2 = '\u001c';
                    break;
                }
                case 3: {
                    c2 = '\u0012';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\tB]?\fk83".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '9';
                    break;
                }
                case 0: {
                    c4 = 'Z';
                    break;
                }
                case 1: {
                    c4 = '\n';
                    break;
                }
                case 2: {
                    c4 = '\u001c';
                    break;
                }
                case 3: {
                    c4 = '\u0012';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "8ch^\\4mhz\u00199kr|V.*~w\u0019i2(2L)o<Aq\u001b9$&\u00193dof\\;n".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '9';
                    break;
                }
                case 0: {
                    c6 = 'Z';
                    break;
                }
                case 1: {
                    c6 = '\n';
                    break;
                }
                case 2: {
                    c6 = '\u001c';
                    break;
                }
                case 3: {
                    c6 = '\u0012';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "8ch^\\4mhz\u00199kr|V.*~w\u0019d7<'\bh".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '9';
                    break;
                }
                case 0: {
                    c8 = 'Z';
                    break;
                }
                case 1: {
                    c8 = '\n';
                    break;
                }
                case 2: {
                    c8 = '\u001c';
                    break;
                }
                case 3: {
                    c8 = '\u0012';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "8ch^\\4mhz\u00194oyvJz~s2[?*}2T/fh{I6o<}_z2".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '9';
                    break;
                }
                case 0: {
                    c10 = 'Z';
                    break;
                }
                case 1: {
                    c10 = '\n';
                    break;
                }
                case 2: {
                    c10 = '\u001c';
                    break;
                }
                case 3: {
                    c10 = '\u0012';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    public SHA512tDigest(final int n) {
        if (n >= 512) {
            throw new IllegalArgumentException(SHA512tDigest.z[3]);
        }
        if (n % 8 != 0) {
            try {
                throw new IllegalArgumentException(SHA512tDigest.z[4]);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        if (n == 384) {
            try {
                throw new IllegalArgumentException(SHA512tDigest.z[2]);
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        this.digestLength = n / 8;
        this.tIvGenerate(8 * this.digestLength);
        this.reset();
    }
    
    public SHA512tDigest(final SHA512tDigest sha512tDigest) {
        super(sha512tDigest);
        this.digestLength = sha512tDigest.digestLength;
        this.reset(sha512tDigest);
    }
    
    public SHA512tDigest(final byte[] array) {
        this(readDigestLength(array));
        this.restoreState(array);
    }
    
    private static void intToBigEndian(final int n, final byte[] array, final int n2, final int n3) {
        final boolean a = GeneralDigest.a;
        int min = Math.min(4, n3);
        while (--min >= 0) {
            array[n2 + min] = (byte)(n >>> 8 * (3 - min));
            if (a) {
                break;
            }
        }
    }
    
    private static void longToBigEndian(final long n, final byte[] array, final int n2, final int n3) {
        if (n3 <= 0) {
            return;
        }
        final int n4 = (int)(n >>> 32);
        try {
            intToBigEndian(n4, array, n2, n3);
            if (n3 > 4) {
                intToBigEndian((int)(0xFFFFFFFFL & n), array, n2 + 4, n3 - 4);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private static int readDigestLength(final byte[] array) {
        return Pack.bigEndianToInt(array, -4 + array.length);
    }
    
    private void tIvGenerate(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/digests/GeneralDigest.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: ldc2_w          -3482333909917012819
        //     8: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H1:J
        //    11: aload_0        
        //    12: ldc2_w          2216346199247487646
        //    15: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H2:J
        //    18: aload_0        
        //    19: ldc2_w          -7364697282686394994
        //    22: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H3:J
        //    25: aload_0        
        //    26: ldc2_w          65953792586715988
        //    29: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H4:J
        //    32: aload_0        
        //    33: ldc2_w          -816286391624063116
        //    36: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H5:J
        //    39: aload_0        
        //    40: ldc2_w          4512832404995164602
        //    43: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H6:J
        //    46: aload_0        
        //    47: ldc2_w          -5033199132376557362
        //    50: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H7:J
        //    53: aload_0        
        //    54: ldc2_w          -124578254951840548
        //    57: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H8:J
        //    60: aload_0        
        //    61: bipush          83
        //    63: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //    66: aload_0        
        //    67: bipush          72
        //    69: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //    72: aload_0        
        //    73: bipush          65
        //    75: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //    78: aload_0        
        //    79: bipush          45
        //    81: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //    84: aload_0        
        //    85: bipush          53
        //    87: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //    90: aload_0        
        //    91: bipush          49
        //    93: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //    96: aload_0        
        //    97: bipush          50
        //    99: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   102: aload_0        
        //   103: bipush          47
        //   105: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   108: iload_1        
        //   109: bipush          100
        //   111: if_icmple       296
        //   114: aload_0        
        //   115: bipush          48
        //   117: iload_1        
        //   118: bipush          100
        //   120: idiv           
        //   121: iadd           
        //   122: i2b            
        //   123: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   126: iload_1        
        //   127: bipush          100
        //   129: irem           
        //   130: istore          6
        //   132: aload_0        
        //   133: bipush          48
        //   135: iload           6
        //   137: bipush          10
        //   139: idiv           
        //   140: iadd           
        //   141: i2b            
        //   142: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   145: iload           6
        //   147: bipush          10
        //   149: irem           
        //   150: istore_3       
        //   151: iload_3        
        //   152: bipush          48
        //   154: iadd           
        //   155: i2b            
        //   156: istore          7
        //   158: aload_0        
        //   159: iload           7
        //   161: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   164: iload_2        
        //   165: ifeq            217
        //   168: iload_3        
        //   169: bipush          10
        //   171: if_icmple       208
        //   174: aload_0        
        //   175: bipush          48
        //   177: iload_3        
        //   178: bipush          10
        //   180: idiv           
        //   181: iadd           
        //   182: i2b            
        //   183: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   186: iload_3        
        //   187: bipush          10
        //   189: irem           
        //   190: istore_3       
        //   191: iload_3        
        //   192: bipush          48
        //   194: iadd           
        //   195: i2b            
        //   196: istore          5
        //   198: aload_0        
        //   199: iload           5
        //   201: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   204: iload_2        
        //   205: ifeq            217
        //   208: aload_0        
        //   209: iload_3        
        //   210: bipush          48
        //   212: iadd           
        //   213: i2b            
        //   214: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.update:(B)V
        //   217: aload_0        
        //   218: invokevirtual   org/spongycastle/crypto/digests/SHA512tDigest.finish:()V
        //   221: aload_0        
        //   222: aload_0        
        //   223: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H1:J
        //   226: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H1t:J
        //   229: aload_0        
        //   230: aload_0        
        //   231: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H2:J
        //   234: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H2t:J
        //   237: aload_0        
        //   238: aload_0        
        //   239: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H3:J
        //   242: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H3t:J
        //   245: aload_0        
        //   246: aload_0        
        //   247: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H4:J
        //   250: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H4t:J
        //   253: aload_0        
        //   254: aload_0        
        //   255: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H5:J
        //   258: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H5t:J
        //   261: aload_0        
        //   262: aload_0        
        //   263: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H6:J
        //   266: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H6t:J
        //   269: aload_0        
        //   270: aload_0        
        //   271: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H7:J
        //   274: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H7t:J
        //   277: aload_0        
        //   278: aload_0        
        //   279: getfield        org/spongycastle/crypto/digests/SHA512tDigest.H8:J
        //   282: putfield        org/spongycastle/crypto/digests/SHA512tDigest.H8t:J
        //   285: return         
        //   286: astore          8
        //   288: aload           8
        //   290: athrow         
        //   291: astore          4
        //   293: aload           4
        //   295: athrow         
        //   296: iload_1        
        //   297: istore_3       
        //   298: goto            168
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  158    164    286    291    Ljava/lang/IllegalArgumentException;
        //  198    204    291    296    Ljava/lang/IllegalArgumentException;
        //  208    217    291    296    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0208:
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
    public Memoable copy() {
        return new SHA512tDigest(this);
    }
    
    @Override
    public int doFinal(final byte[] array, final int n) {
        this.finish();
        longToBigEndian(this.H1, array, n, this.digestLength);
        longToBigEndian(this.H2, array, n + 8, -8 + this.digestLength);
        longToBigEndian(this.H3, array, n + 16, -16 + this.digestLength);
        longToBigEndian(this.H4, array, n + 24, -24 + this.digestLength);
        longToBigEndian(this.H5, array, n + 32, -32 + this.digestLength);
        longToBigEndian(this.H6, array, n + 40, -40 + this.digestLength);
        longToBigEndian(this.H7, array, n + 48, -48 + this.digestLength);
        longToBigEndian(this.H8, array, n + 56, -56 + this.digestLength);
        this.reset();
        return this.digestLength;
    }
    
    @Override
    public String getAlgorithmName() {
        return SHA512tDigest.z[1] + Integer.toString(8 * this.digestLength);
    }
    
    @Override
    public int getDigestSize() {
        return this.digestLength;
    }
    
    @Override
    public byte[] getEncodedState() {
        final int encodedStateSize = this.getEncodedStateSize();
        final byte[] array = new byte[encodedStateSize + 4];
        this.populateState(array);
        Pack.intToBigEndian(8 * this.digestLength, array, encodedStateSize);
        return array;
    }
    
    @Override
    public void reset() {
        super.reset();
        this.H1 = this.H1t;
        this.H2 = this.H2t;
        this.H3 = this.H3t;
        this.H4 = this.H4t;
        this.H5 = this.H5t;
        this.H6 = this.H6t;
        this.H7 = this.H7t;
        this.H8 = this.H8t;
    }
    
    @Override
    public void reset(final Memoable memoable) {
        final SHA512tDigest sha512tDigest = (SHA512tDigest)memoable;
        try {
            if (this.digestLength != sha512tDigest.digestLength) {
                throw new MemoableResetException(SHA512tDigest.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        super.copyIn(sha512tDigest);
        this.H1t = sha512tDigest.H1t;
        this.H2t = sha512tDigest.H2t;
        this.H3t = sha512tDigest.H3t;
        this.H4t = sha512tDigest.H4t;
        this.H5t = sha512tDigest.H5t;
        this.H6t = sha512tDigest.H6t;
        this.H7t = sha512tDigest.H7t;
        this.H8t = sha512tDigest.H8t;
    }
}
