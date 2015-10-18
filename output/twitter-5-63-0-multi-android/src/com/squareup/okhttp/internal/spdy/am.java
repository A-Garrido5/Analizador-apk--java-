// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.io.InterruptedIOException;

final class am implements cc
{
    static final /* synthetic */ boolean a;
    final /* synthetic */ ak b;
    private boolean c;
    private boolean d;
    
    static {
        a = !ak.class.desiredAssertionStatus();
    }
    
    am(final ak b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        if (!am.a && Thread.holdsLock(this.b)) {
            throw new AssertionError();
        }
        synchronized (this.b) {
            this.b.i();
            // monitorexit(this.b)
            this.b.f.d();
        }
    }
    
    @Override
    public void a(final bq bq, long n) {
        if (!am.a && Thread.holdsLock(this.b)) {
            throw new AssertionError();
        }
        Label_0092: {
            break Label_0092;
            try {
                while (true) {
                    this.b.i();
                    final long min = Math.min(this.b.b, n);
                    final ak b = this.b;
                    b.b -= min;
                    // monitorexit(b2)
                    n -= min;
                    this.b.f.a(this.b.e, false, bq, min);
                    if (n <= 0L) {
                        break;
                    }
                    final ak b2 = this.b;
                    // monitorenter(b2)
                    try {
                        while (this.b.b <= 0L) {
                            this.b.wait();
                        }
                    }
                    catch (InterruptedException ex) {
                        throw new InterruptedIOException();
                    }
                }
            }
            finally {
            }
            // monitorexit(b2)
        }
    }
    
    @Override
    public void close() {
        if (!am.a && Thread.holdsLock(this.b)) {
            throw new AssertionError();
        }
        final ak b = this.b;
        final ak b2;
        synchronized (b) {
            if (this.c) {
                return;
            }
            // monitorexit(b)
            if (!this.b.c.d) {
                this.b.f.a(this.b.e, true, null, 0L);
            }
            b2 = this.b;
            // monitorenter(b2)
            final am am = this;
            final boolean b3 = true;
            am.c = b3;
            final ak ak = b2;
            // monitorexit(ak)
            final am am2 = this;
            final ak ak2 = am2.b;
            final y y = ak2.f;
            y.d();
            final am am3 = this;
            final ak ak3 = am3.b;
            ak3.h();
            return;
        }
        try {
            final am am = this;
            final boolean b3 = true;
            am.c = b3;
            final ak ak = b2;
            // monitorexit(ak)
            final am am2 = this;
            final ak ak2 = am2.b;
            final y y = ak2.f;
            y.d();
            final am am3 = this;
            final ak ak3 = am3.b;
            ak3.h();
        }
        finally {
        }
        // monitorexit(b2)
    }
}
