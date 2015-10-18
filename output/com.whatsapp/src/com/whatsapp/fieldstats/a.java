// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a
{
    public static final a CONTACTS;
    public static final a KEYS;
    public static final a MESSAGES;
    private static final a[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "~NB2QtNB";
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
                        c2 = '\u0010';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\u000b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0011';
                        break;
                    }
                    case 3: {
                        c2 = 'a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "pD_5Qp_B";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "xNH2";
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
        MESSAGES = new a(a.z[0], 0, 1);
        CONTACTS = new a(a.z[1], 1, 2);
        KEYS = new a(a.z[2], 2, 3);
        b = new a[] { a.MESSAGES, a.CONTACTS, a.KEYS };
    }
    
    private a(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
