// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bx
{
    public static final bx ERROR_FAILED;
    public static final bx ERROR_PROVIDER;
    public static final bx ERROR_REQUEST;
    public static final bx SUCCESS;
    private static final bx[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "H\u001fk|WR\u001f|bPH\u001em";
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
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "H\u001fk|WR\u001dk|SD\t|a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "H\u001fk|WR\u000bxzIH\t";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "^\u0018zp@^\u001e";
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
        SUCCESS = new bx(bx.z[3], 0, 1);
        ERROR_PROVIDER = new bx(bx.z[1], 1, 2);
        ERROR_REQUEST = new bx(bx.z[0], 2, 3);
        ERROR_FAILED = new bx(bx.z[2], 3, 4);
        a = new bx[] { bx.SUCCESS, bx.ERROR_PROVIDER, bx.ERROR_REQUEST, bx.ERROR_FAILED };
    }
    
    private bx(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
