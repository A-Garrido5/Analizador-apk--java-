// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.io.Writer;
import java.io.Flushable;
import java.io.Closeable;

public class c3 implements Closeable, Flushable
{
    private static final String[] f;
    private static final String[] j;
    public static int l;
    private static final String[] z;
    private String a;
    private int b;
    private boolean c;
    private String d;
    private final Writer e;
    private int[] g;
    private boolean h;
    private String i;
    private boolean k;
    
    static {
        final String[] z2 = new String[21];
        final char[] charArray = "H\u001a:@[p\u0000!K~\"\u0000&\u000eon\u0006&Kh,".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\f';
                    break;
                }
                case 0: {
                    c2 = '\u0002';
                    break;
                }
                case 1: {
                    c2 = 'i';
                    break;
                }
                case 2: {
                    c2 = 'U';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "l\b8K,?Tu@yn\u0005".toCharArray();
        for (int k = charArray2.length, n2 = 0; k > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\f';
                    break;
                }
                case 0: {
                    c4 = '\u0002';
                    break;
                }
                case 1: {
                    c4 = 'i';
                    break;
                }
                case 2: {
                    c4 = 'U';
                    break;
                }
                case 3: {
                    c4 = '.';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "d\b9]i".toCharArray();
        for (int l = charArray3.length, n3 = 0; l > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\f';
                    break;
                }
                case 0: {
                    c6 = '\u0002';
                    break;
                }
                case 1: {
                    c6 = 'i';
                    break;
                }
                case 2: {
                    c6 = 'U';
                    break;
                }
                case 3: {
                    c6 = '.';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "v\u001b K".toCharArray();
        for (int length = charArray4.length, n4 = 0; length > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\f';
                    break;
                }
                case 0: {
                    c8 = '\u0002';
                    break;
                }
                case 1: {
                    c8 = 'i';
                    break;
                }
                case 2: {
                    c8 = 'U';
                    break;
                }
                case 3: {
                    c8 = '.';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "H\u001a:@[p\u0000!K~\"\u0000&\u000eon\u0006&Kh,".toCharArray();
        for (int length2 = charArray5.length, n5 = 0; length2 > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\f';
                    break;
                }
                case 0: {
                    c10 = '\u0002';
                    break;
                }
                case 1: {
                    c10 = 'i';
                    break;
                }
                case 2: {
                    c10 = 'U';
                    break;
                }
                case 3: {
                    c10 = '.';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "H\u001a:@[p\u0000!K~\"\u0000&\u000eon\u0006&Kh,".toCharArray();
        for (int length3 = charArray6.length, n6 = 0; length3 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\f';
                    break;
                }
                case 0: {
                    c12 = '\u0002';
                    break;
                }
                case 1: {
                    c12 = 'i';
                    break;
                }
                case 2: {
                    c12 = 'U';
                    break;
                }
                case 3: {
                    c12 = '.';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "K\u00076Aar\u00050Zi\"\r:Myo\f;Z".toCharArray();
        for (int length4 = charArray7.length, n7 = 0; length4 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\f';
                    break;
                }
                case 0: {
                    c14 = '\u0002';
                    break;
                }
                case 1: {
                    c14 = 'i';
                    break;
                }
                case 2: {
                    c14 = 'U';
                    break;
                }
                case 3: {
                    c14 = '.';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "L\f&Zel\u000eu^~m\u000b9Ka,".toCharArray();
        for (int length5 = charArray8.length, n8 = 0; length5 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\f';
                    break;
                }
                case 0: {
                    c16 = '\u0002';
                    break;
                }
                case 1: {
                    c16 = 'i';
                    break;
                }
                case 2: {
                    c16 = 'U';
                    break;
                }
                case 3: {
                    c16 = '.';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "L\f&Zel\u000eu^~m\u000b9Ka,".toCharArray();
        for (int length6 = charArray9.length, n9 = 0; length6 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\f';
                    break;
                }
                case 0: {
                    c18 = '\u0002';
                    break;
                }
                case 1: {
                    c18 = 'i';
                    break;
                }
                case 2: {
                    c18 = 'U';
                    break;
                }
                case 3: {
                    c18 = '.';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "F\b;I`k\u00072\u000ebc\u00040\u0014,".toCharArray();
        for (int length7 = charArray10.length, n10 = 0; length7 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '\f';
                    break;
                }
                case 0: {
                    c20 = '\u0002';
                    break;
                }
                case 1: {
                    c20 = 'i';
                    break;
                }
                case 2: {
                    c20 = 'U';
                    break;
                }
                case 3: {
                    c20 = '.';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "H:\u001a`,o\u001c&Z,q\u001d4\\x\"\u001e<Zd\"\b;\u000emp\u001b4W,m\u001buOb\"\u00067Dia\u001d{".toCharArray();
        for (int length8 = charArray11.length, n11 = 0; length8 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '\f';
                    break;
                }
                case 0: {
                    c22 = '\u0002';
                    break;
                }
                case 1: {
                    c22 = 'i';
                    break;
                }
                case 2: {
                    c22 = 'U';
                    break;
                }
                case 3: {
                    c22 = '.';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "H:\u001a`,o\u001c&Z,j\b#K,m\u00079W,m\u00070\u000exm\u0019xBit\f9\u000ezc\u0005 K\"".toCharArray();
        for (int length9 = charArray12.length, n12 = 0; length9 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '\f';
                    break;
                }
                case 0: {
                    c24 = '\u0002';
                    break;
                }
                case 1: {
                    c24 = 'i';
                    break;
                }
                case 2: {
                    c24 = 'U';
                    break;
                }
                case 3: {
                    c24 = '.';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "L\f&Zel\u000eu^~m\u000b9Ka,".toCharArray();
        for (int length10 = charArray13.length, n13 = 0; length10 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '\f';
                    break;
                }
                case 0: {
                    c26 = '\u0002';
                    break;
                }
                case 1: {
                    c26 = 'i';
                    break;
                }
                case 2: {
                    c26 = 'U';
                    break;
                }
                case 3: {
                    c26 = '.';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "L\u001c8K~k\nuXmn\u001c0],o\u001c&Z,`\fuHel\u0000!K \"\u000b Z,u\b&\u000e".toCharArray();
        for (int length11 = charArray14.length, n14 = 0; length11 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '\f';
                    break;
                }
                case 0: {
                    c28 = '\u0002';
                    break;
                }
                case 1: {
                    c28 = 'i';
                    break;
                }
                case 2: {
                    c28 = 'U';
                    break;
                }
                case 3: {
                    c28 = '.';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "L\b\u001b".toCharArray();
        for (int length12 = charArray15.length, n15 = 0; length12 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '\f';
                    break;
                }
                case 0: {
                    c30 = '\u0002';
                    break;
                }
                case 1: {
                    c30 = 'i';
                    break;
                }
                case 2: {
                    c30 = 'U';
                    break;
                }
                case 3: {
                    c30 = '.';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "K\u00073Gbk\u001d,".toCharArray();
        for (int length13 = charArray16.length, n16 = 0; length13 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '\f';
                    break;
                }
                case 0: {
                    c32 = '\u0002';
                    break;
                }
                case 1: {
                    c32 = 'i';
                    break;
                }
                case 2: {
                    c32 = 'U';
                    break;
                }
                case 3: {
                    c32 = '.';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "/ ;Hel\u0000!W".toCharArray();
        for (int length14 = charArray17.length, n17 = 0; length14 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '\f';
                    break;
                }
                case 0: {
                    c34 = '\u0002';
                    break;
                }
                case 1: {
                    c34 = 'i';
                    break;
                }
                case 2: {
                    c34 = 'U';
                    break;
                }
                case 3: {
                    c34 = '.';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "l\u001c9B".toCharArray();
        for (int length15 = charArray18.length, n18 = 0; length15 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '\f';
                    break;
                }
                case 0: {
                    c36 = '\u0002';
                    break;
                }
                case 1: {
                    c36 = 'i';
                    break;
                }
                case 2: {
                    c36 = 'U';
                    break;
                }
                case 3: {
                    c36 = '.';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "^\u001cg\u001e>:".toCharArray();
        for (int length16 = charArray19.length, n19 = 0; length16 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '\f';
                    break;
                }
                case 0: {
                    c38 = '\u0002';
                    break;
                }
                case 1: {
                    c38 = 'i';
                    break;
                }
                case 2: {
                    c38 = 'U';
                    break;
                }
                case 3: {
                    c38 = '.';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "^\u001cg\u001e>;".toCharArray();
        for (int length17 = charArray20.length, n20 = 0; length17 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '\f';
                    break;
                }
                case 0: {
                    c40 = '\u0002';
                    break;
                }
                case 1: {
                    c40 = 'i';
                    break;
                }
                case 2: {
                    c40 = 'U';
                    break;
                }
                case 3: {
                    c40 = '.';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "m\u001c!\u000e1?I;[`n".toCharArray();
        for (int length18 = charArray21.length, n21 = 0; length18 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = '\f';
                    break;
                }
                case 0: {
                    c42 = '\u0002';
                    break;
                }
                case 1: {
                    c42 = 'i';
                    break;
                }
                case 2: {
                    c42 = 'U';
                    break;
                }
                case 3: {
                    c42 = '.';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        z = z2;
        f = new String[128];
    Label_0893:
        for (int n22 = 0; n22 <= 31; ++n22) {
            while (true) {
                while (true) {
                    char[] charArray22 = null;
                    int n23 = 0;
                    Label_3280: {
                        try {
                            final String[] f2 = c3.f;
                            charArray22 = "^\u001cp\u001e8z".toCharArray();
                            final int length19 = charArray22.length;
                            n23 = 0;
                            if (length19 <= n23) {
                                f2[n22] = String.format(new String(charArray22).intern(), n22);
                                break;
                            }
                            break Label_3280;
                        }
                        catch (NullPointerException ex) {
                            throw ex;
                        }
                        break Label_0893;
                    }
                    final char c43 = charArray22[n23];
                    char c44 = '\0';
                    switch (n23 % 5) {
                        default: {
                            c44 = '\f';
                            break;
                        }
                        case 0: {
                            c44 = '\u0002';
                            break;
                        }
                        case 1: {
                            c44 = 'i';
                            break;
                        }
                        case 2: {
                            c44 = 'U';
                            break;
                        }
                        case 3: {
                            c44 = '.';
                            break;
                        }
                    }
                    charArray22[n23] = (char)(c44 ^ c43);
                    ++n23;
                    continue;
                }
            }
        }
        final String[] f3 = c3.f;
        final char[] charArray23 = "^K".toCharArray();
        for (int length20 = charArray23.length, n24 = 0; length20 > n24; ++n24) {
            final char c45 = charArray23[n24];
            char c46 = '\0';
            switch (n24 % 5) {
                default: {
                    c46 = '\f';
                    break;
                }
                case 0: {
                    c46 = '\u0002';
                    break;
                }
                case 1: {
                    c46 = 'i';
                    break;
                }
                case 2: {
                    c46 = 'U';
                    break;
                }
                case 3: {
                    c46 = '.';
                    break;
                }
            }
            charArray23[n24] = (char)(c46 ^ c45);
        }
        f3[34] = new String(charArray23).intern();
        final String[] f4 = c3.f;
        final char[] charArray24 = "^5".toCharArray();
        for (int length21 = charArray24.length, n25 = 0; length21 > n25; ++n25) {
            final char c47 = charArray24[n25];
            char c48 = '\0';
            switch (n25 % 5) {
                default: {
                    c48 = '\f';
                    break;
                }
                case 0: {
                    c48 = '\u0002';
                    break;
                }
                case 1: {
                    c48 = 'i';
                    break;
                }
                case 2: {
                    c48 = 'U';
                    break;
                }
                case 3: {
                    c48 = '.';
                    break;
                }
            }
            charArray24[n25] = (char)(c48 ^ c47);
        }
        f4[92] = new String(charArray24).intern();
        final String[] f5 = c3.f;
        final char[] charArray25 = "^\u001d".toCharArray();
        for (int length22 = charArray25.length, n26 = 0; length22 > n26; ++n26) {
            final char c49 = charArray25[n26];
            char c50 = '\0';
            switch (n26 % 5) {
                default: {
                    c50 = '\f';
                    break;
                }
                case 0: {
                    c50 = '\u0002';
                    break;
                }
                case 1: {
                    c50 = 'i';
                    break;
                }
                case 2: {
                    c50 = 'U';
                    break;
                }
                case 3: {
                    c50 = '.';
                    break;
                }
            }
            charArray25[n26] = (char)(c50 ^ c49);
        }
        f5[9] = new String(charArray25).intern();
        final String[] f6 = c3.f;
        final char[] charArray26 = "^\u000b".toCharArray();
        for (int length23 = charArray26.length, n27 = 0; length23 > n27; ++n27) {
            final char c51 = charArray26[n27];
            char c52 = '\0';
            switch (n27 % 5) {
                default: {
                    c52 = '\f';
                    break;
                }
                case 0: {
                    c52 = '\u0002';
                    break;
                }
                case 1: {
                    c52 = 'i';
                    break;
                }
                case 2: {
                    c52 = 'U';
                    break;
                }
                case 3: {
                    c52 = '.';
                    break;
                }
            }
            charArray26[n27] = (char)(c52 ^ c51);
        }
        f6[8] = new String(charArray26).intern();
        final String[] f7 = c3.f;
        final char[] charArray27 = "^\u0007".toCharArray();
        for (int length24 = charArray27.length, n28 = 0; length24 > n28; ++n28) {
            final char c53 = charArray27[n28];
            char c54 = '\0';
            switch (n28 % 5) {
                default: {
                    c54 = '\f';
                    break;
                }
                case 0: {
                    c54 = '\u0002';
                    break;
                }
                case 1: {
                    c54 = 'i';
                    break;
                }
                case 2: {
                    c54 = 'U';
                    break;
                }
                case 3: {
                    c54 = '.';
                    break;
                }
            }
            charArray27[n28] = (char)(c54 ^ c53);
        }
        f7[10] = new String(charArray27).intern();
        final String[] f8 = c3.f;
        final char[] charArray28 = "^\u001b".toCharArray();
        for (int length25 = charArray28.length, n29 = 0; length25 > n29; ++n29) {
            final char c55 = charArray28[n29];
            char c56 = '\0';
            switch (n29 % 5) {
                default: {
                    c56 = '\f';
                    break;
                }
                case 0: {
                    c56 = '\u0002';
                    break;
                }
                case 1: {
                    c56 = 'i';
                    break;
                }
                case 2: {
                    c56 = 'U';
                    break;
                }
                case 3: {
                    c56 = '.';
                    break;
                }
            }
            charArray28[n29] = (char)(c56 ^ c55);
        }
        f8[13] = new String(charArray28).intern();
        final String[] f9 = c3.f;
        final char[] charArray29 = "^\u000f".toCharArray();
        for (int length26 = charArray29.length, n30 = 0; length26 > n30; ++n30) {
            final char c57 = charArray29[n30];
            char c58 = '\0';
            switch (n30 % 5) {
                default: {
                    c58 = '\f';
                    break;
                }
                case 0: {
                    c58 = '\u0002';
                    break;
                }
                case 1: {
                    c58 = 'i';
                    break;
                }
                case 2: {
                    c58 = 'U';
                    break;
                }
                case 3: {
                    c58 = '.';
                    break;
                }
            }
            charArray29[n30] = (char)(c58 ^ c57);
        }
        f9[12] = new String(charArray29).intern();
        j = c3.f.clone();
        final String[] m = c3.j;
        final char[] charArray30 = "^\u001ce\u001e?a".toCharArray();
        for (int length27 = charArray30.length, n31 = 0; length27 > n31; ++n31) {
            final char c59 = charArray30[n31];
            char c60 = '\0';
            switch (n31 % 5) {
                default: {
                    c60 = '\f';
                    break;
                }
                case 0: {
                    c60 = '\u0002';
                    break;
                }
                case 1: {
                    c60 = 'i';
                    break;
                }
                case 2: {
                    c60 = 'U';
                    break;
                }
                case 3: {
                    c60 = '.';
                    break;
                }
            }
            charArray30[n31] = (char)(c60 ^ c59);
        }
        m[60] = new String(charArray30).intern();
        final String[] j2 = c3.j;
        final char[] charArray31 = "^\u001ce\u001e?g".toCharArray();
        for (int length28 = charArray31.length, n32 = 0; length28 > n32; ++n32) {
            final char c61 = charArray31[n32];
            char c62 = '\0';
            switch (n32 % 5) {
                default: {
                    c62 = '\f';
                    break;
                }
                case 0: {
                    c62 = '\u0002';
                    break;
                }
                case 1: {
                    c62 = 'i';
                    break;
                }
                case 2: {
                    c62 = 'U';
                    break;
                }
                case 3: {
                    c62 = '.';
                    break;
                }
            }
            charArray31[n32] = (char)(c62 ^ c61);
        }
        j2[62] = new String(charArray31).intern();
        final String[] j3 = c3.j;
        final char[] charArray32 = "^\u001ce\u001e>4".toCharArray();
        for (int length29 = charArray32.length, n33 = 0; length29 > n33; ++n33) {
            final char c63 = charArray32[n33];
            char c64 = '\0';
            switch (n33 % 5) {
                default: {
                    c64 = '\f';
                    break;
                }
                case 0: {
                    c64 = '\u0002';
                    break;
                }
                case 1: {
                    c64 = 'i';
                    break;
                }
                case 2: {
                    c64 = 'U';
                    break;
                }
                case 3: {
                    c64 = '.';
                    break;
                }
            }
            charArray32[n33] = (char)(c64 ^ c63);
        }
        j3[38] = new String(charArray32).intern();
        final String[] j4 = c3.j;
        final char[] charArray33 = "^\u001ce\u001e?f".toCharArray();
        for (int length30 = charArray33.length, n34 = 0; length30 > n34; ++n34) {
            final char c65 = charArray33[n34];
            char c66 = '\0';
            switch (n34 % 5) {
                default: {
                    c66 = '\f';
                    break;
                }
                case 0: {
                    c66 = '\u0002';
                    break;
                }
                case 1: {
                    c66 = 'i';
                    break;
                }
                case 2: {
                    c66 = 'U';
                    break;
                }
                case 3: {
                    c66 = '.';
                    break;
                }
            }
            charArray33[n34] = (char)(c66 ^ c65);
        }
        j4[61] = new String(charArray33).intern();
        final String[] j5 = c3.j;
        final char[] charArray34 = "^\u001ce\u001e>5".toCharArray();
        for (int length31 = charArray34.length, n35 = 0; length31 > n35; ++n35) {
            final char c67 = charArray34[n35];
            char c68 = '\0';
            switch (n35 % 5) {
                default: {
                    c68 = '\f';
                    break;
                }
                case 0: {
                    c68 = '\u0002';
                    break;
                }
                case 1: {
                    c68 = 'i';
                    break;
                }
                case 2: {
                    c68 = 'U';
                    break;
                }
                case 3: {
                    c68 = '.';
                    break;
                }
            }
            charArray34[n35] = (char)(c68 ^ c67);
        }
        j5[39] = new String(charArray34).intern();
    }
    
    public c3(final Writer e) {
        this.g = new int[32];
        this.b = 0;
        this.a(6);
        this.i = ":";
        this.c = true;
        if (e == null) {
            throw new NullPointerException(c3.z[20]);
        }
        this.e = e;
    }
    
    private c3 a(final int n, final int n2, final String s) {
        final int f = this.f();
        if (f != n2 && f != n) {
            try {
                throw new IllegalStateException(c3.z[8]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            if (this.a != null) {
                throw new IllegalStateException(c3.z[9] + this.a);
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        try {
            --this.b;
            if (f == n2) {
                this.a();
            }
            this.e.write(s);
            return this;
        }
        catch (NullPointerException ex3) {
            throw ex3;
        }
    }
    
    private c3 a(final int n, final String s) {
        this.a(true);
        this.a(n);
        this.e.write(s);
        return this;
    }
    
    private void a() {
    Block_3:
        while (true) {
            final int l = c3.l;
            try {
                if (this.d == null) {
                    return;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            this.e.write("\n");
            int i = 1;
            while (i < this.b) {
                this.e.write(this.d);
                ++i;
                if (l != 0) {
                    break Block_3;
                }
            }
            return;
        }
    }
    
    private void a(final int n) {
        if (this.b == this.g.length) {
            final int[] g = new int[2 * this.b];
            System.arraycopy(this.g, 0, g, 0, this.b);
            this.g = g;
        }
        this.g[this.b++] = n;
    }
    
    private void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/google/c3.l:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   com/google/c3.f:()I
        //     8: istore          5
        //    10: iload           5
        //    12: tableswitch {
        //                2: 153
        //                3: 166
        //                4: 56
        //                5: 184
        //                6: 56
        //                7: 104
        //                8: 75
        //          default: 56
        //        }
        //    56: new             Ljava/lang/IllegalStateException;
        //    59: dup            
        //    60: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    63: bipush          12
        //    65: aaload         
        //    66: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    69: athrow         
        //    70: astore          7
        //    72: aload           7
        //    74: athrow         
        //    75: aload_0        
        //    76: getfield        com/google/c3.h:Z
        //    79: ifne            104
        //    82: new             Ljava/lang/IllegalStateException;
        //    85: dup            
        //    86: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    89: bipush          11
        //    91: aaload         
        //    92: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    95: athrow         
        //    96: astore          4
        //    98: aload           4
        //   100: athrow         
        //   101: astore_3       
        //   102: aload_3        
        //   103: athrow         
        //   104: aload_0        
        //   105: getfield        com/google/c3.h:Z
        //   108: istore          13
        //   110: iload           13
        //   112: ifne            143
        //   115: iload_1        
        //   116: ifne            143
        //   119: new             Ljava/lang/IllegalStateException;
        //   122: dup            
        //   123: getstatic       com/google/c3.z:[Ljava/lang/String;
        //   126: bipush          10
        //   128: aaload         
        //   129: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   132: athrow         
        //   133: astore          12
        //   135: aload           12
        //   137: athrow         
        //   138: astore          11
        //   140: aload           11
        //   142: athrow         
        //   143: aload_0        
        //   144: bipush          7
        //   146: invokespecial   com/google/c3.b:(I)V
        //   149: iload_2        
        //   150: ifeq            205
        //   153: aload_0        
        //   154: iconst_2       
        //   155: invokespecial   com/google/c3.b:(I)V
        //   158: aload_0        
        //   159: invokespecial   com/google/c3.a:()V
        //   162: iload_2        
        //   163: ifeq            205
        //   166: aload_0        
        //   167: getfield        com/google/c3.e:Ljava/io/Writer;
        //   170: bipush          44
        //   172: invokevirtual   java/io/Writer.append:(C)Ljava/io/Writer;
        //   175: pop            
        //   176: aload_0        
        //   177: invokespecial   com/google/c3.a:()V
        //   180: iload_2        
        //   181: ifeq            205
        //   184: aload_0        
        //   185: getfield        com/google/c3.e:Ljava/io/Writer;
        //   188: aload_0        
        //   189: getfield        com/google/c3.i:Ljava/lang/String;
        //   192: invokevirtual   java/io/Writer.append:(Ljava/lang/CharSequence;)Ljava/io/Writer;
        //   195: pop            
        //   196: aload_0        
        //   197: iconst_5       
        //   198: invokespecial   com/google/c3.b:(I)V
        //   201: iload_2        
        //   202: ifne            56
        //   205: return         
        //   206: astore          14
        //   208: aload           14
        //   210: athrow         
        //   211: astore          10
        //   213: aload           10
        //   215: athrow         
        //   216: astore          8
        //   218: aload           8
        //   220: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     101    104    Ljava/lang/NullPointerException;
        //  56     70     70     75     Ljava/lang/NullPointerException;
        //  75     96     96     101    Ljava/lang/NullPointerException;
        //  102    104    96     101    Ljava/lang/NullPointerException;
        //  104    110    138    143    Ljava/lang/NullPointerException;
        //  119    133    133    138    Ljava/lang/NullPointerException;
        //  140    143    133    138    Ljava/lang/NullPointerException;
        //  143    149    206    211    Ljava/lang/NullPointerException;
        //  153    162    211    216    Ljava/lang/NullPointerException;
        //  166    180    216    221    Ljava/lang/NullPointerException;
        //  184    201    70     75     Ljava/lang/NullPointerException;
        //  208    211    211    216    Ljava/lang/NullPointerException;
        //  213    216    216    221    Ljava/lang/NullPointerException;
        //  218    221    70     75     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 95, Size: 95
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
        this.g[-1 + this.b] = n;
    }
    
    private void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/google/c3.l:I
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        com/google/c3.k:Z
        //    10: ifeq            194
        //    13: getstatic       com/google/c3.j:[Ljava/lang/String;
        //    16: astore          5
        //    18: aload_0        
        //    19: getfield        com/google/c3.e:Ljava/io/Writer;
        //    22: ldc             "\""
        //    24: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    27: aload_1        
        //    28: invokevirtual   java/lang/String.length:()I
        //    31: istore          6
        //    33: iconst_0       
        //    34: istore          7
        //    36: iload           7
        //    38: iload           6
        //    40: if_icmpge       154
        //    43: aload_1        
        //    44: iload           7
        //    46: invokevirtual   java/lang/String.charAt:(I)C
        //    49: istore          10
        //    51: iload           10
        //    53: sipush          128
        //    56: if_icmpge       75
        //    59: aload           5
        //    61: iload           10
        //    63: aaload         
        //    64: astore          12
        //    66: aload           12
        //    68: ifnonnull       111
        //    71: iload_3        
        //    72: ifeq            144
        //    75: iload           10
        //    77: sipush          8232
        //    80: if_icmpne       95
        //    83: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    86: bipush          18
        //    88: aaload         
        //    89: astore          12
        //    91: iload_3        
        //    92: ifeq            111
        //    95: iload           10
        //    97: sipush          8233
        //   100: if_icmpne       144
        //   103: getstatic       com/google/c3.z:[Ljava/lang/String;
        //   106: bipush          19
        //   108: aaload         
        //   109: astore          12
        //   111: iload_2        
        //   112: iload           7
        //   114: if_icmpge       130
        //   117: aload_0        
        //   118: getfield        com/google/c3.e:Ljava/io/Writer;
        //   121: aload_1        
        //   122: iload_2        
        //   123: iload           7
        //   125: iload_2        
        //   126: isub           
        //   127: invokevirtual   java/io/Writer.write:(Ljava/lang/String;II)V
        //   130: aload_0        
        //   131: getfield        com/google/c3.e:Ljava/io/Writer;
        //   134: aload           12
        //   136: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   139: iload           7
        //   141: iconst_1       
        //   142: iadd           
        //   143: istore_2       
        //   144: iload           7
        //   146: iconst_1       
        //   147: iadd           
        //   148: istore          11
        //   150: iload_3        
        //   151: ifeq            212
        //   154: iload_2        
        //   155: istore          8
        //   157: iload           8
        //   159: iload           6
        //   161: if_icmpge       179
        //   164: aload_0        
        //   165: getfield        com/google/c3.e:Ljava/io/Writer;
        //   168: aload_1        
        //   169: iload           8
        //   171: iload           6
        //   173: iload           8
        //   175: isub           
        //   176: invokevirtual   java/io/Writer.write:(Ljava/lang/String;II)V
        //   179: aload_0        
        //   180: getfield        com/google/c3.e:Ljava/io/Writer;
        //   183: ldc             "\""
        //   185: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //   188: return         
        //   189: astore          4
        //   191: aload           4
        //   193: athrow         
        //   194: getstatic       com/google/c3.f:[Ljava/lang/String;
        //   197: astore          5
        //   199: goto            18
        //   202: astore          13
        //   204: aload           13
        //   206: athrow         
        //   207: astore          9
        //   209: aload           9
        //   211: athrow         
        //   212: iload           11
        //   214: istore          7
        //   216: goto            36
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  6      18     189    194    Ljava/lang/NullPointerException;
        //  117    130    202    207    Ljava/lang/NullPointerException;
        //  164    179    207    212    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 110, Size: 110
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
    
    private void d() {
        final int f = this.f();
        while (true) {
            if (f == 5) {
                try {
                    this.e.write(44);
                    if (c3.l != 0) {
                        if (f != 3) {
                            try {
                                throw new IllegalStateException(c3.z[7]);
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
                this.a();
                this.b(4);
                return;
            }
            continue;
        }
    }
    
    private int f() {
        try {
            if (this.b == 0) {
                throw new IllegalStateException(c3.z[5]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return this.g[-1 + this.b];
    }
    
    private void h() {
        try {
            if (this.a != null) {
                this.d();
                this.c(this.a);
                this.a = null;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    public c3 a(final long n) {
        this.h();
        this.a(false);
        this.e.write(Long.toString(n));
        return this;
    }
    
    public c3 a(final Number p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       18
        //     4: aload_0        
        //     5: invokevirtual   com/google/c3.i:()Lcom/google/c3;
        //     8: astore          12
        //    10: aload           12
        //    12: areturn        
        //    13: astore          11
        //    15: aload           11
        //    17: athrow         
        //    18: aload_0        
        //    19: invokespecial   com/google/c3.h:()V
        //    22: aload_1        
        //    23: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    26: astore_2       
        //    27: aload_0        
        //    28: getfield        com/google/c3.h:Z
        //    31: istore          7
        //    33: iload           7
        //    35: ifne            134
        //    38: aload_2        
        //    39: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    42: bipush          16
        //    44: aaload         
        //    45: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    48: istore          9
        //    50: iload           9
        //    52: ifne            85
        //    55: aload_2        
        //    56: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    59: bipush          15
        //    61: aaload         
        //    62: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    65: istore          10
        //    67: iload           10
        //    69: ifne            85
        //    72: aload_2        
        //    73: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    76: bipush          14
        //    78: aaload         
        //    79: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    82: ifeq            134
        //    85: new             Ljava/lang/IllegalArgumentException;
        //    88: dup            
        //    89: new             Ljava/lang/StringBuilder;
        //    92: dup            
        //    93: invokespecial   java/lang/StringBuilder.<init>:()V
        //    96: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    99: bipush          13
        //   101: aaload         
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: aload_1        
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   109: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   112: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   115: athrow         
        //   116: astore          6
        //   118: aload           6
        //   120: athrow         
        //   121: astore_3       
        //   122: aload_3        
        //   123: athrow         
        //   124: astore          4
        //   126: aload           4
        //   128: athrow         
        //   129: astore          5
        //   131: aload           5
        //   133: athrow         
        //   134: aload_0        
        //   135: iconst_0       
        //   136: invokespecial   com/google/c3.a:(Z)V
        //   139: aload_0        
        //   140: getfield        com/google/c3.e:Ljava/io/Writer;
        //   143: aload_2        
        //   144: invokevirtual   java/io/Writer.append:(Ljava/lang/CharSequence;)Ljava/io/Writer;
        //   147: pop            
        //   148: aload_0        
        //   149: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      10     13     18     Ljava/lang/NullPointerException;
        //  27     33     121    124    Ljava/lang/NullPointerException;
        //  38     50     124    129    Ljava/lang/NullPointerException;
        //  55     67     129    134    Ljava/lang/NullPointerException;
        //  72     85     116    121    Ljava/lang/NullPointerException;
        //  85     116    116    121    Ljava/lang/NullPointerException;
        //  122    124    124    129    Ljava/lang/NullPointerException;
        //  126    129    129    134    Ljava/lang/NullPointerException;
        //  131    134    116    121    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 78, Size: 78
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
    
    public c3 a(final String s) {
        if (s == null) {
            try {
                return this.i();
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.h();
        this.a(false);
        this.c(s);
        return this;
    }
    
    public c3 b() {
        this.h();
        return this.a(3, "{");
    }
    
    public c3 b(final String a) {
        if (a == null) {
            try {
                throw new NullPointerException(c3.z[1]);
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        try {
            if (this.a != null) {
                throw new IllegalStateException();
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        try {
            if (this.b == 0) {
                throw new IllegalStateException(c3.z[0]);
            }
        }
        catch (NullPointerException ex3) {
            throw ex3;
        }
        this.a = a;
        return this;
    }
    
    public c3 b(final boolean b) {
        while (true) {
            while (true) {
                try {
                    this.h();
                    this.a(false);
                    final Writer e = this.e;
                    if (b) {
                        final String s = c3.z[3];
                        e.write(s);
                        return this;
                    }
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                final String s = c3.z[2];
                continue;
            }
        }
    }
    
    public c3 c() {
        return this.a(1, 2, "]");
    }
    
    public final void c(final boolean h) {
        this.h = h;
    }
    
    @Override
    public void close() {
        this.e.close();
        final int b = this.b;
        Label_0035: {
            if (b > 1) {
                break Label_0035;
            }
            if (b != 1) {
                break Label_0035;
            }
            try {
                if (this.g[b - 1] != 7) {
                    throw new IOException(c3.z[6]);
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
        }
        this.b = 0;
    }
    
    public c3 e() {
        this.h();
        return this.a(1, "[");
    }
    
    @Override
    public void flush() {
        try {
            if (this.b == 0) {
                throw new IllegalStateException(c3.z[4]);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        this.e.flush();
    }
    
    public c3 g() {
        return this.a(3, 5, "}");
    }
    
    public c3 i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/google/c3.a:Ljava/lang/String;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          48
        //    11: aload_0        
        //    12: getfield        com/google/c3.c:Z
        //    15: istore          5
        //    17: iload           5
        //    19: ifeq            32
        //    22: aload_0        
        //    23: invokespecial   com/google/c3.h:()V
        //    26: getstatic       com/google/c3.l:I
        //    29: ifeq            48
        //    32: aload_0        
        //    33: aconst_null    
        //    34: putfield        com/google/c3.a:Ljava/lang/String;
        //    37: aload_0        
        //    38: areturn        
        //    39: astore_1       
        //    40: aload_1        
        //    41: athrow         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    45: astore_3       
        //    46: aload_3        
        //    47: athrow         
        //    48: aload_0        
        //    49: iconst_0       
        //    50: invokespecial   com/google/c3.a:(Z)V
        //    53: aload_0        
        //    54: getfield        com/google/c3.e:Ljava/io/Writer;
        //    57: getstatic       com/google/c3.z:[Ljava/lang/String;
        //    60: bipush          17
        //    62: aaload         
        //    63: invokevirtual   java/io/Writer.write:(Ljava/lang/String;)V
        //    66: aload_0        
        //    67: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      6      39     42     Ljava/lang/NullPointerException;
        //  11     17     42     45     Ljava/lang/NullPointerException;
        //  22     32     45     48     Ljava/lang/NullPointerException;
        //  32     37     45     48     Ljava/lang/NullPointerException;
        //  40     42     42     45     Ljava/lang/NullPointerException;
        //  43     45     45     48     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
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
}
