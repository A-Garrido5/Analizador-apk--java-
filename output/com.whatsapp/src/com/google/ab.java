// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

final class ab
{
    private final int[] a;
    private final int b;
    private final int c;
    private final int d;
    private final List e;
    private final int f;
    private final L g;
    private final float h;
    private final fs i;
    
    ab(final L g, final int c, final int d, final int b, final int f, final float h, final fs i) {
        this.g = g;
        this.e = new ArrayList(5);
        this.c = c;
        this.d = d;
        this.b = b;
        this.f = f;
        this.h = h;
        this.a = new int[3];
        this.i = i;
    }
    
    private float a(final int n, final int n2, final int n3, final int n4) {
        final int b = eJ.b;
        final L g = this.g;
        final int a = g.a();
        final int[] a2 = this.a;
        a2[0] = 0;
        a2[2] = (a2[1] = 0);
        int n5 = n;
        while (n5 >= 0 && g.a(n2, n5) && a2[1] <= n3) {
            ++a2[1];
            --n5;
            if (b != 0) {
                break;
            }
        }
        if (n5 >= 0 && a2[1] <= n3) {
            while (n5 >= 0 && !g.a(n2, n5) && a2[0] <= n3) {
                ++a2[0];
                --n5;
                if (b != 0) {
                    break;
                }
            }
            if (a2[0] <= n3) {
                int n6 = n + 1;
                while (n6 < a && g.a(n2, n6) && a2[1] <= n3) {
                    ++a2[1];
                    ++n6;
                    if (b != 0) {
                        break;
                    }
                }
                if (n6 != a && a2[1] <= n3) {
                    while (n6 < a && !g.a(n2, n6) && a2[2] <= n3) {
                        ++a2[2];
                        ++n6;
                        if (b != 0) {
                            break;
                        }
                    }
                    if (a2[2] <= n3 && 5 * Math.abs(a2[0] + a2[1] + a2[2] - n4) < n4 * 2) {
                        float a3;
                        if (this.a(a2)) {
                            a3 = a(a2, n6);
                        }
                        else {
                            a3 = Float.NaN;
                        }
                        return a3;
                    }
                }
            }
        }
        return Float.NaN;
    }
    
    private static float a(final int[] array, final int n) {
        return n - array[2] - array[1] / 2.0f;
    }
    
    private cZ a(final int[] array, final int n, final int n2) {
        final int b = eJ.b;
        final int n3 = array[0] + array[1] + array[2];
        final float a = a(array, n2);
        final float a2 = this.a(n, (int)a, 2 * array[1], n3);
        if (!Float.isNaN(a2)) {
            final float n4 = (array[0] + array[1] + array[2]) / 3.0f;
            for (final cZ cz : this.e) {
                if (cz.b(n4, a2, a)) {
                    return cz.a(a2, a, n4);
                }
                if (b != 0) {
                    break;
                }
            }
            final cZ cz2 = new cZ(a, a2, n4);
            this.e.add(cz2);
            if (this.i != null) {
                this.i.a(cz2);
            }
        }
        return null;
    }
    
    private boolean a(final int[] array) {
        final int b = eJ.b;
        final float h = this.h;
        final float n = h / 2.0f;
        int i = 0;
        while (i < 3) {
            if (Math.abs(h - array[i]) >= n) {
                return false;
            }
            ++i;
            if (b != 0) {
                break;
            }
        }
        return true;
    }
    
    cZ a() {
        final int b = eJ.b;
        final int c = this.c;
        final int f = this.f;
        final int n = c + this.b;
        final int n2 = this.d + f / 2;
        final int[] array = new int[3];
        int n7;
        for (int i = 0; i < f; i = n7) {
            int n3;
            if ((i & 0x1) == 0x0) {
                n3 = (i + 1) / 2;
            }
            else {
                n3 = -((i + 1) / 2);
            }
            final int n4 = n2 + n3;
            array[0] = 0;
            array[2] = (array[1] = 0);
            int n5 = c;
            while (n5 < n && !this.g.a(n5, n4)) {
                ++n5;
                if (b != 0) {
                    break;
                }
            }
            int j = n5;
            int n6 = 0;
            while (j < n) {
                Label_0276: {
                    if (this.g.a(j, n4)) {
                        if (n6 == 1) {
                            ++array[n6];
                            if (b == 0) {
                                break Label_0276;
                            }
                        }
                        if (n6 == 2) {
                            if (this.a(array)) {
                                final cZ cz = this.a(array, n4, j);
                                if (cz != null) {
                                    return cz;
                                }
                            }
                            array[0] = array[2];
                            array[1] = 1;
                            array[2] = 0;
                            if (b == 0) {
                                n6 = 1;
                                break Label_0276;
                            }
                            n6 = 1;
                        }
                        ++n6;
                        ++array[n6];
                        if (b == 0) {
                            break Label_0276;
                        }
                    }
                    if (n6 == 1) {
                        ++n6;
                    }
                    ++array[n6];
                }
                ++j;
                if (b != 0) {
                    break;
                }
            }
            if (this.a(array)) {
                final cZ cz = this.a(array, n4, n);
                if (cz != null) {
                    return cz;
                }
            }
            n7 = i + 1;
            if (b != 0) {
                break;
            }
        }
        if (!this.e.isEmpty()) {
            return this.e.get(0);
        }
        throw fv.a();
    }
}
