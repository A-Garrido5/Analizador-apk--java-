// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class ARC4$KeyGen extends BaseKeyGenerator
{
    private static final String z;
    
    static {
        final char[] charArray = "jB^".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'y';
                    break;
                }
                case 0: {
                    c2 = '8';
                    break;
                }
                case 1: {
                    c2 = '\u0001';
                    break;
                }
                case 2: {
                    c2 = 'j';
                    break;
                }
                case 3: {
                    c2 = 'u';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ARC4$KeyGen() {
        super(ARC4$KeyGen.z, 128, new CipherKeyGenerator());
    }
}
