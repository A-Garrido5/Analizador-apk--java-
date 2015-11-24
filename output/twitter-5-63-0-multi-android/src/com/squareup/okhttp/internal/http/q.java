// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.net.Socket;
import java.io.IOException;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;
import java.net.ProtocolException;
import java.net.CacheRequest;

class q extends m implements cd
{
    final /* synthetic */ k d;
    private long e;
    
    public q(final k d, final CacheRequest cacheRequest, final long e) {
        this.d = d;
        super(d, cacheRequest);
        this.e = e;
        if (this.e == 0L) {
            this.a(true);
        }
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (this.e == 0L) {
            return -1L;
        }
        final long b = this.d.c.b(bq, Math.min(this.e, n));
        if (b == -1L) {
            this.a();
            throw new ProtocolException("unexpected end of stream");
        }
        this.e -= b;
        this.a(bq, b);
        if (this.e == 0L) {
            this.a(true);
        }
        return b;
    }
    
    @Override
    public void close() {
        if (this.b) {
            return;
        }
        if (this.e != 0L && !this.d.a(this, 100)) {
            this.a();
        }
        this.b = true;
    }
}
