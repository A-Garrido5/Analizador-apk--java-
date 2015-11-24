// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ao
{
    public static final ao BKG_FETCH;
    public static final ao BKG_NOTIFICATION;
    public static final ao USER;
    private static final ao[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = ")~\nI";
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
                        c2 = '|';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ">f\bDh9y\fS";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ">f\bD`3y\u0006]g?l\u001bRa2";
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
        USER = new ao(ao.z[0], 0, 1);
        BKG_NOTIFICATION = new ao(ao.z[2], 1, 2);
        BKG_FETCH = new ao(ao.z[1], 2, 3);
        b = new ao[] { ao.USER, ao.BKG_NOTIFICATION, ao.BKG_FETCH };
    }
    
    private ao(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
