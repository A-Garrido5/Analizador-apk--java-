// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum j
{
    public static final j ERROR_UNKNOWN;
    public static final j OK;
    public static final j TIMEOUT;
    private static final j[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0015[";
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
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = 'Z';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001fB6s\u0005\u0005E*w\u0019\u0015G*";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000eY)y\u0018\u000fD";
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
        OK = new j(j.z[0], 0, 1);
        TIMEOUT = new j(j.z[2], 1, 2);
        ERROR_UNKNOWN = new j(j.z[1], 2, 3);
        a = new j[] { j.OK, j.TIMEOUT, j.ERROR_UNKNOWN };
    }
    
    private j(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
