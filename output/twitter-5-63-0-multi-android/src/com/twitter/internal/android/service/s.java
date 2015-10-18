// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.content.Intent;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.RejectedExecutionException;
import android.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.Collections;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Map;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicLong;
import android.app.Service;

public class s implements Runnable
{
    final /* synthetic */ AsyncService a;
    private i b;
    private boolean c;
    
    public s(final AsyncService a, final i b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public void run() {
        this.a.k.remove(this);
        this.a.c.b(this);
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            // monitorexit(this)
            this.a.a(this.b);
            this.b = null;
        }
    }
}
