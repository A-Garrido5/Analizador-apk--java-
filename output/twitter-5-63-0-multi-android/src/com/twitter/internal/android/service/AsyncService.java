// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.os.Process;
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

public class AsyncService extends Service
{
    private static final String a;
    private static final AtomicLong b;
    private final l c;
    private final IBinder d;
    private final Map e;
    private r f;
    private r g;
    private r h;
    private r i;
    private n j;
    private final Set k;
    
    static {
        a = AsyncService.class.getSimpleName();
        b = new AtomicLong(0L);
    }
    
    public AsyncService() {
        this.d = (IBinder)new t(this);
        this.e = new ConcurrentHashMap();
        this.c = new l(this, Looper.getMainLooper());
        this.k = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
    }
    
    public AsyncService(final r f, final r g, final r h, final r i, final l c) {
        this.d = (IBinder)new t(this);
        this.e = new ConcurrentHashMap();
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.c = c;
        this.j = new n(this.g);
        this.k = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
    }
    
    private Future a(final ExecutorService executorService, final Runnable runnable) {
        try {
            return executorService.submit(runnable);
        }
        catch (RejectedExecutionException ex) {
            Log.w(AsyncService.a, "Attempt to submit a job during shutdown", (Throwable)ex);
            return null;
        }
    }
    
    public void a(final a a) {
        if (a != null && a.q()) {
            final i i = new i(this, a);
            a.n();
            i.a(new e(this, a.a(i.f), a, i));
        }
    }
    
    void a(final i i) {
        final a b = i.e;
        AbstractExecutorService abstractExecutorService = null;
        switch (b.j()) {
            default: {
                abstractExecutorService = this.f;
                break;
            }
            case 2: {
                abstractExecutorService = this.g;
                break;
            }
            case 3: {
                abstractExecutorService = this.h;
                break;
            }
            case 4: {
                abstractExecutorService = this.i;
                break;
            }
            case 5: {
                abstractExecutorService = this.j;
                break;
            }
        }
        final d m = b.m();
        if (m != null) {
            m.a("blocking");
        }
        b.a(this.a(abstractExecutorService, i));
    }
    
    public void a(final u u) {
        this.a(this.h, new k(u, this.k));
    }
    
    public IBinder onBind(final Intent intent) {
        return this.d;
    }
    
    public void onCreate() {
        super.onCreate();
        this.f = new r(5);
        this.g = new r(3);
        this.h = new r(2);
        this.i = new r(1);
        this.j = new n(this.g);
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.f.shutdownNow();
        this.g.shutdownNow();
        this.h.shutdownNow();
        this.i.shutdownNow();
        this.j.shutdownNow();
        this.k.clear();
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        throw new UnsupportedOperationException("By default, AsyncService is strictly a bound service and does not support starting with Context.startService()");
    }
}
