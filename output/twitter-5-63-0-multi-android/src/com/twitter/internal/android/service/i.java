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
import android.os.Process;

class i extends q
{
    final /* synthetic */ AsyncService a;
    private final String b;
    private final a e;
    private final a f;
    private final m g;
    private final m h;
    private final x i;
    
    public i(final AsyncService a, final a e) {
        this.a = a;
        super(e.i());
        final String p2 = e.p();
        this.e = e;
        this.i = new x();
        this.b = p2;
        this.g = new m();
        i i;
        if (p2 != null) {
            i = a.e.put(p2, this);
        }
        else {
            i = null;
        }
        a e2;
        if (i != null) {
            e2 = i.e;
        }
        else {
            e2 = null;
        }
        this.f = e2;
        m g = null;
        if (i != null) {
            g = i.g;
        }
        this.h = g;
    }
    
    private boolean b() {
        try {
            this.i.a(this.e.d());
            return !this.c();
        }
        catch (InterruptedException ex) {
            return true;
        }
    }
    
    private boolean c() {
        final y d = this.e.d;
        boolean b = false;
        if (d != null) {
            final boolean a = d.a(this.i);
            b = false;
            if (a) {
                this.e.b(this.i);
                final s s = new s(this.a, this);
                final boolean a2 = this.e.a(s);
                b = false;
                if (a2) {
                    this.a.k.add(s);
                    this.a.c.a(s, d.b(this.i));
                    b = true;
                }
            }
        }
        return b;
    }
    
    private void d() {
        final int myTid = Process.myTid();
        if (Process.getThreadPriority(myTid) != 10) {
            Process.setThreadPriority(myTid, 10);
        }
    }
    
    private void e() {
        if (this.e.isCancelled() && this.i.b() == null) {
            this.i.a(this.e.c());
        }
        this.e.c(this.i);
        this.e.s();
        this.e.a(this.i);
        this.a.c.a(new h(this.e));
        this.g.b();
        if (this.b != null && this.a.e.get(this.b) == this) {
            synchronized (this.a.e) {
                if (this.a.e.get(this.b) == this) {
                    this.a.e.remove(this.b);
                }
            }
        }
    }
    
    public void a() {
        this.g.a();
    }
    
    public void a(final Runnable runnable) {
        if (this.h != null) {
            this.h.a(runnable);
            return;
        }
        runnable.run();
    }
    
    public void b(final Runnable runnable) {
        if (this.h != null) {
            this.h.b(runnable);
            return;
        }
        runnable.run();
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
        try {
            final d m = this.e.m();
            if (m != null) {
                m.b("blocking");
            }
            this.d();
            if (!this.e.r() || this.b()) {
                this.e();
            }
        }
        catch (Exception ex) {
            this.a.c.a(new j(ex));
        }
    }
}
