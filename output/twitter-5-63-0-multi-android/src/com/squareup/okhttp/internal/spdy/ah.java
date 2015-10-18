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
import java.util.concurrent.ExecutorService;
import java.io.Closeable;
import com.squareup.okhttp.Protocol;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.IOException;

class ah extends az implements b
{
    final /* synthetic */ y a;
    
    private ah(final y a) {
        this.a = a;
        super("OkHttp %s", new Object[] { a.o });
    }
    
    private void c() {
        y.l.submit(new aj(this, "OkHttp %s ACK Settings", new Object[] { this.a.o }));
    }
    
    @Override
    protected void a() {
        ErrorCode errorCode = ErrorCode.g;
        final ErrorCode g = ErrorCode.g;
        ErrorCode l;
        try {
            if (!this.a.b) {
                this.a.g.a();
            }
            while (this.a.g.a(this)) {}
            errorCode = ErrorCode.a;
            l = ErrorCode.l;
            final ah ah = this;
            final y y = ah.a;
            final ErrorCode errorCode2 = errorCode;
            final ErrorCode errorCode3 = l;
            y.a(errorCode2, errorCode3);
            return;
        }
        catch (IOException ex) {
            final ErrorCode b = ErrorCode.b;
            final ErrorCode errorCode4 = ErrorCode.b;
            try {
                final ah ah2 = this;
                final y y2 = ah2.a;
                final ErrorCode errorCode5 = b;
                final ErrorCode errorCode6 = errorCode4;
                y2.a(errorCode5, errorCode6);
                return;
            }
            catch (IOException ex2) {
                return;
            }
        }
        finally {
            final Object o2;
            final Object o = o2;
            final ErrorCode b = errorCode;
            final Object o3 = o;
        }
        try {
            final ah ah = this;
            final y y = ah.a;
            final ErrorCode errorCode2 = errorCode;
            final ErrorCode errorCode3 = l;
            y.a(errorCode2, errorCode3);
            return;
            try {
                final ErrorCode errorCode4 = ErrorCode.b;
                final ah ah2 = this;
                final y y2 = ah2.a;
                final ErrorCode b;
                final ErrorCode errorCode5 = b;
                final ErrorCode errorCode6 = errorCode4;
                y2.a(errorCode5, errorCode6);
                return;
                try {
                    this.a.a(b, g);
                    throw;
                }
                catch (IOException ex3) {}
            }
            finally {}
        }
        catch (IOException ex4) {}
    }
    
    @Override
    public void a(final int n, final int n2) {
    }
    
    @Override
    public void a(final int n, final int n2, final List list) {
        this.a.a(n2, list);
    }
    
    @Override
    public void a(final int n, final long n2) {
        if (n == 0) {
            synchronized (this.a) {
                final y a = this.a;
                a.d += n2;
                this.a.notifyAll();
                return;
            }
        }
        final ak a2 = this.a.a(n);
        if (a2 != null) {
            synchronized (a2) {
                a2.b(n2);
            }
        }
    }
    
    @Override
    public void a(final int n, final ErrorCode errorCode) {
        if (this.a.d(n)) {
            this.a.c(n, errorCode);
        }
        else {
            final ak b = this.a.b(n);
            if (b != null) {
                b.c(errorCode);
            }
        }
    }
    
    @Override
    public void a(final int n, final ErrorCode errorCode, final bk bk) {
        if (bk.e() > 0) {}
        synchronized (this.a) {
            this.a.s = true;
            final Iterator<Map.Entry<Integer, V>> iterator = this.a.n.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<Integer, V> entry = iterator.next();
                if (entry.getKey() > n && ((ak)entry.getValue()).b()) {
                    ((ak)entry.getValue()).c(ErrorCode.k);
                    iterator.remove();
                }
            }
        }
    }
    // monitorexit(y)
    
    @Override
    public void a(final boolean b, final int n, final int n2) {
        if (b) {
            final r c = this.a.c(n);
            if (c != null) {
                c.b();
            }
            return;
        }
        this.a.a(true, n, n2, null);
    }
    
    @Override
    public void a(final boolean b, final int n, final bj bj, final int n2) {
        if (this.a.d(n)) {
            this.a.a(n, bj, n2, b);
        }
        else {
            final ak a = this.a.a(n);
            if (a == null) {
                this.a.a(n, ErrorCode.c);
                bj.b(n2);
                return;
            }
            a.a(bj, n2);
            if (b) {
                a.g();
            }
        }
    }
    
    @Override
    public void a(final boolean b, final u u) {
        while (true) {
            while (true) {
                Label_0272: {
                    synchronized (this.a) {
                        final int d = this.a.f.d(65536);
                        if (b) {
                            this.a.f.a();
                        }
                        this.a.f.a(u);
                        if (this.a.a() == Protocol.a) {
                            this.c();
                        }
                        final int d2 = this.a.f.d(65536);
                        if (d2 == -1 || d2 == d) {
                            break Label_0272;
                        }
                        final long n = d2 - d;
                        if (!this.a.w) {
                            this.a.a(n);
                            this.a.w = true;
                        }
                        final boolean empty = this.a.n.isEmpty();
                        ak[] array = null;
                        if (!empty) {
                            array = (ak[])this.a.n.values().toArray(new ak[this.a.n.size()]);
                        }
                        // monitorexit(this.a)
                        if (array != null && n != 0L) {
                            for (final ak ak : this.a.n.values()) {
                                synchronized (ak) {
                                    ak.b(n);
                                }
                            }
                        }
                    }
                    break;
                }
                final long n = 0L;
                ak[] array = null;
                continue;
            }
        }
    }
    
    @Override
    public void a(final boolean b, final boolean b2, final int n, final int n2, final int n3, final List list, final HeadersMode headersMode) {
        if (this.a.d(n)) {
            this.a.a(n, list, b2);
        }
        else {
            synchronized (this.a) {
                if (this.a.s) {
                    return;
                }
            }
            final ak a = this.a.a(n);
            if (a == null) {
                if (headersMode.a()) {
                    this.a.a(n, ErrorCode.c);
                    // monitorexit(y)
                    return;
                }
                if (n <= this.a.p) {
                    // monitorexit(y)
                    return;
                }
                if (n % 2 == this.a.q % 2) {
                    // monitorexit(y)
                    return;
                }
                final ak ak = new ak(n, this.a, b, b2, n3, list);
                this.a.p = n;
                this.a.n.put(n, ak);
                y.l.submit(new ai(this, "OkHttp %s stream %d", new Object[] { this.a.o, n }, ak));
            }
            // monitorexit(y)
            else {
                // monitorexit(y)
                if (headersMode.b()) {
                    a.b(ErrorCode.b);
                    this.a.b(n);
                    return;
                }
                a.a(list, headersMode);
                if (b2) {
                    a.g();
                }
            }
        }
    }
    
    @Override
    public void b() {
    }
}
