// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum R
{
    public static final R AUTH_STATE;
    public static final R DISCONNECTED_STATE;
    public static final R LOGOUT_STATE;
    public static final R NOT_AUTH_STATE;
    private static final R[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "u*9`\u001am:-{\u000em ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'O';
                    break;
                }
                case 0: {
                    c2 = '9';
                    break;
                }
                case 1: {
                    c2 = 'e';
                    break;
                }
                case 2: {
                    c2 = '~';
                    break;
                }
                case 3: {
                    c2 = '/';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "},-l\u0000w+;l\u001b|!!|\u001bx1;".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'O';
                    break;
                }
                case 0: {
                    c4 = '9';
                    break;
                }
                case 1: {
                    c4 = 'e';
                    break;
                }
                case 2: {
                    c4 = '~';
                    break;
                }
                case 3: {
                    c4 = '/';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "w**p\u000el16p\u001cm$*j".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'O';
                    break;
                }
                case 0: {
                    c6 = '9';
                    break;
                }
                case 1: {
                    c6 = 'e';
                    break;
                }
                case 2: {
                    c6 = '~';
                    break;
                }
                case 3: {
                    c6 = '/';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "x0*g\u0010j1?{\n".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'O';
                    break;
                }
                case 0: {
                    c8 = '9';
                    break;
                }
                case 1: {
                    c8 = 'e';
                    break;
                }
                case 2: {
                    c8 = '~';
                    break;
                }
                case 3: {
                    c8 = '/';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
        DISCONNECTED_STATE = new R(R.z[1], 0);
        NOT_AUTH_STATE = new R(R.z[2], 1);
        AUTH_STATE = new R(R.z[3], 2);
        LOGOUT_STATE = new R(R.z[0], 3);
        a = new R[] { R.DISCONNECTED_STATE, R.NOT_AUTH_STATE, R.AUTH_STATE, R.LOGOUT_STATE };
    }
    
    private R(final String s, final int n) {
    }
}
