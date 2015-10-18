// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeLog;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.bv;
import android.os.Bundle;
import com.twitter.library.av.w;
import android.widget.AbsListView;
import com.twitter.android.events.b;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.library.api.TwitterTopic;
import android.database.Cursor;
import com.twitter.library.service.aa;
import com.twitter.library.api.search.g;
import com.twitter.library.service.y;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.text.TextUtils;
import com.twitter.android.av.aw;
import android.content.SharedPreferences$Editor;
import com.twitter.internal.android.service.a;
import android.content.Context;
import com.twitter.library.api.search.h;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.SparseArray;

public abstract class SearchFragment extends TweetListFragment
{
    protected static final SparseArray b;
    protected String A;
    protected String B;
    protected String C;
    protected String D;
    protected String E;
    protected String F;
    protected rc G;
    protected sp H;
    private final Runnable I;
    private final Handler a;
    private int ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private sl as;
    private SharedPreferences at;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    protected boolean k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected long r;
    protected long s;
    protected String t;
    protected String u;
    protected String v;
    protected String w;
    protected String x;
    protected String y;
    protected String z;
    
    static {
        (b = new SparseArray(4)).put(0, (Object)10000L);
        SearchFragment.b.put(1, (Object)30000L);
        SearchFragment.b.put(2, (Object)60000L);
        SearchFragment.b.put(3, (Object)120000L);
    }
    
    public SearchFragment() {
        this.q = -1;
        this.a = new Handler();
        this.I = new rb(this);
    }
    
    private void U() {
        final h h = (h)new h((Context)this.getActivity(), this.aF()).c(1);
        h.a = this.s;
        this.a(h);
    }
    
    private sl V() {
        if (this.as == null) {
            (this.as = new sl((Context)this.getActivity(), this.getResources().getDimensionPixelSize(2131558806))).a(this.Y());
        }
        return this.as;
    }
    
    public static String d(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0:
            case 1: {
                return "everything";
            }
            case 2: {
                return "people";
            }
            case 3: {
                return "photos";
            }
            case 4:
            case 5: {
                return "video";
            }
            case 6: {
                return "news";
            }
            case 8: {
                return "eventsummary";
            }
            case 9: {
                return "geo";
            }
        }
    }
    
    protected void A() {
        if (!this.i || !this.w()) {
            return;
        }
        long n;
        if (this.r > 0L) {
            n = this.r;
        }
        else {
            n = (long)SearchFragment.b.get(this.p, (Object)300000L);
        }
        this.a.removeCallbacks(this.I);
        this.a.postDelayed(this.I, n);
    }
    
    protected void B() {
        final SharedPreferences$Editor edit = this.at.edit();
        edit.putLong("refresh_time", System.currentTimeMillis());
        edit.apply();
    }
    
    @Override
    protected boolean C() {
        return aw.a((Context)this.getActivity(), 902);
    }
    
    @Override
    public com.twitter.refresh.widget.a E() {
        final com.twitter.refresh.widget.a e = super.E();
        if (e.b == -2147483648L && this.x() > 1) {
            final int n = 1 + e.a;
            return new com.twitter.refresh.widget.a(n, this.Y().getItemIdAtPosition(n), e.c);
        }
        return e;
    }
    
    protected boolean F() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long long1 = this.at.getLong("refresh_time", 0L);
        return this.j && currentTimeMillis > long1 + 900000L;
    }
    
    public String H() {
        if (!TextUtils.isEmpty((CharSequence)this.t)) {
            return this.t;
        }
        return this.u;
    }
    
    public String I() {
        return this.u;
    }
    
    public boolean J() {
        return this.k;
    }
    
    public String K() {
        return this.F;
    }
    
    public String L() {
        if (this.y != null) {
            return this.y;
        }
        return this.u;
    }
    
    public boolean M() {
        return this.c;
    }
    
    protected abstract String M_();
    
    public boolean N() {
        return this.d;
    }
    
    protected int O() {
        if (this.ap) {
            return 6;
        }
        return this.ao;
    }
    
    public boolean P() {
        return this.aq;
    }
    
    public boolean Q() {
        return this.ar;
    }
    
    public void R() {
        this.V().a(this.Y(), 0);
    }
    
    public void S() {
        this.V().b(this.Y());
    }
    
    @Override
    public int a(final long n) {
        final ListView y = this.Y();
        if (y != null) {
            return this.b(n) + y.getHeaderViewsCount();
        }
        return 0;
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968793, viewGroup);
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        if (y instanceof g) {
            final g g = (g)y;
            if (n == 1 && ((aa)g.l().b()).a()) {
                this.o += g.t();
                final int u = g.u();
                if (u > 0) {
                    boolean b;
                    if (u == 1 && g.E() != null) {
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    this.n += u;
                    if (this.G != null && !b) {
                        this.G.a(this.n);
                    }
                }
                ++this.p;
                this.A();
                this.a(g.D());
            }
            this.r = g.y();
            this.F = g.C();
        }
    }
    
    protected abstract void a(final Context p0);
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && !this.h && this.x() < 400) {
            this.c(1);
        }
    }
    
    public void a(final rc g) {
        this.G = g;
        if (g != null && this.n > 0) {
            g.a(this.n);
        }
    }
    
    protected void a(final TwitterTopic twitterTopic) {
        final ToolBar aq = this.aq();
        if (aq != null && twitterTopic != null) {
            final TwitterTopic$SportsEvent twitterTopic$SportsEvent = (TwitterTopic$SportsEvent)twitterTopic.a(TwitterTopic$SportsEvent.class);
            if (twitterTopic$SportsEvent != null && twitterTopic$SportsEvent.summary != null) {
                aq.setSubtitle(twitterTopic$SportsEvent.summary);
            }
        }
    }
    
    protected void a(final g g) {
        com.twitter.android.events.b.a(g);
        if (!TextUtils.isEmpty((CharSequence)this.w)) {
            g.b(this.w);
        }
        if (!TextUtils.isEmpty((CharSequence)this.x)) {
            g.c(this.x);
        }
    }
    
    @Override
    protected void a(final com.twitter.refresh.widget.a a, final boolean b) {
        final int b2 = this.b(a.b);
        if (b2 >= this.Y().getHeaderViewsCount() || !b) {
            this.b(b2, a.c);
        }
    }
    
    protected abstract void a(final String p0);
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (n2 != 0 && b) {
            if (n == 0) {
                this.an();
            }
            else if (this.x() > 0 && n > 0 && n + n2 >= n3) {
                this.a((Cursor)null);
            }
        }
        return super.a(absListView, n, n2, n3, b);
    }
    
    protected abstract int b(final long p0);
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968796, viewGroup);
    }
    
    public void b(final boolean ap) {
        this.ap = ap;
    }
    
    @Override
    protected void c() {
        super.c();
        if (this.j) {
            this.a(false);
        }
    }
    
    protected abstract boolean c(final int p0);
    
    protected void e() {
        if (this.G != null) {
            this.G.a();
        }
        this.a_(this.l = 4);
        this.am();
        this.U();
        this.p = 0;
        this.n = 0;
        this.o = 0;
    }
    
    @Override
    protected void i() {
        if (this.n > 0) {
            this.e();
            return;
        }
        this.c(2);
    }
    
    @Override
    protected boolean l() {
        return com.twitter.library.av.w.a(92);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final Bundle arguments = this.getArguments();
        String string = arguments.getString("query");
        if (string == null) {
            string = "";
        }
        this.u = string;
        final String string2 = arguments.getString("query_name");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            this.t = string2;
        }
        else {
            this.t = string;
        }
        this.ao = arguments.getInt("q_type", 0);
        this.m = arguments.getInt("search_type", 0);
        this.e = arguments.getBoolean("recent", false);
        this.f = arguments.getBoolean("realtime", false);
        this.d = arguments.getBoolean("follows", false);
        this.c = arguments.getBoolean("near", false);
        if (this.N != null) {
            this.N.a(this.u);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        boolean g = true;
        int n = -1;
        super.onCreate(bundle);
        if (bundle != null) {
            this.s = bundle.getLong("search_id");
            this.h = bundle.getBoolean("is_last", false);
            this.v = bundle.getString("q_source");
            this.w = bundle.getString("query_rewrite_id");
            this.x = bundle.getString("data_lookup_id");
            this.n = bundle.getInt("polled_organic_count");
            this.o = bundle.getInt("polled_total_count");
            this.p = bundle.getInt("poll_count");
            this.i = bundle.getBoolean("should_poll", g);
            this.j = bundle.getBoolean("should_refresh", false);
            this.d = bundle.getBoolean("follows", false);
            this.c = bundle.getBoolean("near", false);
            this.aq = bundle.getBoolean("terminal", false);
            this.ar = bundle.getBoolean("search_button", false);
            this.y = bundle.getString("seed_hashtag");
            this.t = bundle.getString("query_name");
            this.z = bundle.getString("timeline_type");
            this.A = bundle.getString("experiments");
            this.B = bundle.getString("scribe_page");
            this.D = bundle.getString("event_id");
            this.q = bundle.getInt("event_type", n);
            this.E = bundle.getString("cluster_id");
            this.C = bundle.getString("notification_setting_key");
            this.ap = bundle.getBoolean("is_saved", false);
            this.F = bundle.getString("request_url");
        }
        else {
            this.h = false;
            final Bundle arguments = this.getArguments();
            this.l = arguments.getInt("fetch_type");
            this.s = arguments.getLong("search_id");
            this.v = arguments.getString("q_source");
            this.w = arguments.getString("query_rewrite_id");
            this.x = arguments.getString("data_lookup_id");
            this.aq = arguments.getBoolean("terminal", false);
            this.ar = arguments.getBoolean("search_button", false);
            this.i = arguments.getBoolean("should_poll", g);
            this.j = arguments.getBoolean("should_refresh", false);
            this.y = arguments.getString("seed_hashtag");
            this.t = arguments.getString("query_name");
            this.z = arguments.getString("timeline_type");
            this.A = arguments.getString("experiments");
            this.B = arguments.getString("scribe_page");
            this.d = arguments.getBoolean("follows", false);
            this.c = arguments.getBoolean("near", false);
            this.D = arguments.getString("event_id");
            this.q = arguments.getInt("event_type", n);
            this.E = arguments.getString("cluster_id");
            this.C = arguments.getString("notification_setting_key");
            if (TextUtils.isEmpty((CharSequence)this.B)) {
                this.B = "search";
            }
            if (this.v == null && this.C != null) {
                final String c = this.C;
                switch (c.hashCode()) {
                    case 956662491: {
                        if (c.equals("event_parrot")) {
                            n = 0;
                            break;
                        }
                        break;
                    }
                }
                switch (n) {
                    case 0: {
                        this.v = "evpa";
                        break;
                    }
                }
            }
        }
        if (TextUtils.isEmpty((CharSequence)this.C)) {
            g = false;
        }
        this.g = g;
        if (this.l == 0) {
            this.l = 3;
        }
        this.a((bv)this);
        final FragmentActivity activity = this.getActivity();
        this.at = ((Context)activity).getSharedPreferences("search", 0);
        this.H = sp.a((Context)activity);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(false);
        this.y();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("should_poll", this.i);
        bundle.putBoolean("should_refresh", this.j);
        bundle.putBoolean("follows", this.d);
        bundle.putBoolean("near", this.c);
        bundle.putBoolean("terminal", this.aq);
        bundle.putBoolean("search_button", this.ar);
        bundle.putBoolean("is_last", this.h);
        bundle.putBoolean("is_saved", this.ap);
        bundle.putInt("polled_organic_count", this.n);
        bundle.putInt("polled_total_count", this.o);
        bundle.putInt("poll_count", this.p);
        bundle.putInt("event_type", this.q);
        bundle.putLong("search_id", this.s);
        bundle.putString("q_source", this.v);
        bundle.putString("query_rewrite_id", this.w);
        bundle.putString("data_lookup_id", this.x);
        bundle.putString("query_name", this.t);
        bundle.putString("seed_hashtag", this.y);
        bundle.putString("timeline_type", this.z);
        bundle.putString("experiments", this.A);
        bundle.putString("scribe_page", this.B);
        bundle.putString("notification_setting_key", this.C);
        bundle.putString("event_id", this.D);
        bundle.putString("cluster_id", this.E);
        bundle.putString("request_url", this.F);
    }
    
    @Override
    public void onStop() {
        this.a.removeCallbacks(this.I);
        this.z();
        super.onStop();
    }
    
    public void r() {
        this.Y().smoothScrollToPosition(0);
        if (this.o > 0) {
            this.e();
            this.a(ScribeLog.a(this.B, this.M_(), "new_tweet_prompt", "", "click"));
        }
    }
    
    public abstract int t();
    
    protected abstract boolean w();
    
    protected abstract int x();
    
    protected abstract void y();
    
    protected abstract void z();
}
