// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

public abstract class aj implements e
{
    private int a;
    
    @Override
    public void a(final int n, final Object o) {
    }
    
    protected abstract void a(final long p0);
    
    protected abstract void a(final long p0, final long p1);
    
    protected void a(final long n, final boolean b) {
    }
    
    protected boolean a() {
        return false;
    }
    
    protected void b() {
    }
    
    final void b(final long n, final boolean b) {
        boolean b2 = true;
        if (this.a != (b2 ? 1 : 0)) {
            b2 = false;
        }
        ae.b(b2);
        this.a = 2;
        this.a(n, b);
    }
    
    protected void c() {
    }
    
    protected abstract boolean d();
    
    protected abstract boolean e();
    
    protected abstract long f();
    
    protected void g() {
    }
    
    protected abstract int h();
    
    protected void m() {
    }
    
    protected abstract long n();
    
    protected abstract long o();
    
    protected final int q() {
        return this.a;
    }
    
    final int r() {
        ae.b(this.a == 0);
        this.a = this.h();
        boolean b = false;
        Label_0050: {
            if (this.a != 0 && this.a != 1) {
                final int a = this.a;
                b = false;
                if (a != -1) {
                    break Label_0050;
                }
            }
            b = true;
        }
        ae.b(b);
        return this.a;
    }
    
    final void s() {
        ae.b(this.a == 2);
        this.a = 3;
        this.b();
    }
    
    final void t() {
        ae.b(this.a == 3);
        this.a = 2;
        this.c();
    }
    
    final void u() {
        ae.b(this.a == 2);
        this.a = 1;
        this.g();
    }
    
    final void v() {
        ae.b(this.a != 2 && this.a != 3 && this.a != -2);
        this.a = -2;
        this.m();
    }
}
