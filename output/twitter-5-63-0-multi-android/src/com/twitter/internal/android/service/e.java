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

class e implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ a b;
    final /* synthetic */ i c;
    final /* synthetic */ AsyncService d;
    
    e(final AsyncService d, final Runnable a, final a b, final i c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void a(final i i) {
        i.b(new g(this, i));
        i.a();
    }
    
    @Override
    public void run() {
        if (this.a != null) {
            this.d.h.submit(new f(this, this.b.i()));
            return;
        }
        this.a(this.c);
    }
}
