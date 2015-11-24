// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.InputStream;
import java.io.IOException;

public class bc implements n
{
    private bt a;
    
    bc(final bt a) {
        this.a = a;
    }
    
    @Override
    public q a() {
        try {
            return this.e();
        }
        catch (IOException ex) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + ex.getMessage(), ex);
        }
    }
    
    @Override
    public InputStream c() {
        return this.a;
    }
    
    @Override
    public q e() {
        return new bb(this.a.b());
    }
}
