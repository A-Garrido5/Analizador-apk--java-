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

class ab extends az
{
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ r d;
    final /* synthetic */ y e;
    
    ab(final y e, final String s, final Object[] array, final boolean a, final int b, final int c, final r d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        super(s, array);
    }
    
    public void a() {
        try {
            this.e.b(this.a, this.b, this.c, this.d);
        }
        catch (IOException ex) {}
    }
}
