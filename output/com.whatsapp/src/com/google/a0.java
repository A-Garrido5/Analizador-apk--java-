// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum a0
{
    public static final a0 EXACT_GROUPING;
    public static final a0 POSSIBLE;
    public static final a0 STRICT_GROUPING;
    public static final a0 VALID;
    private static final a0[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0018GODu";
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
                        c2 = '1';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000b^BNe\u0011AQBd\u001eOMJ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001eIP^x\fJF";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001dRQDr\u001aYD_~\u001bVJCv";
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
        POSSIBLE = new a0(a0.z[2], 0)
        {
            a2(final String s, final int n) {
            }
            
            @Override
            boolean a(final c_ c_, final String s, final e6 e6) {
                return e6.d(c_);
            }
        };
        VALID = new a0(a0.z[0], 1)
        {
            a3(final String s, final int n) {
            }
            
            @Override
            boolean a(final c_ c_, final String s, final e6 e6) {
                return e6.b(c_) && cw.a(c_, s, e6) && cw.a(c_, e6);
            }
        };
        STRICT_GROUPING = new a0(a0.z[3], 2)
        {
            a5(final String s, final int n) {
            }
            
            @Override
            boolean a(final c_ c_, final String s, final e6 e6) {
                return e6.b(c_) && cw.a(c_, s, e6) && !cw.a(s) && cw.a(c_, e6) && cw.a(c_, s, e6, new de(this));
            }
        };
        EXACT_GROUPING = new a0(a0.z[1], 3)
        {
            ae(final String s, final int n) {
            }
            
            @Override
            boolean a(final c_ c_, final String s, final e6 e6) {
                return e6.b(c_) && cw.a(c_, s, e6) && !cw.a(s) && cw.a(c_, e6) && cw.a(c_, s, e6, new f0(this));
            }
        };
        a = new a0[] { a0.POSSIBLE, a0.VALID, a0.STRICT_GROUPING, a0.EXACT_GROUPING };
    }
    
    private a0(final String s, final int n) {
    }
    
    a0(final String s, final int n, final b0 b0) {
        this(s, n);
    }
    
    abstract boolean a(final c_ p0, final String p1, final e6 p2);
}
