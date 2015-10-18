// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Enumeration;

public class ah extends t
{
    public ah() {
    }
    
    public ah(final d d) {
        super(d);
    }
    
    public ah(final e e) {
        super(e, false);
    }
    
    public ah(final d[] array) {
        super(array, false);
    }
    
    @Override
    void a(final o o) {
        o.b(49);
        o.b(128);
        final Enumeration c = this.c();
        while (c.hasMoreElements()) {
            o.a(c.nextElement());
        }
        o.b(0);
        o.b(0);
    }
    
    @Override
    int i() {
        final Enumeration c = this.c();
        int n = 0;
        while (c.hasMoreElements()) {
            n += c.nextElement().a().i();
        }
        return 2 + (n + 2);
    }
}
