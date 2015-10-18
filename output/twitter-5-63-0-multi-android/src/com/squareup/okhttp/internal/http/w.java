// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.CacheRequest;

public final class w implements av
{
    private final u a;
    private final k b;
    
    public w(final u a, final k b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public cc a(final ab ab) {
        final long a = y.a(ab);
        if (this.a.c) {
            if (a > 2147483647L) {
                throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
            }
            if (a != -1L) {
                this.b(ab);
                return new aq((int)a);
            }
            return new aq();
        }
        else {
            if ("chunked".equalsIgnoreCase(ab.a("Transfer-Encoding"))) {
                this.b(ab);
                return this.b.f();
            }
            if (a != -1L) {
                this.b(ab);
                return this.b.a(a);
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }
    
    @Override
    public cd a(final CacheRequest cacheRequest) {
        if (!this.a.o()) {
            return this.b.a(cacheRequest, 0L);
        }
        if ("chunked".equalsIgnoreCase(this.a.h().a("Transfer-Encoding"))) {
            return this.b.a(cacheRequest, this.a);
        }
        final long a = y.a(this.a.h());
        if (a != -1L) {
            return this.b.a(cacheRequest, a);
        }
        return this.b.a(cacheRequest);
    }
    
    @Override
    public void a() {
        this.b.d();
    }
    
    @Override
    public void a(final aq aq) {
        this.b.a(aq);
    }
    
    @Override
    public ak b() {
        return this.b.e();
    }
    
    @Override
    public void b(final ab ab) {
        this.a.b();
        this.b.a(ab.g(), ag.a(ab, this.a.k().b().b().type(), this.a.k().k()));
    }
    
    @Override
    public void c() {
        if (this.d()) {
            this.b.a();
            return;
        }
        this.b.b();
    }
    
    @Override
    public boolean d() {
        return !"close".equalsIgnoreCase(this.a.g().a("Connection")) && !"close".equalsIgnoreCase(this.a.h().a("Connection")) && !this.b.c();
    }
    
    @Override
    public void e() {
        this.b.g();
    }
}
