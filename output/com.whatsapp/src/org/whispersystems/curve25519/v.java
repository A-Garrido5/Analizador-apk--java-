// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class v implements e
{
    private static final String z;
    
    static {
        final char[] charArray = "5\u0007\u0018Wl4\u0001\u001e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = 'f';
                    break;
                }
                case 1: {
                    c2 = 'O';
                    break;
                }
                case 2: {
                    c2 = 'Y';
                    break;
                }
                case 3: {
                    c2 = 'f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    @Override
    public void a(final byte[] array) {
        try {
            SecureRandom.getInstance(v.z).nextBytes(array);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
