// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class bp extends o
{
    public bp(final OutputStream outputStream) {
        super(outputStream);
    }
    
    @Override
    public void a(final d d) {
        if (d != null) {
            d.a().g().a(this);
            return;
        }
        throw new IOException("null object detected");
    }
}
