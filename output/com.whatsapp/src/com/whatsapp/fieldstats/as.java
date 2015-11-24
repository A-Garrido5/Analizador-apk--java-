// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum as
{
    public static final as CORRUPT;
    public static final as MANUAL;
    public static final as RESUME;
    private static final as[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = ",7^O\u001f-";
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
                        c2 = '^';
                        break;
                    }
                    case 0: {
                        c2 = 'a';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = '\u0010';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "33CO\u0013$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\"9BH\u000b1\"";
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
        MANUAL = new as(as.z[0], 0, 1);
        RESUME = new as(as.z[1], 1, 2);
        CORRUPT = new as(as.z[2], 2, 3);
        a = new as[] { as.MANUAL, as.RESUME, as.CORRUPT };
    }
    
    private as(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
