// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.preference.PreferenceManager;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.library.network.t;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.l;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.u;
import com.twitter.library.util.bh;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import com.twitter.library.network.LoginResponse;
import com.twitter.library.api.TwitterUser;
import java.util.Set;

public class n extends i
{
    private static final int a;
    private static final int e;
    private static final Set f;
    private TwitterUser h;
    private int[] i;
    private LoginResponse j;
    private String k;
    private char[] l;
    private String m;
    
    static {
        a = (int)TimeUnit.SECONDS.toMillis(10L);
        e = (int)TimeUnit.MINUTES.toMillis(3L);
        f = new HashSet(Arrays.asList(32, 229, 231, 244, 305));
    }
    
    public n(final Context context, final String s, final Session session, final String k, final String s2) {
        super(context, s, session);
        this.k = k;
        this.l = s2.toCharArray();
        this.m = bh.a(context);
        final l w = super.w();
        if (w != null) {
            w.a(new u(500, n.a, n.e, 10));
            this.a(w);
        }
    }
    
    private void a(final x x, final boolean b) {
        final boolean d = this.d((aa)x.b());
        final int n = -1 + x.a().size();
        String s;
        if (d) {
            s = "success";
        }
        else if (b) {
            s = "retry";
        }
        else {
            s = "failure";
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.P().c).b(new String[] { "app:login::authenticate", s })).a((long)n);
        final com.twitter.internal.network.l f = ((aa)x.b()).f();
        final HttpOperation e = ((aa)x.b()).e();
        if (f != null) {
            TwitterScribeLog.a(this.p, twitterScribeLog, f);
            twitterScribeLog.a(e.i().toString(), f);
        }
        ScribeService.a(this.p, twitterScribeLog);
    }
    
    private boolean d(final aa aa) {
        boolean a = aa.a();
        if (aa.f() != null) {
            final int j = aa.f().j;
            if (!a && !n.f.contains(j)) {
                return false;
            }
            a = true;
        }
        return a;
    }
    
    private void y() {
        for (int i = 0; i < this.l.length; ++i) {
            this.l[i] = '*';
        }
    }
    
    @Override
    public void a(final x x) {
        this.a(x, false);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final LoginResponse j = (LoginResponse)bg.a();
            this.j = j;
            if (j.d == 1) {
                final ac ac = new ac(this.p, this.P(), new t(j.a));
                aa.a(ac.S());
                this.h = ac.f();
                this.y();
            }
            return;
        }
        this.i = ae.a((List)bg.a());
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a((String)null).b("Accept", "application/json").a("auth", "1", "xauth_password").a("x_auth_identifier", this.k).a("x_auth_password", String.valueOf(this.l)).a("send_error_codes", "true");
        if (com.twitter.library.featureswitch.d.f("native_login_verification_enabled")) {
            a.a("x_auth_login_verification", "1");
        }
        if (com.twitter.library.featureswitch.d.f("login_challenge_enabled")) {
            a.a("x_auth_login_challenge", "1");
        }
        final String string = PreferenceManager.getDefaultSharedPreferences(this.p).getString("kdt", "");
        if (string.length() > 0) {
            a.a("kdt", string);
        }
        if (this.m != null) {
            a.a("x_auth_country_code", this.m.toUpperCase());
        }
        return a;
    }
    
    @Override
    public void b(final x x) {
        this.a(x, true);
    }
    
    protected bg e() {
        return bg.a(33);
    }
    
    public final String f() {
        return this.k;
    }
    
    public final TwitterUser g() {
        return this.h;
    }
    
    public final int[] t() {
        return this.i;
    }
    
    public final LoginResponse u() {
        return this.j;
    }
}
