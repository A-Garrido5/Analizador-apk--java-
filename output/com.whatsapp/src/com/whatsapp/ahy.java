// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum ahy
{
    public static final ahy CREATED;
    public static final ahy EXPIRED;
    public static final ahy FAIL;
    public static final ahy OK;
    private static final ahy[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "Vo\u0001$\u0001Vs";
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
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = '7';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = 'm';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Uv\u0018!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\\|";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Pe\u0014,\u0007Vs";
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
        OK = new ahy(ahy.z[2], 0);
        EXPIRED = new ahy(ahy.z[0], 1);
        FAIL = new ahy(ahy.z[1], 2);
        CREATED = new ahy(ahy.z[3], 3);
        a = new ahy[] { ahy.OK, ahy.EXPIRED, ahy.FAIL, ahy.CREATED };
    }
    
    private ahy(final String s, final int n) {
    }
}
