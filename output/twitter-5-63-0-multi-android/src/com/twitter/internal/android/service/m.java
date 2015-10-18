// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

class m
{
    private final Map a;
    private int b;
    
    public m() {
        this.a = new ConcurrentHashMap();
        this.b = 0;
    }
    
    private void a(final int b) {
        synchronized (this) {
            if (b > this.b) {
                this.b = b;
            }
            final Runnable runnable = this.a.remove(b);
            // monitorexit(this)
            if (runnable != null) {
                runnable.run();
            }
        }
    }
    
    private void a(final int n, final Runnable runnable) {
        synchronized (this) {
            boolean b;
            if (n <= this.b) {
                b = true;
            }
            else {
                b = false;
            }
            if (!b) {
                this.a.put(n, runnable);
            }
            // monitorexit(this)
            if (b && runnable != null) {
                runnable.run();
            }
        }
    }
    
    public void a() {
        this.a(1);
    }
    
    public void a(final Runnable runnable) {
        this.a(1, runnable);
    }
    
    public void b() {
        this.a(2);
    }
    
    public void b(final Runnable runnable) {
        this.a(2, runnable);
    }
}
