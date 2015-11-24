// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public class ak implements x
{
    private boolean a;
    private int b;
    private v c;
    
    ak(final boolean a, final int b, final v c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public q a() {
        try {
            return this.e();
        }
        catch (IOException ex) {
            throw new ASN1ParsingException(ex.getMessage());
        }
    }
    
    @Override
    public q e() {
        return this.c.a(this.a, this.b);
    }
}
