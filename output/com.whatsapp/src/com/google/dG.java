// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum dG
{
    public static final dG AUTO;
    public static final dG BYTE;
    public static final dG NUMERIC;
    public static final dG TEXT;
    public static boolean a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "I8-\u0006";
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
                        c2 = 'H';
                        break;
                    }
                    case 0: {
                        c2 = '\b';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = 'y';
                        break;
                    }
                    case 3: {
                        c2 = 'I';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "J4-\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\\(!\u001d";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "F84\f\u001aA.";
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
        AUTO = new dG(dG.z[0], 0);
        TEXT = new dG(dG.z[2], 1);
        BYTE = new dG(dG.z[1], 2);
        NUMERIC = new dG(dG.z[3], 3);
    }
    
    private dG(final String s, final int n) {
    }
}
