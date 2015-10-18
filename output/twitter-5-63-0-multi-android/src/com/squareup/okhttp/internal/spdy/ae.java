// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.InterruptedIOException;
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
import java.io.IOException;

class ae extends az
{
    final /* synthetic */ int a;
    final /* synthetic */ bq b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ y e;
    
    ae(final y e, final String s, final Object[] array, final int a, final bq b, final int c, final boolean d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        super(s, array);
    }
    
    public void a() {
        try {
            final boolean a = this.e.u.a(this.a, this.b, this.c, this.d);
            if (a) {
                this.e.h.a(this.a, ErrorCode.l);
            }
            if (a || this.d) {
                synchronized (this.e) {
                    this.e.x.remove(this.a);
                }
            }
        }
        catch (IOException ex) {}
    }
}
