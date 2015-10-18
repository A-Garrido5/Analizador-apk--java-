// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public class ai implements u
{
    private v a;
    
    ai(final v a) {
        this.a = a;
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
        return new ah(this.a.b());
    }
}
