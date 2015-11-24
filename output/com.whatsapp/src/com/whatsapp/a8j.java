// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

enum a8j
{
    public static final a8j FAILED_GENERIC;
    public static final a8j FAILED_OUT_OF_SPACE;
    public static final a8j SUCCESS;
    private static final a8j[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "C h6 C&";
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
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = '\u0010';
                        break;
                    }
                    case 1: {
                        c2 = 'u';
                        break;
                    }
                    case 2: {
                        c2 = '+';
                        break;
                    }
                    case 3: {
                        c2 = 'u';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "V4b9 T*l0+U'b6";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "V4b9 T*d 1O:m*6@4h0";
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
        SUCCESS = new a8j(a8j.z[0], 0);
        FAILED_GENERIC = new a8j(a8j.z[1], 1);
        FAILED_OUT_OF_SPACE = new a8j(a8j.z[2], 2);
        a = new a8j[] { a8j.SUCCESS, a8j.FAILED_GENERIC, a8j.FAILED_OUT_OF_SPACE };
    }
    
    private a8j(final String s, final int n) {
    }
}
