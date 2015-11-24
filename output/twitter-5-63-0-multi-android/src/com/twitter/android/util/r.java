// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Comparator;
import java.util.Arrays;
import android.graphics.Bitmap;

public class r
{
    private static float a(final float... array) {
        float n = 0.0f;
        int i = 0;
        float n2 = 0.0f;
        while (i < array.length) {
            final float n3 = array[i];
            final float n4 = array[i + 1];
            n2 += n3 * n4;
            n += n4;
            i += 2;
        }
        return n2 / n;
    }
    
    private static int a(final ae ae) {
        if (p.a(ae.a()) >= 128) {
            return -16777216;
        }
        return -1;
    }
    
    private static int a(final ae[] array, final ae ae, final ae ae2) {
        for (final ae ae3 : array) {
            if (p.a(ae3, ae) >= 20 && p.a(ae3, ae2) >= 90) {
                return ae3.a();
            }
        }
        return p.c(ae2.a(), 0.45f);
    }
    
    private static ae a(final ae[] array, final ae ae) {
        final float n = ae.b()[0];
        for (final ae ae2 : array) {
            if (Math.abs(n - ae2.b()[0]) >= 120.0f) {
                return ae2;
            }
        }
        if (array.length > 1) {
            return array[1];
        }
        return null;
    }
    
    public static t a(final Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return a(c(bitmap));
    }
    
    private static t a(final ae[] array) {
        final ae ae = array[0];
        final ae a = a(array, ae);
        if (a == null) {
            return null;
        }
        return new t(ae.a(), a.a(), a(array, ae, a), b(array, ae), a(ae));
    }
    
    private static float b(final ae ae, final float n) {
        return a(p.a(ae), 2.0f, ae.c() / n, 1.0f);
    }
    
    private static int b(final ae[] array, final ae ae) {
        for (final ae ae2 : array) {
            if (p.a(ae2, ae) >= 135) {
                return ae2.a();
            }
        }
        if (p.a(ae.a()) >= 128) {
            return -16777216;
        }
        return -1;
    }
    
    public static int[] b(final Bitmap bitmap) {
        if (bitmap != null) {
            final ae[] c = c(bitmap);
            final ae ae = c[0];
            final ae a = a(c, ae);
            if (a != null) {
                return new int[] { ae.a(), a.a() };
            }
        }
        return null;
    }
    
    private static ae[] b(final ae[] array) {
        final ae[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2, new s(array[0].c()));
        return array2;
    }
    
    private static ae[] c(final Bitmap bitmap) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final int[] array = new int[width * height];
        bitmap.getPixels(array, 0, width, 0, 0, width, height);
        return b(new MedianCutQuantizer(array, 10).a());
    }
}
