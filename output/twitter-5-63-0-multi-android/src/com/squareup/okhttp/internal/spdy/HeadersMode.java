// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

enum HeadersMode
{
    a("SPDY_SYN_STREAM", 0), 
    b("SPDY_REPLY", 1), 
    c("SPDY_HEADERS", 2), 
    d("HTTP_20_HEADERS", 3);
    
    private HeadersMode(final String s, final int n) {
    }
    
    public boolean a() {
        return this == HeadersMode.b || this == HeadersMode.c;
    }
    
    public boolean b() {
        return this == HeadersMode.a;
    }
    
    public boolean c() {
        return this == HeadersMode.c;
    }
    
    public boolean d() {
        return this == HeadersMode.b;
    }
}
