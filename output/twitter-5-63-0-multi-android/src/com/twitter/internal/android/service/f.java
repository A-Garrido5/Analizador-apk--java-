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

class f extends q
{
    final /* synthetic */ e a;
    
    f(final e a, final int n) {
        this.a = a;
        super(n);
    }
    
    @Override
    public void run() {
        try {
            this.a.a.run();
        }
        catch (Exception ex) {
            this.a.d.c.a(new j(ex));
        }
        finally {
            this.a.a(this.a.c);
        }
    }
}
