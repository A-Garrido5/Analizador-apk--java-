// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public abstract class q extends k
{
    public static q a(final byte[] array) {
        final h h = new h(array);
        try {
            return h.d();
        }
        catch (ClassCastException ex) {
            throw new IOException("cannot recognise object in stream");
        }
    }
    
    @Override
    public q a() {
        return this;
    }
    
    abstract void a(final o p0);
    
    abstract boolean a(final q p0);
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d && this.a(((d)o).a()));
    }
    
    q f() {
        return this;
    }
    
    q g() {
        return this;
    }
    
    abstract boolean h();
    
    @Override
    public abstract int hashCode();
    
    abstract int i();
}
