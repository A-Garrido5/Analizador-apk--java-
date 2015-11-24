// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum es
{
    public static final es BOOLEAN;
    public static final es BYTE_STRING;
    public static final es DOUBLE;
    public static final es ENUM;
    public static final es FLOAT;
    public static final es INT;
    public static final es LONG;
    public static final es MESSAGE;
    public static final es STRING;
    private static final es[] a;
    private static final String[] z;
    private final Object b;
    
    static {
        final String[] z2 = new String[9];
        final char[] charArray = "OqLW".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '|';
                    break;
                }
                case 0: {
                    c2 = '\n';
                    break;
                }
                case 1: {
                    c2 = '?';
                    break;
                }
                case 2: {
                    c2 = '\u0019';
                    break;
                }
                case 3: {
                    c2 = '\u001a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "NpLX0O".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '|';
                    break;
                }
                case 0: {
                    c4 = '\n';
                    break;
                }
                case 1: {
                    c4 = '?';
                    break;
                }
                case 2: {
                    c4 = '\u0019';
                    break;
                }
                case 3: {
                    c4 = '\u001a';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "LsV[(".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '|';
                    break;
                }
                case 0: {
                    c6 = '\n';
                    break;
                }
                case 1: {
                    c6 = '?';
                    break;
                }
                case 2: {
                    c6 = '\u0019';
                    break;
                }
                case 3: {
                    c6 = '\u001a';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "HpVV9Kq".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '|';
                    break;
                }
                case 0: {
                    c8 = '\n';
                    break;
                }
                case 1: {
                    c8 = '?';
                    break;
                }
                case 2: {
                    c8 = '\u0019';
                    break;
                }
                case 3: {
                    c8 = '\u001a';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "HfM_#YkKS2M".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '|';
                    break;
                }
                case 0: {
                    c10 = '\n';
                    break;
                }
                case 1: {
                    c10 = '?';
                    break;
                }
                case 2: {
                    c10 = '\u0019';
                    break;
                }
                case 3: {
                    c10 = '\u001a';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "CqM".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '|';
                    break;
                }
                case 0: {
                    c12 = '\n';
                    break;
                }
                case 1: {
                    c12 = '?';
                    break;
                }
                case 2: {
                    c12 = '\u0019';
                    break;
                }
                case 3: {
                    c12 = '\u001a';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "FpW]".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '|';
                    break;
                }
                case 0: {
                    c14 = '\n';
                    break;
                }
                case 1: {
                    c14 = '?';
                    break;
                }
                case 2: {
                    c14 = '\u0019';
                    break;
                }
                case 3: {
                    c14 = '\u001a';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "GzJI=Mz".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '|';
                    break;
                }
                case 0: {
                    c16 = '\n';
                    break;
                }
                case 1: {
                    c16 = '?';
                    break;
                }
                case 2: {
                    c16 = '\u0019';
                    break;
                }
                case 3: {
                    c16 = '\u001a';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "YkKS2M".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '|';
                    break;
                }
                case 0: {
                    c18 = '\n';
                    break;
                }
                case 1: {
                    c18 = '?';
                    break;
                }
                case 2: {
                    c18 = '\u0019';
                    break;
                }
                case 3: {
                    c18 = '\u001a';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        z = z2;
        INT = new es(es.z[5], 0, 0);
        LONG = new es(es.z[6], 1, 0L);
        FLOAT = new es(es.z[2], 2, 0.0f);
        DOUBLE = new es(es.z[1], 3, 0.0);
        BOOLEAN = new es(es.z[3], 4, false);
        STRING = new es(es.z[8], 5, "");
        BYTE_STRING = new es(es.z[4], 6, hv.b);
        ENUM = new es(es.z[0], 7, null);
        MESSAGE = new es(es.z[7], 8, null);
        a = new es[] { es.INT, es.LONG, es.FLOAT, es.DOUBLE, es.BOOLEAN, es.STRING, es.BYTE_STRING, es.ENUM, es.MESSAGE };
    }
    
    private es(final String s, final int n, final Object b) {
        this.b = b;
    }
    
    Object a() {
        return this.b;
    }
}
