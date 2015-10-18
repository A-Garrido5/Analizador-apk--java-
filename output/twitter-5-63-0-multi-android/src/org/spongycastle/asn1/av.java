// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class av extends q
{
    private byte[] a;
    
    av(final byte[] a) {
        this.a = a;
    }
    
    @Override
    void a(final o o) {
        o.a(24, this.a);
    }
    
    @Override
    boolean a(final q q) {
        return q instanceof av && aag.a(this.a, ((av)q).a);
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
}
