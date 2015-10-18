// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bi
{
    public static final bi ERROR_UNKNOWN;
    public static final bi OK;
    private static final bi[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[2];
        String s = "un";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'D';
                        break;
                    }
                    case 0: {
                        c2 = ':';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = '\"';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u007fwp_\u0016epl[\nurl";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        OK = new bi(bi.z[0], 0, 1);
        ERROR_UNKNOWN = new bi(bi.z[1], 1, 2);
        a = new bi[] { bi.OK, bi.ERROR_UNKNOWN };
    }
    
    private bi(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
