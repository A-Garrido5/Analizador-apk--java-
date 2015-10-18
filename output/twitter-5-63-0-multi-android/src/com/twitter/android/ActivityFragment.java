// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.bi;
import com.twitter.library.provider.ae;
import com.twitter.library.featureswitch.d;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.twitter.android.util.bj;
import android.preference.PreferenceManager;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.ay;
import com.twitter.android.client.u;
import android.view.View$OnTouchListener;
import android.view.ViewConfiguration;
import android.support.v4.app.Fragment;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.library.av.w;
import android.widget.AbsListView;
import com.twitter.library.client.k;
import java.io.Serializable;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import com.twitter.library.scribe.ScribeAssociation;
import android.widget.ListView;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.refresh.widget.a;
import com.twitter.refresh.widget.RefreshableListView;
import android.os.Bundle;
import com.twitter.android.lists.ListTabActivity;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.twitter.library.provider.af;
import com.twitter.android.util.ah;
import com.twitter.library.view.z;
import com.twitter.android.client.v;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.widget.ListAdapter;
import com.twitter.android.platform.DeviceStorageLowReceiver;
import com.twitter.library.widget.TweetView;
import com.twitter.android.util.ai;
import android.content.SharedPreferences;
import com.twitter.library.util.FriendshipCache;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.view.View;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.android.client.bv;
import com.twitter.android.client.TwitterListFragment;

public class ActivityFragment extends TwitterListFragment implements bv, s, t, td
{
    private boolean A;
    protected vf a;
    private final SharedPreferences$OnSharedPreferenceChangeListener b;
    private int c;
    private boolean d;
    private int e;
    private long f;
    private long g;
    private long h;
    private View i;
    private xa j;
    private vi k;
    private Loader l;
    private Cursor m;
    private boolean n;
    private boolean o;
    private long p;
    private FriendshipCache q;
    private SharedPreferences r;
    private ab s;
    private boolean t;
    private boolean u;
    private ai v;
    private TweetView w;
    private boolean x;
    private boolean y;
    private DeviceStorageLowReceiver z;
    
    public ActivityFragment() {
        this.a = null;
        this.b = (SharedPreferences$OnSharedPreferenceChangeListener)new y(this);
        this.p = Long.MIN_VALUE;
        this.x = true;
    }
    
    private boolean a(final int n, final long n2) {
        int n3 = 20;
        if (!this.f(n)) {
            return false;
        }
        switch (n) {
            case 3: {
                n3 = 0;
                break;
            }
        }
        this.a(new ma((Context)this.getActivity(), this.aF(), this.c).a(TwitterListFragment.a(this.Z.a(), this.Z.b(), n)).c(this.d(n)).b(this.e(n)).c(n3), this.c, n);
        if (n == 7 && n2 != 0L) {
            ((l)this.W).b(n2);
            ((l)this.W).notifyDataSetChanged();
        }
        else {
            this.a_(n);
        }
        return true;
    }
    
    private boolean b(final com.twitter.library.service.y y) {
        final com.twitter.library.service.ab p = y.P();
        return p == null || p.c == this.X;
    }
    
    private boolean c(final TwitterUser twitterUser) {
        return "Twitter Tips".equals(twitterUser.name) && "TwitterTips".equals(twitterUser.username) && "https://pbs.twimg.com/profile_images/530872164480610304/ITjwbHBa_normal.png".equals(twitterUser.profileImageUrl);
    }
    
    private long d(final int n) {
        long long1 = 0L;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 2:
            case 4: {
                final Cursor t = this.T();
                if (t != null && t.moveToFirst()) {
                    long1 = t.getLong(12);
                    return long1;
                }
                return long1;
            }
            case 1:
            case 3: {
                return long1;
            }
            case 7: {
                return this.h;
            }
        }
    }
    
    private long e(final int n) {
        long g = 0L;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 7: {
                g = this.g;
            }
            case 2:
            case 3:
            case 4: {
                return g;
            }
            case 1: {
                final Cursor t = this.T();
                if (t != null && t.moveToLast()) {
                    return t.getLong(13);
                }
                return g;
            }
        }
    }
    
    private lr r() {
        final lr lr = new lr(this.ax(), com.twitter.android.client.v.a(this.an).a(), this.j, this, this.q, this.v, this.Z);
        lr.a(this);
        return lr;
    }
    
    private void s() {
        String s;
        if (com.twitter.library.provider.af.a(this.c)) {
            s = this.Z.a() + ":" + this.Z.b() + ":stream::results";
        }
        else {
            s = this.Z.a() + "::stream::results";
        }
        this.s.a(this.aF().g(), s);
    }
    
    private boolean t() {
        return this.z.a() || this.A;
    }
    
    private String w() {
        switch (this.c) {
            default: {
                return "activity";
            }
            case 2: {
                return "activity_filtered";
            }
            case 3: {
                return "activity_following";
            }
            case 4: {
                return "activity_verified";
            }
        }
    }
    
    private void y() {
        if (this.i == null) {
            final FrameLayout frameLayout = new FrameLayout((Context)this.getActivity());
            this.i = LayoutInflater.from((Context)this.getActivity()).inflate(2130968584, (ViewGroup)frameLayout, false);
            if (this.i != null) {
                ((ViewGroup)frameLayout).addView(this.i);
                this.Y().addHeaderView((View)frameLayout);
            }
        }
    }
    
    private void z() {
        if (this.t && !this.u) {
            this.u = true;
            this.a(new lz((Context)this.getActivity(), this.aF()), 7778, 8);
        }
    }
    
    @Override
    protected void Z_() {
        super.Z_();
        this.a(false);
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        if (this.b(y)) {
            super.a(n, y);
            final aa aa = (aa)y.l().b();
            final com.twitter.library.service.ab p2 = y.P();
            if (n == 7778) {
                this.u = false;
                if (this.t && aa.a()) {
                    this.v.a(p2.c, aa.c.getLong("act_read_pos"));
                }
            }
            else if (p2.a(this.aF())) {
                if (n == 7779) {
                    final TweetView tweetView = (TweetView)this.Y().getEmptyView().findViewById(2131886717);
                    final FragmentActivity activity = this.getActivity();
                    final TwitterUser b = ((pw)y).b();
                    if (aa.a() && activity != null && tweetView != null && b != null && !this.c(b)) {
                        tweetView.setTweet(((NotificationActivity)activity).a(this.aF().f(), b));
                    }
                }
                else if (n == this.c && !aa.a()) {
                    Toast.makeText(this.an, 2131296297, 1).show();
                }
            }
        }
    }
    
    @Override
    public void a(final long n, final int n2, final long n3) {
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ActivityDetailActivity.class).putExtra("type", this.c).putExtra("event_type", n2).putExtra("user_tag", n);
        final boolean a = com.twitter.library.provider.af.a(this.c);
        switch (n2) {
            case 5: {
                int n4;
                if (a) {
                    n4 = 2131297023;
                }
                else {
                    n4 = 2131296298;
                }
                putExtra.putExtra("title_res_id", n4);
                break;
            }
            case 13: {
                putExtra.putExtra("title_res_id", 2131297120);
                break;
            }
            case 1: {
                putExtra.putExtra("title_res_id", 2131296296).putExtra("status_tag", n);
                break;
            }
            case 10: {
                putExtra.putExtra("title_res_id", 2131296296).putExtra("status_tag", n);
                break;
            }
            case 12: {
                putExtra.putExtra("title_res_id", 2131296296).putExtra("status_tag", n);
                break;
            }
            case 16: {
                putExtra.putExtra("title_res_id", 2131296296).putExtra("status_tag", n);
                break;
            }
            case 4: {
                putExtra.putExtra("title_res_id", 2131296299).putExtra("status_tag", n);
                break;
            }
            case 9: {
                putExtra.putExtra("title_res_id", 2131296299).putExtra("status_tag", n);
                break;
            }
            case 11: {
                putExtra.putExtra("title_res_id", 2131296299).putExtra("status_tag", n);
                break;
            }
            case 17: {
                putExtra.putExtra("title_res_id", 2131296299).putExtra("status_tag", n);
                break;
            }
            case 7: {
                putExtra.putExtra("title_res_id", 2131297486).putExtra("list_id", n3);
                break;
            }
            case 6: {
                putExtra.putExtra("title_res_id", 2131297485).putExtra("list_id", n3);
                break;
            }
        }
        this.startActivity(putExtra);
    }
    
    @Override
    protected void a(final long n, final long n2) {
        if (this.t) {
            this.u = false;
            final Session b = this.aE().b(n2);
            this.v.a(this.c, b.g(), b.e());
        }
    }
    
    @Override
    public void a(final long n, final String s) {
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("screen_name", s);
        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.Z).a(5)).a(this.X));
        this.startActivity(putExtra);
    }
    
    @Override
    public void a(final long n, final String s, final String s2, final long n2) {
        this.startActivity(new Intent((Context)this.getActivity(), (Class)ListTabActivity.class).putExtra("list_id", n).putExtra("list_name", s).putExtra("list_fullname", s2).putExtra("creator_id", n2));
    }
    
    @Override
    protected void a(final Cursor cursor) {
        boolean b;
        if (this.y) {
            final boolean t = this.t();
            b = false;
            if (!t) {
                b = true;
            }
        }
        else {
            final int count = cursor.getCount();
            b = false;
            if (count < 800) {
                b = true;
            }
        }
        if (this.au() && cursor.getInt(14) == 0 && b && !this.n) {
            this.a(1);
            this.n = true;
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        this.s.a(bundle);
    }
    
    @Override
    public void a(final Loader l, final Cursor m) {
        final RefreshableListView refreshableListView = (RefreshableListView)this.Y();
        if (this.at()) {
            this.m = m;
            this.l = l;
            this.p(2);
            refreshableListView.c();
        }
        else {
            a e;
            if (this.o) {
                e = this.E();
            }
            else {
                e = new a(0, this.f, this.e);
            }
            super.a(l, m);
            if (!this.o) {
                if (((l)this.W).isEmpty()) {
                    this.a(3);
                }
                else {
                    this.g(false);
                    this.f(false);
                }
                this.o = true;
            }
            this.a(e, true);
        }
        if (this.n) {
            refreshableListView.a(false);
            this.n = false;
        }
        ((l)this.W).a(this.aF().g());
    }
    
    @Override
    protected void a(final View aa) {
        final FragmentActivity activity = this.getActivity();
        if (activity instanceof RootNotificationActivity) {
            this.aw().a(new TwitterScribeLog(this.aF().g()).b(new String[] { "notification::empty_state::impression" }));
            final ViewGroup viewGroup = (ViewGroup)aa;
            final View inflate = activity.getLayoutInflater().inflate(2130968756, (ViewGroup)null);
            viewGroup.addView(inflate, 1 + viewGroup.indexOfChild(aa.findViewById(2131886128)));
            this.c(inflate);
            final TweetView tweetView = (TweetView)inflate.findViewById(2131886717);
            tweetView.setTweet(((NotificationActivity)activity).a(this.aF().f(), null));
            tweetView.setClickable(false);
            tweetView.setOnTweetViewClickListener(null);
            for (int i = 0; i < tweetView.getChildCount(); ++i) {
                final View child = tweetView.getChildAt(i);
                if (child.isClickable()) {
                    child.setClickable(false);
                }
            }
            this.aa = aa;
            this.a(new pw((Context)activity, this.aF(), 1934802841L), 7779, 9);
            return;
        }
        super.a(aa);
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        final int positionForView = listView.getPositionForView(view);
        if (positionForView != -1) {
            final Cursor cursor = (Cursor)listView.getItemAtPosition(positionForView);
            if (cursor != null) {
                if (cursor.getInt(1) == 8) {
                    this.g = cursor.getLong(12);
                    this.h = cursor.getLong(13);
                    this.a(7, cursor.getLong(12));
                }
                else {
                    final Intent a = ((l)this.W).a((Context)this.getActivity(), view, cursor);
                    if (a != null) {
                        this.startActivity(a);
                    }
                }
            }
        }
    }
    
    @Override
    public void a(final TwitterUser twitterUser) {
        int intValue;
        if (this.q.a(twitterUser.userId)) {
            intValue = this.q.j(twitterUser.userId);
        }
        else {
            intValue = 0;
        }
        this.q.b(twitterUser.userId, 0x40 | (intValue | 0x1));
        final com.twitter.android.client.c aw = this.aw();
        this.a(new pb((Context)this.getActivity(), this.aF(), twitterUser.userId, twitterUser.promotedContent));
        aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(twitterUser.userId, twitterUser.promotedContent, twitterUser.g()).b(new String[] { TwitterScribeLog.a(this.Z, "", "user", "follow") })).b(new String[] { TwitterScribeLog.a(this.Z, "", "user", "follow") })).a(this.Z));
    }
    
    @Override
    public void a(final Tweet tweet, final String s) {
        this.a(tweet, s, -1L, 0, -1, null, null, -1L);
    }
    
    @Override
    public void a(final Tweet tweet, final String s, final long n, final int n2, final int n3, final String s2, final TwitterScribeItem twitterScribeItem, final long n4) {
        final TwitterScribeAssociation twitterScribeAssociation = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(1)).a(tweet.D)).b(this.Z.a())).c(this.Z.b());
        if (s != null) {
            twitterScribeAssociation.d(s);
        }
        final FragmentActivity activity = this.getActivity();
        Serializable s3;
        if (this.ac()) {
            s3 = RootTweetActivity.class;
        }
        else {
            s3 = TweetActivity.class;
        }
        this.startActivity(new Intent((Context)activity, (Class)s3).putExtra("tw", (Parcelable)tweet).putExtra("association", (Parcelable)twitterScribeAssociation).putExtra("social_context_type", n2).putExtra("social_context_user_count", n3).putExtra("social_context_user_name", s2).putExtra("activity_row_id", n).putExtra("scribe_item", (Parcelable)twitterScribeItem).putExtra("magic_rec_id", n4));
    }
    
    @Override
    public void a(final TweetView w, final String s) {
        final Tweet tweet = w.getTweet();
        (this.w = w).setHighlighted(true);
        this.a(tweet, s);
    }
    
    @Override
    protected void a(final a a) {
        new k((Context)this.getActivity(), this.aF().e(), "activity").a().a("activity_" + this.c, a.b).a("off_" + this.c, a.c).apply();
        this.f = a.b;
        this.e = a.c;
    }
    
    @Override
    protected void a(final a a, final boolean b) {
        final long b2 = a.b;
        if (b2 > 0L) {
            final int a2 = this.a(b2);
            if (a2 >= this.Y().getHeaderViewsCount() || !b) {
                this.b(a2, a.c);
            }
        }
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.a_(3);
            if (this.t) {
                this.v.c();
            }
            this.A_();
        }
        else {
            if (((l)this.W).getCursor() == null) {
                this.a_(3);
                this.q();
                return;
            }
            if (((l)this.W).isEmpty()) {
                this.a(3);
            }
        }
    }
    
    protected boolean a(final int n) {
        return this.a(n, 0L);
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        if (n == 2 || n == 0) {
            this.m(n == 2);
        }
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (this.t && n2 > 0 && n == 0) {
            this.v.b();
        }
        return false;
    }
    
    @Override
    public void ac_() {
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.s();
        if (this.t) {
            this.v.c();
        }
        if (this.i != null) {
            this.i.setVisibility(8);
        }
    }
    
    @Override
    public void b(final TwitterUser twitterUser) {
        this.q.c(twitterUser.userId);
        final com.twitter.android.client.c aw = this.aw();
        this.a(new pe((Context)this.getActivity(), this.aF(), twitterUser.userId, twitterUser.promotedContent));
        aw.a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(twitterUser.userId, twitterUser.promotedContent, twitterUser.g()).b(new String[] { TwitterScribeLog.a(this.Z, "", "user", "unfollow") })).a(this.Z));
    }
    
    @Override
    protected void c() {
        super.c();
        final Bundle arguments = this.getArguments();
        String string;
        if (arguments.containsKey("ref_event")) {
            string = arguments.getString("ref_event");
            arguments.remove("ref_event");
        }
        else {
            string = null;
        }
        String string2;
        if (com.twitter.library.provider.af.a(this.c)) {
            string2 = "connect:" + this.w() + ":::impression";
        }
        else {
            string2 = "network_activity::::impression";
        }
        this.aw().a(this.aF().g(), string2, string);
    }
    
    @Override
    protected void c_(final int n) {
        switch (n) {
            case 3:
            case 5: {
                this.g(false);
            }
            case 2:
            case 4: {
                if (this.at()) {
                    this.h();
                    return;
                }
                break;
            }
            case 1: {
                if (this.au()) {
                    ((RefreshableListView)this.Y()).a(false);
                    return;
                }
                break;
            }
            case 7: {
                ((l)this.W).f();
                ((l)this.W).notifyDataSetChanged();
            }
        }
    }
    
    @Override
    public void f() {
        if (this.l != null) {
            super.a(this.l, this.m);
            this.l = null;
            this.m = null;
        }
        this.l(false);
        if (this.i != null) {
            this.i.setVisibility(8);
            this.i = null;
        }
    }
    
    public void g() {
        if (this.isAdded()) {
            this.A_();
        }
    }
    
    @Override
    protected void h() {
        this.g();
    }
    
    @Override
    protected void i() {
        this.a(2);
    }
    
    @Override
    protected int j() {
        return 0;
    }
    
    @Override
    protected void k() {
        final k k = new k((Context)this.getActivity(), this.aF().e(), "activity");
        this.f = k.getLong("activity_" + this.c, 0L);
        this.e = k.getInt("off_" + this.c, 0);
        this.a(new a(0, this.f, this.e), false);
    }
    
    @Override
    protected boolean l() {
        return com.twitter.library.av.w.a(93);
    }
    
    @Override
    protected String m() {
        return this.Z.a();
    }
    
    @Override
    protected boolean n() {
        return this.x && (com.twitter.library.provider.af.a(this.c) || TwitterDataSyncService.b((Context)this.getActivity()));
    }
    
    @Override
    protected void o() {
        this.a(4);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final TwitterFragmentActivity ax = this.ax();
        final ul ul = new ul(this, this.Z);
        this.j = new xa(this, this.Z, TwitterScribeLog.a(this.Z, "tweet", "avatar", "profile_click"), this.Z.a() + "::tweet:link:open_link");
        (this.a = new vf(this.an, ul)).a(this.p);
        final ListView y = this.Y();
        this.a((View$OnTouchListener)(this.k = new vi(this, this.a, y, ViewConfiguration.get((Context)ax).getScaledTouchSlop())));
        this.q = new FriendshipCache();
        if (this.W == null) {
            if (com.twitter.library.provider.af.a(this.c)) {
                this.W = (ListAdapter)this.r();
            }
            else {
                this.W = (ListAdapter)new mp(ax, com.twitter.android.client.v.a(this.an).a(), this.a, this.j, this.q, this, this.Z);
            }
            this.a((u)this.W);
            ((l)this.W).a(this);
        }
        if (bundle != null) {
            final long[] longArray = bundle.getLongArray("spinning_gap_ids");
            if (longArray != null) {
                for (int length = longArray.length, i = 0; i < length; ++i) {
                    ((l)this.W).b(longArray[i]);
                }
                ((l)this.W).notifyDataSetChanged();
            }
            if (bundle.getBoolean("state_show_stork", false)) {
                this.y();
            }
        }
        if (!this.r.getBoolean("show_stork_text", false)) {
            this.y();
            this.r.edit().putBoolean("show_stork_text", true).apply();
        }
        y.setAdapter(this.W);
        this.a(new com.twitter.android.aa(this, null));
        this.s = new ab((Context)ax, this.Z);
        this.z();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.c = this.getArguments().getInt("activity_type", 0);
        this.d = this.getArguments().getBoolean("activity_mention_only", false);
        if (com.twitter.library.provider.af.a(this.c)) {
            this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("connect")).c(this.w()));
        }
        else {
            this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("network_activity")).c("activity"));
        }
        if (bundle != null) {
            this.p = bundle.getLong("state_revealer_id", Long.MIN_VALUE);
        }
        final FragmentActivity activity = this.getActivity();
        (this.r = PreferenceManager.getDefaultSharedPreferences((Context)activity)).registerOnSharedPreferenceChangeListener(this.b);
        this.a((bv)this);
        final Session af = this.aF();
        this.t = com.twitter.library.provider.af.a(this.c);
        if (this.t) {
            this.v = new ai((Context)activity, this.c, af.g(), af.e());
        }
        this.y = bj.a(af.f());
        if (this.y) {
            if (bundle != null) {
                this.A = bundle.getBoolean("is_device_storage_low");
            }
            activity.registerReceiver((BroadcastReceiver)(this.z = new DeviceStorageLowReceiver()), new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW"));
        }
        this.x = this.getArguments().getBoolean("should_fetch_new_data", true);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        String string;
        if (this.d) {
            string = "type=? AND event IN (2, 3)";
        }
        else {
            string = "type=?";
        }
        if (!com.twitter.library.featureswitch.d.f("magic_recs_in_notifications_timeline_enabled")) {
            string += " AND event NOT IN (18, 19, 20)";
        }
        String string2;
        if (!com.twitter.library.featureswitch.d.f("quote_tweet_notif_enabled")) {
            string2 = string + " AND event !=14";
        }
        else {
            string2 = string;
        }
        final long g = this.aF().g();
        return new com.twitter.android.ae((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.af.a, g), bi.a, string2, new String[] { String.valueOf(this.c) }, null, g, ((l)this.W).c(), ((l)this.W).d(), com.twitter.library.provider.af.a(this.c));
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.r.unregisterOnSharedPreferenceChangeListener(this.b);
        if (this.y) {
            final FragmentActivity activity = this.getActivity();
            activity.unregisterReceiver((BroadcastReceiver)this.z);
            this.a(bj.a((Context)activity, this.aF()));
        }
    }
    
    @Override
    public void onDestroyView() {
        if (this.k != null) {
            this.b((View$OnTouchListener)this.k);
            this.k = null;
        }
        super.onDestroyView();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.W != null) {
            final ArrayList e = ((l)this.W).e();
            if (!e.isEmpty()) {
                bundle.putLongArray("spinning_gap_ids", CollectionUtils.c(e));
            }
        }
        if (this.a != null) {
            bundle.putLong("state_revealer_id", this.a.a());
        }
        if (this.i != null) {
            bundle.putBoolean("state_show_stork", true);
        }
        if (this.z != null) {
            bundle.putBoolean("is_device_storage_low", this.t());
        }
    }
    
    @Override
    public void onStop() {
        super.onStop();
        if (this.w != null) {
            this.w.setHighlighted(false);
            this.w = null;
        }
    }
    
    @Override
    protected boolean p() {
        return ((l)this.W).isEmpty();
    }
}
