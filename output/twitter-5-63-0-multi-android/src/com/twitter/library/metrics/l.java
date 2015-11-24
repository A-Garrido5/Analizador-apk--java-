// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.library.scribe.performance.MemoryPerformanceScribeLog;
import com.twitter.library.scribe.performance.PerformanceScribeLog;

public class l
{
    public static PerformanceScribeLog a(final ih ih) {
        PerformanceScribeLog performanceScribeLog;
        if (ih instanceof jh) {
            final MemoryPerformanceScribeLog memoryPerformanceScribeLog = new MemoryPerformanceScribeLog(ih.a(), ih.x(), ((jh)ih).A());
            memoryPerformanceScribeLog.b(ih.u());
            performanceScribeLog = memoryPerformanceScribeLog;
        }
        else {
            performanceScribeLog = new PerformanceScribeLog(ih.a(), ih.x());
            final Long d = ih.d();
            if (ih instanceof ia || ih instanceof iu) {
                performanceScribeLog.b(ih.u(), d);
            }
            else if (d != null) {
                performanceScribeLog.a(ih.u(), d);
            }
            else {
                performanceScribeLog.c(ih.u());
            }
            final String t = ih.t();
            if (t != null) {
                performanceScribeLog.k(t);
                return performanceScribeLog;
            }
        }
        return performanceScribeLog;
    }
}
