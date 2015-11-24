// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

final class hh
{
    private final int[] a;
    private final StringBuilder b;
    
    hh() {
        this.a = new int[4];
        this.b = new StringBuilder();
    }
    
    private static Map a(final String s) {
        if (s.length() != 2) {
            return null;
        }
        final EnumMap<A, Integer> enumMap = new EnumMap<A, Integer>(A.class);
        enumMap.put(A.ISSUE_NUMBER, Integer.valueOf(s));
        return enumMap;
    }
    
    int a(final hN hn, final int[] array, final StringBuilder sb) {
        final boolean a = gj.a;
        final int[] a2 = this.a;
        a2[1] = (a2[0] = 0);
        a2[3] = (a2[2] = 0);
        final int b = hn.b();
        final int n = array[1];
        int n2 = 0;
        int n3 = 0;
        int b2;
        int n4;
        for (b2 = n; n2 < 2 && b2 < b; n2 = n4) {
            final int a3 = gP.a(hn, a2, b2, gP.e);
            sb.append((char)(48 + a3 % 10));
            final int length = a2.length;
            int i = 0;
            while (i < length) {
                b2 += a2[i];
                ++i;
                if (a) {
                    break;
                }
            }
            if (a3 >= 10) {
                n3 |= 1 << 1 - n2;
            }
            if (n2 != 1) {
                b2 = hn.b(hn.d(b2));
            }
            n4 = n2 + 1;
            if (a) {
                break;
            }
        }
        if (sb.length() != 2) {
            throw fv.a();
        }
        if (Integer.parseInt(sb.toString()) % 4 != n3) {
            throw fv.a();
        }
        return b2;
    }
    
    aU a(final int n, final hN hn, final int[] array) {
        final StringBuilder b = this.b;
        b.setLength(0);
        final int a = this.a(hn, array, b);
        final String string = b.toString();
        final Map a2 = a(string);
        final aU au = new aU(string, null, new cs[] { new cs((array[0] + array[1]) / 2.0f, n), new cs(a, n) }, d3.UPC_EAN_EXTENSION);
        if (a2 != null) {
            au.a(a2);
        }
        return au;
    }
}
