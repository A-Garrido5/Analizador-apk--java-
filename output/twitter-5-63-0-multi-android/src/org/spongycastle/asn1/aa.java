// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public class aa implements a
{
    private final int a;
    private final v b;
    
    aa(final int a, final v b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public q a() {
        try {
            return this.e();
        }
        catch (IOException ex) {
            throw new ASN1ParsingException(ex.getMessage(), ex);
        }
    }
    
    @Override
    public q e() {
        return new z(this.a, this.b.b());
    }
}
