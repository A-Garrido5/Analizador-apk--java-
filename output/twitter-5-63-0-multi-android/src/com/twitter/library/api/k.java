// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.network.ae;
import com.twitter.library.service.f;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public abstract class k extends i
{
    protected k(final Context context, final Session session, final String s) {
        super(context, s, session);
    }
    
    @Override
    protected f b() {
        final f a = this.M().b(new Object[] { "users" }).a(new Object[] { "suggestions" });
        ae.a(this.p).a(a);
        return a;
    }
}
