// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

enum cC
{
    public static final cC ALPHA;
    public static final cC ALPHA_SHIFT;
    public static final cC LOWER;
    public static final cC MIXED;
    public static final cC PUNCT;
    public static final cC PUNCT_SHIFT;
    private static final cC[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "g:y?;";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = ')';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "g:y?;y%a><r";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "k?q2>";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "v#g4.y%a><r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "v#g4.";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "j9~2(";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ALPHA = new cC(cC.z[0], 0);
        LOWER = new cC(cC.z[5], 1);
        MIXED = new cC(cC.z[2], 2);
        PUNCT = new cC(cC.z[4], 3);
        ALPHA_SHIFT = new cC(cC.z[1], 4);
        PUNCT_SHIFT = new cC(cC.z[3], 5);
        a = new cC[] { cC.ALPHA, cC.LOWER, cC.MIXED, cC.PUNCT, cC.ALPHA_SHIFT, cC.PUNCT_SHIFT };
    }
    
    private cC(final String s, final int n) {
    }
}
