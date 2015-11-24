// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

enum l
{
    public static final l BINARY;
    public static final l DIGIT;
    public static final l LOWER;
    public static final l MIXED;
    public static final l PUNCT;
    public static final l UPPER;
    private static final l[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "I\u001b\bRi";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '-';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = 'P';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "@\u001b\u0017^y";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Q\u0002\u0000R\u007f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "T\u0007\u001eTy";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "H\u001d\u0007R\u007f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "F\u001b\u001eV\u007f]";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        UPPER = new l(l.z[2], 0);
        LOWER = new l(l.z[4], 1);
        MIXED = new l(l.z[0], 2);
        DIGIT = new l(l.z[1], 3);
        PUNCT = new l(l.z[3], 4);
        BINARY = new l(l.z[5], 5);
        a = new l[] { l.UPPER, l.LOWER, l.MIXED, l.DIGIT, l.PUNCT, l.BINARY };
    }
    
    private l(final String s, final int n) {
    }
}
