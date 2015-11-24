// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class SHA256$KeyGenerator extends BaseKeyGenerator
{
    private static final String z;
    
    static {
        final char[] charArray = "<4\\8A<8/N$".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = 't';
                    break;
                }
                case 1: {
                    c2 = 'y';
                    break;
                }
                case 2: {
                    c2 = '\u001d';
                    break;
                }
                case 3: {
                    c2 = '{';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SHA256$KeyGenerator() {
        super(SHA256$KeyGenerator.z, 256, new CipherKeyGenerator());
    }
}
