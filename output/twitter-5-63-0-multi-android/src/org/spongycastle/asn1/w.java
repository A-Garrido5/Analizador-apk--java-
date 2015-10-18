// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public abstract class w extends q implements x
{
    int a;
    boolean b;
    boolean c;
    d d;
    
    public w(final boolean c, final int a, final d d) {
        this.b = false;
        this.c = true;
        this.d = null;
        if (d instanceof c) {
            this.c = true;
        }
        else {
            this.c = c;
        }
        this.a = a;
        if (this.c) {
            this.d = d;
            return;
        }
        if (d.a() instanceof t) {}
        this.d = d;
    }
    
    @Override
    abstract void a(final o p0);
    
    @Override
    boolean a(final q q) {
        if (q instanceof w) {
            final w w = (w)q;
            if (this.a == w.a && this.b == w.b && this.c == w.c) {
                if (this.d == null) {
                    if (w.d != null) {
                        return false;
                    }
                }
                else if (!this.d.a().equals(w.d.a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public int c() {
        return this.a;
    }
    
    public boolean d() {
        return this.c;
    }
    
    @Override
    public q e() {
        return this.a();
    }
    
    @Override
    q f() {
        return new bk(this.c, this.a, this.d);
    }
    
    @Override
    q g() {
        return new bs(this.c, this.a, this.d);
    }
    
    @Override
    public int hashCode() {
        int a = this.a;
        if (this.d != null) {
            a ^= this.d.hashCode();
        }
        return a;
    }
    
    public q j() {
        if (this.d != null) {
            return this.d.a();
        }
        return null;
    }
    
    @Override
    public String toString() {
        return "[" + this.a + "]" + this.d;
    }
}
