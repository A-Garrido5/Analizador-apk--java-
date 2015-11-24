// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

public enum HttpOperation$Protocol
{
    a("HTTP_1_0", 0, "http/1.0"), 
    b("HTTP_1_1", 1, "http/1.1"), 
    c("SPDY_2", 2, "spdy/2"), 
    d("SPDY_3", 3, "spdy/3"), 
    e("SPDY_3_1", 4, "spdy/3.1");
    
    private final String mName;
    
    private HttpOperation$Protocol(final String s, final int n, final String mName) {
        this.mName = mName;
    }
    
    public static HttpOperation$Protocol a(final String s) {
        try {
            return valueOf(s.toUpperCase().replaceAll("[-/.]", "_"));
        }
        catch (IllegalArgumentException ex) {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return this.mName;
    }
}
