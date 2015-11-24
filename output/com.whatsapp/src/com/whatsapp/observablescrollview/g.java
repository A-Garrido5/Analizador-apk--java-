// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.observablescrollview;

public enum g
{
    public static final g DOWN;
    public static final g STOP;
    public static final g UP;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "j&*B";
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
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = '}';
                        break;
                    }
                    case 3: {
                        c2 = '\f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "}=2\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "{9";
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
        STOP = new g(g.z[1], 0);
        UP = new g(g.z[2], 1);
        DOWN = new g(g.z[0], 2);
    }
    
    private g(final String s, final int n) {
    }
}
