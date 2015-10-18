// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class bl extends q
{
    private byte[] a;
    
    bl(final byte[] a) {
        this.a = a;
    }
    
    @Override
    void a(final o o) {
        o.b(23);
        final int length = this.a.length;
        o.a(length);
        for (int i = 0; i != length; ++i) {
            o.b(this.a[i]);
        }
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof bl && aag.a(this.a, ((bl)q).a);
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    public int hashCode() {
        return aag.a(this.a);
    }
    
    @Override
    int i() {
        final int length = this.a.length;
        return length + (1 + ca.a(length));
    }
    
    @Override
    public String toString() {
        return aai.b(this.a);
    }
}
