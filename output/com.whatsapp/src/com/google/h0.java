// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum h0
{
    public static final h0 INVALID_COUNTRY_CODE;
    public static final h0 IS_POSSIBLE;
    public static final h0 TOO_LONG;
    public static final h0 TOO_SHORT;
    private static final h0[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0005U`\t\u0017\u001eTh";
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
                        c2 = '[';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = '/';
                        break;
                    }
                    case 3: {
                        c2 = 'V';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0018Ty\u0017\u0017\u0018^p\u0015\u0014\u0004T{\u0004\u0002\u000eY`\u0012\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0005U`\t\b\u0019U}\u0002";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0018Ip\u0006\u0014\u0002If\u0014\u0017\u0014";
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
        IS_POSSIBLE = new h0(h0.z[3], 0);
        INVALID_COUNTRY_CODE = new h0(h0.z[1], 1);
        TOO_SHORT = new h0(h0.z[2], 2);
        TOO_LONG = new h0(h0.z[0], 3);
        a = new h0[] { h0.IS_POSSIBLE, h0.INVALID_COUNTRY_CODE, h0.TOO_SHORT, h0.TOO_LONG };
    }
    
    private h0(final String s, final int n) {
    }
}
