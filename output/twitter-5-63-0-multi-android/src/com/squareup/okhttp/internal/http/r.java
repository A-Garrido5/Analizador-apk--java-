// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.net.Socket;
import java.io.IOException;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;
import java.net.CacheRequest;

class r extends m implements cd
{
    final /* synthetic */ k d;
    private boolean e;
    
    r(final k d, final CacheRequest cacheRequest) {
        this.d = d;
        super(d, cacheRequest);
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (this.e) {
            return -1L;
        }
        final long b = this.d.c.b(bq, n);
        if (b == -1L) {
            this.e = true;
            this.a(false);
            return -1L;
        }
        this.a(bq, b);
        return b;
    }
    
    @Override
    public void close() {
        if (this.b) {
            return;
        }
        if (!this.e) {
            this.a();
        }
        this.b = true;
    }
}
