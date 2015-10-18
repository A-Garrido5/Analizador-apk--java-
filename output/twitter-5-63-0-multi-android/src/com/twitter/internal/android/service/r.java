// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import java.util.concurrent.RunnableFuture;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

public class r extends ThreadPoolExecutor
{
    public r(final int n) {
        super(n, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new PriorityBlockingQueue<Runnable>(11));
    }
    
    @Override
    protected RunnableFuture newTaskFor(final Runnable runnable, final Object o) {
        return new p((q)runnable, o);
    }
}
