// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum P
{
    public static final P ABOR;
    public static final P ABORT;
    public static final P ACCOUNT;
    public static final P ACCT;
    public static final P ALLO;
    public static final P ALLOCATE;
    public static final P APPE;
    public static final P APPEND;
    public static final P CDUP;
    public static final P CHANGE_TO_PARENT_DIRECTORY;
    public static final P CHANGE_WORKING_DIRECTORY;
    public static final P CWD;
    public static final P DATA_PORT;
    public static final P DELE;
    public static final P DELETE;
    public static final P EPRT;
    public static final P EPSV;
    public static final P FEAT;
    public static final P FEATURES;
    public static final P FILE_STRUCTURE;
    public static final P GET_MOD_TIME;
    public static final P HELP;
    public static final P LIST;
    public static final P LOGOUT;
    public static final P MAKE_DIRECTORY;
    public static final P MDTM;
    public static final P MFMT;
    public static final P MKD;
    public static final P MLSD;
    public static final P MLST;
    public static final P MODE;
    public static final P MOD_TIME;
    public static final P NAME_LIST;
    public static final P NLST;
    public static final P NOOP;
    public static final P PASS;
    public static final P PASSIVE;
    public static final P PASSWORD;
    public static final P PASV;
    public static final P PORT;
    public static final P PRINT_WORKING_DIRECTORY;
    public static final P PWD;
    public static final P QUIT;
    public static final P REIN;
    public static final P REINITIALIZE;
    public static final P REMOVE_DIRECTORY;
    public static final P RENAME_FROM;
    public static final P RENAME_TO;
    public static final P REPRESENTATION_TYPE;
    public static final P REST;
    public static final P RESTART;
    public static final P RETR;
    public static final P RETRIEVE;
    public static final P RMD;
    public static final P RNFR;
    public static final P RNTO;
    public static final P SET_MOD_TIME;
    public static final P SITE;
    public static final P SITE_PARAMETERS;
    public static final P SMNT;
    public static final P STAT;
    public static final P STATUS;
    public static final P STOR;
    public static final P STORE;
    public static final P STORE_UNIQUE;
    public static final P STOU;
    public static final P STRU;
    public static final P STRUCTURE_MOUNT;
    public static final P SYST;
    public static final P SYSTEM;
    public static final P TRANSFER_MODE;
    public static final P TYPE;
    public static final P USER;
    public static final P USERNAME;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[40];
        final char[] charArray = "T36g".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = '\u0011';
                    break;
                }
                case 1: {
                    c2 = 'c';
                    break;
                }
                case 2: {
                    c2 = 'e';
                    break;
                }
                case 3: {
                    c2 = '1';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\\(!".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0012';
                    break;
                }
                case 0: {
                    c4 = '\u0011';
                    break;
                }
                case 1: {
                    c4 = 'c';
                    break;
                }
                case 2: {
                    c4 = 'e';
                    break;
                }
                case 3: {
                    c4 = '1';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "U&)t".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0012';
                    break;
                }
                case 0: {
                    c6 = '\u0011';
                    break;
                }
                case 1: {
                    c6 = 'c';
                    break;
                }
                case 2: {
                    c6 = 'e';
                    break;
                }
                case 3: {
                    c6 = '1';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\\,!t".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0012';
                    break;
                }
                case 0: {
                    c8 = '\u0011';
                    break;
                }
                case 1: {
                    c8 = 'c';
                    break;
                }
                case 2: {
                    c8 = 'e';
                    break;
                }
                case 3: {
                    c8 = '1';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "E:5t".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0012';
                    break;
                }
                case 0: {
                    c10 = '\u0011';
                    break;
                }
                case 1: {
                    c10 = 'c';
                    break;
                }
                case 2: {
                    c10 = 'e';
                    break;
                }
                case 3: {
                    c10 = '1';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "T37e".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u0012';
                    break;
                }
                case 0: {
                    c12 = '\u0011';
                    break;
                }
                case 1: {
                    c12 = 'c';
                    break;
                }
                case 2: {
                    c12 = 'e';
                    break;
                }
                case 3: {
                    c12 = '1';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "_,*a".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u0012';
                    break;
                }
                case 0: {
                    c14 = '\u0011';
                    break;
                }
                case 1: {
                    c14 = 'c';
                    break;
                }
                case 2: {
                    c14 = 'e';
                    break;
                }
                case 3: {
                    c14 = '1';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "R4!".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\u0012';
                    break;
                }
                case 0: {
                    c16 = '\u0011';
                    break;
                }
                case 1: {
                    c16 = 'c';
                    break;
                }
                case 2: {
                    c16 = 'e';
                    break;
                }
                case 3: {
                    c16 = '1';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\\'1|".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\u0012';
                    break;
                }
                case 0: {
                    c18 = '\u0011';
                    break;
                }
                case 1: {
                    c18 = 'c';
                    break;
                }
                case 2: {
                    c18 = 'e';
                    break;
                }
                case 3: {
                    c18 = '1';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "P!*c".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '\u0012';
                    break;
                }
                case 0: {
                    c20 = '\u0011';
                    break;
                }
                case 1: {
                    c20 = 'c';
                    break;
                }
                case 2: {
                    c20 = 'e';
                    break;
                }
                case 3: {
                    c20 = '1';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "P/)~".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '\u0012';
                    break;
                }
                case 0: {
                    c22 = '\u0011';
                    break;
                }
                case 1: {
                    c22 = 'c';
                    break;
                }
                case 2: {
                    c22 = 'e';
                    break;
                }
                case 3: {
                    c22 = '1';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "@6,e".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '\u0012';
                    break;
                }
                case 0: {
                    c24 = '\u0011';
                    break;
                }
                case 1: {
                    c24 = 'c';
                    break;
                }
                case 2: {
                    c24 = 'e';
                    break;
                }
                case 3: {
                    c24 = '1';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "P &e".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '\u0012';
                    break;
                }
                case 0: {
                    c26 = '\u0011';
                    break;
                }
                case 1: {
                    c26 = 'c';
                    break;
                }
                case 2: {
                    c26 = 'e';
                    break;
                }
                case 3: {
                    c26 = '1';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "A4!".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '\u0012';
                    break;
                }
                case 0: {
                    c28 = '\u0011';
                    break;
                }
                case 1: {
                    c28 = 'c';
                    break;
                }
                case 2: {
                    c28 = 'e';
                    break;
                }
                case 3: {
                    c28 = '1';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "B7*c".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '\u0012';
                    break;
                }
                case 0: {
                    c30 = '\u0011';
                    break;
                }
                case 1: {
                    c30 = 'c';
                    break;
                }
                case 2: {
                    c30 = 'e';
                    break;
                }
                case 3: {
                    c30 = '1';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "\\/6u".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '\u0012';
                    break;
                }
                case 0: {
                    c32 = '\u0011';
                    break;
                }
                case 1: {
                    c32 = 'c';
                    break;
                }
                case 2: {
                    c32 = 'e';
                    break;
                }
                case 3: {
                    c32 = '1';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "B7*d".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '\u0012';
                    break;
                }
                case 0: {
                    c34 = '\u0011';
                    break;
                }
                case 1: {
                    c34 = 'c';
                    break;
                }
                case 2: {
                    c34 = 'e';
                    break;
                }
                case 3: {
                    c34 = '1';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "C.!".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '\u0012';
                    break;
                }
                case 0: {
                    c36 = '\u0011';
                    break;
                }
                case 1: {
                    c36 = 'c';
                    break;
                }
                case 2: {
                    c36 = 'e';
                    break;
                }
                case 3: {
                    c36 = '1';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "B77d".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '\u0012';
                    break;
                }
                case 0: {
                    c38 = '\u0011';
                    break;
                }
                case 1: {
                    c38 = 'c';
                    break;
                }
                case 2: {
                    c38 = 'e';
                    break;
                }
                case 3: {
                    c38 = '1';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "C-1~".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '\u0012';
                    break;
                }
                case 0: {
                    c40 = '\u0011';
                    break;
                }
                case 1: {
                    c40 = 'c';
                    break;
                }
                case 2: {
                    c40 = 'e';
                    break;
                }
                case 3: {
                    c40 = '1';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "D0 c".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = '\u0012';
                    break;
                }
                case 0: {
                    c42 = '\u0011';
                    break;
                }
                case 1: {
                    c42 = 'c';
                    break;
                }
                case 2: {
                    c42 = 'e';
                    break;
                }
                case 3: {
                    c42 = '1';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "C-#c".toCharArray();
        for (int length18 = charArray22.length, n22 = 0; length18 > n22; ++n22) {
            final char c43 = charArray22[n22];
            char c44 = '\0';
            switch (n22 % 5) {
                default: {
                    c44 = '\u0012';
                    break;
                }
                case 0: {
                    c44 = '\u0011';
                    break;
                }
                case 1: {
                    c44 = 'c';
                    break;
                }
                case 2: {
                    c44 = 'e';
                    break;
                }
                case 3: {
                    c44 = '1';
                    break;
                }
            }
            charArray22[n22] = (char)(c44 ^ c43);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = "A\"6b".toCharArray();
        for (int length19 = charArray23.length, n23 = 0; length19 > n23; ++n23) {
            final char c45 = charArray23[n23];
            char c46 = '\0';
            switch (n23 % 5) {
                default: {
                    c46 = '\u0012';
                    break;
                }
                case 0: {
                    c46 = '\u0011';
                    break;
                }
                case 1: {
                    c46 = 'c';
                    break;
                }
                case 2: {
                    c46 = 'e';
                    break;
                }
                case 3: {
                    c46 = '1';
                    break;
                }
            }
            charArray23[n23] = (char)(c46 ^ c45);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "_/6e".toCharArray();
        for (int length20 = charArray24.length, n24 = 0; length20 > n24; ++n24) {
            final char c47 = charArray24[n24];
            char c48 = '\0';
            switch (n24 % 5) {
                default: {
                    c48 = '\u0012';
                    break;
                }
                case 0: {
                    c48 = '\u0011';
                    break;
                }
                case 1: {
                    c48 = 'c';
                    break;
                }
                case 2: {
                    c48 = 'e';
                    break;
                }
                case 3: {
                    c48 = '1';
                    break;
                }
            }
            charArray24[n24] = (char)(c48 ^ c47);
        }
        z2[23] = new String(charArray24).intern();
        final char[] charArray25 = "B.+e".toCharArray();
        for (int length21 = charArray25.length, n25 = 0; length21 > n25; ++n25) {
            final char c49 = charArray25[n25];
            char c50 = '\0';
            switch (n25 % 5) {
                default: {
                    c50 = '\u0012';
                    break;
                }
                case 0: {
                    c50 = '\u0011';
                    break;
                }
                case 1: {
                    c50 = 'c';
                    break;
                }
                case 2: {
                    c50 = 'e';
                    break;
                }
                case 3: {
                    c50 = '1';
                    break;
                }
            }
            charArray25[n25] = (char)(c50 ^ c49);
        }
        z2[24] = new String(charArray25).intern();
        final char[] charArray26 = "A\"6g".toCharArray();
        for (int length22 = charArray26.length, n26 = 0; length22 > n26; ++n26) {
            final char c51 = charArray26[n26];
            char c52 = '\0';
            switch (n26 % 5) {
                default: {
                    c52 = '\u0012';
                    break;
                }
                case 0: {
                    c52 = '\u0011';
                    break;
                }
                case 1: {
                    c52 = 'c';
                    break;
                }
                case 2: {
                    c52 = 'e';
                    break;
                }
                case 3: {
                    c52 = '1';
                    break;
                }
            }
            charArray26[n26] = (char)(c52 ^ c51);
        }
        z2[25] = new String(charArray26).intern();
        final char[] charArray27 = "W&$e".toCharArray();
        for (int length23 = charArray27.length, n27 = 0; length23 > n27; ++n27) {
            final char c53 = charArray27[n27];
            char c54 = '\0';
            switch (n27 % 5) {
                default: {
                    c54 = '\u0012';
                    break;
                }
                case 0: {
                    c54 = '\u0011';
                    break;
                }
                case 1: {
                    c54 = 'c';
                    break;
                }
                case 2: {
                    c54 = 'e';
                    break;
                }
                case 3: {
                    c54 = '1';
                    break;
                }
            }
            charArray27[n27] = (char)(c54 ^ c53);
        }
        z2[26] = new String(charArray27).intern();
        final char[] charArray28 = "C&6e".toCharArray();
        for (int length24 = charArray28.length, n28 = 0; length24 > n28; ++n28) {
            final char c55 = charArray28[n28];
            char c56 = '\0';
            switch (n28 % 5) {
                default: {
                    c56 = '\u0012';
                    break;
                }
                case 0: {
                    c56 = '\u0011';
                    break;
                }
                case 1: {
                    c56 = 'c';
                    break;
                }
                case 2: {
                    c56 = 'e';
                    break;
                }
                case 3: {
                    c56 = '1';
                    break;
                }
            }
            charArray28[n28] = (char)(c56 ^ c55);
        }
        z2[27] = new String(charArray28).intern();
        final char[] charArray29 = "B*1t".toCharArray();
        for (int length25 = charArray29.length, n29 = 0; length25 > n29; ++n29) {
            final char c57 = charArray29[n29];
            char c58 = '\0';
            switch (n29 % 5) {
                default: {
                    c58 = '\u0012';
                    break;
                }
                case 0: {
                    c58 = '\u0011';
                    break;
                }
                case 1: {
                    c58 = 'c';
                    break;
                }
                case 2: {
                    c58 = 'e';
                    break;
                }
                case 3: {
                    c58 = '1';
                    break;
                }
            }
            charArray29[n29] = (char)(c58 ^ c57);
        }
        z2[28] = new String(charArray29).intern();
        final char[] charArray30 = "B:6e".toCharArray();
        for (int length26 = charArray30.length, n30 = 0; length26 > n30; ++n30) {
            final char c59 = charArray30[n30];
            char c60 = '\0';
            switch (n30 % 5) {
                default: {
                    c60 = '\u0012';
                    break;
                }
                case 0: {
                    c60 = '\u0011';
                    break;
                }
                case 1: {
                    c60 = 'c';
                    break;
                }
                case 2: {
                    c60 = 'e';
                    break;
                }
                case 3: {
                    c60 = '1';
                    break;
                }
            }
            charArray30[n30] = (char)(c60 ^ c59);
        }
        z2[29] = new String(charArray30).intern();
        final char[] charArray31 = "Y&)a".toCharArray();
        for (int length27 = charArray31.length, n31 = 0; length27 > n31; ++n31) {
            final char c61 = charArray31[n31];
            char c62 = '\0';
            switch (n31 % 5) {
                default: {
                    c62 = '\u0012';
                    break;
                }
                case 0: {
                    c62 = '\u0011';
                    break;
                }
                case 1: {
                    c62 = 'c';
                    break;
                }
                case 2: {
                    c62 = 'e';
                    break;
                }
                case 3: {
                    c62 = '1';
                    break;
                }
            }
            charArray31[n31] = (char)(c62 ^ c61);
        }
        z2[30] = new String(charArray31).intern();
        final char[] charArray32 = "]*6e".toCharArray();
        for (int length28 = charArray32.length, n32 = 0; length28 > n32; ++n32) {
            final char c63 = charArray32[n32];
            char c64 = '\0';
            switch (n32 % 5) {
                default: {
                    c64 = '\u0012';
                    break;
                }
                case 0: {
                    c64 = '\u0011';
                    break;
                }
                case 1: {
                    c64 = 'c';
                    break;
                }
                case 2: {
                    c64 = 'e';
                    break;
                }
                case 3: {
                    c64 = '1';
                    break;
                }
            }
            charArray32[n32] = (char)(c64 ^ c63);
        }
        z2[31] = new String(charArray32).intern();
        final char[] charArray33 = "\\%(e".toCharArray();
        for (int length29 = charArray33.length, n33 = 0; length29 > n33; ++n33) {
            final char c65 = charArray33[n33];
            char c66 = '\0';
            switch (n33 % 5) {
                default: {
                    c66 = '\u0012';
                    break;
                }
                case 0: {
                    c66 = '\u0011';
                    break;
                }
                case 1: {
                    c66 = 'c';
                    break;
                }
                case 2: {
                    c66 = 'e';
                    break;
                }
                case 3: {
                    c66 = '1';
                    break;
                }
            }
            charArray33[n33] = (char)(c66 ^ c65);
        }
        z2[32] = new String(charArray33).intern();
        final char[] charArray34 = "C&,\u007f".toCharArray();
        for (int length30 = charArray34.length, n34 = 0; length30 > n34; ++n34) {
            final char c67 = charArray34[n34];
            char c68 = '\0';
            switch (n34 % 5) {
                default: {
                    c68 = '\u0012';
                    break;
                }
                case 0: {
                    c68 = '\u0011';
                    break;
                }
                case 1: {
                    c68 = 'c';
                    break;
                }
                case 2: {
                    c68 = 'e';
                    break;
                }
                case 3: {
                    c68 = '1';
                    break;
                }
            }
            charArray34[n34] = (char)(c68 ^ c67);
        }
        z2[33] = new String(charArray34).intern();
        final char[] charArray35 = "C&1c".toCharArray();
        for (int length31 = charArray35.length, n35 = 0; length31 > n35; ++n35) {
            final char c69 = charArray35[n35];
            char c70 = '\0';
            switch (n35 % 5) {
                default: {
                    c70 = '\u0012';
                    break;
                }
                case 0: {
                    c70 = '\u0011';
                    break;
                }
                case 1: {
                    c70 = 'c';
                    break;
                }
                case 2: {
                    c70 = 'e';
                    break;
                }
                case 3: {
                    c70 = '1';
                    break;
                }
            }
            charArray35[n35] = (char)(c70 ^ c69);
        }
        z2[34] = new String(charArray35).intern();
        final char[] charArray36 = "B7$e".toCharArray();
        for (int length32 = charArray36.length, n36 = 0; length32 > n36; ++n36) {
            final char c71 = charArray36[n36];
            char c72 = '\0';
            switch (n36 % 5) {
                default: {
                    c72 = '\u0012';
                    break;
                }
                case 0: {
                    c72 = '\u0011';
                    break;
                }
                case 1: {
                    c72 = 'c';
                    break;
                }
                case 2: {
                    c72 = 'e';
                    break;
                }
                case 3: {
                    c72 = '1';
                    break;
                }
            }
            charArray36[n36] = (char)(c72 ^ c71);
        }
        z2[35] = new String(charArray36).intern();
        final char[] charArray37 = "\\/6e".toCharArray();
        for (int length33 = charArray37.length, n37 = 0; length33 > n37; ++n37) {
            final char c73 = charArray37[n37];
            char c74 = '\0';
            switch (n37 % 5) {
                default: {
                    c74 = '\u0012';
                    break;
                }
                case 0: {
                    c74 = '\u0011';
                    break;
                }
                case 1: {
                    c74 = 'c';
                    break;
                }
                case 2: {
                    c74 = 'e';
                    break;
                }
                case 3: {
                    c74 = '1';
                    break;
                }
            }
            charArray37[n37] = (char)(c74 ^ c73);
        }
        z2[36] = new String(charArray37).intern();
        final char[] charArray38 = "A,7e".toCharArray();
        for (int length34 = charArray38.length, n38 = 0; length34 > n38; ++n38) {
            final char c75 = charArray38[n38];
            char c76 = '\0';
            switch (n38 % 5) {
                default: {
                    c76 = '\u0012';
                    break;
                }
                case 0: {
                    c76 = '\u0011';
                    break;
                }
                case 1: {
                    c76 = 'c';
                    break;
                }
                case 2: {
                    c76 = 'e';
                    break;
                }
                case 3: {
                    c76 = '1';
                    break;
                }
            }
            charArray38[n38] = (char)(c76 ^ c75);
        }
        z2[37] = new String(charArray38).intern();
        final char[] charArray39 = "P35t".toCharArray();
        for (int length35 = charArray39.length, n39 = 0; length35 > n39; ++n39) {
            final char c77 = charArray39[n39];
            char c78 = '\0';
            switch (n39 % 5) {
                default: {
                    c78 = '\u0012';
                    break;
                }
                case 0: {
                    c78 = '\u0011';
                    break;
                }
                case 1: {
                    c78 = 'c';
                    break;
                }
                case 2: {
                    c78 = 'e';
                    break;
                }
                case 3: {
                    c78 = '1';
                    break;
                }
            }
            charArray39[n39] = (char)(c78 ^ c77);
        }
        z2[38] = new String(charArray39).intern();
        final char[] charArray40 = "R'0a".toCharArray();
        for (int length36 = charArray40.length, n40 = 0; length36 > n40; ++n40) {
            final char c79 = charArray40[n40];
            char c80 = '\0';
            switch (n40 % 5) {
                default: {
                    c80 = '\u0012';
                    break;
                }
                case 0: {
                    c80 = '\u0011';
                    break;
                }
                case 1: {
                    c80 = 'c';
                    break;
                }
                case 2: {
                    c80 = 'e';
                    break;
                }
                case 3: {
                    c80 = '1';
                    break;
                }
            }
            charArray40[n40] = (char)(c80 ^ c79);
        }
        z2[39] = new String(charArray40).intern();
        z = z2;
        ABOR = new P(P.z[9], 0);
        ACCT = new P(P.z[12], 1);
        ALLO = new P(P.z[10], 2);
        APPE = new P(P.z[38], 3);
        CDUP = new P(P.z[39], 4);
        CWD = new P(P.z[7], 5);
        DELE = new P(P.z[2], 6);
        EPRT = new P(P.z[5], 7);
        EPSV = new P(P.z[0], 8);
        FEAT = new P(P.z[26], 9);
        HELP = new P(P.z[30], 10);
        LIST = new P(P.z[31], 11);
        MDTM = new P(P.z[8], 12);
        MFMT = new P(P.z[32], 13);
        MKD = new P(P.z[1], 14);
        MLSD = new P(P.z[15], 15);
        MLST = new P(P.z[36], 16);
        MODE = new P(P.z[3], 17);
        NLST = new P(P.z[23], 18);
        NOOP = new P(P.z[6], 19);
        PASS = new P(P.z[22], 20);
        PASV = new P(P.z[25], 21);
        PORT = new P(P.z[37], 22);
        PWD = new P(P.z[13], 23);
        QUIT = new P(P.z[11], 24);
        REIN = new P(P.z[33], 25);
        REST = new P(P.z[27], 26);
        RETR = new P(P.z[34], 27);
        RMD = new P(P.z[17], 28);
        RNFR = new P(P.z[21], 29);
        RNTO = new P(P.z[19], 30);
        SITE = new P(P.z[28], 31);
        SMNT = new P(P.z[24], 32);
        STAT = new P(P.z[35], 33);
        STOR = new P(P.z[14], 34);
        STOU = new P(P.z[16], 35);
        STRU = new P(P.z[18], 36);
        SYST = new P(P.z[29], 37);
        TYPE = new P(P.z[4], 38);
        USER = new P(P.z[20], 39);
        ABORT = P.ABOR;
        ACCOUNT = P.ACCT;
        ALLOCATE = P.ALLO;
        APPEND = P.APPE;
        CHANGE_TO_PARENT_DIRECTORY = P.CDUP;
        CHANGE_WORKING_DIRECTORY = P.CWD;
        DATA_PORT = P.PORT;
        DELETE = P.DELE;
        FEATURES = P.FEAT;
        FILE_STRUCTURE = P.STRU;
        GET_MOD_TIME = P.MDTM;
        LOGOUT = P.QUIT;
        MAKE_DIRECTORY = P.MKD;
        MOD_TIME = P.MDTM;
        NAME_LIST = P.NLST;
        PASSIVE = P.PASV;
        PASSWORD = P.PASS;
        PRINT_WORKING_DIRECTORY = P.PWD;
        REINITIALIZE = P.REIN;
        REMOVE_DIRECTORY = P.RMD;
        RENAME_FROM = P.RNFR;
        RENAME_TO = P.RNTO;
        REPRESENTATION_TYPE = P.TYPE;
        RESTART = P.REST;
        RETRIEVE = P.RETR;
        SET_MOD_TIME = P.MFMT;
        SITE_PARAMETERS = P.SITE;
        STATUS = P.STAT;
        STORE = P.STOR;
        STORE_UNIQUE = P.STOU;
        STRUCTURE_MOUNT = P.SMNT;
        SYSTEM = P.SYST;
        TRANSFER_MODE = P.MODE;
        USERNAME = P.USER;
    }
    
    private P(final String s, final int n) {
    }
    
    public final String getCommand() {
        return this.name();
    }
}
