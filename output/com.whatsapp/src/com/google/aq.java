// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

enum aq
{
    public static final aq DONE;
    public static final aq NOT_READY;
    public static final aq READY;
    private static final aq[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "4\u0002,g";
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
                        c2 = 'L';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = '\"';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ">\u00026}\u001e5\f&{";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\"\b#f\u0015";
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
        NOT_READY = new aq(aq.z[1], 0);
        READY = new aq(aq.z[2], 1);
        DONE = new aq(aq.z[0], 2);
        a = new aq[] { aq.NOT_READY, aq.READY, aq.DONE };
    }
    
    private aq(final String s, final int n) {
    }
}
