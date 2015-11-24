// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

public class SHA1$PBKDF2WithHmacSHA18BIT extends SHA1$BasePBKDF2WithHmacSHA1
{
    private static final String z;
    
    static {
        final char[] charArray = "6bzOSTwX\u007f}.MPhF.a\u0000J{\u0002\u0018Sba".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0015';
                    break;
                }
                case 0: {
                    c2 = 'f';
                    break;
                }
                case 1: {
                    c2 = ' ';
                    break;
                }
                case 2: {
                    c2 = '1';
                    break;
                }
                case 3: {
                    c2 = '\u000b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SHA1$PBKDF2WithHmacSHA18BIT() {
        super(SHA1$PBKDF2WithHmacSHA18BIT.z, 1);
    }
}
