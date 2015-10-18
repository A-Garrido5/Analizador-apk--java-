// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.security.NoSuchAlgorithmException;
import com.twitter.library.client.App;
import java.net.CookieHandler;
import com.twitter.internal.network.g;
import javax.net.ssl.SSLSocketFactory;
import java.security.KeyStore;
import com.twitter.internal.network.m;

public class ac extends m
{
    private final KeyStore b;
    private SSLSocketFactory c;
    
    public ac(final KeyStore b, final g g) {
        super(g);
        this.c = null;
        this.b = b;
        CookieHandler.setDefault(null);
    }
    
    private SSLSocketFactory c() {
        // monitorenter(this)
        try {
            Label_0042: {
                if (this.c != null) {
                    break Label_0042;
                }
                try {
                    this.c = new ko(new kr(this.b), wj.b, App.h(), wj.c);
                    return this.c;
                }
                catch (NoSuchAlgorithmException ex) {}
                catch (UnrecoverableKeyException ex2) {}
                catch (KeyStoreException ex2) {}
                catch (KeyManagementException ex2) {}
            }
        }
        finally {}
    }
    
    @Override
    public HttpURLConnection a(final URL url) {
        final HttpURLConnection a = super.a(url);
        if ("https".equals(url.getProtocol())) {
            ((HttpsURLConnection)a).setSSLSocketFactory(this.c());
        }
        return a;
    }
}
