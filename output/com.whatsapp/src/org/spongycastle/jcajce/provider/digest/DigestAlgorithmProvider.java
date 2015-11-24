// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

abstract class DigestAlgorithmProvider extends AlgorithmProvider
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        final char[] charArray = "\u0012o*j".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'j';
                    break;
                }
                case 0: {
                    c2 = 'Z';
                    break;
                }
                case 1: {
                    c2 = '\"';
                    break;
                }
                case 2: {
                    c2 = 'k';
                    break;
                }
                case 3: {
                    c2 = ')';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0017C\b\u0007".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'j';
                    break;
                }
                case 0: {
                    c4 = 'Z';
                    break;
                }
                case 1: {
                    c4 = '\"';
                    break;
                }
                case 2: {
                    c4 = 'k';
                    break;
                }
                case 3: {
                    c4 = ')';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u001bN\f\u0007+6K\nZD\u0011G\u0012n\u000f4G\u0019H\u001e5PEa'\u001baD".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'j';
                    break;
                }
                case 0: {
                    c6 = 'Z';
                    break;
                }
                case 1: {
                    c6 = '\"';
                    break;
                }
                case 2: {
                    c6 = 'k';
                    break;
                }
                case 3: {
                    c6 = ')';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0011G\u0012n\u000f4G\u0019H\u001e5PE".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'j';
                    break;
                }
                case 0: {
                    c8 = 'Z';
                    break;
                }
                case 1: {
                    c8 = '\"';
                    break;
                }
                case 2: {
                    c8 = 'k';
                    break;
                }
                case 3: {
                    c8 = ')';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u001bN\f\u0007+6K\nZD\u0017C\b\u0007\"\u0017c(\u0006".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'j';
                    break;
                }
                case 0: {
                    c10 = 'Z';
                    break;
                }
                case 1: {
                    c10 = '\"';
                    break;
                }
                case 2: {
                    c10 = 'k';
                    break;
                }
                case 3: {
                    c10 = ')';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u001bN\f\u0007+6K\nZD\u0011G\u0012n\u000f4G\u0019H\u001e5PEa'\u001baF".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'j';
                    break;
                }
                case 0: {
                    c12 = 'Z';
                    break;
                }
                case 1: {
                    c12 = '\"';
                    break;
                }
                case 2: {
                    c12 = 'k';
                    break;
                }
                case 3: {
                    c12 = ')';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u001bN\f\u0007+6K\nZD\u0017C\b\u0007\"\u0017c(\u0004".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'j';
                    break;
                }
                case 0: {
                    c14 = 'Z';
                    break;
                }
                case 1: {
                    c14 = '\"';
                    break;
                }
                case 2: {
                    c14 = 'k';
                    break;
                }
                case 3: {
                    c14 = ')';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        z = z2;
    }
    
    protected void addHMACAlgorithm(final ConfigurableProvider configurableProvider, final String s, final String s2, final String s3) {
        final int a = BCMessageDigest.a;
        final String string = DigestAlgorithmProvider.z[0] + s;
        configurableProvider.addAlgorithm(DigestAlgorithmProvider.z[1] + string, s2);
        configurableProvider.addAlgorithm(DigestAlgorithmProvider.z[6] + s, string);
        configurableProvider.addAlgorithm(DigestAlgorithmProvider.z[4] + s, string);
        configurableProvider.addAlgorithm(DigestAlgorithmProvider.z[3] + string, s3);
        configurableProvider.addAlgorithm(DigestAlgorithmProvider.z[5] + s, string);
        configurableProvider.addAlgorithm(DigestAlgorithmProvider.z[2] + s, string);
        if (BaseKeyGenerator.a) {
            BCMessageDigest.a = a + 1;
        }
    }
}
