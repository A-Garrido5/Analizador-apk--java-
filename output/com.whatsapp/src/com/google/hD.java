// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum hD
{
    public static final hD BOOLEAN;
    public static final hD BYTE_STRING;
    public static final hD DOUBLE;
    public static final hD ENUM;
    public static final hD FLOAT;
    public static final hD INT;
    public static final hD LONG;
    public static final hD MESSAGE;
    public static final hD STRING;
    private static final hD[] a;
    private static final String[] z;
    private final Object b;
    
    static {
        final String[] z2 = new String[9];
        final char[] charArray = "\u00012dud\u0010?byu\u0004".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ';';
                    break;
                }
                case 0: {
                    c2 = 'C';
                    break;
                }
                case 1: {
                    c2 = 'k';
                    break;
                }
                case 2: {
                    c2 = '0';
                    break;
                }
                case 3: {
                    c2 = '0';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0006%e}".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = ';';
                    break;
                }
                case 0: {
                    c4 = 'C';
                    break;
                }
                case 1: {
                    c4 = 'k';
                    break;
                }
                case 2: {
                    c4 = '0';
                    break;
                }
                case 3: {
                    c4 = '0';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u000e.ccz\u0004.".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = ';';
                    break;
                }
                case 0: {
                    c6 = 'C';
                    break;
                }
                case 1: {
                    c6 = 'k';
                    break;
                }
                case 2: {
                    c6 = '0';
                    break;
                }
                case 3: {
                    c6 = '0';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0001$\u007f|~\u0002%".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = ';';
                    break;
                }
                case 0: {
                    c8 = 'C';
                    break;
                }
                case 1: {
                    c8 = 'k';
                    break;
                }
                case 2: {
                    c8 = '0';
                    break;
                }
                case 3: {
                    c8 = '0';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\n%d".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = ';';
                    break;
                }
                case 0: {
                    c10 = 'C';
                    break;
                }
                case 1: {
                    c10 = 'k';
                    break;
                }
                case 2: {
                    c10 = '0';
                    break;
                }
                case 3: {
                    c10 = '0';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u000f$~w".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = ';';
                    break;
                }
                case 0: {
                    c12 = 'C';
                    break;
                }
                case 1: {
                    c12 = 'k';
                    break;
                }
                case 2: {
                    c12 = '0';
                    break;
                }
                case 3: {
                    c12 = '0';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u0005'\u007fqo".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = ';';
                    break;
                }
                case 0: {
                    c14 = 'C';
                    break;
                }
                case 1: {
                    c14 = 'k';
                    break;
                }
                case 2: {
                    c14 = '0';
                    break;
                }
                case 3: {
                    c14 = '0';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u0007$erw\u0006".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = ';';
                    break;
                }
                case 0: {
                    c16 = 'C';
                    break;
                }
                case 1: {
                    c16 = 'k';
                    break;
                }
                case 2: {
                    c16 = '0';
                    break;
                }
                case 3: {
                    c16 = '0';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u0010?byu\u0004".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = ';';
                    break;
                }
                case 0: {
                    c18 = 'C';
                    break;
                }
                case 1: {
                    c18 = 'k';
                    break;
                }
                case 2: {
                    c18 = '0';
                    break;
                }
                case 3: {
                    c18 = '0';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        z = z2;
        INT = new hD(hD.z[4], 0, 0);
        LONG = new hD(hD.z[5], 1, 0L);
        FLOAT = new hD(hD.z[6], 2, 0.0f);
        DOUBLE = new hD(hD.z[7], 3, 0.0);
        BOOLEAN = new hD(hD.z[3], 4, false);
        STRING = new hD(hD.z[8], 5, "");
        BYTE_STRING = new hD(hD.z[0], 6, hv.b);
        ENUM = new hD(hD.z[1], 7, null);
        MESSAGE = new hD(hD.z[2], 8, null);
        a = new hD[] { hD.INT, hD.LONG, hD.FLOAT, hD.DOUBLE, hD.BOOLEAN, hD.STRING, hD.BYTE_STRING, hD.ENUM, hD.MESSAGE };
    }
    
    private hD(final String s, final int n, final Object b) {
        this.b = b;
    }
    
    static Object a(final hD hd) {
        return hd.b;
    }
}
