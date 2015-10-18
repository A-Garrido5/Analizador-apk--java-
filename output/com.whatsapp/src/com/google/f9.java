// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum f9
{
    public static final f9 E164;
    public static final f9 INTERNATIONAL;
    public static final f9 NATIONAL;
    public static final f9 RFC3966;
    private static final f9[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "F\u00175_j\"g";
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
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = 'Q';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Q`@X";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Z\u0010\"%\u001cZ\u0010:";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]\u001f\")\u0001Z\u0010\"%\u001cZ\u0010:";
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
        E164 = new f9(f9.z[1], 0);
        INTERNATIONAL = new f9(f9.z[3], 1);
        NATIONAL = new f9(f9.z[2], 2);
        RFC3966 = new f9(f9.z[0], 3);
        a = new f9[] { f9.E164, f9.INTERNATIONAL, f9.NATIONAL, f9.RFC3966 };
    }
    
    private f9(final String s, final int n) {
    }
}
