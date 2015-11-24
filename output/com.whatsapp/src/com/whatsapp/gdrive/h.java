// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

final class h
{
    private static final ThreadFactory a;
    private static final BlockingQueue b;
    private static final ThreadPoolExecutor c;
    
    static {
        b = new LinkedBlockingQueue(64);
        a = new p();
        (c = new ThreadPoolExecutor(0, 4, 1L, TimeUnit.SECONDS, h.b, h.a)).setRejectedExecutionHandler(new a3());
    }
    
    public static void a(final Runnable runnable) {
        h.c.execute(runnable);
    }
}
