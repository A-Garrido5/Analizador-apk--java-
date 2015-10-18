// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum am
{
    public static final am BROWSER_CLOSE;
    public static final am BROWSER_LOGOUT;
    public static final am PHONE_LOGOUT;
    private static final am[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = "<u>\u0012^;u.\tB9h$\u0011";
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
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = 'E';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "<u>\u0012^;u.\u0006A1t4";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ".o>\u000bH!k>\u0002B+s";
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
        BROWSER_CLOSE = new am(am.z[1], 0, 0);
        BROWSER_LOGOUT = new am(am.z[0], 1, 1);
        PHONE_LOGOUT = new am(am.z[2], 2, 2);
        a = new am[] { am.BROWSER_CLOSE, am.BROWSER_LOGOUT, am.PHONE_LOGOUT };
    }
    
    private am(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
