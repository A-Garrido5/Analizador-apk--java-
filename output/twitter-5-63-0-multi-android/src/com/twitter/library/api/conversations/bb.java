// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class bb extends d
{
    private final long a;
    private final String e;
    
    public bb(final Context context, final Session session, final long a, final String e) {
        super(context, bb.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        if ("not_spam".equals(this.e)) {
            v.a(this.a, false, w);
            w.a();
        }
        else if (httpOperation.k()) {
            v.e(this.a, w);
            w.a();
            new aq(this.p, this.P(), this.a).S();
        }
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "direct_messages", "report_spam" }).a("dm_id", String.valueOf(this.a)).a("report_as", this.e);
    }
    
    protected bg e() {
        return null;
    }
}
