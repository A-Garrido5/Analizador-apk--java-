// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e2
{
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    
    static {
        a = new int[] { 0, 4, 1, 5 };
        c = new int[] { 6, 2, 7, 3 };
        d = new int[] { 8, 1, 1, 1, 1, 1, 1, 3 };
        b = new int[] { 7, 1, 1, 3, 1, 1, 1, 2, 1 };
    }
    
    private static float a(final int[] array, final int[] array2, final float n) {
        final boolean c = fH.c;
        final int length = array.length;
        int i = 0;
        int n2 = 0;
        int n3 = 0;
        while (i < length) {
            n3 += array[i];
            n2 += array2[i];
            ++i;
            if (c) {
                break;
            }
        }
        final int n4 = n3;
        if (n4 < n2) {
            return Float.POSITIVE_INFINITY;
        }
        final float n5 = n4 / n2;
        final float n6 = n * n5;
        int j = 0;
        float n7 = 0.0f;
        while (j < length) {
            final int n8 = array[j];
            final float n9 = n5 * array2[j];
            float n10;
            if (n8 > n9) {
                n10 = n8 - n9;
            }
            else {
                n10 = n9 - n8;
            }
            if (n10 > n6) {
                return Float.POSITIVE_INFINITY;
            }
            n7 += n10;
            final int n11 = j + 1;
            if (c) {
                break;
            }
            j = n11;
        }
        return n7 / n4;
    }
    
    public static fH a(final c1 c1, final Map map, final boolean b) {
        final boolean c2 = fH.c;
        L l = c1.c();
        List list = a(b, l);
        if (list.isEmpty()) {
            l = l.d();
            l.f();
            list = a(b, l);
        }
        final fH fh = new fH(l, list);
        if (c2) {
            ++fN.a;
        }
        return fh;
    }
    
    private static List a(final boolean b, final L l) {
        final boolean c = fH.c;
        final ArrayList<cs[]> list = new ArrayList<cs[]>();
        int n = 0;
        int n2 = 0;
        int i = 0;
        while (i < l.a()) {
            final cs[] a = a(l, i, n2);
            if (a[0] == null && a[3] == null) {
                if (n == 0 && !c) {
                    break;
                }
                for (final cs[] array : list) {
                    if (array[1] != null) {
                        i = (int)Math.max(i, array[1].b());
                    }
                    if (array[3] != null) {
                        i = Math.max(i, (int)array[3].b());
                    }
                    if (c) {
                        break;
                    }
                }
                final int n3 = i + 5;
                if (!c) {
                    i = n3;
                    n = 0;
                    n2 = 0;
                    continue;
                }
            }
            list.add(a);
            if (!b && !c) {
                break;
            }
            int n4 = 0;
            int n5 = 0;
            Label_0220: {
                if (a[2] != null) {
                    n4 = (int)a[2].a();
                    n5 = (int)a[2].b();
                    if (!c) {
                        break Label_0220;
                    }
                }
                n4 = (int)a[4].a();
                n5 = (int)a[4].b();
            }
            if (c) {
                break;
            }
            i = n5;
            n2 = n4;
            n = 1;
        }
        return list;
    }
    
    private static void a(final cs[] array, final cs[] array2, final int[] array3) {
        final boolean c = fH.c;
        int i = 0;
        while (i < array3.length) {
            array[array3[i]] = array2[i];
            ++i;
            if (c) {
                break;
            }
        }
    }
    
    private static int[] a(final L l, int n, final int n2, final int n3, final boolean b, final int[] array, final int[] array2) {
        final boolean c = fH.c;
        Arrays.fill(array2, 0, array2.length, 0);
        final int length = array.length;
        int n4 = 0;
        while (l.a(n, n2) && n > 0) {
            final int n5 = n4 + 1;
            if (n4 >= 3) {
                break;
            }
            --n;
            if (c) {
                break;
            }
            n4 = n5;
        }
        int n6 = 0;
        int i = n;
        int n7 = n;
        boolean b2 = b;
        while (true) {
            while (i < n3) {
                boolean b3 = false;
                int n8 = 0;
                Label_0219: {
                    if (b2 ^ l.a(i, n2)) {
                        ++array2[n6];
                        if (!c) {
                            b3 = b2;
                            n8 = n7;
                            break Label_0219;
                        }
                    }
                    Label_0197: {
                        if (n6 == length - 1) {
                            if (a(array2, array, 0.8f) < 0.42f) {
                                return new int[] { n7, i };
                            }
                            n7 += array2[0] + array2[1];
                            System.arraycopy(array2, 2, array2, 0, length - 2);
                            array2[length - 1] = (array2[length - 2] = 0);
                            --n6;
                            if (!c) {
                                break Label_0197;
                            }
                        }
                        ++n6;
                    }
                    array2[n6] = 1;
                    b3 = !b2;
                    n8 = n7;
                }
                final int n9 = i + 1;
                if (c) {
                    if (n6 == length - 1 && a(array2, array, 0.8f) < 0.42f) {
                        return new int[] { n8, n9 - 1 };
                    }
                    return null;
                }
                else {
                    i = n9;
                    n7 = n8;
                    b2 = b3;
                }
            }
            int n8 = n7;
            final int n9 = i;
            continue;
        }
    }
    
    private static cs[] a(final L l, final int n, final int n2) {
        final int a = l.a();
        final int g = l.g();
        final cs[] array = new cs[8];
        a(array, a(l, a, g, n, n2, e2.d), e2.a);
        int n3;
        int n4;
        if (array[4] != null) {
            n3 = (int)array[4].a();
            n4 = (int)array[4].b();
        }
        else {
            n3 = n2;
            n4 = n;
        }
        a(array, a(l, a, g, n4, n3, e2.b), e2.c);
        return array;
    }
    
    private static cs[] a(final L l, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final boolean c = fH.c;
        final cs[] array2 = new cs[4];
        int n5 = 0;
        final int[] array3 = new int[array.length];
        int i = n3;
        while (true) {
            int[] a;
            int[] array4;
            int j;
            int n6;
            int[] a2;
            int n7 = 0;
            int n8 = 0;
            int n9;
            int n10;
            int n11;
            int n12;
            int[] array5;
            int k;
            int[] a3;
            int n13 = 0;
            int n14;
            int n15;
            Label_0112_Outer:Label_0320_Outer:
            while (i < n) {
                a = a(l, n4, i, n2, false, array, array3);
                Label_0173: {
                    Label_0162: {
                        if (a != null) {
                            array4 = a;
                            j = i;
                        Label_0112:
                            while (true) {
                                while (j > 0) {
                                    n6 = j - 1;
                                    a2 = a(l, n4, n6, n2, false, array, array3);
                                    Label_0107: {
                                        if (a2 != null) {
                                            if (!c) {
                                                n7 = n6;
                                                break Label_0107;
                                            }
                                        }
                                        else {
                                            a2 = array4;
                                        }
                                        n7 = n6 + 1;
                                        if (!c) {
                                            break Label_0112;
                                        }
                                    }
                                    if (!c) {
                                        array4 = a2;
                                        j = n7;
                                        continue Label_0112_Outer;
                                    }
                                    array2[0] = new cs(a2[0], n7);
                                    array2[1] = new cs(a2[1], n7);
                                    n8 = 1;
                                    if (c) {
                                        i = n7;
                                        break Label_0162;
                                    }
                                    break Label_0173;
                                }
                                n7 = j;
                                a2 = array4;
                                continue Label_0112;
                            }
                        }
                        n8 = n5;
                    }
                    n7 = i + 5;
                    if (!c) {
                        n5 = n8;
                        i = n7;
                        continue;
                    }
                }
                n9 = n7;
                n10 = n8;
                n11 = n9 + 1;
                Label_0371: {
                    if (n10 != 0) {
                        n12 = 0;
                        array5 = new int[] { (int)array2[0].a(), (int)array2[1].a() };
                        k = n11;
                    Label_0320:
                        while (true) {
                            while (k < n) {
                                a3 = a(l, array5[0], k, n2, false, array, array3);
                                Label_0312: {
                                    if (a3 != null && Math.abs(array5[0] - a3[0]) < 5 && Math.abs(array5[1] - a3[1]) < 5) {
                                        n13 = 0;
                                        if (!c) {
                                            break Label_0312;
                                        }
                                    }
                                    else {
                                        a3 = array5;
                                        n13 = n12;
                                    }
                                    if (n13 > 25 && !c) {
                                        break Label_0320;
                                    }
                                    ++n13;
                                }
                                ++k;
                                if (!c) {
                                    array5 = a3;
                                    n12 = n13;
                                    continue Label_0320_Outer;
                                }
                                n14 = k - (n13 + 1);
                                array2[2] = new cs(a3[0], n14);
                                array2[3] = new cs(a3[1], n14);
                                n11 = n14;
                                break Label_0371;
                            }
                            a3 = array5;
                            n13 = n12;
                            continue Label_0320;
                        }
                    }
                }
                if (n11 - n9 < 10) {
                    n15 = 0;
                    while (n15 < array2.length) {
                        array2[n15] = null;
                        ++n15;
                        if (c) {
                            break;
                        }
                    }
                }
                return array2;
            }
            n10 = n5;
            n9 = i;
            continue;
        }
    }
}
