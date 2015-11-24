// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;

public final class hK
{
    public static boolean b;
    private final et a;
    private final L c;
    
    public hK(final L c) {
        this.c = c;
        this.a = new et(c);
    }
    
    private static int a(final cs cs, final cs cs2) {
        return gf.a(cs.a(cs, cs2));
    }
    
    private static L a(final L l, final cs cs, final cs cs2, final cs cs3, final cs cs4, final int n, final int n2) {
        return W.a().a(l, n, n2, 0.5f, 0.5f, n - 0.5f, 0.5f, n - 0.5f, n2 - 0.5f, 0.5f, n2 - 0.5f, cs.a(), cs.b(), cs4.a(), cs4.b(), cs3.a(), cs3.b(), cs2.a(), cs2.b());
    }
    
    private cs a(final cs cs, final cs cs2, final cs cs3, final cs cs4, final int n) {
        final float n2 = a(cs, cs2) / n;
        final int a = a(cs3, cs4);
        cs cs5 = new cs(cs4.a() + (cs4.a() - cs3.a()) / a * n2, cs4.b() + n2 * ((cs4.b() - cs3.b()) / a));
        final float n3 = a(cs, cs3) / n;
        final int a2 = a(cs2, cs4);
        final cs cs6 = new cs(cs4.a() + (cs4.a() - cs2.a()) / a2 * n3, cs4.b() + n3 * ((cs4.b() - cs2.b()) / a2));
        if (!this.a(cs5)) {
            if (!this.a(cs6)) {
                return null;
            }
            cs5 = cs6;
        }
        else if (this.a(cs6) && Math.abs(this.b(cs3, cs5).a() - this.b(cs2, cs5).a()) > Math.abs(this.b(cs3, cs6).a() - this.b(cs2, cs6).a())) {
            return cs6;
        }
        return cs5;
    }
    
    private cs a(final cs cs, final cs cs2, final cs cs3, final cs cs4, final int n, final int n2) {
        final float n3 = a(cs, cs2) / n;
        final int a = a(cs3, cs4);
        final cs cs5 = new cs(cs4.a() + (cs4.a() - cs3.a()) / a * n3, cs4.b() + n3 * ((cs4.b() - cs3.b()) / a));
        final float n4 = a(cs, cs3) / n2;
        final int a2 = a(cs2, cs4);
        final cs cs6 = new cs(cs4.a() + (cs4.a() - cs2.a()) / a2 * n4, cs4.b() + n4 * ((cs4.b() - cs2.b()) / a2));
        if (!this.a(cs5)) {
            if (!this.a(cs6)) {
                return null;
            }
        }
        else {
            if (!this.a(cs6)) {
                return cs5;
            }
            if (Math.abs(n - this.b(cs3, cs5).a()) + Math.abs(n2 - this.b(cs2, cs5).a()) <= Math.abs(n - this.b(cs3, cs6).a()) + Math.abs(n2 - this.b(cs2, cs6).a())) {
                return cs5;
            }
        }
        return cs6;
    }
    
    private static void a(final Map map, final cs cs) {
        final Integer n = map.get(cs);
        int n2;
        if (n == null) {
            n2 = 1;
        }
        else {
            n2 = 1 + n;
        }
        map.put(cs, n2);
    }
    
    private boolean a(final cs cs) {
        return cs.a() >= 0.0f && cs.a() < this.c.g() && cs.b() > 0.0f && cs.b() < this.c.a();
    }
    
    private I b(final cs cs, final cs cs2) {
        final boolean b = hK.b;
        int n = (int)cs.a();
        int i = (int)cs.b();
        int n2 = (int)cs2.a();
        int n3 = (int)cs2.b();
        boolean b2;
        if (Math.abs(n3 - i) > Math.abs(n2 - n)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!b2) {
            final int n4 = n3;
            n3 = n2;
            n2 = n4;
            final int n5 = i;
            i = n;
            n = n5;
        }
        final int abs = Math.abs(n3 - i);
        final int abs2 = Math.abs(n2 - n);
        final int n6 = -abs / 2;
        int n7;
        if (n < n2) {
            n7 = 1;
        }
        else {
            n7 = -1;
        }
        int n8;
        if (i < n3) {
            n8 = 1;
        }
        else {
            n8 = -1;
        }
        int n9 = 0;
        final L c = this.c;
        int n10;
        if (b2) {
            n10 = n;
        }
        else {
            n10 = i;
        }
        int n11;
        if (b2) {
            n11 = i;
        }
        else {
            n11 = n;
        }
        boolean a = c.a(n10, n11);
        int n12 = n;
        int n13 = n6;
        while (i != n3) {
            final L c2 = this.c;
            int n14;
            if (b2) {
                n14 = n12;
            }
            else {
                n14 = i;
            }
            int n15;
            if (b2) {
                n15 = i;
            }
            else {
                n15 = n12;
            }
            final boolean a2 = c2.a(n14, n15);
            int n17;
            if (a2 != a) {
                final int n16 = n9 + 1;
                a = a2;
                n17 = n16;
            }
            else {
                n17 = n9;
            }
            int n18 = n13 + abs2;
            Label_0263: {
                if (n18 > 0) {
                    if (n12 == n2 && !b) {
                        break Label_0263;
                    }
                    n12 += n7;
                    n18 -= abs;
                }
                i += n8;
                if (!b) {
                    n13 = n18;
                    n9 = n17;
                    continue;
                }
            }
            final int n19 = n17;
            return new I(cs, cs2, n19, null);
        }
        final int n19 = n9;
        return new I(cs, cs2, n19, null);
    }
    
    public fT a() {
        final boolean b = hK.b;
        final cs[] a = this.a.a();
        final cs cs = a[0];
        final cs cs2 = a[1];
        final cs cs3 = a[2];
        final cs cs4 = a[3];
        final ArrayList<I> list = new ArrayList<I>(4);
        list.add(this.b(cs, cs2));
        list.add((T)this.b(cs, cs3));
        list.add(this.b(cs2, cs4));
        list.add(this.b(cs3, cs4));
        Collections.sort((List<Object>)list, new ge(null));
        final I i = list.get(0);
        final I j = list.get(1);
        final HashMap<cs, Object> hashMap = new HashMap<cs, Object>();
        a(hashMap, i.c());
        a(hashMap, i.b());
        a(hashMap, j.c());
        a(hashMap, j.b());
        final Iterator<Map.Entry<cs, V>> iterator = hashMap.entrySet().iterator();
        cs cs5 = null;
        cs cs6 = null;
        cs cs7 = null;
        while (true) {
            while (iterator.hasNext()) {
                final Map.Entry<cs, V> entry = iterator.next();
                cs cs8 = entry.getKey();
                cs cs9 = null;
                cs cs10 = null;
                Label_0306: {
                    if ((int)entry.getValue() == 2) {
                        if (!b) {
                            cs9 = cs7;
                            cs10 = cs6;
                            break Label_0306;
                        }
                        ++fN.a;
                        cs5 = cs8;
                    }
                    if (cs6 == null) {
                        if (!b) {
                            cs9 = cs7;
                            cs10 = cs8;
                            cs8 = cs5;
                            break Label_0306;
                        }
                        cs6 = cs8;
                    }
                    cs9 = cs8;
                    cs10 = cs6;
                    cs8 = cs5;
                }
                if (b) {
                    if (cs10 == null || cs8 == null || cs9 == null) {
                        throw fv.a();
                    }
                    final cs[] array = { cs10, cs8, cs9 };
                    com.google.cs.a(array);
                    final cs cs11 = array[0];
                    final cs cs12 = array[1];
                    final cs cs13 = array[2];
                    cs cs14;
                    if (hashMap.containsKey(cs) || b) {
                        if (hashMap.containsKey(cs2) || b) {
                            if (hashMap.containsKey(cs3) || b) {
                                cs14 = cs4;
                            }
                            else {
                                cs14 = cs3;
                            }
                        }
                        else {
                            cs14 = cs2;
                        }
                    }
                    else {
                        cs14 = cs;
                    }
                    int a2 = this.b(cs13, cs14).a();
                    int a3 = this.b(cs11, cs14).a();
                    if ((a2 & 0x1) == 0x1) {
                        ++a2;
                    }
                    int n = a2 + 2;
                    if ((a3 & 0x1) == 0x1) {
                        ++a3;
                    }
                    int n2 = a3 + 2;
                    if (n * 4 >= n2 * 7 || n2 * 4 >= n * 7) {
                        cs a4 = this.a(cs12, cs11, cs13, cs14, n, n2);
                        if (a4 == null) {
                            a4 = cs14;
                        }
                        int a5 = this.b(cs13, a4).a();
                        int a6 = this.b(cs11, a4).a();
                        if ((a5 & 0x1) == 0x1) {
                            ++a5;
                        }
                        if ((a6 & 0x1) == 0x1) {
                            ++a6;
                        }
                        final L l = a(this.c, cs13, cs12, cs11, a4, a5, a6);
                        if (!b) {
                            return new fT(l, new cs[] { cs13, cs12, cs11, a4 });
                        }
                        n2 = a6;
                        n = a5;
                    }
                    cs a7 = this.a(cs12, cs11, cs13, cs14, Math.min(n2, n));
                    if (a7 == null) {
                        a7 = cs14;
                    }
                    int n3 = 1 + Math.max(this.b(cs13, a7).a(), this.b(cs11, a7).a());
                    if ((n3 & 0x1) == 0x1) {
                        ++n3;
                    }
                    final L l = a(this.c, cs13, cs12, cs11, a7, n3, n3);
                    cs a4 = a7;
                    return new fT(l, new cs[] { cs13, cs12, cs11, a4 });
                }
                else {
                    cs5 = cs8;
                    cs6 = cs10;
                    cs7 = cs9;
                }
            }
            cs cs9 = cs7;
            cs cs8 = cs5;
            cs cs10 = cs6;
            continue;
        }
    }
}
