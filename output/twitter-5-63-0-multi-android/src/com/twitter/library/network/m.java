// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class m implements n
{
    private final byte[] a;
    
    public m(final byte[] a) {
        this.a = a;
    }
    
    @Override
    public InputStream a() {
        return new ByteArrayInputStream(this.a);
    }
    
    @Override
    public void a(final OutputStream outputStream) {
        outputStream.write(this.a);
    }
}
