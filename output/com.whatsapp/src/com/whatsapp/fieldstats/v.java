// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum v
{
    public static final v BB_ALTERNATE_APN;
    public static final v BB_BES;
    public static final v BB_BIS;
    public static final v DIRECT;
    public static final v WAP;
    private static final v[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[5];
        String s = "QTkUeGSfZhGSkUy]";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = '\u0016';
                        break;
                    }
                    case 2: {
                        c2 = '4';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "W_fQjG";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "QTkV`@";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "QTkVl@";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "DWd";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        DIRECT = new v(v.z[1], 0, 0);
        WAP = new v(v.z[4], 1, 1);
        BB_BIS = new v(v.z[2], 2, 2);
        BB_BES = new v(v.z[3], 3, 3);
        BB_ALTERNATE_APN = new v(v.z[0], 4, 4);
        a = new v[] { v.DIRECT, v.WAP, v.BB_BIS, v.BB_BES, v.BB_ALTERNATE_APN };
    }
    
    private v(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
