// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.List;

final class bc
{
    static hN a(final List list) {
        final int q = gY.q;
        final int n = -1 + 2 * list.size();
        int n2;
        if (list.get(-1 + list.size()).a() == null) {
            n2 = n - 1;
        }
        else {
            n2 = n;
        }
        final hN hn = new hN(n2 * 12);
        final int a = list.get(0).a().a();
        int i = 11;
        int n3 = 0;
        while (i >= 0) {
            if ((a & 1 << i) != 0x0) {
                hn.e(n3);
            }
            ++n3;
            --i;
            if (q != 0) {
                break;
            }
        }
        int j = 1;
        int n4 = n3;
        while (j < list.size()) {
            final br br = list.get(j);
            final int a2 = br.d().a();
            int k = 11;
            while (k >= 0) {
                if ((a2 & 1 << k) != 0x0) {
                    hn.e(n4);
                }
                ++n4;
                --k;
                if (q != 0) {
                    break;
                }
            }
            if (br.a() != null) {
                final int a3 = br.a().a();
                int l = 11;
                while (l >= 0) {
                    if ((a3 & 1 << l) != 0x0) {
                        hn.e(n4);
                    }
                    ++n4;
                    --l;
                    if (q != 0) {
                        break;
                    }
                }
            }
            final int n5 = j + 1;
            if (q != 0) {
                break;
            }
            j = n5;
        }
        return hn;
    }
}
