// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum al
{
    public static final al DUPLICATE;
    public static final al ERROR_REQUEST;
    public static final al ERROR_UNKNOWN;
    public static final al ERROR_UPLOAD;
    public static final al OK;
    private static final al[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[5];
        String s = "hAPg\u0015rFLc\tbDL";
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
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '(';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "hAPg\u0015rFRd\blW";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "bX";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "hAPg\u0015rAGy\u0012h@V";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "iFRd\u000enRVm";
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
        OK = new al(al.z[2], 0, 1);
        DUPLICATE = new al(al.z[4], 1, 3);
        ERROR_UNKNOWN = new al(al.z[0], 2, 2);
        ERROR_REQUEST = new al(al.z[3], 3, 4);
        ERROR_UPLOAD = new al(al.z[1], 4, 5);
        a = new al[] { al.OK, al.DUPLICATE, al.ERROR_UNKNOWN, al.ERROR_REQUEST, al.ERROR_UPLOAD };
    }
    
    private al(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
