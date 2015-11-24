// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum F
{
    public static final F APPEND;
    public static final F AUTHENTICATE;
    public static final F CAPABILITY;
    public static final F CHECK;
    public static final F CLOSE;
    public static final F COPY;
    public static final F CREATE;
    public static final F DELETE;
    public static final F EXAMINE;
    public static final F EXPUNGE;
    public static final F FETCH;
    public static final F LIST;
    public static final F LOGIN;
    public static final F LOGOUT;
    public static final F LSUB;
    public static final F NOOP;
    public static final F RENAME;
    public static final F SEARCH;
    public static final F SELECT;
    public static final F STARTTLS;
    public static final F STATUS;
    public static final F STORE;
    public static final F SUBSCRIBE;
    public static final F UID;
    public static final F UNSUBSCRIBE;
    public static final F XOAUTH;
    private static final String[] z;
    private final int a;
    private final String c;
    private final int d;
    
    static {
        final String[] z2 = new String[26];
        final char[] charArray = "W10\u007fm]<)jv".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '/';
                    break;
                }
                case 0: {
                    c2 = '\u0014';
                    break;
                }
                case 1: {
                    c2 = 'p';
                    break;
                }
                case 2: {
                    c2 = '`';
                    break;
                }
                case 3: {
                    c2 = '>';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "G%\"mlF9\"{".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '/';
                    break;
                }
                case 0: {
                    c4 = '\u0014';
                    break;
                }
                case 1: {
                    c4 = 'p';
                    break;
                }
                case 2: {
                    c4 = '`';
                    break;
                }
                case 3: {
                    c4 = '>';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "G$!jzG".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '/';
                    break;
                }
                case 0: {
                    c6 = '\u0014';
                    break;
                }
                case 1: {
                    c6 = 'p';
                    break;
                }
                case 2: {
                    c6 = '`';
                    break;
                }
                case 3: {
                    c6 = '>';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "X93j".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '/';
                    break;
                }
                case 0: {
                    c8 = '\u0014';
                    break;
                }
                case 1: {
                    c8 = 'p';
                    break;
                }
                case 2: {
                    c8 = '`';
                    break;
                }
                case 3: {
                    c8 = '>';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "Q(!sfZ5".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '/';
                    break;
                }
                case 0: {
                    c10 = '\u0014';
                    break;
                }
                case 1: {
                    c10 = 'p';
                    break;
                }
                case 2: {
                    c10 = '`';
                    break;
                }
                case 3: {
                    c10 = '>';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "W</mj".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '/';
                    break;
                }
                case 0: {
                    c12 = '\u0014';
                    break;
                }
                case 1: {
                    c12 = 'p';
                    break;
                }
                case 2: {
                    c12 = '`';
                    break;
                }
                case 3: {
                    c12 = '>';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "G5!ll\\".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '/';
                    break;
                }
                case 0: {
                    c14 = '\u0014';
                    break;
                }
                case 1: {
                    c14 = 'p';
                    break;
                }
                case 2: {
                    c14 = '`';
                    break;
                }
                case 3: {
                    c14 = '>';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "R54}g".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '/';
                    break;
                }
                case 0: {
                    c16 = '\u0014';
                    break;
                }
                case 1: {
                    c16 = 'p';
                    break;
                }
                case 2: {
                    c16 = '`';
                    break;
                }
                case 3: {
                    c16 = '>';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "Z?/n".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '/';
                    break;
                }
                case 0: {
                    c18 = '\u0014';
                    break;
                }
                case 1: {
                    c18 = 'p';
                    break;
                }
                case 2: {
                    c18 = '`';
                    break;
                }
                case 3: {
                    c18 = '>';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "U%4vjZ$)}n@5".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '/';
                    break;
                }
                case 0: {
                    c20 = '\u0014';
                    break;
                }
                case 1: {
                    c20 = 'p';
                    break;
                }
                case 2: {
                    c20 = '`';
                    break;
                }
                case 3: {
                    c20 = '>';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "G$/lj".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '/';
                    break;
                }
                case 0: {
                    c22 = '\u0014';
                    break;
                }
                case 1: {
                    c22 = 'p';
                    break;
                }
                case 2: {
                    c22 = '`';
                    break;
                }
                case 3: {
                    c22 = '>';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "X#5|".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '/';
                    break;
                }
                case 0: {
                    c24 = '\u0014';
                    break;
                }
                case 1: {
                    c24 = 'p';
                    break;
                }
                case 2: {
                    c24 = '`';
                    break;
                }
                case 3: {
                    c24 = '>';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "A>3kmG32wmQ".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '/';
                    break;
                }
                case 0: {
                    c26 = '\u0014';
                    break;
                }
                case 1: {
                    c26 = 'p';
                    break;
                }
                case 2: {
                    c26 = '`';
                    break;
                }
                case 3: {
                    c26 = '>';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "L?!k{\\".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '/';
                    break;
                }
                case 0: {
                    c28 = '\u0014';
                    break;
                }
                case 1: {
                    c28 = 'p';
                    break;
                }
                case 2: {
                    c28 = '`';
                    break;
                }
                case 3: {
                    c28 = '>';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "W\"%\u007f{Q".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '/';
                    break;
                }
                case 0: {
                    c30 = '\u0014';
                    break;
                }
                case 1: {
                    c30 = 'p';
                    break;
                }
                case 2: {
                    c30 = '`';
                    break;
                }
                case 3: {
                    c30 = '>';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "F5.\u007fbQ".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '/';
                    break;
                }
                case 0: {
                    c32 = '\u0014';
                    break;
                }
                case 1: {
                    c32 = 'p';
                    break;
                }
                case 2: {
                    c32 = '`';
                    break;
                }
                case 3: {
                    c32 = '>';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "W8%}d".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '/';
                    break;
                }
                case 0: {
                    c34 = '\u0014';
                    break;
                }
                case 1: {
                    c34 = 'p';
                    break;
                }
                case 2: {
                    c34 = '`';
                    break;
                }
                case 3: {
                    c34 = '>';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "U 0{aP".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '/';
                    break;
                }
                case 0: {
                    c36 = '\u0014';
                    break;
                }
                case 1: {
                    c36 = 'p';
                    break;
                }
                case 2: {
                    c36 = '`';
                    break;
                }
                case 3: {
                    c36 = '>';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        final char[] charArray19 = "P5,{{Q".toCharArray();
        for (int length15 = charArray19.length, n19 = 0; length15 > n19; ++n19) {
            final char c37 = charArray19[n19];
            char c38 = '\0';
            switch (n19 % 5) {
                default: {
                    c38 = '/';
                    break;
                }
                case 0: {
                    c38 = '\u0014';
                    break;
                }
                case 1: {
                    c38 = 'p';
                    break;
                }
                case 2: {
                    c38 = '`';
                    break;
                }
                case 3: {
                    c38 = '>';
                    break;
                }
            }
            charArray19[n19] = (char)(c38 ^ c37);
        }
        z2[18] = new String(charArray19).intern();
        final char[] charArray20 = "G$!l{@<3".toCharArray();
        for (int length16 = charArray20.length, n20 = 0; length16 > n20; ++n20) {
            final char c39 = charArray20[n20];
            char c40 = '\0';
            switch (n20 % 5) {
                default: {
                    c40 = '/';
                    break;
                }
                case 0: {
                    c40 = '\u0014';
                    break;
                }
                case 1: {
                    c40 = 'p';
                    break;
                }
                case 2: {
                    c40 = '`';
                    break;
                }
                case 3: {
                    c40 = '>';
                    break;
                }
            }
            charArray20[n20] = (char)(c40 ^ c39);
        }
        z2[19] = new String(charArray20).intern();
        final char[] charArray21 = "X?'wa".toCharArray();
        for (int length17 = charArray21.length, n21 = 0; length17 > n21; ++n21) {
            final char c41 = charArray21[n21];
            char c42 = '\0';
            switch (n21 % 5) {
                default: {
                    c42 = '/';
                    break;
                }
                case 0: {
                    c42 = '\u0014';
                    break;
                }
                case 1: {
                    c42 = 'p';
                    break;
                }
                case 2: {
                    c42 = '`';
                    break;
                }
                case 3: {
                    c42 = '>';
                    break;
                }
            }
            charArray21[n21] = (char)(c42 ^ c41);
        }
        z2[20] = new String(charArray21).intern();
        final char[] charArray22 = "A9$".toCharArray();
        for (int length18 = charArray22.length, n22 = 0; length18 > n22; ++n22) {
            final char c43 = charArray22[n22];
            char c44 = '\0';
            switch (n22 % 5) {
                default: {
                    c44 = '/';
                    break;
                }
                case 0: {
                    c44 = '\u0014';
                    break;
                }
                case 1: {
                    c44 = 'p';
                    break;
                }
                case 2: {
                    c44 = '`';
                    break;
                }
                case 3: {
                    c44 = '>';
                    break;
                }
            }
            charArray22[n22] = (char)(c44 ^ c43);
        }
        z2[21] = new String(charArray22).intern();
        final char[] charArray23 = "Q(0kaS5".toCharArray();
        for (int length19 = charArray23.length, n23 = 0; length19 > n23; ++n23) {
            final char c45 = charArray23[n23];
            char c46 = '\0';
            switch (n23 % 5) {
                default: {
                    c46 = '/';
                    break;
                }
                case 0: {
                    c46 = '\u0014';
                    break;
                }
                case 1: {
                    c46 = 'p';
                    break;
                }
                case 2: {
                    c46 = '`';
                    break;
                }
                case 3: {
                    c46 = '>';
                    break;
                }
            }
            charArray23[n23] = (char)(c46 ^ c45);
        }
        z2[22] = new String(charArray23).intern();
        final char[] charArray24 = "W?0g".toCharArray();
        for (int length20 = charArray24.length, n24 = 0; length20 > n24; ++n24) {
            final char c47 = charArray24[n24];
            char c48 = '\0';
            switch (n24 % 5) {
                default: {
                    c48 = '/';
                    break;
                }
                case 0: {
                    c48 = '\u0014';
                    break;
                }
                case 1: {
                    c48 = 'p';
                    break;
                }
                case 2: {
                    c48 = '`';
                    break;
                }
                case 3: {
                    c48 = '>';
                    break;
                }
            }
            charArray24[n24] = (char)(c48 ^ c47);
        }
        z2[23] = new String(charArray24).intern();
        final char[] charArray25 = "X?'qz@".toCharArray();
        for (int length21 = charArray25.length, n25 = 0; length21 > n25; ++n25) {
            final char c49 = charArray25[n25];
            char c50 = '\0';
            switch (n25 % 5) {
                default: {
                    c50 = '/';
                    break;
                }
                case 0: {
                    c50 = '\u0014';
                    break;
                }
                case 1: {
                    c50 = 'p';
                    break;
                }
                case 2: {
                    c50 = '`';
                    break;
                }
                case 3: {
                    c50 = '>';
                    break;
                }
            }
            charArray25[n25] = (char)(c50 ^ c49);
        }
        z2[24] = new String(charArray25).intern();
        final char[] charArray26 = "G5,{l@".toCharArray();
        for (int length22 = charArray26.length, n26 = 0; length22 > n26; ++n26) {
            final char c51 = charArray26[n26];
            char c52 = '\0';
            switch (n26 % 5) {
                default: {
                    c52 = '/';
                    break;
                }
                case 0: {
                    c52 = '\u0014';
                    break;
                }
                case 1: {
                    c52 = 'p';
                    break;
                }
                case 2: {
                    c52 = '`';
                    break;
                }
                case 3: {
                    c52 = '>';
                    break;
                }
            }
            charArray26[n26] = (char)(c52 ^ c51);
        }
        z2[25] = new String(charArray26).intern();
        z = z2;
        CAPABILITY = new F(F.z[0], 0, 0);
        NOOP = new F(F.z[8], 1, 0);
        LOGOUT = new F(F.z[24], 2, 0);
        STARTTLS = new F(F.z[19], 3, 0);
        AUTHENTICATE = new F(F.z[9], 4, 1);
        LOGIN = new F(F.z[20], 5, 2);
        XOAUTH = new F(F.z[13], 6, 1);
        SELECT = new F(F.z[25], 7, 1);
        EXAMINE = new F(F.z[4], 8, 1);
        CREATE = new F(F.z[14], 9, 1);
        DELETE = new F(F.z[18], 10, 1);
        RENAME = new F(F.z[15], 11, 2);
        SUBSCRIBE = new F(F.z[1], 12, 1);
        UNSUBSCRIBE = new F(F.z[12], 13, 1);
        LIST = new F(F.z[3], 14, 2);
        LSUB = new F(F.z[11], 15, 2);
        STATUS = new F(F.z[2], 16, 2);
        APPEND = new F(F.z[17], 17, 2, 4);
        CHECK = new F(F.z[16], 18, 0);
        CLOSE = new F(F.z[5], 19, 0);
        EXPUNGE = new F(F.z[22], 20, 0);
        SEARCH = new F(F.z[6], 21, 1, Integer.MAX_VALUE);
        FETCH = new F(F.z[7], 22, 2);
        STORE = new F(F.z[10], 23, 3);
        COPY = new F(F.z[23], 24, 2);
        UID = new F(F.z[21], 25, 2, Integer.MAX_VALUE);
    }
    
    private F(final String s, final int n) {
        this(s, n, null);
    }
    
    private F(final String s, final int n, final int n2) {
        this(s, n, null, n2, n2);
    }
    
    private F(final String s, final int n, final int n2, final int n3) {
        this(s, n, null, n2, n3);
    }
    
    private F(final String s, final int n, final String s2) {
        this(s, n, s2, 0);
    }
    
    private F(final String s, final int n, final String s2, final int n2) {
        this(s, n, s2, n2, n2);
    }
    
    private F(final String s, final int n, final String c, final int d, final int a) {
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public static final String getCommand(final F f) {
        return f.getIMAPCommand();
    }
    
    public String getIMAPCommand() {
        final int d = m.d;
        String s;
        if (this.c != null) {
            s = this.c;
        }
        else {
            s = this.name();
        }
        if (d != 0) {
            ++l.a;
        }
        return s;
    }
}
