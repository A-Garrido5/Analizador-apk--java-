// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class bd extends o
{
    public bd(final OutputStream outputStream) {
        super(outputStream);
    }
    
    @Override
    o a() {
        return this;
    }
    
    @Override
    public void a(final d d) {
        if (d != null) {
            d.a().f().a(this);
            return;
        }
        throw new IOException("null object detected");
    }
    
    @Override
    o b() {
        return this;
    }
}
