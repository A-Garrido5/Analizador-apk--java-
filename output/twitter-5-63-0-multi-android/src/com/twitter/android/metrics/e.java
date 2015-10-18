// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

import android.os.SystemClock;

public class e extends b
{
    private LaunchTracker w;
    
    public e(final String s, final im im, final in in) {
        super(s, s, im, in);
        this.p = "TTFT";
        this.w = LaunchTracker.a();
    }
    
    public static e a(final ir ir, final long n) {
        ig ig = ir.a("home:first_tweet");
        if (ig == null) {
            ig = ir.d(new e("home:first_tweet", e.n, ir));
            ig.b(n);
        }
        return (e)ig;
    }
    
    private void a(final String o, final long t) {
        this.o = o;
        this.t = t;
        this.o();
    }
    
    @Override
    public void aq_() {
        if (!this.d || this.i) {
            this.n();
            return;
        }
        super.aq_();
        if (this.w.b()) {
            this.a("home:first_tweet_cache" + this.w.a(false), this.b);
            this.a("home:first_tweet_cache" + this.w.a(true), SystemClock.elapsedRealtime() - this.a);
            return;
        }
        this.n();
    }
    
    @Override
    protected void c() {
        this.w.c();
    }
    
    @Override
    public void g() {
        if (!this.e || this.i) {
            this.n();
            return;
        }
        super.g();
        if (this.w.b()) {
            this.a("home:first_tweet_api" + this.w.a(false), this.c);
            this.a("home:first_tweet_api" + this.w.a(true), SystemClock.elapsedRealtime() - this.a);
            return;
        }
        this.n();
    }
}
