// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class rq extends qy
{
    public rq(final a_9 a_9) {
        super(a_9);
    }
    
    @Override
    protected boolean b(final a_9 a_9) {
        a_9.h = this.a.h;
        final boolean b = (this.a.v > 0 && a_9.v != this.a.v) || (this.a.q > 0 && a_9.q != this.a.q) || (this.a.v < 0 && a_9.v >= 0) || (this.a.q < 0 && a_9.q >= 0);
        a_9.v = this.a.v;
        a_9.q = this.a.q;
        a_9.a = this.a.a;
        return b;
    }
}
