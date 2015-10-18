// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

class ab
{
    static final af a;
    static final ah b;
    
    static {
        a = new af();
        b = new ah();
    }
    
    static af a(final e e) {
        if (e.a() < 1) {
            return ab.a;
        }
        return new af(e);
    }
}
