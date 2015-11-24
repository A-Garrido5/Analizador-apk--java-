// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class bs extends w
{
    private static final byte[] e;
    
    static {
        e = new byte[0];
    }
    
    public bs(final boolean b, final int n, final d d) {
        super(b, n, d);
    }
    
    @Override
    void a(final o o) {
        int n = 160;
        if (this.b) {
            o.a(n, this.a, bs.e);
            return;
        }
        final q g = this.d.a().g();
        if (this.c) {
            o.a(n, this.a);
            o.a(g.i());
            o.a((d)g);
            return;
        }
        if (!g.h()) {
            n = 128;
        }
        o.a(n, this.a);
        o.a(g);
    }
    
    @Override
    boolean h() {
        return this.b || this.c || this.d.a().g().h();
    }
    
    @Override
    int i() {
        if (this.b) {
            return 1 + ca.b(this.a);
        }
        final int i = this.d.a().g().i();
        if (this.c) {
            return i + (ca.b(this.a) + ca.a(i));
        }
        return i - 1 + ca.b(this.a);
    }
}
