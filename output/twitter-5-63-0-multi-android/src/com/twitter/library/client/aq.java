// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.os.Looper;
import android.os.Handler;

public class aq
{
    private final Runnable a;
    private final Handler b;
    
    public aq(final Runnable runnable, final long n) {
        this.a = new ar(this, runnable, n);
        this.b = new Handler(Looper.getMainLooper());
    }
    
    public void a() {
        this.b.removeCallbacks(this.a);
    }
    
    public void a(final long n) {
        this.a();
        this.b(n);
    }
    
    void b(final long n) {
        this.b.postDelayed(this.a, n);
    }
}
