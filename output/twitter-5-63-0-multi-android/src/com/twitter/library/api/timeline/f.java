// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.provider.bg;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.PromotedContent;

public class f extends a
{
    private final long a;
    private PromotedContent e;
    
    public f(final Context context, final Session session, final long n, final long n2) {
        this(context, new ab(session), n, n2, bg.a(context, session.g()), com.twitter.library.api.bg.a(37));
    }
    
    protected f(final Context context, final ab ab, final long n, final long a, final bg bg, final com.twitter.library.api.bg bg2) {
        super(context, ab, n, true, bg, bg2);
        this.a = a;
        this.a(new u());
    }
    
    public f a(final PromotedContent e) {
        this.e = e;
        return this;
    }
    
    @Override
    protected e a() {
        final com.twitter.library.service.f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "favorites", "create" }).a("send_error_codes", true).a("id", this.a);
        if (this.e != null && this.e.impressionId != null) {
            a.a("impression_id", this.e.impressionId);
            if (this.e.b()) {
                a.a("earned", true);
            }
        }
        a.a("include_entities", true).a("include_media_features", true).a("include_cards", true).b();
        return a.a();
    }
    
    @Override
    public String b() {
        return "app:twitter_service:favorite:create";
    }
    
    @Override
    protected boolean d(final x x) {
        if (super.d(x)) {
            return true;
        }
        final aa aa = (aa)x.b();
        return aa.c() == 404 || aa.c() == 403;
    }
}
