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
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;

public class aq extends d
{
    private final long a;
    
    public aq(final Context context, final Session session, final long a) {
        super(context, aq.class.getName(), session);
        this.a = a;
    }
    
    public aq(final Context context, final ab ab, final long a) {
        super(context, aq.class.getName(), ab);
        this.a = a;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        if (httpOperation.k()) {
            v.e(this.a, w);
        }
        else if (httpOperation.l().a == 404) {
            v.e(this.a, w);
        }
        w.a();
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "dm", "destroy" }).a("dm_id", this.a).a("request_id", UUID.randomUUID().toString());
    }
    
    protected bg e() {
        return null;
    }
}
