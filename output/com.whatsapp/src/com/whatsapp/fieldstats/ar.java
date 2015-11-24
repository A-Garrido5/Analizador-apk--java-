// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ar
{
    public static final ar EXISTING;
    public static final ar FROM_LIMBO;
    public static final ar NEW;
    public static final ar WIPED;
    private static final ar[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "\"K\\z\u0005";
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
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = 'u';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = '\f';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "3PCr\u001e9KA}\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ";G[";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "0ZEl\u0015<LK";
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
        NEW = new ar(ar.z[2], 0, 1);
        EXISTING = new ar(ar.z[3], 1, 2);
        FROM_LIMBO = new ar(ar.z[1], 2, 3);
        WIPED = new ar(ar.z[0], 3, 4);
        a = new ar[] { ar.NEW, ar.EXISTING, ar.FROM_LIMBO, ar.WIPED };
    }
    
    private ar(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
