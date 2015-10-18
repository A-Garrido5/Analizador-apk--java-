// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import java.util.concurrent.TimeUnit;
import com.twitter.util.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class k extends FutureTask
{
    private static final k a;
    private static final k b;
    private static final Callable c;
    
    static {
        c = new l();
        (a = new k()).set(null);
        (b = new k()).d();
    }
    
    public k() {
        super(k.c);
    }
    
    public static k c() {
        return k.a;
    }
    
    protected void a() {
    }
    
    protected void a(final Exception ex) {
    }
    
    protected void b(final Object o) {
    }
    
    public boolean d() {
        return this.cancel(false);
    }
    
    @Override
    protected void done() {
        if (this.isCancelled()) {
            this.a();
            return;
        }
        try {
            this.b(this.get());
        }
        catch (InterruptedException ex2) {}
        catch (ExecutionException ex) {
            this.a((Exception)ex.getCause());
        }
    }
    
    @Override
    public Object get() {
        if (!this.isDone()) {
            e.c();
        }
        return super.get();
    }
    
    @Override
    public Object get(final long n, final TimeUnit timeUnit) {
        if (!this.isDone()) {
            e.c();
        }
        return super.get(n, timeUnit);
    }
    
    @Override
    public final void run() {
        throw new UnsupportedOperationException("Promises are not meant to be run");
    }
    
    public void set(final Object o) {
        super.set(o);
    }
    
    public void setException(final Throwable exception) {
        if (!(exception instanceof Exception)) {
            throw new IllegalArgumentException("The throwable must extend Exception");
        }
        super.setException(exception);
    }
}
