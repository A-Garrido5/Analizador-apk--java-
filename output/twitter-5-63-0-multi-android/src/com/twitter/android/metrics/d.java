// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

import com.twitter.library.metrics.e;

public class d extends e
{
    private int a;
    
    public d(final in in) {
        super("bellbird_profile_tweets_tab:complete", ih.n, ig.a("BellbirdProfileMetric", "bellbird_profile_tweets_tab:complete"), in);
        this.p = "BellbirdProfileMetric";
    }
    
    public static d a(final long n, final ir ir, final boolean b) {
        d d = (d)ir.a(ig.a("BellbirdProfileMetric", "bellbird_profile_tweets_tab:complete"));
        if (d == null && b) {
            d = new d(ir);
            d.b(n);
            ir.d(d);
        }
        return d;
    }
    
    public void a(final int n) {
        this.a |= n;
        if (this.a == 3) {
            this.j();
        }
    }
}
