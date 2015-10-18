// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Array;

final class dM
{
    private static final float[][] a;
    
    static {
        a = (float[][])Array.newInstance(Float.TYPE, ex.a.length, 8);
        for (int i = 0; i < ex.a.length; ++i) {
            int n = ex.a[i];
            final int n2 = n & 0x1;
            int j = 0;
            int n3 = n2;
            while (j < 8) {
                float n4 = 0.0f;
                while ((n & 0x1) == n3) {
                    ++n4;
                    n >>= 1;
                }
                n3 = (n & 0x1);
                dM.a[i][-1 + (8 - j)] = n4 / 17.0f;
                ++j;
            }
        }
    }
    
    private static int a(final int[] array) {
        final boolean b = fG.b;
        long n = 0L;
        int i = 0;
        while (i < array.length) {
            long n2 = n;
            int j = 0;
            while (j < array[i]) {
                final long n3 = n2 << 1;
                boolean b2;
                if (i % 2 == 0) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                n2 = (n3 | (b2 ? 1 : 0));
                ++j;
                if (b) {
                    break;
                }
            }
            n = n2;
            ++i;
            if (b) {
                break;
            }
        }
        return (int)n;
    }
    
    private static int b(final int[] array) {
        final boolean b = fG.b;
        final int a = ex.a(array);
        final float[] array2 = new float[8];
        int i = 0;
        while (i < array2.length) {
            array2[i] = array[i] / a;
            ++i;
            if (b) {
                break;
            }
        }
        float n = Float.MAX_VALUE;
        int n2 = -1;
        int j = 0;
        while (j < dM.a.length) {
            float n3 = 0.0f;
            final float[] array3 = dM.a[j];
            int k = 0;
            while (k < 8) {
                final float n4 = array3[k] - array2[k];
                n3 += n4 * n4;
                if (n3 >= n && !b) {
                    break;
                }
                ++k;
                if (b) {
                    break;
                }
            }
            if (n3 < n) {
                n2 = ex.a[j];
                n = n3;
            }
            ++j;
            if (b) {
                break;
            }
        }
        return n2;
    }
    
    private static int[] c(final int[] array) {
        int n = 0;
        final boolean b = fG.b;
        final float n2 = ex.a(array);
        final int[] array2 = new int[8];
        int i = 0;
        int n3 = 0;
        while (i < 17) {
            if (n + array[n3] <= n2 / 34.0f + n2 * i / 17.0f) {
                n += array[n3];
                ++n3;
            }
            ++array2[n3];
            ++i;
            if (b) {
                break;
            }
        }
        return array2;
    }
    
    private static int d(final int[] array) {
        final int a = a(array);
        if (ex.a(a) == -1) {
            return -1;
        }
        return a;
    }
    
    static int e(final int[] array) {
        final int d = d(c(array));
        if (d != -1) {
            return d;
        }
        return b(array);
    }
}
