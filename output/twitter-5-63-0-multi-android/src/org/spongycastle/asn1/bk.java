// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class bk extends w
{
    private static final byte[] e;
    
    static {
        e = new byte[0];
    }
    
    public bk(final boolean b, final int n, final d d) {
        super(b, n, d);
    }
    
    @Override
    void a(final o o) {
        int n = 160;
        if (this.b) {
            o.a(n, this.a, bk.e);
            return;
        }
        final q f = this.d.a().f();
        if (this.c) {
            o.a(n, this.a);
            o.a(f.i());
            o.a((d)f);
            return;
        }
        if (!f.h()) {
            n = 128;
        }
        o.a(n, this.a);
        o.a(f);
    }
    
    @Override
    boolean h() {
        return this.b || this.c || this.d.a().f().h();
    }
    
    @Override
    int i() {
        if (this.b) {
            return 1 + ca.b(this.a);
        }
        final int i = this.d.a().f().i();
        if (this.c) {
            return i + (ca.b(this.a) + ca.a(i));
        }
        return i - 1 + ca.b(this.a);
    }
}
