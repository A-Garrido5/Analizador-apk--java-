// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

public enum bv
{
    public static final bv ALL;
    public static final bv EXTERNAL;
    public static final bv INTERNAL;
    public static final bv NONE;
    private static final bv[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0006!\u001c&";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t\"\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001 \u0006&;\u0006/\u001e";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\r6\u0006&;\u0006/\u001e";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NONE = new bv(bv.z[0], 0);
        INTERNAL = new bv(bv.z[2], 1);
        EXTERNAL = new bv(bv.z[3], 2);
        ALL = new bv(bv.z[1], 3);
        a = new bv[] { bv.NONE, bv.INTERNAL, bv.EXTERNAL, bv.ALL };
    }
    
    private bv(final String s, final int n) {
    }
}
