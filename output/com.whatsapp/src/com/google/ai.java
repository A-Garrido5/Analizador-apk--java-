// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.io.Reader;
import java.io.Closeable;

public class ai implements Closeable
{
    private static final char[] a;
    private static final String[] z;
    private int b;
    private String[] c;
    private int d;
    private String e;
    private int f;
    private long g;
    private final char[] h;
    private int i;
    private int[] j;
    private int k;
    private int l;
    private final Reader m;
    private boolean n;
    private int o;
    private int[] p;
    
    static {
        final String[] z2 = new String[63];
        final char[] charArray = "fR`\"n+_/".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = 'F';
                    break;
                }
                case 1: {
                    c2 = '1';
                    break;
                }
                case 2: {
                    c2 = '\u000f';
                    break;
                }
                case 3: {
                    c2 = 'N';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0003I\u007f+x2Tkn^\buP\u000fI\u0014pVny3E/9z5\u0011".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u001b';
                    break;
                }
                case 0: {
                    c4 = 'F';
                    break;
                }
                case 1: {
                    c4 = '1';
                    break;
                }
                case 2: {
                    c4 = '\u000f';
                    break;
                }
                case 3: {
                    c4 = 'N';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "fP{nw/_jn".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u001b';
                    break;
                }
                case 0: {
                    c6 = 'F';
                    break;
                }
                case 1: {
                    c6 = '1';
                    break;
                }
                case 2: {
                    c6 = '\u000f';
                    break;
                }
                case 3: {
                    c6 = 'N';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "fAn:sf".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u001b';
                    break;
                }
                case 0: {
                    c8 = 'F';
                    break;
                }
                case 1: {
                    c8 = '1';
                    break;
                }
                case 2: {
                    c8 = '\u000f';
                    break;
                }
                case 3: {
                    c8 = 'N';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "fP{nw/_jn".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u001b';
                    break;
                }
                case 0: {
                    c10 = 'F';
                    break;
                }
                case 1: {
                    c10 = '1';
                    break;
                }
                case 2: {
                    c10 = '\u000f';
                    break;
                }
                case 3: {
                    c10 = 'N';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "fAn:sf".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u001b';
                    break;
                }
                case 0: {
                    c12 = 'F';
                    break;
                }
                case 1: {
                    c12 = '1';
                    break;
                }
                case 2: {
                    c12 = '\u000f';
                    break;
                }
                case 3: {
                    c12 = 'N';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u0003I\u007f+x2TknY\u0003vF\u0000D\tsE\u000bX\u0012\u0011m;ofFn=;".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u001b';
                    break;
                }
                case 0: {
                    c14 = 'F';
                    break;
                }
                case 1: {
                    c14 = '1';
                    break;
                }
                case 2: {
                    c14 = '\u000f';
                    break;
                }
                case 3: {
                    c14 = 'N';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "fR`\"n+_/".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\u001b';
                    break;
                }
                case 0: {
                    c16 = 'F';
                    break;
                }
                case 1: {
                    c16 = '1';
                    break;
                }
                case 2: {
                    c16 = '\u000f';
                    break;
                }
                case 3: {
                    c16 = 'N';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u0013BjnQ5^a\u001c~'Uj<55T{\u0002~(Xj onE};~o\u0011{!;'Rl+k2\u0011b/w ^}#~\"\u0011E\u001dT\b".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\u001b';
                    break;
                }
                case 0: {
                    c18 = 'F';
                    break;
                }
                case 1: {
                    c18 = '1';
                    break;
                }
                case 2: {
                    c18 = '\u000f';
                    break;
                }
                case 3: {
                    c18 = 'N';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "fAn:sf".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '\u001b';
                    break;
                }
                case 0: {
                    c20 = 'F';
                    break;
                }
                case 1: {
                    c20 = '1';
                    break;
                }
                case 2: {
                    c20 = '\u000f';
                    break;
                }
                case 3: {
                    c20 = 'N';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "fR`\"n+_/".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '\u001b';
                    break;
                }
                case 0: {
                    c22 = 'F';
                    break;
                }
                case 1: {
                    c22 = '1';
                    break;
                }
                case 2: {
                    c22 = '\u000f';
                    break;
                }
                case 3: {
                    c22 = 'N';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "fP{nw/_jn".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '\u001b';
                    break;
                }
                case 0: {
                    c24 = 'F';
                    break;
                }
                case 1: {
                    c24 = '1';
                    break;
                }
                case 2: {
                    c24 = '\u000f';
                    break;
                }
                case 3: {
                    c24 = 'N';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "fP{nw/_jn".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '\u001b';
                    break;
                }
                case 0: {
                    c26 = 'F';
                    break;
                }
                case 1: {
                    c26 = '1';
                    break;
                }
                case 2: {
                    c26 = '\u000f';
                    break;
                }
                case 3: {
                    c26 = 'N';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u0003I\u007f+x2Tknzf]` |fSz:;1P|n".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '\u001b';
                    break;
                }
                case 0: {
                    c28 = 'F';
                    break;
                }
                case 1: {
                    c28 = '1';
                    break;
                }
                case 2: {
                    c28 = '\u000f';
                    break;
                }
                case 3: {
                    c28 = 'N';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "\u0003I\u007f+x2Tknzf]` |fSz:;1P|n".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '\u001b';
                    break;
                }
                case 0: {
                    c30 = 'F';
                    break;
                }
                case 1: {
                    c30 = '1';
                    break;
                }
                case 2: {
                    c30 = '\u000f';
                    break;
                }
                case 3: {
                    c30 = 'N';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "fAn:sf".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '\u001b';
                    break;
                }
                case 0: {
                    c32 = 'F';
                    break;
                }
                case 1: {
                    c32 = '1';
                    break;
                }
                case 2: {
                    c32 = '\u000f';
                    break;
                }
                case 3: {
                    c32 = 'N';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "fR`\"n+_/".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '\u001b';
                    break;
                }
                case 0: {
                    c34 = 'F';
                    break;
                }
                case 1: {
                    c34 = '1';
                    break;
                }
                case 2: {
                    c34 = '\u000f';
                    break;
                }
                case 3: {
                    c34 = 'N';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "2Cz+".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '\u001b';
                    break;
                }
                case 0: {
                    c36 = 'F';
                    break;
                }
                case 1: {
                    c36 = '1';
                    break;
                }
                case 2: {
                    c36 = '\u000f';
                    break;
                }
                case 3: {
                    c36 = 'N';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "\u0000pC\u001d^".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '\u001b';
                    break;
                }
                case 0: {
                    c38 = 'F';
                    break;
                }
                case 1: {
                    c38 = '1';
                    break;
                }
                case 2: {
                    c38 = '\u000f';
                    break;
                }
                case 3: {
                    c38 = 'N';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "\u0012cZ\u000b".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '\u001b';
                    break;
                }
                case 0: {
                    c40 = 'F';
                    break;
                }
                case 1: {
                    c40 = '1';
                    break;
                }
                case 2: {
                    c40 = '\u000f';
                    break;
                }
                case 3: {
                    c40 = 'N';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "(Dc\"".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = '\u001b';
                    break;
                }
                case 0: {
                    c42 = 'F';
                    break;
                }
                case 1: {
                    c42 = '1';
                    break;
                }
                case 2: {
                    c42 = '\u000f';
                    break;
                }
                case 3: {
                    c42 = 'N';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "\bdC\u0002".toCharArray();
        for (int length18 = charArray22.length, n22 = 0; length18 > n22; ++n22) {
            final char c43 = charArray22[n22];
            char c44 = '\0';
            switch (n22 % 5) {
                default: {
                    c44 = '\u001b';
                    break;
                }
                case 0: {
                    c44 = 'F';
                    break;
                }
                case 1: {
                    c44 = '1';
                    break;
                }
                case 2: {
                    c44 = '\u000f';
                    break;
                }
                case 3: {
                    c44 = 'N';
                    break;
                }
            }
            charArray22[n22] = (char)(c44 ^ c43);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = " Pc=~".toCharArray();
        for (int length19 = charArray23.length, n23 = 0; length19 > n23; ++n23) {
            final char c45 = charArray23[n23];
            char c46 = '\0';
            switch (n23 % 5) {
                default: {
                    c46 = '\u001b';
                    break;
                }
                case 0: {
                    c46 = 'F';
                    break;
                }
                case 1: {
                    c46 = '1';
                    break;
                }
                case 2: {
                    c46 = '\u000f';
                    break;
                }
                case 3: {
                    c46 = 'N';
                    break;
                }
            }
            charArray23[n23] = (char)(c46 ^ c45);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "(Dc\"".toCharArray();
        for (int length20 = charArray24.length, n24 = 0; length20 > n24; ++n24) {
            final char c47 = charArray24[n24];
            char c48 = '\0';
            switch (n24 % 5) {
                default: {
                    c48 = '\u001b';
                    break;
                }
                case 0: {
                    c48 = 'F';
                    break;
                }
                case 1: {
                    c48 = '1';
                    break;
                }
                case 2: {
                    c48 = '\u000f';
                    break;
                }
                case 3: {
                    c48 = 'N';
                    break;
                }
            }
            charArray24[n24] = (char)(c48 ^ c47);
        }
        z2[23] = new String(charArray24).intern();
        final char[] charArray25 = "\u0013_{+i+Xa/o#U/+h%P\u007f+;5T~;~(Rj".toCharArray();
        for (int length21 = charArray25.length, n25 = 0; length21 > n25; ++n25) {
            final char c49 = charArray25[n25];
            char c50 = '\0';
            switch (n25 % 5) {
                default: {
                    c50 = '\u001b';
                    break;
                }
                case 0: {
                    c50 = 'F';
                    break;
                }
                case 1: {
                    c50 = '1';
                    break;
                }
                case 2: {
                    c50 = '\u000f';
                    break;
                }
                case 3: {
                    c50 = 'N';
                    break;
                }
            }
            charArray25[n25] = (char)(c50 ^ c49);
        }
        z2[24] = new String(charArray25).intern();
        final char[] charArray26 = "\u001aD".toCharArray();
        for (int length22 = charArray26.length, n26 = 0; length22 > n26; ++n26) {
            final char c51 = charArray26[n26];
            char c52 = '\0';
            switch (n26 % 5) {
                default: {
                    c52 = '\u001b';
                    break;
                }
                case 0: {
                    c52 = 'F';
                    break;
                }
                case 1: {
                    c52 = '1';
                    break;
                }
                case 2: {
                    c52 = '\u000f';
                    break;
                }
                case 3: {
                    c52 = 'N';
                    break;
                }
            }
            charArray26[n26] = (char)(c52 ^ c51);
        }
        z2[25] = new String(charArray26).intern();
        final char[] charArray27 = "\u0013_{+i+Xa/o#U/+h%P\u007f+;5T~;~(Rj".toCharArray();
        for (int length23 = charArray27.length, n27 = 0; length23 > n27; ++n27) {
            final char c53 = charArray27[n27];
            char c54 = '\0';
            switch (n27 % 5) {
                default: {
                    c54 = '\u001b';
                    break;
                }
                case 0: {
                    c54 = 'F';
                    break;
                }
                case 1: {
                    c54 = '1';
                    break;
                }
                case 2: {
                    c54 = '\u000f';
                    break;
                }
                case 3: {
                    c54 = 'N';
                    break;
                }
            }
            charArray27[n27] = (char)(c54 ^ c53);
        }
        z2[26] = new String(charArray27).intern();
        final char[] charArray28 = "\u0003I\u007f+x2TknY\u0003vF\u0000D\u0007c]\u000fBfSz:;1P|n".toCharArray();
        for (int length24 = charArray28.length, n28 = 0; length24 > n28; ++n28) {
            final char c55 = charArray28[n28];
            char c56 = '\0';
            switch (n28 % 5) {
                default: {
                    c56 = '\u001b';
                    break;
                }
                case 0: {
                    c56 = 'F';
                    break;
                }
                case 1: {
                    c56 = '1';
                    break;
                }
                case 2: {
                    c56 = '\u000f';
                    break;
                }
                case 3: {
                    c56 = 'N';
                    break;
                }
            }
            charArray28[n28] = (char)(c56 ^ c55);
        }
        z2[27] = new String(charArray28).intern();
        final char[] charArray29 = "fR`\"n+_/".toCharArray();
        for (int length25 = charArray29.length, n29 = 0; length25 > n29; ++n29) {
            final char c57 = charArray29[n29];
            char c58 = '\0';
            switch (n29 % 5) {
                default: {
                    c58 = '\u001b';
                    break;
                }
                case 0: {
                    c58 = 'F';
                    break;
                }
                case 1: {
                    c58 = '1';
                    break;
                }
                case 2: {
                    c58 = '\u000f';
                    break;
                }
                case 3: {
                    c58 = 'N';
                    break;
                }
            }
            charArray29[n29] = (char)(c58 ^ c57);
        }
        z2[28] = new String(charArray29).intern();
        final char[] charArray30 = "fAn:sf".toCharArray();
        for (int length26 = charArray30.length, n30 = 0; length26 > n30; ++n30) {
            final char c59 = charArray30[n30];
            char c60 = '\0';
            switch (n30 % 5) {
                default: {
                    c60 = '\u001b';
                    break;
                }
                case 0: {
                    c60 = 'F';
                    break;
                }
                case 1: {
                    c60 = '1';
                    break;
                }
                case 2: {
                    c60 = '\u000f';
                    break;
                }
                case 3: {
                    c60 = 'N';
                    break;
                }
            }
            charArray30[n30] = (char)(c60 ^ c59);
        }
        z2[29] = new String(charArray30).intern();
        final char[] charArray31 = "fP{nw/_jn".toCharArray();
        for (int length27 = charArray31.length, n31 = 0; length27 > n31; ++n31) {
            final char c61 = charArray31[n31];
            char c62 = '\0';
            switch (n31 % 5) {
                default: {
                    c62 = '\u001b';
                    break;
                }
                case 0: {
                    c62 = 'F';
                    break;
                }
                case 1: {
                    c62 = '1';
                    break;
                }
                case 2: {
                    c62 = '\u000f';
                    break;
                }
                case 3: {
                    c62 = 'N';
                    break;
                }
            }
            charArray31[n31] = (char)(c62 ^ c61);
        }
        z2[30] = new String(charArray31).intern();
        final char[] charArray32 = "fP{nw/_jn".toCharArray();
        for (int length28 = charArray32.length, n32 = 0; length28 > n32; ++n32) {
            final char c63 = charArray32[n32];
            char c64 = '\0';
            switch (n32 % 5) {
                default: {
                    c64 = '\u001b';
                    break;
                }
                case 0: {
                    c64 = 'F';
                    break;
                }
                case 1: {
                    c64 = '1';
                    break;
                }
                case 2: {
                    c64 = '\u000f';
                    break;
                }
                case 3: {
                    c64 = 'N';
                    break;
                }
            }
            charArray32[n32] = (char)(c64 ^ c63);
        }
        z2[31] = new String(charArray32).intern();
        final char[] charArray33 = "fR`\"n+_/".toCharArray();
        for (int length29 = charArray33.length, n33 = 0; length29 > n33; ++n33) {
            final char c65 = charArray33[n33];
            char c66 = '\0';
            switch (n33 % 5) {
                default: {
                    c66 = '\u001b';
                    break;
                }
                case 0: {
                    c66 = 'F';
                    break;
                }
                case 1: {
                    c66 = '1';
                    break;
                }
                case 2: {
                    c66 = '\u000f';
                    break;
                }
                case 3: {
                    c66 = 'N';
                    break;
                }
            }
            charArray33[n33] = (char)(c66 ^ c65);
        }
        z2[32] = new String(charArray33).intern();
        final char[] charArray34 = "\u0013_{+i+Xa/o#U/=o4Xa)".toCharArray();
        for (int length30 = charArray34.length, n34 = 0; length30 > n34; ++n34) {
            final char c67 = charArray34[n34];
            char c68 = '\0';
            switch (n34 % 5) {
                default: {
                    c68 = '\u001b';
                    break;
                }
                case 0: {
                    c68 = 'F';
                    break;
                }
                case 1: {
                    c68 = '1';
                    break;
                }
                case 2: {
                    c68 = '\u000f';
                    break;
                }
                case 3: {
                    c68 = 'N';
                    break;
                }
            }
            charArray34[n34] = (char)(c68 ^ c67);
        }
        z2[33] = new String(charArray34).intern();
        final char[] charArray35 = "/_/s&f_z\"w".toCharArray();
        for (int length31 = charArray35.length, n35 = 0; length31 > n35; ++n35) {
            final char c69 = charArray35[n35];
            char c70 = '\0';
            switch (n35 % 5) {
                default: {
                    c70 = '\u001b';
                    break;
                }
                case 0: {
                    c70 = 'F';
                    break;
                }
                case 1: {
                    c70 = '1';
                    break;
                }
                case 2: {
                    c70 = '\u000f';
                    break;
                }
                case 3: {
                    c70 = 'N';
                    break;
                }
            }
            charArray35[n35] = (char)(c70 ^ c69);
        }
        z2[34] = new String(charArray35).intern();
        final char[] charArray36 = "fP{nw/_jn".toCharArray();
        for (int length32 = charArray36.length, n36 = 0; length32 > n36; ++n36) {
            final char c71 = charArray36[n36];
            char c72 = '\0';
            switch (n36 % 5) {
                default: {
                    c72 = '\u001b';
                    break;
                }
                case 0: {
                    c72 = 'F';
                    break;
                }
                case 1: {
                    c72 = '1';
                    break;
                }
                case 2: {
                    c72 = '\u000f';
                    break;
                }
                case 3: {
                    c72 = 'N';
                    break;
                }
            }
            charArray36[n36] = (char)(c72 ^ c71);
        }
        z2[35] = new String(charArray36).intern();
        final char[] charArray37 = "fR`\"n+_/".toCharArray();
        for (int length33 = charArray37.length, n37 = 0; length33 > n37; ++n37) {
            final char c73 = charArray37[n37];
            char c74 = '\0';
            switch (n37 % 5) {
                default: {
                    c74 = '\u001b';
                    break;
                }
                case 0: {
                    c74 = 'F';
                    break;
                }
                case 1: {
                    c74 = '1';
                    break;
                }
                case 2: {
                    c74 = '\u000f';
                    break;
                }
                case 3: {
                    c74 = 'N';
                    break;
                }
            }
            charArray37[n37] = (char)(c74 ^ c73);
        }
        z2[36] = new String(charArray37).intern();
        final char[] charArray38 = "fAn:sf".toCharArray();
        for (int length34 = charArray38.length, n38 = 0; length34 > n38; ++n38) {
            final char c75 = charArray38[n38];
            char c76 = '\0';
            switch (n38 % 5) {
                default: {
                    c76 = '\u001b';
                    break;
                }
                case 0: {
                    c76 = 'F';
                    break;
                }
                case 1: {
                    c76 = '1';
                    break;
                }
                case 2: {
                    c76 = '\u000f';
                    break;
                }
                case 3: {
                    c76 = 'N';
                    break;
                }
            }
            charArray38[n38] = (char)(c76 ^ c75);
        }
        z2[37] = new String(charArray38).intern();
        final char[] charArray39 = "\u0003I\u007f+x2TknzfB{<r(V/,n2\u0011x/hf".toCharArray();
        for (int length35 = charArray39.length, n39 = 0; length35 > n39; ++n39) {
            final char c77 = charArray39[n39];
            char c78 = '\0';
            switch (n39 % 5) {
                default: {
                    c78 = '\u001b';
                    break;
                }
                case 0: {
                    c78 = 'F';
                    break;
                }
                case 1: {
                    c78 = '1';
                    break;
                }
                case 2: {
                    c78 = '\u000f';
                    break;
                }
                case 3: {
                    c78 = 'N';
                    break;
                }
            }
            charArray39[n39] = (char)(c78 ^ c77);
        }
        z2[38] = new String(charArray39).intern();
        final char[] charArray40 = "\u0003I\u007f+x2Tknm']z+".toCharArray();
        for (int length36 = charArray40.length, n40 = 0; length36 > n40; ++n40) {
            final char c79 = charArray40[n40];
            char c80 = '\0';
            switch (n40 % 5) {
                default: {
                    c80 = '\u001b';
                    break;
                }
                case 0: {
                    c80 = 'F';
                    break;
                }
                case 1: {
                    c80 = '1';
                    break;
                }
                case 2: {
                    c80 = '\u000f';
                    break;
                }
                case 3: {
                    c80 = 'N';
                    break;
                }
            }
            charArray40[n40] = (char)(c80 ^ c79);
        }
        z2[39] = new String(charArray40).intern();
        final char[] charArray41 = "\u0003I\u007f+x2Tknu'\\j".toCharArray();
        for (int length37 = charArray41.length, n41 = 0; length37 > n41; ++n41) {
            final char c81 = charArray41[n41];
            char c82 = '\0';
            switch (n41 % 5) {
                default: {
                    c82 = '\u001b';
                    break;
                }
                case 0: {
                    c82 = 'F';
                    break;
                }
                case 1: {
                    c82 = '1';
                    break;
                }
                case 2: {
                    c82 = '\u000f';
                    break;
                }
                case 3: {
                    c82 = 'N';
                    break;
                }
            }
            charArray41[n41] = (char)(c82 ^ c81);
        }
        z2[40] = new String(charArray41).intern();
        final char[] charArray42 = "\u0003I\u007f+x2Tkn<|\u0016".toCharArray();
        for (int length38 = charArray42.length, n42 = 0; length38 > n42; ++n42) {
            final char c83 = charArray42[n42];
            char c84 = '\0';
            switch (n42 % 5) {
                default: {
                    c84 = '\u001b';
                    break;
                }
                case 0: {
                    c84 = 'F';
                    break;
                }
                case 1: {
                    c84 = '1';
                    break;
                }
                case 2: {
                    c84 = '\u000f';
                    break;
                }
                case 3: {
                    c84 = 'N';
                    break;
                }
            }
            charArray42[n42] = (char)(c84 ^ c83);
        }
        z2[41] = new String(charArray42).intern();
        final char[] charArray43 = "\u0013_{+i+Xa/o#U//i4Pv".toCharArray();
        for (int length39 = charArray43.length, n43 = 0; length39 > n43; ++n43) {
            final char c85 = charArray43[n43];
            char c86 = '\0';
            switch (n43 % 5) {
                default: {
                    c86 = '\u001b';
                    break;
                }
                case 0: {
                    c86 = 'F';
                    break;
                }
                case 1: {
                    c86 = '1';
                    break;
                }
                case 2: {
                    c86 = '\u000f';
                    break;
                }
                case 3: {
                    c86 = 'N';
                    break;
                }
            }
            charArray43[n43] = (char)(c86 ^ c85);
        }
        z2[42] = new String(charArray43).intern();
        final char[] charArray44 = "\u0013_j6k#R{+\u007ffGn\"n#".toCharArray();
        for (int length40 = charArray44.length, n44 = 0; length40 > n44; ++n44) {
            final char c87 = charArray44[n44];
            char c88 = '\0';
            switch (n44 % 5) {
                default: {
                    c88 = '\u001b';
                    break;
                }
                case 0: {
                    c88 = 'F';
                    break;
                }
                case 1: {
                    c88 = '1';
                    break;
                }
                case 2: {
                    c88 = '\u000f';
                    break;
                }
                case 3: {
                    c88 = 'N';
                    break;
                }
            }
            charArray44[n44] = (char)(c88 ^ c87);
        }
        z2[43] = new String(charArray44).intern();
        final char[] charArray45 = "\fB` I#Pk+ifX|nx*^|+\u007f".toCharArray();
        for (int length41 = charArray45.length, n45 = 0; length41 > n45; ++n45) {
            final char c89 = charArray45[n45];
            char c90 = '\0';
            switch (n45 % 5) {
                default: {
                    c90 = '\u001b';
                    break;
                }
                case 0: {
                    c90 = 'F';
                    break;
                }
                case 1: {
                    c90 = '1';
                    break;
                }
                case 2: {
                    c90 = '\u000f';
                    break;
                }
                case 3: {
                    c90 = 'N';
                    break;
                }
            }
            charArray45[n45] = (char)(c90 ^ c89);
        }
        z2[44] = new String(charArray45).intern();
        final char[] charArray46 = "\u0013_{+i+Xa/o#U/!y,Tl:".toCharArray();
        for (int length42 = charArray46.length, n46 = 0; length42 > n46; ++n46) {
            final char c91 = charArray46[n46];
            char c92 = '\0';
            switch (n46 % 5) {
                default: {
                    c92 = '\u001b';
                    break;
                }
                case 0: {
                    c92 = 'F';
                    break;
                }
                case 1: {
                    c92 = '1';
                    break;
                }
                case 2: {
                    c92 = '\u000f';
                    break;
                }
                case 3: {
                    c92 = 'N';
                    break;
                }
            }
            charArray46[n46] = (char)(c92 ^ c91);
        }
        z2[45] = new String(charArray46).intern();
        final char[] charArray47 = "\u0003I\u007f+x2Tknu'\\j".toCharArray();
        for (int length43 = charArray47.length, n47 = 0; length43 > n47; ++n47) {
            final char c93 = charArray47[n47];
            char c94 = '\0';
            switch (n47 % 5) {
                default: {
                    c94 = '\u001b';
                    break;
                }
                case 0: {
                    c94 = 'F';
                    break;
                }
                case 1: {
                    c94 = '1';
                    break;
                }
                case 2: {
                    c94 = '\u000f';
                    break;
                }
                case 3: {
                    c94 = 'N';
                    break;
                }
            }
            charArray47[n47] = (char)(c94 ^ c93);
        }
        z2[46] = new String(charArray47).intern();
        final char[] charArray48 = "\u0003I\u007f+x2Tknzf_n#~fSz:;1P|n".toCharArray();
        for (int length44 = charArray48.length, n48 = 0; length44 > n48; ++n48) {
            final char c95 = charArray48[n48];
            char c96 = '\0';
            switch (n48 % 5) {
                default: {
                    c96 = '\u001b';
                    break;
                }
                case 0: {
                    c96 = 'F';
                    break;
                }
                case 1: {
                    c96 = '1';
                    break;
                }
                case 2: {
                    c96 = '\u000f';
                    break;
                }
                case 3: {
                    c96 = 'N';
                    break;
                }
            }
            charArray48[n48] = (char)(c96 ^ c95);
        }
        z2[47] = new String(charArray48).intern();
        final char[] charArray49 = "fAn:sf".toCharArray();
        for (int length45 = charArray49.length, n49 = 0; length45 > n49; ++n49) {
            final char c97 = charArray49[n49];
            char c98 = '\0';
            switch (n49 % 5) {
                default: {
                    c98 = '\u001b';
                    break;
                }
                case 0: {
                    c98 = 'F';
                    break;
                }
                case 1: {
                    c98 = '1';
                    break;
                }
                case 2: {
                    c98 = '\u000f';
                    break;
                }
                case 3: {
                    c98 = 'N';
                    break;
                }
            }
            charArray49[n49] = (char)(c98 ^ c97);
        }
        z2[48] = new String(charArray49).intern();
        final char[] charArray50 = "fP{nw/_jn".toCharArray();
        for (int length46 = charArray50.length, n50 = 0; length46 > n50; ++n50) {
            final char c99 = charArray50[n50];
            char c100 = '\0';
            switch (n50 % 5) {
                default: {
                    c100 = '\u001b';
                    break;
                }
                case 0: {
                    c100 = 'F';
                    break;
                }
                case 1: {
                    c100 = '1';
                    break;
                }
                case 2: {
                    c100 = '\u000f';
                    break;
                }
                case 3: {
                    c100 = 'N';
                    break;
                }
            }
            charArray50[n50] = (char)(c100 ^ c99);
        }
        z2[49] = new String(charArray50).intern();
        final char[] charArray51 = "fR`\"n+_/".toCharArray();
        for (int length47 = charArray51.length, n51 = 0; length47 > n51; ++n51) {
            final char c101 = charArray51[n51];
            char c102 = '\0';
            switch (n51 % 5) {
                default: {
                    c102 = '\u001b';
                    break;
                }
                case 0: {
                    c102 = 'F';
                    break;
                }
                case 1: {
                    c102 = '1';
                    break;
                }
                case 2: {
                    c102 = '\u000f';
                    break;
                }
                case 3: {
                    c102 = 'N';
                    break;
                }
            }
            charArray51[n51] = (char)(c102 ^ c101);
        }
        z2[50] = new String(charArray51).intern();
        final char[] charArray52 = "\u0013_{+i+Xa/o#U/-t+\\j o".toCharArray();
        for (int length48 = charArray52.length, n52 = 0; length48 > n52; ++n52) {
            final char c103 = charArray52[n52];
            char c104 = '\0';
            switch (n52 % 5) {
                default: {
                    c104 = '\u001b';
                    break;
                }
                case 0: {
                    c104 = 'F';
                    break;
                }
                case 1: {
                    c104 = '1';
                    break;
                }
                case 2: {
                    c104 = '\u000f';
                    break;
                }
                case 3: {
                    c104 = 'N';
                    break;
                }
            }
            charArray52[n52] = (char)(c104 ^ c103);
        }
        z2[51] = new String(charArray52).intern();
        final char[] charArray53 = "\u0003_knt \u0011f k3E//of]f ~f".toCharArray();
        for (int length49 = charArray53.length, n53 = 0; length49 > n53; ++n53) {
            final char c105 = charArray53[n53];
            char c106 = '\0';
            switch (n53 % 5) {
                default: {
                    c106 = '\u001b';
                    break;
                }
                case 0: {
                    c106 = 'F';
                    break;
                }
                case 1: {
                    c106 = '1';
                    break;
                }
                case 2: {
                    c106 = '\u000f';
                    break;
                }
                case 3: {
                    c106 = 'N';
                    break;
                }
            }
            charArray53[n53] = (char)(c106 ^ c105);
        }
        z2[52] = new String(charArray53).intern();
        final char[] charArray54 = "l\u001e".toCharArray();
        for (int length50 = charArray54.length, n54 = 0; length50 > n54; ++n54) {
            final char c107 = charArray54[n54];
            char c108 = '\0';
            switch (n54 % 5) {
                default: {
                    c108 = '\u001b';
                    break;
                }
                case 0: {
                    c108 = 'F';
                    break;
                }
                case 1: {
                    c108 = '1';
                    break;
                }
                case 2: {
                    c108 = '\u000f';
                    break;
                }
                case 3: {
                    c108 = 'N';
                    break;
                }
            }
            charArray54[n54] = (char)(c108 ^ c107);
        }
        z2[53] = new String(charArray54).intern();
        final char[] charArray55 = "fR`\"n+_/".toCharArray();
        for (int length51 = charArray55.length, n55 = 0; length51 > n55; ++n55) {
            final char c109 = charArray55[n55];
            char c110 = '\0';
            switch (n55 % 5) {
                default: {
                    c110 = '\u001b';
                    break;
                }
                case 0: {
                    c110 = 'F';
                    break;
                }
                case 1: {
                    c110 = '1';
                    break;
                }
                case 2: {
                    c110 = '\u000f';
                    break;
                }
                case 3: {
                    c110 = 'N';
                    break;
                }
            }
            charArray55[n55] = (char)(c110 ^ c109);
        }
        z2[54] = new String(charArray55).intern();
        final char[] charArray56 = "fAn:sf".toCharArray();
        for (int length52 = charArray56.length, n56 = 0; length52 > n56; ++n56) {
            final char c111 = charArray56[n56];
            char c112 = '\0';
            switch (n56 % 5) {
                default: {
                    c112 = '\u001b';
                    break;
                }
                case 0: {
                    c112 = 'F';
                    break;
                }
                case 1: {
                    c112 = '1';
                    break;
                }
                case 2: {
                    c112 = '\u000f';
                    break;
                }
                case 3: {
                    c112 = 'N';
                    break;
                }
            }
            charArray56[n56] = (char)(c112 ^ c111);
        }
        z2[55] = new String(charArray56).intern();
        final char[] charArray57 = "fR`\"n+_/".toCharArray();
        for (int length53 = charArray57.length, n57 = 0; length53 > n57; ++n57) {
            final char c113 = charArray57[n57];
            char c114 = '\0';
            switch (n57 % 5) {
                default: {
                    c114 = '\u001b';
                    break;
                }
                case 0: {
                    c114 = 'F';
                    break;
                }
                case 1: {
                    c114 = '1';
                    break;
                }
                case 2: {
                    c114 = '\u000f';
                    break;
                }
                case 3: {
                    c114 = 'N';
                    break;
                }
            }
            charArray57[n57] = (char)(c114 ^ c113);
        }
        z2[56] = new String(charArray57).intern();
        final char[] charArray58 = "fP{nw/_jn".toCharArray();
        for (int length54 = charArray58.length, n58 = 0; length54 > n58; ++n58) {
            final char c115 = charArray58[n58];
            char c116 = '\0';
            switch (n58 % 5) {
                default: {
                    c116 = '\u001b';
                    break;
                }
                case 0: {
                    c116 = 'F';
                    break;
                }
                case 1: {
                    c116 = '1';
                    break;
                }
                case 2: {
                    c116 = '\u000f';
                    break;
                }
                case 3: {
                    c116 = 'N';
                    break;
                }
            }
            charArray58[n58] = (char)(c116 ^ c115);
        }
        z2[57] = new String(charArray58).intern();
        final char[] charArray59 = "fR`\"n+_/".toCharArray();
        for (int length55 = charArray59.length, n59 = 0; length55 > n59; ++n59) {
            final char c117 = charArray59[n59];
            char c118 = '\0';
            switch (n59 % 5) {
                default: {
                    c118 = '\u001b';
                    break;
                }
                case 0: {
                    c118 = 'F';
                    break;
                }
                case 1: {
                    c118 = '1';
                    break;
                }
                case 2: {
                    c118 = '\u000f';
                    break;
                }
                case 3: {
                    c118 = 'N';
                    break;
                }
            }
            charArray59[n59] = (char)(c118 ^ c117);
        }
        z2[58] = new String(charArray59).intern();
        final char[] charArray60 = "fAn:sf".toCharArray();
        for (int length56 = charArray60.length, n60 = 0; length56 > n60; ++n60) {
            final char c119 = charArray60[n60];
            char c120 = '\0';
            switch (n60 % 5) {
                default: {
                    c120 = '\u001b';
                    break;
                }
                case 0: {
                    c120 = 'F';
                    break;
                }
                case 1: {
                    c120 = '1';
                    break;
                }
                case 2: {
                    c120 = '\u000f';
                    break;
                }
                case 3: {
                    c120 = 'N';
                    break;
                }
            }
            charArray60[n60] = (char)(c120 ^ c119);
        }
        z2[59] = new String(charArray60).intern();
        final char[] charArray61 = "fP{nw/_jn".toCharArray();
        for (int length57 = charArray61.length, n61 = 0; length57 > n61; ++n61) {
            final char c121 = charArray61[n61];
            char c122 = '\0';
            switch (n61 % 5) {
                default: {
                    c122 = '\u001b';
                    break;
                }
                case 0: {
                    c122 = 'F';
                    break;
                }
                case 1: {
                    c122 = '1';
                    break;
                }
                case 2: {
                    c122 = '\u000f';
                    break;
                }
                case 3: {
                    c122 = 'N';
                    break;
                }
            }
            charArray61[n61] = (char)(c122 ^ c121);
        }
        z2[60] = new String(charArray61).intern();
        final char[] charArray62 = "\u0003I\u007f+x2Tkn^\buP\u0001Y\ftL\u001a;$D{nl'B/".toCharArray();
        for (int length58 = charArray62.length, n62 = 0; length58 > n62; ++n62) {
            final char c123 = charArray62[n62];
            char c124 = '\0';
            switch (n62 % 5) {
                default: {
                    c124 = '\u001b';
                    break;
                }
                case 0: {
                    c124 = 'F';
                    break;
                }
                case 1: {
                    c124 = '1';
                    break;
                }
                case 2: {
                    c124 = '\u000f';
                    break;
                }
                case 3: {
                    c124 = 'N';
                    break;
                }
            }
            charArray62[n62] = (char)(c124 ^ c123);
        }
        z2[61] = new String(charArray62).intern();
        final char[] charArray63 = "\u0013_{+i+Xa/o#U/=o4Xa)".toCharArray();
        for (int length59 = charArray63.length, n63 = 0; length59 > n63; ++n63) {
            final char c125 = charArray63[n63];
            char c126 = '\0';
            switch (n63 % 5) {
                default: {
                    c126 = '\u001b';
                    break;
                }
                case 0: {
                    c126 = 'F';
                    break;
                }
                case 1: {
                    c126 = '1';
                    break;
                }
                case 2: {
                    c126 = '\u000f';
                    break;
                }
                case 3: {
                    c126 = 'N';
                    break;
                }
            }
            charArray63[n63] = (char)(c126 ^ c125);
        }
        z2[62] = new String(charArray63).intern();
        z = z2;
        final char[] charArray64 = "olri\u0011".toCharArray();
        for (int length60 = charArray64.length, n64 = 0; length60 > n64; ++n64) {
            final char c127 = charArray64[n64];
            char c128 = '\0';
            switch (n64 % 5) {
                default: {
                    c128 = '\u001b';
                    break;
                }
                case 0: {
                    c128 = 'F';
                    break;
                }
                case 1: {
                    c128 = '1';
                    break;
                }
                case 2: {
                    c128 = '\u000f';
                    break;
                }
                case 3: {
                    c128 = 'N';
                    break;
                }
            }
            charArray64[n64] = (char)(c128 ^ c127);
        }
        a = new String(charArray64).intern().toCharArray();
        ey.a = new en();
    }
    
    public ai(final Reader p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: iconst_0       
        //    10: putfield        com/google/ai.n:Z
        //    13: aload_0        
        //    14: sipush          1024
        //    17: newarray        C
        //    19: putfield        com/google/ai.h:[C
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        com/google/ai.k:I
        //    27: aload_0        
        //    28: iconst_0       
        //    29: putfield        com/google/ai.d:I
        //    32: aload_0        
        //    33: iconst_0       
        //    34: putfield        com/google/ai.o:I
        //    37: aload_0        
        //    38: iconst_0       
        //    39: putfield        com/google/ai.l:I
        //    42: aload_0        
        //    43: iconst_0       
        //    44: putfield        com/google/ai.b:I
        //    47: aload_0        
        //    48: bipush          32
        //    50: newarray        I
        //    52: putfield        com/google/ai.p:[I
        //    55: aload_0        
        //    56: iconst_0       
        //    57: putfield        com/google/ai.f:I
        //    60: aload_0        
        //    61: getfield        com/google/ai.p:[I
        //    64: astore_3       
        //    65: aload_0        
        //    66: getfield        com/google/ai.f:I
        //    69: istore          4
        //    71: aload_0        
        //    72: iload           4
        //    74: iconst_1       
        //    75: iadd           
        //    76: putfield        com/google/ai.f:I
        //    79: aload_3        
        //    80: iload           4
        //    82: bipush          6
        //    84: iastore        
        //    85: aload_0        
        //    86: bipush          32
        //    88: anewarray       Ljava/lang/String;
        //    91: putfield        com/google/ai.c:[Ljava/lang/String;
        //    94: aload_0        
        //    95: bipush          32
        //    97: newarray        I
        //    99: putfield        com/google/ai.j:[I
        //   102: aload_1        
        //   103: ifnonnull       120
        //   106: new             Ljava/lang/NullPointerException;
        //   109: dup            
        //   110: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   113: bipush          34
        //   115: aaload         
        //   116: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   119: athrow         
        //   120: aload_0        
        //   121: aload_1        
        //   122: putfield        com/google/ai.m:Ljava/io/Reader;
        //   125: iload_2        
        //   126: ifeq            147
        //   129: getstatic       com/google/e_.a:Z
        //   132: istore          7
        //   134: iconst_0       
        //   135: istore          8
        //   137: iload           7
        //   139: ifeq            158
        //   142: iload           8
        //   144: putstatic       com/google/e_.a:Z
        //   147: return         
        //   148: astore          5
        //   150: aload           5
        //   152: athrow         
        //   153: astore          6
        //   155: aload           6
        //   157: athrow         
        //   158: iconst_1       
        //   159: istore          8
        //   161: goto            142
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  120    125    148    153    Ljava/lang/NullPointerException;
        //  129    134    153    158    Ljava/lang/NullPointerException;
        //  150    153    153    158    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0142:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/ai.h:[C
        //     8: astore_3       
        //     9: aload_0        
        //    10: getfield        com/google/ai.k:I
        //    13: istore          4
        //    15: aload_0        
        //    16: getfield        com/google/ai.d:I
        //    19: istore          5
        //    21: iload           4
        //    23: istore          6
        //    25: iload           6
        //    27: iload           5
        //    29: if_icmpne       66
        //    32: aload_0        
        //    33: iload           6
        //    35: putfield        com/google/ai.k:I
        //    38: aload_0        
        //    39: iconst_1       
        //    40: invokespecial   com/google/ai.a:(I)Z
        //    43: istore          19
        //    45: iload           19
        //    47: ifne            54
        //    50: iload_2        
        //    51: ifeq            392
        //    54: aload_0        
        //    55: getfield        com/google/ai.k:I
        //    58: istore          6
        //    60: aload_0        
        //    61: getfield        com/google/ai.d:I
        //    64: istore          5
        //    66: iload           6
        //    68: iconst_1       
        //    69: iadd           
        //    70: istore          7
        //    72: aload_3        
        //    73: iload           6
        //    75: caload         
        //    76: istore          8
        //    78: iload           8
        //    80: bipush          10
        //    82: if_icmpne       105
        //    85: aload_0        
        //    86: iconst_1       
        //    87: aload_0        
        //    88: getfield        com/google/ai.o:I
        //    91: iadd           
        //    92: putfield        com/google/ai.o:I
        //    95: aload_0        
        //    96: iload           7
        //    98: putfield        com/google/ai.l:I
        //   101: iload_2        
        //   102: ifeq            330
        //   105: iload           8
        //   107: bipush          32
        //   109: if_icmpeq       330
        //   112: iload           8
        //   114: bipush          13
        //   116: if_icmpeq       330
        //   119: iload           8
        //   121: bipush          9
        //   123: if_icmpne       130
        //   126: iload_2        
        //   127: ifeq            330
        //   130: iload           8
        //   132: bipush          47
        //   134: if_icmpne       337
        //   137: aload_0        
        //   138: iload           7
        //   140: putfield        com/google/ai.k:I
        //   143: iload           7
        //   145: iload           5
        //   147: if_icmpne       205
        //   150: aload_0        
        //   151: iconst_m1      
        //   152: aload_0        
        //   153: getfield        com/google/ai.k:I
        //   156: iadd           
        //   157: putfield        com/google/ai.k:I
        //   160: aload_0        
        //   161: iconst_2       
        //   162: invokespecial   com/google/ai.a:(I)Z
        //   165: istore          15
        //   167: aload_0        
        //   168: iconst_1       
        //   169: aload_0        
        //   170: getfield        com/google/ai.k:I
        //   173: iadd           
        //   174: putfield        com/google/ai.k:I
        //   177: iload           15
        //   179: ifne            205
        //   182: iload           8
        //   184: ireturn        
        //   185: astore          18
        //   187: aload           18
        //   189: athrow         
        //   190: astore          17
        //   192: aload           17
        //   194: athrow         
        //   195: astore          13
        //   197: aload           13
        //   199: athrow         
        //   200: astore          16
        //   202: aload           16
        //   204: athrow         
        //   205: aload_0        
        //   206: invokespecial   com/google/ai.d:()V
        //   209: aload_3        
        //   210: aload_0        
        //   211: getfield        com/google/ai.k:I
        //   214: caload         
        //   215: lookupswitch {
        //               42: 243
        //               47: 300
        //          default: 240
        //        }
        //   240: iload           8
        //   242: ireturn        
        //   243: aload_0        
        //   244: iconst_1       
        //   245: aload_0        
        //   246: getfield        com/google/ai.k:I
        //   249: iadd           
        //   250: putfield        com/google/ai.k:I
        //   253: aload_0        
        //   254: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   257: bipush          53
        //   259: aaload         
        //   260: invokespecial   com/google/ai.b:(Ljava/lang/String;)Z
        //   263: ifne            282
        //   266: aload_0        
        //   267: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   270: bipush          51
        //   272: aaload         
        //   273: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   276: athrow         
        //   277: astore          14
        //   279: aload           14
        //   281: athrow         
        //   282: iconst_2       
        //   283: aload_0        
        //   284: getfield        com/google/ai.k:I
        //   287: iadd           
        //   288: istore          7
        //   290: aload_0        
        //   291: getfield        com/google/ai.d:I
        //   294: istore          5
        //   296: iload_2        
        //   297: ifeq            330
        //   300: aload_0        
        //   301: iconst_1       
        //   302: aload_0        
        //   303: getfield        com/google/ai.k:I
        //   306: iadd           
        //   307: putfield        com/google/ai.k:I
        //   310: aload_0        
        //   311: invokespecial   com/google/ai.j:()V
        //   314: aload_0        
        //   315: getfield        com/google/ai.k:I
        //   318: istore          7
        //   320: aload_0        
        //   321: getfield        com/google/ai.d:I
        //   324: istore          5
        //   326: iload_2        
        //   327: ifne            240
        //   330: iload           7
        //   332: istore          6
        //   334: goto            25
        //   337: iload           8
        //   339: bipush          35
        //   341: if_icmpne       464
        //   344: aload_0        
        //   345: iload           7
        //   347: putfield        com/google/ai.k:I
        //   350: aload_0        
        //   351: invokespecial   com/google/ai.d:()V
        //   354: aload_0        
        //   355: invokespecial   com/google/ai.j:()V
        //   358: aload_0        
        //   359: getfield        com/google/ai.k:I
        //   362: istore          9
        //   364: aload_0        
        //   365: getfield        com/google/ai.d:I
        //   368: istore          11
        //   370: iload_2        
        //   371: ifeq            388
        //   374: aload_0        
        //   375: iload           9
        //   377: putfield        com/google/ai.k:I
        //   380: iload           8
        //   382: ireturn        
        //   383: astore          10
        //   385: aload           10
        //   387: athrow         
        //   388: iload_2        
        //   389: ifeq            453
        //   392: iload_1        
        //   393: ifeq            451
        //   396: new             Ljava/io/EOFException;
        //   399: dup            
        //   400: new             Ljava/lang/StringBuilder;
        //   403: dup            
        //   404: invokespecial   java/lang/StringBuilder.<init>:()V
        //   407: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   410: bipush          52
        //   412: aaload         
        //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   416: aload_0        
        //   417: invokespecial   com/google/ai.s:()I
        //   420: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   423: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   426: bipush          54
        //   428: aaload         
        //   429: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   432: aload_0        
        //   433: invokespecial   com/google/ai.r:()I
        //   436: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   439: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   442: invokespecial   java/io/EOFException.<init>:(Ljava/lang/String;)V
        //   445: athrow         
        //   446: astore          12
        //   448: aload           12
        //   450: athrow         
        //   451: iconst_m1      
        //   452: ireturn        
        //   453: iload           9
        //   455: istore          6
        //   457: iload           11
        //   459: istore          5
        //   461: goto            25
        //   464: iload           7
        //   466: istore          9
        //   468: goto            374
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  32     45     185    190    Ljava/lang/NullPointerException;
        //  85     101    190    195    Ljava/lang/NullPointerException;
        //  137    143    195    200    Ljava/lang/NullPointerException;
        //  167    177    200    205    Ljava/lang/NullPointerException;
        //  243    277    277    282    Ljava/lang/NullPointerException;
        //  374    380    383    388    Ljava/lang/NullPointerException;
        //  396    446    446    451    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 231, Size: 231
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private IOException a(final String s) {
        throw new fy(s + ai.z[57] + this.s() + ai.z[56] + this.r() + ai.z[55] + this.k());
    }
    
    private String a(final char c) {
        final int l = c3.l;
        final char[] h = this.h;
        final StringBuilder sb = new StringBuilder();
        while (true) {
            int n = this.k;
            int d = this.d;
            int k = n;
        Label_0190_Outer:
            while (true) {
                while (true) {
                    int d2 = 0;
                    int i = 0;
                    Label_0194: {
                        if (k >= d) {
                            break Label_0194;
                        }
                        final int n2 = k + 1;
                        final char c2 = h[k];
                        if (c2 == c) {
                            try {
                                sb.append(h, n, -1 + ((this.k = n2) - n));
                                return sb.toString();
                            }
                            catch (NullPointerException ex) {
                                throw ex;
                            }
                        }
                        if (c2 == '\\') {
                            sb.append(h, n, -1 + ((this.k = n2) - n));
                            sb.append(this.l());
                            n = this.k;
                            d2 = this.d;
                            if (l == 0) {
                                d = d2;
                                k = n;
                                break Label_0190;
                            }
                            i = n;
                        }
                        else {
                            d2 = d;
                            i = n2;
                        }
                        if (c2 != '\n') {
                            break Label_0194;
                        }
                        try {
                            ++this.o;
                            this.l = i;
                            final int n3 = d2;
                            k = i;
                            d = n3;
                            if (l == 0) {
                                continue Label_0190_Outer;
                            }
                            final int n4 = k - n;
                            try {
                                sb.append(h, n, n4);
                                this.k = k;
                                if (!this.a(1)) {
                                    throw this.a(ai.z[33]);
                                }
                                break;
                            }
                            catch (NullPointerException ex2) {
                                throw ex2;
                            }
                        }
                        catch (NullPointerException ex3) {
                            throw ex3;
                        }
                    }
                    final int n5 = d2;
                    k = i;
                    d = n5;
                    continue;
                }
            }
        }
    }
    
    private boolean a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/ai.h:[C
        //     8: astore_3       
        //     9: aload_0        
        //    10: aload_0        
        //    11: getfield        com/google/ai.l:I
        //    14: aload_0        
        //    15: getfield        com/google/ai.k:I
        //    18: isub           
        //    19: putfield        com/google/ai.l:I
        //    22: aload_0        
        //    23: getfield        com/google/ai.d:I
        //    26: istore          6
        //    28: aload_0        
        //    29: getfield        com/google/ai.k:I
        //    32: istore          7
        //    34: iload           6
        //    36: iload           7
        //    38: if_icmpeq       72
        //    41: aload_0        
        //    42: aload_0        
        //    43: getfield        com/google/ai.d:I
        //    46: aload_0        
        //    47: getfield        com/google/ai.k:I
        //    50: isub           
        //    51: putfield        com/google/ai.d:I
        //    54: aload_3        
        //    55: aload_0        
        //    56: getfield        com/google/ai.k:I
        //    59: aload_3        
        //    60: iconst_0       
        //    61: aload_0        
        //    62: getfield        com/google/ai.d:I
        //    65: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //    68: iload_2        
        //    69: ifeq            77
        //    72: aload_0        
        //    73: iconst_0       
        //    74: putfield        com/google/ai.d:I
        //    77: aload_0        
        //    78: iconst_0       
        //    79: putfield        com/google/ai.k:I
        //    82: aload_0        
        //    83: getfield        com/google/ai.m:Ljava/io/Reader;
        //    86: aload_3        
        //    87: aload_0        
        //    88: getfield        com/google/ai.d:I
        //    91: aload_3        
        //    92: arraylength    
        //    93: aload_0        
        //    94: getfield        com/google/ai.d:I
        //    97: isub           
        //    98: invokevirtual   java/io/Reader.read:([CII)I
        //   101: istore          8
        //   103: iconst_0       
        //   104: istore          9
        //   106: iload           8
        //   108: iconst_m1      
        //   109: if_icmpeq       198
        //   112: aload_0        
        //   113: iload           8
        //   115: aload_0        
        //   116: getfield        com/google/ai.d:I
        //   119: iadd           
        //   120: putfield        com/google/ai.d:I
        //   123: aload_0        
        //   124: getfield        com/google/ai.o:I
        //   127: istore          14
        //   129: iload           14
        //   131: ifne            187
        //   134: aload_0        
        //   135: getfield        com/google/ai.l:I
        //   138: istore          15
        //   140: iload           15
        //   142: ifne            187
        //   145: aload_0        
        //   146: getfield        com/google/ai.d:I
        //   149: istore          16
        //   151: iload           16
        //   153: ifle            187
        //   156: aload_3        
        //   157: iconst_0       
        //   158: caload         
        //   159: ldc             65279
        //   161: if_icmpne       187
        //   164: aload_0        
        //   165: iconst_1       
        //   166: aload_0        
        //   167: getfield        com/google/ai.k:I
        //   170: iadd           
        //   171: putfield        com/google/ai.k:I
        //   174: aload_0        
        //   175: iconst_1       
        //   176: aload_0        
        //   177: getfield        com/google/ai.l:I
        //   180: iadd           
        //   181: putfield        com/google/ai.l:I
        //   184: iinc            1, 1
        //   187: aload_0        
        //   188: getfield        com/google/ai.d:I
        //   191: iload_1        
        //   192: if_icmplt       82
        //   195: iconst_1       
        //   196: istore          9
        //   198: iload           9
        //   200: ireturn        
        //   201: astore          4
        //   203: aload           4
        //   205: athrow         
        //   206: astore          5
        //   208: aload           5
        //   210: athrow         
        //   211: astore          10
        //   213: aload           10
        //   215: athrow         
        //   216: astore          11
        //   218: aload           11
        //   220: athrow         
        //   221: astore          12
        //   223: aload           12
        //   225: athrow         
        //   226: astore          13
        //   228: aload           13
        //   230: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  9      34     201    206    Ljava/lang/NullPointerException;
        //  41     68     206    211    Ljava/lang/NullPointerException;
        //  72     77     206    211    Ljava/lang/NullPointerException;
        //  112    129    211    216    Ljava/lang/NullPointerException;
        //  134    140    216    221    Ljava/lang/NullPointerException;
        //  145    151    221    226    Ljava/lang/NullPointerException;
        //  156    184    226    231    Ljava/lang/NullPointerException;
        //  203    206    206    211    Ljava/lang/NullPointerException;
        //  213    216    216    221    Ljava/lang/NullPointerException;
        //  218    221    221    226    Ljava/lang/NullPointerException;
        //  223    226    226    231    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 126, Size: 126
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void b(final int n) {
        if (this.f == this.p.length) {
            final int[] p = new int[2 * this.f];
            final int[] j = new int[2 * this.f];
            final String[] c = new String[2 * this.f];
            System.arraycopy(this.p, 0, p, 0, this.f);
            System.arraycopy(this.j, 0, j, 0, this.f);
            System.arraycopy(this.c, 0, c, 0, this.f);
            this.p = p;
            this.j = j;
            this.c = c;
        }
        this.p[this.f++] = n;
    }
    
    private boolean b(final char c) {
        Label_0142: {
            switch (c) {
                default: {
                    return true;
                }
                case '#':
                case '/':
                case ';':
                case '=':
                case '\\': {
                    break Label_0142;
                }
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                case ',':
                case ':':
                case '[':
                case ']':
                case '{':
                case '}': {
                    return false;
                    try {
                        this.d();
                        return false;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    break;
                }
            }
        }
    }
    
    private boolean b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/google/ai.k:I
        //     8: aload_1        
        //     9: invokevirtual   java/lang/String.length:()I
        //    12: iadd           
        //    13: aload_0        
        //    14: getfield        com/google/ai.d:I
        //    17: if_icmple       38
        //    20: aload_0        
        //    21: aload_1        
        //    22: invokevirtual   java/lang/String.length:()I
        //    25: invokespecial   com/google/ai.a:(I)Z
        //    28: istore          11
        //    30: iconst_0       
        //    31: istore          5
        //    33: iload           11
        //    35: ifeq            131
        //    38: aload_0        
        //    39: getfield        com/google/ai.h:[C
        //    42: aload_0        
        //    43: getfield        com/google/ai.k:I
        //    46: caload         
        //    47: bipush          10
        //    49: if_icmpne       76
        //    52: aload_0        
        //    53: iconst_1       
        //    54: aload_0        
        //    55: getfield        com/google/ai.o:I
        //    58: iadd           
        //    59: putfield        com/google/ai.o:I
        //    62: aload_0        
        //    63: iconst_1       
        //    64: aload_0        
        //    65: getfield        com/google/ai.k:I
        //    68: iadd           
        //    69: putfield        com/google/ai.l:I
        //    72: iload_2        
        //    73: ifeq            152
        //    76: iconst_0       
        //    77: istore          4
        //    79: iload           4
        //    81: aload_1        
        //    82: invokevirtual   java/lang/String.length:()I
        //    85: if_icmpge       128
        //    88: aload_0        
        //    89: getfield        com/google/ai.h:[C
        //    92: iload           4
        //    94: aload_0        
        //    95: getfield        com/google/ai.k:I
        //    98: iadd           
        //    99: caload         
        //   100: istore          8
        //   102: aload_1        
        //   103: iload           4
        //   105: invokevirtual   java/lang/String.charAt:(I)C
        //   108: istore          9
        //   110: iload           8
        //   112: iload           9
        //   114: if_icmpeq       121
        //   117: iload_2        
        //   118: ifeq            152
        //   121: iinc            4, 1
        //   124: iload_2        
        //   125: ifeq            79
        //   128: iconst_1       
        //   129: istore          5
        //   131: iload           5
        //   133: ireturn        
        //   134: astore          10
        //   136: aload           10
        //   138: athrow         
        //   139: astore_3       
        //   140: aload_3        
        //   141: athrow         
        //   142: astore          6
        //   144: aload           6
        //   146: athrow         
        //   147: astore          7
        //   149: aload           7
        //   151: athrow         
        //   152: aload_0        
        //   153: iconst_1       
        //   154: aload_0        
        //   155: getfield        com/google/ai.k:I
        //   158: iadd           
        //   159: putfield        com/google/ai.k:I
        //   162: iload_2        
        //   163: ifeq            4
        //   166: iconst_0       
        //   167: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  20     30     134    139    Ljava/lang/NullPointerException;
        //  38     72     139    142    Ljava/lang/NullPointerException;
        //  88     110    142    152    Ljava/lang/NullPointerException;
        //  136    139    139    142    Ljava/lang/NullPointerException;
        //  144    147    147    152    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void c(final char c) {
        final int l = c3.l;
        final char[] h = this.h;
        while (true) {
            int k = this.k;
            int d = this.d;
        Label_0127_Outer:
            while (true) {
                while (true) {
                    int i = 0;
                    int d2 = 0;
                    Label_0131: {
                        if (k >= d) {
                            break Label_0131;
                        }
                        final int n = k + 1;
                        final char c2 = h[k];
                        if (c2 == c) {
                            try {
                                this.k = n;
                                return;
                            }
                            catch (NullPointerException ex) {
                                throw ex;
                            }
                        }
                        if (c2 == '\\') {
                            this.k = n;
                            this.l();
                            i = this.k;
                            d2 = this.d;
                            if (l == 0) {
                                break Label_0131;
                            }
                        }
                        else {
                            d2 = d;
                            i = n;
                        }
                        if (c2 != '\n') {
                            break Label_0131;
                        }
                        try {
                            ++this.o;
                            this.l = i;
                            final int n2 = d2;
                            k = i;
                            d = n2;
                            if (l == 0) {
                                continue Label_0127_Outer;
                            }
                            this.k = k;
                            if (!this.a(1)) {
                                throw this.a(ai.z[62]);
                            }
                            break;
                        }
                        catch (NullPointerException ex2) {
                            throw ex2;
                        }
                    }
                    final int n3 = d2;
                    k = i;
                    d = n3;
                    continue;
                }
            }
        }
    }
    
    private void d() {
        try {
            if (!this.n) {
                throw this.a(ai.z[8]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    private void e() {
        final int l = c3.l;
        Label_0062: {
            try {
                this.a(true);
                --this.k;
                if (this.k + ai.a.length <= this.d) {
                    break Label_0062;
                }
                final ai ai = this;
                final char[] array = com.google.ai.a;
                final int n = array.length;
                final boolean b = ai.a(n);
                if (!b) {
                    return;
                }
                break Label_0062;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final ai ai = this;
                final char[] array = com.google.ai.a;
                final int n = array.length;
                final boolean b = ai.a(n);
                if (!b) {
                    return;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        int n2 = 0;
    Label_0110_Outer:
        while (true) {
            while (true) {
                if (n2 < ai.a.length) {
                    try {
                        if (this.h[n2 + this.k] == ai.a[n2]) {
                            ++n2;
                            if (l != 0) {
                                this.k += ai.a.length;
                                return;
                            }
                            continue Label_0110_Outer;
                        }
                    }
                    catch (NullPointerException ex3) {
                        throw ex3;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    private int g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_4       
        //     1: istore_1       
        //     2: getstatic       com/google/c3.l:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/google/ai.p:[I
        //    10: iconst_m1      
        //    11: aload_0        
        //    12: getfield        com/google/ai.f:I
        //    15: iadd           
        //    16: iaload         
        //    17: istore_3       
        //    18: iload_3        
        //    19: iconst_1       
        //    20: if_icmpne       39
        //    23: aload_0        
        //    24: getfield        com/google/ai.p:[I
        //    27: iconst_m1      
        //    28: aload_0        
        //    29: getfield        com/google/ai.f:I
        //    32: iadd           
        //    33: iconst_2       
        //    34: iastore        
        //    35: iload_2        
        //    36: ifeq            663
        //    39: iload_3        
        //    40: iconst_2       
        //    41: if_icmpne       129
        //    44: aload_0        
        //    45: iconst_1       
        //    46: invokespecial   com/google/ai.a:(Z)I
        //    49: lookupswitch {
        //               44: 121
        //               59: 117
        //               93: 105
        //          default: 84
        //        }
        //    84: aload_0        
        //    85: getstatic       com/google/ai.z:[Ljava/lang/String;
        //    88: bipush          42
        //    90: aaload         
        //    91: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //    94: athrow         
        //    95: astore          29
        //    97: aload           29
        //    99: athrow         
        //   100: astore          31
        //   102: aload           31
        //   104: athrow         
        //   105: aload_0        
        //   106: iconst_4       
        //   107: putfield        com/google/ai.b:I
        //   110: iload_1        
        //   111: ireturn        
        //   112: astore          30
        //   114: aload           30
        //   116: athrow         
        //   117: aload_0        
        //   118: invokespecial   com/google/ai.d:()V
        //   121: iload_2        
        //   122: ifne            84
        //   125: iload_2        
        //   126: ifeq            663
        //   129: iload_3        
        //   130: iconst_3       
        //   131: if_icmpeq       139
        //   134: iload_3        
        //   135: iconst_5       
        //   136: if_icmpne       384
        //   139: aload_0        
        //   140: getfield        com/google/ai.p:[I
        //   143: iconst_m1      
        //   144: aload_0        
        //   145: getfield        com/google/ai.f:I
        //   148: iadd           
        //   149: iconst_4       
        //   150: iastore        
        //   151: iload_3        
        //   152: iconst_5       
        //   153: if_icmpne       237
        //   156: aload_0        
        //   157: iconst_1       
        //   158: invokespecial   com/google/ai.a:(Z)I
        //   161: lookupswitch {
        //               44: 233
        //               59: 229
        //              125: 217
        //          default: 196
        //        }
        //   196: aload_0        
        //   197: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   200: bipush          45
        //   202: aaload         
        //   203: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   206: athrow         
        //   207: astore          9
        //   209: aload           9
        //   211: athrow         
        //   212: astore          4
        //   214: aload           4
        //   216: athrow         
        //   217: aload_0        
        //   218: iconst_2       
        //   219: putfield        com/google/ai.b:I
        //   222: iconst_2       
        //   223: ireturn        
        //   224: astore          10
        //   226: aload           10
        //   228: athrow         
        //   229: aload_0        
        //   230: invokespecial   com/google/ai.d:()V
        //   233: iload_2        
        //   234: ifne            196
        //   237: aload_0        
        //   238: iconst_1       
        //   239: invokespecial   com/google/ai.a:(Z)I
        //   242: istore          5
        //   244: iload           5
        //   246: lookupswitch {
        //               34: 318
        //               39: 332
        //              125: 345
        //          default: 280
        //        }
        //   280: aload_0        
        //   281: invokespecial   com/google/ai.d:()V
        //   284: aload_0        
        //   285: iconst_m1      
        //   286: aload_0        
        //   287: getfield        com/google/ai.k:I
        //   290: iadd           
        //   291: putfield        com/google/ai.k:I
        //   294: aload_0        
        //   295: iload           5
        //   297: i2c            
        //   298: invokespecial   com/google/ai.b:(C)Z
        //   301: ifeq            373
        //   304: aload_0        
        //   305: bipush          14
        //   307: putfield        com/google/ai.b:I
        //   310: bipush          14
        //   312: ireturn        
        //   313: astore          8
        //   315: aload           8
        //   317: athrow         
        //   318: aload_0        
        //   319: bipush          13
        //   321: putfield        com/google/ai.b:I
        //   324: bipush          13
        //   326: ireturn        
        //   327: astore          7
        //   329: aload           7
        //   331: athrow         
        //   332: aload_0        
        //   333: invokespecial   com/google/ai.d:()V
        //   336: aload_0        
        //   337: bipush          12
        //   339: putfield        com/google/ai.b:I
        //   342: bipush          12
        //   344: ireturn        
        //   345: iload_3        
        //   346: iconst_5       
        //   347: if_icmpeq       362
        //   350: aload_0        
        //   351: iconst_2       
        //   352: putfield        com/google/ai.b:I
        //   355: iconst_2       
        //   356: ireturn        
        //   357: astore          6
        //   359: aload           6
        //   361: athrow         
        //   362: aload_0        
        //   363: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   366: bipush          40
        //   368: aaload         
        //   369: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   372: athrow         
        //   373: aload_0        
        //   374: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   377: bipush          46
        //   379: aaload         
        //   380: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   383: athrow         
        //   384: iload_3        
        //   385: iload_1        
        //   386: if_icmpne       527
        //   389: aload_0        
        //   390: getfield        com/google/ai.p:[I
        //   393: iconst_m1      
        //   394: aload_0        
        //   395: getfield        com/google/ai.f:I
        //   398: iadd           
        //   399: iconst_5       
        //   400: iastore        
        //   401: aload_0        
        //   402: iconst_1       
        //   403: invokespecial   com/google/ai.a:(Z)I
        //   406: tableswitch {
        //              116: 452
        //              117: 436
        //              118: 436
        //              119: 456
        //          default: 436
        //        }
        //   436: aload_0        
        //   437: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   440: bipush          41
        //   442: aaload         
        //   443: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   446: athrow         
        //   447: astore          24
        //   449: aload           24
        //   451: athrow         
        //   452: iload_2        
        //   453: ifeq            523
        //   456: aload_0        
        //   457: invokespecial   com/google/ai.d:()V
        //   460: aload_0        
        //   461: getfield        com/google/ai.k:I
        //   464: istore          25
        //   466: aload_0        
        //   467: getfield        com/google/ai.d:I
        //   470: istore          26
        //   472: iload           25
        //   474: iload           26
        //   476: if_icmplt       491
        //   479: aload_0        
        //   480: iconst_1       
        //   481: invokespecial   com/google/ai.a:(I)Z
        //   484: istore          28
        //   486: iload           28
        //   488: ifeq            523
        //   491: aload_0        
        //   492: getfield        com/google/ai.h:[C
        //   495: aload_0        
        //   496: getfield        com/google/ai.k:I
        //   499: caload         
        //   500: istore          27
        //   502: iload           27
        //   504: bipush          62
        //   506: if_icmpne       523
        //   509: aload_0        
        //   510: iconst_1       
        //   511: aload_0        
        //   512: getfield        com/google/ai.k:I
        //   515: iadd           
        //   516: putfield        com/google/ai.k:I
        //   519: iload_2        
        //   520: ifne            436
        //   523: iload_2        
        //   524: ifeq            663
        //   527: iload_3        
        //   528: bipush          6
        //   530: if_icmpne       561
        //   533: aload_0        
        //   534: getfield        com/google/ai.n:Z
        //   537: ifeq            544
        //   540: aload_0        
        //   541: invokespecial   com/google/ai.e:()V
        //   544: aload_0        
        //   545: getfield        com/google/ai.p:[I
        //   548: iconst_m1      
        //   549: aload_0        
        //   550: getfield        com/google/ai.f:I
        //   553: iadd           
        //   554: bipush          7
        //   556: iastore        
        //   557: iload_2        
        //   558: ifeq            663
        //   561: iload_3        
        //   562: bipush          7
        //   564: if_icmpne       633
        //   567: aload_0        
        //   568: iconst_0       
        //   569: invokespecial   com/google/ai.a:(Z)I
        //   572: iconst_m1      
        //   573: if_icmpne       615
        //   576: aload_0        
        //   577: bipush          17
        //   579: putfield        com/google/ai.b:I
        //   582: bipush          17
        //   584: ireturn        
        //   585: astore          18
        //   587: aload           18
        //   589: athrow         
        //   590: astore          21
        //   592: aload           21
        //   594: athrow         
        //   595: astore          22
        //   597: aload           22
        //   599: athrow         
        //   600: astore          23
        //   602: aload           23
        //   604: athrow         
        //   605: astore          19
        //   607: aload           19
        //   609: athrow         
        //   610: astore          20
        //   612: aload           20
        //   614: athrow         
        //   615: aload_0        
        //   616: invokespecial   com/google/ai.d:()V
        //   619: aload_0        
        //   620: iconst_m1      
        //   621: aload_0        
        //   622: getfield        com/google/ai.k:I
        //   625: iadd           
        //   626: putfield        com/google/ai.k:I
        //   629: iload_2        
        //   630: ifeq            663
        //   633: iload_3        
        //   634: bipush          8
        //   636: if_icmpne       663
        //   639: new             Ljava/lang/IllegalStateException;
        //   642: dup            
        //   643: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   646: bipush          44
        //   648: aaload         
        //   649: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   652: athrow         
        //   653: astore          16
        //   655: aload           16
        //   657: athrow         
        //   658: astore          17
        //   660: aload           17
        //   662: athrow         
        //   663: aload_0        
        //   664: iconst_1       
        //   665: invokespecial   com/google/ai.a:(Z)I
        //   668: lookupswitch {
        //               34: 887
        //               39: 874
        //               44: 825
        //               59: 825
        //               91: 913
        //               93: 808
        //              123: 920
        //          default: 736
        //        }
        //   736: aload_0        
        //   737: iconst_m1      
        //   738: aload_0        
        //   739: getfield        com/google/ai.k:I
        //   742: iadd           
        //   743: putfield        com/google/ai.k:I
        //   746: aload_0        
        //   747: getfield        com/google/ai.f:I
        //   750: iconst_1       
        //   751: if_icmpne       758
        //   754: aload_0        
        //   755: invokespecial   com/google/ai.d:()V
        //   758: aload_0        
        //   759: invokespecial   com/google/ai.h:()I
        //   762: istore_1       
        //   763: iload_1        
        //   764: ifne            110
        //   767: aload_0        
        //   768: invokespecial   com/google/ai.i:()I
        //   771: istore_1       
        //   772: iload_1        
        //   773: ifne            110
        //   776: aload_0        
        //   777: aload_0        
        //   778: getfield        com/google/ai.h:[C
        //   781: aload_0        
        //   782: getfield        com/google/ai.k:I
        //   785: caload         
        //   786: invokespecial   com/google/ai.b:(C)Z
        //   789: ifne            932
        //   792: aload_0        
        //   793: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   796: bipush          39
        //   798: aaload         
        //   799: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   802: athrow         
        //   803: astore          15
        //   805: aload           15
        //   807: athrow         
        //   808: iload_3        
        //   809: iconst_1       
        //   810: if_icmpne       825
        //   813: aload_0        
        //   814: iconst_4       
        //   815: putfield        com/google/ai.b:I
        //   818: iload_1        
        //   819: ireturn        
        //   820: astore          13
        //   822: aload           13
        //   824: athrow         
        //   825: iload_3        
        //   826: iconst_1       
        //   827: if_icmpeq       835
        //   830: iload_3        
        //   831: iconst_2       
        //   832: if_icmpne       863
        //   835: aload_0        
        //   836: invokespecial   com/google/ai.d:()V
        //   839: aload_0        
        //   840: iconst_m1      
        //   841: aload_0        
        //   842: getfield        com/google/ai.k:I
        //   845: iadd           
        //   846: putfield        com/google/ai.k:I
        //   849: aload_0        
        //   850: bipush          7
        //   852: putfield        com/google/ai.b:I
        //   855: bipush          7
        //   857: ireturn        
        //   858: astore          12
        //   860: aload           12
        //   862: athrow         
        //   863: aload_0        
        //   864: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   867: bipush          43
        //   869: aaload         
        //   870: invokespecial   com/google/ai.a:(Ljava/lang/String;)Ljava/io/IOException;
        //   873: athrow         
        //   874: aload_0        
        //   875: invokespecial   com/google/ai.d:()V
        //   878: aload_0        
        //   879: bipush          8
        //   881: putfield        com/google/ai.b:I
        //   884: bipush          8
        //   886: ireturn        
        //   887: aload_0        
        //   888: getfield        com/google/ai.f:I
        //   891: iconst_1       
        //   892: if_icmpne       899
        //   895: aload_0        
        //   896: invokespecial   com/google/ai.d:()V
        //   899: aload_0        
        //   900: bipush          9
        //   902: putfield        com/google/ai.b:I
        //   905: bipush          9
        //   907: ireturn        
        //   908: astore          11
        //   910: aload           11
        //   912: athrow         
        //   913: aload_0        
        //   914: iconst_3       
        //   915: putfield        com/google/ai.b:I
        //   918: iconst_3       
        //   919: ireturn        
        //   920: aload_0        
        //   921: iconst_1       
        //   922: putfield        com/google/ai.b:I
        //   925: iconst_1       
        //   926: ireturn        
        //   927: astore          14
        //   929: aload           14
        //   931: athrow         
        //   932: aload_0        
        //   933: invokespecial   com/google/ai.d:()V
        //   936: aload_0        
        //   937: bipush          10
        //   939: putfield        com/google/ai.b:I
        //   942: bipush          10
        //   944: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  23     35     100    105    Ljava/lang/NullPointerException;
        //  84     95     95     100    Ljava/lang/NullPointerException;
        //  105    110    112    117    Ljava/lang/NullPointerException;
        //  139    151    212    217    Ljava/lang/NullPointerException;
        //  196    207    207    212    Ljava/lang/NullPointerException;
        //  217    222    224    229    Ljava/lang/NullPointerException;
        //  280    310    313    318    Ljava/lang/NullPointerException;
        //  318    324    327    332    Ljava/lang/NullPointerException;
        //  350    355    357    362    Ljava/lang/NullPointerException;
        //  436    447    447    452    Ljava/lang/NullPointerException;
        //  456    472    590    595    Ljava/lang/NullPointerException;
        //  479    486    595    600    Ljava/lang/NullPointerException;
        //  491    502    600    605    Ljava/lang/NullPointerException;
        //  509    519    447    452    Ljava/lang/NullPointerException;
        //  533    544    605    610    Ljava/lang/NullPointerException;
        //  544    557    610    615    Ljava/lang/NullPointerException;
        //  576    582    585    590    Ljava/lang/NullPointerException;
        //  592    595    595    600    Ljava/lang/NullPointerException;
        //  597    600    600    605    Ljava/lang/NullPointerException;
        //  602    605    447    452    Ljava/lang/NullPointerException;
        //  615    629    658    663    Ljava/lang/NullPointerException;
        //  639    653    653    658    Ljava/lang/NullPointerException;
        //  660    663    653    658    Ljava/lang/NullPointerException;
        //  736    758    927    932    Ljava/lang/NullPointerException;
        //  776    803    803    808    Ljava/lang/NullPointerException;
        //  813    818    820    825    Ljava/lang/NullPointerException;
        //  835    855    858    863    Ljava/lang/NullPointerException;
        //  887    899    908    913    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 428, Size: 428
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int h() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/ai.h:[C
        //     8: aload_0        
        //     9: getfield        com/google/ai.k:I
        //    12: caload         
        //    13: istore_2       
        //    14: iload_2        
        //    15: bipush          116
        //    17: if_icmpeq       26
        //    20: iload_2        
        //    21: bipush          84
        //    23: if_icmpne       48
        //    26: getstatic       com/google/ai.z:[Ljava/lang/String;
        //    29: bipush          17
        //    31: aaload         
        //    32: astore_3       
        //    33: getstatic       com/google/ai.z:[Ljava/lang/String;
        //    36: bipush          19
        //    38: aaload         
        //    39: astore          4
        //    41: iconst_5       
        //    42: istore          5
        //    44: iload_1        
        //    45: ifeq            120
        //    48: iload_2        
        //    49: bipush          102
        //    51: if_icmpeq       60
        //    54: iload_2        
        //    55: bipush          70
        //    57: if_icmpne       83
        //    60: getstatic       com/google/ai.z:[Ljava/lang/String;
        //    63: bipush          22
        //    65: aaload         
        //    66: astore_3       
        //    67: getstatic       com/google/ai.z:[Ljava/lang/String;
        //    70: bipush          18
        //    72: aaload         
        //    73: astore          4
        //    75: bipush          6
        //    77: istore          5
        //    79: iload_1        
        //    80: ifeq            120
        //    83: iload_2        
        //    84: bipush          110
        //    86: if_icmpeq       95
        //    89: iload_2        
        //    90: bipush          78
        //    92: if_icmpne       118
        //    95: getstatic       com/google/ai.z:[Ljava/lang/String;
        //    98: bipush          20
        //   100: aaload         
        //   101: astore_3       
        //   102: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   105: bipush          21
        //   107: aaload         
        //   108: astore          4
        //   110: bipush          7
        //   112: istore          5
        //   114: iload_1        
        //   115: ifeq            120
        //   118: iconst_0       
        //   119: ireturn        
        //   120: aload_3        
        //   121: invokevirtual   java/lang/String.length:()I
        //   124: istore          6
        //   126: iconst_1       
        //   127: istore          7
        //   129: iload           7
        //   131: iload           6
        //   133: if_icmpge       245
        //   136: iload           7
        //   138: aload_0        
        //   139: getfield        com/google/ai.k:I
        //   142: iadd           
        //   143: istore          18
        //   145: aload_0        
        //   146: getfield        com/google/ai.d:I
        //   149: istore          19
        //   151: iload           18
        //   153: iload           19
        //   155: if_icmplt       185
        //   158: iload           7
        //   160: iconst_1       
        //   161: iadd           
        //   162: istore          24
        //   164: aload_0        
        //   165: iload           24
        //   167: invokespecial   com/google/ai.a:(I)Z
        //   170: ifne            185
        //   173: iconst_0       
        //   174: ireturn        
        //   175: astore          16
        //   177: aload           16
        //   179: athrow         
        //   180: astore          17
        //   182: aload           17
        //   184: athrow         
        //   185: aload_0        
        //   186: getfield        com/google/ai.h:[C
        //   189: iload           7
        //   191: aload_0        
        //   192: getfield        com/google/ai.k:I
        //   195: iadd           
        //   196: caload         
        //   197: istore          20
        //   199: aload_3        
        //   200: iload           7
        //   202: invokevirtual   java/lang/String.charAt:(I)C
        //   205: istore          23
        //   207: iload           20
        //   209: iload           23
        //   211: if_icmpeq       238
        //   214: iload           20
        //   216: aload           4
        //   218: iload           7
        //   220: invokevirtual   java/lang/String.charAt:(I)C
        //   223: if_icmpeq       238
        //   226: iconst_0       
        //   227: ireturn        
        //   228: astore          21
        //   230: aload           21
        //   232: athrow         
        //   233: astore          22
        //   235: aload           22
        //   237: athrow         
        //   238: iinc            7, 1
        //   241: iload_1        
        //   242: ifeq            129
        //   245: iload           6
        //   247: aload_0        
        //   248: getfield        com/google/ai.k:I
        //   251: iadd           
        //   252: istore          11
        //   254: aload_0        
        //   255: getfield        com/google/ai.d:I
        //   258: istore          12
        //   260: iload           11
        //   262: iload           12
        //   264: if_icmplt       286
        //   267: iload           6
        //   269: iconst_1       
        //   270: iadd           
        //   271: istore          14
        //   273: aload_0        
        //   274: iload           14
        //   276: invokespecial   com/google/ai.a:(I)Z
        //   279: istore          15
        //   281: iload           15
        //   283: ifeq            326
        //   286: aload_0        
        //   287: aload_0        
        //   288: getfield        com/google/ai.h:[C
        //   291: iload           6
        //   293: aload_0        
        //   294: getfield        com/google/ai.k:I
        //   297: iadd           
        //   298: caload         
        //   299: invokespecial   com/google/ai.b:(C)Z
        //   302: istore          13
        //   304: iload           13
        //   306: ifeq            326
        //   309: iconst_0       
        //   310: ireturn        
        //   311: astore          8
        //   313: aload           8
        //   315: athrow         
        //   316: astore          9
        //   318: aload           9
        //   320: athrow         
        //   321: astore          10
        //   323: aload           10
        //   325: athrow         
        //   326: aload_0        
        //   327: iload           6
        //   329: aload_0        
        //   330: getfield        com/google/ai.k:I
        //   333: iadd           
        //   334: putfield        com/google/ai.k:I
        //   337: aload_0        
        //   338: iload           5
        //   340: putfield        com/google/ai.b:I
        //   343: iload           5
        //   345: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  136    151    175    180    Ljava/lang/NullPointerException;
        //  164    173    180    185    Ljava/lang/NullPointerException;
        //  177    180    180    185    Ljava/lang/NullPointerException;
        //  199    207    228    233    Ljava/lang/NullPointerException;
        //  214    226    233    238    Ljava/lang/NullPointerException;
        //  230    233    233    238    Ljava/lang/NullPointerException;
        //  245    260    311    316    Ljava/lang/NullPointerException;
        //  273    281    316    321    Ljava/lang/NullPointerException;
        //  286    304    321    326    Ljava/lang/NullPointerException;
        //  313    316    316    321    Ljava/lang/NullPointerException;
        //  318    321    321    326    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 185, Size: 185
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/google/ai.h:[C
        //     8: astore_2       
        //     9: aload_0        
        //    10: getfield        com/google/ai.k:I
        //    13: istore_3       
        //    14: aload_0        
        //    15: getfield        com/google/ai.d:I
        //    18: istore          4
        //    20: lconst_0       
        //    21: lstore          5
        //    23: iconst_0       
        //    24: istore          7
        //    26: iconst_1       
        //    27: istore          8
        //    29: iconst_0       
        //    30: istore          9
        //    32: iconst_0       
        //    33: istore          10
        //    35: iload_3        
        //    36: iload           10
        //    38: iadd           
        //    39: iload           4
        //    41: if_icmpne       96
        //    44: aload_2        
        //    45: arraylength    
        //    46: istore          33
        //    48: iload           10
        //    50: iload           33
        //    52: if_icmpne       62
        //    55: iconst_0       
        //    56: ireturn        
        //    57: astore          32
        //    59: aload           32
        //    61: athrow         
        //    62: iload           10
        //    64: iconst_1       
        //    65: iadd           
        //    66: istore          34
        //    68: aload_0        
        //    69: iload           34
        //    71: invokespecial   com/google/ai.a:(I)Z
        //    74: istore          36
        //    76: iload           36
        //    78: ifne            85
        //    81: iload_1        
        //    82: ifeq            657
        //    85: aload_0        
        //    86: getfield        com/google/ai.k:I
        //    89: istore_3       
        //    90: aload_0        
        //    91: getfield        com/google/ai.d:I
        //    94: istore          4
        //    96: aload_2        
        //    97: iload_3        
        //    98: iload           10
        //   100: iadd           
        //   101: caload         
        //   102: istore          11
        //   104: iload           11
        //   106: lookupswitch {
        //               43: 225
        //               45: 194
        //               46: 262
        //               69: 241
        //              101: 241
        //          default: 156
        //        }
        //   156: iload           11
        //   158: bipush          48
        //   160: if_icmplt       170
        //   163: iload           11
        //   165: bipush          57
        //   167: if_icmple       287
        //   170: aload_0        
        //   171: iload           11
        //   173: invokespecial   com/google/ai.b:(C)Z
        //   176: istore          24
        //   178: iload           24
        //   180: ifne            187
        //   183: iload_1        
        //   184: ifeq            657
        //   187: iconst_0       
        //   188: ireturn        
        //   189: astore          35
        //   191: aload           35
        //   193: athrow         
        //   194: iload           9
        //   196: ifne            209
        //   199: iconst_1       
        //   200: istore          7
        //   202: iconst_1       
        //   203: istore          9
        //   205: iload_1        
        //   206: ifeq            638
        //   209: iload           9
        //   211: iconst_5       
        //   212: if_icmpne       223
        //   215: bipush          6
        //   217: istore          9
        //   219: iload_1        
        //   220: ifeq            638
        //   223: iconst_0       
        //   224: ireturn        
        //   225: iload           9
        //   227: iconst_5       
        //   228: if_icmpne       239
        //   231: bipush          6
        //   233: istore          9
        //   235: iload_1        
        //   236: ifeq            638
        //   239: iconst_0       
        //   240: ireturn        
        //   241: iload           9
        //   243: iconst_2       
        //   244: if_icmpeq       253
        //   247: iload           9
        //   249: iconst_4       
        //   250: if_icmpne       260
        //   253: iconst_5       
        //   254: istore          9
        //   256: iload_1        
        //   257: ifeq            638
        //   260: iconst_0       
        //   261: ireturn        
        //   262: iload           9
        //   264: iconst_2       
        //   265: if_icmpne       275
        //   268: iconst_3       
        //   269: istore          9
        //   271: iload_1        
        //   272: ifeq            638
        //   275: iconst_0       
        //   276: ireturn        
        //   277: astore          22
        //   279: aload           22
        //   281: athrow         
        //   282: astore          23
        //   284: aload           23
        //   286: athrow         
        //   287: iload           9
        //   289: iconst_1       
        //   290: if_icmpeq       298
        //   293: iload           9
        //   295: ifne            314
        //   298: iload           11
        //   300: bipush          48
        //   302: isub           
        //   303: ineg           
        //   304: i2l            
        //   305: lstore          5
        //   307: iconst_2       
        //   308: istore          9
        //   310: iload_1        
        //   311: ifeq            638
        //   314: lload           5
        //   316: lstore          26
        //   318: iload           9
        //   320: istore          28
        //   322: iload           28
        //   324: iconst_2       
        //   325: if_icmpne       627
        //   328: lload           26
        //   330: lconst_0       
        //   331: lcmp           
        //   332: ifne            337
        //   335: iconst_0       
        //   336: ireturn        
        //   337: ldc2_w          10
        //   340: lload           26
        //   342: lmul           
        //   343: iload           11
        //   345: bipush          48
        //   347: isub           
        //   348: i2l            
        //   349: lsub           
        //   350: lstore          12
        //   352: lload           26
        //   354: ldc2_w          -922337203685477580
        //   357: lcmp           
        //   358: ifgt            378
        //   361: lload           26
        //   363: ldc2_w          -922337203685477580
        //   366: lcmp           
        //   367: ifne            516
        //   370: lload           12
        //   372: lload           26
        //   374: lcmp           
        //   375: ifge            516
        //   378: iconst_1       
        //   379: istore          30
        //   381: iload           8
        //   383: iload           30
        //   385: iand           
        //   386: istore          31
        //   388: iload_1        
        //   389: ifeq            612
        //   392: iload           31
        //   394: istore          29
        //   396: iload           28
        //   398: iconst_3       
        //   399: if_icmpne       605
        //   402: iconst_4       
        //   403: istore          16
        //   405: iload_1        
        //   406: ifeq            594
        //   409: iload           16
        //   411: iconst_5       
        //   412: if_icmpeq       422
        //   415: iload           16
        //   417: bipush          6
        //   419: if_icmpne       594
        //   422: bipush          7
        //   424: istore          16
        //   426: iload           7
        //   428: istore          14
        //   430: iload           29
        //   432: istore          15
        //   434: iload           10
        //   436: iconst_1       
        //   437: iadd           
        //   438: istore          17
        //   440: iload_1        
        //   441: ifeq            571
        //   444: iload           16
        //   446: istore          18
        //   448: lload           12
        //   450: lstore          19
        //   452: iload           15
        //   454: istore          8
        //   456: iload           14
        //   458: istore          7
        //   460: iload           18
        //   462: iconst_2       
        //   463: if_icmpne       530
        //   466: iload           8
        //   468: ifeq            530
        //   471: lload           19
        //   473: ldc2_w          -9223372036854775808
        //   476: lcmp           
        //   477: ifne            485
        //   480: iload           7
        //   482: ifeq            530
        //   485: iload           7
        //   487: ifeq            522
        //   490: aload_0        
        //   491: lload           19
        //   493: putfield        com/google/ai.g:J
        //   496: aload_0        
        //   497: iload           17
        //   499: aload_0        
        //   500: getfield        com/google/ai.k:I
        //   503: iadd           
        //   504: putfield        com/google/ai.k:I
        //   507: aload_0        
        //   508: bipush          15
        //   510: putfield        com/google/ai.b:I
        //   513: bipush          15
        //   515: ireturn        
        //   516: iconst_0       
        //   517: istore          30
        //   519: goto            381
        //   522: lload           19
        //   524: lneg           
        //   525: lstore          19
        //   527: goto            490
        //   530: iload           18
        //   532: iconst_2       
        //   533: if_icmpeq       549
        //   536: iload           18
        //   538: iconst_4       
        //   539: if_icmpeq       549
        //   542: iload           18
        //   544: bipush          7
        //   546: if_icmpne       569
        //   549: aload_0        
        //   550: iload           17
        //   552: putfield        com/google/ai.i:I
        //   555: aload_0        
        //   556: bipush          16
        //   558: putfield        com/google/ai.b:I
        //   561: bipush          16
        //   563: ireturn        
        //   564: astore          21
        //   566: aload           21
        //   568: athrow         
        //   569: iconst_0       
        //   570: ireturn        
        //   571: iload           17
        //   573: istore          10
        //   575: iload           16
        //   577: istore          9
        //   579: iload           15
        //   581: istore          8
        //   583: iload           14
        //   585: istore          7
        //   587: lload           12
        //   589: lstore          5
        //   591: goto            35
        //   594: iload           7
        //   596: istore          14
        //   598: iload           29
        //   600: istore          15
        //   602: goto            434
        //   605: iload           28
        //   607: istore          16
        //   609: goto            409
        //   612: iload           7
        //   614: istore          14
        //   616: iload           31
        //   618: istore          15
        //   620: iload           28
        //   622: istore          16
        //   624: goto            434
        //   627: iload           8
        //   629: istore          29
        //   631: lload           26
        //   633: lstore          12
        //   635: goto            396
        //   638: lload           5
        //   640: lstore          12
        //   642: iload           7
        //   644: istore          14
        //   646: iload           8
        //   648: istore          15
        //   650: iload           9
        //   652: istore          16
        //   654: goto            434
        //   657: lload           5
        //   659: lstore          19
        //   661: iload           9
        //   663: istore          25
        //   665: iload           10
        //   667: istore          17
        //   669: iload           25
        //   671: istore          18
        //   673: goto            460
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  44     48     57     62     Ljava/lang/NullPointerException;
        //  68     76     189    194    Ljava/lang/NullPointerException;
        //  170    178    277    287    Ljava/lang/NullPointerException;
        //  279    282    282    287    Ljava/lang/NullPointerException;
        //  549    561    564    569    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0170:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void j() {
        final int l = c3.l;
        while (true) {
            if (this.k >= this.d && !this.a(1)) {
                return;
            }
            final char c = this.h[this.k++];
            Label_0074: {
                if (c != '\n') {
                    break Label_0074;
                }
                try {
                    ++this.o;
                    this.l = this.k;
                    if (l != 0) {
                        if ((c != '\r' || l != 0) && l == 0) {
                            continue;
                        }
                    }
                }
                catch (NullPointerException ex) {
                    try {
                        throw ex;
                    }
                    catch (NullPointerException ex2) {
                        try {
                            throw ex2;
                        }
                        catch (NullPointerException ex3) {
                            throw ex3;
                        }
                    }
                }
            }
        }
    }
    
    private char l() {
        final int l = c3.l;
        try {
            if (this.k == this.d) {
                try {
                    if (!this.a(1)) {
                        throw this.a(ai.z[24]);
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        final char c = this.h[this.k++];
        switch (c) {
            default: {
                return c;
            }
            case 117: {
                try {
                    if (4 + this.k > this.d) {
                        try {
                            if (!this.a(4)) {
                                throw this.a(ai.z[26]);
                            }
                        }
                        catch (NullPointerException ex3) {
                            throw ex3;
                        }
                    }
                }
                catch (NullPointerException ex4) {
                    throw ex4;
                }
                final int k = this.k;
                final int n = k + 4;
                char c2 = '\0';
                int i = k;
                while (i < n) {
                    final char c3 = this.h[i];
                    c2 <<= 4;
                    Label_0383: {
                        if (c3 >= '0' && c3 <= '9') {
                            c2 += (char)(c3 - '0');
                            if (l == 0) {
                                break Label_0383;
                            }
                        }
                        if (c3 >= 'a' && c3 <= 'f') {
                            c2 += (char)('\n' + (c3 - 'a'));
                            if (l == 0) {
                                break Label_0383;
                            }
                        }
                        if (c3 >= 'A' && c3 <= 'F') {
                            c2 += (char)('\n' + (c3 - 'A'));
                            if (l == 0) {
                                break Label_0383;
                            }
                        }
                        try {
                            throw new NumberFormatException(ai.z[25] + new String(this.h, this.k, 4));
                        }
                        catch (NullPointerException ex5) {
                            throw ex5;
                        }
                    }
                    ++i;
                    if (l != 0) {
                        break;
                    }
                }
                this.k += 4;
                return c2;
            }
            case 116: {
                return '\t';
            }
            case 98: {
                return '\b';
            }
            case 110: {
                return '\n';
            }
            case 114: {
                return '\r';
            }
            case 102: {
                return '\f';
            }
            case 10: {
                ++this.o;
                this.l = this.k;
                return c;
            }
        }
    }
    
    private void m() {
        final int l = c3.l;
    Label_0004:
        while (true) {
            while (true) {
                int n = 0;
                while (true) {
                    Label_0179: {
                        if (n + this.k >= this.d) {
                            break Label_0179;
                        }
                        try {
                            switch (this.h[n + this.k]) {
                                default: {
                                    ++n;
                                    if (l == 0) {
                                        continue;
                                    }
                                    this.k += n;
                                    if (!this.a(1)) {
                                        return;
                                    }
                                    continue Label_0004;
                                }
                                case '#':
                                case '/':
                                case ';':
                                case '=':
                                case '\\': {
                                    this.d();
                                }
                                case '\t':
                                case '\n':
                                case '\f':
                                case '\r':
                                case ' ':
                                case ',':
                                case ':':
                                case '[':
                                case ']':
                                case '{':
                                case '}': {
                                    this.k += n;
                                }
                            }
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                    }
                }
            }
            break;
        }
    }
    
    private String q() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_1       
        //     4: aconst_null    
        //     5: astore_2       
        //     6: iconst_0       
        //     7: istore_3       
        //     8: iload_3        
        //     9: aload_0        
        //    10: getfield        com/google/ai.k:I
        //    13: iadd           
        //    14: aload_0        
        //    15: getfield        com/google/ai.d:I
        //    18: if_icmpge       183
        //    21: aload_0        
        //    22: getfield        com/google/ai.h:[C
        //    25: iload_3        
        //    26: aload_0        
        //    27: getfield        com/google/ai.k:I
        //    30: iadd           
        //    31: caload         
        //    32: istore          14
        //    34: iload           14
        //    36: lookupswitch {
        //                9: 333
        //               10: 333
        //               12: 333
        //               13: 333
        //               32: 333
        //               35: 329
        //               44: 333
        //               47: 329
        //               58: 333
        //               59: 329
        //               61: 329
        //               91: 333
        //               92: 329
        //               93: 333
        //              123: 333
        //              125: 333
        //          default: 176
        //        }
        //   176: iinc            3, 1
        //   179: iload_1        
        //   180: ifeq            8
        //   183: aload_0        
        //   184: getfield        com/google/ai.h:[C
        //   187: arraylength    
        //   188: istore          6
        //   190: iload_3        
        //   191: iload           6
        //   193: if_icmpge       218
        //   196: iload_3        
        //   197: iconst_1       
        //   198: iadd           
        //   199: istore          11
        //   201: aload_0        
        //   202: iload           11
        //   204: invokespecial   com/google/ai.a:(I)Z
        //   207: istore          12
        //   209: iload           12
        //   211: ifeq            337
        //   214: iload_1        
        //   215: ifeq            8
        //   218: aload_2        
        //   219: ifnonnull       230
        //   222: new             Ljava/lang/StringBuilder;
        //   225: dup            
        //   226: invokespecial   java/lang/StringBuilder.<init>:()V
        //   229: astore_2       
        //   230: aload_2        
        //   231: aload_0        
        //   232: getfield        com/google/ai.h:[C
        //   235: aload_0        
        //   236: getfield        com/google/ai.k:I
        //   239: iload_3        
        //   240: invokevirtual   java/lang/StringBuilder.append:([CII)Ljava/lang/StringBuilder;
        //   243: pop            
        //   244: aload_0        
        //   245: iload_3        
        //   246: aload_0        
        //   247: getfield        com/google/ai.k:I
        //   250: iadd           
        //   251: putfield        com/google/ai.k:I
        //   254: aload_0        
        //   255: iconst_1       
        //   256: invokespecial   com/google/ai.a:(I)Z
        //   259: ifne            358
        //   262: iconst_0       
        //   263: istore_3       
        //   264: aload_2        
        //   265: astore          8
        //   267: aload           8
        //   269: ifnonnull       294
        //   272: new             Ljava/lang/String;
        //   275: dup            
        //   276: aload_0        
        //   277: getfield        com/google/ai.h:[C
        //   280: aload_0        
        //   281: getfield        com/google/ai.k:I
        //   284: iload_3        
        //   285: invokespecial   java/lang/String.<init>:([CII)V
        //   288: astore          9
        //   290: iload_1        
        //   291: ifeq            316
        //   294: aload           8
        //   296: aload_0        
        //   297: getfield        com/google/ai.h:[C
        //   300: aload_0        
        //   301: getfield        com/google/ai.k:I
        //   304: iload_3        
        //   305: invokevirtual   java/lang/StringBuilder.append:([CII)Ljava/lang/StringBuilder;
        //   308: pop            
        //   309: aload           8
        //   311: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   314: astore          9
        //   316: aload_0        
        //   317: iload_3        
        //   318: aload_0        
        //   319: getfield        com/google/ai.k:I
        //   322: iadd           
        //   323: putfield        com/google/ai.k:I
        //   326: aload           9
        //   328: areturn        
        //   329: aload_0        
        //   330: invokespecial   com/google/ai.d:()V
        //   333: iload_1        
        //   334: ifne            176
        //   337: aload_2        
        //   338: astore          8
        //   340: goto            267
        //   343: astore          13
        //   345: aload           13
        //   347: athrow         
        //   348: astore          4
        //   350: aload           4
        //   352: athrow         
        //   353: astore          5
        //   355: aload           5
        //   357: athrow         
        //   358: iconst_0       
        //   359: istore_3       
        //   360: goto            8
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  21     34     343    348    Ljava/lang/NullPointerException;
        //  183    190    348    353    Ljava/lang/NullPointerException;
        //  201    209    353    358    Ljava/lang/NullPointerException;
        //  329    333    343    348    Ljava/lang/NullPointerException;
        //  350    353    353    358    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 124, Size: 124
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int r() {
        return 1 + (this.k - this.l);
    }
    
    private int s() {
        return 1 + this.o;
    }
    
    public void a() {
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        while (true) {
            if (n == 4) {
                try {
                    --this.f;
                    final int[] j = this.j;
                    final int n2 = -1 + this.f;
                    ++j[n2];
                    this.b = 0;
                    if (c3.l != 0) {
                        throw new IllegalStateException(ai.z[1] + this.f() + ai.z[2] + this.s() + ai.z[0] + this.r() + ai.z[3] + this.k());
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    public String b() {
        final int l = c3.l;
        final int b = this.b;
        int g;
        if (b == 0) {
            g = this.g();
        }
        else {
            g = b;
        }
        String s = null;
        Label_0157: {
            if (g == 14) {
                s = this.q();
                if (l == 0) {
                    break Label_0157;
                }
            }
            if (g == 12) {
                s = this.a('\'');
                if (l == 0) {
                    break Label_0157;
                }
            }
            if (g == 13) {
                s = this.a('\"');
                if (l == 0) {
                    break Label_0157;
                }
            }
            try {
                throw new IllegalStateException(ai.z[47] + this.f() + ai.z[49] + this.s() + ai.z[50] + this.r() + ai.z[48] + this.k());
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.b = 0;
        return this.c[-1 + this.f] = s;
    }
    
    public void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_1       
        //     4: iconst_0       
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        com/google/ai.b:I
        //    10: istore_3       
        //    11: iload_3        
        //    12: ifne            20
        //    15: aload_0        
        //    16: invokespecial   com/google/ai.g:()I
        //    19: istore_3       
        //    20: iload_3        
        //    21: iconst_3       
        //    22: if_icmpne       37
        //    25: aload_0        
        //    26: iconst_1       
        //    27: invokespecial   com/google/ai.b:(I)V
        //    30: iinc            2, 1
        //    33: iload_1        
        //    34: ifeq            181
        //    37: iload_3        
        //    38: iconst_1       
        //    39: if_icmpne       54
        //    42: aload_0        
        //    43: iconst_3       
        //    44: invokespecial   com/google/ai.b:(I)V
        //    47: iinc            2, 1
        //    50: iload_1        
        //    51: ifeq            181
        //    54: iload_3        
        //    55: iconst_4       
        //    56: if_icmpne       76
        //    59: aload_0        
        //    60: iconst_m1      
        //    61: aload_0        
        //    62: getfield        com/google/ai.f:I
        //    65: iadd           
        //    66: putfield        com/google/ai.f:I
        //    69: iinc            2, -1
        //    72: iload_1        
        //    73: ifeq            181
        //    76: iload_3        
        //    77: iconst_2       
        //    78: if_icmpne       98
        //    81: aload_0        
        //    82: iconst_m1      
        //    83: aload_0        
        //    84: getfield        com/google/ai.f:I
        //    87: iadd           
        //    88: putfield        com/google/ai.f:I
        //    91: iinc            2, -1
        //    94: iload_1        
        //    95: ifeq            181
        //    98: iload_3        
        //    99: bipush          14
        //   101: if_icmpeq       110
        //   104: iload_3        
        //   105: bipush          10
        //   107: if_icmpne       118
        //   110: aload_0        
        //   111: invokespecial   com/google/ai.m:()V
        //   114: iload_1        
        //   115: ifeq            181
        //   118: iload_3        
        //   119: bipush          8
        //   121: if_icmpeq       130
        //   124: iload_3        
        //   125: bipush          12
        //   127: if_icmpne       140
        //   130: aload_0        
        //   131: bipush          39
        //   133: invokespecial   com/google/ai.c:(C)V
        //   136: iload_1        
        //   137: ifeq            181
        //   140: iload_3        
        //   141: bipush          9
        //   143: if_icmpeq       152
        //   146: iload_3        
        //   147: bipush          13
        //   149: if_icmpne       162
        //   152: aload_0        
        //   153: bipush          34
        //   155: invokespecial   com/google/ai.c:(C)V
        //   158: iload_1        
        //   159: ifeq            181
        //   162: iload_3        
        //   163: bipush          16
        //   165: if_icmpne       181
        //   168: aload_0        
        //   169: aload_0        
        //   170: getfield        com/google/ai.k:I
        //   173: aload_0        
        //   174: getfield        com/google/ai.i:I
        //   177: iadd           
        //   178: putfield        com/google/ai.k:I
        //   181: aload_0        
        //   182: iconst_0       
        //   183: putfield        com/google/ai.b:I
        //   186: iload_2        
        //   187: ifne            6
        //   190: aload_0        
        //   191: getfield        com/google/ai.j:[I
        //   194: astore          13
        //   196: iconst_m1      
        //   197: aload_0        
        //   198: getfield        com/google/ai.f:I
        //   201: iadd           
        //   202: istore          14
        //   204: aload           13
        //   206: iload           14
        //   208: iconst_1       
        //   209: aload           13
        //   211: iload           14
        //   213: iaload         
        //   214: iadd           
        //   215: iastore        
        //   216: aload_0        
        //   217: getfield        com/google/ai.c:[Ljava/lang/String;
        //   220: iconst_m1      
        //   221: aload_0        
        //   222: getfield        com/google/ai.f:I
        //   225: iadd           
        //   226: getstatic       com/google/ai.z:[Ljava/lang/String;
        //   229: bipush          23
        //   231: aaload         
        //   232: aastore        
        //   233: getstatic       com/google/e_.a:Z
        //   236: ifeq            245
        //   239: iload_1        
        //   240: iconst_1       
        //   241: iadd           
        //   242: putstatic       com/google/c3.l:I
        //   245: return         
        //   246: astore          22
        //   248: aload           22
        //   250: athrow         
        //   251: astore          23
        //   253: aload           23
        //   255: athrow         
        //   256: astore          20
        //   258: aload           20
        //   260: athrow         
        //   261: astore          21
        //   263: aload           21
        //   265: athrow         
        //   266: astore          18
        //   268: aload           18
        //   270: athrow         
        //   271: astore          19
        //   273: aload           19
        //   275: athrow         
        //   276: astore          15
        //   278: aload           15
        //   280: athrow         
        //   281: astore          16
        //   283: aload           16
        //   285: athrow         
        //   286: astore          17
        //   288: aload           17
        //   290: athrow         
        //   291: astore          4
        //   293: aload           4
        //   295: athrow         
        //   296: astore          5
        //   298: aload           5
        //   300: athrow         
        //   301: astore          6
        //   303: aload           6
        //   305: athrow         
        //   306: astore          7
        //   308: aload           7
        //   310: athrow         
        //   311: astore          8
        //   313: aload           8
        //   315: athrow         
        //   316: astore          9
        //   318: aload           9
        //   320: athrow         
        //   321: astore          10
        //   323: aload           10
        //   325: athrow         
        //   326: astore          11
        //   328: aload           11
        //   330: athrow         
        //   331: astore          12
        //   333: aload           12
        //   335: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  25     30     246    256    Ljava/lang/NullPointerException;
        //  42     47     256    266    Ljava/lang/NullPointerException;
        //  59     69     266    276    Ljava/lang/NullPointerException;
        //  81     91     276    291    Ljava/lang/NullPointerException;
        //  110    114    291    306    Ljava/lang/NullPointerException;
        //  130    136    306    321    Ljava/lang/NullPointerException;
        //  152    158    321    326    Ljava/lang/NullPointerException;
        //  168    181    326    331    Ljava/lang/NullPointerException;
        //  190    245    331    336    Ljava/lang/NullPointerException;
        //  248    251    251    256    Ljava/lang/NullPointerException;
        //  253    256    256    266    Ljava/lang/NullPointerException;
        //  258    261    261    266    Ljava/lang/NullPointerException;
        //  263    266    266    276    Ljava/lang/NullPointerException;
        //  268    271    271    276    Ljava/lang/NullPointerException;
        //  273    276    276    291    Ljava/lang/NullPointerException;
        //  278    281    281    291    Ljava/lang/NullPointerException;
        //  283    286    286    291    Ljava/lang/NullPointerException;
        //  288    291    291    306    Ljava/lang/NullPointerException;
        //  293    296    296    306    Ljava/lang/NullPointerException;
        //  298    301    301    306    Ljava/lang/NullPointerException;
        //  303    306    306    321    Ljava/lang/NullPointerException;
        //  308    311    311    321    Ljava/lang/NullPointerException;
        //  313    316    316    321    Ljava/lang/NullPointerException;
        //  318    321    321    326    Ljava/lang/NullPointerException;
        //  323    326    326    331    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 188, Size: 188
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void close() {
        this.b = 0;
        this.p[0] = 8;
        this.f = 1;
        this.m.close();
    }
    
    public cX f() {
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 1: {
                try {
                    return cX.BEGIN_OBJECT;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
            }
            case 2: {
                return cX.END_OBJECT;
            }
            case 3: {
                return cX.BEGIN_ARRAY;
            }
            case 4: {
                return cX.END_ARRAY;
            }
            case 12:
            case 13:
            case 14: {
                return cX.NAME;
            }
            case 5:
            case 6: {
                return cX.BOOLEAN;
            }
            case 7: {
                return cX.NULL;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return cX.STRING;
            }
            case 15:
            case 16: {
                return cX.NUMBER;
            }
            case 17: {
                return cX.END_DOCUMENT;
            }
        }
    }
    
    public String k() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_1       
        //     4: new             Ljava/lang/StringBuilder;
        //     7: dup            
        //     8: invokespecial   java/lang/StringBuilder.<init>:()V
        //    11: bipush          36
        //    13: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    16: astore_2       
        //    17: iconst_0       
        //    18: istore_3       
        //    19: aload_0        
        //    20: getfield        com/google/ai.f:I
        //    23: istore          4
        //    25: iload_3        
        //    26: iload           4
        //    28: if_icmpge       83
        //    31: aload_0        
        //    32: getfield        com/google/ai.p:[I
        //    35: iload_3        
        //    36: iaload         
        //    37: istore          8
        //    39: iload           8
        //    41: tableswitch {
        //                2: 88
        //                3: 88
        //                4: 113
        //                5: 113
        //                6: 113
        //          default: 76
        //        }
        //    76: iinc            3, 1
        //    79: iload_1        
        //    80: ifeq            25
        //    83: aload_2        
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: areturn        
        //    88: aload_2        
        //    89: bipush          91
        //    91: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    94: aload_0        
        //    95: getfield        com/google/ai.j:[I
        //    98: iload_3        
        //    99: iaload         
        //   100: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   103: bipush          93
        //   105: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   108: pop            
        //   109: iload_1        
        //   110: ifeq            76
        //   113: aload_2        
        //   114: bipush          46
        //   116: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: aload_0        
        //   121: getfield        com/google/ai.c:[Ljava/lang/String;
        //   124: iload_3        
        //   125: aaload         
        //   126: ifnull          76
        //   129: aload_2        
        //   130: aload_0        
        //   131: getfield        com/google/ai.c:[Ljava/lang/String;
        //   134: iload_3        
        //   135: aaload         
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: pop            
        //   140: goto            76
        //   143: astore          7
        //   145: aload           7
        //   147: athrow         
        //   148: astore          5
        //   150: aload           5
        //   152: athrow         
        //   153: astore          6
        //   155: aload           6
        //   157: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  31     39     148    153    Ljava/lang/NullPointerException;
        //  88     109    153    158    Ljava/lang/NullPointerException;
        //  113    140    143    148    Ljava/lang/NullPointerException;
        //  150    153    153    158    Ljava/lang/NullPointerException;
        //  155    158    143    148    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0088:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void n() {
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        while (true) {
            if (n == 3) {
                try {
                    this.b(1);
                    this.j[-1 + this.f] = 0;
                    this.b = 0;
                    if (c3.l != 0) {
                        throw new IllegalStateException(ai.z[27] + this.f() + ai.z[30] + this.s() + ai.z[28] + this.r() + ai.z[29] + this.k());
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    public boolean o() {
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        return n != 2 && n != 4;
    }
    
    public void p() {
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        while (true) {
            if (n == 1) {
                try {
                    this.b(3);
                    this.b = 0;
                    if (c3.l != 0) {
                        throw new IllegalStateException(ai.z[6] + this.f() + ai.z[4] + this.s() + ai.z[7] + this.r() + ai.z[5] + this.k());
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    public long t() {
        final int l = c3.l;
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        if (n == 15) {
            try {
                this.b = 0;
                final int[] j = this.j;
                final int n2 = -1 + this.f;
                ++j[n2];
                return this.g;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        while (true) {
            if (n == 16) {
                while (true) {
                    while (true) {
                        Label_0306: {
                            try {
                                this.e = new String(this.h, this.k, this.i);
                                this.k += this.i;
                                if (l == 0) {
                                    break;
                                }
                                if (n == 8 || n == 9) {
                                    if (n != 8) {
                                        break Label_0306;
                                    }
                                    final char c = '\'';
                                    this.e = this.a(c);
                                    try {
                                        final long long1 = Long.parseLong(this.e);
                                        this.b = 0;
                                        final int[] i = this.j;
                                        final int n3 = -1 + this.f;
                                        ++i[n3];
                                        return long1;
                                    }
                                    catch (NumberFormatException ex9) {
                                        if (l == 0) {
                                            break;
                                        }
                                    }
                                }
                                try {
                                    throw new IllegalStateException(ai.z[13] + this.f() + ai.z[12] + this.s() + ai.z[16] + this.r() + ai.z[15] + this.k());
                                }
                                catch (NumberFormatException ex2) {
                                    throw ex2;
                                }
                            }
                            catch (NumberFormatException ex3) {
                                try {
                                    throw ex3;
                                }
                                catch (NumberFormatException ex4) {
                                    try {
                                        throw ex4;
                                    }
                                    catch (NumberFormatException ex5) {
                                        try {
                                            throw ex5;
                                        }
                                        catch (NumberFormatException ex6) {
                                            try {
                                                throw ex6;
                                            }
                                            catch (NumberFormatException ex7) {
                                                throw ex7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final char c = '\"';
                        continue;
                    }
                }
                this.b = 11;
                final double double1 = Double.parseDouble(this.e);
                final long n4 = (long)double1;
                if (n4 != double1) {
                    try {
                        throw new NumberFormatException(ai.z[14] + this.e + ai.z[11] + this.s() + ai.z[10] + this.r() + ai.z[9] + this.k());
                    }
                    catch (NumberFormatException ex8) {
                        throw ex8;
                    }
                }
                this.e = null;
                this.b = 0;
                final int[] k = this.j;
                final int n5 = -1 + this.f;
                ++k[n5];
                return n4;
            }
            continue;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ai.z[31] + this.s() + ai.z[32] + this.r();
    }
    
    public String u() {
        final int l = c3.l;
        final int b = this.b;
        int g;
        if (b == 0) {
            g = this.g();
        }
        else {
            g = b;
        }
        String s = null;
        Label_0246: {
            if (g == 10) {
                s = this.q();
                if (l == 0) {
                    break Label_0246;
                }
            }
            if (g == 8) {
                s = this.a('\'');
                if (l == 0) {
                    break Label_0246;
                }
            }
            if (g == 9) {
                s = this.a('\"');
                if (l == 0) {
                    break Label_0246;
                }
            }
            Label_0091: {
                if (g != 11) {
                    break Label_0091;
                }
                s = this.e;
                try {
                    this.e = null;
                    if (l != 0) {
                        if (g == 15) {
                            s = Long.toString(this.g);
                            if (l == 0) {
                                break Label_0246;
                            }
                        }
                        Label_0154: {
                            if (g != 16) {
                                break Label_0154;
                            }
                            s = new String(this.h, this.k, this.i);
                            try {
                                this.k += this.i;
                                if (l != 0) {
                                    throw new IllegalStateException(ai.z[38] + this.f() + ai.z[35] + this.s() + ai.z[36] + this.r() + ai.z[37] + this.k());
                                }
                            }
                            catch (NullPointerException ex) {
                                throw ex;
                            }
                        }
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
        }
        this.b = 0;
        final int[] j = this.j;
        final int n = -1 + this.f;
        ++j[n];
        return s;
    }
    
    public void v() {
        int n = this.b;
        if (n == 0) {
            n = this.g();
        }
        while (true) {
            if (n == 2) {
                try {
                    --this.f;
                    this.c[this.f] = null;
                    final int[] j = this.j;
                    final int n2 = -1 + this.f;
                    ++j[n2];
                    this.b = 0;
                    if (c3.l != 0) {
                        throw new IllegalStateException(ai.z[61] + this.f() + ai.z[60] + this.s() + ai.z[58] + this.r() + ai.z[59] + this.k());
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
}
