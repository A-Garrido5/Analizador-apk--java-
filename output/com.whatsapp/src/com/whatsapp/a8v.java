// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum a8v
{
    public static final a8v FAILED;
    public static final a8v SUCCESS_CREATED;
    public static final a8v SUCCESS_RESTORED;
    private static final a8v[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "p\u0013\u00061\u0005r";
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
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "e\u0007\f>\u0005e\u0001\u0010/\u0005e\u0006\u0000/\u0005r";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "e\u0007\f>\u0005e\u0001\u0010>\u0012s\u0013\u001b8\u0004";
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
        FAILED = new a8v(a8v.z[0], 0);
        SUCCESS_RESTORED = new a8v(a8v.z[1], 1);
        SUCCESS_CREATED = new a8v(a8v.z[2], 2);
        a = new a8v[] { a8v.FAILED, a8v.SUCCESS_RESTORED, a8v.SUCCESS_CREATED };
    }
    
    private a8v(final String s, final int n) {
    }
}
