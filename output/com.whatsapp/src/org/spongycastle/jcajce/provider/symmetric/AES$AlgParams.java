// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

public class AES$AlgParams extends IvAlgorithmParameters
{
    private static final String z;
    
    static {
        final char[] charArray = ", yN\t;".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = 'm';
                    break;
                }
                case 1: {
                    c2 = 'e';
                    break;
                }
                case 2: {
                    c2 = '*';
                    break;
                }
                case 3: {
                    c2 = 'n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    protected String engineToString() {
        return AES$AlgParams.z;
    }
}
