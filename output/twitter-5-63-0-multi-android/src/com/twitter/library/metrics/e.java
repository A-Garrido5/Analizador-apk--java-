// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

public class e extends ix
{
    public e(final String s, final im im, final String s2, final in in) {
        super(s, im, s2, in);
        ForegroundMetricTracker.a(this, ForegroundMetricTracker$BackgroundBehavior.a);
    }
    
    public static e b(final String s, final ir ir, final long n, final im im) {
        return b(s, ir, n, im, ig.a("ForegroundTimingMetric", s));
    }
    
    public static e b(final String s, final ir ir, final long n, final im im, final String s2) {
        ig ig = ir.a(s2);
        if (ig == null) {
            ig = ir.d(new e(s, im, s2, ir));
            ig.b(n);
        }
        return (e)ig;
    }
    
    public static e b(final String s, final ir ir, final im im) {
        return b(s, ir, 0L, im, ig.a("ForegroundTimingMetric", s));
    }
}
