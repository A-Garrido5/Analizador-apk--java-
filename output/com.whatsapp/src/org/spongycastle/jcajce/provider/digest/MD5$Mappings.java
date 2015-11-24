// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

public class MD5$Mappings extends DigestAlgorithmProvider
{
    private static final String PREFIX;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "`\rtI\u0012\t$v".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'z';
                    break;
                }
                case 0: {
                    c2 = 'D';
                    break;
                }
                case 1: {
                    c2 = 'E';
                    break;
                }
                case 2: {
                    c2 = '\u0015';
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
        final char[] charArray2 = "`\u000epC=!+pH\u001b0*g".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'z';
                    break;
                }
                case 0: {
                    c4 = 'D';
                    break;
                }
                case 1: {
                    c4 = 'E';
                    break;
                }
                case 2: {
                    c4 = '\u0015';
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
        final char[] charArray3 = "\t\u0001 ".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'z';
                    break;
                }
                case 0: {
                    c6 = 'D';
                    break;
                }
                case 1: {
                    c6 = 'E';
                    break;
                }
                case 2: {
                    c6 = '\u0015';
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
        final char[] charArray4 = "\t fI\u001b# QS\u001d!6a\u00147\u0000p".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'z';
                    break;
                }
                case 0: {
                    c8 = 'D';
                    break;
                }
                case 1: {
                    c8 = 'E';
                    break;
                }
                case 2: {
                    c8 = '\u0015';
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
        final char[] charArray5 = "`\u0001|]\u001f71".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'z';
                    break;
                }
                case 0: {
                    c10 = 'D';
                    break;
                }
                case 1: {
                    c10 = 'E';
                    break;
                }
                case 2: {
                    c10 = '\u0015';
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
        z = z2;
        PREFIX = MD5.class.getName();
    }
    
    @Override
    public void configure(final ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(MD5$Mappings.z[3], MD5$Mappings.PREFIX + MD5$Mappings.z[4]);
        this.addHMACAlgorithm(configurableProvider, MD5$Mappings.z[2], MD5$Mappings.PREFIX + MD5$Mappings.z[0], MD5$Mappings.PREFIX + MD5$Mappings.z[1]);
    }
}
