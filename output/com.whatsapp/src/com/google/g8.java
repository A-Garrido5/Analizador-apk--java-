// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public final class g8 extends gj
{
    static final int[][] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private int b;
    
    static {
        f = new int[] { 6, 8, 10, 12, 14 };
        e = new int[] { 1, 1, 1, 1 };
        d = new int[] { 1, 1, 3 };
        c = new int[][] { { 1, 1, 3, 3, 1 }, { 3, 1, 1, 1, 3 }, { 1, 3, 1, 1, 3 }, { 3, 3, 1, 1, 1 }, { 1, 1, 3, 1, 3 }, { 3, 1, 3, 1, 1 }, { 1, 3, 3, 1, 1 }, { 1, 1, 1, 3, 3 }, { 3, 1, 1, 3, 1 }, { 1, 3, 1, 3, 1 } };
    }
    
    public g8() {
        this.b = -1;
    }
    
    private static int a(final int[] array) {
        final boolean a = gj.a;
        float n = 0.38f;
        int n2 = -1;
        final int length = g8.c.length;
        int i = 0;
        while (i < length) {
            float a2 = gj.a(array, g8.c[i], 0.78f);
            if (a2 < n) {
                n2 = i;
            }
            else {
                a2 = n;
            }
            ++i;
            if (a) {
                break;
            }
            n = a2;
        }
        if (n2 >= 0) {
            return n2;
        }
        throw fv.a();
    }
    
    private void a(final hN hn, final int n) {
        final boolean a = gj.a;
        int n2 = 10 * this.b;
        if (n2 >= n) {
            n2 = n;
        }
        int n3 = n - 1;
        while (n2 > 0 && n3 >= 0 && (!hn.a(n3) || a)) {
            --n2;
            --n3;
            if (a) {
                break;
            }
        }
        if (n2 != 0) {
            throw fv.a();
        }
    }
    
    private static void a(final hN hn, final int n, final int n2, final StringBuilder sb) {
        final boolean a = gj.a;
        final int[] array = new int[10];
        final int[] array2 = new int[5];
        final int[] array3 = new int[5];
        int i = n;
        while (i < n2) {
            gj.b(hn, i, array);
            int j = 0;
            while (j < 5) {
                final int n3 = j * 2;
                array2[j] = array[n3];
                array3[j] = array[n3 + 1];
                ++j;
                if (a) {
                    break;
                }
            }
            sb.append((char)(48 + a(array2)));
            sb.append((char)(48 + a(array3)));
            final int length = array.length;
            int k = 0;
            while (k < length) {
                i += array[k];
                ++k;
                if (a) {
                    break;
                }
            }
            if (a) {
                break;
            }
        }
    }
    
    private static int[] a(final hN hn, int i, final int[] array) {
        final boolean a = gj.a;
        final int length = array.length;
        final int[] array2 = new int[length];
        final int b = hn.b();
        int n = i;
        int n2 = 0;
        boolean b2 = false;
        while (i < b) {
            Label_0165: {
                if (b2 ^ hn.a(i)) {
                    ++array2[n2];
                    if (!a) {
                        break Label_0165;
                    }
                }
                Label_0151: {
                    if (n2 == length - 1) {
                        if (gj.a(array2, array, 0.78f) < 0.38f) {
                            return new int[] { n, i };
                        }
                        n += array2[0] + array2[1];
                        System.arraycopy(array2, 2, array2, 0, length - 2);
                        array2[length - 1] = (array2[length - 2] = 0);
                        --n2;
                        if (!a) {
                            break Label_0151;
                        }
                    }
                    ++n2;
                }
                array2[n2] = 1;
                b2 = !b2;
            }
            ++i;
            if (a) {
                break;
            }
        }
        throw fv.a();
    }
    
    private static int b(final hN hn) {
        final int b = hn.b();
        final int d = hn.d(0);
        if (d == b) {
            throw fv.a();
        }
        return d;
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final boolean a = gj.a;
        final int[] c = this.c(hn);
        final int[] a2 = this.a(hn);
        final StringBuilder sb = new StringBuilder(20);
        a(hn, c[1], a2[0], sb);
        final String string = sb.toString();
        int[] f = null;
        if (map != null) {
            f = map.get(bj.ALLOWED_LENGTHS);
        }
        if (f == null) {
            f = g8.f;
        }
        final int length = string.length();
        final int length2 = f.length;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < length2) {
            final int n4 = f[i];
            if (length == n4) {
                n3 = 1;
                if (!a) {
                    break;
                }
            }
            if (n4 > n2) {
                n2 = n4;
            }
            final int n5 = i + 1;
            if (a) {
                break;
            }
            i = n5;
        }
        int n6 = n3;
        if (n6 == 0 && length > n2) {
            n6 = 1;
        }
        if (n6 == 0) {
            throw fD.a();
        }
        return new aU(string, null, new cs[] { new cs(c[1], n), new cs(a2[0], n) }, d3.ITF);
    }
    
    int[] a(final hN hn) {
        hn.a();
        try {
            final int[] a = a(hn, b(hn), g8.d);
            this.a(hn, a[0]);
            final int n = a[0];
            a[0] = hn.b() - a[1];
            a[1] = hn.b() - n;
            return a;
        }
        finally {
            hn.a();
        }
    }
    
    int[] c(final hN hn) {
        final int[] a = a(hn, b(hn), g8.e);
        this.b = (a[1] - a[0]) / 4;
        this.a(hn, a[0]);
        return a;
    }
}
