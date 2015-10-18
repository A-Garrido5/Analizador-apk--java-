// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Method;

class b3 implements cP
{
    private static final String[] z;
    protected final Method a;
    protected final Method b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;
    protected final Class h;
    protected final Method i;
    protected final Method j;
    
    static {
        final String[] z2 = new String[16];
        final char[] charArray = "W$1x\u0012Z)&\u0016R\u001f&#R\u0017Z!bQ\u0015\u001f$bL\u001eO #J\u001e[e$W\u001eS!l".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '{';
                    break;
                }
                case 0: {
                    c2 = '?';
                    break;
                }
                case 1: {
                    c2 = 'E';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '>';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "X 6".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '{';
                    break;
                }
                case 0: {
                    c4 = '?';
                    break;
                }
                case 1: {
                    c4 = 'E';
                    break;
                }
                case 2: {
                    c4 = 'B';
                    break;
                }
                case 3: {
                    c4 = '>';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "X 6".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '{';
                    break;
                }
                case 0: {
                    c6 = '?';
                    break;
                }
                case 1: {
                    c6 = 'E';
                    break;
                }
                case 2: {
                    c6 = 'B';
                    break;
                }
                case 3: {
                    c6 = '>';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "|*7P\u000f".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '{';
                    break;
                }
                case 0: {
                    c8 = '?';
                    break;
                }
                case 1: {
                    c8 = 'E';
                    break;
                }
                case 2: {
                    c8 = 'B';
                    break;
                }
                case 3: {
                    c8 = '>';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "X 6".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '{';
                    break;
                }
                case 0: {
                    c10 = '?';
                    break;
                }
                case 1: {
                    c10 = 'E';
                    break;
                }
                case 2: {
                    c10 = 'B';
                    break;
                }
                case 3: {
                    c10 = '>';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "s,1J".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '{';
                    break;
                }
                case 0: {
                    c12 = '?';
                    break;
                }
                case 1: {
                    c12 = 'E';
                    break;
                }
                case 2: {
                    c12 = 'B';
                    break;
                }
                case 3: {
                    c12 = '>';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "|*7P\u000f".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = '{';
                    break;
                }
                case 0: {
                    c14 = '?';
                    break;
                }
                case 1: {
                    c14 = 'E';
                    break;
                }
                case 2: {
                    c14 = 'B';
                    break;
                }
                case 3: {
                    c14 = '>';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "\\)'_\t".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = '{';
                    break;
                }
                case 0: {
                    c16 = '?';
                    break;
                }
                case 1: {
                    c16 = 'E';
                    break;
                }
                case 2: {
                    c16 = 'B';
                    break;
                }
                case 3: {
                    c16 = '>';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "s,1J".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = '{';
                    break;
                }
                case 0: {
                    c18 = '?';
                    break;
                }
                case 1: {
                    c18 = 'E';
                    break;
                }
                case 2: {
                    c18 = 'B';
                    break;
                }
                case 3: {
                    c18 = '>';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "X 6".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = '{';
                    break;
                }
                case 0: {
                    c20 = '?';
                    break;
                }
                case 1: {
                    c20 = 'E';
                    break;
                }
                case 2: {
                    c20 = 'B';
                    break;
                }
                case 3: {
                    c20 = '>';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "L 6".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = '{';
                    break;
                }
                case 0: {
                    c22 = '?';
                    break;
                }
                case 1: {
                    c22 = 'E';
                    break;
                }
                case 2: {
                    c22 = 'B';
                    break;
                }
                case 3: {
                    c22 = '>';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "X 6".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = '{';
                    break;
                }
                case 0: {
                    c24 = '?';
                    break;
                }
                case 1: {
                    c24 = 'E';
                    break;
                }
                case 2: {
                    c24 = 'B';
                    break;
                }
                case 3: {
                    c24 = '>';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "^!&".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = '{';
                    break;
                }
                case 0: {
                    c26 = '?';
                    break;
                }
                case 1: {
                    c26 = 'E';
                    break;
                }
                case 2: {
                    c26 = 'B';
                    break;
                }
                case 3: {
                    c26 = '>';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "X 6".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = '{';
                    break;
                }
                case 0: {
                    c28 = '?';
                    break;
                }
                case 1: {
                    c28 = 'E';
                    break;
                }
                case 2: {
                    c28 = 'B';
                    break;
                }
                case 3: {
                    c28 = '>';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "W$1x\u0012Z)&\u0016R\u001f&#R\u0017Z!bQ\u0015\u001f$bL\u001eO #J\u001e[e$W\u001eS!l".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = '{';
                    break;
                }
                case 0: {
                    c30 = '?';
                    break;
                }
                case 1: {
                    c30 = 'E';
                    break;
                }
                case 2: {
                    c30 = 'B';
                    break;
                }
                case 3: {
                    c30 = '>';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        final char[] charArray16 = "Q 5|\u000eV)&[\ty*0x\u0012Z)&\u0016R\u001f&#R\u0017Z!bQ\u0015\u001f$bP\u0014Qh\u000f[\bL$%[[K<2[U".toCharArray();
        for (int length12 = charArray16.length, n16 = 0; length12 > n16; ++n16) {
            final char c31 = charArray16[n16];
            char c32 = '\0';
            switch (n16 % 5) {
                default: {
                    c32 = '{';
                    break;
                }
                case 0: {
                    c32 = '?';
                    break;
                }
                case 1: {
                    c32 = 'E';
                    break;
                }
                case 2: {
                    c32 = 'B';
                    break;
                }
                case 3: {
                    c32 = '>';
                    break;
                }
            }
            charArray16[n16] = (char)(c32 ^ c31);
        }
        z2[15] = new String(charArray16).intern();
        z = z2;
    }
    
    b3(final hg hg, final String s, final Class clazz, final Class clazz2) {
        final boolean b = dt.b;
        this.b = dS.b(clazz, b3.z[9] + s + b3.z[5], new Class[0]);
        this.j = dS.b(clazz2, b3.z[13] + s + b3.z[8], new Class[0]);
        this.i = dS.b(clazz, b3.z[2] + s, new Class[] { Integer.TYPE });
        this.e = dS.b(clazz2, b3.z[4] + s, new Class[] { Integer.TYPE });
        this.h = this.i.getReturnType();
        this.d = dS.b(clazz2, b3.z[10] + s, new Class[] { Integer.TYPE, this.h });
        this.f = dS.b(clazz2, b3.z[12] + s, new Class[] { this.h });
        this.c = dS.b(clazz, b3.z[11] + s + b3.z[6], new Class[0]);
        this.g = dS.b(clazz2, b3.z[1] + s + b3.z[3], new Class[0]);
        this.a = dS.b(clazz2, b3.z[7] + s, new Class[0]);
        if (di.a != 0) {
            boolean b2 = false;
            if (!b) {
                b2 = true;
            }
            dt.b = b2;
        }
    }
    
    @Override
    public a8 a() {
        throw new UnsupportedOperationException(b3.z[15]);
    }
    
    @Override
    public Object a(final dS ds, final int n) {
        return dS.a(this.i, ds, new Object[] { n });
    }
    
    public void a(final fp fp) {
        dS.a(this.a, fp, new Object[0]);
    }
    
    @Override
    public void a(final fp fp, final Object o) {
        final boolean b = dt.b;
        this.a(fp);
        final Iterator<Object> iterator = ((List)o).iterator();
        while (iterator.hasNext()) {
            this.b(fp, iterator.next());
            if (b) {
                break;
            }
        }
    }
    
    @Override
    public boolean a(final dS ds) {
        throw new UnsupportedOperationException(b3.z[0]);
    }
    
    @Override
    public boolean a(final fp fp) {
        throw new UnsupportedOperationException(b3.z[14]);
    }
    
    @Override
    public Object b(final dS ds) {
        return dS.a(this.b, ds, new Object[0]);
    }
    
    @Override
    public Object b(final fp fp) {
        return dS.a(this.j, fp, new Object[0]);
    }
    
    @Override
    public void b(final fp fp, final Object o) {
        dS.a(this.f, fp, new Object[] { o });
    }
    
    @Override
    public int c(final dS ds) {
        return (int)dS.a(this.c, ds, new Object[0]);
    }
}
