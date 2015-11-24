// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

public class g
{
    public static float a(final float n, final float n2) {
        return (float)Math.sqrt(n * n + n2 * n2);
    }
    
    public static float a(final float n, final float n2, final float n3) {
        return Math.min(Math.max(n, n2), n3);
    }
    
    public static float a(float n, final float n2, final float n3, final float n4, final float n5) {
        if (n2 + n < n4) {
            n = n4 - n2;
        }
        else if (n3 + n > n5) {
            return n5 - n3;
        }
        return n;
    }
    
    public static float a(final float n, final float n2, final float n3, final boolean b) {
        if (b) {
            if (n3 >= 1.0f) {
                return n2;
            }
            if (n3 <= 0.0f) {
                return n;
            }
        }
        return n * (1.0f - n3) + n2 * n3;
    }
    
    public static float a(float n, final int n2) {
        if (n > n2) {
            n = n2 * Math.round(n / n2);
        }
        return n;
    }
    
    public static int a(final int n, final int n2) {
        return (n2 + n % n2) % n2;
    }
    
    public static int a(final int n, final int n2, final int n3) {
        return Math.min(Math.max(n, n2), n3);
    }
    
    public static float b(final float n, final float n2, final float n3) {
        return n * (n2 + n * n3 / 2.0f);
    }
    
    public static boolean b(final int n, final int n2, final int n3) {
        return Math.abs(n - n2) <= Math.abs(n3);
    }
    
    public static float c(final float n, final float n2, final float n3) {
        float n4 = Float.NaN;
        if (n == 0.0f) {
            n4 = 0.0f;
        }
        else if (n3 == 0.0f) {
            if (n2 != 0.0f) {
                return Math.abs(n / n2);
            }
        }
        else {
            final float n5 = n2 * n2 + n * (2.0f * n3);
            if (n5 >= 0.0f) {
                final float n6 = (float)Math.sqrt(n5);
                final float n7 = (n6 - n2) / n3;
                final float n8 = -(n6 + n2) / n3;
                if (n7 >= 0.0f || n8 >= 0.0f) {
                    if (n7 < 0.0f || n8 < 0.0f) {
                        return Math.max(n7, n8);
                    }
                    return Math.min(n7, n8);
                }
            }
        }
        return n4;
    }
}
