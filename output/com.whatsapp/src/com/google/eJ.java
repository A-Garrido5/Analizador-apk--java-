// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class eJ
{
    public static int b;
    private final L a;
    private final int[] c;
    private final List d;
    private boolean e;
    private final fs f;
    
    public eJ(final L a, final fs f) {
        this.a = a;
        this.d = new ArrayList();
        this.c = new int[5];
        this.f = f;
    }
    
    private float a(final int n, final int n2, final int n3, final int n4) {
        final int b = eJ.b;
        final L a = this.a;
        final int g = a.g();
        final int[] c = this.c();
        int n5 = n;
        while (n5 >= 0 && a.a(n5, n2)) {
            ++c[2];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (n5 < 0) {
            return Float.NaN;
        }
        while (n5 >= 0 && !a.a(n5, n2) && c[1] <= n3) {
            ++c[1];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (n5 < 0 || c[1] > n3) {
            return Float.NaN;
        }
        while (n5 >= 0 && a.a(n5, n2) && c[0] <= n3) {
            ++c[0];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (c[0] > n3) {
            return Float.NaN;
        }
        int n6 = n + 1;
        while (n6 < g && a.a(n6, n2)) {
            ++c[2];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (n6 == g) {
            return Float.NaN;
        }
        while (n6 < g && !a.a(n6, n2) && c[3] < n3) {
            ++c[3];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (n6 == g || c[3] >= n3) {
            return Float.NaN;
        }
        while (n6 < g && a.a(n6, n2) && c[4] < n3) {
            ++c[4];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (c[4] >= n3) {
            return Float.NaN;
        }
        if (5 * Math.abs(c[0] + c[1] + c[2] + c[3] + c[4] - n4) >= n4) {
            return Float.NaN;
        }
        if (a(c)) {
            return a(c, n6);
        }
        return Float.NaN;
    }
    
    private static float a(final int[] array, final int n) {
        return n - array[4] - array[3] - array[2] / 2.0f;
    }
    
    protected static boolean a(final int[] array) {
        int n = 1;
        final int b = eJ.b;
        int i = 0;
        int n2 = 0;
        while (i < 5) {
            final int n3 = array[i];
            if (n3 == 0) {
                return false;
            }
            n2 += n3;
            ++i;
            if (b != 0) {
                break;
            }
        }
        if (n2 >= 7) {
            final float n4 = n2 / 7.0f;
            final float n5 = n4 / 2.0f;
            if (Math.abs(n4 - array[0]) >= n5 || Math.abs(n4 - array[n]) >= n5 || Math.abs(3.0f * n4 - array[2]) >= 3.0f * n5 || Math.abs(n4 - array[3]) >= n5 || Math.abs(n4 - array[4]) >= n5) {
                n = 0;
            }
            return n != 0;
        }
        return false;
    }
    
    private cN[] a() {
        float n = 0.0f;
        final int b = eJ.b;
        final int size = this.d.size();
        if (size < 3) {
            throw fv.a();
        }
        Label_0231: {
            if (size > 3) {
                final Iterator<cN> iterator = (Iterator<cN>)this.d.iterator();
                float n2 = 0.0f;
                float n3 = 0.0f;
                while (true) {
                    while (iterator.hasNext()) {
                        final float c = iterator.next().c();
                        n3 += c;
                        final float n4 = n2 + c * c;
                        if (b != 0) {
                            final float n5 = n3 / size;
                            final float n6 = (float)Math.sqrt(n4 / size - n5 * n5);
                            Collections.sort((List<Object>)this.d, new gE(n5, null));
                            final float max = Math.max(0.2f * n5, n6);
                            int n8;
                            for (int n7 = 0; n7 < this.d.size() && this.d.size() > 3; n7 = n8) {
                                if (Math.abs(((cN)this.d.get(n7)).c() - n5) > max) {
                                    this.d.remove(n7);
                                    --n7;
                                }
                                n8 = n7 + 1;
                                if (b != 0) {
                                    break;
                                }
                            }
                            break Label_0231;
                        }
                        n2 = n4;
                    }
                    final float n4 = n2;
                    continue;
                }
            }
        }
        if (this.d.size() > 3) {
            final Iterator<cN> iterator2 = (Iterator<cN>)this.d.iterator();
            while (iterator2.hasNext()) {
                n += iterator2.next().c();
                if (b != 0) {
                    break;
                }
            }
            Collections.sort((List<Object>)this.d, new gs(n / this.d.size(), null));
            this.d.subList(3, this.d.size()).clear();
        }
        return new cN[] { this.d.get(0), this.d.get(1), this.d.get(2) };
    }
    
    private float b(final int n, final int n2, final int n3, final int n4) {
        final int b = eJ.b;
        final L a = this.a;
        final int a2 = a.a();
        final int[] c = this.c();
        int n5 = n;
        while (n5 >= 0 && a.a(n2, n5)) {
            ++c[2];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (n5 < 0) {
            return Float.NaN;
        }
        while (n5 >= 0 && !a.a(n2, n5) && c[1] <= n3) {
            ++c[1];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (n5 < 0 || c[1] > n3) {
            return Float.NaN;
        }
        while (n5 >= 0 && a.a(n2, n5) && c[0] <= n3) {
            ++c[0];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (c[0] > n3) {
            return Float.NaN;
        }
        int n6 = n + 1;
        while (n6 < a2 && a.a(n2, n6)) {
            ++c[2];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (n6 == a2) {
            return Float.NaN;
        }
        while (n6 < a2 && !a.a(n2, n6) && c[3] < n3) {
            ++c[3];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (n6 == a2 || c[3] >= n3) {
            return Float.NaN;
        }
        while (n6 < a2 && a.a(n2, n6) && c[4] < n3) {
            ++c[4];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (c[4] >= n3) {
            return Float.NaN;
        }
        if (5 * Math.abs(c[0] + c[1] + c[2] + c[3] + c[4] - n4) >= n4 * 2) {
            return Float.NaN;
        }
        if (a(c)) {
            return a(c, n6);
        }
        return Float.NaN;
    }
    
    private int b() {
        final int b = eJ.b;
        if (this.d.size() <= 1) {
            return 0;
        }
        cN cn = null;
        for (final cN cn2 : this.d) {
            Label_0110: {
                if (cn2.d() >= 2) {
                    if (cn == null) {
                        if (b == 0) {
                            cn = cn2;
                            break Label_0110;
                        }
                        cn = cn2;
                    }
                    this.e = true;
                    return (int)(Math.abs(cn.a() - cn2.a()) - Math.abs(cn.b() - cn2.b())) / 2;
                }
            }
            if (b != 0) {
                break;
            }
        }
        return 0;
    }
    
    private boolean c(final int n, final int n2, final int n3, final int n4) {
        final int b = eJ.b;
        final int[] c = this.c();
        int n5 = 0;
        while (n >= n5 && n2 >= n5 && this.a.a(n2 - n5, n - n5)) {
            ++c[2];
            ++n5;
            if (b != 0) {
                break;
            }
        }
        if (n < n5 || n2 < n5) {
            return false;
        }
        while (n >= n5 && n2 >= n5 && !this.a.a(n2 - n5, n - n5) && c[1] <= n3) {
            ++c[1];
            ++n5;
            if (b != 0) {
                break;
            }
        }
        if (n < n5 || n2 < n5 || c[1] > n3) {
            return false;
        }
        while (n >= n5 && n2 >= n5 && this.a.a(n2 - n5, n - n5) && c[0] <= n3) {
            ++c[0];
            ++n5;
            if (b != 0) {
                break;
            }
        }
        if (c[0] > n3) {
            return false;
        }
        final int a = this.a.a();
        final int g = this.a.g();
        int n6 = 1;
        while (n + n6 < a && n2 + n6 < g && this.a.a(n2 + n6, n + n6)) {
            ++c[2];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (n + n6 >= a || n2 + n6 >= g) {
            return false;
        }
        while (n + n6 < a && n2 + n6 < g && !this.a.a(n2 + n6, n + n6) && c[3] < n3) {
            ++c[3];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        if (n + n6 >= a || n2 + n6 >= g || c[3] >= n3) {
            return false;
        }
        while (n + n6 < a && n2 + n6 < g && this.a.a(n2 + n6, n + n6) && c[4] < n3) {
            ++c[4];
            ++n6;
            if (b != 0) {
                break;
            }
        }
        return c[4] < n3 && (Math.abs(c[0] + c[1] + c[2] + c[3] + c[4] - n4) < n4 * 2 && a(c));
    }
    
    private int[] c() {
        this.c[0] = 0;
        this.c[1] = 0;
        this.c[2] = 0;
        this.c[3] = 0;
        this.c[4] = 0;
        return this.c;
    }
    
    private boolean d() {
        float n = 0.0f;
        final int b = eJ.b;
        final int size = this.d.size();
        final Iterator<cN> iterator = (Iterator<cN>)this.d.iterator();
        float n2 = 0.0f;
        int n3 = 0;
        while (iterator.hasNext()) {
            final cN cn = iterator.next();
            float n5;
            int n6;
            if (cn.d() >= 2) {
                final int n4 = n3 + 1;
                n5 = n2 + cn.c();
                n6 = n4;
            }
            else {
                n5 = n2;
                n6 = n3;
            }
            if (b != 0) {
                n3 = n6;
                n2 = n5;
                break;
            }
            n3 = n6;
            n2 = n5;
        }
        if (n3 >= 3) {
            final float n7 = n2 / size;
            final Iterator<cN> iterator2 = (Iterator<cN>)this.d.iterator();
            while (iterator2.hasNext()) {
                n += Math.abs(iterator2.next().c() - n7);
                if (b != 0) {
                    break;
                }
            }
            if (n <= 0.05f * n2) {
                return true;
            }
        }
        return false;
    }
    
    final cS a(final Map map) {
        final int b = eJ.b;
        boolean b2;
        if (map != null && map.containsKey(bj.TRY_HARDER)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final boolean b3 = map != null && map.containsKey(bj.PURE_BARCODE);
        final int a = this.a.a();
        final int g = this.a.g();
        int n = a * 3 / 228;
        if (n < 3 || b2) {
            n = 3;
        }
        int d = 0;
        final int[] array = new int[5];
        int n2 = n - 1;
        int n3 = n;
        while (n2 < a && d == 0) {
            array[0] = 0;
            array[2] = (array[1] = 0);
            array[4] = (array[3] = 0);
            int n4 = 0;
            int i = 0;
            while (i < g) {
                Label_0481: {
                    if (this.a.a(i, n2)) {
                        if ((n4 & 0x1) == 0x1) {
                            ++n4;
                        }
                        ++array[n4];
                        if (b == 0) {
                            break Label_0481;
                        }
                    }
                    if ((n4 & 0x1) == 0x0) {
                        Label_0450: {
                            if (n4 == 4) {
                                int d2 = 0;
                                int n14 = 0;
                                Label_0589: {
                                    if (a(array)) {
                                        Label_0365: {
                                            int n7;
                                            int n9;
                                            int n10;
                                            int n11;
                                            if (this.a(array, n2, i, b3)) {
                                                n3 = 2;
                                                if (this.e) {
                                                    d2 = (this.d() ? 1 : 0);
                                                    if (b == 0) {
                                                        break Label_0365;
                                                    }
                                                }
                                                else {
                                                    d2 = d;
                                                }
                                                final int b4 = this.b();
                                                int n5;
                                                int n6;
                                                if (b4 > array[2]) {
                                                    n5 = n2 + (b4 - array[2] - n3);
                                                    n6 = g - 1;
                                                }
                                                else {
                                                    n6 = i;
                                                    n5 = n2;
                                                }
                                                if (b == 0) {
                                                    n2 = n5;
                                                    i = n6;
                                                    break Label_0365;
                                                }
                                                n7 = n3;
                                                final int n8 = n5;
                                                n9 = d2;
                                                n10 = n6;
                                                n11 = n8;
                                            }
                                            else {
                                                n10 = i;
                                                n9 = d;
                                                n11 = n2;
                                                n7 = n3;
                                            }
                                            array[0] = array[2];
                                            array[1] = array[3];
                                            array[2] = array[4];
                                            array[3] = 1;
                                            array[4] = 0;
                                            if (b == 0) {
                                                final int n12 = n10;
                                                n4 = 3;
                                                n3 = n7;
                                                n2 = n11;
                                                d = n9;
                                                i = n12;
                                                break Label_0481;
                                            }
                                            n3 = n7;
                                            n2 = n11;
                                            final int n13 = n9;
                                            i = n10;
                                            d2 = n13;
                                        }
                                        array[0] = 0;
                                        array[2] = (array[1] = 0);
                                        array[4] = (array[3] = 0);
                                        n14 = 0;
                                        if (b == 0) {
                                            break Label_0589;
                                        }
                                    }
                                    else {
                                        d2 = d;
                                    }
                                    array[0] = array[2];
                                    array[1] = array[3];
                                    array[2] = array[4];
                                    array[3] = 1;
                                    array[4] = 0;
                                    n14 = 3;
                                    if (b != 0) {
                                        final int n15 = n14;
                                        d = d2;
                                        n4 = n15;
                                        break Label_0450;
                                    }
                                }
                                final int n16 = n14;
                                d = d2;
                                n4 = n16;
                                break Label_0481;
                            }
                        }
                        ++n4;
                        ++array[n4];
                        if (b == 0) {
                            break Label_0481;
                        }
                    }
                    ++array[n4];
                }
                ++i;
                if (b != 0) {
                    break;
                }
            }
            if (a(array) && this.a(array, n2, g, b3)) {
                n3 = array[0];
                if (this.e) {
                    d = (this.d() ? 1 : 0);
                }
            }
            n2 += n3;
            if (b != 0) {
                break;
            }
        }
        final cN[] a2 = this.a();
        cs.a(a2);
        final cS cs = new cS(a2);
        if (fN.a != 0) {
            eJ.b = b + 1;
        }
        return cs;
    }
    
    protected final boolean a(final int[] array, final int n, final int n2, final boolean b) {
        final int b2 = eJ.b;
        final int n3 = array[0] + array[1] + array[2] + array[3] + array[4];
        final float a = a(array, n2);
        final float b3 = this.b(n, (int)a, array[2], n3);
        final boolean naN = Float.isNaN(b3);
        boolean b4 = false;
        if (!naN) {
            final float a2 = this.a((int)a, (int)b3, array[2], n3);
            final boolean naN2 = Float.isNaN(a2);
            b4 = false;
            if (!naN2) {
                if (b) {
                    final boolean c = this.c((int)b3, (int)a2, array[2], n3);
                    b4 = false;
                    if (!c) {
                        return b4;
                    }
                }
                final float n4 = n3 / 7.0f;
                int i = 0;
                int n5 = 0;
                while (i < this.d.size()) {
                    final cN cn = this.d.get(i);
                    if (cn.b(n4, b3, a2)) {
                        this.d.set(i, cn.a(b3, a2, n4));
                        if (b2 == 0) {
                            n5 = 1;
                            break;
                        }
                        n5 = 1;
                    }
                    final int n6 = i + 1;
                    if (b2 != 0) {
                        break;
                    }
                    i = n6;
                }
                if (n5 == 0) {
                    final cN cn2 = new cN(a2, b3, n4);
                    this.d.add(cn2);
                    if (this.f != null) {
                        this.f.a(cn2);
                    }
                }
                b4 = true;
            }
        }
        return b4;
    }
}
