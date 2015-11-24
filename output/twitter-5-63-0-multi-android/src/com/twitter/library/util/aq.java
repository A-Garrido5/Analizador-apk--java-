// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ThreadPoolExecutor;

public class aq extends ThreadPoolExecutor
{
    private final ReentrantLock a;
    private final Condition b;
    private boolean c;
    
    public aq(final int n, final int n2, final long n3, final TimeUnit timeUnit, final BlockingQueue blockingQueue) {
        super(n, n2, n3, timeUnit, blockingQueue);
        this.a = new ReentrantLock();
        this.b = this.a.newCondition();
    }
    
    public void a() {
        this.purge();
        this.a.lock();
        try {
            this.c = true;
        }
        finally {
            this.a.unlock();
        }
    }
    
    public void b() {
        this.purge();
        this.a.lock();
        try {
            this.c = false;
            this.b.signalAll();
        }
        finally {
            this.a.unlock();
        }
    }
    
    @Override
    protected void beforeExecute(final Thread thread, final Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.a.lock();
        try {
            while (this.c) {
                this.b.await();
            }
        }
        catch (InterruptedException ex) {
            thread.interrupt();
        }
        finally {
            this.a.unlock();
        }
    }
    
    @Override
    public List shutdownNow() {
        this.b();
        return super.shutdownNow();
    }
}
