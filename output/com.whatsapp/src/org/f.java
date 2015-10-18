// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum f
{
    public static final f ALL;
    public static final f ANSWERED;
    public static final f BCC;
    public static final f BEFORE;
    public static final f BODY;
    public static final f CC;
    public static final f DELETED;
    public static final f DRAFT;
    public static final f FLAGGED;
    public static final f FROM;
    public static final f HEADER;
    public static final f KEYWORD;
    public static final f LARGER;
    public static final f NEW;
    public static final f NOT;
    public static final f OLD;
    public static final f ON;
    public static final f OR;
    public static final f RECENT;
    public static final f SEEN;
    public static final f SENTBEFORE;
    public static final f SENTON;
    public static final f SENTSINCE;
    public static final f SINCE;
    public static final f SMALLER;
    public static final f SUBJECT;
    public static final f TEXT;
    public static final f TO;
    public static final f UID;
    public static final f UNANSWERED;
    public static final f UNDELETED;
    public static final f UNDRAFT;
    public static final f UNFLAGGED;
    public static final f UNKEYWORD;
    public static final f UNSEEN;
    private static final f[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[35];
        final char[] charArray = "yI\u001b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '7';
                    break;
                }
                case 0: {
                    c2 = '7';
                    break;
                }
                case 1: {
                    c2 = '\f';
                    break;
                }
                case 2: {
                    c2 = 'L';
                    break;
                }
                case 3: {
                    c2 = 'W';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "bB\b\u0005vqX".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '7';
                    break;
                }
                case 0: {
                    c4 = '7';
                    break;
                }
                case 1: {
                    c4 = '\f';
                    break;
                }
                case 2: {
                    c4 = 'L';
                    break;
                }
                case 3: {
                    c4 = 'W';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "|I\u0015\u0000xeH".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '7';
                    break;
                }
                case 0: {
                    c6 = '7';
                    break;
                }
                case 1: {
                    c6 = '\f';
                    break;
                }
                case 2: {
                    c6 = 'L';
                    break;
                }
                case 3: {
                    c6 = 'W';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "bB\b\u0012{rX\t\u0013".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '7';
                    break;
                }
                case 0: {
                    c8 = '7';
                    break;
                }
                case 1: {
                    c8 = '\f';
                    break;
                }
                case 2: {
                    c8 = 'L';
                    break;
                }
                case 3: {
                    c8 = 'W';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "x@\b".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '7';
                    break;
                }
                case 0: {
                    c10 = '7';
                    break;
                }
                case 1: {
                    c10 = '\f';
                    break;
                }
                case 2: {
                    c10 = 'L';
                    break;
                }
                case 3: {
                    c10 = 'W';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "q^\u0003\u001a".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '7';
                    break;
                }
                case 0: {
                    c12 = '7';
                    break;
                }
                case 1: {
                    c12 = '\f';
                    break;
                }
                case 2: {
                    c12 = 'L';
                    break;
                }
                case 3: {
                    c12 = 'W';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "yC\u0018".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '7';
                    break;
                }
                case 0: {
                    c14 = '7';
                    break;
                }
                case 1: {
                    c14 = '\f';
                    break;
                }
                case 2: {
                    c14 = 'L';
                    break;
                }
                case 3: {
                    c14 = 'W';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "tO".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '7';
                    break;
                }
                case 0: {
                    c16 = '7';
                    break;
                }
                case 1: {
                    c16 = '\f';
                    break;
                }
                case 2: {
                    c16 = 'L';
                    break;
                }
                case 3: {
                    c16 = 'W';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "x^".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '7';
                    break;
                }
                case 0: {
                    c18 = '7';
                    break;
                }
                case 1: {
                    c18 = '\f';
                    break;
                }
                case 2: {
                    c18 = 'L';
                    break;
                }
                case 3: {
                    c18 = 'W';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "v@\u0000".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '7';
                    break;
                }
                case 0: {
                    c20 = '7';
                    break;
                }
                case 1: {
                    c20 = '\f';
                    break;
                }
                case 2: {
                    c20 = 'L';
                    break;
                }
                case 3: {
                    c20 = 'W';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "bE\b".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '7';
                    break;
                }
                case 0: {
                    c22 = '7';
                    break;
                }
                case 1: {
                    c22 = '\f';
                    break;
                }
                case 2: {
                    c22 = 'L';
                    break;
                }
                case 3: {
                    c22 = 'W';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "cC".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '7';
                    break;
                }
                case 0: {
                    c24 = '7';
                    break;
                }
                case 1: {
                    c24 = '\f';
                    break;
                }
                case 2: {
                    c24 = 'L';
                    break;
                }
                case 3: {
                    c24 = 'W';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "uI\n\u0018er".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '7';
                    break;
                }
                case 0: {
                    c26 = '7';
                    break;
                }
                case 1: {
                    c26 = '\f';
                    break;
                }
                case 2: {
                    c26 = 'L';
                    break;
                }
                case 3: {
                    c26 = 'W';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u007fI\r\u0013re".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '7';
                    break;
                }
                case 0: {
                    c28 = '7';
                    break;
                }
                case 1: {
                    c28 = '\f';
                    break;
                }
                case 2: {
                    c28 = 'L';
                    break;
                }
                case 3: {
                    c28 = 'W';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "dI\u0002\u0003urJ\u0003\u0005r".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '7';
                    break;
                }
                case 0: {
                    c30 = '7';
                    break;
                }
                case 1: {
                    c30 = '\f';
                    break;
                }
                case 2: {
                    c30 = 'L';
                    break;
                }
                case 3: {
                    c30 = 'W';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "bB\u001f\u0012ry".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '7';
                    break;
                }
                case 0: {
                    c32 = '7';
                    break;
                }
                case 1: {
                    c32 = '\f';
                    break;
                }
                case 2: {
                    c32 = 'L';
                    break;
                }
                case 3: {
                    c32 = 'W';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "q@\r\u0010prH".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '7';
                    break;
                }
                case 0: {
                    c34 = '7';
                    break;
                }
                case 1: {
                    c34 = '\f';
                    break;
                }
                case 2: {
                    c34 = 'L';
                    break;
                }
                case 3: {
                    c34 = 'W';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "dI\u0002\u0003d~B\u000f\u0012".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '7';
                    break;
                }
                case 0: {
                    c36 = '7';
                    break;
                }
                case 1: {
                    c36 = '\f';
                    break;
                }
                case 2: {
                    c36 = 'L';
                    break;
                }
                case 3: {
                    c36 = 'W';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "bB\n\u001bvpK\t\u0013".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '7';
                    break;
                }
                case 0: {
                    c38 = '7';
                    break;
                }
                case 1: {
                    c38 = '\f';
                    break;
                }
                case 2: {
                    c38 = 'L';
                    break;
                }
                case 3: {
                    c38 = 'W';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "cI\u0014\u0003".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '7';
                    break;
                }
                case 0: {
                    c40 = '7';
                    break;
                }
                case 1: {
                    c40 = '\f';
                    break;
                }
                case 2: {
                    c40 = 'L';
                    break;
                }
                case 3: {
                    c40 = 'W';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "bB\r\u0019d`I\u001e\u0012s".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = '7';
                    break;
                }
                case 0: {
                    c42 = '7';
                    break;
                }
                case 1: {
                    c42 = '\f';
                    break;
                }
                case 2: {
                    c42 = 'L';
                    break;
                }
                case 3: {
                    c42 = 'W';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "uC\b\u000e".toCharArray();
        for (int length18 = charArray22.length, n22 = 0; length18 > n22; ++n22) {
            final char c43 = charArray22[n22];
            char c44 = '\0';
            switch (n22 % 5) {
                default: {
                    c44 = '7';
                    break;
                }
                case 0: {
                    c44 = '7';
                    break;
                }
                case 1: {
                    c44 = '\f';
                    break;
                }
                case 2: {
                    c44 = 'L';
                    break;
                }
                case 3: {
                    c44 = 'W';
                    break;
                }
            }
            charArray22[n22] = (char)(c44 ^ c43);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = "{M\u001e\u0010re".toCharArray();
        for (int length19 = charArray23.length, n23 = 0; length19 > n23; ++n23) {
            final char c45 = charArray23[n23];
            char c46 = '\0';
            switch (n23 % 5) {
                default: {
                    c46 = '7';
                    break;
                }
                case 0: {
                    c46 = '7';
                    break;
                }
                case 1: {
                    c46 = '\f';
                    break;
                }
                case 2: {
                    c46 = 'L';
                    break;
                }
                case 3: {
                    c46 = 'W';
                    break;
                }
            }
            charArray23[n23] = (char)(c46 ^ c45);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "dE\u0002\u0014r".toCharArray();
        for (int length20 = charArray24.length, n24 = 0; length20 > n24; ++n24) {
            final char c47 = charArray24[n24];
            char c48 = '\0';
            switch (n24 % 5) {
                default: {
                    c48 = '7';
                    break;
                }
                case 0: {
                    c48 = '7';
                    break;
                }
                case 1: {
                    c48 = '\f';
                    break;
                }
                case 2: {
                    c48 = 'L';
                    break;
                }
                case 3: {
                    c48 = 'W';
                    break;
                }
            }
            charArray24[n24] = (char)(c48 ^ c47);
        }
        z2[23] = new String(charArray24).intern();
        final char[] charArray25 = "s^\r\u0011c".toCharArray();
        for (int length21 = charArray25.length, n25 = 0; length21 > n25; ++n25) {
            final char c49 = charArray25[n25];
            char c50 = '\0';
            switch (n25 % 5) {
                default: {
                    c50 = '7';
                    break;
                }
                case 0: {
                    c50 = '7';
                    break;
                }
                case 1: {
                    c50 = '\f';
                    break;
                }
                case 2: {
                    c50 = 'L';
                    break;
                }
                case 3: {
                    c50 = 'W';
                    break;
                }
            }
            charArray25[n25] = (char)(c50 ^ c49);
        }
        z2[24] = new String(charArray25).intern();
        final char[] charArray26 = "dI\t\u0019".toCharArray();
        for (int length22 = charArray26.length, n26 = 0; length22 > n26; ++n26) {
            final char c51 = charArray26[n26];
            char c52 = '\0';
            switch (n26 % 5) {
                default: {
                    c52 = '7';
                    break;
                }
                case 0: {
                    c52 = '7';
                    break;
                }
                case 1: {
                    c52 = '\f';
                    break;
                }
                case 2: {
                    c52 = 'L';
                    break;
                }
                case 3: {
                    c52 = 'W';
                    break;
                }
            }
            charArray26[n26] = (char)(c52 ^ c51);
        }
        z2[25] = new String(charArray26).intern();
        final char[] charArray27 = "sI\u0000\u0012crH".toCharArray();
        for (int length23 = charArray27.length, n27 = 0; length23 > n27; ++n27) {
            final char c53 = charArray27[n27];
            char c54 = '\0';
            switch (n27 % 5) {
                default: {
                    c54 = '7';
                    break;
                }
                case 0: {
                    c54 = '7';
                    break;
                }
                case 1: {
                    c54 = '\f';
                    break;
                }
                case 2: {
                    c54 = 'L';
                    break;
                }
                case 3: {
                    c54 = 'W';
                    break;
                }
            }
            charArray27[n27] = (char)(c54 ^ c53);
        }
        z2[26] = new String(charArray27).intern();
        final char[] charArray28 = "uO\u000f".toCharArray();
        for (int length24 = charArray28.length, n28 = 0; length24 > n28; ++n28) {
            final char c55 = charArray28[n28];
            char c56 = '\0';
            switch (n28 % 5) {
                default: {
                    c56 = '7';
                    break;
                }
                case 0: {
                    c56 = '7';
                    break;
                }
                case 1: {
                    c56 = '\f';
                    break;
                }
                case 2: {
                    c56 = 'L';
                    break;
                }
                case 3: {
                    c56 = 'W';
                    break;
                }
            }
            charArray28[n28] = (char)(c56 ^ c55);
        }
        z2[27] = new String(charArray28).intern();
        final char[] charArray29 = "dI\u0002\u0003xy".toCharArray();
        for (int length25 = charArray29.length, n29 = 0; length25 > n29; ++n29) {
            final char c57 = charArray29[n29];
            char c58 = '\0';
            switch (n29 % 5) {
                default: {
                    c58 = '7';
                    break;
                }
                case 0: {
                    c58 = '7';
                    break;
                }
                case 1: {
                    c58 = '\f';
                    break;
                }
                case 2: {
                    c58 = 'L';
                    break;
                }
                case 3: {
                    c58 = 'W';
                    break;
                }
            }
            charArray29[n29] = (char)(c58 ^ c57);
        }
        z2[28] = new String(charArray29).intern();
        final char[] charArray30 = "eI\u000f\u0012yc".toCharArray();
        for (int length26 = charArray30.length, n30 = 0; length26 > n30; ++n30) {
            final char c59 = charArray30[n30];
            char c60 = '\0';
            switch (n30 % 5) {
                default: {
                    c60 = '7';
                    break;
                }
                case 0: {
                    c60 = '7';
                    break;
                }
                case 1: {
                    c60 = '\f';
                    break;
                }
                case 2: {
                    c60 = 'L';
                    break;
                }
                case 3: {
                    c60 = 'W';
                    break;
                }
            }
            charArray30[n30] = (char)(c60 ^ c59);
        }
        z2[29] = new String(charArray30).intern();
        final char[] charArray31 = "xB".toCharArray();
        for (int length27 = charArray31.length, n31 = 0; length27 > n31; ++n31) {
            final char c61 = charArray31[n31];
            char c62 = '\0';
            switch (n31 % 5) {
                default: {
                    c62 = '7';
                    break;
                }
                case 0: {
                    c62 = '7';
                    break;
                }
                case 1: {
                    c62 = '\f';
                    break;
                }
                case 2: {
                    c62 = 'L';
                    break;
                }
                case 3: {
                    c62 = 'W';
                    break;
                }
            }
            charArray31[n31] = (char)(c62 ^ c61);
        }
        z2[30] = new String(charArray31).intern();
        final char[] charArray32 = "vB\u001f\u0000reI\b".toCharArray();
        for (int length28 = charArray32.length, n32 = 0; length28 > n32; ++n32) {
            final char c63 = charArray32[n32];
            char c64 = '\0';
            switch (n32 % 5) {
                default: {
                    c64 = '7';
                    break;
                }
                case 0: {
                    c64 = '7';
                    break;
                }
                case 1: {
                    c64 = '\f';
                    break;
                }
                case 2: {
                    c64 = 'L';
                    break;
                }
                case 3: {
                    c64 = 'W';
                    break;
                }
            }
            charArray32[n32] = (char)(c64 ^ c63);
        }
        z2[31] = new String(charArray32).intern();
        final char[] charArray33 = "dA\r\u001b{r^".toCharArray();
        for (int length29 = charArray33.length, n33 = 0; length29 > n33; ++n33) {
            final char c65 = charArray33[n33];
            char c66 = '\0';
            switch (n33 % 5) {
                default: {
                    c66 = '7';
                    break;
                }
                case 0: {
                    c66 = '7';
                    break;
                }
                case 1: {
                    c66 = '\f';
                    break;
                }
                case 2: {
                    c66 = 'L';
                    break;
                }
                case 3: {
                    c66 = 'W';
                    break;
                }
            }
            charArray33[n33] = (char)(c66 ^ c65);
        }
        z2[32] = new String(charArray33).intern();
        final char[] charArray34 = "bB\u0007\u0012n`C\u001e\u0013".toCharArray();
        for (int length30 = charArray34.length, n34 = 0; length30 > n34; ++n34) {
            final char c67 = charArray34[n34];
            char c68 = '\0';
            switch (n34 % 5) {
                default: {
                    c68 = '7';
                    break;
                }
                case 0: {
                    c68 = '7';
                    break;
                }
                case 1: {
                    c68 = '\f';
                    break;
                }
                case 2: {
                    c68 = 'L';
                    break;
                }
                case 3: {
                    c68 = 'W';
                    break;
                }
            }
            charArray34[n34] = (char)(c68 ^ c67);
        }
        z2[33] = new String(charArray34).intern();
        final char[] charArray35 = "dY\u000e\u001drtX".toCharArray();
        for (int length31 = charArray35.length, n35 = 0; length31 > n35; ++n35) {
            final char c69 = charArray35[n35];
            char c70 = '\0';
            switch (n35 % 5) {
                default: {
                    c70 = '7';
                    break;
                }
                case 0: {
                    c70 = '7';
                    break;
                }
                case 1: {
                    c70 = '\f';
                    break;
                }
                case 2: {
                    c70 = 'L';
                    break;
                }
                case 3: {
                    c70 = 'W';
                    break;
                }
            }
            charArray35[n35] = (char)(c70 ^ c69);
        }
        z2[34] = new String(charArray35).intern();
        z = z2;
        ALL = new f(f.z[9], 0);
        ANSWERED = new f(f.z[31], 1);
        BCC = new f(f.z[27], 2);
        BEFORE = new f(f.z[12], 3);
        BODY = new f(f.z[21], 4);
        CC = new f(f.z[7], 5);
        DELETED = new f(f.z[26], 6);
        DRAFT = new f(f.z[24], 7);
        FLAGGED = new f(f.z[16], 8);
        FROM = new f(f.z[5], 9);
        HEADER = new f(f.z[13], 10);
        KEYWORD = new f(f.z[2], 11);
        LARGER = new f(f.z[22], 12);
        NEW = new f(f.z[0], 13);
        NOT = new f(f.z[6], 14);
        OLD = new f(f.z[4], 15);
        ON = new f(f.z[30], 16);
        OR = new f(f.z[8], 17);
        RECENT = new f(f.z[29], 18);
        SEEN = new f(f.z[25], 19);
        SENTBEFORE = new f(f.z[14], 20);
        SENTON = new f(f.z[28], 21);
        SENTSINCE = new f(f.z[17], 22);
        SINCE = new f(f.z[23], 23);
        SMALLER = new f(f.z[32], 24);
        SUBJECT = new f(f.z[34], 25);
        TEXT = new f(f.z[19], 26);
        TO = new f(f.z[11], 27);
        UID = new f(f.z[10], 28);
        UNANSWERED = new f(f.z[20], 29);
        UNDELETED = new f(f.z[3], 30);
        UNDRAFT = new f(f.z[1], 31);
        UNFLAGGED = new f(f.z[18], 32);
        UNKEYWORD = new f(f.z[33], 33);
        UNSEEN = new f(f.z[15], 34);
        a = new f[] { f.ALL, f.ANSWERED, f.BCC, f.BEFORE, f.BODY, f.CC, f.DELETED, f.DRAFT, f.FLAGGED, f.FROM, f.HEADER, f.KEYWORD, f.LARGER, f.NEW, f.NOT, f.OLD, f.ON, f.OR, f.RECENT, f.SEEN, f.SENTBEFORE, f.SENTON, f.SENTSINCE, f.SINCE, f.SMALLER, f.SUBJECT, f.TEXT, f.TO, f.UID, f.UNANSWERED, f.UNDELETED, f.UNDRAFT, f.UNFLAGGED, f.UNKEYWORD, f.UNSEEN };
    }
    
    private f(final String s, final int n) {
    }
}
