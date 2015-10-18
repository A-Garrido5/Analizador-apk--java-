// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.internal.android.service.x;
import com.twitter.library.util.j;
import com.twitter.library.network.c;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.library.util.am;
import com.twitter.library.network.a;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.network.t;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import com.twitter.library.network.e;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.as;
import com.twitter.library.network.LoginResponse;
import com.twitter.library.api.ar;

@Deprecated
public class y extends ar
{
    private static final int a;
    private static final int e;
    private final String f;
    private final String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String r;
    private LoginResponse s;
    private as t;
    private TwitterUser u;
    private String v;
    private e w;
    private String x;
    private String y;
    
    static {
        a = (int)TimeUnit.SECONDS.toMillis(10L);
        e = (int)TimeUnit.MINUTES.toMillis(3L);
    }
    
    public y(final Context context, final Session session, final String g, final String f) {
        super(context, y.class.getName(), session);
        this.g = g;
        this.f = f;
        this.a(new u(100, com.twitter.library.api.account.y.a, com.twitter.library.api.account.y.e));
    }
    
    public y a(final String h) {
        this.h = h;
        return this;
    }
    
    @Override
    protected com.twitter.library.service.e a() {
        final f b = this.M().b("mobile.twitter.com").a((String)null).a(HttpOperation$RequestMethod.b).a(new t(null, com.twitter.library.network.t.i, com.twitter.library.network.t.j)).b(new Object[] { "mobile_client_api", "signup" });
        final String r = this.r;
        final String g = this.g;
        final String l = this.l;
        final String m = this.m;
        final String f = this.f;
        final String k = this.k;
        final String j = this.j;
        final String h = this.h;
        final String i = this.i;
        final String v = this.v;
        final e w = this.w;
        final String x = this.x;
        final String y = this.y;
        final am a = am.a(this.p);
        if (r != null) {
            b.a("fullname", r);
        }
        if (g != null) {
            b.a("screen_name", g);
        }
        if (l != null) {
            b.a("email", l);
        }
        if (m != null) {
            b.a("phone_number", m);
        }
        if (f != null) {
            b.a("password", f);
        }
        if (h != null) {
            b.a("lang", h);
        }
        if (i != null) {
            b.a("locale", i);
        }
        if (a.a()) {
            b.a("discoverable_by_email", "true");
        }
        if (a.b()) {
            b.a("discoverable_by_mobile_phone", "true");
        }
        if (w != null && w.b() != null) {
            b.a("guest_token", w.b());
        }
        if (k != null && j != null) {
            b.a("captcha_token", k);
            b.a("captcha_solution", j);
        }
        if (!TextUtils.isEmpty((CharSequence)v)) {
            b.a("google_auth_token", v);
        }
        if (!TextUtils.isEmpty((CharSequence)x)) {
            b.a("ghv", x);
        }
        if (!TextUtils.isEmpty((CharSequence)y)) {
            b.a("shv", y);
        }
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final int a = httpOperation.l().a;
        if (a == 200) {
            final OAuthToken oAuthToken = (OAuthToken)bg.a();
            this.s = new LoginResponse(1, oAuthToken.b, oAuthToken.a);
            final ac ac = new ac(this.p, this.P(), new t(oAuthToken));
            aa.a(ac.S());
            this.u = ac.f();
            if (aa.f().a != 200) {
                aa.a(400);
            }
        }
        else {
            if (a == 403) {
                this.t = (as)bg.a();
                return;
            }
            if (a == 412) {
                this.t = (as)bg.a();
            }
        }
    }
    
    public y b(final String i) {
        this.i = i;
        return this;
    }
    
    @Override
    public String b() {
        return "app:twitter_service:account:create";
    }
    
    public y c(final String j) {
        this.j = j;
        return this;
    }
    
    @Override
    protected final boolean c(final aa aa) {
        if ((com.twitter.library.featureswitch.d.f("signup_guest_auth_token_param_enabled") || !TextUtils.isEmpty((CharSequence)this.m)) && this.w == null) {
            this.w = com.twitter.library.network.e.a(this.p);
        }
        if ((com.twitter.library.featureswitch.d.f("google_auth_token_signal_param_enabled") || com.twitter.library.featureswitch.d.f("android_autoconfirm_enabled")) && this.v == null) {
            this.v = com.twitter.library.network.c.a(this.p).a();
        }
        if (com.twitter.library.featureswitch.d.f("signup_ghv_enabled") && this.w != null && !TextUtils.isEmpty((CharSequence)this.w.b())) {
            this.x = com.twitter.library.util.j.a(this.w.b());
        }
        if (com.twitter.library.featureswitch.d.f("signup_shv_enabled") && !TextUtils.isEmpty((CharSequence)this.g)) {
            this.y = com.twitter.library.util.j.a(this.g);
        }
        return true;
    }
    
    public y d(final String r) {
        this.r = r;
        return this;
    }
    
    @Override
    protected boolean d(final x x) {
        if (super.d(x)) {
            return true;
        }
        final aa aa = (aa)x.b();
        return aa.c() == 403 || aa.c() == 412;
    }
    
    public y e(final String l) {
        this.l = l;
        return this;
    }
    
    public LoginResponse e() {
        return this.s;
    }
    
    public y f(final String m) {
        this.m = m;
        return this;
    }
    
    protected bg f() {
        return bg.a(34);
    }
    
    public y g(final String k) {
        this.k = k;
        return this;
    }
    
    public as g() {
        return this.t;
    }
    
    public TwitterUser t() {
        return this.u;
    }
    
    public String u() {
        return this.g;
    }
}
