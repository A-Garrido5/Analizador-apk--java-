// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class be extends q
{
    private byte[] a;
    
    be(final byte[] a) {
        this.a = a;
    }
    
    @Override
    void a(final o o) {
        o.a(19, this.a);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof be && aag.a(this.a, ((be)q).a);
    }
    
    public String c() {
        return aai.b(this.a);
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
        return 1 + ca.a(this.a.length) + this.a.length;
    }
    
    @Override
    public String toString() {
        return this.c();
    }
}
