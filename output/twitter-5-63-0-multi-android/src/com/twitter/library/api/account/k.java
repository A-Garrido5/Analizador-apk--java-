// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.internal.network.HttpOperation;
import java.util.List;
import com.twitter.internal.network.j;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import com.twitter.library.network.ae;
import android.util.Base64;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.library.service.aa;
import android.content.Context;
import com.twitter.library.api.bg;
import com.twitter.internal.android.service.d;
import com.twitter.library.service.y;

public class k extends y
{
    protected final d a;
    private final bg e;
    private String f;
    
    public k(final Context context) {
        super(context, k.class.getName());
        this.e = bg.a(53);
        this.a = new d();
    }
    
    public String a() {
        return this.f;
    }
    
    @Override
    protected void a_(final aa aa) {
        final String encodeToString = Base64.encodeToString((com.twitter.library.network.a.a(t.c) + ":" + com.twitter.library.network.a.a(t.d)).getBytes(), 10);
        final StringBuilder a = ae.a(this.q.d, "oauth2", "token");
        final ArrayList<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
        list.add(new BasicNameValuePair("grant_type", "client_credentials"));
        final HttpOperation a2 = this.a(this.p, a).a(HttpOperation$RequestMethod.b).a(this.e).a(list).a(this.a).a();
        ae.a(a2, "Authorization", "Basic " + encodeToString);
        if (a2.c().k()) {
            this.f = (String)this.e.a();
        }
        aa.a(a2);
    }
    
    @Override
    public d m() {
        return this.a;
    }
}
