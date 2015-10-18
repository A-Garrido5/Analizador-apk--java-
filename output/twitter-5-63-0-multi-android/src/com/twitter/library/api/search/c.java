// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

public class c extends com.twitter.library.service.c
{
    private final String a;
    private final long e;
    
    public c(final Context context, final Session session, final String a, final long e) {
        super(context, c.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b);
        if (this.O() == 0) {
            return a.a(new Object[] { "saved_searches", "create" }).a("query", this.a).a();
        }
        return a.a("saved_searches", "destroy", this.e).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            if (this.O() == 0) {
                v.a((TwitterSearchQuery)bg.a(), 6, w);
            }
            else {
                v.b(this.e, w);
            }
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(11);
    }
}
