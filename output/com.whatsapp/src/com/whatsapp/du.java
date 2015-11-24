// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.util.concurrent.CountDownLatch;

class du implements Runnable
{
    final vy a;
    final CountDownLatch b;
    final bi c;
    
    du(final vy a, final bi c, final CountDownLatch b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        vy.f(this.a).a(this.c);
        this.b.countDown();
    }
}
