// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.UUID;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class bi extends d
{
    private final String a;
    private final String e;
    private String f;
    
    public bi(final Context context, final Session session, final String a, final String e) {
        super(context, bi.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            new ai(this.p, this.P()).S();
            return;
        }
        final b w = this.W();
        this.V().a(this.a, this.f, w);
        w.a();
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a("dm", "conversation", this.a, "update_name").a("name", this.e).a("request_id", UUID.randomUUID().toString());
    }
    
    @Override
    protected boolean c(final aa aa) {
        final b w = this.W();
        this.f = this.V().a(this.a, this.e, w);
        w.a();
        return true;
    }
    
    protected bg e() {
        return null;
    }
}
