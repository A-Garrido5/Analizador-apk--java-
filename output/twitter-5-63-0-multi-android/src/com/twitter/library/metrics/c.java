// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.library.client.ad;
import java.util.WeakHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.app.Activity;
import com.twitter.library.client.af;

final class c implements af
{
    @Override
    public void a(final Activity activity) {
        while (true) {
            while (true) {
                ig ig = null;
                d d = null;
                Label_0094: {
                    synchronized (ForegroundMetricTracker.a) {
                        final HashMap<ig, Object> hashMap = new HashMap<ig, Object>(ForegroundMetricTracker.a);
                        // monitorexit(ForegroundMetricTracker.a())
                        final Iterator<ig> iterator = hashMap.keySet().iterator();
                        while (iterator.hasNext()) {
                            ig = iterator.next();
                            d = hashMap.get(ig);
                            if (d.a != ForegroundMetricTracker$BackgroundBehavior.a) {
                                break Label_0094;
                            }
                            ig.k();
                            ForegroundMetricTracker.a(ig);
                        }
                        break;
                    }
                }
                d.b = ig.l();
                ig.j();
                continue;
            }
        }
    }
    
    @Override
    public void b(final Activity activity) {
        while (true) {
            while (true) {
                final HashMap<ig, Object> hashMap;
                ig ig = null;
                Label_0075: {
                    synchronized (ForegroundMetricTracker.a) {
                        hashMap = new HashMap<ig, Object>(ForegroundMetricTracker.a);
                        // monitorexit(ForegroundMetricTracker.a())
                        final Iterator<ig> iterator = hashMap.keySet().iterator();
                        while (iterator.hasNext()) {
                            ig = iterator.next();
                            if (!ig.m()) {
                                break Label_0075;
                            }
                            ForegroundMetricTracker.a(ig);
                        }
                        break;
                    }
                }
                final d d = hashMap.get(ig);
                if (d.a == ForegroundMetricTracker$BackgroundBehavior.c && d.b) {
                    ig.i();
                    continue;
                }
                continue;
            }
        }
    }
}
