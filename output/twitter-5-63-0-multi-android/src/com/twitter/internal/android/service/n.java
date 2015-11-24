// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayDeque;
import java.util.concurrent.AbstractExecutorService;

public class n extends AbstractExecutorService
{
    private final r a;
    private final ArrayDeque b;
    private final ReentrantLock c;
    private final Condition d;
    private q e;
    private boolean f;
    
    public n(final r a) {
        this.b = new ArrayDeque();
        this.c = new ReentrantLock();
        this.d = this.c.newCondition();
        this.f = false;
        this.a = a;
    }
    
    protected void a() {
        this.c.lock();
        try {
            final q e = this.b.poll();
            this.e = e;
            if (e != null) {
                this.a.submit(this.e);
            }
        }
        finally {
            this.c.unlock();
        }
    }
    
    @Override
    public boolean awaitTermination(final long n, final TimeUnit timeUnit) {
        long n2 = timeUnit.toNanos(n);
        this.c.lock();
        try {
            while (!this.isTerminated()) {
                if (n2 <= 0L) {
                    return false;
                }
                n2 = this.d.awaitNanos(n2);
            }
            return true;
        }
        finally {
            this.c.unlock();
        }
    }
    
    @Override
    public void execute(final Runnable runnable) {
        this.c.lock();
        try {
            if (this.isShutdown()) {
                throw new RejectedExecutionException();
            }
        }
        finally {
            this.c.unlock();
        }
        this.b.offer(new o(this, ((p)runnable).a, runnable));
        if (this.e == null) {
            this.a();
        }
        this.c.unlock();
    }
    
    @Override
    public boolean isShutdown() {
        return this.f;
    }
    
    @Override
    public boolean isTerminated() {
        return this.isShutdown() && this.b.isEmpty();
    }
    
    @Override
    protected RunnableFuture newTaskFor(final Runnable runnable, final Object o) {
        return new p((q)runnable, o);
    }
    
    @Override
    public void shutdown() {
        this.f = true;
    }
    
    @Override
    public List shutdownNow() {
        this.c.lock();
        final ArrayList<Object> list = new ArrayList<Object>(this.b.size());
        try {
            this.shutdown();
            while (!this.b.isEmpty()) {
                list.add(this.b.poll());
            }
        }
        finally {
            this.c.unlock();
        }
        this.c.unlock();
        return list;
    }
}
