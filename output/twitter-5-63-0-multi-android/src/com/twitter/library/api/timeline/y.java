// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.service.c;

public class y extends c
{
    private final String a;
    private final long e;
    private final PromotedContent f;
    
    public y(final Context context, final Session session, final String a, final long e, final PromotedContent f) {
        super(context, y.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a("id", this.a).a("tweet_id", String.valueOf(this.e));
        if (this.f != null) {
            final f a2 = a.a("impression_id", this.f.impressionId);
            String s;
            if (this.f.b()) {
                s = "true";
            }
            else {
                s = "false";
            }
            a2.a("earned", s);
        }
        switch (this.O()) {
            case 1: {
                a.a("beta", "timelines", "custom", "add");
                break;
            }
            case 2: {
                a.a("beta", "timelines", "custom", "remove");
                break;
            }
        }
        return a.a();
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.k() && this.O() == 2) {
            final b w = this.W();
            this.V().b(this.a, this.e, w);
            w.a();
        }
    }
    
    @Override
    protected d h() {
        return null;
    }
}
