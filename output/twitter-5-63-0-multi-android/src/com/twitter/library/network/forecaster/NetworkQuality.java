// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network.forecaster;

import com.twitter.util.units.bitrate.KilobitsPerSecond;

public enum NetworkQuality
{
    a("NONE", 0), 
    b("POOR", 1), 
    c("GOOD", 2), 
    d("GREAT", 3);
    
    public static final NetworkQuality e;
    private static final double[] f;
    private static final double[] g;
    
    static {
        e = NetworkQuality.c;
        f = new double[] { 100.0, 300.0 };
        g = new double[] { 300.0, 1000.0 };
    }
    
    private NetworkQuality(final String s, final int n) {
    }
    
    private static int a(final double n, final double[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (n <= array[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static NetworkQuality a(final NetworkQuality networkQuality, final NetworkQuality networkQuality2) {
        return values()[Math.min(networkQuality.ordinal(), networkQuality2.ordinal())];
    }
    
    public static NetworkQuality a(final boolean b, final KilobitsPerSecond kilobitsPerSecond, final NetworkQuality networkQuality) {
        return a(b, kilobitsPerSecond, networkQuality, NetworkQuality.f);
    }
    
    private static NetworkQuality a(final boolean b, final KilobitsPerSecond kilobitsPerSecond, final NetworkQuality networkQuality, final double[] array) {
        if (!b) {
            return NetworkQuality.a;
        }
        final int a = a(kilobitsPerSecond.doubleValue(), a(networkQuality, array));
        if (a == -1) {
            return NetworkQuality.d;
        }
        return values()[a + 1];
    }
    
    private static double[] a(final NetworkQuality networkQuality, final double[] array) {
        final double[] array2 = array.clone();
        final int n = -1 + networkQuality.ordinal();
        if (n - 1 >= 0) {
            final int n2 = n - 1;
            array2[n2] *= 0.9;
        }
        if (n >= 0 && n < array2.length) {
            array2[n] *= 1.1;
        }
        return array2;
    }
    
    public static NetworkQuality b(final boolean b, final KilobitsPerSecond kilobitsPerSecond, final NetworkQuality networkQuality) {
        return a(b, kilobitsPerSecond, networkQuality, NetworkQuality.g);
    }
}
