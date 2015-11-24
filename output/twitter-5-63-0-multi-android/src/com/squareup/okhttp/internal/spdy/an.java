// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;

final class an implements cd
{
    static final /* synthetic */ boolean a;
    final /* synthetic */ ak b;
    private final bq c;
    private final bq d;
    private final long e;
    private boolean f;
    private boolean g;
    
    static {
        a = !ak.class.desiredAssertionStatus();
    }
    
    private an(final ak b, final long e) {
        this.b = b;
        this.c = new bq();
        this.d = new bq();
        this.e = e;
    }
    
    private void a() {
        long n;
        long c;
        if (this.b.h != 0L) {
            n = System.nanoTime() / 1000000L;
            c = this.b.h;
        }
        else {
            c = 0L;
            n = 0L;
        }
        while (true) {
            Label_0096: {
                try {
                    while (this.d.l() == 0L && !this.g && !this.f && this.b.l == null) {
                        if (this.b.h != 0L) {
                            break Label_0096;
                        }
                        this.b.wait();
                    }
                    return;
                }
                catch (InterruptedException ex) {
                    throw new InterruptedIOException();
                }
            }
            if (c > 0L) {
                this.b.wait(c);
                c = n + this.b.h - System.nanoTime() / 1000000L;
                continue;
            }
            throw new SocketTimeoutException("Read timed out");
        }
    }
    
    private void b() {
        if (this.f) {
            throw new IOException("stream closed");
        }
        if (this.b.l != null) {
            throw new IOException("stream was reset: " + this.b.l);
        }
    }
    
    void a(final bj bj, long n) {
        if (!an.a && Thread.holdsLock(this.b)) {
            throw new AssertionError();
        }
        Label_0086: {
            break Label_0086;
            while (true) {
                final long b;
                n -= b;
                synchronized (this.b) {
                    int n2;
                    if (this.d.l() == 0L) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    this.d.a(this.c, this.c.l());
                    if (n2 != 0) {
                        this.b.notifyAll();
                    }
                    // monitorexit(this.b)
                    if (n <= 0L) {
                        return;
                    }
                    final boolean g;
                    synchronized (this.b) {
                        g = this.g;
                        int n3;
                        if (n + this.d.l() > this.e) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        // monitorexit(this.b)
                        if (n3 != 0) {
                            bj.b(n);
                            this.b.b(ErrorCode.h);
                            return;
                        }
                    }
                    if (g) {
                        bj.b(n);
                        return;
                    }
                    b = bj.b(this.c, n);
                    if (b == -1L) {
                        throw new EOFException();
                    }
                    continue;
                }
            }
        }
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        synchronized (this.b) {
            this.a();
            this.b();
            if (this.d.l() == 0L) {
                return -1L;
            }
            final long b = this.d.b(bq, Math.min(n, this.d.l()));
            final ak b2 = this.b;
            b2.a += b;
            if (this.b.a >= this.b.f.f.d(65536) / 2) {
                this.b.f.a(this.b.e, this.b.a);
                this.b.a = 0L;
            }
            // monitorexit(this.b)
            synchronized (this.b.f) {
                final y a = this.b.f;
                a.c += b;
                if (this.b.f.c >= this.b.f.f.d(65536) / 2) {
                    this.b.f.a(0, this.b.f.c);
                    this.b.f.c = 0L;
                }
                return b;
            }
        }
    }
    
    @Override
    public void close() {
        synchronized (this.b) {
            this.f = true;
            this.d.o();
            this.b.notifyAll();
            // monitorexit(this.b)
            this.b.h();
        }
    }
}
