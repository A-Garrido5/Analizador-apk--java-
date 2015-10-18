// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.spec.InvalidKeySpecException;
import java.security.NoSuchProviderException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.InvalidCipherTextException;
import java.security.InvalidKeyException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.KeyParameter;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.SecureRandom;
import java.security.Key;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.crypto.Wrapper;
import java.security.AlgorithmParameters;
import javax.crypto.CipherSpi;

public abstract class BaseWrapCipher extends CipherSpi implements PBE
{
    private static final String[] z;
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private byte[] iv;
    private int ivSize;
    protected Wrapper wrapEngine;
    
    static {
        final String[] z2 = new String[14];
        final char[] charArray = "'A'1\u0000dS<f\u0004+R=6\u0019+D,6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 't';
                    break;
                }
                case 0: {
                    c2 = 'D';
                    break;
                }
                case 1: {
                    c2 = ' ';
                    break;
                }
                case 2: {
                    c2 = 'I';
                    break;
                }
                case 3: {
                    c2 = '\u0016';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "'A'1\u0000dH(x\u0010(Eif\u00156A$s\u0000!Ri".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 't';
                    break;
                }
                case 0: {
                    c4 = 'D';
                    break;
                }
                case 1: {
                    c4 = ' ';
                    break;
                }
                case 2: {
                    c4 = 'I';
                    break;
                }
                case 3: {
                    c4 = '\u0016';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0014A-r\u001d*Gi".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 't';
                    break;
                }
                case 0: {
                    c6 = 'D';
                    break;
                }
                case 1: {
                    c6 = ' ';
                    break;
                }
                case 2: {
                    c6 = 'I';
                    break;
                }
                case 3: {
                    c6 = '\u0016';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "dU'}\u001a+W'8".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 't';
                    break;
                }
                case 0: {
                    c8 = 'D';
                    break;
                }
                case 1: {
                    c8 = ' ';
                    break;
                }
                case 2: {
                    c8 = 'I';
                    break;
                }
                case 3: {
                    c8 = '\u0016';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "*O=6\u00071P9y\u00060E-6\u0012+Ria\u0006%P9\u007f\u001a#".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 't';
                    break;
                }
                case 0: {
                    c10 = 'D';
                    break;
                }
                case 1: {
                    c10 = ' ';
                    break;
                }
                case 2: {
                    c10 = 'I';
                    break;
                }
                case 3: {
                    c10 = '\u0016';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "!N.\u007f\u001a!\u0000&x\u0018=\u0000?w\u0018-Dip\u001b6\u0000>d\u00154P x\u0013".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 't';
                    break;
                }
                case 0: {
                    c12 = 'D';
                    break;
                }
                case 1: {
                    c12 = ' ';
                    break;
                }
                case 2: {
                    c12 = 'I';
                    break;
                }
                case 3: {
                    c12 = '\u0016';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "!E,}U".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 't';
                    break;
                }
                case 0: {
                    c14 = 'D';
                    break;
                }
                case 1: {
                    c14 = ' ';
                    break;
                }
                case 2: {
                    c14 = 'I';
                    break;
                }
                case 3: {
                    c14 = '\u0016';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u0014b\f6\u0006!Q<\u007f\u0006!SiF6\u0001\u00009w\u0006%M,b\u00116Sib\u001bdB,6\u0007!Tg".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 't';
                    break;
                }
                case 0: {
                    c16 = 'D';
                    break;
                }
                case 1: {
                    c16 = ' ';
                    break;
                }
                case 2: {
                    c16 = 'I';
                    break;
                }
                case 3: {
                    c16 = '\u0016';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "*O=6\u00071P9y\u00060E-6\u0012+Ria\u0006%P9\u007f\u001a#".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 't';
                    break;
                }
                case 0: {
                    c18 = 'D';
                    break;
                }
                case 1: {
                    c18 = ' ';
                    break;
                }
                case 2: {
                    c18 = 'I';
                    break;
                }
                case 3: {
                    c18 = '\u0016';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "\u0007A'x\u001b0\u0000>d\u00154\u0000\"s\rh\u0000'c\u0018(\u0000,x\u0017+D x\u0013j".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 't';
                    break;
                }
                case 0: {
                    c20 = 'D';
                    break;
                }
                case 1: {
                    c20 = ' ';
                    break;
                }
                case 2: {
                    c20 = 'I';
                    break;
                }
                case 3: {
                    c20 = '\u0016';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "\u0011N\"x\u001b3Ni}\u0011=\u0000=o\u0004!\u0000".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 't';
                    break;
                }
                case 0: {
                    c22 = 'D';
                    break;
                }
                case 1: {
                    c22 = ' ';
                    break;
                }
                case 2: {
                    c22 = 'I';
                    break;
                }
                case 3: {
                    c22 = '\u0016';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "\u0017c".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 't';
                    break;
                }
                case 0: {
                    c24 = 'D';
                    break;
                }
                case 1: {
                    c24 = ' ';
                    break;
                }
                case 2: {
                    c24 = 'I';
                    break;
                }
                case 3: {
                    c24 = '\u0016';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "\u0011N\"x\u001b3Ni}\u0011=\u0000=o\u0004!\u0000".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = 't';
                    break;
                }
                case 0: {
                    c26 = 'D';
                    break;
                }
                case 1: {
                    c26 = ' ';
                    break;
                }
                case 2: {
                    c26 = 'I';
                    break;
                }
                case 3: {
                    c26 = '\u0016';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u0011N\"x\u001b3Ni}\u0011=\u0000=o\u0004!\u0000".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = 't';
                    break;
                }
                case 0: {
                    c28 = 'D';
                    break;
                }
                case 1: {
                    c28 = ' ';
                    break;
                }
                case 2: {
                    c28 = 'I';
                    break;
                }
                case 3: {
                    c28 = '\u0016';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        z = z2;
    }
    
    protected BaseWrapCipher() {
        this.availableSpecs = new Class[] { IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class };
        this.engineParams = null;
        this.wrapEngine = null;
    }
    
    protected BaseWrapCipher(final Wrapper wrapper) {
        this(wrapper, 0);
    }
    
    protected BaseWrapCipher(final Wrapper wrapEngine, final int ivSize) {
        this.availableSpecs = new Class[] { IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class };
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapEngine = wrapEngine;
        this.ivSize = ivSize;
    }
    
    @Override
    protected int engineDoFinal(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        return 0;
    }
    
    @Override
    protected byte[] engineDoFinal(final byte[] array, final int n, final int n2) {
        return null;
    }
    
    @Override
    protected int engineGetBlockSize() {
        return 0;
    }
    
    @Override
    protected byte[] engineGetIV() {
        return this.iv.clone();
    }
    
    @Override
    protected int engineGetKeySize(final Key key) {
        return key.getEncoded().length;
    }
    
    @Override
    protected int engineGetOutputSize(final int n) {
        return -1;
    }
    
    @Override
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }
    
    @Override
    protected void engineInit(final int n, final Key key, final AlgorithmParameters engineParams, final SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec = null;
        if (engineParams != null) {
            int n2 = 0;
        Label_0034_Outer:
            while (true) {
                while (true) {
                    Label_0088: {
                        if (n2 == this.availableSpecs.length) {
                            break Label_0088;
                        }
                        try {
                            parameterSpec = engineParams.getParameterSpec((Class<AlgorithmParameterSpec>)this.availableSpecs[n2]);
                            if (parameterSpec != null) {
                                break;
                            }
                            try {
                                throw new InvalidAlgorithmParameterException(BaseWrapCipher.z[1] + engineParams.toString());
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
        this.engineParams = engineParams;
        this.engineInit(n, key, parameterSpec, secureRandom);
    }
    
    @Override
    protected void engineInit(final int n, final Key key, final SecureRandom secureRandom) {
        try {
            this.engineInit(n, key, (AlgorithmParameterSpec)null, secureRandom);
        }
        catch (InvalidAlgorithmParameterException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }
    }
    
    @Override
    protected void engineInit(final int n, final Key key, final AlgorithmParameterSpec algorithmParameterSpec, final SecureRandom secureRandom) {
        final int a = BaseMac.a;
        CipherParameters param = null;
        Label_0119: {
            if (key instanceof BCPBEKey) {
                final BCPBEKey bcpbeKey = (BCPBEKey)key;
                Label_0099: {
                    final CipherParameters pbeParameters;
                    Label_0095: {
                        if (algorithmParameterSpec instanceof PBEParameterSpec) {
                            pbeParameters = PBE$Util.makePBEParameters(bcpbeKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
                            if (a == 0) {
                                break Label_0095;
                            }
                        }
                        try {
                            if (bcpbeKey.getParam() != null) {
                                param = bcpbeKey.getParam();
                                if (a == 0) {
                                    break Label_0099;
                                }
                            }
                            try {
                                throw new InvalidAlgorithmParameterException(BaseWrapCipher.z[7]);
                            }
                            catch (IllegalArgumentException ex) {
                                throw ex;
                            }
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                    param = pbeParameters;
                }
                if (a == 0) {
                    break Label_0119;
                }
            }
            param = new KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            param = new ParametersWithIV(param, ((IvParameterSpec)algorithmParameterSpec).getIV());
        }
        while (true) {
            while (true) {
                Label_0330: {
                    while (true) {
                        CipherParameters cipherParameters = null;
                        Label_0300: {
                            CipherParameters cipherParameters2;
                            try {
                                if (!(param instanceof KeyParameter) || this.ivSize == 0) {
                                    break Label_0330;
                                }
                                secureRandom.nextBytes(this.iv = new byte[this.ivSize]);
                                cipherParameters = new ParametersWithIV(param, this.iv);
                                if (secureRandom == null) {
                                    break Label_0300;
                                }
                                cipherParameters2 = new ParametersWithRandom(cipherParameters, secureRandom);
                                switch (n) {
                                    default: {
                                        System.out.println(BaseWrapCipher.z[6]);
                                        return;
                                    }
                                    case 3: {
                                        break;
                                    }
                                    case 4: {
                                        break Label_0300;
                                        break Label_0300;
                                    }
                                    case 1:
                                    case 2: {
                                        break Label_0300;
                                        break Label_0300;
                                    }
                                }
                            }
                            catch (IllegalArgumentException ex3) {
                                throw ex3;
                            }
                            try {
                                this.wrapEngine.init(true, cipherParameters2);
                                if (a == 0) {
                                    return;
                                }
                                try {
                                    this.wrapEngine.init(false, cipherParameters2);
                                    if (a != 0) {
                                        throw new IllegalArgumentException(BaseWrapCipher.z[5]);
                                    }
                                    return;
                                }
                                catch (IllegalArgumentException ex4) {
                                    throw ex4;
                                }
                            }
                            catch (IllegalArgumentException ex5) {
                                throw ex5;
                            }
                        }
                        CipherParameters cipherParameters2 = cipherParameters;
                        continue;
                    }
                }
                CipherParameters cipherParameters = param;
                continue;
            }
        }
    }
    
    @Override
    protected void engineSetMode(final String s) {
        throw new NoSuchAlgorithmException(BaseWrapCipher.z[0] + s);
    }
    
    @Override
    protected void engineSetPadding(final String s) {
        throw new NoSuchPaddingException(BaseWrapCipher.z[2] + s + BaseWrapCipher.z[3]);
    }
    
    @Override
    protected Key engineUnwrap(final byte[] array, final String s, final int n) {
        Label_0112: {
            byte[] array2 = null;
            try {
                Label_0042: {
                    if (this.wrapEngine == null) {
                        array2 = this.engineDoFinal(array, 0, array.length);
                        if (BaseMac.a == 0) {
                            break Label_0042;
                        }
                    }
                    array2 = this.wrapEngine.unwrap(array, 0, array.length);
                }
                if (n == 3) {
                    final byte[] array3 = array2;
                    final String s2 = s;
                    final SecretKeySpec secretKeySpec = new SecretKeySpec(array3, s2);
                    return secretKeySpec;
                }
                break Label_0112;
            }
            catch (InvalidCipherTextException ex) {
                throw new InvalidKeyException(ex.getMessage());
            }
            catch (BadPaddingException ex2) {
                throw new InvalidKeyException(ex2.getMessage());
            }
            catch (IllegalBlockSizeException ex3) {
                throw new InvalidKeyException(ex3.getMessage());
            }
            try {
                final byte[] array3 = array2;
                final String s2 = s;
                final SecretKeySpec secretKeySpec2;
                final SecretKeySpec secretKeySpec = secretKeySpec2 = new SecretKeySpec(array3, s2);
                return secretKeySpec2;
            }
            catch (InvalidCipherTextException ex4) {
                throw ex4;
            }
            try {
                final KeyFactory instance = KeyFactory.getInstance(s, BaseWrapCipher.z[11]);
                if (n == 1) {
                    return instance.generatePublic(new X509EncodedKeySpec(array2));
                }
                if (n == 2) {
                    try {
                        return instance.generatePrivate(new PKCS8EncodedKeySpec(array2));
                    }
                    catch (InvalidCipherTextException ex5) {
                        throw ex5;
                    }
                }
            }
            catch (NoSuchProviderException ex6) {
                throw new InvalidKeyException(BaseWrapCipher.z[10] + ex6.getMessage());
            }
            catch (InvalidKeySpecException ex7) {
                throw new InvalidKeyException(BaseWrapCipher.z[12] + ex7.getMessage());
            }
        }
        throw new InvalidKeyException(BaseWrapCipher.z[13] + n);
    }
    
    @Override
    protected int engineUpdate(final byte[] array, final int n, final int n2, final byte[] array2, final int n3) {
        throw new RuntimeException(BaseWrapCipher.z[8]);
    }
    
    @Override
    protected byte[] engineUpdate(final byte[] array, final int n, final int n2) {
        throw new RuntimeException(BaseWrapCipher.z[4]);
    }
    
    @Override
    protected byte[] engineWrap(final Key key) {
        final byte[] encoded = key.getEncoded();
        Label_0030: {
            if (encoded != null) {
                break Label_0030;
            }
            try {
                throw new InvalidKeyException(BaseWrapCipher.z[9]);
            }
            catch (BadPaddingException ex) {
                throw ex;
            }
            try {
                try {
                    if (this.wrapEngine == null) {
                        return this.engineDoFinal(encoded, 0, encoded.length);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
                return this.wrapEngine.wrap(encoded, 0, encoded.length);
            }
            catch (BadPaddingException ex3) {
                throw new IllegalBlockSizeException(ex3.getMessage());
            }
        }
    }
}
