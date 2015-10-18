// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MedianCutQuantizer
{
    private static final String a;
    private ae[] b;
    private ae[] c;
    
    static {
        a = MedianCutQuantizer.class.getSimpleName();
    }
    
    public MedianCutQuantizer(final int[] array, final int n) {
        this.b = null;
        this.c = null;
        this.c = this.a(array, n);
    }
    
    private ac a(final List list) {
        ac ac = null;
        int n = Integer.MAX_VALUE;
        for (final ac ac2 : list) {
            ac ac3;
            int n2;
            if (ac2.a() >= 2 && ac2.c < n) {
                final int c = ac2.c;
                ac3 = ac2;
                n2 = c;
            }
            else {
                n2 = n;
                ac3 = ac;
            }
            ac = ac3;
            n = n2;
        }
        return ac;
    }
    
    private ae[] b(final List list) {
        final ae[] array = new ae[list.size()];
        final Iterator<ac> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next().e();
            ++n;
        }
        return array;
    }
    
    public ae[] a() {
        return this.c;
    }
    
    ae[] a(final int[] array, final int n) {
        int n2 = 0;
        final ad ad = new ad(array);
        final int a = ad.a();
        this.b = new ae[a];
        for (int i = 0; i < a; ++i) {
            this.b[i] = new ae(ad.a(i), ad.b(i));
        }
        if (a <= n) {
            return this.b;
        }
        final ac ac = new ac(this, 0, a - 1, 0);
        final ArrayList<ac> list = new ArrayList<ac>();
        list.add(ac);
        int n3 = 1;
        while (n3 < n && n2 == 0) {
            final ac a2 = this.a(list);
            if (a2 != null) {
                list.add(a2.c());
                ++n3;
            }
            else {
                n2 = 1;
            }
        }
        return this.b(list);
    }
}
