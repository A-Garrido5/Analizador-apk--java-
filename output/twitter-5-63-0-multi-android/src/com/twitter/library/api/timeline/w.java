// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.twitter.library.client.App;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.at;
import com.twitter.library.client.k;
import com.twitter.library.api.bs;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.ar;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.m;
import com.twitter.library.service.r;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.l;
import com.twitter.library.client.Session;
import com.twitter.library.service.ab;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.network.OAuthToken;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.network.t;

public class w extends RichTimeline
{
    private final t h;
    private boolean i;
    private ArrayList j;
    
    public w(final Context context, final long n, final String s, final OAuthToken oAuthToken, final TwitterUser twitterUser) {
        super(context, w.class.getName(), new ab(n, s, oAuthToken, true), twitterUser);
        this.h = new t(oAuthToken);
        this.c(100);
    }
    
    public w(final Context context, final Session session, final TwitterUser twitterUser) {
        this(context, new ab(session), twitterUser);
    }
    
    public w(final Context context, final ab ab, final TwitterUser twitterUser) {
        super(context, w.class.getName(), ab, twitterUser);
        this.h = new t(ab.d);
        this.c(100);
        final l l = new l();
        l.a(new com.twitter.library.service.t()).a(new r(1)).a(new m(context));
        this.f(30000);
        this.a(l);
    }
    
    public static boolean e() {
        return d.f("recap_enabled");
    }
    
    public static boolean f() {
        return d.f("wtf_tweet_enabled");
    }
    
    public static boolean t() {
        return d.f("wtf_follow_module_enabled");
    }
    
    @Override
    protected aa A() {
        return new ac().a(e()).b(f()).c(t()).a();
    }
    
    @Override
    protected void B() {
        this.b(new nv(this.p, this.F(), this.a, this.h.b()));
    }
    
    public w a(final boolean i) {
        this.i = i;
        return this;
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        if (x != null && x.b() != null && this.P() != null && com.twitter.library.featureswitch.d.f("timeline_request_scribe_sample")) {
            ar.a(this.p, this.y(), this.P().c, ((com.twitter.library.service.aa)x.b()).a(), x, false);
        }
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final com.twitter.library.service.aa aa, final bg bg) {
        if (httpOperation.k()) {
            final com.twitter.library.provider.bg v = this.V();
            final bs bs = (bs)bg.a();
            final ArrayList a = bs.a;
            final long a2 = bs.a();
            long long1;
            if (this.e == RichTimeline$RequestType.b) {
                final k k = new k(this.p, this.a);
                if (this.Q()) {
                    if (k.contains("scribe_group_id")) {
                        long1 = k.getLong("scribe_group_id", -1L);
                    }
                    else {
                        k.a().a("scribe_group_id", a2).apply();
                        long1 = a2;
                    }
                }
                else {
                    if (k.contains("scribe_group_id")) {
                        k.a().a("scribe_group_id").apply();
                    }
                    long1 = Long.MAX_VALUE;
                }
            }
            else {
                long1 = a2;
            }
            for (final at at : a) {
                at.m = a2;
                at.n = long1;
            }
            if (!a.isEmpty()) {
                final at at2 = a.get(0);
                if (at2.j != null && at2.j.c.jump) {
                    aa.c.putBoolean("recap_jump", true);
                }
            }
            this.f = a;
            final ag a3 = this.a(bs);
            final int b = a3.b;
            final long f = this.F();
            final b w = this.W();
            if (a3.d) {
                final com.twitter.library.provider.k a4 = com.twitter.library.provider.k.a(this.p);
                if (a4.b(this.a, "tweet") == 0) {
                    a4.a(this.a, "tweet", 1, w);
                    w.a();
                }
            }
            this.a(b, a3.a, a3.c);
            this.e(v.f(f, 0));
            if (!this.Q() && b > 0) {
                ScribeService.a(this.p, new TwitterScribeLog(f).b(new String[] { "home::::tlv_proxy" }));
            }
            aa.c.putInt("scribe_item_count", b);
        }
    }
    
    @Override
    public void b(final x x) {
        super.b(x);
        if (x != null && x.b() != null && this.P() != null && com.twitter.library.featureswitch.d.f("timeline_request_scribe_sample")) {
            ar.a(this.p, this.y(), this.P().c, ((com.twitter.library.service.aa)x.b()).a(), x, true);
        }
    }
    
    @Override
    protected f g() {
        final f m = this.M();
        m.a(new Object[] { "timeline", "home" }).a("user_id", this.F());
        this.a(m);
        m.a("pc", true);
        m.a("earned", true);
        m.a("include_my_retweet", true);
        if (this.i) {
            m.a("include_ptr", true);
            if (App.f()) {
                final String a = aj.a(this.p);
                if (a != null) {
                    m.a("ptr_demo", a);
                }
            }
        }
        if (this.u()) {
            m.a("include_curated_tweets", true);
        }
        if (this.j != null) {
            final StringBuilder sb = new StringBuilder();
            final Iterator<String> iterator = (Iterator<String>)this.j.iterator();
            int n = 1;
            while (iterator.hasNext()) {
                final String s = iterator.next();
                final String d = com.twitter.library.featureswitch.d.d(s);
                int n2;
                if (!"unassigned".equals(d)) {
                    if (n == 0) {
                        sb.append(',');
                    }
                    sb.append(s);
                    sb.append('/');
                    sb.append(d);
                    n2 = 0;
                }
                else {
                    n2 = n;
                }
                n = n2;
            }
            if (sb.length() > 0) {
                m.a("force_buckets", sb.toString());
            }
        }
        return m;
    }
    
    protected boolean u() {
        return com.twitter.library.featureswitch.d.f("custom_timelines_follow_enabled");
    }
    
    public String y() {
        return "app:twitter_service:timeline:request";
    }
    
    @Override
    protected int z() {
        return 0;
    }
}
