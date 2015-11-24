// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.util.ListIterator;
import java.net.SocketException;
import java.io.Closeable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.LinkedList;

public class d
{
    private static final d a;
    private final int b;
    private final long c;
    private final LinkedList d;
    private final ExecutorService e;
    private final Runnable f;
    
    static {
        final String property = System.getProperty("http.keepAlive");
        final String property2 = System.getProperty("http.keepAliveDuration");
        final String property3 = System.getProperty("http.maxConnections");
        long long1;
        if (property2 != null) {
            long1 = Long.parseLong(property2);
        }
        else {
            long1 = 300000L;
        }
        if (property != null && !Boolean.parseBoolean(property)) {
            a = new d(0, long1);
            return;
        }
        if (property3 != null) {
            a = new d(Integer.parseInt(property3), long1);
            return;
        }
        a = new d(5, long1);
    }
    
    public d(final int b, final long n) {
        this.d = new LinkedList();
        this.e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), bf.a("OkHttp ConnectionPool", true));
        this.f = new e(this);
        this.b = b;
        this.c = 1000L * (n * 1000L);
    }
    
    public static d a() {
        return d.a;
    }
    
    public c a(final a a) {
        while (true) {
        Label_0106:
            while (true) {
                synchronized (this) {
                    final ListIterator<c> listIterator = (ListIterator<c>)this.d.listIterator(this.d.size());
                    while (listIterator.hasPrevious()) {
                        final c c = listIterator.previous();
                        if (c.b().a().equals(a) && c.d() && System.nanoTime() - c.h() < this.c) {
                            listIterator.remove();
                            if (c.j()) {
                                break Label_0106;
                            }
                            try {
                                ba.a().a(c.c());
                                if (c != null && c.j()) {
                                    this.d.addFirst(c);
                                }
                                this.e.execute(this.f);
                                return c;
                            }
                            catch (SocketException ex) {
                                bf.a(c);
                                ba.a().a("Unable to tagSocket(): " + ex);
                            }
                        }
                    }
                }
                final c c = null;
                continue Label_0106;
            }
        }
    }
    
    public void a(final c c) {
        if (c.j()) {
            return;
        }
        if (!c.d()) {
            bf.a(c);
            return;
        }
        try {
            ba.a().b(c.c());
            // monitorenter(this)
            final d d = this;
            final LinkedList list = d.d;
            final c c2 = c;
            list.addFirst(c2);
            final c c3 = c;
            c3.m();
            final c c4 = c;
            c4.f();
            final d d2 = this;
            // monitorexit(d2)
            final d d3 = this;
            final ExecutorService executorService = d3.e;
            final d d4 = this;
            final Runnable runnable = d4.f;
            executorService.execute(runnable);
            return;
        }
        catch (SocketException ex) {
            ba.a().a("Unable to untagSocket(): " + ex);
            bf.a(c);
            return;
        }
        try {
            final d d = this;
            final LinkedList list = d.d;
            final c c2 = c;
            list.addFirst(c2);
            final c c3 = c;
            c3.m();
            final c c4 = c;
            c4.f();
            final d d2 = this;
            // monitorexit(d2)
            final d d3 = this;
            final ExecutorService executorService = d3.e;
            final d d4 = this;
            final Runnable runnable = d4.f;
            executorService.execute(runnable);
        }
        finally {
        }
        // monitorexit(this)
    }
    
    public void b(final c c) {
        if (!c.j()) {
            throw new IllegalArgumentException();
        }
        this.e.execute(this.f);
        if (c.d()) {
            synchronized (this) {
                this.d.addFirst(c);
            }
        }
    }
}
