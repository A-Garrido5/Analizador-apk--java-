// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a0
{
    public static final a0 ENDED_BY_PEER;
    public static final a0 ENDED_BY_SELF;
    public static final a0 ENDED_BY_USER;
    public static final a0 RECONNECTING;
    public static final a0 TIMEOUT;
    private static final a0[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[5];
        String s = "3e}%\u0018/e}>\u001f/g";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'V';
                        break;
                    }
                    case 0: {
                        c2 = 'a';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "$nz/\u0012>bg5\u0006$el";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "5is/\u00194t";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "$nz/\u0012>bg5\u00032el";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "$nz/\u0012>bg5\u0005$lx";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ENDED_BY_USER = new a0(a0.z[3], 0, 1);
        TIMEOUT = new a0(a0.z[2], 1, 2);
        RECONNECTING = new a0(a0.z[0], 2, 3);
        ENDED_BY_SELF = new a0(a0.z[4], 3, 4);
        ENDED_BY_PEER = new a0(a0.z[1], 4, 5);
        a = new a0[] { a0.ENDED_BY_USER, a0.TIMEOUT, a0.RECONNECTING, a0.ENDED_BY_SELF, a0.ENDED_BY_PEER };
    }
    
    private a0(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
