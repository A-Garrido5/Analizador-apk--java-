// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.api.PromotedContent;
import java.util.TimeZone;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.location.Location;
import com.twitter.library.featureswitch.d;
import android.text.TextUtils;
import java.util.HashSet;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Set;
import com.twitter.library.api.TwitterTopic;
import java.util.ArrayList;
import com.twitter.library.api.account.i;

public class g extends i
{
    private double A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private ArrayList L;
    private ArrayList M;
    private TwitterTopic N;
    private String O;
    private String P;
    private Set Q;
    private final int a;
    private final int e;
    private final long f;
    private final boolean h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private boolean m;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private long w;
    private long x;
    private long y;
    private double z;
    
    public g(final Context context, final Session session, final long n, final String s, final int n2, final String s2, final String s3, final int n3, final String s4, final boolean b) {
        this(context, session, n, s, n2, s2, s3, n3, s4, b, false);
    }
    
    public g(final Context context, final Session session, final long f, final String i, final int a, final String k, final String j, final int e, final String l, final boolean h, final boolean b) {
        super(context, g.class.getName(), session);
        this.s = true;
        this.z = Double.NaN;
        this.A = Double.NaN;
        this.Q = new HashSet();
        this.f = f;
        this.i = i;
        this.a = a;
        this.k = k;
        this.j = j;
        this.e = e;
        this.l = l;
        this.B = b(b);
        this.h = h;
    }
    
    private String F() {
        return TextUtils.join((CharSequence)",", this.Q.toArray());
    }
    
    private String G() {
        if (this.J == null) {
            this.J = this.V().b(7, 13, this.P().c, Long.toString(this.f));
        }
        return this.J;
    }
    
    private static String b(final boolean b) {
        String string = "tweet,user_gallery,news,media_gallery,suggestion,event,tweet_gallery,follows_tweet_gallery,nearby_tweet_gallery";
        if (d.f("search_features_summary_enabled")) {
            string += ",summary";
        }
        return string;
    }
    
    public String A() {
        return this.H;
    }
    
    public String B() {
        return this.I;
    }
    
    public String C() {
        return this.K;
    }
    
    public TwitterTopic D() {
        if (this.L != null && this.L.size() == 1) {
            return this.L.get(0);
        }
        return null;
    }
    
    public TwitterTopic E() {
        return this.N;
    }
    
    public g a(final int n, final boolean b, final boolean b2, final boolean b3) {
        switch (n) {
            case 1: {
                this.B = "tweet";
                break;
            }
            case 2: {
                this.B = "user";
                break;
            }
            case 3: {
                this.B = "tweet";
                this.D = "images";
                break;
            }
            case 5: {
                this.B = "tweet";
                this.D = "videos";
                break;
            }
            case 4: {
                this.B = "tweet";
                this.D = "vine";
                break;
            }
            case 6: {
                this.B = "tweet";
                this.D = "news";
                break;
            }
            case 7: {
                this.B = "tweet";
                this.D = "media";
                break;
            }
            case 8: {
                this.B = "event_summary";
                break;
            }
            case 9: {
                this.B = "tweet,media_gallery";
                break;
            }
            case 10: {
                this.B = "tweet";
                break;
            }
            case 11: {
                this.B = "media_gallery";
                break;
            }
        }
        if (com.twitter.library.featureswitch.d.f("search_features_universal_event_summary_enabled") && n != 8) {
            this.B += ",event_summary";
        }
        if (b) {
            this.C = "follows";
        }
        else {
            if (b2) {
                this.C = "recent";
                return this;
            }
            if (b3) {
                this.C = "realtime";
                return this;
            }
        }
        return this;
    }
    
    public g a(final long w, final long x) {
        this.w = w;
        this.x = x;
        return this;
    }
    
    public g a(final Location location) {
        if (location != null) {
            this.z = location.getLatitude();
            this.A = location.getLongitude();
        }
        return this;
    }
    
    public g a(final String s) {
        this.Q.add(s);
        return this;
    }
    
    public g a(final String g, final String f) {
        this.G = g;
        this.F = f;
        return this;
    }
    
    public g a(final ArrayList m) {
        this.M = m;
        return this;
    }
    
    public g a(final boolean s) {
        this.s = s;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        this.K = httpOperation.i().toString();
        if (httpOperation.k()) {
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            final l l = (l)bg.a();
            int n = 0;
            switch (this.e) {
                default: {
                    v.d(this.f);
                    n = 0;
                    break;
                }
                case 1: {
                    n = v.a(true, this.f) - l.a.size();
                    break;
                }
                case 2: {
                    n = 1 + v.a(false, this.f);
                    break;
                }
            }
            final long c = this.P().c;
            if (!TextUtils.isEmpty((CharSequence)l.b)) {
                v.a(7, 13, c, Long.toString(this.f), l.b);
            }
            final boolean q = this.Q();
            int a;
            if (l.a.isEmpty()) {
                a = 0;
            }
            else {
                b w2;
                if (!q || !CollectionUtils.a((Collection)l.j)) {
                    if (com.twitter.library.featureswitch.d.f("event_update_enabled")) {
                        w2 = this.W();
                    }
                    else {
                        w2 = null;
                    }
                }
                else {
                    w2 = null;
                }
                a = v.a(this.f, l, c, n, this.e == 1, this.e == 0, q, w2);
                if (w2 != null) {
                    w2.a();
                }
            }
            if (q && this.h) {
                v.c(this.f, w);
                w.a();
            }
            this.t = a;
            this.v = a - l.e;
            if (this.v < 0) {
                this.v = 0;
            }
            this.y = l.f;
            this.L = l.j;
            if (l.a.size() > 0) {
                final m m = l.a.get(0);
                if (m != null && m.l != null && m.l.size() > 0) {
                    this.N = (TwitterTopic)m.l.get(0);
                }
            }
            this.H = l.g;
            this.G = l.i;
            this.I = l.h;
            this.m = l.c;
            this.r = l.d;
        }
    }
    
    public g b(final String o) {
        this.O = o;
        return this;
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "search", "universal" }).a("q", this.i);
        if (!TextUtils.isEmpty((CharSequence)this.k)) {
            a.a("query_source", this.k);
        }
        else {
            a.a("query_source", "unknown");
        }
        if (!Double.isNaN(this.z) && !Double.isNaN(this.A) && sk.a().b()) {
            a.a("near", String.format("%.7f", this.z) + ',' + String.format("%.7f", this.A));
        }
        if (this.C != null) {
            a.a("result_type", this.C);
        }
        if (this.D != null) {
            a.a("filter", this.D);
        }
        if (this.E != null) {
            a.a("timeline_type", this.E);
        }
        a.a("modules", this.B);
        if (this.l != null) {
            a.a("experiments", this.l);
        }
        final long n = lcmp(this.w, 0L);
        boolean b = false;
        if (n > 0) {
            final long n2 = lcmp(this.w, this.x);
            b = false;
            if (n2 < 0) {
                b = true;
            }
        }
        if (b) {
            a.a("since_time", this.w);
            a.a("until_time", this.x);
        }
        if (this.F != null) {
            a.a("cluster_id", this.F);
        }
        else {
            a.a("get_clusters", true);
        }
        if (this.e != 0) {
            final String g = this.G();
            switch (this.e) {
                case 2: {
                    a.a("next_cursor", g);
                    break;
                }
                case 1: {
                    a.a("prev_cursor", g);
                    break;
                }
            }
        }
        if (this.G != null) {
            a.a("event_id", this.G);
        }
        if (this.u > 0) {
            a.a("count", this.u);
        }
        if (!CollectionUtils.a((Collection)this.M)) {
            a.a("pt", TextUtils.join((CharSequence)",", (Iterable)this.M));
        }
        if (!this.Q.isEmpty()) {
            a.a("enabled_verticals", this.F());
        }
        if (!TextUtils.isEmpty((CharSequence)this.O)) {
            a.a("query_rewrite_id", this.O);
        }
        if (!TextUtils.isEmpty((CharSequence)this.P)) {
            a.a("data_lookup_id", this.P);
        }
        String s;
        if (this.s) {
            s = "true";
        }
        else {
            s = "false";
        }
        return a.a("pc", s).a("include_media_features", true).a("include_cards", true).a("timezone", TimeZone.getDefault().getID()).b();
    }
    
    @Override
    protected boolean b(final aa aa) {
        final boolean b = this.e == 0 || this.G() != null;
        if (b && this.F == null && this.G == null && !this.Q() && !"taoc".equals(this.k) && !"timeline".equals(this.k) && !"trend_click".equals(this.k) && !"promoted_trend_click".equals(this.k)) {
            final TwitterSearchQuery twitterSearchQuery = new TwitterSearchQuery(this.j, this.i, 0L, 0L, null, null, null, null, null, null, CollectionUtils.a());
            final b w = this.W();
            this.V().a(twitterSearchQuery, this.a, w);
            w.a();
        }
        return b;
    }
    
    public g c(final int u) {
        this.u = u;
        return this;
    }
    
    public g c(final String p) {
        this.P = p;
        return this;
    }
    
    protected bg e() {
        return bg.a(24);
    }
    
    public boolean f() {
        return this.m;
    }
    
    public boolean g() {
        return this.r;
    }
    
    public int t() {
        return this.t;
    }
    
    public int u() {
        return this.v;
    }
    
    public long y() {
        return this.y;
    }
    
    public String z() {
        return this.G;
    }
}
