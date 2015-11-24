// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.crypto.Digest;
import java.util.Hashtable;
import org.spongycastle.crypto.Mac;

public class HMac implements Mac
{
    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    public static int a;
    private static Hashtable blockLengths;
    private static final String[] z;
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte[] inputPad;
    private Memoable ipadState;
    private Memoable opadState;
    private byte[] outputBuf;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "\u001f5?^4\u001d5tT2\r>'D{\u001a:'C>\u000eat".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '[';
                    break;
                }
                case 0: {
                    c2 = 'j';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = 'T';
                    break;
                }
                case 3: {
                    c2 = '0';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "E\u0013\u0019q\u0018".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '[';
                    break;
                }
                case 0: {
                    c4 = 'j';
                    break;
                }
                case 1: {
                    c4 = '[';
                    break;
                }
                case 2: {
                    c4 = 'T';
                    break;
                }
                case 3: {
                    c4 = '0';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
        HMac.blockLengths = new Hashtable();
        final Hashtable blockLengths = HMac.blockLengths;
        final char[] charArray3 = "-\u0014\u0007dh^je".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '[';
                    break;
                }
                case 0: {
                    c6 = 'j';
                    break;
                }
                case 1: {
                    c6 = '[';
                    break;
                }
                case 2: {
                    c6 = 'T';
                    break;
                }
                case 3: {
                    c6 = '0';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        blockLengths.put(new String(charArray3).intern(), 32);
        final Hashtable blockLengths2 = HMac.blockLengths;
        final char[] charArray4 = "'\u001ff".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '[';
                    break;
                }
                case 0: {
                    c8 = 'j';
                    break;
                }
                case 1: {
                    c8 = '[';
                    break;
                }
                case 2: {
                    c8 = 'T';
                    break;
                }
                case 3: {
                    c8 = '0';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        blockLengths2.put(new String(charArray4).intern(), 16);
        final Hashtable blockLengths3 = HMac.blockLengths;
        final char[] charArray5 = "'\u001f`".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '[';
                    break;
                }
                case 0: {
                    c10 = 'j';
                    break;
                }
                case 1: {
                    c10 = '[';
                    break;
                }
                case 2: {
                    c10 = 'T';
                    break;
                }
                case 3: {
                    c10 = '0';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        blockLengths3.put(new String(charArray5).intern(), 64);
        final Hashtable blockLengths4 = HMac.blockLengths;
        final char[] charArray6 = "'\u001fa".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '[';
                    break;
                }
                case 0: {
                    c12 = 'j';
                    break;
                }
                case 1: {
                    c12 = '[';
                    break;
                }
                case 2: {
                    c12 = 'T';
                    break;
                }
                case 3: {
                    c12 = '0';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        blockLengths4.put(new String(charArray6).intern(), 64);
        final Hashtable blockLengths5 = HMac.blockLengths;
        final char[] charArray7 = "8\u0012\u0004u\u0016.jf\b".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '[';
                    break;
                }
                case 0: {
                    c14 = 'j';
                    break;
                }
                case 1: {
                    c14 = '[';
                    break;
                }
                case 2: {
                    c14 = 'T';
                    break;
                }
                case 3: {
                    c14 = '0';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        blockLengths5.put(new String(charArray7).intern(), 64);
        final Hashtable blockLengths6 = HMac.blockLengths;
        final char[] charArray8 = "8\u0012\u0004u\u0016.jb\u0000".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '[';
                    break;
                }
                case 0: {
                    c16 = 'j';
                    break;
                }
                case 1: {
                    c16 = '[';
                    break;
                }
                case 2: {
                    c16 = 'T';
                    break;
                }
                case 3: {
                    c16 = '0';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        blockLengths6.put(new String(charArray8).intern(), 64);
        final Hashtable blockLengths7 = HMac.blockLengths;
        final char[] charArray9 = "9\u0013\u0015\u001dj".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '[';
                    break;
                }
                case 0: {
                    c18 = 'j';
                    break;
                }
                case 1: {
                    c18 = '[';
                    break;
                }
                case 2: {
                    c18 = 'T';
                    break;
                }
                case 3: {
                    c18 = '0';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        blockLengths7.put(new String(charArray9).intern(), 64);
        final Hashtable blockLengths8 = HMac.blockLengths;
        final char[] charArray10 = "9\u0013\u0015\u001diXo".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '[';
                    break;
                }
                case 0: {
                    c20 = 'j';
                    break;
                }
                case 1: {
                    c20 = '[';
                    break;
                }
                case 2: {
                    c20 = 'T';
                    break;
                }
                case 3: {
                    c20 = '0';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        blockLengths8.put(new String(charArray10).intern(), 64);
        final Hashtable blockLengths9 = HMac.blockLengths;
        final char[] charArray11 = "9\u0013\u0015\u001di_m".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '[';
                    break;
                }
                case 0: {
                    c22 = 'j';
                    break;
                }
                case 1: {
                    c22 = '[';
                    break;
                }
                case 2: {
                    c22 = 'T';
                    break;
                }
                case 3: {
                    c22 = '0';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        blockLengths9.put(new String(charArray11).intern(), 64);
        final Hashtable blockLengths10 = HMac.blockLengths;
        final char[] charArray12 = "9\u0013\u0015\u001dhRo".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '[';
                    break;
                }
                case 0: {
                    c24 = 'j';
                    break;
                }
                case 1: {
                    c24 = '[';
                    break;
                }
                case 2: {
                    c24 = 'T';
                    break;
                }
                case 3: {
                    c24 = '0';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        blockLengths10.put(new String(charArray12).intern(), 128);
        final Hashtable blockLengths11 = HMac.blockLengths;
        final char[] charArray13 = "9\u0013\u0015\u001dn[i".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '[';
                    break;
                }
                case 0: {
                    c26 = 'j';
                    break;
                }
                case 1: {
                    c26 = '[';
                    break;
                }
                case 2: {
                    c26 = 'T';
                    break;
                }
                case 3: {
                    c26 = '0';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        blockLengths11.put(new String(charArray13).intern(), 128);
        final Hashtable blockLengths12 = HMac.blockLengths;
        final char[] charArray14 = ">23U)".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '[';
                    break;
                }
                case 0: {
                    c28 = 'j';
                    break;
                }
                case 1: {
                    c28 = '[';
                    break;
                }
                case 2: {
                    c28 = 'T';
                    break;
                }
                case 3: {
                    c28 = '0';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        blockLengths12.put(new String(charArray14).intern(), 64);
        final Hashtable blockLengths13 = HMac.blockLengths;
        final char[] charArray15 = "=3=B7\u001a4;\\".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '[';
                    break;
                }
                case 0: {
                    c30 = 'j';
                    break;
                }
                case 1: {
                    c30 = '[';
                    break;
                }
                case 2: {
                    c30 = 'T';
                    break;
                }
                case 3: {
                    c30 = '0';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        blockLengths13.put(new String(charArray15).intern(), 64);
    }
    
    public HMac(final Digest digest) {
        this(digest, getByteLength(digest));
    }
    
    private HMac(final Digest digest, final int blockLength) {
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
        this.blockLength = blockLength;
        this.inputPad = new byte[this.blockLength];
        this.outputBuf = new byte[this.blockLength + this.digestSize];
    }
    
    private static int getByteLength(final Digest digest) {
        try {
            if (digest instanceof ExtendedDigest) {
                return ((ExtendedDigest)digest).getByteLength();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        final Integer n = HMac.blockLengths.get(digest.getAlgorithmName());
        if (n == null) {
            try {
                throw new IllegalArgumentException(HMac.z[0] + digest.getAlgorithmName());
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return n;
    }
    
    private static void xorPad(final byte[] array, final int n, final byte b) {
        final int a = HMac.a;
        int i = 0;
        while (i < n) {
            array[i] ^= b;
            ++i;
            if (a != 0) {
                break;
            }
        }
    }
    
    @Override
    public int doFinal(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/macs/HMac.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //     8: aload_0        
        //     9: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //    12: aload_0        
        //    13: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //    16: invokeinterface org/spongycastle/crypto/Digest.doFinal:([BI)I
        //    21: pop            
        //    22: aload_0        
        //    23: getfield        org/spongycastle/crypto/macs/HMac.opadState:Lorg/spongycastle/util/Memoable;
        //    26: astore          7
        //    28: aload           7
        //    30: ifnull          79
        //    33: aload_0        
        //    34: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //    37: checkcast       Lorg/spongycastle/util/Memoable;
        //    40: aload_0        
        //    41: getfield        org/spongycastle/crypto/macs/HMac.opadState:Lorg/spongycastle/util/Memoable;
        //    44: invokeinterface org/spongycastle/util/Memoable.reset:(Lorg/spongycastle/util/Memoable;)V
        //    49: aload_0        
        //    50: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //    53: aload_0        
        //    54: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //    57: aload_0        
        //    58: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //    61: aload_0        
        //    62: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //    65: invokeinterface org/spongycastle/crypto/Digest.getDigestSize:()I
        //    70: invokeinterface org/spongycastle/crypto/Digest.update:([BII)V
        //    75: iload_3        
        //    76: ifeq            98
        //    79: aload_0        
        //    80: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //    83: aload_0        
        //    84: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //    87: iconst_0       
        //    88: aload_0        
        //    89: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //    92: arraylength    
        //    93: invokeinterface org/spongycastle/crypto/Digest.update:([BII)V
        //    98: aload_0        
        //    99: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   102: aload_1        
        //   103: iload_2        
        //   104: invokeinterface org/spongycastle/crypto/Digest.doFinal:([BI)I
        //   109: istore          8
        //   111: aload_0        
        //   112: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //   115: istore          9
        //   117: iload           9
        //   119: aload_0        
        //   120: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //   123: arraylength    
        //   124: if_icmpge       142
        //   127: aload_0        
        //   128: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //   131: iload           9
        //   133: iconst_0       
        //   134: bastore        
        //   135: iinc            9, 1
        //   138: iload_3        
        //   139: ifeq            117
        //   142: aload_0        
        //   143: getfield        org/spongycastle/crypto/macs/HMac.ipadState:Lorg/spongycastle/util/Memoable;
        //   146: astore          12
        //   148: aload           12
        //   150: ifnull          173
        //   153: aload_0        
        //   154: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   157: checkcast       Lorg/spongycastle/util/Memoable;
        //   160: aload_0        
        //   161: getfield        org/spongycastle/crypto/macs/HMac.ipadState:Lorg/spongycastle/util/Memoable;
        //   164: invokeinterface org/spongycastle/util/Memoable.reset:(Lorg/spongycastle/util/Memoable;)V
        //   169: iload_3        
        //   170: ifeq            192
        //   173: aload_0        
        //   174: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   177: aload_0        
        //   178: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   181: iconst_0       
        //   182: aload_0        
        //   183: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   186: arraylength    
        //   187: invokeinterface org/spongycastle/crypto/Digest.update:([BII)V
        //   192: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   195: ifeq            204
        //   198: iload_3        
        //   199: iconst_1       
        //   200: iadd           
        //   201: putstatic       org/spongycastle/crypto/macs/HMac.a:I
        //   204: iload           8
        //   206: ireturn        
        //   207: astore          4
        //   209: aload           4
        //   211: athrow         
        //   212: astore          5
        //   214: aload           5
        //   216: athrow         
        //   217: astore          10
        //   219: aload           10
        //   221: athrow         
        //   222: astore          11
        //   224: aload           11
        //   226: athrow         
        //   227: astore          13
        //   229: aload           13
        //   231: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      28     207    212    Ljava/lang/IllegalArgumentException;
        //  33     75     212    217    Ljava/lang/IllegalArgumentException;
        //  79     98     212    217    Ljava/lang/IllegalArgumentException;
        //  142    148    217    222    Ljava/lang/IllegalArgumentException;
        //  153    169    222    227    Ljava/lang/IllegalArgumentException;
        //  173    192    222    227    Ljava/lang/IllegalArgumentException;
        //  192    204    227    232    Ljava/lang/IllegalArgumentException;
        //  209    212    212    217    Ljava/lang/IllegalArgumentException;
        //  219    222    222    227    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
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
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + HMac.z[1];
    }
    
    @Override
    public int getMacSize() {
        return this.digestSize;
    }
    
    public Digest getUnderlyingDigest() {
        return this.digest;
    }
    
    @Override
    public void init(final CipherParameters p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/macs/HMac.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //     8: invokeinterface org/spongycastle/crypto/Digest.reset:()V
        //    13: aload_1        
        //    14: checkcast       Lorg/spongycastle/crypto/params/KeyParameter;
        //    17: invokevirtual   org/spongycastle/crypto/params/KeyParameter.getKey:()[B
        //    20: astore_3       
        //    21: aload_3        
        //    22: arraylength    
        //    23: istore          4
        //    25: iload           4
        //    27: aload_0        
        //    28: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //    31: if_icmple       94
        //    34: aload_0        
        //    35: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //    38: aload_3        
        //    39: iconst_0       
        //    40: iload           4
        //    42: invokeinterface org/spongycastle/crypto/Digest.update:([BII)V
        //    47: aload_0        
        //    48: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //    51: aload_0        
        //    52: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //    55: iconst_0       
        //    56: invokeinterface org/spongycastle/crypto/Digest.doFinal:([BI)I
        //    61: pop            
        //    62: aload_0        
        //    63: getfield        org/spongycastle/crypto/macs/HMac.digestSize:I
        //    66: istore          5
        //    68: iload_2        
        //    69: ifeq            110
        //    72: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //    75: istore          10
        //    77: iload           10
        //    79: ifeq            276
        //    82: iconst_0       
        //    83: istore          11
        //    85: iload           11
        //    87: putstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //    90: iload           5
        //    92: istore          4
        //    94: aload_3        
        //    95: iconst_0       
        //    96: aload_0        
        //    97: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   100: iconst_0       
        //   101: iload           4
        //   103: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   106: iload           4
        //   108: istore          5
        //   110: iload           5
        //   112: aload_0        
        //   113: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   116: arraylength    
        //   117: if_icmpge       135
        //   120: aload_0        
        //   121: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   124: iload           5
        //   126: iconst_0       
        //   127: bastore        
        //   128: iinc            5, 1
        //   131: iload_2        
        //   132: ifeq            110
        //   135: aload_0        
        //   136: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   139: iconst_0       
        //   140: aload_0        
        //   141: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //   144: iconst_0       
        //   145: aload_0        
        //   146: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //   149: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   152: aload_0        
        //   153: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   156: aload_0        
        //   157: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //   160: bipush          54
        //   162: invokestatic    org/spongycastle/crypto/macs/HMac.xorPad:([BIB)V
        //   165: aload_0        
        //   166: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //   169: aload_0        
        //   170: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //   173: bipush          92
        //   175: invokestatic    org/spongycastle/crypto/macs/HMac.xorPad:([BIB)V
        //   178: aload_0        
        //   179: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   182: instanceof      Lorg/spongycastle/util/Memoable;
        //   185: ifeq            225
        //   188: aload_0        
        //   189: aload_0        
        //   190: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   193: checkcast       Lorg/spongycastle/util/Memoable;
        //   196: invokeinterface org/spongycastle/util/Memoable.copy:()Lorg/spongycastle/util/Memoable;
        //   201: putfield        org/spongycastle/crypto/macs/HMac.opadState:Lorg/spongycastle/util/Memoable;
        //   204: aload_0        
        //   205: getfield        org/spongycastle/crypto/macs/HMac.opadState:Lorg/spongycastle/util/Memoable;
        //   208: checkcast       Lorg/spongycastle/crypto/Digest;
        //   211: aload_0        
        //   212: getfield        org/spongycastle/crypto/macs/HMac.outputBuf:[B
        //   215: iconst_0       
        //   216: aload_0        
        //   217: getfield        org/spongycastle/crypto/macs/HMac.blockLength:I
        //   220: invokeinterface org/spongycastle/crypto/Digest.update:([BII)V
        //   225: aload_0        
        //   226: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   229: aload_0        
        //   230: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   233: iconst_0       
        //   234: aload_0        
        //   235: getfield        org/spongycastle/crypto/macs/HMac.inputPad:[B
        //   238: arraylength    
        //   239: invokeinterface org/spongycastle/crypto/Digest.update:([BII)V
        //   244: aload_0        
        //   245: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   248: instanceof      Lorg/spongycastle/util/Memoable;
        //   251: ifeq            270
        //   254: aload_0        
        //   255: aload_0        
        //   256: getfield        org/spongycastle/crypto/macs/HMac.digest:Lorg/spongycastle/crypto/Digest;
        //   259: checkcast       Lorg/spongycastle/util/Memoable;
        //   262: invokeinterface org/spongycastle/util/Memoable.copy:()Lorg/spongycastle/util/Memoable;
        //   267: putfield        org/spongycastle/crypto/macs/HMac.ipadState:Lorg/spongycastle/util/Memoable;
        //   270: return         
        //   271: astore          9
        //   273: aload           9
        //   275: athrow         
        //   276: iconst_1       
        //   277: istore          11
        //   279: goto            85
        //   282: astore          6
        //   284: aload           6
        //   286: athrow         
        //   287: astore          7
        //   289: aload           7
        //   291: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  72     77     271    276    Ljava/lang/IllegalArgumentException;
        //  135    225    282    287    Ljava/lang/IllegalArgumentException;
        //  225    270    287    292    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 138, Size: 138
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
    public void reset() {
        this.digest.reset();
        this.digest.update(this.inputPad, 0, this.inputPad.length);
    }
    
    @Override
    public void update(final byte b) {
        this.digest.update(b);
    }
    
    @Override
    public void update(final byte[] array, final int n, final int n2) {
        this.digest.update(array, n, n2);
    }
}
