// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;
import java.util.Map;

public final class cx implements hV
{
    public static int a;
    private static final cs[] c;
    private final cV b;
    
    static {
        c = new cs[0];
    }
    
    public cx() {
        final int a = cx.a;
        this.b = new cV();
        if (fN.a != 0) {
            cx.a = a + 1;
        }
    }
    
    private static int a(final int[] array, final L l) {
        final int a = cx.a;
        final int g = l.g();
        int n = array[0];
        final int n2 = array[1];
        while (n < g && l.a(n, n2)) {
            ++n;
            if (a != 0) {
                break;
            }
        }
        if (n == g) {
            throw fv.a();
        }
        final int n3 = n - array[0];
        if (n3 == 0) {
            throw fv.a();
        }
        return n3;
    }
    
    private static L a(final L l) {
        final int a = cx.a;
        final int[] c = l.c();
        final int[] e = l.e();
        if (c == null || e == null) {
            throw fv.a();
        }
        final int a2 = a(c, l);
        final int n = c[1];
        final int n2 = e[1];
        final int n3 = c[0];
        final int n4 = (1 + (e[0] - n3)) / a2;
        final int n5 = (1 + (n2 - n)) / a2;
        if (n4 <= 0 || n5 <= 0) {
            throw fv.a();
        }
        final int n6 = a2 / 2;
        final int n7 = n + n6;
        final int n8 = n3 + n6;
        final L i = new L(n4, n5);
        int n10;
        for (int j = 0; j < n5; j = n10) {
            final int n9 = n7 + j * a2;
            int k = 0;
            while (k < n4) {
                if (l.a(n8 + k * a2, n9)) {
                    i.b(k, j);
                }
                ++k;
                if (a != 0) {
                    break;
                }
            }
            n10 = j + 1;
            if (a != 0) {
                break;
            }
        }
        return i;
    }
    
    @Override
    public aU a(final c1 c1, final Map map) {
        final int a = cx.a;
        aS as = null;
        cs[] array = null;
        Label_0094: {
            if (map != null && map.containsKey(bj.PURE_BARCODE)) {
                as = this.b.a(a(c1.c()));
                array = cx.c;
                if (a == 0) {
                    break Label_0094;
                }
                ++fN.a;
            }
            final fT a2 = new hK(c1.c()).a();
            as = this.b.a(a2.b());
            array = a2.a();
        }
        final aU au = new aU(as.a(), as.e(), array, d3.DATA_MATRIX);
        final List f = as.f();
        if (f != null) {
            au.a(A.BYTE_SEGMENTS, f);
        }
        final String c2 = as.c();
        if (c2 != null) {
            au.a(A.ERROR_CORRECTION_LEVEL, c2);
        }
        return au;
    }
    
    @Override
    public void a() {
    }
}
