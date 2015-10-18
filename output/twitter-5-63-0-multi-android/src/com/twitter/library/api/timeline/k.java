// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class k extends c
{
    private String a;
    
    public k(final Context context, final Session session, final String a) {
        super(context, k.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("beta", "timelines", "custom", "destroy").a("id", this.a).a();
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.k()) {
            final bg v = this.V();
            final b w = this.W();
            v.a(this.a, w);
            v.b(this.a, w);
            w.a();
        }
    }
    
    @Override
    protected d h() {
        return null;
    }
}
