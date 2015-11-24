// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.transport;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public class a extends b
{
    protected InputStream a;
    protected OutputStream b;
    
    protected a() {
        this.a = null;
        this.b = null;
    }
    
    public a(final OutputStream b) {
        this.a = null;
        this.b = null;
        this.b = b;
    }
    
    @Override
    public void a(final byte[] array, final int n, final int n2) {
        if (this.b == null) {
            throw new TTransportException(1, "Cannot write to null outputStream");
        }
        try {
            this.b.write(array, n, n2);
        }
        catch (IOException ex) {
            throw new TTransportException(0, ex);
        }
    }
}
