// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;

public class ag implements s
{
    private v a;
    
    ag(final v a) {
        this.a = a;
    }
    
    @Override
    public q a() {
        try {
            return this.e();
        }
        catch (IOException ex) {
            throw new IllegalStateException(ex.getMessage());
        }
    }
    
    @Override
    public q e() {
        return new af(this.a.b());
    }
}
