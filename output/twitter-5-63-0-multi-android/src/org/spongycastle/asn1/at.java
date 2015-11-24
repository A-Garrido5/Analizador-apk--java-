// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

class at
{
    static final r a;
    static final t b;
    
    static {
        a = new bf();
        b = new bh();
    }
    
    static r a(final e e) {
        if (e.a() < 1) {
            return at.a;
        }
        return new bq(e);
    }
    
    static t b(final e e) {
        if (e.a() < 1) {
            return at.b;
        }
        return new br(e);
    }
}
