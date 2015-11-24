// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import java.util.concurrent.TimeUnit;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CountDownLatch;
import android.os.Handler;

public abstract class ay
{
    public abstract Object a();
    
    public Object a(final Handler handler, final int n) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference<Object> atomicReference = new AtomicReference<Object>();
        final az az = new az(this, atomicReference, countDownLatch);
        if (Looper.myLooper() == handler.getLooper()) {
            az.run();
        }
        else {
            handler.post((Runnable)az);
            final long n2 = n;
            try {
                countDownLatch.await(n2, TimeUnit.SECONDS);
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        Object o = atomicReference.get();
        if (o == null) {
            o = this.a();
        }
        return o;
    }
}
