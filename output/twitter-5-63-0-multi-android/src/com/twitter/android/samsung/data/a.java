// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import org.apache.http.client.HttpClient;
import org.apache.http.StatusLine;
import org.apache.http.HttpResponse;
import java.io.IOException;
import org.apache.http.client.HttpResponseException;
import java.io.UnsupportedEncodingException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import android.util.Base64;
import java.net.URLEncoder;
import com.twitter.library.network.ae;
import android.content.Context;
import android.os.AsyncTask;

@Deprecated
public class a extends AsyncTask
{
    private g a;
    private Context b;
    
    a(final Context b, final g a) {
        this.a = a;
        this.b = b;
    }
    
    protected String a(final Void... array) {
        try {
            final ae a = ae.a(this.b);
            final String encodeToString = Base64.encodeToString((URLEncoder.encode(i.c, "UTF-8") + ":" + URLEncoder.encode(i.d, "UTF-8")).getBytes(), 10);
            final StringBuilder a2 = ae.a(a.d, "oauth2", "token");
            final DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            final HttpPost httpPost = new HttpPost(a2.toString());
            httpPost.setHeader("Authorization", "Basic " + encodeToString);
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            httpPost.setEntity((HttpEntity)new StringEntity("grant_type=client_credentials"));
            final HttpResponse execute = ((HttpClient)defaultHttpClient).execute((HttpUriRequest)httpPost);
            final StatusLine statusLine = execute.getStatusLine();
            if (statusLine.getStatusCode() != 200) {
                this.a.a(statusLine.getStatusCode(), statusLine.getReasonPhrase(), null);
                return null;
            }
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(execute.getEntity().getContent(), "UTF-8"), 8);
            final StringBuilder sb = new StringBuilder();
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    goto Label_0323;
                }
                sb.append(line + "\n");
            }
        }
        catch (UnsupportedEncodingException ex) {
            this.a.a(0, ex.getMessage(), ex);
            return null;
        }
        catch (HttpResponseException ex2) {
            this.a.a(ex2.getStatusCode(), ex2.getMessage(), (Exception)ex2);
            return null;
        }
        catch (IOException ex3) {
            this.a.a(0, ex3.getMessage(), ex3);
            return null;
        }
    }
    
    protected void a(final String s) {
        if (s != null) {
            this.a.a(s);
        }
    }
}
