// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Method;

class hk implements cP
{
    private static final String[] z;
    protected final Method a;
    protected final Method b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Class g;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "\r\u000e{m]\u001a\u000enK]\u000e-fZT\u000eC&\u001f[\u000b\u0007cZ\\J\u0004a\u001fYJ\u0018fQ_\u001f\u0007nM\u0018\f\u0002jS\\D".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '8';
                    break;
                }
                case 0: {
                    c2 = 'j';
                    break;
                }
                case 1: {
                    c2 = 'k';
                    break;
                }
                case 2: {
                    c2 = '\u000f';
                    break;
                }
                case 3: {
                    c2 = '?';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u000b\u000fkm]\u001a\u000enK]\u000e-fZT\u000eC&\u001f[\u000b\u0007cZ\\J\u0004a\u001fYJ\u0018fQ_\u001f\u0007nM\u0018\f\u0002jS\\D".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '8';
                    break;
                }
                case 0: {
                    c4 = 'j';
                    break;
                }
                case 1: {
                    c4 = 'k';
                    break;
                }
                case 2: {
                    c4 = '\u000f';
                    break;
                }
                case 3: {
                    c4 = '?';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\r\u000e{".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '8';
                    break;
                }
                case 0: {
                    c6 = 'j';
                    break;
                }
                case 1: {
                    c6 = 'k';
                    break;
                }
                case 2: {
                    c6 = '\u000f';
                    break;
                }
                case 3: {
                    c6 = '?';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0002\n|".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '8';
                    break;
                }
                case 0: {
                    c8 = 'j';
                    break;
                }
                case 1: {
                    c8 = 'k';
                    break;
                }
                case 2: {
                    c8 = '\u000f';
                    break;
                }
                case 3: {
                    c8 = '?';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0019\u000e{".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '8';
                    break;
                }
                case 0: {
                    c10 = 'j';
                    break;
                }
                case 1: {
                    c10 = 'k';
                    break;
                }
                case 2: {
                    c10 = '\u000f';
                    break;
                }
                case 3: {
                    c10 = '?';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\r\u000e{".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '8';
                    break;
                }
                case 0: {
                    c12 = 'j';
                    break;
                }
                case 1: {
                    c12 = 'k';
                    break;
                }
                case 2: {
                    c12 = '\u000f';
                    break;
                }
                case 3: {
                    c12 = '?';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\t\u0007j^J".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '8';
                    break;
                }
                case 0: {
                    c14 = 'j';
                    break;
                }
                case 1: {
                    c14 = 'k';
                    break;
                }
                case 2: {
                    c14 = '\u000f';
                    break;
                }
                case 3: {
                    c14 = '?';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\u0002\n|".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '8';
                    break;
                }
                case 0: {
                    c16 = 'j';
                    break;
                }
                case 1: {
                    c16 = 'k';
                    break;
                }
                case 2: {
                    c16 = '\u000f';
                    break;
                }
                case 3: {
                    c16 = '?';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\r\u000e{m]\u001a\u000enK]\u000e-fZT\u000e8fE]BB/\\Y\u0006\u0007j[\u0018\u0005\u0005/^\u0018\u0019\u0002aXM\u0006\n}\u001f^\u0003\u000ec[\u0016".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '8';
                    break;
                }
                case 0: {
                    c18 = 'j';
                    break;
                }
                case 1: {
                    c18 = 'k';
                    break;
                }
                case 2: {
                    c18 = '\u000f';
                    break;
                }
                case 3: {
                    c18 = '?';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "\u0004\u000ex}M\u0003\u0007kZJ,\u0004}yQ\u000f\u0007k\u0017\u0011J\bnST\u000f\u000f/PVJ\n/QW\u0004FBZK\u0019\nhZ\u0018\u001e\u0012\u007fZ\u0016".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '8';
                    break;
                }
                case 0: {
                    c20 = 'j';
                    break;
                }
                case 1: {
                    c20 = 'k';
                    break;
                }
                case 2: {
                    c20 = '\u000f';
                    break;
                }
                case 3: {
                    c20 = '?';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        z = z2;
    }
    
    hk(final hg hg, final String s, final Class clazz, final Class clazz2) {
        this.b = dS.b(clazz, hk.z[5] + s, new Class[0]);
        this.f = dS.b(clazz2, hk.z[2] + s, new Class[0]);
        this.g = this.b.getReturnType();
        this.a = dS.b(clazz2, hk.z[4] + s, new Class[] { this.g });
        this.e = dS.b(clazz, hk.z[3] + s, new Class[0]);
        this.d = dS.b(clazz2, hk.z[7] + s, new Class[0]);
        this.c = dS.b(clazz2, hk.z[6] + s, new Class[0]);
    }
    
    @Override
    public a8 a() {
        throw new UnsupportedOperationException(hk.z[9]);
    }
    
    @Override
    public Object a(final dS ds, final int n) {
        throw new UnsupportedOperationException(hk.z[0]);
    }
    
    @Override
    public void a(final fp fp, final Object o) {
        dS.a(this.a, fp, new Object[] { o });
    }
    
    @Override
    public boolean a(final dS ds) {
        return (boolean)dS.a(this.e, ds, new Object[0]);
    }
    
    @Override
    public boolean a(final fp fp) {
        return (boolean)dS.a(this.d, fp, new Object[0]);
    }
    
    @Override
    public Object b(final dS ds) {
        return dS.a(this.b, ds, new Object[0]);
    }
    
    @Override
    public Object b(final fp fp) {
        return dS.a(this.f, fp, new Object[0]);
    }
    
    @Override
    public void b(final fp fp, final Object o) {
        throw new UnsupportedOperationException(hk.z[1]);
    }
    
    @Override
    public int c(final dS ds) {
        throw new UnsupportedOperationException(hk.z[8]);
    }
}
