// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class v
{
    private static float a(final float n, final float n2, final float n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static Bitmap a(final Bitmap bitmap, final int n, final int n2) {
        final int[] array = new int[bitmap.getWidth() * bitmap.getHeight()];
        bitmap.getPixels(array, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        a(array, new int[bitmap.getWidth() * bitmap.getHeight()], bitmap.getWidth(), bitmap.getHeight(), n, n2);
        final Bitmap bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap$Config.ARGB_8888);
        bitmap2.setPixels(array, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return bitmap2;
    }
    
    private static void a(final int[] array, final int[] array2, final int n, final int n2, final int n3) {
        final boolean l = Log.l;
        final int n4 = n - 1;
        final int n5 = 1 + n3 * 2;
        final int[] array3 = new int[n5 * 256];
        int i = 0;
        while (i < n5 * 256) {
            array3[i] = i / n5;
            ++i;
            if (l) {
                break;
            }
        }
        int j = 0;
        int n6 = 0;
        while (j < n2) {
            final int n7 = -n3;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            int k = n7;
            while (k <= n3) {
                final int n12 = array[n6 + (int)a(k, 0.0f, n - 1)];
                n11 += (0xFF & n12 >> 24);
                n10 += (0xFF & n12 >> 16);
                n9 += (0xFF & n12 >> 8);
                n8 += (n12 & 0xFF);
                ++k;
                if (l) {
                    break;
                }
            }
            int n13 = n10;
            int n14 = n11;
            int n15 = j;
            int n16 = 0;
            int n17 = n8;
            int n18 = n9;
            while (n16 < n) {
                array2[n15] = (array3[n14] << 24 | array3[n13] << 16 | array3[n18] << 8 | array3[n17]);
                final int n19 = 1 + (n16 + n3);
                int n20;
                if (n19 > n4) {
                    n20 = n4;
                }
                else {
                    n20 = n19;
                }
                int n21 = n16 - n3;
                if (n21 < 0) {
                    n21 = 0;
                }
                final int n22 = array[n20 + n6];
                final int n23 = array[n21 + n6];
                n14 += (0xFF & n22 >> 24) - (0xFF & n23 >> 24);
                n13 += (0xFF0000 & n22) - (0xFF0000 & n23) >> 16;
                n18 += (0xFF00 & n22) - (0xFF00 & n23) >> 8;
                final int n24 = n17 + ((n22 & 0xFF) - (n23 & 0xFF));
                final int n25 = n15 + n2;
                final int n26 = n16 + 1;
                if (l) {
                    break;
                }
                n16 = n26;
                n15 = n25;
                n17 = n24;
            }
            final int n27 = n6 + n;
            ++j;
            if (l) {
                break;
            }
            n6 = n27;
        }
    }
    
    public static void a(final int[] array, final int[] array2, final int n, final int n2, final int n3, final int n4) {
        final boolean l = Log.l;
        int i = 0;
        while (i < n4) {
            a(array, array2, n, n2, n3);
            a(array2, array, n2, n, n3);
            ++i;
            if (l) {
                break;
            }
        }
    }
}
