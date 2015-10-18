// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;

public class r extends f
{
    private String h;
    
    public r(final Context context, final Session session, final String s, final String h) {
        super(context, r.class.getName(), new ab(session), s);
        this.h = h;
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            aa.c.putParcelableArrayList("users_list_result", this.f);
            aa.c.putString("category_title", this.e);
        }
    }
    
    @Override
    protected com.twitter.library.service.f b() {
        return super.b().a("country", this.h);
    }
}
