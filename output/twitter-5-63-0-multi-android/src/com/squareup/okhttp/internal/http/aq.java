// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.net.ProtocolException;

final class aq implements cc
{
    private boolean a;
    private final int b;
    private final bq c;
    
    public aq() {
        this(-1);
    }
    
    public aq(final int b) {
        this.c = new bq();
        this.b = b;
    }
    
    @Override
    public void a() {
    }
    
    public void a(final bi bi) {
        bi.a(this.c.p(), this.c.l());
    }
    
    @Override
    public void a(final bq bq, final long n) {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        bf.a(bq.l(), 0L, n);
        if (this.b != -1 && this.c.l() > this.b - n) {
            throw new ProtocolException("exceeded content-length limit of " + this.b + " bytes");
        }
        this.c.a(bq, n);
    }
    
    public long b() {
        return this.c.l();
    }
    
    @Override
    public void close() {
        if (!this.a) {
            this.a = true;
            if (this.c.l() < this.b) {
                throw new ProtocolException("content-length promised " + this.b + " bytes, but received " + this.c.l());
            }
        }
    }
}
