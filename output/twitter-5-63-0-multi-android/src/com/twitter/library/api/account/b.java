// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.network.a;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.library.network.t;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.network.LoginResponse;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.c;

public abstract class b extends c
{
    private TwitterUser a;
    private int[] e;
    private LoginResponse f;
    
    protected b(final Context context, final String s, final Session session) {
        super(context, s, session);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final LoginResponse f = (LoginResponse)bg.a();
            this.f = f;
            if (f.d == 1) {
                final ac ac = new ac(this.p, this.P(), new t(f.a));
                aa.a(ac.S());
                this.a = ac.f();
            }
            return;
        }
        this.e = ae.a((List)bg.a());
    }
    
    protected final f b() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a((String)null).b("Accept", "application/json").a(new t(1)).b(new Object[] { "oauth", "access_token" }).a("x_auth_mode", "client_auth");
        if (com.twitter.library.featureswitch.d.f("native_login_verification_enabled")) {
            a.a("x_auth_login_verification", "1");
        }
        else {
            a.a("x_auth_json_response", "1");
        }
        if (com.twitter.library.featureswitch.d.f("login_challenge_enabled")) {
            a.a("x_auth_login_challenge", "1");
        }
        a.a("send_error_codes", "true");
        return a;
    }
    
    protected bg e() {
        return bg.a(33);
    }
    
    public final TwitterUser f() {
        return this.a;
    }
    
    public final int[] g() {
        return this.e;
    }
    
    public final LoginResponse t() {
        return this.f;
    }
}
