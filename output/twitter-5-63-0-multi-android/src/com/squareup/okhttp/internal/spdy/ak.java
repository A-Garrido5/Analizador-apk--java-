// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.EOFException;
import java.net.SocketTimeoutException;
import java.io.InterruptedIOException;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public final class ak
{
    static final /* synthetic */ boolean d;
    long a;
    long b;
    final am c;
    private final int e;
    private final y f;
    private final int g;
    private long h;
    private final List i;
    private List j;
    private final an k;
    private ErrorCode l;
    
    static {
        d = !ak.class.desiredAssertionStatus();
    }
    
    ak(final int e, final y f, final boolean b, final boolean b2, final int g, final List i) {
        this.a = 0L;
        this.h = 0L;
        this.l = null;
        if (f == null) {
            throw new NullPointerException("connection == null");
        }
        if (i == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.e = e;
        this.f = f;
        this.b = f.f.d(65536);
        this.k = new an(this, f.e.d(65536), null);
        this.c = new am(this);
        this.k.g = b2;
        this.c.d = b;
        this.g = g;
        this.i = i;
    }
    
    private boolean d(final ErrorCode l) {
        if (!ak.d && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.l != null) {
                return false;
            }
            if (this.k.g && this.c.d) {
                return false;
            }
        }
        this.l = l;
        this.notifyAll();
        // monitorexit(this)
        this.f.b(this.e);
        return true;
    }
    
    private void h() {
        if (!ak.d && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        while (true) {
            while (true) {
                Label_0112: {
                    final boolean a;
                    synchronized (this) {
                        if (!this.k.g && this.k.f && (this.c.d || this.c.c)) {
                            break Label_0112;
                        }
                        final int n = 0;
                        a = this.a();
                        // monitorexit(this)
                        if (n != 0) {
                            this.a(ErrorCode.l);
                            return;
                        }
                    }
                    if (!a) {
                        break;
                    }
                    return;
                }
                final int n = 1;
                continue;
            }
        }
        this.f.b(this.e);
    }
    
    private void i() {
        if (this.c.c) {
            throw new IOException("stream closed");
        }
        if (this.c.d) {
            throw new IOException("stream finished");
        }
        if (this.l != null) {
            throw new IOException("stream was reset: " + this.l);
        }
    }
    
    public void a(final long h) {
        this.h = h;
    }
    
    void a(final bj bj, final int n) {
        if (!ak.d && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.k.a(bj, n);
    }
    
    public void a(final ErrorCode errorCode) {
        if (!this.d(errorCode)) {
            return;
        }
        this.f.b(this.e, errorCode);
    }
    
    void a(final List j, final HeadersMode headersMode) {
        if (!ak.d && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        while (true) {
            boolean a = true;
        Label_0142:
            while (true) {
                synchronized (this) {
                    if (this.j == null) {
                        ErrorCode errorCode;
                        if (headersMode.c()) {
                            errorCode = ErrorCode.b;
                        }
                        else {
                            this.j = j;
                            a = this.a();
                            this.notifyAll();
                            errorCode = null;
                        }
                        // monitorexit(this)
                        if (errorCode != null) {
                            this.b(errorCode);
                            return;
                        }
                        break Label_0142;
                    }
                }
                if (headersMode.d()) {
                    final ErrorCode errorCode = ErrorCode.e;
                    continue;
                }
                final ArrayList i = new ArrayList();
                i.addAll(this.j);
                i.addAll(j);
                this.j = i;
                ErrorCode errorCode = null;
                continue;
            }
            if (!a) {
                break;
            }
            return;
        }
        this.f.b(this.e);
    }
    
    public boolean a() {
        synchronized (this) {
            final ErrorCode l = this.l;
            boolean b = false;
            if (l == null) {
                if ((this.k.g || this.k.f) && (this.c.d || this.c.c)) {
                    final List j = this.j;
                    b = false;
                    if (j != null) {
                        return b;
                    }
                }
                b = true;
            }
            return b;
        }
    }
    
    void b(final long n) {
        this.b += n;
        if (n > 0L) {
            this.notifyAll();
        }
    }
    
    public void b(final ErrorCode errorCode) {
        if (!this.d(errorCode)) {
            return;
        }
        this.f.a(this.e, errorCode);
    }
    
    public boolean b() {
        return this.f.b == ((0x1 & this.e) == 0x1);
    }
    
    public List c() {
        while (true) {
            while (true) {
                Label_0192: {
                    final long n;
                    long h;
                    synchronized (this) {
                        if (this.h == 0L) {
                            break Label_0192;
                        }
                        n = System.nanoTime() / 1000000L;
                        h = this.h;
                        try {
                            while (this.j == null && this.l == null) {
                                if (this.h != 0L) {
                                    break;
                                }
                                this.wait();
                            }
                        }
                        catch (InterruptedException ex2) {
                            final InterruptedIOException ex = new InterruptedIOException();
                            ex.initCause(ex2);
                            throw ex;
                        }
                    }
                    if (h > 0L) {
                        this.wait(h);
                        h = n + this.h - System.nanoTime() / 1000000L;
                        continue;
                    }
                    throw new SocketTimeoutException("Read response header timeout. readTimeoutMillis: " + this.h);
                }
                long n = 0L;
                long h = 0L;
                continue;
            }
            if (this.j != null) {
                // monitorexit(this)
                return this.j;
            }
            throw new IOException("stream was reset: " + this.l);
        }
    }
    
    void c(final ErrorCode l) {
        synchronized (this) {
            if (this.l == null) {
                this.l = l;
                this.notifyAll();
            }
        }
    }
    
    public long d() {
        return this.h;
    }
    
    public cd e() {
        return this.k;
    }
    
    public cc f() {
        synchronized (this) {
            if (this.j == null && !this.b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        // monitorexit(this)
        return this.c;
    }
    
    void g() {
        if (!ak.d && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.k.g = true;
            final boolean a = this.a();
            this.notifyAll();
            // monitorexit(this)
            if (!a) {
                this.f.b(this.e);
            }
        }
    }
}
