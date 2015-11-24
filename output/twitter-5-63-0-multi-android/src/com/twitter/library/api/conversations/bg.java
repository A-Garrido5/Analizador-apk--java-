// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.UUID;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class bg extends d
{
    private final String a;
    private final boolean e;
    
    public bg(final Context context, final Session session, final String a, final boolean e) {
        super(context, bg.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final com.twitter.library.api.bg bg) {
        if (aa.a()) {
            final b w = this.W();
            this.V().a(this.a, this.e, w);
            w.a();
        }
    }
    
    @Override
    protected f b() {
        String s;
        if (this.e) {
            s = "disable_notifications";
        }
        else {
            s = "enable_notifications";
        }
        return this.M().a(HttpOperation$RequestMethod.b).a("dm", "conversation", this.a, s).a("request_id", UUID.randomUUID().toString());
    }
    
    protected com.twitter.library.api.bg e() {
        return null;
    }
}
