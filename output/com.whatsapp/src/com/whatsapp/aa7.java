// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum aa7
{
    public static final aa7 AUTO_DETECTED;
    public static final aa7 RETRIED;
    public static final aa7 TAPPED_LINK;
    public static final aa7 TYPED;
    private static final aa7[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = ")OM 9,_M*%<_]";
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
                        c2 = 'f';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = 'o';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "<CI*\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "<[I?#,EU&(#";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ":_M=/-^";
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
        TYPED = new aa7(aa7.z[1], 0);
        AUTO_DETECTED = new aa7(aa7.z[0], 1);
        TAPPED_LINK = new aa7(aa7.z[2], 2);
        RETRIED = new aa7(aa7.z[3], 3);
        a = new aa7[] { aa7.TYPED, aa7.AUTO_DETECTED, aa7.TAPPED_LINK, aa7.RETRIED };
    }
    
    private aa7(final String s, final int n) {
    }
}
