// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum b1
{
    public static final b1 ERROR_UNKNOWN;
    public static final b1 OK;
    @Deprecated
    public static final b1 OK_AFTER_RETRY;
    private static final b1[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "]I-\u0001|GN1\u0005`WL1";
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
                        c2 = '.';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = 'N';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "WP";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "WP \u000fhL^-\u0011|]O-\u0017";
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
        OK = new b1(b1.z[1], 0, 1);
        OK_AFTER_RETRY = new b1(b1.z[2], 1, 2);
        ERROR_UNKNOWN = new b1(b1.z[0], 2, 3);
        b = new b1[] { b1.OK, b1.OK_AFTER_RETRY, b1.ERROR_UNKNOWN };
    }
    
    private b1(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
