// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.net.Proxy;
import java.net.URLConnection;
import java.net.URL;
import java.net.URLStreamHandler;

class k extends URLStreamHandler
{
    final /* synthetic */ String a;
    final /* synthetic */ j b;
    
    k(final j b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    protected int getDefaultPort() {
        if (this.a.equals("http")) {
            return 80;
        }
        if (this.a.equals("https")) {
            return 443;
        }
        throw new AssertionError();
    }
    
    @Override
    protected URLConnection openConnection(final URL url) {
        return this.b.a(url);
    }
    
    @Override
    protected URLConnection openConnection(final URL url, final Proxy proxy) {
        return this.b.a(url, proxy);
    }
}
