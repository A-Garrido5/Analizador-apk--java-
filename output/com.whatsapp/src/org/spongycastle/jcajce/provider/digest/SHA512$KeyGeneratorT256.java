// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class SHA512$KeyGeneratorT256 extends BaseKeyGenerator
{
    private static final String z;
    
    static {
        final char[] charArray = "8\u0015n\u000b=8\u0019\u001ay\\_j\u001a~".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'n';
                    break;
                }
                case 0: {
                    c2 = 'p';
                    break;
                }
                case 1: {
                    c2 = 'X';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = 'H';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SHA512$KeyGeneratorT256() {
        super(SHA512$KeyGeneratorT256.z, 256, new CipherKeyGenerator());
    }
}
