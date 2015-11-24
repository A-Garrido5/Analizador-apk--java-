// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public class bL
{
    private final L a;
    private fs b;
    
    public bL(final L a) {
        this.a = a;
    }
    
    private float a(final int n, final int n2, final int n3, final int n4) {
        final int b = eJ.b;
        final float b2 = this.b(n, n2, n3, n4);
        int n5 = n - (n3 - n);
        float n6 = 0.0f;
        int n7 = 0;
        Label_0101: {
            float n8;
            if (n5 < 0) {
                n6 = n / (n - n5);
                if (b == 0) {
                    n7 = 0;
                    break Label_0101;
                }
                n8 = n6;
                n5 = 0;
            }
            else {
                n8 = 1.0f;
            }
            if (n5 >= this.a.g()) {
                final float n9 = (-1 + this.a.g() - n) / (n5 - n);
                final int n10 = -1 + this.a.g();
                n6 = n9;
                n7 = n10;
            }
            else {
                final int n11 = n5;
                n6 = n8;
                n7 = n11;
            }
        }
        final int n12 = (int)(n2 - n6 * (n4 - n2));
        float n13;
        int n14;
        if (n12 < 0) {
            n13 = n2 / (n2 - n12);
            n14 = 0;
            if (b == 0) {
                return b2 + this.b(n, n2, (int)(n + n13 * (n7 - n)), n14) - 1.0f;
            }
        }
        else {
            n14 = n12;
            n13 = 1.0f;
        }
        if (n14 >= this.a.a()) {
            n13 = (-1 + this.a.a() - n2) / (n14 - n2);
            n14 = -1 + this.a.a();
        }
        return b2 + this.b(n, n2, (int)(n + n13 * (n7 - n)), n14) - 1.0f;
    }
    
    private float a(final cs cs, final cs cs2) {
        final float a = this.a((int)cs.a(), (int)cs.b(), (int)cs2.a(), (int)cs2.b());
        final float a2 = this.a((int)cs2.a(), (int)cs2.b(), (int)cs.a(), (int)cs.b());
        if (Float.isNaN(a)) {
            return a2 / 7.0f;
        }
        if (Float.isNaN(a2)) {
            return a / 7.0f;
        }
        return (a + a2) / 14.0f;
    }
    
    private static int a(final cs cs, final cs cs2, final cs cs3, final float n) {
        final int b = eJ.b;
        int n2 = 7 + (gf.a(cs.a(cs, cs2) / n) + gf.a(cs.a(cs, cs3) / n)) / 2;
        Label_0079: {
            switch (n2 & 0x3) {
                case 0: {
                    ++n2;
                    if (b != 0) {
                        break Label_0079;
                    }
                    break;
                }
                case 2: {
                    --n2;
                    if (b != 0) {
                        throw fv.a();
                    }
                    break;
                }
                case 3: {
                    throw fv.a();
                }
            }
        }
        return n2;
    }
    
    private static L a(final L l, final ca ca, final int n) {
        return W.a().a(l, n, n, ca);
    }
    
    private static ca a(final cs cs, final cs cs2, final cs cs3, final cs cs4, final int n) {
        final float n2 = n - 3.5f;
        if (cs4 != null) {
            final float a = cs4.a();
            final float b = cs4.b();
            final float n3 = n2 - 3.0f;
            if (eJ.b == 0) {
                final float n4 = n3;
                return ca.a(3.5f, 3.5f, n2, 3.5f, n4, n3, 3.5f, n2, cs.a(), cs.b(), cs2.a(), cs2.b(), a, b, cs3.a(), cs3.b());
            }
        }
        final float a = cs2.a() - cs.a() + cs3.a();
        final float b = cs2.b() - cs.b() + cs3.b();
        final float n3 = n2;
        final float n4 = n2;
        return ca.a(3.5f, 3.5f, n2, 3.5f, n4, n3, 3.5f, n2, cs.a(), cs.b(), cs2.a(), cs2.b(), a, b, cs3.a(), cs3.b());
    }
    
    private float b(int n, int n2, int n3, int n4) {
        final int b = eJ.b;
        boolean b2;
        if (Math.abs(n4 - n2) > Math.abs(n3 - n)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!b2) {
            final int n5 = n4;
            n4 = n3;
            n3 = n5;
            final int n6 = n2;
            n2 = n;
            n = n6;
        }
        final int abs = Math.abs(n4 - n2);
        final int abs2 = Math.abs(n3 - n);
        final int n7 = -abs / 2;
        int n8;
        if (n2 < n4) {
            n8 = 1;
        }
        else {
            n8 = -1;
        }
        int n9;
        if (n < n3) {
            n9 = 1;
        }
        else {
            n9 = -1;
        }
        int n10 = 0;
        final int n11 = n4 + n8;
        int i = n2;
        int n12 = n7;
        int n13 = n;
        while (true) {
            while (i != n11) {
                int n14;
                if (b2) {
                    n14 = n13;
                }
                else {
                    n14 = i;
                }
                int n15;
                if (b2) {
                    n15 = i;
                }
                else {
                    n15 = n13;
                }
                int n16;
                if (n10 == 1 == this.a.a(n14, n15)) {
                    if (n10 == 2) {
                        return gf.a(i, n13, n2, n);
                    }
                    n16 = n10 + 1;
                }
                else {
                    n16 = n10;
                }
                final int n17 = n12 + abs2;
                Label_0249: {
                    int n18;
                    int n19;
                    if (n17 > 0) {
                        if (n13 == n3 && b == 0) {
                            break Label_0249;
                        }
                        n18 = n13 + n9;
                        n19 = n17 - abs;
                    }
                    else {
                        n18 = n13;
                        n19 = n17;
                    }
                    i += n8;
                    if (b == 0) {
                        n12 = n19;
                        n13 = n18;
                        n10 = n16;
                        continue;
                    }
                }
                final int n20 = n16;
                if (n20 == 2) {
                    return gf.a(n4 + n8, n3, n2, n);
                }
                return Float.NaN;
            }
            final int n20 = n10;
            continue;
        }
    }
    
    protected final float a(final cs cs, final cs cs2, final cs cs3) {
        return (this.a(cs, cs2) + this.a(cs, cs3)) / 2.0f;
    }
    
    protected final cZ a(final float n, final int n2, final int n3, final float n4) {
        final int b = eJ.b;
        final int n5 = (int)(n4 * n);
        final int max = Math.max(0, n2 - n5);
        final int min = Math.min(-1 + this.a.g(), n2 + n5);
        if (min - max < n * 3.0f) {
            throw fv.a();
        }
        final int max2 = Math.max(0, n3 - n5);
        final int min2 = Math.min(-1 + this.a.a(), n5 + n3);
        if (min2 - max2 < n * 3.0f) {
            throw fv.a();
        }
        final cZ a = new ab(this.a, max, max2, min - max, min2 - max2, n, this.b).a();
        if (b != 0) {
            ++fN.a;
        }
        return a;
    }
    
    protected final fT a(final cS cs) {
        final int b = eJ.b;
        final cN a = cs.a();
        final cN b2 = cs.b();
        final cN c = cs.c();
        final float a2 = this.a(a, b2, c);
        if (a2 < 1.0f) {
            try {
                throw fv.a();
            }
            catch (fv fv) {
                throw fv;
            }
        }
        final int a3 = a(a, b2, c, a2);
        final bE a4 = bE.a(a3);
        final int n = -7 + a4.c();
        final int length = a4.b().length;
        cs a5 = null;
    Label_0211:
        while (true) {
            while (true) {
                int n7 = 0;
                Label_0178: {
                    if (length > 0) {
                        final float n2 = b2.a() - a.a() + c.a();
                        final float n3 = b2.b() - a.b() + c.b();
                        final float n4 = 1.0f - 3.0f / n;
                        final int n5 = (int)(a.a() + n4 * (n2 - a.a()));
                        final int n6 = (int)(a.b() + n4 * (n3 - a.b()));
                        n7 = 4;
                        break Label_0178;
                    }
                    break Label_0211;
                    while (true) {
                        final float n8 = n7;
                        while (true) {
                            cs[] array = null;
                            Label_0322: {
                                try {
                                    final int n5;
                                    final int n6;
                                    a5 = this.a(a2, n5, n6, n8);
                                    final L a6 = a(this.a, a(a, b2, c, a5, a3), a3);
                                    if (a5 == null) {
                                        array = new cs[] { c, a, b2 };
                                        if (b == 0) {
                                            break Label_0322;
                                        }
                                    }
                                    final cs[] array2 = { c, a, b2, a5 };
                                    return new fT(a6, array2);
                                }
                                catch (fv fv2) {
                                    n7 <<= 1;
                                    if (b != 0) {
                                        a5 = null;
                                        continue Label_0211;
                                    }
                                    break;
                                }
                            }
                            final cs[] array2 = array;
                            continue;
                        }
                    }
                }
                a5 = null;
                if (n7 <= 16) {
                    continue;
                }
                break;
            }
            continue Label_0211;
        }
    }
    
    public final fT a(final Map map) {
        fs b;
        if (map == null) {
            b = null;
        }
        else {
            b = map.get(bj.NEED_RESULT_POINT_CALLBACK);
        }
        this.b = b;
        return this.a(new eJ(this.a, this.b).a(map));
    }
}
