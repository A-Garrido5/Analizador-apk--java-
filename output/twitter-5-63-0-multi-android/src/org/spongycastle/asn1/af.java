// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

public class af extends r
{
    public af() {
    }
    
    public af(final e e) {
        super(e);
    }
    
    @Override
    void a(final o o) {
        o.b(48);
        o.b(128);
        final Enumeration d = this.d();
        while (d.hasMoreElements()) {
            o.a(d.nextElement());
        }
        o.b(0);
        o.b(0);
    }
    
    @Override
    int i() {
        final Enumeration d = this.d();
        int n = 0;
        while (d.hasMoreElements()) {
            n += d.nextElement().a().i();
        }
        return 2 + (n + 2);
    }
}
