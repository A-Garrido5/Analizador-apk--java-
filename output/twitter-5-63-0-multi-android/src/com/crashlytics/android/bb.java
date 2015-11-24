// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import java.util.concurrent.CountDownLatch;

final class bb
{
    private boolean a;
    private final CountDownLatch b;
    
    private bb(final d d) {
        this.a = false;
        this.b = new CountDownLatch(1);
    }
    
    final void a(final boolean a) {
        this.a = a;
        this.b.countDown();
    }
    
    final boolean a() {
        return this.a;
    }
    
    final void b() {
        try {
            this.b.await();
        }
        catch (InterruptedException ex) {}
    }
}
