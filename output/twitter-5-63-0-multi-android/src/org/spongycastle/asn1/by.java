// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.InputStream;

abstract class by extends InputStream
{
    protected final InputStream a;
    private int b;
    
    by(final InputStream a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    int a() {
        return this.b;
    }
    
    protected void b(final boolean b) {
        if (this.a instanceof bv) {
            ((bv)this.a).a(b);
        }
    }
}
