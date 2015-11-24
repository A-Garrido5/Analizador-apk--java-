// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum G
{
    public static final G CRAM_MD5;
    public static final G PLAIN;
    private static final G[] b;
    private static final String[] z;
    private final String a;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "q/b\u0019~".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '0';
                    break;
                }
                case 0: {
                    c2 = '!';
                    break;
                }
                case 1: {
                    c2 = 'c';
                    break;
                }
                case 2: {
                    c2 = '#';
                    break;
                }
                case 3: {
                    c2 = 'P';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "q/b\u0019~".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '0';
                    break;
                }
                case 0: {
                    c4 = '!';
                    break;
                }
                case 1: {
                    c4 = 'c';
                    break;
                }
                case 2: {
                    c4 = '#';
                    break;
                }
                case 3: {
                    c4 = 'P';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "b1b\u001d\u001dl'\u0016".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '0';
                    break;
                }
                case 0: {
                    c6 = '!';
                    break;
                }
                case 1: {
                    c6 = 'c';
                    break;
                }
                case 2: {
                    c6 = '#';
                    break;
                }
                case 3: {
                    c6 = 'P';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "b1b\u001dol'\u0016".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '0';
                    break;
                }
                case 0: {
                    c8 = '!';
                    break;
                }
                case 1: {
                    c8 = 'c';
                    break;
                }
                case 2: {
                    c8 = '#';
                    break;
                }
                case 3: {
                    c8 = 'P';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
        PLAIN = new G(G.z[1], 0, G.z[0]);
        CRAM_MD5 = new G(G.z[3], 1, G.z[2]);
        b = new G[] { G.PLAIN, G.CRAM_MD5 };
    }
    
    private G(final String s, final int n, final String a) {
        this.a = a;
    }
    
    public final String getAuthName() {
        return this.a;
    }
}
