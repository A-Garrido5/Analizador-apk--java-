// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum af
{
    public static final af BROADCAST;
    public static final af GROUP;
    public static final af INDIVIDUAL;
    private static final af[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0007\u0006sy`\u0007\fbqz";
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
                        c2 = '6';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\f\u001axqr\r\tdd";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\t\u001axef";
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
        INDIVIDUAL = new af(af.z[0], 0, 1);
        GROUP = new af(af.z[2], 1, 2);
        BROADCAST = new af(af.z[1], 2, 3);
        a = new af[] { af.INDIVIDUAL, af.GROUP, af.BROADCAST };
    }
    
    private af(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
