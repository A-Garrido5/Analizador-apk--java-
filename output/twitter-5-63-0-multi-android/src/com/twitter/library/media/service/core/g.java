// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import android.os.Handler;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

class g
{
    private static final AtomicInteger h;
    public int a;
    public int b;
    public Bundle c;
    public h d;
    public Handler e;
    public boolean f;
    public Bundle g;
    
    static {
        h = new AtomicInteger(0);
    }
    
    private g(final int b, final Bundle c) {
        this.a = com.twitter.library.media.service.core.g.h.incrementAndGet();
        this.b = b;
        this.c = c;
    }
}
