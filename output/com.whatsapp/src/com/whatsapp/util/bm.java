// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public final class bm
{
    private static final ThreadFactory a;
    private static final ThreadPoolExecutor b;
    private static final BlockingQueue c;
    
    static {
        c = new LinkedBlockingQueue(2048);
        a = new a_();
        b = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, bm.c, bm.a);
    }
    
    public static void a(final Runnable runnable) {
        bm.b.execute(runnable);
    }
}
