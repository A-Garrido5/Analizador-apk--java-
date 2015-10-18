// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import org.apache.http.client.HttpClient;
import org.json.JSONArray;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import org.apache.http.client.HttpResponseException;
import java.io.UnsupportedEncodingException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import com.twitter.android.samsung.single.i;
import com.twitter.library.network.ae;
import android.content.Context;
import android.os.AsyncTask;

@Deprecated
public class d extends AsyncTask
{
    private Context a;
    private g b;
    
    public d(final Context a, final g b) {
        this.a = a;
        this.b = b;
    }
    
    protected String a(final Void... array) {
        while (true) {
            HttpResponse execute = null;
            StringBuilder sb = null;
            try {
                final ae a = ae.a(this.a);
                final String e = i.e(this.a);
                if (e == null) {
                    this.b.a(0, this.a.getResources().getString(2131296784), null);
                    return null;
                }
                final StringBuilder append = ae.a(a.d, "1.1", "guest", "activate").append(".json");
                final DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                final HttpPost httpPost = new HttpPost(append.toString());
                httpPost.setHeader("Authorization", "Bearer " + e);
                httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                execute = ((HttpClient)defaultHttpClient).execute((HttpUriRequest)httpPost);
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(execute.getEntity().getContent(), "UTF-8"), 8);
                sb = new StringBuilder();
                while (true) {
                    final String line = bufferedReader.readLine();
                    if (line == null) {
                        goto Label_0259;
                    }
                    sb.append(line + "\n");
                }
            }
            catch (UnsupportedEncodingException ex) {
                this.b.a(0, ex.getMessage(), ex);
                return null;
            }
            catch (HttpResponseException ex2) {
                this.b.a(ex2.getStatusCode(), ex2.getMessage(), (Exception)ex2);
                return null;
            }
            catch (IOException ex3) {
                this.b.a(0, ex3.getMessage(), ex3);
            }
            while (true) {
                int n = 0;
                Label_0492: {
                    try {
                        final JSONArray jsonArray = new JSONObject(sb.toString()).getJSONArray("errors");
                        n = 0;
                        if (n < jsonArray.length()) {
                            final JSONObject jsonObject = jsonArray.getJSONObject(n);
                            final int int1 = jsonObject.getInt("code");
                            final String string = jsonObject.getString("message");
                            if (int1 == 88) {
                                this.b.a(Long.parseLong(execute.getFirstHeader("x-rate-limit-reset").getValue()));
                                break Label_0492;
                            }
                            this.b.a(int1, string, null);
                            break Label_0492;
                        }
                    }
                    catch (JSONException ex4) {}
                    break;
                }
                ++n;
                continue;
            }
        }
        return null;
    }
    
    protected void a(final String s) {
        if (s != null) {
            this.b.a(s);
        }
    }
}
