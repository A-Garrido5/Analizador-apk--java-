// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.net.Socket;
import java.io.IOException;
import java.net.CacheRequest;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;

final class n implements cc
{
    final /* synthetic */ k a;
    private final byte[] b;
    private boolean c;
    
    private n(final k a) {
        this.a = a;
        this.b = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 10 };
    }
    
    private void a(long n) {
        int n2 = 16;
        do {
            final byte[] b = this.b;
            --n2;
            b[n2] = k.g[(int)(0xFL & n)];
            n >>>= 4;
        } while (n != 0L);
        this.a.d.a(this.b, n2, this.b.length - n2);
    }
    
    @Override
    public void a() {
        synchronized (this) {
            if (!this.c) {
                this.a.d.a();
            }
        }
    }
    
    @Override
    public void a(final bq bq, final long n) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (n == 0L) {
            return;
        }
        this.a(n);
        this.a.d.a(bq, n);
        this.a.d.a("\r\n");
    }
    
    @Override
    public void close() {
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                this.a.d.a(k.h);
                this.a.e = 3;
            }
        }
    }
}
