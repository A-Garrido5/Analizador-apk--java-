// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.net.HttpURLConnection;
import java.net.URI;

public class o extends n
{
    public o(final m m, final URI uri, final HttpOperation$RequestMethod httpOperation$RequestMethod, final j j) {
        super(m, uri, httpOperation$RequestMethod, j);
    }
    
    @Override
    protected boolean a(final HttpOperation$Protocol httpOperation$Protocol) {
        return httpOperation$Protocol == HttpOperation$Protocol.b || httpOperation$Protocol == HttpOperation$Protocol.e;
    }
    
    @Override
    protected void c(final HttpOperation$Protocol httpOperation$Protocol) {
        if (httpOperation$Protocol == HttpOperation$Protocol.e) {
            this.a("X-Android-Transports", "spdy/3.1,http/1.1");
            return;
        }
        this.a("X-Android-Transports", "http/1.1");
    }
    
    @Override
    protected HttpOperation$Protocol d(final HttpURLConnection httpURLConnection) {
        final String a = this.a(httpURLConnection, "OkHttp-Selected-Protocol", 0);
        if (a != null) {
            return HttpOperation$Protocol.a(a);
        }
        return super.d(httpURLConnection);
    }
    
    @Override
    protected String d() {
        return "OkHttp";
    }
}
