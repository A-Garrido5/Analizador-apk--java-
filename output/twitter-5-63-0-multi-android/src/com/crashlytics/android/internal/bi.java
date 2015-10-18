// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class bi
{
    public static ExecutorService a(final String s) {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(c(s));
        a(s, singleThreadExecutor);
        return singleThreadExecutor;
    }
    
    private static void a(final String s, final ExecutorService executorService) {
        Runtime.getRuntime().addShutdownHook(new Thread(new bn(s, executorService, 2L, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for " + s));
    }
    
    public static ScheduledExecutorService b(final String s) {
        final ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(c(s));
        a(s, singleThreadScheduledExecutor);
        return singleThreadScheduledExecutor;
    }
    
    public static ThreadFactory c(final String s) {
        return new bl(s, new AtomicLong(1L));
    }
    
    public long a() {
        return System.currentTimeMillis();
    }
}
