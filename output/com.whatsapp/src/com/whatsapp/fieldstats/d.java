// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum d
{
    public static final d AUTH_FAILED;
    public static final d BACKUP_SERVER_UNREACHABLE;
    public static final d DATA_CONNECTION_REQUIRED_BUT_MISSING;
    public static final d NO_SPACE_AVAILABLE;
    public static final d OK;
    public static final d UNKNOWN_ERROR;
    public static final d WIFI_REQUIRED_BUT_MISSING;
    private static final d[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[7];
        String s = "|n 50np0;7hj1!0p}&?&vn!2 ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "if%7:lj2+,lj'!'k{<3,m|*0\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "qd";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "ka(0*ia<;7l`1";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "zn7?:}`-0 }{*1+a}&/0w}&::|z7!(w|07+y";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u007fz76:xn*2 z";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "p`<-5\u007fl&!$hn*2$|c&";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        OK = new d(d.z[2], 0, 1);
        UNKNOWN_ERROR = new d(d.z[3], 1, 2);
        NO_SPACE_AVAILABLE = new d(d.z[6], 2, 3);
        DATA_CONNECTION_REQUIRED_BUT_MISSING = new d(d.z[4], 3, 7);
        WIFI_REQUIRED_BUT_MISSING = new d(d.z[1], 4, 4);
        BACKUP_SERVER_UNREACHABLE = new d(d.z[0], 5, 5);
        AUTH_FAILED = new d(d.z[5], 6, 6);
        b = new d[] { d.OK, d.UNKNOWN_ERROR, d.NO_SPACE_AVAILABLE, d.DATA_CONNECTION_REQUIRED_BUT_MISSING, d.WIFI_REQUIRED_BUT_MISSING, d.BACKUP_SERVER_UNREACHABLE, d.AUTH_FAILED };
    }
    
    private d(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
