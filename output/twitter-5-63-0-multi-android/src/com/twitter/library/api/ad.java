// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.internal.network.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.service.d;

public abstract class ad extends d
{
    private Object a;
    private Object b;
    
    public final Object a() {
        return this.b;
    }
    
    protected abstract Object a(final JsonParser p0);
    
    protected abstract Object a(final JsonParser p0, final int p1);
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        if (s == null) {
            return;
        }
        if (!this.a(s, s2)) {
            throw new IOException("Reader could not validate. content-type=[" + s + "], or encoding=[" + s2 + "]");
        }
        JsonParser a = null;
        try {
            a = bh.a.a(inputStream);
            a.a();
            if (n == 200) {
                this.b = this.a(a);
            }
            else {
                this.a = this.a(a, n);
            }
        }
        finally {
            yh.a(a);
        }
    }
    
    @Override
    public void a(final l l) {
    }
    
    protected boolean a(final String s, final String s2) {
        return s.startsWith("application/json");
    }
    
    public final Object b() {
        return this.a;
    }
}
