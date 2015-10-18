// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.io.InputStream;
import java.io.Closeable;

public abstract class aj implements Closeable
{
    private cd a;
    
    public abstract InputStream a();
    
    public cd b() {
        final cd a = this.a;
        if (a != null) {
            return a;
        }
        return this.a = bt.a(this.a());
    }
    
    @Override
    public void close() {
        this.a().close();
    }
}
