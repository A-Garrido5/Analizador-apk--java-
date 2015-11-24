// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class SHA512$KeyGeneratorT224 extends BaseKeyGenerator
{
    private static final String z;
    
    static {
        final char[] charArray = "vgJ\u0002svk>p\u0012\u0011\u00189u".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ' ';
                    break;
                }
                case 0: {
                    c2 = '>';
                    break;
                }
                case 1: {
                    c2 = '*';
                    break;
                }
                case 2: {
                    c2 = '\u000b';
                    break;
                }
                case 3: {
                    c2 = 'A';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public SHA512$KeyGeneratorT224() {
        super(SHA512$KeyGeneratorT224.z, 224, new CipherKeyGenerator());
    }
}
