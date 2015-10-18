// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum b6
{
    public static final b6 FROM_DEFAULT_COUNTRY;
    public static final b6 FROM_NUMBER_WITHOUT_PLUS_SIGN;
    public static final b6 FROM_NUMBER_WITH_IDD;
    public static final b6 FROM_NUMBER_WITH_PLUS_SIGN;
    private static final b6[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "4Z;\u000b\u007f<]9\u0004e W#\u000ft:W$\nu!W'\u000fg<";
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
                        c2 = ' ';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "4Z;\u000b\u007f<]9\u0004e W#\u000ft:W=\u0002d";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "4Z;\u000b\u007f<]9\u0004e W#\u000ft:G!\u0012\u007f\"D!\u0015\u007f!A3\b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "4Z;\u000b\u007f6M2\u0007u>\\+\u0005o'F \u0014y";
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
        FROM_NUMBER_WITH_PLUS_SIGN = new b6(b6.z[0], 0);
        FROM_NUMBER_WITH_IDD = new b6(b6.z[1], 1);
        FROM_NUMBER_WITHOUT_PLUS_SIGN = new b6(b6.z[2], 2);
        FROM_DEFAULT_COUNTRY = new b6(b6.z[3], 3);
        a = new b6[] { b6.FROM_NUMBER_WITH_PLUS_SIGN, b6.FROM_NUMBER_WITH_IDD, b6.FROM_NUMBER_WITHOUT_PLUS_SIGN, b6.FROM_DEFAULT_COUNTRY };
    }
    
    private b6(final String s, final int n) {
    }
}
