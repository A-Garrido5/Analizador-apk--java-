// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

enum r
{
    public static final r DEBUG_CHAT_HOST;
    public static final r END;
    public static final r FALLBACKS;
    public static final r HTTP;
    public static final r IP_OVERRIDE_PORT_1;
    public static final r IP_OVERRIDE_PORT_2;
    public static final r OVERRIDES;
    public static final r PRIMARY;
    public static final r START;
    private static final r[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "pH\u000fD";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0007';
                        break;
                    }
                    case 0: {
                        c2 = '8';
                        break;
                    }
                    case 1: {
                        c2 = '\u001c';
                        break;
                    }
                    case 2: {
                        c2 = '[';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "qL\u0004[Q}N\t]C}C\u000b[UlCi";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "kH\u001aFS";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "wJ\u001eFUqX\u001eG";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "|Y\u0019A@g_\u0013USgT\u0014GS";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "hN\u0012YFjE";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "qL\u0004[Q}N\t]C}C\u000b[UlCj";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    s = "~]\u0017XEy_\u0010G";
                    n = 6;
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    array = z2;
                    s = "}R\u001f";
                    n = 7;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        START = new r(r.z[2], 0);
        DEBUG_CHAT_HOST = new r(r.z[4], 1);
        OVERRIDES = new r(r.z[3], 2);
        IP_OVERRIDE_PORT_1 = new r(r.z[6], 3);
        IP_OVERRIDE_PORT_2 = new r(r.z[1], 4);
        PRIMARY = new r(r.z[5], 5);
        FALLBACKS = new r(r.z[7], 6);
        HTTP = new r(r.z[0], 7);
        END = new r(r.z[8], 8);
        a = new r[] { r.START, r.DEBUG_CHAT_HOST, r.OVERRIDES, r.IP_OVERRIDE_PORT_1, r.IP_OVERRIDE_PORT_2, r.PRIMARY, r.FALLBACKS, r.HTTP, r.END };
    }
    
    private r(final String s, final int n) {
    }
}
