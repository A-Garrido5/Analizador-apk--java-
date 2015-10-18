// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.Protocol;

public class ag
{
    private String a;
    private bj b;
    private bi c;
    private m d;
    private Protocol e;
    private s f;
    private boolean g;
    
    public ag(final String a, final boolean g, final bj b, final bi c) {
        this.d = m.a;
        this.e = Protocol.b;
        this.f = s.a;
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
    }
    
    public ag a(final Protocol e) {
        this.e = e;
        return this;
    }
    
    public y a() {
        return new y(this, null);
    }
}
