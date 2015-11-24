// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.service;

import android.os.Looper;
import android.os.Handler;

public class l
{
    final /* synthetic */ AsyncService a;
    private final Handler b;
    
    public l(final AsyncService a, final Looper looper) {
        this.a = a;
        this.b = new Handler(looper);
    }
    
    public void a(final Runnable runnable) {
        this.b.post(runnable);
    }
    
    public void a(final Runnable runnable, final long n) {
        this.b.postDelayed(runnable, n);
    }
    
    public void b(final Runnable runnable) {
        this.b.removeCallbacksAndMessages((Object)runnable);
    }
}
