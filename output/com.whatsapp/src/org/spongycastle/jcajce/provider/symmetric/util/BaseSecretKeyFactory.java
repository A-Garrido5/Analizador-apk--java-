// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactorySpi;

public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE
{
    private static final String[] z;
    protected String algName;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "\u000f\u000b2\u0018s\u0005\u001c*Uf\u0010\u000b9\u0018j\u0017N%Mo\b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0003';
                    break;
                }
                case 0: {
                    c2 = 'd';
                    break;
                }
                case 1: {
                    c2 = 'n';
                    break;
                }
                case 2: {
                    c2 = 'K';
                    break;
                }
                case 3: {
                    c2 = '8';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "/\u000b2\u0018m\u000b\u001akWeD\u001a2HfD".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0003';
                    break;
                }
                case 0: {
                    c4 = 'd';
                    break;
                }
                case 1: {
                    c4 = 'n';
                    break;
                }
                case 2: {
                    c4 = 'K';
                    break;
                }
                case 3: {
                    c4 = '8';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u000f\u000b2ks\u0001\rkHb\u0016\u000f&]w\u0001\u001ckQpD\u0000>To".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0003';
                    break;
                }
                case 0: {
                    c6 = 'd';
                    break;
                }
                case 1: {
                    c6 = 'n';
                    break;
                }
                case 2: {
                    c6 = 'K';
                    break;
                }
                case 3: {
                    c6 = '8';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u000f\u000b2\u0018s\u0005\u001c*Uf\u0010\u000b9\u0018j\u0017N%Mo\b".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0003';
                    break;
                }
                case 0: {
                    c8 = 'd';
                    break;
                }
                case 1: {
                    c8 = 'n';
                    break;
                }
                case 2: {
                    c8 = 'K';
                    break;
                }
                case 3: {
                    c8 = '8';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "-\u0000=Yo\r\nksf\u001d=;]`".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0003';
                    break;
                }
                case 0: {
                    c10 = 'd';
                    break;
                }
                case 1: {
                    c10 = 'n';
                    break;
                }
                case 2: {
                    c10 = 'K';
                    break;
                }
                case 3: {
                    c10 = '8';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    protected BaseSecretKeyFactory(final String algName) {
        this.algName = algName;
    }
    
    @Override
    protected SecretKey engineGenerateSecret(final KeySpec keySpec) {
        if (keySpec instanceof SecretKeySpec) {
            return (SecretKey)keySpec;
        }
        throw new InvalidKeySpecException(BaseSecretKeyFactory.z[4]);
    }
    
    @Override
    protected KeySpec engineGetKeySpec(final SecretKey secretKey, final Class clazz) {
        if (clazz == null) {
            try {
                throw new InvalidKeySpecException(BaseSecretKeyFactory.z[2]);
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        if (secretKey == null) {
            try {
                throw new InvalidKeySpecException(BaseSecretKeyFactory.z[3]);
            }
            catch (Exception ex2) {
                throw ex2;
            }
        }
        try {
            if (SecretKeySpec.class.isAssignableFrom(clazz)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.algName);
            }
        }
        catch (Exception ex3) {
            throw ex3;
        }
        try {
            return (KeySpec)clazz.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
        }
        catch (Exception ex4) {
            throw new InvalidKeySpecException(ex4.toString());
        }
    }
    
    @Override
    protected SecretKey engineTranslateKey(final SecretKey secretKey) {
        if (secretKey == null) {
            throw new InvalidKeyException(BaseSecretKeyFactory.z[0]);
        }
        if (!secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            throw new InvalidKeyException(BaseSecretKeyFactory.z[1] + this.algName + ".");
        }
        return new SecretKeySpec(secretKey.getEncoded(), this.algName);
    }
}
