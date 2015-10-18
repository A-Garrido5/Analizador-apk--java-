// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import com.twitter.util.g;
import android.graphics.Color;

public class p
{
    public static float a(final ae ae) {
        final float[] b = ae.b();
        return b[1] * b[2];
    }
    
    public static int a(final int n) {
        return Math.round((299 * Color.red(n) + 587 * Color.green(n) + 114 * Color.blue(n)) / 1000.0f);
    }
    
    public static int a(final int n, final float n2) {
        return a(n, -16777216, n2);
    }
    
    public static int a(final int n, final int n2) {
        return Color.argb(n2, Color.red(n), Color.green(n), Color.blue(n));
    }
    
    public static int a(final int n, final int n2, final float n3) {
        final float n4 = 1.0f - n3;
        return Color.rgb((int)(n4 * Color.red(n) + n3 * Color.red(n2)), (int)(n4 * Color.green(n) + n3 * Color.green(n2)), (int)(n4 * Color.blue(n) + n3 * Color.blue(n2)));
    }
    
    private static int a(final int n, final int n2, final float n3, final boolean b) {
        if (n3 >= 1.0f) {
            return n2;
        }
        if (n3 <= 0.0f) {
            return n;
        }
        final double n4 = 0.5 * (3.141592653589793 * n3);
        double sin;
        if (b) {
            sin = 1.0 - Math.cos(n4);
        }
        else {
            sin = Math.sin(n4);
        }
        return d(n, n2, (float)sin);
    }
    
    public static int a(final ae ae, final ae ae2) {
        return Math.abs(a(ae.a()) - a(ae2.a()));
    }
    
    public static int a(String s, final int n) {
        Label_0097: {
            if (s == null) {
                break Label_0097;
            }
            try {
                if (s.length() == 4 || s.length() == 5) {
                    final char[] array = new char[-1 + 2 * s.length()];
                    array[0] = s.charAt(0);
                    for (int i = 1; i < s.length(); ++i) {
                        array[-1 + i * 2] = s.charAt(i);
                        array[i * 2] = s.charAt(i);
                    }
                    s = new String(array);
                }
                return Color.parseColor(s);
            }
            catch (Exception ex) {
                return n;
            }
        }
    }
    
    public static int b(final int n, final float n2) {
        return a(n, -1, n2);
    }
    
    public static int b(final int n, final int n2, final float n3) {
        return a(n, n2, n3, true);
    }
    
    public static int c(final int n, final float n2) {
        if (a(n) >= 128) {
            return a(n, n2);
        }
        return b(n, n2);
    }
    
    public static int c(final int n, final int n2, final float n3) {
        return a(n, n2, n3, false);
    }
    
    public static int d(final int n, final int n2, final float n3) {
        if (n3 >= 1.0f) {
            return n2;
        }
        if (n3 <= 0.0f) {
            return n;
        }
        final float[] array = new float[3];
        final float[] array2 = new float[3];
        final int alpha = Color.alpha(n);
        final int alpha2 = Color.alpha(n2);
        final float[] array3 = new float[3];
        Color.colorToHSV(n, array);
        Color.colorToHSV(n2, array2);
        for (int i = 0; i < 3; ++i) {
            array3[i] = g.a(array[i], array2[i], n3, true);
        }
        return Color.HSVToColor((int)g.a(alpha, alpha2, n3, true), array3);
    }
    
    public static ColorMatrixColorFilter d(final int n, final float n2) {
        return new ColorMatrixColorFilter(e(n, n2));
    }
    
    static ColorMatrix e(final int n, final float saturation) {
        final ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(saturation);
        final float[] array = colorMatrix.getArray();
        colorMatrix.set(new float[] { array[0] * Color.red(n) / 255.0f, array[1], array[2], array[3], array[4], array[5], array[6] * Color.green(n) / 255.0f, array[7], array[8], array[9], array[10], array[11], array[12] * Color.blue(n) / 255.0f, array[13], array[14], array[15], array[16], array[17], array[18], array[19] });
        return colorMatrix;
    }
    
    public static int f(final int n, final float n2) {
        final int n3 = (int)(255.0f * n2);
        final int n4 = 255 - n3;
        return Color.argb(Color.alpha(n), n3 + n4 * Color.red(n) / 255, n3 + n4 * Color.green(n) / 255, n3 + n4 * Color.blue(n) / 255);
    }
}
