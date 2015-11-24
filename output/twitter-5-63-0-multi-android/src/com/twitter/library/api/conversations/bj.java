// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.provider.bg;
import java.util.UUID;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.provider.b;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.client.Session;
import android.content.Context;

public class bj extends d
{
    private String a;
    
    public bj(final Context context, final Session session) {
        super(context, bj.class.getName(), session);
        this.a = String.valueOf(this.V().d((String)null));
    }
    
    @Override
    public void a(final x x) {
        final HttpOperation e = ((aa)x.b()).e();
        if (e != null && e.k()) {
            this.V().a(14, 0, this.P().c, "server", this.a, null);
        }
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "dm", "update_last_seen_event_id" }).a("last_seen_event_id", this.a).a("request_id", UUID.randomUUID().toString());
    }
    
    @Override
    protected boolean c(final aa aa) {
        final b w = this.W();
        final bg v = this.V();
        final String b = v.b(14, 0, this.P().c, "server");
        final boolean a = v.a(14, 0, this.P().c, "local", this.a, w);
        long long1;
        if (b == null) {
            long1 = 0L;
        }
        else {
            long1 = Long.parseLong(b);
        }
        if (!a) {
            final long n = lcmp(Long.parseLong(this.a), long1);
            final boolean b2 = false;
            if (n <= 0) {
                return b2;
            }
        }
        w.a();
        return true;
    }
    
    protected com.twitter.library.api.bg e() {
        return null;
    }
}
