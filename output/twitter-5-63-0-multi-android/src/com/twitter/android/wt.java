// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;
import android.widget.AbsListView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.util.bk;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.client.Session;
import com.twitter.internal.android.service.a;
import java.util.Collection;
import com.twitter.library.api.timeline.z;
import com.twitter.library.client.as;
import android.widget.ListView;
import com.twitter.library.provider.Tweet;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.App;
import java.util.HashSet;
import java.util.Iterator;
import com.twitter.library.api.b;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.widget.cz;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import java.util.HashMap;
import java.util.ArrayList;
import com.twitter.android.client.bv;

public class wt implements bv
{
    private final ArrayList a;
    private final ArrayList b;
    private final ArrayList c;
    private final HashMap d;
    private final c e;
    private final az f;
    private final Context g;
    private String h;
    private TwitterScribeAssociation i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;
    private cz n;
    private boolean o;
    private TwitterScribeItem p;
    
    public wt(final Context context, final TwitterScribeAssociation i, final int j, final TwitterScribeItem p5, final boolean b) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.j = -1;
        this.l = false;
        this.m = false;
        this.o = false;
        this.e = com.twitter.android.client.c.a(context);
        this.f = az.a(context);
        this.g = context.getApplicationContext();
        this.i = i;
        this.j = j;
        this.p = p5;
        if (b) {
            this.n = new cz();
        }
    }
    
    private void a(final ArrayList list, final long n, final String s) {
        final String a = bj.a();
        final b a2 = u.a.a();
        for (final TwitterScribeItem twitterScribeItem : this.c) {
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(n);
            twitterScribeLog.b(new String[] { s });
            twitterScribeLog.a(this.p);
            twitterScribeLog.a(twitterScribeItem);
            twitterScribeLog.e(this.h);
            twitterScribeLog.f("app_download_client_event");
            if (!TextUtils.isEmpty((CharSequence)a)) {
                twitterScribeLog.a("3", bq.a(twitterScribeItem.n, a));
                twitterScribeLog.a("4", a);
            }
            if (a2 != null) {
                twitterScribeLog.a("6", a2.a());
                twitterScribeLog.a(a2.b());
            }
            this.e.a(twitterScribeLog);
        }
    }
    
    private boolean a(final long n, final long n2) {
        final Long value = n;
        HashSet<Long> set = this.d.get(value);
        if (set == null) {
            set = new HashSet<Long>();
            this.d.put(value, set);
        }
        return set.add(n2);
    }
    
    public static boolean c() {
        return App.f() || d.f("legacy_deciders_scribe_linger");
    }
    
    public static float d() {
        return d.a("legacy_deciders_scribe_status_linger_minimum_threshold", 0.0f);
    }
    
    public static float e() {
        return d.a("legacy_deciders_scribe_status_linger_maximum_threshold", 0.0f);
    }
    
    public String a(final Tweet tweet) {
        if (tweet.B()) {
            return "focal";
        }
        if (tweet.A()) {
            return "ancestor";
        }
        return null;
    }
    
    public void a() {
        if (this.n != null) {
            this.n.a((ListView)null);
        }
    }
    
    public void a(final long n) {
        if (n != 0L) {
            final Session b = this.f.b(n);
            final ArrayList a = this.a;
            if (b != null && !a.isEmpty()) {
                as.a(this.g).a(new z(this.g, b, this.j, a));
                a.clear();
            }
        }
    }
    
    public void a(final long n, final String s) {
        if (!this.b.isEmpty()) {
            this.e.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s })).a(this.p)).b(this.b)).e(this.h));
            if (this.c.size() > 0) {
                this.a(this.c, n, s);
                this.c.clear();
            }
            this.b.clear();
            if (this.o) {
                this.e.a(n, this.i.a() + "::tweet:inline_action_labels:impression");
            }
        }
    }
    
    public void a(final long n, final String s, final long n2) {
        if (this.n != null && c()) {
            final ArrayList a = this.n.a(n2);
            if (!a.isEmpty()) {
                this.e.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s })).a(this.p)).b(a)).e(this.h));
                a.clear();
            }
        }
    }
    
    public void a(final View view, final Tweet tweet, final Bundle bundle) {
        this.a(tweet, bundle);
        if (this.n != null && c()) {
            if (this.m) {
                this.n.a(view, tweet, this.g);
                if (!this.l) {
                    this.n.a(bk.a());
                }
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new wu(this, view, tweet));
        }
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new wv(this, view));
    }
    
    public void a(final ListView listView) {
        if (this.n != null) {
            this.n.a(d(), e());
            this.n.a(listView);
            this.n.a(this.i);
            if (c()) {
                this.n.a(bk.a());
            }
        }
    }
    
    public void a(final String h) {
        this.h = h;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        if (this.n != null) {
            if (n == 1) {
                this.m = true;
                this.k = bk.a();
            }
            else {
                if (n == 2) {
                    this.l = true;
                    return false;
                }
                if (n == 0 && c()) {
                    long n2;
                    if (this.l) {
                        n2 = this.k;
                    }
                    else {
                        n2 = bk.a();
                    }
                    this.n.a(n2);
                    return this.l = false;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        return false;
    }
    
    public boolean a(final Tweet tweet, final Bundle bundle) {
        if (!tweet.k && this.a(this.f.b().g(), tweet.Z)) {
            this.a.add(tweet.Z);
            this.b(tweet, bundle);
            final PromotedContent j = tweet.j;
            if (j != null) {
                this.e.a(PromotedEvent.a, j);
            }
            return true;
        }
        return false;
    }
    
    public void b() {
        this.d.remove(this.f.b().g());
    }
    
    protected void b(final Tweet tweet, final Bundle bundle) {
        final TwitterScribeItem a = TwitterScribeItem.a(this.g, tweet, this.i, this.a(tweet));
        a.h = bundle.getInt("cursor", -1);
        a.y = bundle.getString("entity_type");
        a.x = bundle.getString("query");
        a.b = tweet.L;
        a.g = 1 + bundle.getInt("position");
        a.z = (int)bundle.getLong("tweet_count", -1L);
        this.b.add(a);
        if (a.i == 6 && !TextUtils.isEmpty((CharSequence)a.n)) {
            this.c.add(a);
        }
    }
}
