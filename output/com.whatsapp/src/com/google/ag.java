// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

enum ag
{
    public static final ag AGGREGATES_ONLY;
    public static final ag ALL_SYMBOLS;
    public static final ag TYPES_ONLY;
    private static final ag[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "\u0007V\u0002HW\u0001P\u0011_A\u0019^\u000bVK".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0012';
                    break;
                }
                case 0: {
                    c2 = 'F';
                    break;
                }
                case 1: {
                    c2 = '\u0011';
                    break;
                }
                case 2: {
                    c2 = 'E';
                    break;
                }
                case 3: {
                    c2 = '\u001a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0012H\u0015_A\u0019^\u000bVK".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0012';
                    break;
                }
                case 0: {
                    c4 = 'F';
                    break;
                }
                case 1: {
                    c4 = '\u0011';
                    break;
                }
                case 2: {
                    c4 = 'E';
                    break;
                }
                case 3: {
                    c4 = '\u001a';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0007]\tEA\u001f\\\u0007U^\u0015".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0012';
                    break;
                }
                case 0: {
                    c6 = 'F';
                    break;
                }
                case 1: {
                    c6 = '\u0011';
                    break;
                }
                case 2: {
                    c6 = 'E';
                    break;
                }
                case 3: {
                    c6 = '\u001a';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
        TYPES_ONLY = new ag(ag.z[1], 0);
        AGGREGATES_ONLY = new ag(ag.z[0], 1);
        ALL_SYMBOLS = new ag(ag.z[2], 2);
        a = new ag[] { ag.TYPES_ONLY, ag.AGGREGATES_ONLY, ag.ALL_SYMBOLS };
    }
    
    private ag(final String s, final int n) {
    }
}
