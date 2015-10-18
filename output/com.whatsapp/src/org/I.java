// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum I
{
    public static final I CRAM_MD5;
    public static final I LOGIN;
    public static final I PLAIN;
    public static final I XOAUTH;
    private static final I[] b;
    private static final String[] z;
    private final String a;
    
    static {
        final String[] z2 = new String[8];
        final char[] charArray = "tf\u001aYl".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\"';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '*';
                    break;
                }
                case 2: {
                    c2 = '[';
                    break;
                }
                case 3: {
                    c2 = '\u0010';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "he\u001cYl".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\"';
                    break;
                }
                case 0: {
                    c4 = '$';
                    break;
                }
                case 1: {
                    c4 = '*';
                    break;
                }
                case 2: {
                    c4 = '[';
                    break;
                }
                case 3: {
                    c4 = '\u0010';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "|e\u001aEvl".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\"';
                    break;
                }
                case 0: {
                    c6 = '$';
                    break;
                }
                case 1: {
                    c6 = '*';
                    break;
                }
                case 2: {
                    c6 = '[';
                    break;
                }
                case 3: {
                    c6 = '\u0010';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "gx\u001a]}inn".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\"';
                    break;
                }
                case 0: {
                    c8 = '$';
                    break;
                }
                case 1: {
                    c8 = '*';
                    break;
                }
                case 2: {
                    c8 = '[';
                    break;
                }
                case 3: {
                    c8 = '\u0010';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "gx\u001a]\u000finn".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\"';
                    break;
                }
                case 0: {
                    c10 = '$';
                    break;
                }
                case 1: {
                    c10 = '*';
                    break;
                }
                case 2: {
                    c10 = '[';
                    break;
                }
                case 3: {
                    c10 = '\u0010';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "tf\u001aYl".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\"';
                    break;
                }
                case 0: {
                    c12 = '$';
                    break;
                }
                case 1: {
                    c12 = '*';
                    break;
                }
                case 2: {
                    c12 = '[';
                    break;
                }
                case 3: {
                    c12 = '\u0010';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "|e\u001aEvl".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '\"';
                    break;
                }
                case 0: {
                    c14 = '$';
                    break;
                }
                case 1: {
                    c14 = '*';
                    break;
                }
                case 2: {
                    c14 = '[';
                    break;
                }
                case 3: {
                    c14 = '\u0010';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "he\u001cYl".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '\"';
                    break;
                }
                case 0: {
                    c16 = '$';
                    break;
                }
                case 1: {
                    c16 = '*';
                    break;
                }
                case 2: {
                    c16 = '[';
                    break;
                }
                case 3: {
                    c16 = '\u0010';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        z = z2;
        PLAIN = new I(I.z[5], 0, I.z[0]);
        CRAM_MD5 = new I(I.z[3], 1, I.z[4]);
        LOGIN = new I(I.z[7], 2, I.z[1]);
        XOAUTH = new I(I.z[6], 3, I.z[2]);
        b = new I[] { I.PLAIN, I.CRAM_MD5, I.LOGIN, I.XOAUTH };
    }
    
    private I(final String s, final int n, final String a) {
        this.a = a;
    }
    
    public final String getAuthName() {
        return this.a;
    }
}
