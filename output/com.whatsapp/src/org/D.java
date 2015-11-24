// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum D
{
    public static final D ALL;
    public static final D BODY;
    public static final D BODYSTRUCTURE;
    public static final D ENVELOPE;
    public static final D FAST;
    public static final D FLAGS;
    public static final D FULL;
    public static final D INTERNALDATE;
    public static final D RFC822;
    public static final D UID;
    private static final D[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "5.kL2?0x".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '~';
                    break;
                }
                case 0: {
                    c2 = 'p';
                    break;
                }
                case 1: {
                    c2 = '`';
                    break;
                }
                case 2: {
                    c2 = '=';
                    break;
                }
                case 3: {
                    c2 = '\t';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "2/yP-$2hJ*%2x".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '~';
                    break;
                }
                case 0: {
                    c4 = 'p';
                    break;
                }
                case 1: {
                    c4 = '`';
                    break;
                }
                case 2: {
                    c4 = '=';
                    break;
                }
                case 3: {
                    c4 = '\t';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "%)y".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '~';
                    break;
                }
                case 0: {
                    c6 = 'p';
                    break;
                }
                case 1: {
                    c6 = '`';
                    break;
                }
                case 2: {
                    c6 = '=';
                    break;
                }
                case 3: {
                    c6 = '\t';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "9.iL,>!qM?$%".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '~';
                    break;
                }
                case 0: {
                    c8 = 'p';
                    break;
                }
                case 1: {
                    c8 = '`';
                    break;
                }
                case 2: {
                    c8 = '=';
                    break;
                }
                case 3: {
                    c8 = '\t';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "1,q".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '~';
                    break;
                }
                case 0: {
                    c10 = 'p';
                    break;
                }
                case 1: {
                    c10 = '`';
                    break;
                }
                case 2: {
                    c10 = '=';
                    break;
                }
                case 3: {
                    c10 = '\t';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "2/yP".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '~';
                    break;
                }
                case 0: {
                    c12 = 'p';
                    break;
                }
                case 1: {
                    c12 = '`';
                    break;
                }
                case 2: {
                    c12 = '=';
                    break;
                }
                case 3: {
                    c12 = '\t';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\"&~1LB".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '~';
                    break;
                }
                case 0: {
                    c14 = 'p';
                    break;
                }
                case 1: {
                    c14 = '`';
                    break;
                }
                case 2: {
                    c14 = '=';
                    break;
                }
                case 3: {
                    c14 = '\t';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "6!n]".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '~';
                    break;
                }
                case 0: {
                    c16 = 'p';
                    break;
                }
                case 1: {
                    c16 = '`';
                    break;
                }
                case 2: {
                    c16 = '=';
                    break;
                }
                case 3: {
                    c16 = '\t';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "65qE".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '~';
                    break;
                }
                case 0: {
                    c18 = 'p';
                    break;
                }
                case 1: {
                    c18 = '`';
                    break;
                }
                case 2: {
                    c18 = '=';
                    break;
                }
                case 3: {
                    c18 = '\t';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "6,|N-".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '~';
                    break;
                }
                case 0: {
                    c20 = 'p';
                    break;
                }
                case 1: {
                    c20 = '`';
                    break;
                }
                case 2: {
                    c20 = '=';
                    break;
                }
                case 3: {
                    c20 = '\t';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        z = z2;
        ALL = new D(D.z[4], 0);
        FAST = new D(D.z[7], 1);
        FULL = new D(D.z[8], 2);
        BODY = new D(D.z[5], 3);
        BODYSTRUCTURE = new D(D.z[1], 4);
        ENVELOPE = new D(D.z[0], 5);
        FLAGS = new D(D.z[9], 6);
        INTERNALDATE = new D(D.z[3], 7);
        RFC822 = new D(D.z[6], 8);
        UID = new D(D.z[2], 9);
        a = new D[] { D.ALL, D.FAST, D.FULL, D.BODY, D.BODYSTRUCTURE, D.ENVELOPE, D.FLAGS, D.INTERNALDATE, D.RFC822, D.UID };
    }
    
    private D(final String s, final int n) {
    }
}
