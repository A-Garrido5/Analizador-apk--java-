// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class MD5$KeyGenerator extends BaseKeyGenerator
{
    private static final String z;
    
    static {
        final char[] charArray = "cda)\"o\u001c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = ')';
                    break;
                }
                case 2: {
                    c2 = ' ';
                    break;
                }
                case 3: {
                    c2 = 'j';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public MD5$KeyGenerator() {
        super(MD5$KeyGenerator.z, 128, new CipherKeyGenerator());
    }
}
