// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;
import java.util.Map;

public class x implements hV
{
    public static int a;
    private static final cs[] b;
    private final bt c;
    
    static {
        b = new cs[0];
    }
    
    public x() {
        final int a = x.a;
        this.c = new bt();
        if (fN.a != 0) {
            x.a = a + 1;
        }
    }
    
    private static float a(final int[] array, final L l) {
        final int a = x.a;
        final int a2 = l.a();
        final int g = l.g();
        int n = array[0];
        int n2 = array[1];
        int n3 = 0;
        boolean b = true;
        while (true) {
            while (n < g && n2 < a2) {
                int n4;
                if (b != l.a(n, n2)) {
                    n4 = n3 + 1;
                    if (n4 == 5 && a == 0) {
                        break;
                    }
                    b = !b;
                }
                else {
                    n4 = n3;
                }
                ++n;
                final int n5 = n2 + 1;
                if (a != 0) {
                    final int n6 = n;
                    if (n6 == g || n5 == a2) {
                        throw fv.a();
                    }
                    return (n6 - array[0]) / 7.0f;
                }
                else {
                    n2 = n5;
                    n3 = n4;
                }
            }
            final int n5 = n2;
            final int n6 = n;
            continue;
        }
    }
    
    private static L a(final L l) {
        final int a = x.a;
        final int[] c = l.c();
        final int[] e = l.e();
        if (c == null || e == null) {
            throw fv.a();
        }
        final float a2 = a(c, l);
        final int n = c[1];
        final int n2 = e[1];
        final int n3 = c[0];
        int n4 = e[0];
        if (n3 >= n4 || n >= n2) {
            throw fv.a();
        }
        if (n2 - n != n4 - n3) {
            n4 = n3 + (n2 - n);
        }
        final int round = Math.round((1 + (n4 - n3)) / a2);
        final int round2 = Math.round((1 + (n2 - n)) / a2);
        if (round <= 0 || round2 <= 0) {
            throw fv.a();
        }
        if (round2 != round) {
            throw fv.a();
        }
        final int n5 = (int)(a2 / 2.0f);
        final int n6 = n + n5;
        final int n7 = n3 + n5;
        final int n8 = n7 + (int)(a2 * (round - 1)) - (n4 - 1);
        int n9;
        if (n8 > 0) {
            if (n8 > n5) {
                throw fv.a();
            }
            n9 = n7 - n8;
        }
        else {
            n9 = n7;
        }
        final int n10 = n6 + (int)(a2 * (round2 - 1)) - (n2 - 1);
        int n11;
        if (n10 > 0) {
            if (n10 > n5) {
                throw fv.a();
            }
            n11 = n6 - n10;
        }
        else {
            n11 = n6;
        }
        final L i = new L(round, round2);
        int n13;
        for (int j = 0; j < round2; j = n13) {
            final int n12 = n11 + (int)(a2 * j);
            int k = 0;
            while (k < round) {
                if (l.a(n9 + (int)(a2 * k), n12)) {
                    i.b(k, j);
                }
                ++k;
                if (a != 0) {
                    break;
                }
            }
            n13 = j + 1;
            if (a != 0) {
                break;
            }
        }
        return i;
    }
    
    @Override
    public final aU a(final c1 c1, final Map map) {
        final int a = x.a;
        aS as = null;
        cs[] array = null;
        Label_0105: {
            if (map != null && map.containsKey(bj.PURE_BARCODE)) {
                final aS a2 = this.c.a(a(c1.c()), map);
                final cs[] b = x.b;
                if (a == 0) {
                    as = a2;
                    array = b;
                    break Label_0105;
                }
                ++fN.a;
            }
            final fT a3 = new bL(c1.c()).a(map);
            final aS a4 = this.c.a(a3.b(), map);
            final cs[] a5 = a3.a();
            as = a4;
            array = a5;
        }
        if (as.d() instanceof cc) {
            ((cc)as.d()).a(array);
        }
        final aU au = new aU(as.a(), as.e(), array, d3.QR_CODE);
        final List f = as.f();
        if (f != null) {
            au.a(A.BYTE_SEGMENTS, f);
        }
        final String c2 = as.c();
        if (c2 != null) {
            au.a(A.ERROR_CORRECTION_LEVEL, c2);
        }
        if (as.h()) {
            au.a(A.STRUCTURED_APPEND_SEQUENCE, as.b());
            au.a(A.STRUCTURED_APPEND_PARITY, as.g());
        }
        return au;
    }
    
    @Override
    public void a() {
    }
}
