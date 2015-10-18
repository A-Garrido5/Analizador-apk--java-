// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.client.d;

public class bn extends d
{
    boolean d;
    boolean e;
    int f;
    boolean g;
    int h;
    
    bn() {
        this.d = true;
        this.e = true;
        this.f = 0;
        this.h = 2;
    }
    
    protected bn(final bn bn) {
        super(bn);
        this.d = true;
        this.e = true;
        this.f = 0;
        this.h = 2;
        this.d = bn.d;
        this.e = bn.e;
        this.g = bn.g;
        this.h = bn.h;
        this.f = bn.f;
    }
    
    public final void a(final int f) {
        this.b();
        this.f = f;
    }
    
    public final void a(final boolean d) {
        this.b();
        this.d = d;
    }
    
    public final boolean a() {
        return this.g;
    }
    
    public final void b(final boolean e) {
        this.b();
        this.e = e;
    }
    
    public final void c(final boolean g) {
        this.b();
        this.g = g;
    }
}
