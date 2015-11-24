// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public class ARC4$Mappings extends AlgorithmProvider
{
    private static final String PREFIX;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "`=D\u000e".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'e';
                    break;
                }
                case 0: {
                    c2 = '!';
                    break;
                }
                case 1: {
                    c2 = 'o';
                    break;
                }
                case 2: {
                    c2 = '\u0007';
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
        final char[] charArray2 = "b\u0006wR\u0000SAFh&\u0015".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'e';
                    break;
                }
                case 0: {
                    c4 = '!';
                    break;
                }
                case 1: {
                    c4 = 'o';
                    break;
                }
                case 2: {
                    c4 = '\u0007';
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
        final char[] charArray3 = "`\u0003`\u0014$M\u0006fIKb\u0006wR\u0000SAUyQ".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'e';
                    break;
                }
                case 0: {
                    c6 = '!';
                    break;
                }
                case 1: {
                    c6 = 'o';
                    break;
                }
                case 2: {
                    c6 = '\u0007';
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
        final char[] charArray4 = "`\u0003`\u0014$M\u0006fIKb\u0006wR\u0000SAFh&g Rh".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'e';
                    break;
                }
                case 0: {
                    c8 = '!';
                    break;
                }
                case 1: {
                    c8 = 'o';
                    break;
                }
                case 2: {
                    c8 = '\u0007';
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
        final char[] charArray5 = "\u0005-fI\u0000".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'e';
                    break;
                }
                case 0: {
                    c10 = '!';
                    break;
                }
                case 1: {
                    c10 = 'o';
                    break;
                }
                case 2: {
                    c10 = '\u0007';
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
        final char[] charArray6 = "j\n~}\u0000O\nu[\u0011N\u001d){7b[".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'e';
                    break;
                }
                case 0: {
                    c12 = '!';
                    break;
                }
                case 1: {
                    c12 = 'o';
                    break;
                }
                case 2: {
                    c12 = '\u0007';
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
        final char[] charArray7 = "`=D\u000e".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'e';
                    break;
                }
                case 0: {
                    c14 = '!';
                    break;
                }
                case 1: {
                    c14 = 'o';
                    break;
                }
                case 2: {
                    c14 = '\u0007';
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
        final char[] charArray8 = "`=D\u000e".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'e';
                    break;
                }
                case 0: {
                    c16 = '!';
                    break;
                }
                case 1: {
                    c16 = 'o';
                    break;
                }
                case 2: {
                    c16 = '\u0007';
                    break;
                }
                case 3: {
                    c16 = ':';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u0005$bC\"D\u0001".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'e';
                    break;
                }
                case 0: {
                    c18 = '!';
                    break;
                }
                case 1: {
                    c18 = 'o';
                    break;
                }
                case 2: {
                    c18 = '\u0007';
                    break;
                }
                case 3: {
                    c18 = ':';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "`\u0003`\u0014$M\u0006fIKj\n~}\u0000O\nu[\u0011N\u001d)h&\u0015".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'e';
                    break;
                }
                case 0: {
                    c20 = '!';
                    break;
                }
                case 1: {
                    c20 = 'o';
                    break;
                }
                case 2: {
                    c20 = '\u0007';
                    break;
                }
                case 3: {
                    c20 = ':';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        z = z2;
        PREFIX = ARC4.class.getName();
    }
    
    @Override
    public void configure(final ConfigurableProvider configurableProvider) {
        final int a = AES.a;
        configurableProvider.addAlgorithm(ARC4$Mappings.z[1], ARC4$Mappings.PREFIX + ARC4$Mappings.z[4]);
        configurableProvider.addAlgorithm(ARC4$Mappings.z[3], ARC4$Mappings.z[7]);
        configurableProvider.addAlgorithm(ARC4$Mappings.z[2], ARC4$Mappings.z[0]);
        configurableProvider.addAlgorithm(ARC4$Mappings.z[5], ARC4$Mappings.PREFIX + ARC4$Mappings.z[8]);
        configurableProvider.addAlgorithm(ARC4$Mappings.z[9], ARC4$Mappings.z[6]);
        if (BaseKeyGenerator.a) {
            AES.a = a + 1;
        }
    }
}
