// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public abstract class k implements d
{
    @Override
    public abstract q a();
    
    public byte[] a(final String s) {
        if (s.equals("DER")) {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new bd(byteArrayOutputStream).a(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (s.equals("DL")) {
            final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new bp(byteArrayOutputStream2).a(this);
            return byteArrayOutputStream2.toByteArray();
        }
        return this.b();
    }
    
    public byte[] b() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new o(byteArrayOutputStream).a(this);
        return byteArrayOutputStream.toByteArray();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof d && this.a().equals(((d)o).a()));
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode();
    }
}
