// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

public class aj extends w
{
    public aj(final boolean b, final int n, final d d) {
        super(b, n, d);
    }
    
    @Override
    void a(final o o) {
        o.a(160, this.a);
        o.b(128);
        if (!this.b) {
            if (!this.c) {
                Enumeration enumeration;
                if (this.d instanceof m) {
                    if (this.d instanceof ac) {
                        enumeration = ((ac)this.d).j();
                    }
                    else {
                        enumeration = new ac(((m)this.d).d()).j();
                    }
                }
                else if (this.d instanceof r) {
                    enumeration = ((r)this.d).d();
                }
                else {
                    if (!(this.d instanceof t)) {
                        throw new RuntimeException("not implemented: " + this.d.getClass().getName());
                    }
                    enumeration = ((t)this.d).c();
                }
                while (enumeration.hasMoreElements()) {
                    o.a(enumeration.nextElement());
                }
            }
            else {
                o.a(this.d);
            }
        }
        o.b(0);
        o.b(0);
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
        final int i = this.d.a().i();
        if (this.c) {
            return i + (ca.b(this.a) + ca.a(i));
        }
        return i - 1 + ca.b(this.a);
    }
}
