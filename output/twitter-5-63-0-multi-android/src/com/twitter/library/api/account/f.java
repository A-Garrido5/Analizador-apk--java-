// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.util.j;
import com.twitter.library.network.e;
import com.twitter.library.network.c;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.d;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.ar;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.l;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.u;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import com.twitter.library.api.TwitterUser;
import java.util.List;
import com.twitter.library.api.as;
import com.twitter.library.network.LoginResponse;

public class f extends i
{
    private static final int a;
    private static final int e;
    private final String f;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private String l;
    private LoginResponse m;
    private as r;
    private List s;
    private TwitterUser t;
    private String u;
    private String v;
    private String w;
    
    static {
        a = (int)TimeUnit.SECONDS.toMillis(10L);
        e = (int)TimeUnit.MINUTES.toMillis(3L);
    }
    
    public f(final Context context, final Session session, final String k, final String h, final String i, final String j, final String f) {
        super(context, f.class.getName(), session);
        this.f = f;
        this.h = h;
        this.k = k;
        this.i = i;
        this.j = j;
        final u u = new u(100, com.twitter.library.api.account.f.a, com.twitter.library.api.account.f.e);
        final l w = super.w();
        if (w != null) {
            w.a(u);
            this.a(w);
            return;
        }
        this.a(u);
    }
    
    private void a(final x x, final boolean b) {
        ar.a(this.p, "app:twitter_service:account:create", this.P().c, this.d(x), x, b);
    }
    
    public f a(final String l) {
        this.l = l;
        return this;
    }
    
    @Override
    public void a(final x x) {
        this.a(x, false);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final int a = httpOperation.l().a;
        final Object a2 = bg.a();
        if (a == 200) {
            final String b = httpOperation.b("x-twitter-new-account-oauth-access-token");
            final String b2 = httpOperation.b("x-twitter-new-account-oauth-secret");
            if (b == null || b2 == null) {
                return;
            }
            final OAuthToken oAuthToken = new OAuthToken(b, b2);
            this.m = new LoginResponse(1, oAuthToken.b, oAuthToken.a);
            this.t = (TwitterUser)a2;
        }
        else if (a == 403 && a2 instanceof as) {
            this.r = (as)a2;
        }
        else {
            this.s = (List)a2;
        }
        super.a(httpOperation, aa, bg);
    }
    
    @Override
    protected com.twitter.library.service.f b() {
        final com.twitter.library.service.f a = this.M().a(HttpOperation$RequestMethod.b).a("1.1").a(new Object[] { "account", "create" });
        final String k = this.k;
        final String h = this.h;
        final String i = this.i;
        final String j = this.j;
        final String f = this.f;
        final String l = this.l;
        final String u = this.u;
        final String v = this.v;
        final String w = this.w;
        if (k != null) {
            a.a("name", k);
        }
        if (h != null) {
            a.a("screen_name", h);
        }
        if (i != null) {
            a.a("email", i);
        }
        if (j != null) {
            a.a("phone_number", j);
        }
        if (f != null) {
            a.a("password", f);
        }
        if (l != null) {
            a.a("lang", l);
        }
        if (!TextUtils.isEmpty((CharSequence)u)) {
            a.a("google_auth_token", u);
        }
        if (!TextUtils.isEmpty((CharSequence)v)) {
            a.a("ghv", v);
        }
        if (!TextUtils.isEmpty((CharSequence)w)) {
            a.a("shv", w);
        }
        a.a("app_cred", true);
        return a;
    }
    
    @Override
    public void b(final x x) {
        this.a(x, true);
    }
    
    @Override
    protected boolean b(final aa aa) {
        if ((com.twitter.library.featureswitch.d.f("google_auth_token_signal_param_enabled") || com.twitter.library.featureswitch.d.f("android_autoconfirm_enabled")) && this.u == null) {
            this.u = com.twitter.library.network.c.a(this.p).a();
        }
        if (com.twitter.library.featureswitch.d.f("signup_ghv_enabled") && this.v() instanceof e && !TextUtils.isEmpty((CharSequence)((e)this.v()).b())) {
            this.v = com.twitter.library.util.j.a(((e)this.v()).b());
        }
        if (com.twitter.library.featureswitch.d.f("signup_shv_enabled") && !TextUtils.isEmpty((CharSequence)this.h)) {
            this.w = com.twitter.library.util.j.a(this.h);
        }
        return super.b(aa);
    }
    
    protected boolean d(final x x) {
        if (((aa)x.b()).a()) {
            return true;
        }
        final aa aa = (aa)x.b();
        return aa.c() == 403 || aa.c() == 412;
    }
    
    protected bg e() {
        return bg.a(60);
    }
    
    public as f() {
        return this.r;
    }
    
    public TwitterUser g() {
        return this.t;
    }
    
    public String t() {
        return this.h;
    }
    
    public LoginResponse u() {
        return this.m;
    }
}
