// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.concurrent;

import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public class h implements Executor
{
    public static final Executor a;
    public static final Executor b;
    protected final Handler c;
    private final boolean d;
    
    static {
        a = new h(Looper.getMainLooper(), false);
        b = new h(Looper.getMainLooper(), true);
    }
    
    public h(final Looper looper, final boolean d) {
        this.c = new Handler(looper);
        this.d = d;
    }
    
    @Override
    public void execute(final Runnable runnable) {
        if (this.d || Thread.currentThread() != this.c.getLooper().getThread()) {
            this.c.post(runnable);
            return;
        }
        runnable.run();
    }
}
