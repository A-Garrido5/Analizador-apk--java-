// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class dV implements cH, fc
{
    private final by a;
    private dW b;
    private final E c;
    private final String d;
    private final int e;
    
    private dV(final dW b, final by a, final E c, final int e) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = c.a() + '.' + b.a();
        by.a(a).d(this);
        by.a(a).a(this);
    }
    
    dV(final dW dw, final by by, final E e, final int n, final bO bo) {
        this(dw, by, e, n);
    }
    
    static void a(final dV dv, final dW dw) {
        dv.a(dw);
    }
    
    private void a(final dW b) {
        this.b = b;
    }
    
    public E a() {
        return this.c;
    }
    
    @Override
    public String a() {
        return this.d;
    }
    
    @Override
    public dW b() {
        return this.b;
    }
    
    @Override
    public fm b() {
        return this.b();
    }
    
    public int c() {
        return this.e;
    }
    
    @Override
    public String c() {
        return this.b.a();
    }
    
    @Override
    public by d() {
        return this.a;
    }
    
    @Override
    public int getNumber() {
        return this.b.i();
    }
}
