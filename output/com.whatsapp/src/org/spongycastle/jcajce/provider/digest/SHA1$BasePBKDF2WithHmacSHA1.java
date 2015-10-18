// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jcajce.provider.symmetric.util.PBE$Util;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

public class SHA1$BasePBKDF2WithHmacSHA1 extends BaseSecretKeyFactory
{
    private static final String[] z;
    private int scheme;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "z<\u0001\"Ge/\u0016qUg-\u0006(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '0';
                    break;
                }
                case 0: {
                    c2 = '\n';
                    break;
                }
                case 1: {
                    c2 = ']';
                    break;
                }
                case 2: {
                    c2 = 'r';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "z2\u00018Dc+\u0017q[o$R=Ud:\u00069\u0010x8\u0003$Yx8\u0016k\u0010".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '0';
                    break;
                }
                case 0: {
                    c4 = '\n';
                    break;
                }
                case 1: {
                    c4 = ']';
                    break;
                }
                case 2: {
                    c4 = 'r';
                    break;
                }
                case 3: {
                    c4 = 'Q';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "z2\u00018Dc+\u0017qY~8\u00000Dc2\u001cqSe(\u001c%\u0010x8\u0003$Yx8\u0016k\u0010".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '0';
                    break;
                }
                case 0: {
                    c6 = '\n';
                    break;
                }
                case 1: {
                    c6 = ']';
                    break;
                }
                case 2: {
                    c6 = 'r';
                    break;
                }
                case 3: {
                    c6 = 'Q';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "g4\u0001\"Yd:R#U{(\u001b#Un}\u00010\\~".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '0';
                    break;
                }
                case 0: {
                    c8 = '\n';
                    break;
                }
                case 1: {
                    c8 = ']';
                    break;
                }
                case 2: {
                    c8 = 'r';
                    break;
                }
                case 3: {
                    c8 = 'Q';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "C3\u00040\\c9R\u001aUs\u000e\u00024S".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '0';
                    break;
                }
                case 0: {
                    c10 = '\n';
                    break;
                }
                case 1: {
                    c10 = ']';
                    break;
                }
                case 2: {
                    c10 = 'r';
                    break;
                }
                case 3: {
                    c10 = 'Q';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    public SHA1$BasePBKDF2WithHmacSHA1(final String s, final int scheme) {
        super(s);
        this.scheme = scheme;
    }
    
    @Override
    protected SecretKey engineGenerateSecret(final KeySpec keySpec) {
        if (keySpec instanceof PBEKeySpec) {
            final PBEKeySpec pbeKeySpec = (PBEKeySpec)keySpec;
            try {
                if (pbeKeySpec.getSalt() == null) {
                    throw new InvalidKeySpecException(SHA1$BasePBKDF2WithHmacSHA1.z[3]);
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                if (pbeKeySpec.getIterationCount() <= 0) {
                    throw new InvalidKeySpecException(SHA1$BasePBKDF2WithHmacSHA1.z[2] + pbeKeySpec.getIterationCount());
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
            try {
                if (pbeKeySpec.getKeyLength() <= 0) {
                    throw new InvalidKeySpecException(SHA1$BasePBKDF2WithHmacSHA1.z[1] + pbeKeySpec.getKeyLength());
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
            try {
                if (pbeKeySpec.getPassword().length == 0) {
                    throw new IllegalArgumentException(SHA1$BasePBKDF2WithHmacSHA1.z[0]);
                }
            }
            catch (IllegalArgumentException ex4) {
                throw ex4;
            }
            final int keyLength = pbeKeySpec.getKeyLength();
            return new BCPBEKey(this.algName, this.scheme, 1, keyLength, -1, pbeKeySpec, PBE$Util.makePBEMacParameters(pbeKeySpec, this.scheme, 1, keyLength));
        }
        throw new InvalidKeySpecException(SHA1$BasePBKDF2WithHmacSHA1.z[4]);
    }
}
