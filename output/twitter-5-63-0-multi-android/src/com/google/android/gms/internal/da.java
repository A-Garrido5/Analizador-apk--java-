// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public abstract class da
{
    protected volatile int n;
    
    public da() {
        this.n = -1;
    }
    
    public void a(final qp qp) {
    }
    
    protected int c() {
        return 0;
    }
    
    public int e() {
        if (this.n < 0) {
            this.f();
        }
        return this.n;
    }
    
    public int f() {
        return this.n = this.c();
    }
    
    @Override
    public String toString() {
        return db.a(this);
    }
}
