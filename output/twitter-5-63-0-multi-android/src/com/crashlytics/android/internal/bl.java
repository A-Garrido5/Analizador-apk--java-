// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;

final class bl implements ThreadFactory
{
    private /* synthetic */ String a;
    private /* synthetic */ AtomicLong b;
    
    bl(final String a, final AtomicLong b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = Executors.defaultThreadFactory().newThread(new bm(this, runnable));
        thread.setName(String.format(Locale.US, this.a, this.b.getAndIncrement()));
        return thread;
    }
}
