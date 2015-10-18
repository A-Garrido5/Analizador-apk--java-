// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

public class AES$Mappings extends AlgorithmProvider
{
    private static final String PREFIX;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        final char[] charArray = "xl\u000b\"".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0002';
                    break;
                }
                case 0: {
                    c2 = '\\';
                    break;
                }
                case 1: {
                    c2 = ')';
                    break;
                }
                case 2: {
                    c2 = 'H';
                    break;
                }
                case 3: {
                    c2 = '`';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "xh$\u0007R=[)\rq".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0002';
                    break;
                }
                case 0: {
                    c4 = '\\';
                    break;
                }
                case 1: {
                    c4 = ')';
                    break;
                }
                case 2: {
                    c4 = 'H';
                    break;
                }
                case 3: {
                    c4 = '`';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u001dE/\u000fp5] \rR=[)\rg(L:'g2L:\u0001v3[f!G\u000f".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0002';
                    break;
                }
                case 0: {
                    c6 = '\\';
                    break;
                }
                case 1: {
                    c6 = ')';
                    break;
                }
                case 2: {
                    c6 = 'H';
                    break;
                }
                case 3: {
                    c6 = '`';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0017L1'g2L:\u0001v3[f!G\u000f".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0002';
                    break;
                }
                case 0: {
                    c8 = '\\';
                    break;
                }
                case 1: {
                    c8 = ')';
                    break;
                }
                case 2: {
                    c8 = 'H';
                    break;
                }
                case 3: {
                    c8 = '`';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u001f@8\bg.\u0007\t%Q".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0002';
                    break;
                }
                case 0: {
                    c10 = '\\';
                    break;
                }
                case 1: {
                    c10 = ')';
                    break;
                }
                case 2: {
                    c10 = 'H';
                    break;
                }
                case 3: {
                    c10 = '`';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u001dE/\u000fp5] \rR=[)\rg(L:\u0013,\u001dl\u001b".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u0002';
                    break;
                }
                case 0: {
                    c12 = '\\';
                    break;
                }
                case 1: {
                    c12 = ')';
                    break;
                }
                case 2: {
                    c12 = 'H';
                    break;
                }
                case 3: {
                    c12 = '`';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "xh$\u0007R=[)\rE9G".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u0002';
                    break;
                }
                case 0: {
                    c14 = '\\';
                    break;
                }
                case 1: {
                    c14 = ')';
                    break;
                }
                case 2: {
                    c14 = 'H';
                    break;
                }
                case 3: {
                    c14 = '`';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "xb-\u0019E9G".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\u0002';
                    break;
                }
                case 0: {
                    c16 = '\\';
                    break;
                }
                case 1: {
                    c16 = ')';
                    break;
                }
                case 2: {
                    c16 = 'H';
                    break;
                }
                case 3: {
                    c16 = '`';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        z = z2;
        PREFIX = AES.class.getName();
    }
    
    @Override
    public void configure(final ConfigurableProvider configurableProvider) {
        final int a = AES.a;
        configurableProvider.addAlgorithm(AES$Mappings.z[5], AES$Mappings.PREFIX + AES$Mappings.z[1]);
        configurableProvider.addAlgorithm(AES$Mappings.z[2], AES$Mappings.PREFIX + AES$Mappings.z[6]);
        configurableProvider.addAlgorithm(AES$Mappings.z[4], AES$Mappings.PREFIX + AES$Mappings.z[0]);
        configurableProvider.addAlgorithm(AES$Mappings.z[3], AES$Mappings.PREFIX + AES$Mappings.z[7]);
        if (a != 0) {
            final boolean a2 = BaseKeyGenerator.a;
            boolean a3 = false;
            if (!a2) {
                a3 = true;
            }
            BaseKeyGenerator.a = a3;
        }
    }
}
