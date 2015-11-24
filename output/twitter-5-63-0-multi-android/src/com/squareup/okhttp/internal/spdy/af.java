// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.InterruptedIOException;
import java.io.IOException;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.Map;
import com.squareup.okhttp.Protocol;
import java.util.concurrent.ExecutorService;
import java.io.Closeable;

class af extends az
{
    final /* synthetic */ int a;
    final /* synthetic */ ErrorCode b;
    final /* synthetic */ y c;
    
    af(final y c, final String s, final Object[] array, final int a, final ErrorCode b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(s, array);
    }
    
    public void a() {
        this.c.u.a(this.a, this.b);
        synchronized (this.c) {
            this.c.x.remove(this.a);
        }
    }
}
