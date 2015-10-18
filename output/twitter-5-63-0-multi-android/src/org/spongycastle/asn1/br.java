// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

public class br extends t
{
    private int a;
    
    public br() {
        this.a = -1;
    }
    
    public br(final d d) {
        super(d);
        this.a = -1;
    }
    
    public br(final e e) {
        super(e, false);
        this.a = -1;
    }
    
    public br(final d[] array) {
        super(array, false);
        this.a = -1;
    }
    
    private int j() {
        if (this.a < 0) {
            final Enumeration c = this.c();
            int a = 0;
            while (c.hasMoreElements()) {
                a += c.nextElement().a().g().i();
            }
            this.a = a;
        }
        return this.a;
    }
    
    @Override
    void a(final o o) {
        final o b = o.b();
        final int j = this.j();
        o.b(49);
        o.a(j);
        final Enumeration c = this.c();
        while (c.hasMoreElements()) {
            b.a(c.nextElement());
        }
    }
    
    @Override
    int i() {
        final int j = this.j();
        return j + (1 + ca.a(j));
    }
}
