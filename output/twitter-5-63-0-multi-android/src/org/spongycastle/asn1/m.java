// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public abstract class m extends q implements n
{
    byte[] a;
    
    public m(final byte[] a) {
        if (a == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.a = a;
    }
    
    public static m a(final Object o) {
        if (o == null || o instanceof m) {
            return (m)o;
        }
        if (o instanceof byte[]) {
            try {
                return a((Object)q.a((byte[])o));
            }
            catch (IOException ex) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + ex.getMessage());
            }
        }
        if (o instanceof d) {
            final q a = ((d)o).a();
            if (a instanceof m) {
                return (m)a;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + o.getClass().getName());
    }
    
    @Override
    abstract void a(final o p0);
    
    @Override
    boolean a(final q q) {
        return q instanceof m && aag.a(this.a, ((m)q).a);
    }
    
    @Override
    public InputStream c() {
        return new ByteArrayInputStream(this.a);
    }
    
    public byte[] d() {
        return this.a;
    }
    
    @Override
    public q e() {
        return this.a();
    }
    
    @Override
    q f() {
        return new bb(this.a);
    }
    
    @Override
    q g() {
        return new bb(this.a);
    }
    
    @Override
    public int hashCode() {
        return aag.a(this.a);
    }
    
    @Override
    public String toString() {
        return "#" + new String(aak.a(this.a));
    }
}
