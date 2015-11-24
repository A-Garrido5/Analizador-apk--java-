// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound;

import android.os.SystemClock;
import android.os.Handler;

class g extends e
{
    private boolean c;
    private final Runnable d;
    private final Handler e;
    private long f;
    
    public g(final Handler e) {
        this.e = e;
        this.d = new d(this);
    }
    
    public static e a() {
        return new g(new Handler());
    }
    
    static boolean a(final g g) {
        return g.c;
    }
    
    static Runnable b(final g g) {
        return g.d;
    }
    
    static long c(final g g) {
        return g.f;
    }
    
    static Handler d(final g g) {
        return g.e;
    }
    
    @Override
    public void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f = SystemClock.uptimeMillis();
        this.e.removeCallbacks(this.d);
        this.e.post(this.d);
    }
    
    @Override
    public void b() {
        this.c = false;
        this.e.removeCallbacks(this.d);
    }
}
