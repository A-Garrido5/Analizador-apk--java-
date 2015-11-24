// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

public class SHA512$Mappings extends DigestAlgorithmProvider
{
    private static final String PREFIX;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[21];
        final char[] charArray = "E\u000eWEi\u0012>".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\f';
                    break;
                }
                case 0: {
                    c2 = 'a';
                    break;
                }
                case 1: {
                    c2 = 'J';
                    break;
                }
                case 2: {
                    c2 = '>';
                    break;
                }
                case 3: {
                    c2 = '\"';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "E\u000eWEi\u0012>j\u00109W".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\f';
                    break;
                }
                case 0: {
                    c4 = 'a';
                    break;
                }
                case 1: {
                    c4 = 'J';
                    break;
                }
                case 2: {
                    c4 = '>';
                    break;
                }
                case 3: {
                    c4 = '\"';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "E\u0002_Qd,+]".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\f';
                    break;
                }
                case 0: {
                    c6 = 'a';
                    break;
                }
                case 1: {
                    c6 = 'J';
                    break;
                }
                case 2: {
                    c6 = '>';
                    break;
                }
                case 3: {
                    c6 = '\"';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "E\u0002_Qd,+]v>S~".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\f';
                    break;
                }
                case 0: {
                    c8 = 'a';
                    break;
                }
                case 1: {
                    c8 = 'J';
                    break;
                }
                case 2: {
                    c8 = '>';
                    break;
                }
                case 3: {
                    c8 = '\"';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "E\u0001[[K\u0004$[Pm\u0015%L".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\f';
                    break;
                }
                case 0: {
                    c10 = 'a';
                    break;
                }
                case 1: {
                    c10 = 'J';
                    break;
                }
                case 2: {
                    c10 = '>';
                    break;
                }
                case 3: {
                    c10 = '\"';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = " &Y\fM\r#_Q\",/MQm\u0006/zKk\u00049J\f_)\u000b\u000b\u0013>S\u007f\b".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\f';
                    break;
                }
                case 0: {
                    c12 = 'a';
                    break;
                }
                case 1: {
                    c12 = 'J';
                    break;
                }
                case 2: {
                    c12 = '>';
                    break;
                }
                case 3: {
                    c12 = '\"';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = ",/MQm\u0006/zKk\u00049J\f_)\u000b\u0013\u0017=Se\f\u0017:".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\f';
                    break;
                }
                case 0: {
                    c14 = 'a';
                    break;
                }
                case 1: {
                    c14 = 'J';
                    break;
                }
                case 2: {
                    c14 = '>';
                    break;
                }
                case 3: {
                    c14 = '\"';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = " &Y\fM\r#_Q\",/MQm\u0006/zKk\u00049J\f_)\u000b\u000b\u0013>".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\f';
                    break;
                }
                case 0: {
                    c16 = 'a';
                    break;
                }
                case 1: {
                    c16 = 'J';
                    break;
                }
                case 2: {
                    c16 = '>';
                    break;
                }
                case 3: {
                    c16 = '\"';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "2\u0002\u007f\u0017=Se\f\u00108".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\f';
                    break;
                }
                case 0: {
                    c18 = 'a';
                    break;
                }
                case 1: {
                    c18 = 'J';
                    break;
                }
                case 2: {
                    c18 = '>';
                    break;
                }
                case 3: {
                    c18 = '\"';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "E\u0001[[K\u0004$[Pm\u0015%Lv>T|".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '\f';
                    break;
                }
                case 0: {
                    c20 = 'a';
                    break;
                }
                case 1: {
                    c20 = 'J';
                    break;
                }
                case 2: {
                    c20 = '>';
                    break;
                }
                case 3: {
                    c20 = '\"';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "2\u0002\u007f\u000f9Px\u0011\u00109W".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '\f';
                    break;
                }
                case 0: {
                    c22 = 'a';
                    break;
                }
                case 1: {
                    c22 = 'J';
                    break;
                }
                case 2: {
                    c22 = '>';
                    break;
                }
                case 3: {
                    c22 = '\"';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "E\u000eWEi\u0012>j\u0010>U".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '\f';
                    break;
                }
                case 0: {
                    c24 = 'a';
                    break;
                }
                case 1: {
                    c24 = 'J';
                    break;
                }
                case 2: {
                    c24 = '>';
                    break;
                }
                case 3: {
                    c24 = '\"';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "2\u0002\u007f\u000f9Px".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '\f';
                    break;
                }
                case 0: {
                    c26 = 'a';
                    break;
                }
                case 1: {
                    c26 = 'J';
                    break;
                }
                case 2: {
                    c26 = '>';
                    break;
                }
                case 3: {
                    c26 = '\"';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "E\u0001[[K\u0004$[Pm\u0015%Lv>S~".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '\f';
                    break;
                }
                case 0: {
                    c28 = 'a';
                    break;
                }
                case 1: {
                    c28 = 'J';
                    break;
                }
                case 2: {
                    c28 = '>';
                    break;
                }
                case 3: {
                    c28 = '\"';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "2\u0002\u007f\u0017=Se\f\u0017:".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '\f';
                    break;
                }
                case 0: {
                    c30 = 'a';
                    break;
                }
                case 1: {
                    c30 = 'J';
                    break;
                }
                case 2: {
                    c30 = '>';
                    break;
                }
                case 3: {
                    c30 = '\"';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "E\u0002_Qd,+]v>T|".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '\f';
                    break;
                }
                case 0: {
                    c32 = 'a';
                    break;
                }
                case 1: {
                    c32 = 'J';
                    break;
                }
                case 2: {
                    c32 = '>';
                    break;
                }
                case 3: {
                    c32 = '\"';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = ",/MQm\u0006/zKk\u00049J\f_)\u000b\u0013\u0017=S".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '\f';
                    break;
                }
                case 0: {
                    c34 = 'a';
                    break;
                }
                case 1: {
                    c34 = 'J';
                    break;
                }
                case 2: {
                    c34 = '>';
                    break;
                }
                case 3: {
                    c34 = '\"';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "2\u0002\u007f\u0017=S".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '\f';
                    break;
                }
                case 0: {
                    c36 = 'a';
                    break;
                }
                case 1: {
                    c36 = 'J';
                    break;
                }
                case 2: {
                    c36 = '>';
                    break;
                }
                case 3: {
                    c36 = '\"';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = ",/MQm\u0006/zKk\u00049J\f_)\u000b\u0013\u0017=Se\f\u00108".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '\f';
                    break;
                }
                case 0: {
                    c38 = 'a';
                    break;
                }
                case 1: {
                    c38 = 'J';
                    break;
                }
                case 2: {
                    c38 = '>';
                    break;
                }
                case 3: {
                    c38 = '\"';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "2\u0002\u007f\u000f9Px\u0011\u0010>U".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '\f';
                    break;
                }
                case 0: {
                    c40 = 'a';
                    break;
                }
                case 1: {
                    c40 = 'J';
                    break;
                }
                case 2: {
                    c40 = '>';
                    break;
                }
                case 3: {
                    c40 = '\"';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = " &Y\fM\r#_Q\",/MQm\u0006/zKk\u00049J\f_)\u000b\u000b\u0013>Nx\f\u0016".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = '\f';
                    break;
                }
                case 0: {
                    c42 = 'a';
                    break;
                }
                case 1: {
                    c42 = 'J';
                    break;
                }
                case 2: {
                    c42 = '>';
                    break;
                }
                case 3: {
                    c42 = '\"';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        z = z2;
        PREFIX = SHA512.class.getName();
    }
    
    @Override
    public void configure(final ConfigurableProvider configurableProvider) {
        final int a = BCMessageDigest.a;
        configurableProvider.addAlgorithm(SHA512$Mappings.z[16], SHA512$Mappings.PREFIX + SHA512$Mappings.z[0]);
        configurableProvider.addAlgorithm(SHA512$Mappings.z[7], SHA512$Mappings.z[12]);
        configurableProvider.addAlgorithm(SHA512$Mappings.z[18], SHA512$Mappings.PREFIX + SHA512$Mappings.z[11]);
        configurableProvider.addAlgorithm(SHA512$Mappings.z[20], SHA512$Mappings.z[19]);
        configurableProvider.addAlgorithm(SHA512$Mappings.z[6], SHA512$Mappings.PREFIX + SHA512$Mappings.z[1]);
        configurableProvider.addAlgorithm(SHA512$Mappings.z[5], SHA512$Mappings.z[10]);
        this.addHMACAlgorithm(configurableProvider, SHA512$Mappings.z[17], SHA512$Mappings.PREFIX + SHA512$Mappings.z[2], SHA512$Mappings.PREFIX + SHA512$Mappings.z[4]);
        this.addHMACAlgorithm(configurableProvider, SHA512$Mappings.z[8], SHA512$Mappings.PREFIX + SHA512$Mappings.z[3], SHA512$Mappings.PREFIX + SHA512$Mappings.z[13]);
        this.addHMACAlgorithm(configurableProvider, SHA512$Mappings.z[14], SHA512$Mappings.PREFIX + SHA512$Mappings.z[15], SHA512$Mappings.PREFIX + SHA512$Mappings.z[9]);
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
