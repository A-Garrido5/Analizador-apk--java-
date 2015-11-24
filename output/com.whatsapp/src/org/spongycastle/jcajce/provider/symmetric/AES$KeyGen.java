// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

public class AES$KeyGen extends BaseKeyGenerator
{
    private static final String z;
    
    static {
        final char[] charArray = "JXV".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'e';
                    break;
                }
                case 0: {
                    c2 = '\u000b';
                    break;
                }
                case 1: {
                    c2 = '\u001d';
                    break;
                }
                case 2: {
                    c2 = '\u0005';
                    break;
                }
                case 3: {
                    c2 = 's';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public AES$KeyGen() {
        this(192);
    }
    
    public AES$KeyGen(final int n) {
        super(AES$KeyGen.z, n, new CipherKeyGenerator());
    }
}
