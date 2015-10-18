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
import java.net.ProtocolException;

final class p implements cc
{
    final /* synthetic */ k a;
    private boolean b;
    private long c;
    
    private p(final k a, final long c) {
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a() {
        if (this.b) {
            return;
        }
        this.a.d.a();
    }
    
    @Override
    public void a(final bq bq, final long n) {
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        bf.a(bq.l(), 0L, n);
        if (n > this.c) {
            throw new ProtocolException("expected " + this.c + " bytes but received " + n);
        }
        this.a.d.a(bq, n);
        this.c -= n;
    }
    
    @Override
    public void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.c > 0L) {
            throw new ProtocolException("unexpected end of stream");
        }
        this.a.e = 3;
    }
}
