// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.concurrent.atomic.AtomicBoolean;
import com.twitter.internal.network.HttpOperation;

public class r implements Runnable
{
    private final HttpOperation a;
    private final AtomicBoolean b;
    private boolean c;
    
    public r(final HttpOperation a) {
        this.b = new AtomicBoolean(false);
        this.c = false;
        this.a = a;
    }
    
    public boolean a() {
        return this.c;
    }
    
    public boolean b() {
        return this.b.getAndSet(true);
    }
    
    @Override
    public void run() {
        if (!this.b.getAndSet(true)) {
            this.c = true;
            this.a.b();
        }
    }
}
