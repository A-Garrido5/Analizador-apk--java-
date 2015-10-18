// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

class bx extends r
{
    private byte[] b;
    
    bx(final byte[] b) {
        this.b = b;
    }
    
    private void j() {
        final bw bw = new bw(this.b);
        while (bw.hasMoreElements()) {
            this.a.addElement(bw.nextElement());
        }
        this.b = null;
    }
    
    @Override
    public d a(final int n) {
        synchronized (this) {
            if (this.b != null) {
                this.j();
            }
            return super.a(n);
        }
    }
    
    @Override
    void a(final o o) {
        if (this.b != null) {
            o.a(48, this.b);
            return;
        }
        super.g().a(o);
    }
    
    @Override
    public Enumeration d() {
        synchronized (this) {
            Enumeration d;
            if (this.b == null) {
                d = super.d();
            }
            else {
                d = new bw(this.b);
            }
            return d;
        }
    }
    
    @Override
    public int e() {
        synchronized (this) {
            if (this.b != null) {
                this.j();
            }
            return super.e();
        }
    }
    
    @Override
    q f() {
        if (this.b != null) {
            this.j();
        }
        return super.f();
    }
    
    @Override
    q g() {
        if (this.b != null) {
            this.j();
        }
        return super.g();
    }
    
    @Override
    int i() {
        if (this.b != null) {
            return 1 + ca.a(this.b.length) + this.b.length;
        }
        return super.g().i();
    }
}
