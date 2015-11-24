// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum bq
{
    public static final bq BOOL;
    public static final bq BYTES;
    public static final bq DOUBLE;
    public static final bq ENUM;
    public static final bq FIXED32;
    public static final bq FIXED64;
    public static final bq FLOAT;
    public static final bq GROUP;
    public static final bq INT32;
    public static final bq INT64;
    public static final bq MESSAGE;
    public static final bq SFIXED32;
    public static final bq SFIXED64;
    public static final bq SINT32;
    public static final bq SINT64;
    public static final bq STRING;
    public static final bq UINT32;
    public static final bq UINT64;
    private static final bq[] a;
    private static final String[] z;
    private hD b;
    
    static {
        final String[] z2 = new String[18];
        final char[] charArray = "\u001diF2X\u001c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0014';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = '\u0013';
                    break;
                }
                case 3: {
                    c2 = 'p';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0010hGF ".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0014';
                    break;
                }
                case 0: {
                    c4 = 'Y';
                    break;
                }
                case 1: {
                    c4 = '&';
                    break;
                }
                case 2: {
                    c4 = '\u0013';
                    break;
                }
                case 3: {
                    c4 = 'p';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u001foK5Pj\u0014".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0014';
                    break;
                }
                case 0: {
                    c6 = 'Y';
                    break;
                }
                case 1: {
                    c6 = '&';
                    break;
                }
                case 2: {
                    c6 = '\u0013';
                    break;
                }
                case 3: {
                    c6 = 'p';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u001et\\%D".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0014';
                    break;
                }
                case 0: {
                    c8 = 'Y';
                    break;
                }
                case 1: {
                    c8 = '&';
                    break;
                }
                case 2: {
                    c8 = '\u0013';
                    break;
                }
                case 3: {
                    c8 = 'p';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\fo]$\"m".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u0014';
                    break;
                }
                case 0: {
                    c10 = 'Y';
                    break;
                }
                case 1: {
                    c10 = '&';
                    break;
                }
                case 2: {
                    c10 = '\u0013';
                    break;
                }
                case 3: {
                    c10 = 'p';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\n`Z(Q\u001d\u0015!".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u0014';
                    break;
                }
                case 0: {
                    c12 = 'Y';
                    break;
                }
                case 1: {
                    c12 = '&';
                    break;
                }
                case 2: {
                    c12 = '\u0013';
                    break;
                }
                case 3: {
                    c12 = 'p';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u001fj\\1@".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\u0014';
                    break;
                }
                case 0: {
                    c14 = 'Y';
                    break;
                }
                case 1: {
                    c14 = '&';
                    break;
                }
                case 2: {
                    c14 = '\u0013';
                    break;
                }
                case 3: {
                    c14 = 'p';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u001bi\\<".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\u0014';
                    break;
                }
                case 0: {
                    c16 = 'Y';
                    break;
                }
                case 1: {
                    c16 = '&';
                    break;
                }
                case 2: {
                    c16 = '\u0013';
                    break;
                }
                case 3: {
                    c16 = 'p';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u001foK5Po\u0012".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '\u0014';
                    break;
                }
                case 0: {
                    c18 = 'Y';
                    break;
                }
                case 1: {
                    c18 = '&';
                    break;
                }
                case 2: {
                    c18 = '\u0013';
                    break;
                }
                case 3: {
                    c18 = 'p';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "\n`Z(Q\u001d\u0010'".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '\u0014';
                    break;
                }
                case 0: {
                    c20 = 'Y';
                    break;
                }
                case 1: {
                    c20 = '&';
                    break;
                }
                case 2: {
                    c20 = '\u0013';
                    break;
                }
                case 3: {
                    c20 = 'p';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "\fo]$'k".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '\u0014';
                    break;
                }
                case 0: {
                    c22 = 'Y';
                    break;
                }
                case 1: {
                    c22 = '&';
                    break;
                }
                case 2: {
                    c22 = '\u0013';
                    break;
                }
                case 3: {
                    c22 = 'p';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "\u001b\u007fG5G".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '\u0014';
                    break;
                }
                case 0: {
                    c24 = 'Y';
                    break;
                }
                case 1: {
                    c24 = '&';
                    break;
                }
                case 2: {
                    c24 = '\u0013';
                    break;
                }
                case 3: {
                    c24 = 'p';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "\no]$\"m".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '\u0014';
                    break;
                }
                case 0: {
                    c26 = 'Y';
                    break;
                }
                case 1: {
                    c26 = '&';
                    break;
                }
                case 2: {
                    c26 = '\u0013';
                    break;
                }
                case 3: {
                    c26 = 'p';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u0010hGC&".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '\u0014';
                    break;
                }
                case 0: {
                    c28 = 'Y';
                    break;
                }
                case 1: {
                    c28 = '&';
                    break;
                }
                case 2: {
                    c28 = '\u0013';
                    break;
                }
                case 3: {
                    c28 = 'p';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "\u001chF=".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '\u0014';
                    break;
                }
                case 0: {
                    c30 = 'Y';
                    break;
                }
                case 1: {
                    c30 = '&';
                    break;
                }
                case 2: {
                    c30 = '\u0013';
                    break;
                }
                case 3: {
                    c30 = 'p';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "\nrA9Z\u001e".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '\u0014';
                    break;
                }
                case 0: {
                    c32 = 'Y';
                    break;
                }
                case 1: {
                    c32 = '&';
                    break;
                }
                case 2: {
                    c32 = '\u0013';
                    break;
                }
                case 3: {
                    c32 = 'p';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        final char[] charArray17 = "\u0014c@#U\u001ec".toCharArray();
        for (int length13 = charArray17.length, n17 = 0; length13 > n17; ++n17) {
            final char c33 = charArray17[n17];
            char c34 = '\0';
            switch (n17 % 5) {
                default: {
                    c34 = '\u0014';
                    break;
                }
                case 0: {
                    c34 = 'Y';
                    break;
                }
                case 1: {
                    c34 = '&';
                    break;
                }
                case 2: {
                    c34 = '\u0013';
                    break;
                }
                case 3: {
                    c34 = 'p';
                    break;
                }
            }
            charArray17[n17] = (char)(c34 ^ c33);
        }
        z2[16] = new String(charArray17).intern();
        final char[] charArray18 = "\no]$'k".toCharArray();
        for (int length14 = charArray18.length, n18 = 0; length14 > n18; ++n18) {
            final char c35 = charArray18[n18];
            char c36 = '\0';
            switch (n18 % 5) {
                default: {
                    c36 = '\u0014';
                    break;
                }
                case 0: {
                    c36 = 'Y';
                    break;
                }
                case 1: {
                    c36 = '&';
                    break;
                }
                case 2: {
                    c36 = '\u0013';
                    break;
                }
                case 3: {
                    c36 = 'p';
                    break;
                }
            }
            charArray18[n18] = (char)(c36 ^ c35);
        }
        z2[17] = new String(charArray18).intern();
        z = z2;
        DOUBLE = new bq(bq.z[0], 0, hD.DOUBLE);
        FLOAT = new bq(bq.z[6], 1, hD.FLOAT);
        INT64 = new bq(bq.z[1], 2, hD.LONG);
        UINT64 = new bq(bq.z[4], 3, hD.LONG);
        INT32 = new bq(bq.z[13], 4, hD.INT);
        FIXED64 = new bq(bq.z[8], 5, hD.LONG);
        FIXED32 = new bq(bq.z[2], 6, hD.INT);
        BOOL = new bq(bq.z[7], 7, hD.BOOLEAN);
        STRING = new bq(bq.z[15], 8, hD.STRING);
        GROUP = new bq(bq.z[3], 9, hD.MESSAGE);
        MESSAGE = new bq(bq.z[16], 10, hD.MESSAGE);
        BYTES = new bq(bq.z[11], 11, hD.BYTE_STRING);
        UINT32 = new bq(bq.z[10], 12, hD.INT);
        ENUM = new bq(bq.z[14], 13, hD.ENUM);
        SFIXED32 = new bq(bq.z[5], 14, hD.INT);
        SFIXED64 = new bq(bq.z[9], 15, hD.LONG);
        SINT32 = new bq(bq.z[17], 16, hD.INT);
        SINT64 = new bq(bq.z[12], 17, hD.LONG);
        a = new bq[] { bq.DOUBLE, bq.FLOAT, bq.INT64, bq.UINT64, bq.INT32, bq.FIXED64, bq.FIXED32, bq.BOOL, bq.STRING, bq.GROUP, bq.MESSAGE, bq.BYTES, bq.UINT32, bq.ENUM, bq.SFIXED32, bq.SFIXED64, bq.SINT32, bq.SINT64 };
    }
    
    private bq(final String s, final int n, final hD b) {
        this.b = b;
    }
    
    public static bq valueOf(final d1 d1) {
        return values()[-1 + d1.getNumber()];
    }
    
    public hD getJavaType() {
        return this.b;
    }
    
    public d1 toProto() {
        return d1.valueOf(1 + this.ordinal());
    }
}
