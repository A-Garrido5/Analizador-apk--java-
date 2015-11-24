// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum l
{
    public static final l CONNECTED;
    public static final l CONNECTING;
    public static final l DISCONNECTED;
    public static final l UNKNOWN;
    private static final l[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "b:8?\u0002h=.?\u0019c7";
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
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = '|';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "e<%2\be'.8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "s= 2\u0002q=";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "e<%2\be'\"2\n";
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
        DISCONNECTED = new l(l.z[0], 0, 1);
        CONNECTING = new l(l.z[3], 1, 2);
        CONNECTED = new l(l.z[1], 2, 3);
        UNKNOWN = new l(l.z[2], 3, 4);
        b = new l[] { l.DISCONNECTED, l.CONNECTING, l.CONNECTED, l.UNKNOWN };
    }
    
    private l(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
