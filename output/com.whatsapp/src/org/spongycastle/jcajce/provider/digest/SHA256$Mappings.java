// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

public class SHA256$Mappings extends DigestAlgorithmProvider
{
    private static final String PREFIX;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        final char[] charArray = "b\u000fG\u0017\f\u0004q".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '>';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = 'G';
                    break;
                }
                case 2: {
                    c2 = '\u0006';
                    break;
                }
                case 3: {
                    c2 = ':';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0015\u000fgIV|&e".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '>';
                    break;
                }
                case 0: {
                    c4 = '1';
                    break;
                }
                case 1: {
                    c4 = 'G';
                    break;
                }
                case 2: {
                    c4 = '\u0006';
                    break;
                }
                case 3: {
                    c4 = ':';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0015\fcCyT)cH_E(t".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '>';
                    break;
                }
                case 0: {
                    c6 = '1';
                    break;
                }
                case 1: {
                    c6 = 'G';
                    break;
                }
                case 2: {
                    c6 = '\u0006';
                    break;
                }
                case 3: {
                    c6 = ':';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "|\"uI_V\"BSYT4r\u0014my\u0006+\b\u000b\u0007".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '>';
                    break;
                }
                case 0: {
                    c8 = '1';
                    break;
                }
                case 1: {
                    c8 = 'G';
                    break;
                }
                case 2: {
                    c8 = '\u0006';
                    break;
                }
                case 3: {
                    c8 = ':';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0015\u0003o][B3".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '>';
                    break;
                }
                case 0: {
                    c10 = '1';
                    break;
                }
                case 1: {
                    c10 = 'G';
                    break;
                }
                case 2: {
                    c10 = '\u0006';
                    break;
                }
                case 3: {
                    c10 = ':';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "p+a\u0014\u007f].gI\u0010|\"uI_V\"BSYT4r\u0014my\u00064\u000f\b".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '>';
                    break;
                }
                case 0: {
                    c12 = '1';
                    break;
                }
                case 1: {
                    c12 = 'G';
                    break;
                }
                case 2: {
                    c12 = '\u0006';
                    break;
                }
                case 3: {
                    c12 = ':';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "b\u000fG\b\u000b\u0007".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '>';
                    break;
                }
                case 0: {
                    c14 = '1';
                    break;
                }
                case 1: {
                    c14 = 'G';
                    break;
                }
                case 2: {
                    c14 = '\u0006';
                    break;
                }
                case 3: {
                    c14 = ':';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        z = z2;
        PREFIX = SHA256.class.getName();
    }
    
    @Override
    public void configure(final ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(SHA256$Mappings.z[3], SHA256$Mappings.PREFIX + SHA256$Mappings.z[4]);
        configurableProvider.addAlgorithm(SHA256$Mappings.z[5], SHA256$Mappings.z[0]);
        this.addHMACAlgorithm(configurableProvider, SHA256$Mappings.z[6], SHA256$Mappings.PREFIX + SHA256$Mappings.z[1], SHA256$Mappings.PREFIX + SHA256$Mappings.z[2]);
    }
}
