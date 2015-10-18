// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class bm extends q
{
    private byte[] a;
    
    bm(final byte[] a) {
        this.a = a;
    }
    
    @Override
    void a(final o o) {
        o.a(12, this.a);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof bm && aag.a(this.a, ((bm)q).a);
    }
    
    public String c() {
        return aai.a(this.a);
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
