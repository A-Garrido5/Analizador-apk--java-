// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

enum an
{
    public static final an ALLOW;
    public static final an CANCEL;
    private static final an[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "7E=w@8";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = 't';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = 's';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "5H?{R";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CANCEL = new an(an.z[0], 0);
        ALLOW = new an(an.z[1], 1);
        a = new an[] { an.CANCEL, an.ALLOW };
    }
    
    private an(final String s, final int n) {
    }
}
