// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum u
{
    public static final u EXACT_MATCH;
    public static final u NOT_A_NUMBER;
    public static final u NO_MATCH;
    public static final u NSN_MATCH;
    public static final u SHORT_NSN_MATCH;
    private static final u[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "?0\b7\b07\u0005 ";
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
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = 'q';
                        break;
                    }
                    case 1: {
                        c2 = 'c';
                        break;
                    }
                    case 2: {
                        c2 = 'F';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?,\u0019%\u0004% \u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "?,\u00127\u0004.-\u0013%\u000741";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "4;\u0007+\u0011..\u0007<\u00069";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\"+\t:\u0011.-\u0015&\u001a<\"\u0012+\r";
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
        NOT_A_NUMBER = new u(u.z[2], 0);
        NO_MATCH = new u(u.z[1], 1);
        SHORT_NSN_MATCH = new u(u.z[4], 2);
        NSN_MATCH = new u(u.z[0], 3);
        EXACT_MATCH = new u(u.z[3], 4);
        a = new u[] { u.NOT_A_NUMBER, u.NO_MATCH, u.SHORT_NSN_MATCH, u.NSN_MATCH, u.EXACT_MATCH };
    }
    
    private u(final String s, final int n) {
    }
}
