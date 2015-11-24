// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.InterruptedIOException;
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
import java.io.IOException;
import java.util.List;

class ad extends az
{
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;
    final /* synthetic */ y d;
    
    ad(final y d, final String s, final Object[] array, final int a, final List b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        super(s, array);
    }
    
    public void a() {
        final boolean a = this.d.u.a(this.a, this.b, this.c);
        while (true) {
            if (a) {
                try {
                    this.d.h.a(this.a, ErrorCode.l);
                    if (a || this.c) {
                        synchronized (this.d) {
                            this.d.x.remove(this.a);
                        }
                    }
                }
                catch (IOException ex) {}
                return;
            }
            continue;
        }
    }
}
