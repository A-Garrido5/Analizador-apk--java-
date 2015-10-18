// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class g5 extends gk
{
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[][] m;
    private static final int[] n;
    private static final int[] o;
    private final List l;
    private final List p;
    
    static {
        j = new int[] { 1, 10, 34, 70, 126 };
        i = new int[] { 4, 20, 48, 81 };
        o = new int[] { 0, 161, 961, 2015, 2715 };
        n = new int[] { 0, 336, 1036, 1516 };
        h = new int[] { 8, 6, 4, 3, 1 };
        k = new int[] { 2, 4, 6, 8 };
        m = new int[][] { { 3, 8, 2, 1 }, { 3, 5, 5, 1 }, { 3, 3, 7, 1 }, { 3, 1, 9, 1 }, { 2, 7, 4, 1 }, { 2, 5, 6, 1 }, { 2, 3, 8, 1 }, { 1, 5, 7, 1 }, { 1, 3, 9, 1 } };
    }
    
    public g5() {
        this.l = new ArrayList();
        this.p = new ArrayList();
    }
    
    private static aU a(final ez ez, final ez ez2) {
        final int c = e0.c;
        final String value = String.valueOf(4537077L * ez.a() + ez2.a());
        final StringBuilder sb = new StringBuilder(14);
        int i = 13 - value.length();
        while (i > 0) {
            sb.append('0');
            --i;
            if (c != 0) {
                break;
            }
        }
        sb.append(value);
        int j = 0;
        int n = 0;
        while (j < 13) {
            int n2 = -48 + sb.charAt(j);
            if ((j & 0x1) == 0x0) {
                n2 *= 3;
            }
            n += n2;
            final int n3 = j + 1;
            if (c != 0) {
                break;
            }
            j = n3;
        }
        int n4 = 10 - n % 10;
        if (n4 == 10) {
            n4 = 0;
        }
        sb.append(n4);
        final cs[] a = ez.d().a();
        final cs[] a2 = ez2.d().a();
        return new aU(String.valueOf(sb.toString()), null, new cs[] { a[0], a[1], a2[0], a2[1] }, d3.RSS_14);
    }
    
    private bk a(final hN hn, final int n, final boolean b, final int[] array) {
        final int c = e0.c;
        final boolean a = hn.a(array[0]);
        int n2 = -1 + array[0];
        while (n2 >= 0 && (a ^ hn.a(n2))) {
            --n2;
            if (c != 0) {
                break;
            }
        }
        final int n3 = n2 + 1;
        final int n4 = array[0] - n3;
        final int[] f = this.f();
        System.arraycopy(f, 0, f, 1, -1 + f.length);
        f[0] = n4;
        final int a2 = gk.a(f, g5.m);
        int n5 = array[1];
        int n6;
        if (b) {
            n6 = -1 + hn.b() - n3;
            n5 = -1 + hn.b() - n5;
        }
        else {
            n6 = n3;
        }
        return new bk(a2, new int[] { n3, array[1] }, n6, n5, n);
    }
    
    private e0 a(final hN hn, final bk bk, final boolean b) {
        final int c = e0.c;
        final int[] e = this.e();
        e[1] = (e[0] = 0);
        e[3] = (e[2] = 0);
        e[5] = (e[4] = 0);
        e[7] = (e[6] = 0);
        Label_0140: {
            if (b) {
                gj.a(hn, bk.c()[0], e);
                if (c == 0) {
                    break Label_0140;
                }
            }
            gj.b(hn, 1 + bk.c()[1], e);
            int i = 0;
            int n = -1 + e.length;
            while (i < n) {
                final int n2 = e[i];
                e[i] = e[n];
                e[n] = n2;
                ++i;
                --n;
                if (c != 0) {
                    break;
                }
            }
        }
        int n3;
        if (b) {
            n3 = 16;
        }
        else {
            n3 = 15;
        }
        final float n4 = gk.a(e) / n3;
        final int[] c2 = this.c();
        final int[] b2 = this.b();
        final float[] d = this.d();
        final float[] a = this.a();
        int j = 0;
        while (j < e.length) {
            final float n5 = e[j] / n4;
            int n6 = (int)(0.5f + n5);
            Label_0239: {
                if (n6 < 1) {
                    n6 = 1;
                    if (c == 0) {
                        break Label_0239;
                    }
                }
                if (n6 > 8) {
                    n6 = 8;
                }
            }
            final int n7 = j / 2;
            Label_0293: {
                if ((j & 0x1) == 0x0) {
                    c2[n7] = n6;
                    d[n7] = n5 - n6;
                    if (c == 0) {
                        break Label_0293;
                    }
                }
                b2[n7] = n6;
                a[n7] = n5 - n6;
            }
            ++j;
            if (c != 0) {
                break;
            }
        }
        this.a(b, n3);
        final int n8 = -1 + c2.length;
        int n9 = 0;
        int n10 = 0;
        int k = n8;
        while (k >= 0) {
            n9 = n9 * 9 + c2[k];
            n10 += c2[k];
            --k;
            if (c != 0) {
                break;
            }
        }
        final int n11 = -1 + b2.length;
        int n12 = 0;
        int n13 = 0;
        int l = n11;
        while (l >= 0) {
            n13 = n13 * 9 + b2[l];
            n12 += b2[l];
            --l;
            if (c != 0) {
                break;
            }
        }
        final int n14 = n9 + n13 * 3;
        if (b) {
            if ((n10 & 0x1) != 0x0 || n10 > 12 || n10 < 4) {
                throw fv.a();
            }
            final int n15 = (12 - n10) / 2;
            final int n16 = g5.h[n15];
            return new e0(g5.o[n15] + (bm.a(b2, 9 - n16, true) + bm.a(c2, n16, false) * g5.j[n15]), n14);
        }
        else {
            if ((n12 & 0x1) != 0x0 || n12 > 10 || n12 < 4) {
                throw fv.a();
            }
            final int n17 = (10 - n12) / 2;
            final int n18 = g5.k[n17];
            return new e0(g5.n[n17] + (bm.a(c2, n18, true) + bm.a(b2, 9 - n18, false) * g5.i[n17]), n14);
        }
    }
    
    private ez a(final hN hn, final boolean b, final int n, final Map map) {
        try {
            final int[] a = this.a(hn, 0, b);
            final bk a2 = this.a(hn, n, b, a);
            fs fs;
            if (map == null) {
                fs = null;
            }
            else {
                fs = map.get(bj.NEED_RESULT_POINT_CALLBACK);
            }
            if (fs != null) {
                float n2 = (a[0] + a[1]) / 2.0f;
                if (b) {
                    n2 = -1 + hn.b() - n2;
                }
                fs.a(new cs(n2, n));
            }
            final e0 a3 = this.a(hn, a2, true);
            final e0 a4 = this.a(hn, a2, false);
            return new ez(1597 * a3.a() + a4.a(), a3.b() + 4 * a4.b(), a2);
        }
        catch (fv fv) {
            return null;
        }
    }
    
    private static void a(final Collection collection, final ez ez) {
        final int c = e0.c;
        if (ez != null) {
            final Iterator<ez> iterator = collection.iterator();
            int n = 0;
        Label_0067:
            while (true) {
                while (iterator.hasNext()) {
                    final ez ez2 = iterator.next();
                    int n2;
                    if (ez2.a() == ez.a()) {
                        ez2.a();
                        n2 = 1;
                        if (c == 0) {
                            break Label_0067;
                        }
                    }
                    else {
                        n2 = n;
                    }
                    if (c == 0) {
                        n = n2;
                        continue;
                    }
                    if (n2 == 0) {
                        collection.add(ez);
                    }
                    return;
                }
                int n2 = n;
                continue Label_0067;
            }
        }
    }
    
    private void a(final boolean b, final int n) {
        final int c = e0.c;
        final int a = gk.a(this.c());
        final int a2 = gk.a(this.b());
        final int n2 = a + a2 - n;
        final int n3 = a & 0x1;
        int n4;
        if (b) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        boolean b2;
        if (n3 == n4) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3;
        if ((a2 & 0x1) == 0x1) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        boolean b4 = false;
        boolean b5 = false;
        boolean b6 = false;
        boolean b7 = false;
        Label_0195: {
            if (b) {
                b6 = false;
                Label_0113: {
                    if (a > 12) {
                        b6 = true;
                        b7 = false;
                        if (c == 0) {
                            break Label_0113;
                        }
                    }
                    b7 = false;
                    if (a < 4) {
                        b7 = true;
                    }
                }
                b4 = false;
                if (a2 > 12) {
                    b4 = true;
                    b5 = false;
                    if (c == 0) {
                        break Label_0195;
                    }
                }
                b5 = false;
                if (a2 >= 4) {
                    break Label_0195;
                }
                b5 = true;
                if (c == 0) {
                    break Label_0195;
                }
            }
            Label_0172: {
                if (a > 11) {
                    b6 = true;
                    if (c == 0) {
                        break Label_0172;
                    }
                }
                if (a < 5) {
                    b7 = true;
                }
            }
            if (a2 > 10) {
                b4 = true;
                if (c == 0) {
                    break Label_0195;
                }
            }
            if (a2 < 4) {
                b5 = true;
            }
        }
        Label_0358: {
            if (n2 == 1) {
                if (b2) {
                    if (b3) {
                        throw fv.a();
                    }
                    b6 = true;
                    if (c == 0) {
                        break Label_0358;
                    }
                }
                if (!b3) {
                    throw fv.a();
                }
                b4 = true;
                if (c == 0) {
                    break Label_0358;
                }
            }
            if (n2 == -1) {
                if (b2) {
                    if (b3) {
                        throw fv.a();
                    }
                    b7 = true;
                    if (c == 0) {
                        break Label_0358;
                    }
                }
                if (!b3) {
                    throw fv.a();
                }
                b5 = true;
                if (c == 0) {
                    break Label_0358;
                }
            }
            if (n2 != 0) {
                throw fv.a();
            }
            if (b2) {
                if (!b3) {
                    throw fv.a();
                }
                if (a < a2) {
                    b7 = true;
                    b4 = true;
                    if (c == 0) {
                        break Label_0358;
                    }
                }
                b6 = true;
                b5 = true;
                if (c == 0) {
                    break Label_0358;
                }
            }
            if (b3) {
                throw fv.a();
            }
        }
        if (b7) {
            if (b6) {
                throw fv.a();
            }
            gk.b(this.c(), this.d());
        }
        if (b6) {
            gk.a(this.c(), this.d());
        }
        if (b5) {
            if (b4) {
                throw fv.a();
            }
            gk.b(this.b(), this.d());
        }
        if (b4) {
            gk.a(this.b(), this.a());
        }
    }
    
    private int[] a(final hN hn, final int n, final boolean b) {
        final int c = e0.c;
        final int[] f = this.f();
        f[1] = (f[0] = 0);
        f[3] = (f[2] = 0);
        final int b2 = hn.b();
        boolean b3 = false;
        int i = n;
        while (i < b2) {
            b3 = !hn.a(i);
            if (b == b3 && c == 0) {
                break;
            }
            ++i;
            if (c != 0) {
                break;
            }
        }
        int j = i;
        final int n2 = i;
        int n3 = 0;
        boolean b4 = b3;
        int n4 = n2;
        while (j < b2) {
            Label_0235: {
                if (b4 ^ hn.a(j)) {
                    ++f[n3];
                    if (c == 0) {
                        break Label_0235;
                    }
                }
                Label_0221: {
                    if (n3 == 3) {
                        if (gk.b(f)) {
                            return new int[] { n4, j };
                        }
                        n4 += f[0] + f[1];
                        f[0] = f[2];
                        f[1] = f[3];
                        f[3] = (f[2] = 0);
                        --n3;
                        if (c == 0) {
                            break Label_0221;
                        }
                    }
                    ++n3;
                }
                f[n3] = 1;
                b4 = !b4;
            }
            ++j;
            if (c != 0) {
                break;
            }
        }
        throw fv.a();
    }
    
    private static boolean b(final ez ez, final ez ez2) {
        final int n = (ez.b() + 16 * ez2.b()) % 79;
        int n2 = 9 * ez.d().b() + ez2.d().b();
        if (n2 > 72) {
            --n2;
        }
        if (n2 > 8) {
            --n2;
        }
        return n == n2;
    }
    
    @Override
    public aU a(final int n, final hN hn, final Map map) {
        final int c = e0.c;
        a(this.l, this.a(hn, false, n, map));
        hn.a();
        a(this.p, this.a(hn, true, n, map));
        hn.a();
        int n3;
        for (int size = this.l.size(), i = 0; i < size; i = n3) {
            final ez ez = this.l.get(i);
            if (ez.c() > 1) {
                int n2;
                for (int size2 = this.p.size(), j = 0; j < size2; j = n2) {
                    final ez ez2 = this.p.get(j);
                    if (ez2.c() > 1 && b(ez, ez2)) {
                        return a(ez, ez2);
                    }
                    n2 = j + 1;
                    if (c != 0) {
                        ++fN.a;
                        break;
                    }
                }
            }
            n3 = i + 1;
            if (c != 0) {
                break;
            }
        }
        throw fv.a();
    }
    
    @Override
    public void a() {
        this.l.clear();
        this.p.clear();
    }
}
