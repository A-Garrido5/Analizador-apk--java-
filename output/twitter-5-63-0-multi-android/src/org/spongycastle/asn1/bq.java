// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

public class bq extends r
{
    private int b;
    
    public bq() {
        this.b = -1;
    }
    
    public bq(final e e) {
        super(e);
        this.b = -1;
    }
    
    private int j() {
        if (this.b < 0) {
            final Enumeration d = this.d();
            int b = 0;
            while (d.hasMoreElements()) {
                b += d.nextElement().a().g().i();
            }
            this.b = b;
        }
        return this.b;
    }
    
    @Override
    void a(final o o) {
        final o b = o.b();
        final int j = this.j();
        o.b(48);
        o.a(j);
        final Enumeration d = this.d();
        while (d.hasMoreElements()) {
            b.a(d.nextElement());
        }
    }
    
    @Override
    int i() {
        final int j = this.j();
        return j + (1 + ca.a(j));
    }
}
