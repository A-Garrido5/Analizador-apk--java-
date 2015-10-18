// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import com.twitter.library.client.Session$LoginStatus;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import android.view.LayoutInflater;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import java.util.List;
import java.util.Collection;
import android.content.Intent;
import com.twitter.library.util.bq;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import java.io.Serializable;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.view.ViewGroup;
import com.twitter.android.widget.br;
import android.os.Parcelable;
import android.content.Context;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import com.twitter.library.client.Session;
import android.os.Bundle;
import com.twitter.util.q;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.support.v4.view.ViewPager;
import java.util.ArrayList;
import com.twitter.android.widget.bt;
import java.util.HashMap;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.android.widget.TopicView;
import com.twitter.library.provider.bg;
import android.net.Uri;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class EventLandingActivity extends TwitterFragmentActivity implements View$OnClickListener, AdapterView$OnItemClickListener, hm, rp
{
    private static final Uri a;
    private static final Uri b;
    private static final Uri c;
    private static final Uri d;
    private bg e;
    private TopicView f;
    private TopicView$TopicData g;
    private mn h;
    private HashMap i;
    private bt j;
    private boolean k;
    private String l;
    private int m;
    private String n;
    private String o;
    private ArrayList p;
    private ViewPager q;
    private hn r;
    private FrameLayout s;
    private LinearLayout t;
    private TextView u;
    private DockLayout v;
    private String w;
    
    static {
        a = Uri.parse("twitter://events/default");
        b = Uri.parse("twitter://events/media");
        c = Uri.parse("twitter://events/people");
        d = Uri.parse("twitter://events/matches");
    }
    
    private gm a(final Uri uri, final int n) {
        final Bundle a = TwitterListFragment.a(this.getIntent(), true);
        String s;
        String s2;
        int int1;
        if (uri.equals((Object)EventLandingActivity.a)) {
            s = this.getString(2131297085);
            s2 = "tweets";
            int1 = 0;
        }
        else if (uri.equals((Object)EventLandingActivity.b)) {
            s = this.getString(2131297628);
            s2 = "highlights";
            int1 = 5;
        }
        else if (uri.equals((Object)EventLandingActivity.c)) {
            s = this.getString(2131297915);
            int1 = 2;
            s2 = "people";
        }
        else if (uri.equals((Object)EventLandingActivity.d)) {
            s = this.getString(2131297911);
            int1 = 8;
            s2 = "games";
        }
        else {
            int1 = a.getInt("search_type");
            s2 = "unknown";
            s = null;
        }
        String s3 = null;
        switch (this.m) {
            default: {
                s3 = "unknown";
                break;
            }
            case 2: {
                s3 = "spev";
                break;
            }
        }
        final go go = new go(uri, EventLandingFragment.class);
        go.a((CharSequence)s);
        go.a(s2);
        a.putInt("search_type", int1);
        a.putInt("fetch_type", 5);
        a.putString("scribe_page", this.o);
        a.putString("scribe_section", s2);
        final boolean k = this.k;
        boolean b = false;
        if (!k) {
            b = true;
        }
        a.putBoolean("event_header_available", b);
        a.putString("q_source", s3);
        a.putString("event_id", this.l);
        a.putInt("event_type", this.m);
        a.putInt("empty_title", 2131297635);
        if ("GAME".equals(this.w)) {
            a.putInt("shim_size", this.getResources().getDimensionPixelSize(2131558823));
        }
        a.putInt("empty_desc", 2131297636);
        long n2;
        if (this.i.get(int1) != null) {
            n2 = this.i.get(int1);
        }
        else {
            n2 = com.twitter.util.q.a.nextLong();
        }
        this.e.i(n2);
        a.putLong("search_id", n2);
        this.i.put(int1, n2);
        go.a(a);
        return go.a();
    }
    
    private void a(final int currentItem) {
        if (currentItem == this.h.b()) {
            final SearchFragment searchFragment = (SearchFragment)this.p.get(currentItem).a(this.getSupportFragmentManager());
            if (searchFragment != null) {
                searchFragment.r();
            }
            return;
        }
        this.q.setCurrentItem(currentItem);
        this.h.a(currentItem);
    }
    
    private void b(final View view) {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, -2);
        this.s.removeAllViews();
        this.s.addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
        this.s.setVisibility(0);
        final ViewGroup$LayoutParams layoutParams = this.t.getLayoutParams();
        layoutParams.height = this.getResources().getDimensionPixelSize(2131558822);
        this.t.setLayoutParams(layoutParams);
    }
    
    private ArrayList h() {
        final ArrayList<gm> list = new ArrayList<gm>(3);
        list.add(this.a(EventLandingActivity.a, 0));
        list.add(this.a(EventLandingActivity.b, 1));
        if (this.k) {
            list.add(this.a(EventLandingActivity.d, 2));
        }
        return list;
    }
    
    public TwitterListFragment Q_() {
        return this.a(this.r.a(this.q.getCurrentItem()));
    }
    
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        toolBar.a(2131887418).b(false);
        toolBar.a(2131887461).b(true);
        toolBar.setCustomView((View)this.u);
        return 1;
    }
    
    public TwitterListFragment a(final gm gm) {
        return (TwitterListFragment)gm.a(this.getSupportFragmentManager());
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.e(true);
        bn.c(2130968761);
        bn.b(6);
        if (kg.a((Context)this)) {
            bn.d(false);
            bn.a(4);
        }
        return bn;
    }
    
    public String a(final int n, final String s, final boolean b) {
        switch (n) {
            case 2: {
                if (!s.equals("NFL")) {
                    break;
                }
                if (b) {
                    return "sport_event_league";
                }
                return "sport_event_game";
            }
        }
        return "search";
    }
    
    public void a(final TopicView$TopicData g) {
        if (!this.k && g.a != null) {
            final TopicView$TopicData g2 = this.g;
            if (g != this.g) {
                this.getIntent().putExtra("topic_data", (Parcelable)g);
            }
            this.g = g;
            if (g2 == null) {
                this.e(this.c());
                this.d(true);
            }
            this.j = br.a(g.b, false);
            if (this.j != null) {
                if (this.f != null) {
                    this.j.a(this.G(), (View)this.f, g);
                    return;
                }
                this.b((View)(this.f = this.j.a((Context)this, (ViewGroup)this.s, this.G(), g)));
            }
        }
    }
    
    public void a(final TwitterTopic$SportsEvent twitterTopic$SportsEvent) {
        if (this.g != null) {
            this.g.m = com.twitter.util.f.a(twitterTopic$SportsEvent);
            this.a(this.g);
        }
    }
    
    public void a(final boolean b, final ListView listView) {
    }
    
    public boolean a(final String s, final long n, final TwitterTopic twitterTopic, final String s2) {
        return false;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951658, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final long g = this.U().g();
        final String stringExtra = this.getIntent().getStringExtra("query");
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887461: {
                bq.a((Context)this, stringExtra, stringExtra);
                this.G().a(g, this.o, null, "query", "share");
                return true;
            }
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.e = bg.a((Context)this, this.U().g());
        if (bundle == null) {
            this.i = new HashMap();
        }
        else {
            this.i = (HashMap)bundle.getSerializable("search_ids");
        }
        final Intent intent = this.getIntent();
        final long longExtra = intent.getLongExtra("search_id", -1L);
        if (longExtra != -1L) {
            this.i.put(0, longExtra);
        }
        final Intent intent2 = (Intent)intent.getParcelableExtra("EXTRA_PARENT_EVENT");
        if (intent2 != null) {
            this.c(intent2);
        }
        this.e.a(this.i.values());
        this.g = (TopicView$TopicData)intent.getParcelableExtra("topic_data");
        final TopicView$TopicData g = this.g;
        (this.s = (FrameLayout)this.findViewById(2131886414)).removeAllViews();
        this.t = (LinearLayout)this.findViewById(2131886698);
        this.w = intent.getStringExtra("event_page_type");
        this.k = "LEAGUE".equals(this.w);
        if (!this.k && g != null) {
            this.l = g.a;
            this.m = g.b;
            this.n = g.a();
            this.a(g);
        }
        else {
            this.l = intent.getStringExtra("event_id");
            this.m = intent.getIntExtra("event_type", -1);
            this.n = intent.getStringExtra("event_subtype");
        }
        this.o = this.a(this.m, this.n, this.k);
        this.p = this.h();
        this.h = new mn(this.p);
        final HorizontalListView horizontalListView = (HorizontalListView)this.findViewById(2131886733);
        horizontalListView.setAdapter((ListAdapter)this.h);
        horizontalListView.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        this.q = (ViewPager)this.findViewById(2131886367);
        this.r = new hn(this, this, this.p, this.q, horizontalListView, this.h);
        this.q.setAdapter(this.r);
        (this.u = (TextView)LayoutInflater.from((Context)this).inflate(2130969096, (ViewGroup)null)).setText((CharSequence)intent.getStringExtra("query"));
        this.u.setOnClickListener((View$OnClickListener)this);
        this.v = (DockLayout)this.findViewById(2131886401);
        final long g2 = this.U().g();
        final TwitterScribeItem a = TwitterScribeItem.a(this.l, this.m);
        final ArrayList<ScribeLog> list = new ArrayList<ScribeLog>(2);
        if (this.q.getCurrentItem() == 0) {
            list.add(((TwitterScribeLog)new TwitterScribeLog(g2).b(this.o, this.p.get(0).h, null, null, "impression")).a(a));
        }
        this.G().a(list);
    }
    
    @Override
    protected String c() {
        final String l_ = this.l_();
        if (!TextUtils.isEmpty((CharSequence)l_) && (l_.charAt(0) == '#' || l_.charAt(0) == '$')) {
            return this.getResources().getString(2131297985) + " " + l_;
        }
        return super.c();
    }
    
    @Override
    protected void f_() {
        final TwitterListFragment q_ = this.Q_();
        if (q_ != null) {
            q_.X();
        }
    }
    
    @Override
    protected String l_() {
        final String stringExtra = this.getIntent().getStringExtra("query");
        if (!TextUtils.isEmpty((CharSequence)stringExtra) && stringExtra.charAt(0) == '#') {
            return stringExtra;
        }
        return super.c();
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887142) {
            this.D();
            this.H().b(this.u.getText());
        }
    }
    
    @Override
    protected void onDestroy() {
        if (this.U().b() == Session$LoginStatus.c) {
            this.e.b(this.i.values());
        }
        this.f = null;
        this.s.removeAllViews();
        super.onDestroy();
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a(n);
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        bundle.putSerializable("search_ids", (Serializable)this.i);
        super.onSaveInstanceState(bundle);
    }
}
