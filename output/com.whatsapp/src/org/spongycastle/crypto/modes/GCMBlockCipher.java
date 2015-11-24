// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.GCMExponentiator;
import org.spongycastle.crypto.BlockCipher;

public class GCMBlockCipher implements AEADBlockCipher
{
    private static final int BLOCK_SIZE = 16;
    private static final String[] z;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;
    
    static {
        final String[] z2 = new String[12];
        final char[] charArray = "\u0004S2L".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'N';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = '\u0014';
                    break;
                }
                case 2: {
                    c2 = 'q';
                    break;
                }
                case 3: {
                    c2 = '\u0001';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "H}\u0001i+Y4\u0003d?^}\u0003d*\u000bc\u0018u&\u000buQc\"Dw\u001a!=Bn\u0014!!M4@7`".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'N';
                    break;
                }
                case 0: {
                    c4 = '+';
                    break;
                }
                case 1: {
                    c4 = '\u0014';
                    break;
                }
                case 2: {
                    c4 = 'q';
                    break;
                }
                case 3: {
                    c4 = '\u0001';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "Ou\u0005`n_{\u001e!=C{\u0003u".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'N';
                    break;
                }
                case 0: {
                    c6 = '+';
                    break;
                }
                case 1: {
                    c6 = '\u0014';
                    break;
                }
                case 2: {
                    c6 = 'q';
                    break;
                }
                case 3: {
                    c6 = '\u0001';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "Fu\u0012!-Cq\u0012jnBzQF\rf4\u0017`'Gq\u0015".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'N';
                    break;
                }
                case 0: {
                    c8 = '+';
                    break;
                }
                case 1: {
                    c8 = '\u0014';
                    break;
                }
                case 2: {
                    c8 = 'q';
                    break;
                }
                case 3: {
                    c8 = '\u0001';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "da\u0005q;_4\u0013t(Mq\u0003!:D{Qr&Df\u0005".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'N';
                    break;
                }
                case 0: {
                    c10 = '+';
                    break;
                }
                case 1: {
                    c10 = '\u0014';
                    break;
                }
                case 2: {
                    c10 = 'q';
                    break;
                }
                case 3: {
                    c10 = '\u0001';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "da\u0005q;_4\u0013t(Mq\u0003!:D{Qr&Df\u0005".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'N';
                    break;
                }
                case 0: {
                    c12 = '+';
                    break;
                }
                case 1: {
                    c12 = '\u0014';
                    break;
                }
                case 2: {
                    c12 = 'q';
                    break;
                }
                case 3: {
                    c12 = '\u0001';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "bz\u0001t:\u000bv\u0004g(NfQu!D4\u0002i!Y`".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'N';
                    break;
                }
                case 0: {
                    c14 = '+';
                    break;
                }
                case 1: {
                    c14 = '\u0014';
                    break;
                }
                case 2: {
                    c14 = 'q';
                    break;
                }
                case 3: {
                    c14 = '\u0001';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "bz\u0007`\"BpQw/Ga\u0014!(DfQL\u000fh4\u0002h4N.Q".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'N';
                    break;
                }
                case 0: {
                    c16 = '+';
                    break;
                }
                case 1: {
                    c16 = '\u0014';
                    break;
                }
                case 2: {
                    c16 = 'q';
                    break;
                }
                case 3: {
                    c16 = '\u0001';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "Bz\u0007`\"BpQq/Yu\u001cd:Nf\u0002!>Jg\u0002d*\u000b`\u001e!\thY".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'N';
                    break;
                }
                case 0: {
                    c18 = '+';
                    break;
                }
                case 1: {
                    c18 = '\u0014';
                    break;
                }
                case 2: {
                    c18 = 'q';
                    break;
                }
                case 3: {
                    c18 = '\u0001';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "bBQl;X`Qc+\u000bu\u0005!\"Nu\u0002un\u001a4\u0013x:N".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'N';
                    break;
                }
                case 0: {
                    c20 = '+';
                    break;
                }
                case 1: {
                    c20 = '\u0014';
                    break;
                }
                case 2: {
                    c20 = 'q';
                    break;
                }
                case 3: {
                    c20 = '\u0001';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "`q\b!#^g\u0005!,N4\u0002q+H}\u0017h+O4\u0018onBz\u0018u'JxQh B`".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 'N';
                    break;
                }
                case 0: {
                    c22 = '+';
                    break;
                }
                case 1: {
                    c22 = '\u0014';
                    break;
                }
                case 2: {
                    c22 = 'q';
                    break;
                }
                case 3: {
                    c22 = '\u0001';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "da\u0005q;_4\u0013t(Mq\u0003!:D{Qr&Df\u0005".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 'N';
                    break;
                }
                case 0: {
                    c24 = '+';
                    break;
                }
                case 1: {
                    c24 = '\u0014';
                    break;
                }
                case 2: {
                    c24 = 'q';
                    break;
                }
                case 3: {
                    c24 = '\u0001';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        z = z2;
    }
    
    public GCMBlockCipher(final BlockCipher blockCipher) {
        this(blockCipher, null);
    }
    
    public GCMBlockCipher(final BlockCipher cipher, GCMMultiplier multiplier) {
        if (cipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(GCMBlockCipher.z[1]);
        }
        if (multiplier == null) {
            multiplier = new Tables8kGCMMultiplier();
        }
        this.cipher = cipher;
        this.multiplier = multiplier;
    }
    
    private void gCTRBlock(byte[] array, final byte[] array2, final int n) {
        final byte[] nextCounterBlock = this.getNextCounterBlock();
        try {
            xor(nextCounterBlock, array);
            System.arraycopy(nextCounterBlock, 0, array2, n, 16);
            final byte[] s = this.S;
            if (this.forEncryption) {
                array = nextCounterBlock;
            }
            this.gHASHBlock(s, array);
            this.totalLength += 16L;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void gCTRPartial(byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        final byte[] nextCounterBlock = this.getNextCounterBlock();
        try {
            xor(nextCounterBlock, array, n, n2);
            System.arraycopy(nextCounterBlock, 0, array2, n3, n2);
            final byte[] s = this.S;
            if (this.forEncryption) {
                array = nextCounterBlock;
            }
            this.gHASHPartial(s, array, 0, n2);
            this.totalLength += n2;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void gHASH(final byte[] array, final byte[] array2, final int n) {
        final boolean a = SICBlockCipher.a;
        int i = 0;
        while (i < n) {
            this.gHASHPartial(array, array2, i, Math.min(n - i, 16));
            i += 16;
            if (a) {
                break;
            }
        }
    }
    
    private void gHASHBlock(final byte[] array, final byte[] array2) {
        xor(array, array2);
        this.multiplier.multiplyH(array);
    }
    
    private void gHASHPartial(final byte[] array, final byte[] array2, final int n, final int n2) {
        xor(array, array2, n, n2);
        this.multiplier.multiplyH(array);
    }
    
    private byte[] getNextCounterBlock() {
        final boolean a = SICBlockCipher.a;
        int n = 15;
        while (true) {
            Label_0052: {
                if (n < 12) {
                    break Label_0052;
                }
                final byte b = (byte)(0xFF & 1 + this.counter[n]);
                try {
                    this.counter[n] = b;
                    if (b == 0 || a) {
                        --n;
                        if (!a) {
                            continue;
                        }
                    }
                    final byte[] array = new byte[16];
                    this.cipher.processBlock(this.counter, 0, array, 0);
                    return array;
                }
                catch (IllegalArgumentException ex) {
                    try {
                        throw ex;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    private void initCipher() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //     4: lconst_0       
        //     5: lcmp           
        //     6: ifle            32
        //     9: aload_0        
        //    10: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //    13: iconst_0       
        //    14: aload_0        
        //    15: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_atPre:[B
        //    18: iconst_0       
        //    19: bipush          16
        //    21: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    24: aload_0        
        //    25: aload_0        
        //    26: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //    29: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //    32: aload_0        
        //    33: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //    36: ifle            70
        //    39: aload_0        
        //    40: aload_0        
        //    41: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_atPre:[B
        //    44: aload_0        
        //    45: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlock:[B
        //    48: iconst_0       
        //    49: aload_0        
        //    50: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //    53: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gHASHPartial:([B[BII)V
        //    56: aload_0        
        //    57: aload_0        
        //    58: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //    61: aload_0        
        //    62: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //    65: i2l            
        //    66: ladd           
        //    67: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //    70: aload_0        
        //    71: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //    74: lconst_0       
        //    75: lcmp           
        //    76: ifle            94
        //    79: aload_0        
        //    80: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_atPre:[B
        //    83: iconst_0       
        //    84: aload_0        
        //    85: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S:[B
        //    88: iconst_0       
        //    89: bipush          16
        //    91: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    94: return         
        //    95: astore_1       
        //    96: aload_1        
        //    97: athrow         
        //    98: astore_2       
        //    99: aload_2        
        //   100: athrow         
        //   101: astore_3       
        //   102: aload_3        
        //   103: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      32     95     98     Ljava/lang/IllegalArgumentException;
        //  32     70     98     101    Ljava/lang/IllegalArgumentException;
        //  70     94     101    104    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 60, Size: 60
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
    
    private static void multiply(final byte[] p0, final byte[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/modes/SICBlockCipher.a:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokestatic    org/spongycastle/util/Arrays.clone:([B)[B
        //     8: astore_3       
        //     9: bipush          16
        //    11: newarray        B
        //    13: astore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload           5
        //    20: bipush          16
        //    22: if_icmpge       111
        //    25: aload_1        
        //    26: iload           5
        //    28: baload         
        //    29: istore          6
        //    31: bipush          7
        //    33: istore          7
        //    35: iload           7
        //    37: iflt            101
        //    40: iload           6
        //    42: iconst_1       
        //    43: iload           7
        //    45: ishl           
        //    46: iand           
        //    47: ifeq            56
        //    50: aload           4
        //    52: aload_3        
        //    53: invokestatic    org/spongycastle/crypto/modes/GCMBlockCipher.xor:([B[B)V
        //    56: aload_3        
        //    57: bipush          15
        //    59: baload         
        //    60: istore          10
        //    62: iload           10
        //    64: iconst_1       
        //    65: iand           
        //    66: ifeq            132
        //    69: iconst_1       
        //    70: istore          11
        //    72: aload_3        
        //    73: invokestatic    org/spongycastle/crypto/modes/GCMBlockCipher.shiftRight:([B)V
        //    76: iload           11
        //    78: ifeq            91
        //    81: aload_3        
        //    82: iconst_0       
        //    83: bipush          -31
        //    85: aload_3        
        //    86: iconst_0       
        //    87: baload         
        //    88: ixor           
        //    89: i2b            
        //    90: bastore        
        //    91: iload           7
        //    93: iconst_1       
        //    94: isub           
        //    95: istore          13
        //    97: iload_2        
        //    98: ifeq            150
        //   101: iload           5
        //   103: iconst_1       
        //   104: iadd           
        //   105: istore          8
        //   107: iload_2        
        //   108: ifeq            143
        //   111: aload           4
        //   113: iconst_0       
        //   114: aload_0        
        //   115: iconst_0       
        //   116: bipush          16
        //   118: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   121: return         
        //   122: astore          14
        //   124: aload           14
        //   126: athrow         
        //   127: astore          9
        //   129: aload           9
        //   131: athrow         
        //   132: iconst_0       
        //   133: istore          11
        //   135: goto            72
        //   138: astore          12
        //   140: aload           12
        //   142: athrow         
        //   143: iload           8
        //   145: istore          5
        //   147: goto            18
        //   150: iload           13
        //   152: istore          7
        //   154: goto            35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  50     56     122    127    Ljava/lang/IllegalArgumentException;
        //  56     62     127    132    Ljava/lang/IllegalArgumentException;
        //  72     76     138    143    Ljava/lang/IllegalArgumentException;
        //  81     91     138    143    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
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
    
    private void outputBlock(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: arraylength    
        //     2: iload_2        
        //     3: bipush          16
        //     5: iadd           
        //     6: if_icmpge       26
        //     9: new             Lorg/spongycastle/crypto/OutputLengthException;
        //    12: dup            
        //    13: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //    16: bipush          11
        //    18: aaload         
        //    19: invokespecial   org/spongycastle/crypto/OutputLengthException.<init>:(Ljava/lang/String;)V
        //    22: athrow         
        //    23: astore_3       
        //    24: aload_3        
        //    25: athrow         
        //    26: aload_0        
        //    27: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.totalLength:J
        //    30: lconst_0       
        //    31: lcmp           
        //    32: ifne            39
        //    35: aload_0        
        //    36: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.initCipher:()V
        //    39: aload_0        
        //    40: aload_0        
        //    41: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //    44: aload_1        
        //    45: iload_2        
        //    46: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gCTRBlock:([B[BI)V
        //    49: aload_0        
        //    50: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.forEncryption:Z
        //    53: istore          7
        //    55: iload           7
        //    57: ifeq            71
        //    60: aload_0        
        //    61: iconst_0       
        //    62: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufOff:I
        //    65: getstatic       org/spongycastle/crypto/modes/SICBlockCipher.a:Z
        //    68: ifeq            97
        //    71: aload_0        
        //    72: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //    75: bipush          16
        //    77: aload_0        
        //    78: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //    81: iconst_0       
        //    82: aload_0        
        //    83: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //    86: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    89: aload_0        
        //    90: aload_0        
        //    91: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //    94: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufOff:I
        //    97: return         
        //    98: astore          4
        //   100: aload           4
        //   102: athrow         
        //   103: astore          5
        //   105: aload           5
        //   107: athrow         
        //   108: astore          6
        //   110: aload           6
        //   112: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      23     23     26     Ljava/lang/IllegalArgumentException;
        //  26     39     98     103    Ljava/lang/IllegalArgumentException;
        //  39     55     103    108    Ljava/lang/IllegalArgumentException;
        //  60     71     108    113    Ljava/lang/IllegalArgumentException;
        //  71     97     108    113    Ljava/lang/IllegalArgumentException;
        //  105    108    108    113    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 62, Size: 62
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
    
    private void reset(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //     4: invokeinterface org/spongycastle/crypto/BlockCipher.reset:()V
        //     9: aload_0        
        //    10: bipush          16
        //    12: newarray        B
        //    14: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.S:[B
        //    17: aload_0        
        //    18: bipush          16
        //    20: newarray        B
        //    22: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //    25: aload_0        
        //    26: bipush          16
        //    28: newarray        B
        //    30: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_atPre:[B
        //    33: aload_0        
        //    34: bipush          16
        //    36: newarray        B
        //    38: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlock:[B
        //    41: aload_0        
        //    42: iconst_0       
        //    43: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //    46: aload_0        
        //    47: lconst_0       
        //    48: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //    51: aload_0        
        //    52: lconst_0       
        //    53: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //    56: aload_0        
        //    57: aload_0        
        //    58: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //    61: invokestatic    org/spongycastle/util/Arrays.clone:([B)[B
        //    64: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.counter:[B
        //    67: aload_0        
        //    68: iconst_0       
        //    69: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufOff:I
        //    72: aload_0        
        //    73: lconst_0       
        //    74: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.totalLength:J
        //    77: aload_0        
        //    78: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //    81: ifnull          92
        //    84: aload_0        
        //    85: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //    88: iconst_0       
        //    89: invokestatic    org/spongycastle/util/Arrays.fill:([BB)V
        //    92: iload_1        
        //    93: ifeq            101
        //    96: aload_0        
        //    97: aconst_null    
        //    98: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.macBlock:[B
        //   101: aload_0        
        //   102: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   105: ifnull          122
        //   108: aload_0        
        //   109: aload_0        
        //   110: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   113: iconst_0       
        //   114: aload_0        
        //   115: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   118: arraylength    
        //   119: invokevirtual   org/spongycastle/crypto/modes/GCMBlockCipher.processAADBytes:([BII)V
        //   122: return         
        //   123: astore_2       
        //   124: aload_2        
        //   125: athrow         
        //   126: astore          4
        //   128: aload           4
        //   130: athrow         
        //   131: astore_3       
        //   132: aload_3        
        //   133: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      92     123    126    Ljava/lang/IllegalArgumentException;
        //  96     101    126    131    Ljava/lang/IllegalArgumentException;
        //  101    122    131    134    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 72, Size: 72
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
    
    private static void shiftRight(final byte[] array) {
        int n = 0;
        final boolean a = SICBlockCipher.a;
        int n2 = 0;
        do {
            final int n3 = 0xFF & array[n2];
            array[n2] = (byte)(n | n3 >>> 1);
            if (++n2 == 16 && !a) {
                break;
            }
            n = (n3 & 0x1) << 7;
        } while (!a);
    }
    
    private static void xor(final byte[] array, final byte[] array2) {
        final boolean a = SICBlockCipher.a;
        int i = 15;
        while (i >= 0) {
            array[i] ^= array2[i];
            --i;
            if (a) {
                break;
            }
        }
    }
    
    private static void xor(final byte[] array, final byte[] array2, final int n, int n2) {
        final boolean a = SICBlockCipher.a;
        while (true) {
            final int n3 = n2 - 1;
            if (n2 <= 0) {
                break;
            }
            array[n3] ^= array2[n + n3];
            if (a) {
                break;
            }
            n2 = n3;
        }
    }
    
    @Override
    public int doFinal(final byte[] p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/crypto/modes/SICBlockCipher.a:Z
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.totalLength:J
        //     8: lconst_0       
        //     9: lcmp           
        //    10: ifne            17
        //    13: aload_0        
        //    14: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.initCipher:()V
        //    17: aload_0        
        //    18: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufOff:I
        //    21: istore          5
        //    23: aload_0        
        //    24: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.forEncryption:Z
        //    27: istore          8
        //    29: iload           8
        //    31: ifne            80
        //    34: iload           5
        //    36: aload_0        
        //    37: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //    40: if_icmpge       71
        //    43: new             Lorg/spongycastle/crypto/InvalidCipherTextException;
        //    46: dup            
        //    47: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //    50: iconst_2       
        //    51: aaload         
        //    52: invokespecial   org/spongycastle/crypto/InvalidCipherTextException.<init>:(Ljava/lang/String;)V
        //    55: athrow         
        //    56: astore          7
        //    58: aload           7
        //    60: athrow         
        //    61: astore          4
        //    63: aload           4
        //    65: athrow         
        //    66: astore          6
        //    68: aload           6
        //    70: athrow         
        //    71: iload           5
        //    73: aload_0        
        //    74: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //    77: isub           
        //    78: istore          5
        //    80: iload           5
        //    82: ifle            125
        //    85: aload_1        
        //    86: arraylength    
        //    87: iload_2        
        //    88: iload           5
        //    90: iadd           
        //    91: if_icmpge       112
        //    94: new             Lorg/spongycastle/crypto/OutputLengthException;
        //    97: dup            
        //    98: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //   101: iconst_4       
        //   102: aaload         
        //   103: invokespecial   org/spongycastle/crypto/OutputLengthException.<init>:(Ljava/lang/String;)V
        //   106: athrow         
        //   107: astore          34
        //   109: aload           34
        //   111: athrow         
        //   112: aload_0        
        //   113: aload_0        
        //   114: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //   117: iconst_0       
        //   118: iload           5
        //   120: aload_1        
        //   121: iload_2        
        //   122: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gCTRPartial:([BII[BI)V
        //   125: aload_0        
        //   126: aload_0        
        //   127: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //   130: aload_0        
        //   131: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //   134: i2l            
        //   135: ladd           
        //   136: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //   139: aload_0        
        //   140: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //   143: lstore          11
        //   145: aload_0        
        //   146: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //   149: lstore          13
        //   151: lload           11
        //   153: lload           13
        //   155: lcmp           
        //   156: ifle            290
        //   159: aload_0        
        //   160: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //   163: ifle            183
        //   166: aload_0        
        //   167: aload_0        
        //   168: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //   171: aload_0        
        //   172: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlock:[B
        //   175: iconst_0       
        //   176: aload_0        
        //   177: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //   180: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gHASHPartial:([B[BII)V
        //   183: aload_0        
        //   184: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //   187: lconst_0       
        //   188: lcmp           
        //   189: ifle            203
        //   192: aload_0        
        //   193: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //   196: aload_0        
        //   197: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_atPre:[B
        //   200: invokestatic    org/spongycastle/crypto/modes/GCMBlockCipher.xor:([B[B)V
        //   203: ldc2_w          127
        //   206: ldc2_w          8
        //   209: aload_0        
        //   210: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.totalLength:J
        //   213: lmul           
        //   214: ladd           
        //   215: bipush          7
        //   217: lushr          
        //   218: lstore          30
        //   220: bipush          16
        //   222: newarray        B
        //   224: astore          32
        //   226: aload_0        
        //   227: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.exp:Lorg/spongycastle/crypto/modes/gcm/GCMExponentiator;
        //   230: ifnonnull       257
        //   233: aload_0        
        //   234: new             Lorg/spongycastle/crypto/modes/gcm/Tables1kGCMExponentiator;
        //   237: dup            
        //   238: invokespecial   org/spongycastle/crypto/modes/gcm/Tables1kGCMExponentiator.<init>:()V
        //   241: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.exp:Lorg/spongycastle/crypto/modes/gcm/GCMExponentiator;
        //   244: aload_0        
        //   245: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.exp:Lorg/spongycastle/crypto/modes/gcm/GCMExponentiator;
        //   248: aload_0        
        //   249: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.H:[B
        //   252: invokeinterface org/spongycastle/crypto/modes/gcm/GCMExponentiator.init:([B)V
        //   257: aload_0        
        //   258: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.exp:Lorg/spongycastle/crypto/modes/gcm/GCMExponentiator;
        //   261: lload           30
        //   263: aload           32
        //   265: invokeinterface org/spongycastle/crypto/modes/gcm/GCMExponentiator.exponentiateX:(J[B)V
        //   270: aload_0        
        //   271: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //   274: aload           32
        //   276: invokestatic    org/spongycastle/crypto/modes/GCMBlockCipher.multiply:([B[B)V
        //   279: aload_0        
        //   280: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S:[B
        //   283: aload_0        
        //   284: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //   287: invokestatic    org/spongycastle/crypto/modes/GCMBlockCipher.xor:([B[B)V
        //   290: bipush          16
        //   292: newarray        B
        //   294: astore          15
        //   296: ldc2_w          8
        //   299: aload_0        
        //   300: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //   303: lmul           
        //   304: aload           15
        //   306: iconst_0       
        //   307: invokestatic    org/spongycastle/util/Pack.longToBigEndian:(J[BI)V
        //   310: ldc2_w          8
        //   313: aload_0        
        //   314: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.totalLength:J
        //   317: lmul           
        //   318: aload           15
        //   320: bipush          8
        //   322: invokestatic    org/spongycastle/util/Pack.longToBigEndian:(J[BI)V
        //   325: aload_0        
        //   326: aload_0        
        //   327: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S:[B
        //   330: aload           15
        //   332: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gHASHBlock:([B[B)V
        //   335: bipush          16
        //   337: newarray        B
        //   339: astore          16
        //   341: aload_0        
        //   342: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //   345: aload_0        
        //   346: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   349: iconst_0       
        //   350: aload           16
        //   352: iconst_0       
        //   353: invokeinterface org/spongycastle/crypto/BlockCipher.processBlock:([BI[BI)I
        //   358: pop            
        //   359: aload           16
        //   361: aload_0        
        //   362: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.S:[B
        //   365: invokestatic    org/spongycastle/crypto/modes/GCMBlockCipher.xor:([B[B)V
        //   368: aload_0        
        //   369: aload_0        
        //   370: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   373: newarray        B
        //   375: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.macBlock:[B
        //   378: aload           16
        //   380: iconst_0       
        //   381: aload_0        
        //   382: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macBlock:[B
        //   385: iconst_0       
        //   386: aload_0        
        //   387: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   390: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   393: aload_0        
        //   394: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.forEncryption:Z
        //   397: istore          20
        //   399: iload           20
        //   401: ifeq            597
        //   404: aload_1        
        //   405: arraylength    
        //   406: iload_2        
        //   407: iload           5
        //   409: iadd           
        //   410: aload_0        
        //   411: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   414: iadd           
        //   415: if_icmpge       461
        //   418: new             Lorg/spongycastle/crypto/OutputLengthException;
        //   421: dup            
        //   422: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //   425: iconst_5       
        //   426: aaload         
        //   427: invokespecial   org/spongycastle/crypto/OutputLengthException.<init>:(Ljava/lang/String;)V
        //   430: athrow         
        //   431: astore          19
        //   433: aload           19
        //   435: athrow         
        //   436: astore          9
        //   438: aload           9
        //   440: athrow         
        //   441: astore          10
        //   443: aload           10
        //   445: athrow         
        //   446: astore          29
        //   448: aload           29
        //   450: athrow         
        //   451: astore          33
        //   453: aload           33
        //   455: athrow         
        //   456: astore          18
        //   458: aload           18
        //   460: athrow         
        //   461: aload_0        
        //   462: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macBlock:[B
        //   465: iconst_0       
        //   466: aload_1        
        //   467: iload_2        
        //   468: aload_0        
        //   469: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufOff:I
        //   472: iadd           
        //   473: aload_0        
        //   474: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   477: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   480: iload           5
        //   482: aload_0        
        //   483: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   486: iadd           
        //   487: istore          21
        //   489: iload_3        
        //   490: ifeq            547
        //   493: aload_0        
        //   494: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   497: newarray        B
        //   499: astore          22
        //   501: aload_0        
        //   502: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //   505: iload           5
        //   507: aload           22
        //   509: iconst_0       
        //   510: aload_0        
        //   511: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   514: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   517: aload_0        
        //   518: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macBlock:[B
        //   521: aload           22
        //   523: invokestatic    org/spongycastle/util/Arrays.constantTimeAreEqual:([B[B)Z
        //   526: ifne            547
        //   529: new             Lorg/spongycastle/crypto/InvalidCipherTextException;
        //   532: dup            
        //   533: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //   536: iconst_3       
        //   537: aaload         
        //   538: invokespecial   org/spongycastle/crypto/InvalidCipherTextException.<init>:(Ljava/lang/String;)V
        //   541: athrow         
        //   542: astore          23
        //   544: aload           23
        //   546: athrow         
        //   547: iload           21
        //   549: istore          24
        //   551: aload_0        
        //   552: iconst_0       
        //   553: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.reset:(Z)V
        //   556: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   559: istore          27
        //   561: iload           27
        //   563: ifeq            578
        //   566: iload_3        
        //   567: ifeq            591
        //   570: iconst_0       
        //   571: istore          28
        //   573: iload           28
        //   575: putstatic       org/spongycastle/crypto/modes/SICBlockCipher.a:Z
        //   578: iload           24
        //   580: ireturn        
        //   581: astore          25
        //   583: aload           25
        //   585: athrow         
        //   586: astore          26
        //   588: aload           26
        //   590: athrow         
        //   591: iconst_1       
        //   592: istore          28
        //   594: goto            573
        //   597: iload           5
        //   599: istore          21
        //   601: goto            493
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      17     61     66     Ljava/lang/IllegalArgumentException;
        //  23     29     66     71     Ljava/lang/IllegalArgumentException;
        //  34     56     56     61     Ljava/lang/IllegalArgumentException;
        //  68     71     56     61     Ljava/lang/IllegalArgumentException;
        //  85     107    107    112    Ljava/lang/IllegalArgumentException;
        //  125    151    436    441    Ljava/lang/IllegalArgumentException;
        //  159    183    441    446    Ljava/lang/IllegalArgumentException;
        //  183    203    446    451    Ljava/lang/IllegalArgumentException;
        //  226    257    451    456    Ljava/lang/IllegalArgumentException;
        //  368    399    456    461    Ljava/lang/IllegalArgumentException;
        //  404    431    431    436    Ljava/lang/IllegalArgumentException;
        //  438    441    441    446    Ljava/lang/IllegalArgumentException;
        //  458    461    431    436    Ljava/lang/IllegalArgumentException;
        //  501    542    542    547    Ljava/lang/IllegalArgumentException;
        //  551    561    581    591    Ljava/lang/IllegalArgumentException;
        //  583    586    586    591    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 311, Size: 311
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
        return this.cipher.getAlgorithmName() + GCMBlockCipher.z[0];
    }
    
    @Override
    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }
    
    @Override
    public int getOutputSize(final int n) {
        final int n2 = n + this.bufOff;
        try {
            if (this.forEncryption) {
                return n2 + this.macSize;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (n2 < this.macSize) {
                return 0;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        return n2 - this.macSize;
    }
    
    @Override
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
    
    @Override
    public int getUpdateOutputSize(final int n) {
        int n2 = n + this.bufOff;
        Label_0036: {
            try {
                if (this.forEncryption) {
                    return n2 - n2 % 16;
                }
                final int n3 = n2;
                final GCMBlockCipher gcmBlockCipher = this;
                final int n4 = gcmBlockCipher.macSize;
                if (n3 < n4) {
                    final boolean b = false;
                    return b ? 1 : 0;
                }
                break Label_0036;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final int n3 = n2;
                final GCMBlockCipher gcmBlockCipher = this;
                final int n4 = gcmBlockCipher.macSize;
                if (n3 < n4) {
                    final boolean b = false;
                    return b ? 1 : 0;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        n2 -= this.macSize;
        return n2 - n2 % 16;
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
        //     5: iload_1        
        //     6: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.forEncryption:Z
        //     9: aload_0        
        //    10: aconst_null    
        //    11: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.macBlock:[B
        //    14: aload_2        
        //    15: instanceof      Lorg/spongycastle/crypto/params/AEADParameters;
        //    18: ifeq            150
        //    21: aload_2        
        //    22: checkcast       Lorg/spongycastle/crypto/params/AEADParameters;
        //    25: astore          18
        //    27: aload_0        
        //    28: aload           18
        //    30: invokevirtual   org/spongycastle/crypto/params/AEADParameters.getNonce:()[B
        //    33: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //    36: aload_0        
        //    37: aload           18
        //    39: invokevirtual   org/spongycastle/crypto/params/AEADParameters.getAssociatedText:()[B
        //    42: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //    45: aload           18
        //    47: invokevirtual   org/spongycastle/crypto/params/AEADParameters.getMacSize:()I
        //    50: istore          19
        //    52: iload           19
        //    54: bipush          32
        //    56: if_icmplt       75
        //    59: iload           19
        //    61: sipush          128
        //    64: if_icmpgt       75
        //    67: iload           19
        //    69: bipush          8
        //    71: irem           
        //    72: ifeq            112
        //    75: new             Ljava/lang/IllegalArgumentException;
        //    78: dup            
        //    79: new             Ljava/lang/StringBuilder;
        //    82: dup            
        //    83: invokespecial   java/lang/StringBuilder.<init>:()V
        //    86: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //    89: bipush          7
        //    91: aaload         
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: iload           19
        //    97: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   100: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   103: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   106: athrow         
        //   107: astore          20
        //   109: aload           20
        //   111: athrow         
        //   112: aload_0        
        //   113: iload           19
        //   115: bipush          8
        //   117: idiv           
        //   118: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   121: aload           18
        //   123: invokevirtual   org/spongycastle/crypto/params/AEADParameters.getKey:()Lorg/spongycastle/crypto/params/KeyParameter;
        //   126: astore          6
        //   128: iload_3        
        //   129: ifeq            227
        //   132: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   135: istore          22
        //   137: iload           22
        //   139: ifeq            221
        //   142: iconst_0       
        //   143: istore          23
        //   145: iload           23
        //   147: putstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseKeyGenerator.a:Z
        //   150: aload_2        
        //   151: instanceof      Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   154: ifeq            197
        //   157: aload_2        
        //   158: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   161: astore          5
        //   163: aload_0        
        //   164: aload           5
        //   166: invokevirtual   org/spongycastle/crypto/params/ParametersWithIV.getIV:()[B
        //   169: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   172: aload_0        
        //   173: aconst_null    
        //   174: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   177: aload_0        
        //   178: bipush          16
        //   180: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   183: aload           5
        //   185: invokevirtual   org/spongycastle/crypto/params/ParametersWithIV.getParameters:()Lorg/spongycastle/crypto/CipherParameters;
        //   188: checkcast       Lorg/spongycastle/crypto/params/KeyParameter;
        //   191: astore          6
        //   193: iload_3        
        //   194: ifeq            227
        //   197: new             Ljava/lang/IllegalArgumentException;
        //   200: dup            
        //   201: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //   204: bipush          8
        //   206: aaload         
        //   207: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   210: athrow         
        //   211: astore          4
        //   213: aload           4
        //   215: athrow         
        //   216: astore          21
        //   218: aload           21
        //   220: athrow         
        //   221: iconst_1       
        //   222: istore          23
        //   224: goto            145
        //   227: aload           6
        //   229: astore          7
        //   231: iload_1        
        //   232: ifeq            286
        //   235: bipush          16
        //   237: istore          8
        //   239: aload_0        
        //   240: iload           8
        //   242: newarray        B
        //   244: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufBlock:[B
        //   247: aload_0        
        //   248: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   251: astore          11
        //   253: aload           11
        //   255: ifnull          267
        //   258: aload_0        
        //   259: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   262: arraylength    
        //   263: iconst_1       
        //   264: if_icmpge       303
        //   267: new             Ljava/lang/IllegalArgumentException;
        //   270: dup            
        //   271: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //   274: bipush          9
        //   276: aaload         
        //   277: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   280: athrow         
        //   281: astore          10
        //   283: aload           10
        //   285: athrow         
        //   286: bipush          16
        //   288: aload_0        
        //   289: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.macSize:I
        //   292: iadd           
        //   293: istore          8
        //   295: goto            239
        //   298: astore          9
        //   300: aload           9
        //   302: athrow         
        //   303: aload           7
        //   305: ifnull          370
        //   308: aload_0        
        //   309: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //   312: iconst_1       
        //   313: aload           7
        //   315: invokeinterface org/spongycastle/crypto/BlockCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   320: aload_0        
        //   321: bipush          16
        //   323: newarray        B
        //   325: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.H:[B
        //   328: aload_0        
        //   329: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.cipher:Lorg/spongycastle/crypto/BlockCipher;
        //   332: aload_0        
        //   333: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.H:[B
        //   336: iconst_0       
        //   337: aload_0        
        //   338: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.H:[B
        //   341: iconst_0       
        //   342: invokeinterface org/spongycastle/crypto/BlockCipher.processBlock:([BI[BI)I
        //   347: pop            
        //   348: aload_0        
        //   349: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.multiplier:Lorg/spongycastle/crypto/modes/gcm/GCMMultiplier;
        //   352: aload_0        
        //   353: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.H:[B
        //   356: invokeinterface org/spongycastle/crypto/modes/gcm/GCMMultiplier.init:([B)V
        //   361: aload_0        
        //   362: aconst_null    
        //   363: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.exp:Lorg/spongycastle/crypto/modes/gcm/GCMExponentiator;
        //   366: iload_3        
        //   367: ifeq            401
        //   370: aload_0        
        //   371: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.H:[B
        //   374: ifnonnull       401
        //   377: new             Ljava/lang/IllegalArgumentException;
        //   380: dup            
        //   381: getstatic       org/spongycastle/crypto/modes/GCMBlockCipher.z:[Ljava/lang/String;
        //   384: bipush          10
        //   386: aaload         
        //   387: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   390: athrow         
        //   391: astore          12
        //   393: aload           12
        //   395: athrow         
        //   396: astore          16
        //   398: aload           16
        //   400: athrow         
        //   401: aload_0        
        //   402: bipush          16
        //   404: newarray        B
        //   406: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   409: aload_0        
        //   410: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   413: arraylength    
        //   414: bipush          12
        //   416: if_icmpne       449
        //   419: aload_0        
        //   420: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   423: iconst_0       
        //   424: aload_0        
        //   425: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   428: iconst_0       
        //   429: aload_0        
        //   430: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   433: arraylength    
        //   434: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   437: aload_0        
        //   438: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   441: bipush          15
        //   443: iconst_1       
        //   444: bastore        
        //   445: iload_3        
        //   446: ifeq            499
        //   449: aload_0        
        //   450: aload_0        
        //   451: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   454: aload_0        
        //   455: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   458: aload_0        
        //   459: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   462: arraylength    
        //   463: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gHASH:([B[BI)V
        //   466: bipush          16
        //   468: newarray        B
        //   470: astore          14
        //   472: ldc2_w          8
        //   475: aload_0        
        //   476: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.nonce:[B
        //   479: arraylength    
        //   480: i2l            
        //   481: lmul           
        //   482: aload           14
        //   484: bipush          8
        //   486: invokestatic    org/spongycastle/util/Pack.longToBigEndian:(J[BI)V
        //   489: aload_0        
        //   490: aload_0        
        //   491: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   494: aload           14
        //   496: invokespecial   org/spongycastle/crypto/modes/GCMBlockCipher.gHASHBlock:([B[B)V
        //   499: aload_0        
        //   500: bipush          16
        //   502: newarray        B
        //   504: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.S:[B
        //   507: aload_0        
        //   508: bipush          16
        //   510: newarray        B
        //   512: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_at:[B
        //   515: aload_0        
        //   516: bipush          16
        //   518: newarray        B
        //   520: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.S_atPre:[B
        //   523: aload_0        
        //   524: bipush          16
        //   526: newarray        B
        //   528: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlock:[B
        //   531: aload_0        
        //   532: iconst_0       
        //   533: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atBlockPos:I
        //   536: aload_0        
        //   537: lconst_0       
        //   538: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLength:J
        //   541: aload_0        
        //   542: lconst_0       
        //   543: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.atLengthPre:J
        //   546: aload_0        
        //   547: aload_0        
        //   548: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.J0:[B
        //   551: invokestatic    org/spongycastle/util/Arrays.clone:([B)[B
        //   554: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.counter:[B
        //   557: aload_0        
        //   558: iconst_0       
        //   559: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.bufOff:I
        //   562: aload_0        
        //   563: lconst_0       
        //   564: putfield        org/spongycastle/crypto/modes/GCMBlockCipher.totalLength:J
        //   567: aload_0        
        //   568: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   571: ifnull          588
        //   574: aload_0        
        //   575: aload_0        
        //   576: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   579: iconst_0       
        //   580: aload_0        
        //   581: getfield        org/spongycastle/crypto/modes/GCMBlockCipher.initialAssociatedText:[B
        //   584: arraylength    
        //   585: invokevirtual   org/spongycastle/crypto/modes/GCMBlockCipher.processAADBytes:([BII)V
        //   588: return         
        //   589: astore          13
        //   591: aload           13
        //   593: athrow         
        //   594: astore          15
        //   596: aload           15
        //   598: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  75     107    107    112    Ljava/lang/IllegalArgumentException;
        //  132    137    216    221    Ljava/lang/IllegalArgumentException;
        //  197    211    211    216    Ljava/lang/IllegalArgumentException;
        //  239    253    298    303    Ljava/lang/IllegalArgumentException;
        //  258    267    281    286    Ljava/lang/IllegalArgumentException;
        //  267    281    281    286    Ljava/lang/IllegalArgumentException;
        //  300    303    281    286    Ljava/lang/IllegalArgumentException;
        //  308    366    396    401    Ljava/lang/IllegalArgumentException;
        //  370    391    391    396    Ljava/lang/IllegalArgumentException;
        //  398    401    391    396    Ljava/lang/IllegalArgumentException;
        //  401    445    589    594    Ljava/lang/IllegalArgumentException;
        //  499    588    594    599    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0499:
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
    public void processAADByte(final byte b) {
        try {
            this.atBlock[this.atBlockPos] = b;
            final int atBlockPos = 1 + this.atBlockPos;
            this.atBlockPos = atBlockPos;
            if (atBlockPos == 16) {
                this.gHASHBlock(this.S_at, this.atBlock);
                this.atBlockPos = 0;
                this.atLength += 16L;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    public void processAADBytes(final byte[] array, final int n, final int n2) {
        int n3 = 0;
        final boolean a = SICBlockCipher.a;
        while (true) {
            if (n3 >= n2) {
                return;
            }
            try {
                this.atBlock[this.atBlockPos] = array[n + n3];
                final int atBlockPos = 1 + this.atBlockPos;
                this.atBlockPos = atBlockPos;
                if (atBlockPos == 16) {
                    this.gHASHBlock(this.S_at, this.atBlock);
                    this.atBlockPos = 0;
                    this.atLength += 16L;
                }
                ++n3;
                if (a) {
                    return;
                }
                continue;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public int processByte(final byte b, final byte[] array, final int n) {
        try {
            this.bufBlock[this.bufOff] = b;
            final int bufOff = 1 + this.bufOff;
            this.bufOff = bufOff;
            if (bufOff == this.bufBlock.length) {
                this.outputBlock(array, n);
                return 16;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return 0;
    }
    
    @Override
    public int processBytes(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        int n4 = 0;
        final boolean a = SICBlockCipher.a;
        try {
            if (array.length < n + n2) {
                throw new DataLengthException(GCMBlockCipher.z[6]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        int n5 = 0;
        while (true) {
            if (n5 >= n2) {
                return n4;
            }
            try {
                this.bufBlock[this.bufOff] = array[n + n5];
                final int bufOff = 1 + this.bufOff;
                this.bufOff = bufOff;
                if (bufOff == this.bufBlock.length) {
                    this.outputBlock(array2, n3 + n4);
                    n4 += 16;
                }
                ++n5;
                if (a) {
                    return n4;
                }
                continue;
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void reset() {
        this.reset(true);
    }
}
