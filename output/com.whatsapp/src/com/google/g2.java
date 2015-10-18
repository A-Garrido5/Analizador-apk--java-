// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum g2
{
    public static final g2 INVALID_COUNTRY_CODE;
    public static final g2 NOT_A_NUMBER;
    public static final g2 TOO_LONG;
    public static final g2 TOO_SHORT_AFTER_IDD;
    public static final g2 TOO_SHORT_NSN;
    private static final g2[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "5oW/X$nV=[>r";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0019';
                        break;
                    }
                    case 0: {
                        c2 = '{';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "/oL/U4nD";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "/oL/J3oQ$F:fW5K$iG4";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "2nU1U2d\\3V.nW\"@$cL4\\";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "/oL/J3oQ$F5sM";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        INVALID_COUNTRY_CODE = new g2(g2.z[3], 0);
        NOT_A_NUMBER = new g2(g2.z[0], 1);
        TOO_SHORT_AFTER_IDD = new g2(g2.z[2], 2);
        TOO_SHORT_NSN = new g2(g2.z[4], 3);
        TOO_LONG = new g2(g2.z[1], 4);
        a = new g2[] { g2.INVALID_COUNTRY_CODE, g2.NOT_A_NUMBER, g2.TOO_SHORT_AFTER_IDD, g2.TOO_SHORT_NSN, g2.TOO_LONG };
    }
    
    private g2(final String s, final int n) {
    }
}
