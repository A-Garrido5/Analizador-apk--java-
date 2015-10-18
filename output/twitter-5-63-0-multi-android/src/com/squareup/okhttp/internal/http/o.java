// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.net.Socket;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.CacheRequest;

class o extends m implements cd
{
    final /* synthetic */ k d;
    private int e;
    private boolean f;
    private final u g;
    
    o(final k d, final CacheRequest cacheRequest, final u g) {
        this.d = d;
        super(d, cacheRequest);
        this.e = -1;
        this.f = true;
        this.g = g;
    }
    
    private void b() {
        if (this.e != -1) {
            this.d.c.a(true);
        }
        String s = this.d.c.a(true);
        final int index = s.indexOf(";");
        if (index != -1) {
            s = s.substring(0, index);
        }
        try {
            this.e = Integer.parseInt(s.trim(), 16);
            if (this.e == 0) {
                this.f = false;
                final h h = new h();
                this.d.a(h);
                this.g.a(h.a());
                this.a(true);
            }
        }
        catch (NumberFormatException ex) {
            throw new ProtocolException("Expected a hex chunk size but was " + s);
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
        if (this.f) {
            if (this.e == 0 || this.e == -1) {
                this.b();
                if (!this.f) {
                    return -1L;
                }
            }
            final long b = this.d.c.b(bq, Math.min(n, this.e));
            if (b == -1L) {
                this.a();
                throw new IOException("unexpected end of stream");
            }
            this.e -= (int)b;
            this.a(bq, b);
            return b;
        }
        return -1L;
    }
    
    @Override
    public void close() {
        if (this.b) {
            return;
        }
        if (this.f && !this.d.a(this, 100)) {
            this.a();
        }
        this.b = true;
    }
}
