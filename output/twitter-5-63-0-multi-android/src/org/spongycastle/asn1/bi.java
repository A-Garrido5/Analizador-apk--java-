// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public class bi implements u
{
    private v a;
    
    bi(final v a) {
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
        return new bh(this.a.b(), false);
    }
}
