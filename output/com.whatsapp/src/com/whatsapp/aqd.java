// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

enum aqd
{
    public static final aqd INCOMING;
    public static final aqd MISSED;
    public static final aqd OUTGOING;
    public static final aqd UNKNOWN;
    private static final aqd[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "V\u001bHs@P\u0000[";
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
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "L\u0000Wz@N\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "T\u0007OgJ]";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "P\u0000_{BP\u0000[";
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
        OUTGOING = new aqd(aqd.z[0], 0);
        INCOMING = new aqd(aqd.z[3], 1);
        MISSED = new aqd(aqd.z[2], 2);
        UNKNOWN = new aqd(aqd.z[1], 3);
        a = new aqd[] { aqd.OUTGOING, aqd.INCOMING, aqd.MISSED, aqd.UNKNOWN };
    }
    
    private aqd(final String s, final int n) {
    }
}
