// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.util.Pair;
import java.util.LinkedList;

public class UrlNetworkStats
{
    private static final LinkedList a;
    private static UrlNetworkStats$NetworkQuality b;
    private static long c;
    private static int d;
    private static long e;
    
    static {
        a = new LinkedList();
        UrlNetworkStats.b = UrlNetworkStats$NetworkQuality.d;
        UrlNetworkStats.c = 0L;
        UrlNetworkStats.d = 0;
        UrlNetworkStats.e = 0L;
    }
    
    public static int a(final int n, final int n2) {
        if (n2 == 0) {
            return 0;
        }
        final int round = Math.round(1000.0f * (n / n2));
        final long currentTimeMillis = System.currentTimeMillis();
        a(round, currentTimeMillis);
        final int d = UrlNetworkStats.d;
        int abs = 0;
        if (d != 0) {
            abs = 0;
            if (round != 0) {
                final long n3 = lcmp(currentTimeMillis - UrlNetworkStats.e, 30000L);
                abs = 0;
                if (n3 < 0) {
                    abs = Math.abs(d - round);
                }
            }
        }
        UrlNetworkStats.e = currentTimeMillis;
        return abs;
    }
    
    private static void a(final int n, final long n2) {
        synchronized (UrlNetworkStats.class) {
            if (UrlNetworkStats.a.size() >= 10) {
                UrlNetworkStats.a.remove();
            }
            UrlNetworkStats.a.add(new Pair((Object)n, (Object)n2));
        }
    }
}
