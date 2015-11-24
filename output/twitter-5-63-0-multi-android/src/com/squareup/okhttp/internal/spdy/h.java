// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;

public final class h implements ao
{
    private static final bk a;
    
    static {
        a = bk.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }
    
    private static IllegalArgumentException c(final String s, final Object... array) {
        throw new IllegalArgumentException(String.format(s, array));
    }
    
    private static IOException d(final String s, final Object... array) {
        throw new IOException(String.format(s, array));
    }
    
    @Override
    public int a() {
        return 16383;
    }
    
    @Override
    public a a(final bj bj, final boolean b) {
        return new j(bj, 4096, b);
    }
    
    @Override
    public c a(final bi bi, final boolean b) {
        return new k(bi, b);
    }
}
