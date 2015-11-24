// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.paddings;

import org.spongycastle.crypto.InvalidCipherTextException;
import java.security.SecureRandom;

public class PKCS7Padding implements BlockCipherPadding
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\u0010\u0002r\r:\f\fuFx\u0003\fd_-\u0010\u0017sI".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'X';
                    break;
                }
                case 0: {
                    c2 = '`';
                    break;
                }
                case 1: {
                    c2 = 'c';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = '-';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0010\u0002r\r:\f\fuFx\u0003\fd_-\u0010\u0017sI".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'X';
                    break;
                }
                case 0: {
                    c4 = '`';
                    break;
                }
                case 1: {
                    c4 = 'c';
                    break;
                }
                case 2: {
                    c4 = '\u0016';
                    break;
                }
                case 3: {
                    c4 = '-';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "0(U~o".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'X';
                    break;
                }
                case 0: {
                    c6 = '`';
                    break;
                }
                case 1: {
                    c6 = 'c';
                    break;
                }
                case 2: {
                    c6 = '\u0016';
                    break;
                }
                case 3: {
                    c6 = '-';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    @Override
    public int addPadding(final byte[] array, int i) {
        final int a = PaddedBufferedBlockCipher.a;
        final byte b = (byte)(array.length - i);
        while (i < array.length) {
            array[i] = b;
            ++i;
            if (a != 0) {
                break;
            }
        }
        return b;
    }
    
    @Override
    public String getPaddingName() {
        return PKCS7Padding.z[2];
    }
    
    @Override
    public void init(final SecureRandom secureRandom) {
    }
    
    @Override
    public int padCount(final byte[] array) {
        byte b = 1;
        final int a = PaddedBufferedBlockCipher.a;
        final int n = 0xFF & array[-1 + array.length];
        if (n > array.length || n == 0) {
            throw new InvalidCipherTextException(PKCS7Padding.z[b]);
        }
        while (b <= n) {
            if (array[array.length - b] != n) {
                throw new InvalidCipherTextException(PKCS7Padding.z[0]);
            }
            ++b;
            if (a != 0) {
                break;
            }
        }
        return n;
    }
}
