// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

public class SHA1$PBKDF2WithHmacSHA1UTF8 extends SHA1$BasePBKDF2WithHmacSHA1
{
    private static final String z;
    
    static {
        final char[] charArray = "14|'aS!^\u0017O)\u001bV\u0000t)7\u0006".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\'';
                    break;
                }
                case 0: {
                    c2 = 'a';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = '7';
                    break;
                }
                case 3: {
                    c2 = 'c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SHA1$PBKDF2WithHmacSHA1UTF8() {
        super(SHA1$PBKDF2WithHmacSHA1UTF8.z, 5);
    }
}
