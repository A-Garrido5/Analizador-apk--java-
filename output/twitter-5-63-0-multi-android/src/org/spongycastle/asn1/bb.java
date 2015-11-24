// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class bb extends m
{
    public bb(final byte[] array) {
        super(array);
    }
    
    @Override
    void a(final o o) {
        o.a(4, this.a);
    }
    
    @Override
    boolean h() {
        return false;
    }
    
    @Override
    int i() {
        return 1 + ca.a(this.a.length) + this.a.length;
    }
}
