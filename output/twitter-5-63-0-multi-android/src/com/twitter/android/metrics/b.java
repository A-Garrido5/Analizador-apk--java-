// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

import android.os.SystemClock;
import com.twitter.library.metrics.ForegroundMetricTracker;
import com.twitter.library.metrics.ForegroundMetricTracker$BackgroundBehavior;

public class b extends ig
{
    long a;
    long b;
    long c;
    boolean d;
    boolean e;
    private long w;
    private long x;
    
    public b(final String s, final String s2, final im im, final in in) {
        super(s, im, s2, in, false);
        ForegroundMetricTracker.a(this, ForegroundMetricTracker$BackgroundBehavior.a);
    }
    
    public void ap_() {
        this.d = true;
        this.w = SystemClock.elapsedRealtime();
    }
    
    public void aq_() {
        if (this.d) {
            this.b = SystemClock.elapsedRealtime() - this.w;
            this.d = false;
        }
    }
    
    @Override
    protected void b() {
        this.a = SystemClock.elapsedRealtime();
        super.b();
    }
    
    @Override
    protected void c() {
        super.c();
        this.o();
    }
    
    public void f() {
        this.e = true;
        this.x = SystemClock.elapsedRealtime();
    }
    
    public void g() {
        if (this.e) {
            this.c = SystemClock.elapsedRealtime() - this.x;
            this.e = false;
        }
    }
}
