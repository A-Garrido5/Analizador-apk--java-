// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import org.spongycastle.crypto.DataLengthException;
import javax.crypto.ShortBufferException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.AlgorithmParameters;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.StreamCipher;

public class BaseStreamCipher extends BaseWrapCipher implements PBE
{
    private static final String[] z;
    private Class[] availableSpecs;
    private StreamCipher cipher;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    
    static {
        final String[] z2 = new String[14];
        final char[] charArray = "nZ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = '\u0019';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = '[';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "svz:\u000bYpD<".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'o';
                    break;
                }
                case 0: {
                    c4 = '=';
                    break;
                }
                case 1: {
                    c4 = '\u0019';
                    break;
                }
                case 2: {
                    c4 = '*';
                    break;
                }
                case 3: {
                    c4 = '[';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "mxN?\u0006S~\n".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'o';
                    break;
                }
                case 0: {
                    c6 = '=';
                    break;
                }
                case 1: {
                    c6 = '\u0019';
                    break;
                }
                case 2: {
                    c6 = '*';
                    break;
                }
                case 3: {
                    c6 = '[';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u001dlD0\u0001RnDu".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'o';
                    break;
                }
                case 0: {
                    c8 = '=';
                    break;
                }
                case 1: {
                    c8 = '\u0019';
                    break;
                }
                case 2: {
                    c8 = '*';
                    break;
                }
                case 3: {
                    c8 = '[';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "xZh".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'o';
                    break;
                }
                case 0: {
                    c10 = '=';
                    break;
                }
                case 1: {
                    c10 = '\u0019';
                    break;
                }
                case 2: {
                    c10 = '*';
                    break;
                }
                case 3: {
                    c10 = '[';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "^xD|\u001b\u001dj_+\u001fRk^{\u0002R}O{".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'o';
                    break;
                }
                case 0: {
                    c12 = '=';
                    break;
                }
                case 1: {
                    c12 = '\u0019';
                    break;
                }
                case 2: {
                    c12 = '*';
                    break;
                }
                case 3: {
                    c12 = '[';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "HwA5\u0000Jw\n4\u001fPvN>O".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'o';
                    break;
                }
                case 0: {
                    c14 = '=';
                    break;
                }
                case 1: {
                    c14 = '\u0019';
                    break;
                }
                case 2: {
                    c14 = '*';
                    break;
                }
                case 3: {
                    c14 = '[';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u001diK(\u001cX}".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'o';
                    break;
                }
                case 0: {
                    c16 = '=';
                    break;
                }
                case 1: {
                    c16 = '\u0019';
                    break;
                }
                case 2: {
                    c16 = '*';
                    break;
                }
                case 3: {
                    c16 = '[';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u001dwE/ONlC/\u000e_uO{\tRk\n(\u0016PtO/\u001dTz\n>\u0001O`Z/\u0006Rw\u0004".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'o';
                    break;
                }
                case 0: {
                    c18 = '=';
                    break;
                }
                case 1: {
                    c18 = '\u0019';
                    break;
                }
                case 2: {
                    c18 = '*';
                    break;
                }
                case 3: {
                    c18 = '[';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "m[o{\u001dXh_2\u001dXj\n\u000b-x9Z:\u001d\\tO/\nOj\n/\u0000\u001d{O{\u001cXm\u0004".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'o';
                    break;
                }
                case 0: {
                    c20 = '=';
                    break;
                }
                case 1: {
                    c20 = '\u0019';
                    break;
                }
                case 2: {
                    c20 = '*';
                    break;
                }
                case 3: {
                    c20 = '[';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "Sv\n\u00129\u001djO/OJqO5ORwO{\nEiO8\u001bX}".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 'o';
                    break;
                }
                case 0: {
                    c22 = '=';
                    break;
                }
                case 1: {
                    c22 = '\u0019';
                    break;
                }
                case 2: {
                    c22 = '*';
                    break;
                }
                case 3: {
                    c22 = '[';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "v|S{\tRk\n:\u0003ZvX2\u001bUt\n".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 'o';
                    break;
                }
                case 0: {
                    c24 = '=';
                    break;
                }
                case 1: {
                    c24 = '\u0019';
                    break;
                }
                case 2: {
                    c24 = '*';
                    break;
                }
                case 3: {
                    c24 = '[';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "HwA5\u0000Jw\n+\u000eOxG>\u001bXk\n/\u0016M|\u0004".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = 'o';
                    break;
                }
                case 0: {
                    c26 = '=';
                    break;
                }
                case 1: {
                    c26 = '\u0019';
                    break;
                }
                case 2: {
                    c26 = '*';
                    break;
                }
                case 3: {
                    c26 = '[';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "^xD|\u001b\u001dqK5\u000bQ|\n+\u000eOxG>\u001bXk\n".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = 'o';
                    break;
                }
                case 0: {
                    c28 = '=';
                    break;
                }
                case 1: {
                    c28 = '\u0019';
                    break;
                }
                case 2: {
                    c28 = '*';
                    break;
                }
                case 3: {
                    c28 = '[';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        z = z2;
    }
    
    protected BaseStreamCipher(final StreamCipher cipher, final int ivLength) {
        this.availableSpecs = new Class[] { RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class };
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = cipher;
        this.ivLength = ivLength;
    }
    
    @Override
    protected int engineDoFinal(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        Label_0021: {
            if (n2 == 0) {
                break Label_0021;
            }
            try {
                this.cipher.processBytes(array, n, n2, array2, n3);
                this.cipher.reset();
                return n2;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    protected byte[] engineDoFinal(final byte[] array, final int n, final int n2) {
        if (n2 != 0) {
            final byte[] engineUpdate = this.engineUpdate(array, n, n2);
            this.cipher.reset();
            return engineUpdate;
        }
        this.cipher.reset();
        return new byte[0];
    }
    
    @Override
    protected int engineGetBlockSize() {
        return 0;
    }
    
    @Override
    protected byte[] engineGetIV() {
        try {
            if (this.ivParam != null) {
                return this.ivParam.getIV();
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return null;
    }
    
    @Override
    protected int engineGetKeySize(final Key key) {
        return 8 * key.getEncoded().length;
    }
    
    @Override
    protected int engineGetOutputSize(final int n) {
        return n;
    }
    
    @Override
    protected AlgorithmParameters engineGetParameters() {
        try {
            if (this.engineParams == null && this.pbeSpec != null) {
                final BaseStreamCipher baseStreamCipher = this;
                final String s = baseStreamCipher.pbeAlgorithm;
                final String[] array = BaseStreamCipher.z;
                final int n = 0;
                final String s2 = array[n];
                final AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(s, s2);
                final AlgorithmParameters algorithmParameters3;
                final AlgorithmParameters algorithmParameters2 = algorithmParameters3 = algorithmParameters;
                final BaseStreamCipher baseStreamCipher2 = this;
                final PBEParameterSpec pbeParameterSpec = baseStreamCipher2.pbeSpec;
                algorithmParameters3.init(pbeParameterSpec);
                return algorithmParameters2;
            }
            return this.engineParams;
        }
        catch (Exception ex) {
            throw ex;
        }
        try {
            final BaseStreamCipher baseStreamCipher = this;
            final String s = baseStreamCipher.pbeAlgorithm;
            final String[] array = BaseStreamCipher.z;
            final int n = 0;
            final String s2 = array[n];
            final AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(s, s2);
            final AlgorithmParameters algorithmParameters3;
            final AlgorithmParameters algorithmParameters2 = algorithmParameters3 = algorithmParameters;
            final BaseStreamCipher baseStreamCipher2 = this;
            final PBEParameterSpec pbeParameterSpec = baseStreamCipher2.pbeSpec;
            algorithmParameters3.init(pbeParameterSpec);
            return algorithmParameters2;
        }
        catch (Exception ex2) {
            return null;
        }
        return this.engineParams;
    }
    
    @Override
    protected void engineInit(final int n, final Key key, final AlgorithmParameters engineParams, final SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec = null;
        if (engineParams != null) {
            int n2 = 0;
        Label_0034_Outer:
            while (true) {
                while (true) {
                    Label_0089: {
                        if (n2 == this.availableSpecs.length) {
                            break Label_0089;
                        }
                        try {
                            parameterSpec = engineParams.getParameterSpec((Class<AlgorithmParameterSpec>)this.availableSpecs[n2]);
                            if (parameterSpec != null) {
                                break;
                            }
                            try {
                                throw new InvalidAlgorithmParameterException(BaseStreamCipher.z[13] + engineParams.toString());
                            }
                            catch (Exception ex) {
                                throw ex;
                            }
                        }
                        catch (Exception ex2) {
                            ++n2;
                            if (BaseMac.a == 0) {
                                continue Label_0034_Outer;
                            }
                        }
                    }
                    parameterSpec = null;
                    continue;
                }
            }
        }
        else {
            parameterSpec = null;
        }
        this.engineInit(n, key, parameterSpec, secureRandom);
        this.engineParams = engineParams;
    }
    
    @Override
    protected void engineInit(final int n, final Key key, final SecureRandom secureRandom) {
        try {
            this.engineInit(n, key, (AlgorithmParameterSpec)null, secureRandom);
        }
        catch (InvalidAlgorithmParameterException ex) {
            throw new InvalidKeyException(ex.getMessage());
        }
    }
    
    @Override
    protected void engineInit(final int p0, final Key p1, final AlgorithmParameterSpec p2, final SecureRandom p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseMac.a:I
        //     3: istore          5
        //     5: aload_0        
        //     6: aconst_null    
        //     7: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //    10: aload_0        
        //    11: aconst_null    
        //    12: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.pbeAlgorithm:Ljava/lang/String;
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.engineParams:Ljava/security/AlgorithmParameters;
        //    20: aload_2        
        //    21: instanceof      Ljavax/crypto/SecretKey;
        //    24: ifne            77
        //    27: new             Ljava/security/InvalidKeyException;
        //    30: dup            
        //    31: new             Ljava/lang/StringBuilder;
        //    34: dup            
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //    41: bipush          11
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: aload_2        
        //    48: invokeinterface java/security/Key.getAlgorithm:()Ljava/lang/String;
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    56: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //    59: bipush          8
        //    61: aaload         
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    68: invokespecial   java/security/InvalidKeyException.<init>:(Ljava/lang/String;)V
        //    71: athrow         
        //    72: astore          6
        //    74: aload           6
        //    76: athrow         
        //    77: aload_2        
        //    78: instanceof      Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;
        //    81: ifeq            231
        //    84: aload_2        
        //    85: checkcast       Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;
        //    88: astore          22
        //    90: aload_0        
        //    91: aload           22
        //    93: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getAlgorithm:()Ljava/lang/String;
        //    96: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.pbeAlgorithm:Ljava/lang/String;
        //    99: aload           22
        //   101: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getParam:()Lorg/spongycastle/crypto/CipherParameters;
        //   104: ifnull          140
        //   107: aload           22
        //   109: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getParam:()Lorg/spongycastle/crypto/CipherParameters;
        //   112: astore          27
        //   114: aload_0        
        //   115: new             Ljavax/crypto/spec/PBEParameterSpec;
        //   118: dup            
        //   119: aload           22
        //   121: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getSalt:()[B
        //   124: aload           22
        //   126: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getIterationCount:()I
        //   129: invokespecial   javax/crypto/spec/PBEParameterSpec.<init>:([BI)V
        //   132: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //   135: iload           5
        //   137: ifeq            209
        //   140: aload_3        
        //   141: instanceof      Ljavax/crypto/spec/PBEParameterSpec;
        //   144: istore          24
        //   146: iload           24
        //   148: ifeq            181
        //   151: aload           22
        //   153: aload_3        
        //   154: aload_0        
        //   155: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.cipher:Lorg/spongycastle/crypto/StreamCipher;
        //   158: invokeinterface org/spongycastle/crypto/StreamCipher.getAlgorithmName:()Ljava/lang/String;
        //   163: invokestatic    org/spongycastle/jcajce/provider/symmetric/util/PBE$Util.makePBEParameters:(Lorg/spongycastle/jcajce/provider/symmetric/util/BCPBEKey;Ljava/security/spec/AlgorithmParameterSpec;Ljava/lang/String;)Lorg/spongycastle/crypto/CipherParameters;
        //   166: astore          26
        //   168: aload_0        
        //   169: aload_3        
        //   170: checkcast       Ljavax/crypto/spec/PBEParameterSpec;
        //   173: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.pbeSpec:Ljavax/crypto/spec/PBEParameterSpec;
        //   176: iload           5
        //   178: ifeq            205
        //   181: new             Ljava/security/InvalidAlgorithmParameterException;
        //   184: dup            
        //   185: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //   188: bipush          9
        //   190: aaload         
        //   191: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   194: athrow         
        //   195: astore          25
        //   197: aload           25
        //   199: athrow         
        //   200: astore          23
        //   202: aload           23
        //   204: athrow         
        //   205: aload           26
        //   207: astore          27
        //   209: aload           22
        //   211: invokevirtual   org/spongycastle/jcajce/provider/symmetric/util/BCPBEKey.getIvSize:()I
        //   214: ifle            226
        //   217: aload_0        
        //   218: aload           27
        //   220: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   223: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   226: iload           5
        //   228: ifeq            600
        //   231: aload_3        
        //   232: ifnonnull       255
        //   235: new             Lorg/spongycastle/crypto/params/KeyParameter;
        //   238: dup            
        //   239: aload_2        
        //   240: invokeinterface java/security/Key.getEncoded:()[B
        //   245: invokespecial   org/spongycastle/crypto/params/KeyParameter.<init>:([B)V
        //   248: astore          7
        //   250: iload           5
        //   252: ifeq            593
        //   255: aload_3        
        //   256: instanceof      Ljavax/crypto/spec/IvParameterSpec;
        //   259: istore          19
        //   261: iload           19
        //   263: ifeq            309
        //   266: new             Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   269: dup            
        //   270: new             Lorg/spongycastle/crypto/params/KeyParameter;
        //   273: dup            
        //   274: aload_2        
        //   275: invokeinterface java/security/Key.getEncoded:()[B
        //   280: invokespecial   org/spongycastle/crypto/params/KeyParameter.<init>:([B)V
        //   283: aload_3        
        //   284: checkcast       Ljavax/crypto/spec/IvParameterSpec;
        //   287: invokevirtual   javax/crypto/spec/IvParameterSpec.getIV:()[B
        //   290: invokespecial   org/spongycastle/crypto/params/ParametersWithIV.<init>:(Lorg/spongycastle/crypto/CipherParameters;[B)V
        //   293: astore          20
        //   295: aload_0        
        //   296: aload           20
        //   298: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   301: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   304: iload           5
        //   306: ifeq            338
        //   309: new             Ljava/security/InvalidAlgorithmParameterException;
        //   312: dup            
        //   313: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //   316: bipush          12
        //   318: aaload         
        //   319: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   322: athrow         
        //   323: astore          21
        //   325: aload           21
        //   327: athrow         
        //   328: astore          28
        //   330: aload           28
        //   332: athrow         
        //   333: astore          18
        //   335: aload           18
        //   337: athrow         
        //   338: aload           20
        //   340: astore          8
        //   342: aload_0        
        //   343: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.ivLength:I
        //   346: ifeq            451
        //   349: aload           8
        //   351: instanceof      Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   354: istore          15
        //   356: iload           15
        //   358: ifne            451
        //   361: aload           4
        //   363: ifnonnull       375
        //   366: new             Ljava/security/SecureRandom;
        //   369: dup            
        //   370: invokespecial   java/security/SecureRandom.<init>:()V
        //   373: astore          4
        //   375: iload_1        
        //   376: iconst_1       
        //   377: if_icmpeq       385
        //   380: iload_1        
        //   381: iconst_3       
        //   382: if_icmpne       427
        //   385: aload_0        
        //   386: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.ivLength:I
        //   389: newarray        B
        //   391: astore          16
        //   393: aload           4
        //   395: aload           16
        //   397: invokevirtual   java/security/SecureRandom.nextBytes:([B)V
        //   400: new             Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   403: dup            
        //   404: aload           8
        //   406: aload           16
        //   408: invokespecial   org/spongycastle/crypto/params/ParametersWithIV.<init>:(Lorg/spongycastle/crypto/CipherParameters;[B)V
        //   411: astore          10
        //   413: aload_0        
        //   414: aload           10
        //   416: checkcast       Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   419: putfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.ivParam:Lorg/spongycastle/crypto/params/ParametersWithIV;
        //   422: iload           5
        //   424: ifeq            455
        //   427: new             Ljava/security/InvalidAlgorithmParameterException;
        //   430: dup            
        //   431: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //   434: bipush          10
        //   436: aaload         
        //   437: invokespecial   java/security/InvalidAlgorithmParameterException.<init>:(Ljava/lang/String;)V
        //   440: athrow         
        //   441: astore          17
        //   443: aload           17
        //   445: athrow         
        //   446: astore          9
        //   448: aload           9
        //   450: athrow         
        //   451: aload           8
        //   453: astore          10
        //   455: iload_1        
        //   456: tableswitch {
        //                2: 548
        //                3: 565
        //                4: 548
        //                5: 565
        //          default: 488
        //        }
        //   488: new             Ljava/security/InvalidParameterException;
        //   491: dup            
        //   492: new             Ljava/lang/StringBuilder;
        //   495: dup            
        //   496: invokespecial   java/lang/StringBuilder.<init>:()V
        //   499: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //   502: bipush          6
        //   504: aaload         
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: iload_1        
        //   509: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   512: getstatic       org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.z:[Ljava/lang/String;
        //   515: bipush          7
        //   517: aaload         
        //   518: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   521: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   524: invokespecial   java/security/InvalidParameterException.<init>:(Ljava/lang/String;)V
        //   527: athrow         
        //   528: astore          12
        //   530: aload           12
        //   532: athrow         
        //   533: astore          13
        //   535: new             Ljava/security/InvalidKeyException;
        //   538: dup            
        //   539: aload           13
        //   541: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   544: invokespecial   java/security/InvalidKeyException.<init>:(Ljava/lang/String;)V
        //   547: athrow         
        //   548: aload_0        
        //   549: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.cipher:Lorg/spongycastle/crypto/StreamCipher;
        //   552: iconst_1       
        //   553: aload           10
        //   555: invokeinterface org/spongycastle/crypto/StreamCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   560: iload           5
        //   562: ifeq            607
        //   565: aload_0        
        //   566: getfield        org/spongycastle/jcajce/provider/symmetric/util/BaseStreamCipher.cipher:Lorg/spongycastle/crypto/StreamCipher;
        //   569: iconst_0       
        //   570: aload           10
        //   572: invokeinterface org/spongycastle/crypto/StreamCipher.init:(ZLorg/spongycastle/crypto/CipherParameters;)V
        //   577: iload           5
        //   579: ifne            488
        //   582: return         
        //   583: astore          14
        //   585: aload           14
        //   587: athrow         
        //   588: astore          11
        //   590: aload           11
        //   592: athrow         
        //   593: aload           7
        //   595: astore          8
        //   597: goto            342
        //   600: aload           27
        //   602: astore          8
        //   604: goto            342
        //   607: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      72     72     77     Ljava/lang/Exception;
        //  114    135    200    205    Ljava/lang/Exception;
        //  140    146    200    205    Ljava/lang/Exception;
        //  168    176    195    200    Ljava/lang/Exception;
        //  181    195    195    200    Ljava/lang/Exception;
        //  209    226    328    333    Ljava/lang/Exception;
        //  255    261    333    338    Ljava/lang/Exception;
        //  295    304    323    328    Ljava/lang/Exception;
        //  309    323    323    328    Ljava/lang/Exception;
        //  342    356    446    451    Ljava/lang/Exception;
        //  413    422    441    446    Ljava/lang/Exception;
        //  427    441    441    446    Ljava/lang/Exception;
        //  488    528    528    548    Ljava/lang/Exception;
        //  530    533    533    548    Ljava/lang/Exception;
        //  548    560    583    588    Ljava/lang/Exception;
        //  565    577    588    593    Ljava/lang/Exception;
        //  585    588    588    593    Ljava/lang/Exception;
        //  590    593    528    548    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0255:
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
    protected void engineSetMode(final String s) {
        try {
            if (!s.equalsIgnoreCase(BaseStreamCipher.z[4])) {
                throw new IllegalArgumentException(BaseStreamCipher.z[5] + s);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void engineSetPadding(final String s) {
        try {
            if (!s.equalsIgnoreCase(BaseStreamCipher.z[1])) {
                throw new NoSuchPaddingException(BaseStreamCipher.z[2] + s + BaseStreamCipher.z[3]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    protected int engineUpdate(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        try {
            this.cipher.processBytes(array, n, n2, array2, n3);
            return n2;
        }
        catch (DataLengthException ex) {
            throw new ShortBufferException(ex.getMessage());
        }
    }
    
    @Override
    protected byte[] engineUpdate(final byte[] array, final int n, final int n2) {
        final byte[] array2 = new byte[n2];
        this.cipher.processBytes(array, n, n2, array2, 0);
        return array2;
    }
}
