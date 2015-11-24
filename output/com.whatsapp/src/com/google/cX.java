// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum cX
{
    public static final cX BEGIN_ARRAY;
    public static final cX BEGIN_OBJECT;
    public static final cX BOOLEAN;
    public static final cX END_ARRAY;
    public static final cX END_DOCUMENT;
    public static final cX END_OBJECT;
    public static final cX NAME;
    public static final cX NULL;
    public static final cX NUMBER;
    public static final cX STRING;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "Ac\u0010X\tV\u007f\u0015^".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'H';
                    break;
                }
                case 0: {
                    c2 = '\u0004';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = 'T';
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
        final char[] charArray2 = "Fh\u0013N\u0006[b\u0016M\rGy".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'H';
                    break;
                }
                case 0: {
                    c4 = '\u0004';
                    break;
                }
                case 1: {
                    c4 = '-';
                    break;
                }
                case 2: {
                    c4 = 'T';
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
        final char[] charArray3 = "Jx\u0018K".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'H';
                    break;
                }
                case 0: {
                    c6 = '\u0004';
                    break;
                }
                case 1: {
                    c6 = '-';
                    break;
                }
                case 2: {
                    c6 = 'T';
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
        final char[] charArray4 = "Fh\u0013N\u0006[l\u0006U\t]".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'H';
                    break;
                }
                case 0: {
                    c8 = '\u0004';
                    break;
                }
                case 1: {
                    c8 = '-';
                    break;
                }
                case 2: {
                    c8 = 'T';
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
        final char[] charArray5 = "Jx\u0019E\rV".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'H';
                    break;
                }
                case 0: {
                    c10 = '\u0004';
                    break;
                }
                case 1: {
                    c10 = '-';
                    break;
                }
                case 2: {
                    c10 = 'T';
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
        final char[] charArray6 = "Ac\u0010X\u0007Fg\u0011D\u001c".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'H';
                    break;
                }
                case 0: {
                    c12 = '\u0004';
                    break;
                }
                case 1: {
                    c12 = '-';
                    break;
                }
                case 2: {
                    c12 = 'T';
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
        final char[] charArray7 = "Wy\u0006N\u0006C".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'H';
                    break;
                }
                case 0: {
                    c14 = '\u0004';
                    break;
                }
                case 1: {
                    c14 = '-';
                    break;
                }
                case 2: {
                    c14 = 'T';
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
        final char[] charArray8 = "Ac\u0010X\fKn\u0001J\rJy".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'H';
                    break;
                }
                case 0: {
                    c16 = '\u0004';
                    break;
                }
                case 1: {
                    c16 = '-';
                    break;
                }
                case 2: {
                    c16 = 'T';
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
        final char[] charArray9 = "Jl\u0019B".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'H';
                    break;
                }
                case 0: {
                    c18 = '\u0004';
                    break;
                }
                case 1: {
                    c18 = '-';
                    break;
                }
                case 2: {
                    c18 = 'T';
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
        final char[] charArray10 = "Fb\u001bK\rEc".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'H';
                    break;
                }
                case 0: {
                    c20 = '\u0004';
                    break;
                }
                case 1: {
                    c20 = '-';
                    break;
                }
                case 2: {
                    c20 = 'T';
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
        z = z2;
        BEGIN_ARRAY = new cX(cX.z[3], 0);
        END_ARRAY = new cX(cX.z[0], 1);
        BEGIN_OBJECT = new cX(cX.z[1], 2);
        END_OBJECT = new cX(cX.z[5], 3);
        NAME = new cX(cX.z[8], 4);
        STRING = new cX(cX.z[6], 5);
        NUMBER = new cX(cX.z[4], 6);
        BOOLEAN = new cX(cX.z[9], 7);
        NULL = new cX(cX.z[2], 8);
        END_DOCUMENT = new cX(cX.z[7], 9);
    }
    
    private cX(final String s, final int n) {
    }
}
