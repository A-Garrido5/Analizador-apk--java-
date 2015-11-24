// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a9
{
    public static final a9 ERROR_MAX_RETRY;
    public static final a9 ERROR_UNKNOWN;
    public static final a9 OK;
    public static final a9 OK_AFTER_RETRY;
    private static final a9[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[4];
        String s = "PU?}<JR#y ZP#";
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
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = '\u0015';
                        break;
                    }
                    case 1: {
                        c2 = '\u0007';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = '2';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "PU?}<JJ,j1GB9`7";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "ZL2s(AB?m<PS?k";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "ZL";
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
        OK = new a9(a9.z[3], 0, 1);
        OK_AFTER_RETRY = new a9(a9.z[2], 1, 2);
        ERROR_UNKNOWN = new a9(a9.z[0], 2, 3);
        ERROR_MAX_RETRY = new a9(a9.z[1], 3, 4);
        b = new a9[] { a9.OK, a9.OK_AFTER_RETRY, a9.ERROR_UNKNOWN, a9.ERROR_MAX_RETRY };
    }
    
    private a9(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
