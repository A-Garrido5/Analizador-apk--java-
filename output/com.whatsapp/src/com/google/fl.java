// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

enum fl
{
    public static final fl ALPHA;
    public static final fl ISO_IEC_646;
    public static final fl NUMERIC;
    private static final fl[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u001dE?jc\u001aS";
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
                        c2 = '1';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = 'r';
                        break;
                    }
                    case 3: {
                        c2 = '/';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001aC=px\u0016S-\u0019\u0005e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0012\\\"gp";
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
        NUMERIC = new fl(fl.z[0], 0);
        ALPHA = new fl(fl.z[2], 1);
        ISO_IEC_646 = new fl(fl.z[1], 2);
        a = new fl[] { fl.NUMERIC, fl.ALPHA, fl.ISO_IEC_646 };
    }
    
    private fl(final String s, final int n) {
    }
}
