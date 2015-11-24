// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum g_
{
    public static final g_ FIXED_LINE;
    public static final g_ FIXED_LINE_OR_MOBILE;
    public static final g_ MOBILE;
    public static final g_ PAGER;
    public static final g_ PERSONAL_NUMBER;
    public static final g_ PREMIUM_RATE;
    public static final g_ SHARED_COST;
    public static final g_ TOLL_FREE;
    public static final g_ UAN;
    public static final g_ UNKNOWN;
    public static final g_ VOICEMAIL;
    public static final g_ VOIP;
    private static final g_[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[12];
        String s = "G\bu\n_P\u001fw\u0017I@";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0332:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = '4';
                        break;
                    }
                    case 3: {
                        c2 = 'X';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Y\u000fv\u0011VQ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "B\u000f}\u001b_Y\u0001}\u0014";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "R\tl\u001d^K\f}\u0016_K\u000ff\u0007W[\u0002}\u0014_";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "A\u0001z";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "D\u0012q\u0015SA\rk\n[@\u0005";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "R\tl\u001d^K\f}\u0016_";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "A\u000e\u007f\u0016UC\u000e";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "B\u000f}\b";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "@\u000fx\u0014ER\u0012q\u001d";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "D\u0005f\u000bUZ\u0001x\u0007TA\rv\u001dH";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "D\u0001s\u001dH";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    break Label_0332;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        FIXED_LINE = new g_(g_.z[6], 0);
        MOBILE = new g_(g_.z[1], 1);
        FIXED_LINE_OR_MOBILE = new g_(g_.z[3], 2);
        TOLL_FREE = new g_(g_.z[9], 3);
        PREMIUM_RATE = new g_(g_.z[5], 4);
        SHARED_COST = new g_(g_.z[0], 5);
        VOIP = new g_(g_.z[8], 6);
        PERSONAL_NUMBER = new g_(g_.z[10], 7);
        PAGER = new g_(g_.z[11], 8);
        UAN = new g_(g_.z[4], 9);
        VOICEMAIL = new g_(g_.z[2], 10);
        UNKNOWN = new g_(g_.z[7], 11);
        a = new g_[] { g_.FIXED_LINE, g_.MOBILE, g_.FIXED_LINE_OR_MOBILE, g_.TOLL_FREE, g_.PREMIUM_RATE, g_.SHARED_COST, g_.VOIP, g_.PERSONAL_NUMBER, g_.PAGER, g_.UAN, g_.VOICEMAIL, g_.UNKNOWN };
    }
    
    private g_(final String s, final int n) {
    }
}
