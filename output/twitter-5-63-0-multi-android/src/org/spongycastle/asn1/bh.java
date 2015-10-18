// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

public class bh extends t
{
    private int a;
    
    public bh() {
        this.a = -1;
    }
    
    bh(final e e, final boolean b) {
        super(e, b);
        this.a = -1;
    }
    
    private int j() {
        if (this.a < 0) {
            final Enumeration c = this.c();
            int a = 0;
            while (c.hasMoreElements()) {
                a += c.nextElement().a().f().i();
            }
            this.a = a;
        }
        return this.a;
    }
    
    @Override
    void a(final o o) {
        final o a = o.a();
        final int j = this.j();
        o.b(49);
        o.a(j);
        final Enumeration c = this.c();
        while (c.hasMoreElements()) {
            a.a(c.nextElement());
        }
    }
    
    @Override
    int i() {
        final int j = this.j();
        return j + (1 + ca.a(j));
    }
}
