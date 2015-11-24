// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

public final class ga implements hV, eS
{
    private static int a(final cs cs, final cs cs2) {
        if (cs == null || cs2 == null) {
            return 0;
        }
        return (int)Math.abs(cs.a() - cs2.a());
    }
    
    private static int a(final cs[] array) {
        return Math.max(Math.max(a(array[0], array[4]), 17 * a(array[6], array[2]) / 18), Math.max(a(array[1], array[5]), 17 * a(array[7], array[3]) / 18));
    }
    
    private static aU[] a(final c1 c1, final Map map, final boolean b) {
        final boolean c2 = ex.c;
        final ArrayList<aU> list = new ArrayList<aU>();
        final fH a = e2.a(c1, map, b);
        for (final cs[] array : a.a()) {
            final aS a2 = fG.a(a.b(), array[4], array[5], array[6], array[7], b(array), a(array));
            final aU au = new aU(a2.a(), a2.e(), array, d3.PDF_417);
            au.a(A.ERROR_CORRECTION_LEVEL, a2.c());
            final h6 h6 = (h6)a2.d();
            if (h6 != null) {
                au.a(A.PDF417_EXTRA_METADATA, h6);
            }
            list.add(au);
            if (c2) {
                break;
            }
        }
        return list.toArray(new aU[list.size()]);
    }
    
    private static int b(final cs cs, final cs cs2) {
        if (cs == null || cs2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int)Math.abs(cs.a() - cs2.a());
    }
    
    private static int b(final cs[] array) {
        return Math.min(Math.min(b(array[0], array[4]), 17 * b(array[6], array[2]) / 18), Math.min(b(array[1], array[5]), 17 * b(array[7], array[3]) / 18));
    }
    
    @Override
    public aU a(final c1 c1, final Map map) {
        final boolean c2 = ex.c;
        final aU[] a = a(c1, map, false);
        if (a == null || a.length == 0 || a[0] == null) {
            throw fv.a();
        }
        final aU au = a[0];
        if (c2) {
            ++fN.a;
        }
        return au;
    }
    
    @Override
    public void a() {
    }
}
