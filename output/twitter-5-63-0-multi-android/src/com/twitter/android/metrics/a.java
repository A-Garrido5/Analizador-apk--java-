// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

import com.twitter.library.metrics.h;

public class a extends ix
{
    public a(final String s, final im im, final ir ir) {
        super(s, im, h.class.getSimpleName() + "app:ready", ir);
    }
    
    public static a a(final ir ir, final long n) {
        ig ig = ir.a("app:ready");
        if (ig == null) {
            ig = ir.d(new a("app:ready", a.n, ir));
            ig.b(n);
            ig.b("AppMetrics");
        }
        return (a)ig;
    }
    
    @Override
    public String a() {
        return "app:ready" + LaunchTracker.a().a(false);
    }
}
