// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.concurrent.CountDownLatch;

public final class r
{
    private final CountDownLatch a;
    private long b;
    private long c;
    
    r() {
        this.a = new CountDownLatch(1);
        this.b = -1L;
        this.c = -1L;
    }
    
    void a() {
        if (this.b != -1L) {
            throw new IllegalStateException();
        }
        this.b = System.nanoTime();
    }
    
    void b() {
        if (this.c != -1L || this.b == -1L) {
            throw new IllegalStateException();
        }
        this.c = System.nanoTime();
        this.a.countDown();
    }
    
    void c() {
        if (this.c != -1L || this.b == -1L) {
            throw new IllegalStateException();
        }
        this.c = this.b - 1L;
        this.a.countDown();
    }
}
