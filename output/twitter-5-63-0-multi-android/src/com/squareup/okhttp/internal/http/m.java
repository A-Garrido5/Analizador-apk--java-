// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Protocol;
import java.net.Socket;
import java.io.IOException;
import com.squareup.okhttp.c;
import com.squareup.okhttp.d;
import java.io.Closeable;
import java.net.CacheRequest;
import java.io.OutputStream;

class m
{
    protected final OutputStream a;
    protected boolean b;
    final /* synthetic */ k c;
    private final CacheRequest d;
    
    m(final k c, CacheRequest d) {
        this.c = c;
        OutputStream body;
        if (d != null) {
            body = d.getBody();
        }
        else {
            body = null;
        }
        if (body == null) {
            d = null;
        }
        this.a = body;
        this.d = d;
    }
    
    protected final void a() {
        if (this.d != null) {
            this.d.abort();
        }
        bf.a(this.c.b);
        this.c.e = 6;
    }
    
    protected final void a(final bq bq, final long n) {
        if (this.a != null) {
            bt.a(bq, bq.l() - n, n, this.a);
        }
    }
    
    protected final void a(final boolean b) {
        if (this.c.e != 5) {
            throw new IllegalStateException("state: " + this.c.e);
        }
        if (this.d != null) {
            this.a.close();
        }
        this.c.e = 0;
        if (b && this.c.f == 1) {
            this.c.f = 0;
            this.c.a.a(this.c.b);
        }
        else if (this.c.f == 2) {
            this.c.e = 6;
            this.c.b.close();
        }
    }
}
