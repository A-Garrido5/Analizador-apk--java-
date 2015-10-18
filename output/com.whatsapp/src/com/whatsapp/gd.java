// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

enum gd
{
    public static final gd AGREE_1;
    public static final gd AGREE_2;
    public static final gd AGREE_NONE;
    private static final gd[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "1\u0006I\u0015\u0015/p";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = 'A';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = 'P';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1\u0006I\u0015\u0015/s";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "1\u0006I\u0015\u0015/\u000fT\u001e\u0015";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        AGREE_NONE = new gd(gd.z[2], 0);
        AGREE_1 = new gd(gd.z[0], 1);
        AGREE_2 = new gd(gd.z[1], 2);
        a = new gd[] { gd.AGREE_NONE, gd.AGREE_1, gd.AGREE_2 };
    }
    
    private gd(final String s, final int n) {
    }
}
