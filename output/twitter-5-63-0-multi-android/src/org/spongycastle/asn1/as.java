// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public class as implements bu, d
{
    private v a;
    
    public as(final v a) {
        this.a = a;
    }
    
    @Override
    public q a() {
        try {
            return this.e();
        }
        catch (IOException ex) {
            throw new ASN1ParsingException("unable to get DER object", ex);
        }
        catch (IllegalArgumentException ex2) {
            throw new ASN1ParsingException("unable to get DER object", ex2);
        }
    }
    
    @Override
    public q e() {
        try {
            return new ar(this.a.b());
        }
        catch (IllegalArgumentException ex) {
            throw new ASN1Exception(ex.getMessage(), ex);
        }
    }
}
