// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.internal.util.Optional;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.internal.network.j;
import com.twitter.library.service.a;
import com.twitter.library.network.ae;
import com.twitter.library.api.geo.TwitterPlace;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import com.twitter.library.service.aa;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.ab;
import android.content.Context;

public class ad extends w
{
    public ad(final Context context, final ab ab, final TwitterUser twitterUser) {
        super(context, ad.class.getName(), ab, twitterUser);
    }
    
    @Override
    protected void a(final aa aa) {
        final ab p = this.P();
        final ArrayList<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
        if (this.e.d != null) {
            list.add(new BasicNameValuePair("name", this.e.d));
        }
        if (this.e.f != null) {
            list.add(new BasicNameValuePair("url", this.e.f));
        }
        final Optional h = this.e.h;
        if (h.c()) {
            list.add(new BasicNameValuePair("location", ((TwitterPlace)h.b()).fullName));
            list.add(new BasicNameValuePair("location_place_id", ((TwitterPlace)h.b()).placeId));
        }
        else if (this.e.g != null) {
            list.add(new BasicNameValuePair("location", this.e.g));
        }
        if (this.e.e != null) {
            list.add(new BasicNameValuePair("description", this.e.e));
        }
        final StringBuilder append = ae.a(this.q.d, "1.1", "account", "update_profile").append(".json");
        final com.twitter.library.service.a a = new com.twitter.library.service.a(p.c, append);
        this.l = new ah(this.p, p).a(append).a(list).a(this.a(a));
        this.u();
        this.l.a(this.l.c().c(), aa);
        this.v();
        ErrorReporter.a(a);
        this.b(aa);
    }
}
