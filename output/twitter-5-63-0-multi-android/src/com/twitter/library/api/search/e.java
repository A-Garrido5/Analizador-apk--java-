// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class e extends c
{
    public final long a;
    public final long e;
    public final String f;
    private String g;
    private String h;
    private String i;
    private String j;
    
    public e(final Context context, final Session session, final long a, final long e, final String f, final String i, final String j) {
        super(context, e.class.getName(), session);
        this.h = session.e();
        this.a = a;
        this.e = e;
        this.f = f;
        this.i = i;
        this.j = j;
    }
    
    @Override
    protected com.twitter.library.service.e a() {
        return this.M().b("related-tweets.herokuapp.com").a((String)null).a(HttpOperation$RequestMethod.b).b(new Object[] { "write" }).a("username", this.h).a("original_status_id", this.a).a("related_status_id", this.e).a("good_or_bad", this.f).a("detailed", this.i).a("custom", this.j).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.k()) {
            this.g = d.a();
        }
        aa.a(httpOperation);
    }
    
    protected d b() {
        return new d();
    }
}
