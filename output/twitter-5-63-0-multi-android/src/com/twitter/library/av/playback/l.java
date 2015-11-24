// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledFuture;

public class l
{
    final f a;
    final AVMediaPlayer b;
    final Runnable c;
    ScheduledFuture d;
    ScheduledThreadPoolExecutor e;
    final AtomicBoolean f;
    
    public l(final AVMediaPlayer b) {
        this.e = new ScheduledThreadPoolExecutor(1);
        this.f = new AtomicBoolean(false);
        this.b = b;
        this.a = b.c();
        this.c = this.d();
    }
    
    public void a() {
        this.f.set(false);
        if (this.d == null) {
            this.d = this.e.scheduleAtFixedRate(this.c, 10L, 10L, TimeUnit.MILLISECONDS);
        }
    }
    
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        this.e.execute(new o(this, avPlayer$PlayerStartType));
    }
    
    public void b() {
        this.f.set(true);
        if (this.d != null) {
            this.d.cancel(true);
            this.d = null;
        }
    }
    
    public void c() {
        this.b();
        this.e.shutdown();
    }
    
    Runnable d() {
        return new m(this);
    }
    
    public void e() {
        this.e.execute(new n(this));
    }
}
