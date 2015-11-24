// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class az implements Runnable
{
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ CountDownLatch b;
    final /* synthetic */ ay c;
    
    az(final ay c, final AtomicReference a, final CountDownLatch b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.a.set(this.c.a());
        this.b.countDown();
    }
}
