// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;

public final class eO implements hV
{
    public static int b;
    private static final cs[] c;
    private final gA a;
    
    static {
        c = new cs[0];
    }
    
    public eO() {
        final int b = eO.b;
        this.a = new gA();
        if (fN.a != 0) {
            eO.b = b + 1;
        }
    }
    
    private static L a(final L l) {
        final int b = eO.b;
        final int[] b2 = l.b();
        if (b2 == null) {
            throw fv.a();
        }
        final int n = b2[0];
        final int n2 = b2[1];
        final int n3 = b2[2];
        final int n4 = b2[3];
        final L i = new L(30, 33);
        int n6;
        for (int j = 0; j < 33; j = n6) {
            final int n5 = n2 + (j * n4 + n4 / 2) / 33;
            int k = 0;
            while (k < 30) {
                if (l.a(n + (k * n3 + n3 / 2 + n3 * (j & 0x1) / 2) / 30, n5)) {
                    i.b(k, j);
                }
                ++k;
                if (b != 0) {
                    break;
                }
            }
            n6 = j + 1;
            if (b != 0) {
                break;
            }
        }
        return i;
    }
    
    @Override
    public aU a(final c1 c1, final Map map) {
        final int b = eO.b;
        if (map != null && map.containsKey(bj.PURE_BARCODE)) {
            final aS a = this.a.a(a(c1.c()), map);
            if (b == 0) {
                final aU au = new aU(a.a(), a.e(), eO.c, d3.MAXICODE);
                final String c2 = a.c();
                if (c2 != null) {
                    au.a(A.ERROR_CORRECTION_LEVEL, c2);
                }
                return au;
            }
            ++fN.a;
        }
        throw fv.a();
    }
    
    @Override
    public void a() {
    }
}
