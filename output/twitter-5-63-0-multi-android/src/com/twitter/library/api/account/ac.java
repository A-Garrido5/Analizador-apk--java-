// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.network.a;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.service.g;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.network.t;
import com.twitter.library.api.ar;

public class ac extends ar
{
    private final t a;
    private TwitterUser e;
    
    public ac(final Context context, final Session session, final t a) {
        super(context, ac.class.getName(), session);
        this.a = a;
        if (com.twitter.library.featureswitch.d.a("retry_nux_and_login_verification_get_requests_2753", new String[] { "network_retry_active" })) {
            this.a(new com.twitter.library.service.t());
        }
    }
    
    public ac(final Context context, final ab ab, final t a) {
        super(context, ac.class.getName(), ab);
        this.a = a;
        if (com.twitter.library.featureswitch.d.a("retry_nux_and_login_verification_get_requests_2753", new String[] { "network_retry_active" })) {
            this.a(new com.twitter.library.service.t());
        }
    }
    
    @Override
    protected e a() {
        return this.M().a(this.a).a(new Object[] { "account", "verify_credentials" }).a("include_user_entities", true).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final TwitterUser e = (TwitterUser)bg.a();
            this.e = e;
            final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
            list.add(e);
            final b w = this.W();
            com.twitter.library.provider.bg.a(this.p, e.userId).a(list, -1L, -1, -1L, null, null, true, w);
            w.a();
        }
    }
    
    @Override
    public String b() {
        return "app:twitter_service:account:verify_credentials";
    }
    
    protected bg e() {
        return bg.a(17);
    }
    
    public TwitterUser f() {
        return this.e;
    }
}
