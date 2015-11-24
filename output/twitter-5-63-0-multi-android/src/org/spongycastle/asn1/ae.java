// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.InputStream;
import java.io.IOException;

public class ae implements n
{
    private v a;
    
    ae(final v a) {
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
        return new al(this.a);
    }
    
    @Override
    public q e() {
        return new ac(aam.a(this.c()));
    }
}
