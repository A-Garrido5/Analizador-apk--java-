// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import org.apache.http.HttpResponse;
import java.io.IOException;
import org.apache.http.client.methods.HttpUriRequest;
import com.twitter.library.client.App;
import org.apache.http.params.HttpParams;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.client.methods.HttpHead;
import android.net.Uri;
import org.apache.http.client.HttpClient;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class ph extends AsyncTask
{
    private WeakReference a;
    private WeakReference b;
    private WeakReference c;
    private boolean d;
    
    public ph(final pi pi, final HttpClient httpClient, final Uri uri, final boolean d) {
        this.a = new WeakReference((T)pi);
        this.b = new WeakReference((T)httpClient);
        this.c = new WeakReference((T)uri);
        this.d = d;
    }
    
    protected String a(final Void... array) {
        HttpClient httpClient;
        if (this.b != null) {
            httpClient = (HttpClient)this.b.get();
        }
        else {
            httpClient = null;
        }
        Uri uri;
        if (this.c != null) {
            uri = (Uri)this.c.get();
        }
        else {
            uri = null;
        }
        pi pi;
        if (this.a != null) {
            pi = (pi)this.a.get();
        }
        else {
            pi = null;
        }
        if (httpClient != null && uri != null && pi != null) {
            final HttpHead httpHead = new HttpHead(uri.toString());
            final BasicHttpParams params = new BasicHttpParams();
            ((HttpParams)params).setParameter("http.protocol.handle-redirects", (Object)false);
            httpHead.setParams((HttpParams)params);
            try {
                pi.a("request", uri);
                App.a(false);
                final HttpResponse execute = httpClient.execute((HttpUriRequest)httpHead);
                App.a(true);
                if (this.d && execute.getStatusLine().getStatusCode() == 301) {
                    return execute.getFirstHeader("Location").getValue();
                }
            }
            catch (IOException ex) {
                pi.a("error", uri);
                return null;
            }
        }
        return null;
    }
    
    protected void a(final String s) {
        if (this.d) {
            Uri uri;
            String s2;
            if (s != null) {
                uri = Uri.parse(s);
                s2 = "resolved";
            }
            else {
                uri = Uri.parse("https://twitter.com");
                s2 = "failure";
            }
            pi pi;
            if (this.a != null) {
                pi = (pi)this.a.get();
            }
            else {
                pi = null;
            }
            if (pi != null) {
                pi.a(s2);
                pi.d_(uri);
            }
        }
    }
}
