// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum b
{
    public static final b CONNECTED;
    public static final b DISCONNECTED;
    public static final b PASSWORD_FAIL;
    public static final b SOCKET_CONNECTING;
    public static final b XMPP_CONNECTING;
    private static final b[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u0005R\u0005t\u0019\u001eP\u001bj\u0003\u001eK\u001cj\u0001";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = 'U';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\r^\u0006w\u0011\u0012M\u0011{\u0000\u001cV\u0019";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000eP\u0016o\u0003\t@\u0016k\b\u0013Z\u0016p\u000f\u0013X";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001eP\u001bj\u0003\u001eK\u0010`";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0019V\u0006g\t\u0013Q\u0010g\u0012\u0018[";
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
        CONNECTED = new b(com.whatsapp.fieldstats.b.z[3], 0, 0);
        SOCKET_CONNECTING = new b(com.whatsapp.fieldstats.b.z[2], 1, 1);
        XMPP_CONNECTING = new b(com.whatsapp.fieldstats.b.z[0], 2, 2);
        DISCONNECTED = new b(com.whatsapp.fieldstats.b.z[4], 3, 3);
        PASSWORD_FAIL = new b(com.whatsapp.fieldstats.b.z[1], 4, 4);
        b = new b[] { com.whatsapp.fieldstats.b.CONNECTED, com.whatsapp.fieldstats.b.SOCKET_CONNECTING, com.whatsapp.fieldstats.b.XMPP_CONNECTING, com.whatsapp.fieldstats.b.DISCONNECTED, com.whatsapp.fieldstats.b.PASSWORD_FAIL };
    }
    
    private b(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
