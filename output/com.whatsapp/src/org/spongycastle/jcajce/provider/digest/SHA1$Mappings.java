// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

public class SHA1$Mappings extends DigestAlgorithmProvider
{
    private static final String PREFIX;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[15];
        final char[] charArray = "2\u0014\u007fL#Pvjn\u0013~\fPf\u0004E\f|6_T\ri".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'g';
                    break;
                }
                case 0: {
                    c2 = '\u0016';
                    break;
                }
                case 1: {
                    c2 = 'D';
                    break;
                }
                case 2: {
                    c2 = '=';
                    break;
                }
                case 3: {
                    c2 = '\u0007';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "2\u000fX~ s*Xu\u0006b+O".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'g';
                    break;
                }
                case 0: {
                    c4 = '\u0016';
                    break;
                }
                case 1: {
                    c4 = 'D';
                    break;
                }
                case 2: {
                    c4 = '=';
                    break;
                }
                case 3: {
                    c4 = '\u0007';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "F\u0006vC!$\u0013Ts\u000f^)\\d4^\u0005\f".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'g';
                    break;
                }
                case 0: {
                    c6 = '\u0016';
                    break;
                }
                case 1: {
                    c6 = 'D';
                    break;
                }
                case 2: {
                    c6 = '=';
                    break;
                }
                case 3: {
                    c6 = '\u0007';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "[!Nt\u0006q!yn\u0000s7I)4^\u0005\u00106".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'g';
                    break;
                }
                case 0: {
                    c8 = '\u0016';
                    break;
                }
                case 1: {
                    c8 = 'D';
                    break;
                }
                case 2: {
                    c8 = '=';
                    break;
                }
                case 3: {
                    c8 = '\u0007';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "2\u0000T`\u0002e0".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'g';
                    break;
                }
                case 0: {
                    c10 = '\u0016';
                    break;
                }
                case 1: {
                    c10 = 'D';
                    break;
                }
                case 2: {
                    c10 = '=';
                    break;
                }
                case 3: {
                    c10 = '\u0007';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "E!^u\u0002b\u000fX~!w'Ih\u0015ojmE,R\u0002\u000fP\u000eb,uj\u0006u\u0017uFV".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'g';
                    break;
                }
                case 0: {
                    c12 = '\u0016';
                    break;
                }
                case 1: {
                    c12 = 'D';
                    break;
                }
                case 2: {
                    c12 = '=';
                    break;
                }
                case 3: {
                    c12 = '\u0007';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "E\f|6".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'g';
                    break;
                }
                case 0: {
                    c14 = '\u0016';
                    break;
                }
                case 1: {
                    c14 = 'D';
                    break;
                }
                case 2: {
                    c14 = '=';
                    break;
                }
                case 3: {
                    c14 = '\u0007';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "E\f|*V".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'g';
                    break;
                }
                case 0: {
                    c16 = '\u0016';
                    break;
                }
                case 1: {
                    c16 = 'D';
                    break;
                }
                case 2: {
                    c16 = '=';
                    break;
                }
                case 3: {
                    c16 = '\u0007';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "E!^u\u0002b\u000fX~!w'Ih\u0015ojmE,R\u0002\u000fP\u000eb,uj\u0006u\u0017uFVW*Y?%_\u0010".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'g';
                    break;
                }
                case 0: {
                    c18 = '\u0016';
                    break;
                }
                case 1: {
                    c18 = 'D';
                    break;
                }
                case 2: {
                    c18 = '=';
                    break;
                }
                case 3: {
                    c18 = '\u0007';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "W(Z)&z-\\tI[!Nt\u0006q!yn\u0000s7I)4^\u0005\f".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'g';
                    break;
                }
                case 0: {
                    c20 = '\u0016';
                    break;
                }
                case 1: {
                    c20 = 'D';
                    break;
                }
                case 2: {
                    c20 = '=';
                    break;
                }
                case 3: {
                    c20 = '\u0007';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "W(Z)&z-\\tIE!^u\u0002b\u000fX~!w'Ih\u0015ojmE,R\u0002\u000fP\u000eb,uj\u0006u\u0017uFVW*YR3P|".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = 'g';
                    break;
                }
                case 0: {
                    c22 = '\u0016';
                    break;
                }
                case 1: {
                    c22 = 'D';
                    break;
                }
                case 2: {
                    c22 = '=';
                    break;
                }
                case 3: {
                    c22 = '\u0007';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "2\u0014\u007fL#Pvjn\u0013~\fPf\u0004E\f|62B\u0002\u0005".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = 'g';
                    break;
                }
                case 0: {
                    c24 = '\u0016';
                    break;
                }
                case 1: {
                    c24 = 'D';
                    break;
                }
                case 2: {
                    c24 = '=';
                    break;
                }
                case 3: {
                    c24 = '\u0007';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "2\f\\t\u000f[%^".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = 'g';
                    break;
                }
                case 0: {
                    c26 = '\u0016';
                    break;
                }
                case 1: {
                    c26 = 'D';
                    break;
                }
                case 2: {
                    c26 = '=';
                    break;
                }
                case 3: {
                    c26 = '\u0007';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "E\f|*V".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = 'g';
                    break;
                }
                case 0: {
                    c28 = '\u0016';
                    break;
                }
                case 1: {
                    c28 = 'D';
                    break;
                }
                case 2: {
                    c28 = '=';
                    break;
                }
                case 3: {
                    c28 = '\u0007';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "W(Z)&z-\\tI[!Nt\u0006q!yn\u0000s7I)4^\u0005".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = 'g';
                    break;
                }
                case 0: {
                    c30 = '\u0016';
                    break;
                }
                case 1: {
                    c30 = 'D';
                    break;
                }
                case 2: {
                    c30 = '=';
                    break;
                }
                case 3: {
                    c30 = '\u0007';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        z = z2;
        PREFIX = SHA1.class.getName();
    }
    
    @Override
    public void configure(final ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(SHA1$Mappings.z[3], SHA1$Mappings.PREFIX + SHA1$Mappings.z[4]);
        configurableProvider.addAlgorithm(SHA1$Mappings.z[9], SHA1$Mappings.z[13]);
        configurableProvider.addAlgorithm(SHA1$Mappings.z[14], SHA1$Mappings.z[7]);
        this.addHMACAlgorithm(configurableProvider, SHA1$Mappings.z[6], SHA1$Mappings.PREFIX + SHA1$Mappings.z[12], SHA1$Mappings.PREFIX + SHA1$Mappings.z[1]);
        configurableProvider.addAlgorithm(SHA1$Mappings.z[5], SHA1$Mappings.PREFIX + SHA1$Mappings.z[11]);
        configurableProvider.addAlgorithm(SHA1$Mappings.z[10], SHA1$Mappings.z[2]);
        configurableProvider.addAlgorithm(SHA1$Mappings.z[8], SHA1$Mappings.PREFIX + SHA1$Mappings.z[0]);
    }
}
