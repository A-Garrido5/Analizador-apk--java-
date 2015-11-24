// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.provider.bg;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.PromotedContent;

public class l extends a
{
    private PromotedContent a;
    
    public l(final Context context, final Session session, final long n) {
        this(context, new ab(session), n, bg.a(context, session.g()), com.twitter.library.api.bg.a(37));
    }
    
    protected l(final Context context, final ab ab, final long n, final bg bg, final com.twitter.library.api.bg bg2) {
        super(context, ab, n, false, bg, bg2);
        this.a(new u());
    }
    
    public l a(final PromotedContent a) {
        this.a = a;
        return this;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "favorites", "destroy" }).a("id", this.f());
        if (this.a != null && this.a.impressionId != null) {
            a.a("impression_id", this.a.impressionId);
            if (this.a.b()) {
                a.a("earned", true);
            }
        }
        return a.a();
    }
    
    @Override
    public String b() {
        return "app:twitter_service:favorite:delete";
    }
}
