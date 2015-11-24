// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

enum HttpURLConnectionImpl$Retry
{
    a("NONE", 0), 
    b("SAME_CONNECTION", 1), 
    c("DIFFERENT_CONNECTION", 2);
    
    private HttpURLConnectionImpl$Retry(final String s, final int n) {
    }
}
