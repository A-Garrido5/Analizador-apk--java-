// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.net.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;

public class m extends f
{
    public m(final g g) {
        super(g);
    }
    
    @Override
    public HttpOperation a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final j j) {
        return new n(this, uri, httpOperation$RequestMethod, j);
    }
    
    public HttpURLConnection a(final URL url) {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection(this.b());
        httpURLConnection.setConnectTimeout(this.a.c());
        httpURLConnection.setReadTimeout(this.a.b());
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }
    
    @Override
    public void a() {
    }
    
    protected Proxy b() {
        if (this.a.a() == null) {
            return Proxy.NO_PROXY;
        }
        return this.a.a().a();
    }
}
