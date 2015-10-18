// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

public enum Protocol
{
    a("HTTP_2", 0, "HTTP-draft-09/2.0", true), 
    b("SPDY_3", 1, "spdy/3.1", true), 
    c("HTTP_11", 2, "http/1.1", false);
    
    public final bk name;
    public final boolean spdyVariant;
    
    private Protocol(final String s, final int n, final String s2, final boolean spdyVariant) {
        this.name = bk.a(s2);
        this.spdyVariant = spdyVariant;
    }
}
