// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.io.OutputStream;
import java.io.InputStream;
import com.twitter.library.util.bd;

public class o implements n
{
    private final bd a;
    
    o(final bd a) {
        this.a = a;
    }
    
    @Override
    public InputStream a() {
        this.a.a();
        return this.a;
    }
    
    @Override
    public void a(final OutputStream outputStream) {
        this.a.a();
        yh.a(this.a, outputStream, 4096);
    }
}
