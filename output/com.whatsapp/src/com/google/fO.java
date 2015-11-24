// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum fO
{
    public static final fO FORCE_NONE;
    public static final fO FORCE_RECTANGLE;
    public static final fO FORCE_SQUARE;
    public static int b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u001b(_-\u0012\u0002)B \u0012";
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
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = 'g';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = 'n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001b(_-\u0012\u00025H-\u0003\u001c)J\"\u0012";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001b(_-\u0012\u00024\\;\u0016\u000f\"";
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
        FORCE_NONE = new fO(fO.z[0], 0);
        FORCE_SQUARE = new fO(fO.z[2], 1);
        FORCE_RECTANGLE = new fO(fO.z[1], 2);
    }
    
    private fO(final String s, final int n) {
    }
}
