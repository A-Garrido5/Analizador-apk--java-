// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import com.squareup.okhttp.j;

public class p extends m
{
    protected final j b;
    
    public p(final g g) {
        super(g);
        (this.b = new j()).a(this.b());
    }
    
    @Override
    public HttpOperation a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final com.twitter.internal.network.j j) {
        return new o(this, uri, httpOperation$RequestMethod, j);
    }
    
    @Override
    public HttpURLConnection a(final URL url) {
        this.b.a(this.a.c(), TimeUnit.MILLISECONDS);
        this.b.b(this.a.b(), TimeUnit.MILLISECONDS);
        return this.b.a(url);
    }
}
