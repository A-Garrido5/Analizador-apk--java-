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

class ai extends az
{
    final /* synthetic */ ak a;
    final /* synthetic */ ah b;
    
    ai(final ah b, final String s, final Object[] array, final ak a) {
        this.b = b;
        this.a = a;
        super(s, array);
    }
    
    public void a() {
        try {
            this.b.a.m.a(this.a);
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
