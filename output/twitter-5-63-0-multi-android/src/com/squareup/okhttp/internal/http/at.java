// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.spdy.ErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.net.CacheRequest;
import com.squareup.okhttp.internal.spdy.ak;

class at implements cd
{
    private final ak a;
    private final cd b;
    private final CacheRequest c;
    private final OutputStream d;
    private boolean e;
    private boolean f;
    
    at(final ak a, CacheRequest c) {
        this.a = a;
        this.b = a.e();
        OutputStream body;
        if (c != null) {
            body = c.getBody();
        }
        else {
            body = null;
        }
        if (body == null) {
            c = null;
        }
        this.d = body;
        this.c = c;
    }
    
    private boolean a() {
        try {
            final long d = this.a.d();
            this.a.a(d);
            this.a.a(100L);
            try {
                bf.a(this, 100);
                return true;
            }
            finally {
                this.a.a(d);
            }
        }
        catch (IOException ex) {
            return false;
        }
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        long b;
        if (this.e) {
            b = -1L;
        }
        else {
            b = this.b.b(bq, n);
            if (b == -1L) {
                this.e = true;
                if (this.c != null) {
                    this.d.close();
                }
                return -1L;
            }
            if (this.d != null) {
                bt.a(bq, bq.l() - b, b, this.d);
                return b;
            }
        }
        return b;
    }
    
    @Override
    public void close() {
        if (!this.f) {
            if (!this.e && this.d != null) {
                this.a();
            }
            this.f = true;
            if (!this.e) {
                this.a.b(ErrorCode.l);
                if (this.c != null) {
                    this.c.abort();
                }
            }
        }
    }
}
