// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.provider.b;
import java.util.UUID;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class ba extends d
{
    public final String a;
    private final String e;
    
    public ba(final Context context, final Session session, final String a, final String e) {
        super(context, bb.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        new an(this.p, this.P(), this.a, true, false).S();
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "direct_messages", "report_spam" }).a("conversation_id", this.a).a("report_as", this.e).a("request_id", UUID.randomUUID().toString());
    }
    
    @Override
    protected boolean c(final aa aa) {
        final b w = this.W();
        this.V().b(this.a, true, w);
        w.a();
        return true;
    }
    
    protected bg e() {
        return null;
    }
}
