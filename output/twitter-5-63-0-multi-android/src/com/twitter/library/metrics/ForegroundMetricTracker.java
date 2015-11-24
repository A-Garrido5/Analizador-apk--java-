// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.library.client.ad;
import java.util.WeakHashMap;
import com.twitter.library.client.af;
import java.util.Map;

public class ForegroundMetricTracker
{
    private static Map a;
    private static boolean b;
    private static af c;
    
    static {
        ForegroundMetricTracker.a = new WeakHashMap();
        ForegroundMetricTracker.b = false;
        ForegroundMetricTracker.c = new c();
    }
    
    public static void a(final ig ig) {
        synchronized (ForegroundMetricTracker.a) {
            ForegroundMetricTracker.a.remove(ig);
            if (ForegroundMetricTracker.a.isEmpty()) {
                ad.a().b(ForegroundMetricTracker.c);
                ForegroundMetricTracker.b = false;
            }
        }
    }
    
    public static void a(final ig ig, final ForegroundMetricTracker$BackgroundBehavior foregroundMetricTracker$BackgroundBehavior) {
        synchronized (ForegroundMetricTracker.a) {
            if (!ForegroundMetricTracker.b) {
                ad.a().a(ForegroundMetricTracker.c);
                ForegroundMetricTracker.b = true;
            }
            ForegroundMetricTracker.a.put(ig, new d(foregroundMetricTracker$BackgroundBehavior));
        }
    }
}
