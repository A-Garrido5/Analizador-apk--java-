// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum gl
{
    public static final gl BOTH;
    public static final gl LEFT;
    public static final gl NONE;
    public static final gl RIGHT;
    private static final gl[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0011\u0001us\u0014";
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
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = 'C';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = ';';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000f\rto";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\r\u0007|~";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0001\u0007fs";
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
        NONE = new gl(gl.z[2], 0);
        LEFT = new gl(gl.z[1], 1);
        RIGHT = new gl(gl.z[0], 2);
        BOTH = new gl(gl.z[3], 3);
        a = new gl[] { gl.NONE, gl.LEFT, gl.RIGHT, gl.BOTH };
    }
    
    private gl(final String s, final int n) {
    }
}
