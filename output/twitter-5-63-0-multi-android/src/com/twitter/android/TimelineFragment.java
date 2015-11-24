// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.preference.PreferenceManager;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.u;
import com.twitter.android.client.v;
import com.twitter.library.platform.TwitterDataSyncService;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.library.api.timeline.al;
import com.twitter.library.api.timeline.am;
import com.twitter.library.api.timeline.x;
import com.twitter.library.api.timeline.d;
import com.twitter.library.api.timeline.ai;
import com.twitter.library.api.timeline.ae;
import com.twitter.library.api.timeline.r;
import com.twitter.library.api.timeline.w;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.client.App;
import android.os.Bundle;
import com.twitter.library.metrics.e;
import com.twitter.android.util.aj;
import com.twitter.library.provider.ah;
import com.twitter.library.provider.ay;
import com.twitter.android.util.bj;
import android.content.ContentUris;
import com.twitter.library.provider.bc;
import java.util.Map;
import com.twitter.android.client.PendingRequest;
import com.twitter.refresh.widget.a;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.scribe.ScribeAssociation;
import java.io.Serializable;
import com.twitter.library.api.EntityScribeContent;
import com.twitter.library.provider.ad;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TwitterTopic;
import android.os.Parcelable;
import android.content.Intent;
import android.net.Uri$Builder;
import com.twitter.android.widget.ConfirmCancelPendingTweetDialog;
import android.widget.ListView;
import android.view.View;
import com.twitter.library.provider.ax;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.database.DataSetObserver;
import java.util.Set;
import android.graphics.drawable.Drawable;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.support.v4.content.Loader;
import android.support.v4.app.Fragment;
import com.twitter.library.api.timeline.RichTimeline$RequestType;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.util.k;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.util.bk;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.provider.bb;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface$OnClickListener;
import com.twitter.util.f;
import com.twitter.library.provider.cn;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import android.database.Cursor;
import com.twitter.library.client.as;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.api.PromotedEvent;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.ListAdapter;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.platform.DeviceStorageLowReceiver;
import com.twitter.library.service.z;
import java.util.HashMap;
import android.net.Uri;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashSet;
import com.twitter.library.util.FriendshipCache;
import com.twitter.android.metrics.b;
import com.twitter.library.provider.y;

public class TimelineFragment extends TweetListFragment implements td, y
{
    protected String a;
    protected boolean b;
    protected com.twitter.android.metrics.b c;
    protected int d;
    protected long e;
    protected FriendshipCache f;
    protected HashSet g;
    protected HashSet h;
    protected ArrayList i;
    protected boolean j;
    private final SharedPreferences$OnSharedPreferenceChangeListener k;
    private Uri l;
    private int m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private final HashMap r;
    private final HashSet s;
    private String t;
    private String u;
    private z v;
    private boolean w;
    private DeviceStorageLowReceiver x;
    private boolean y;
    
    public TimelineFragment() {
        this.i = new ArrayList();
        this.k = (SharedPreferences$OnSharedPreferenceChangeListener)new tz(this);
        this.r = new HashMap();
        this.s = new HashSet();
    }
    
    private boolean L() {
        return 16 == this.O && "SPORTS".equals(this.a);
    }
    
    private boolean M() {
        switch (this.O) {
            case 28: {
                return true;
            }
            case 16: {
                if (this.q || this.getActivity().getResources().getConfiguration().orientation == 2) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    private int N() {
        if (this.M()) {
            return 1;
        }
        return 0;
    }
    
    private boolean O() {
        return this.x.a() || this.y;
    }
    
    private void P() {
        String s = null;
        String s2 = null;
        String a = null;
        switch (this.O) {
            default: {
                throw new IllegalArgumentException("Invalid status type.");
            }
            case 0:
            case 30: {
                final String m = this.m();
                s = null;
                s2 = m;
                a = null;
                break;
            }
            case 16:
            case 28: {
                final String i = this.m();
                final String u = this.u;
                s2 = i;
                s = u;
                a = null;
                break;
            }
            case 1: {
                final String j = this.m();
                final String u2 = this.u;
                s2 = j;
                s = u2;
                a = null;
                break;
            }
            case 2: {
                final String k = this.m();
                final String u3 = this.u;
                s2 = k;
                s = u3;
                a = null;
                break;
            }
            case 5: {
                s2 = "connect";
                s = "mentions";
                a = null;
                break;
            }
            case 23: {
                s2 = "connect";
                s = "mentions_filtered";
                a = null;
                break;
            }
            case 24: {
                s2 = "connect";
                s = "mentions_following";
                a = null;
                break;
            }
            case 25: {
                s2 = "connect";
                s = "mentions_verified";
                a = null;
                break;
            }
            case 9: {
                s2 = "list";
                s = "tweets";
                a = null;
                break;
            }
            case 8: {
                s2 = "category";
                s = "tweets";
                a = null;
                break;
            }
            case 27:
            case 31: {
                final String l = this.m();
                a = this.a;
                s2 = l;
                s = null;
                break;
            }
        }
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b(s2)).c(s)).a(a)).b(6));
    }
    
    private void a(final DockLayout dockLayout, final boolean locked) {
        if (!locked && dockLayout.d()) {
            return;
        }
        dockLayout.setAutoUnlockEnabled(!locked);
        dockLayout.setLocked(locked);
    }
    
    private void a(final PromotedEvent promotedEvent, final long n) {
        as.a(this.an).a(new nu(this.an, this.aF(), promotedEvent).a(n));
    }
    
    private boolean a(final int n, final boolean b) {
        if (this.f(n)) {
            final com.twitter.library.service.y g = this.g(n);
            if (g != null) {
                if (b) {
                    g.j("Not triggered by a user action.");
                }
                return this.a(g, this.O, n);
            }
        }
        return false;
    }
    
    private ArrayList b(final Cursor cursor) {
        switch (this.O) {
            default: {
                return null;
            }
            case 28: {
                final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus = (TwitterTopic$TrendsPlus)com.twitter.util.f.a(cursor.getBlob(cn.D));
                if (twitterTopic$TrendsPlus != null && twitterTopic$TrendsPlus.targetInfo != null) {
                    return twitterTopic$TrendsPlus.targetInfo.pinnedTweetIds;
                }
                return null;
            }
        }
    }
    
    private static void b(final com.twitter.android.client.c c, final az az, final FragmentActivity fragmentActivity, final ul ul, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation) {
        ul.a(fragmentActivity, (DialogInterface$OnClickListener)new ud(tweet, c, az, fragmentActivity, twitterScribeAssociation));
    }
    
    private static void b(final com.twitter.android.client.c c, final Tweet tweet) {
        c.a(new TwitterScribeLog(c.a().b().g()).b("instant_timeline", null, tweet.af(), "tweet", "dismiss"));
        c.a(tweet.aa, tweet.Z, null, null);
    }
    
    private static void b(final az az, final FragmentActivity fragmentActivity, final ul ul, final Tweet tweet) {
        ul.a(fragmentActivity, (DialogInterface$OnClickListener)new ue(fragmentActivity, az, tweet));
    }
    
    private long d(final int n, final int n2) {
        if (n != 0) {
            switch (n2) {
                case 1:
                case 3:
                case 7: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid fetch type: " + n2);
                }
                case 2:
                case 4: {
                    final Cursor t = this.T();
                    if (t != null && t.moveToFirst()) {
                    Label_0176:
                        while (true) {
                            if (t.getInt(17) == n && t.getInt(15) != 0 && t.isNull(26)) {
                                switch (n) {
                                    default: {
                                        break Label_0176;
                                    }
                                    case 0:
                                    case 16:
                                    case 28: {
                                        final int int1 = t.getInt(cn.h);
                                        if ((!bb.e(int1) && !bb.d(int1)) || bb.h(int1)) {
                                            break;
                                        }
                                        if (bb.q(int1)) {
                                            break;
                                        }
                                        break Label_0176;
                                    }
                                }
                            }
                            if (!t.moveToNext()) {
                                return 0L;
                            }
                        }
                        return t.getLong(21);
                    }
                    break;
                }
            }
        }
        return 0L;
    }
    
    private void d(final long n) {
        final TwitterScribeAssociation z = this.Z;
        this.a(n, ScribeLog.a(z.a(), z.b(), "stream::results"));
        this.a(n, ScribeLog.a(z.a(), z.b(), "stream:linger:results"), bk.a());
        if (!this.r.isEmpty()) {
            final com.twitter.android.client.c aw = this.aw();
            for (final String s : this.r.keySet()) {
                final ArrayList<TwitterScribeItem> list = this.r.get(s);
                if (!list.isEmpty()) {
                    final String a = com.twitter.util.k.a(this.u);
                    if ("trendsplus".equals(this.m()) || s.equals("trends:" + a + "::trend:results") || s.equals("trends:" + a + "::event:results")) {
                        aw.a(((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s })).b(list));
                    }
                    else {
                        final Iterator<TwitterScribeItem> iterator2 = list.iterator();
                        while (iterator2.hasNext()) {
                            aw.a(((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s })).a(iterator2.next()));
                        }
                    }
                    list.clear();
                }
            }
            this.r.clear();
        }
    }
    
    private long e(final int n, final int n2) {
        if (n != 0) {
            switch (n2) {
                case 2:
                case 3:
                case 4: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid fetch type: " + n2);
                }
                case 1: {
                    return this.a(n, this.T());
                }
                case 7: {
                    final Cursor t = this.T();
                    if (t != null && t.moveToPosition(this.m)) {
                        this.m = 0;
                        return t.getLong(21);
                    }
                    break;
                }
            }
        }
        return 0L;
    }
    
    private String j(final int n) {
        if (this.O == 0 && n == 2) {
            return "ptr";
        }
        return "";
    }
    
    private int k(final int n) {
        switch (n) {
            default: {
                return 40;
            }
            case 2:
            case 4: {
                return 100;
            }
            case 3: {
                return this.B();
            }
        }
    }
    
    private int r(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 3: {
                return 0;
            }
            case 2:
            case 4: {
                return 1;
            }
            case 1: {
                return 2;
            }
        }
    }
    
    private long s(final int n) {
        return this.d(this.O, n);
    }
    
    private boolean t(final int n) {
        return n == 2 && !this.A();
    }
    
    private RichTimeline$RequestType u(final int n) {
        if (((xc)this.W).isEmpty()) {
            return RichTimeline$RequestType.a;
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + n);
            }
            case 3: {
                return RichTimeline$RequestType.a;
            }
            case 1: {
                return RichTimeline$RequestType.c;
            }
            case 7: {
                return RichTimeline$RequestType.d;
            }
            case 2:
            case 4: {
                return RichTimeline$RequestType.b;
            }
        }
    }
    
    private long v(final int n) {
        if (this.O == 0) {
            switch (n) {
                case 1:
                case 2:
                case 3:
                case 4: {
                    return 0L;
                }
                case 7: {
                    final Cursor t = this.T();
                    if (t != null && t.moveToPosition(this.m)) {
                        this.m = 0;
                        return t.getLong(cn.G);
                    }
                    break;
                }
            }
            throw new IllegalArgumentException("Invalid fetch type: " + n);
        }
        return 0L;
    }
    
    protected boolean A() {
        return this.aa();
    }
    
    protected int B() {
        return 0;
    }
    
    protected xa F() {
        return new uh(this, this.Z, this.H(), this.K, this.p);
    }
    
    protected String H() {
        switch (this.O) {
            default: {
                return null;
            }
            case 0:
            case 27: {
                return this.m() + "::tweet:link:open_link";
            }
            case 16: {
                return this.m() + ":" + com.twitter.util.k.a(this.u) + ":tweet:link:open_link";
            }
            case 1: {
                return "profile::tweet:link:open_link";
            }
            case 2: {
                return "favorites::tweet:link:open_link";
            }
            case 5: {
                return "connect:mentions:tweet:link:open_link";
            }
            case 23: {
                return "connect:mentions_filtered:tweet:link:open_link";
            }
            case 24: {
                return "connect:mentions_following:tweet:link:open_link";
            }
            case 25: {
                return "connect:mentions_verified:tweet:link:open_link";
            }
        }
    }
    
    public TwitterScribeAssociation I() {
        return this.Z;
    }
    
    protected boolean K() {
        return this.W != null && (((xc)this.W).getCount() == 0 || tl.c(((xc)this.W).getItemViewType(0)));
    }
    
    @Override
    protected boolean O_() {
        return super.O_() || !this.K();
    }
    
    protected void Y_() {
        this.Y().setAdapter(this.W);
    }
    
    @Override
    protected void Z_() {
        super.Z_();
        if (this.X > 0L || !this.ao()) {
            this.a(false);
        }
    }
    
    protected long a(final int n, final Cursor cursor) {
        if (cursor != null && cursor.moveToLast()) {
            while (n != cursor.getInt(17) || cursor.getInt(15) != 1) {
                if (!cursor.moveToPrevious()) {
                    return 0L;
                }
            }
            return cursor.getLong(21);
        }
        return 0L;
    }
    
    protected Loader a(final oy oy) {
        return new ty((Context)this.getActivity(), oy);
    }
    
    protected tl a(final TwitterFragmentActivity twitterFragmentActivity, final xa xa, final boolean b, final boolean b2) {
        final com.twitter.android.client.c aw = this.aw();
        final boolean b3 = b && this.O != 16;
        final tl tl = new tl(twitterFragmentActivity, 2, this.O, false, b3, this.N(), xa, this.L, new pb((Context)this.getActivity(), aw, this.Z), this.f, this.Z, b2);
        tl.c(b3);
        if (28 != this.O) {
            this.Y().setDivider((Drawable)null);
        }
        DockLayout dockLayout;
        if (this.O == 16) {
            if (twitterFragmentActivity != null) {
                dockLayout = (DockLayout)twitterFragmentActivity.findViewById(2131886401);
            }
            else {
                dockLayout = null;
            }
        }
        else {
            dockLayout = null;
        }
        tl.a(new uj(this, dockLayout, this.h));
        tl.registerDataSetObserver((DataSetObserver)new ua(this, tl, aw));
        tl.d(true);
        tl.a(this.K);
        return tl;
    }
    
    protected xc a(final TwitterFragmentActivity twitterFragmentActivity, final xa xa, final boolean b) {
        switch (this.O) {
            default: {
                return this.b(twitterFragmentActivity, xa, this.a(b, this.aF().f(), this.O));
            }
            case 0:
            case 16:
            case 27:
            case 28:
            case 30: {
                return this.a(twitterFragmentActivity, xa, b, false);
            }
            case 31: {
                return new com.twitter.android.commerce.view.c(twitterFragmentActivity, 2, this.Z);
            }
        }
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        this.c.g();
        this.v();
        if (!aa.a()) {
            if (aa.c() != 401) {
                Toast.makeText(this.an, 2131298000, 1).show();
                return;
            }
            Toast.makeText(this.an, 2131298015, 1).show();
        }
    }
    
    @Override
    protected void a(final long n, final long n2) {
        this.c.k();
        this.d(n);
    }
    
    @Override
    protected void a(final Cursor cursor) {
        int n;
        if (ax.a(this.O)) {
            n = 800;
        }
        else {
            n = 400;
        }
        boolean b;
        if (this.w) {
            if (!this.O()) {
                b = true;
            }
            else {
                b = false;
            }
        }
        else if (cursor.getCount() < n) {
            b = true;
        }
        else {
            b = false;
        }
        if (this.au() && cursor.getInt(14) == 0 && b) {
            this.c(1);
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        super.a(loader, cursor);
        this.c_(5);
        this.c.aq_();
        if (this.r()) {
            if (!this.c(this.s())) {
                this.v();
            }
            else {
                this.c.f();
            }
            this.b = true;
            return;
        }
        if (!this.f(false)) {
            this.v();
        }
        else {
            this.c.f();
        }
        this.b(true);
    }
    
    protected void a(final View view, final int n, final int n2) {
    }
    
    public void a(final ListView listView, final View view, int n, final long n2) {
        super.a(listView, view, n, n2);
        final Cursor cursor = (Cursor)listView.getItemAtPosition(n);
        if (cursor != null) {
            if (((xc)this.W).a(cursor)) {
                this.m = n - listView.getHeaderViewsCount();
                this.c(7);
                ((xc)this.W).c(cursor.getLong(((xc)this.W).H_()));
                ((xc)this.W).notifyDataSetChanged();
            }
            else {
                if (((xc)this.W).b(cursor)) {
                    ConfirmCancelPendingTweetDialog.a(this.getActivity().getSupportFragmentManager(), ((og)view.getTag()).f.getTweet());
                    return;
                }
                final com.twitter.android.client.c aw = this.aw();
                final long g = this.aF().g();
                int n3 = 0;
                Label_0203: {
                    switch (this.O) {
                        default: {
                            n3 = 0;
                            break;
                        }
                        case 0:
                        case 16:
                        case 27:
                        case 28: {
                            final int int1 = cursor.getInt(cn.h);
                            switch (cursor.getInt(cn.f)) {
                                default: {
                                    n3 = 0;
                                    break Label_0203;
                                }
                                case 2: {
                                    if (!bb.b(int1)) {
                                        return;
                                    }
                                    final tn a = ((tq)view.getTag()).a;
                                    if (a != null) {
                                        final Uri build = new Uri$Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", String.valueOf(a.c)).build();
                                        final FragmentActivity activity = this.getActivity();
                                        Serializable s;
                                        if (this.ac()) {
                                            s = RootTweetActivity.class;
                                        }
                                        else {
                                            s = TweetActivity.class;
                                        }
                                        final Intent setData = new Intent((Context)activity, (Class)s).putExtra("association", (Parcelable)this.Z).setData(build);
                                        if (this.O == 27 || this.O == 31) {
                                            setData.putExtra("timeline_id", this.a);
                                        }
                                        this.startActivity(setData);
                                    }
                                    return;
                                }
                                case 3: {
                                    final tq tq = (tq)view.getTag();
                                    final String string = cursor.getString(cn.v);
                                    final String string2 = cursor.getString(cn.u);
                                    final String string3 = cursor.getString(cn.s);
                                    final int int2 = cursor.getInt(cn.t);
                                    final String string4 = cursor.getString(cn.E);
                                    final String c = TwitterTopic.c(int2);
                                    final String a2 = ScribeLog.a(this.m(), this.u, c, "event", "click");
                                    final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
                                    twitterScribeItem.y = c;
                                    twitterScribeItem.c = 16;
                                    twitterScribeItem.b = string3;
                                    aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { a2 })).d(n)).a(twitterScribeItem));
                                    TopicView$TopicData topicData;
                                    if (tq != null && tq.h != null) {
                                        topicData = tq.h.getTopicData();
                                    }
                                    else {
                                        topicData = null;
                                    }
                                    this.startActivity(uk.a((Context)this.getActivity(), string3, int2, string, string2, null, string4, false, topicData, this.b(cursor)));
                                    return;
                                }
                                case 7: {
                                    final String string5 = cursor.getString(cn.v);
                                    final String string6 = cursor.getString(cn.u);
                                    final String string7 = cursor.getString(cn.s);
                                    final int int3 = cursor.getInt(cn.t);
                                    final String string8 = cursor.getString(cn.E);
                                    final PromotedContent promotedContent = (PromotedContent)com.twitter.util.f.a(cursor.getBlob(cn.C));
                                    final int int4 = cursor.getInt(cn.B);
                                    int n4;
                                    if (promotedContent != null) {
                                        n4 = 1;
                                    }
                                    else {
                                        n4 = 0;
                                    }
                                    final tq tq2 = (tq)view.getTag();
                                    final TwitterScribeItem twitterScribeItem2 = new TwitterScribeItem();
                                    String a3 = null;
                                    String a4 = null;
                                    String a5 = null;
                                    String s2 = null;
                                    TopicView$TopicData topicView$TopicData = null;
                                    switch (this.O) {
                                        default: {
                                            a3 = null;
                                            a4 = null;
                                            a5 = null;
                                            s2 = null;
                                            topicView$TopicData = null;
                                            break;
                                        }
                                        case 28: {
                                            final String a6 = ScribeLog.a(this.m(), "trend_row", null, "trend", "click");
                                            final String a7 = ScribeLog.a(this.m(), "trend_row", null, "trend", "search");
                                            final String a8 = ScribeLog.a(this.m(), "trend_row", null, "promoted_trend", "click");
                                            final String a9 = ScribeLog.a(this.m(), "trend_row", null, "promoted_trend", "search");
                                            n = 1 + cursor.getPosition();
                                            final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus = (TwitterTopic$TrendsPlus)com.twitter.util.f.a(cursor.getBlob(cn.D));
                                            if (twitterTopic$TrendsPlus != null) {
                                                twitterScribeItem2.w = TwitterTopic$TrendsPlus.a(twitterTopic$TrendsPlus.isDegraded);
                                                s2 = a9;
                                                a5 = a8;
                                                a4 = a7;
                                                a3 = a6;
                                                topicView$TopicData = null;
                                                break;
                                            }
                                            s2 = a9;
                                            a5 = a8;
                                            a4 = a7;
                                            a3 = a6;
                                            topicView$TopicData = null;
                                            break;
                                        }
                                        case 16: {
                                            a3 = ScribeLog.a(this.m(), this.u, "trend", "more", "click");
                                            a4 = ScribeLog.a(this.m(), this.u, "trend", null, "search");
                                            a5 = ScribeLog.a(this.m(), this.u, "promoted_trend", "more", "click");
                                            TopicView$TopicData f;
                                            if (tq2.c != null) {
                                                f = tq2.c.f;
                                            }
                                            else {
                                                f = null;
                                            }
                                            topicView$TopicData = f;
                                            s2 = null;
                                            break;
                                        }
                                    }
                                    twitterScribeItem2.c = 8;
                                    twitterScribeItem2.b = string5;
                                    if (n4 != 0) {
                                        this.a(PromotedEvent.h, promotedContent.promotedTrendId);
                                        twitterScribeItem2.e = String.valueOf(promotedContent.promotedTrendId);
                                        if (a5 != null) {
                                            aw.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).e(string6)).b(new String[] { a5 })).a(twitterScribeItem2)).d(n));
                                        }
                                        if (s2 != null) {
                                            aw.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).e(string6)).b(new String[] { s2 })).a(twitterScribeItem2)).d(n));
                                        }
                                    }
                                    else {
                                        twitterScribeItem2.z = int4;
                                    }
                                    if (a3 != null) {
                                        aw.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).e(string6)).b(new String[] { a3 })).a(twitterScribeItem2)).d(n));
                                    }
                                    if (a4 != null) {
                                        aw.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).e(string6)).b(new String[] { a4 })).a(twitterScribeItem2)).d(n));
                                    }
                                    this.startActivity(uk.a((Context)this.getActivity(), string7, int3, string5, string6, null, string8, false, topicView$TopicData, this.b(cursor)));
                                    return;
                                }
                                case 1: {
                                    if (this.O == 16) {
                                        final TimelineScribeContent timelineScribeContent = (TimelineScribeContent)com.twitter.util.f.a(cursor.getBlob(cn.l));
                                        final String e = TwitterTopic.e(timelineScribeContent.eventType);
                                        final TwitterScribeItem twitterScribeItem3 = new TwitterScribeItem();
                                        twitterScribeItem3.h = timelineScribeContent.tweetProofCursor;
                                        twitterScribeItem3.y = e;
                                        twitterScribeItem3.a = cursor.getLong(1);
                                        twitterScribeItem3.x = timelineScribeContent.query;
                                        twitterScribeItem3.c = 8;
                                        twitterScribeItem3.g = cursor.getPosition();
                                        twitterScribeItem3.z = (int)timelineScribeContent.tweetCount;
                                        aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(this.m(), this.u, "tweet", "tweet", "click")).a(twitterScribeItem3));
                                        n3 = 1;
                                        break Label_0203;
                                    }
                                    n3 = 0;
                                    break Label_0203;
                                }
                            }
                            break;
                        }
                    }
                }
                final Tweet a10 = new com.twitter.library.provider.ad(cursor).a();
                final FragmentActivity activity2 = this.getActivity();
                Serializable s3;
                if (this.ac()) {
                    s3 = RootTweetActivity.class;
                }
                else {
                    s3 = TweetActivity.class;
                }
                final Intent putExtra = new Intent((Context)activity2, (Class)s3).putExtra("tw", (Parcelable)a10).putExtra("association", (Parcelable)this.Z).putExtra("type", this.O).putExtra("tag", this.n);
                if (this.O == 27 || this.O == 31) {
                    putExtra.putExtra("timeline_id", this.a);
                }
                if (cursor.getColumnIndex("scribe_content") != -1) {
                    final TimelineScribeContent timelineScribeContent2 = (TimelineScribeContent)com.twitter.util.f.a(cursor.getBlob(cn.l));
                    if (timelineScribeContent2 != null && timelineScribeContent2 instanceof EntityScribeContent) {
                        putExtra.putExtra("tw_scribe_content", (Serializable)timelineScribeContent2);
                    }
                }
                this.startActivity(putExtra);
                if (n3 == 0) {
                    aw.a(((TwitterScribeLog)new TwitterScribeLog(g).a((Context)activity2, a10, this.Z, this.b(a10)).b(new String[] { TwitterScribeLog.a(this.Z, a10.af(), "tweet", "click") })).a(this.Z));
                }
            }
        }
    }
    
    public void a(final TwitterUser twitterUser) {
        this.f(twitterUser.userId);
        this.a(false);
    }
    
    @Override
    protected void a(final a a) {
        final int o = this.O;
        switch (o) {
            default: {}
            case 0:
            case 5:
            case 23:
            case 24:
            case 25: {
                new com.twitter.library.client.k((Context)this.getActivity(), this.aF().e(), "timeline").a().a("tweet_" + o, a.b).a("off_" + o, a.c).apply();
            }
        }
    }
    
    @Override
    protected void a(final a a, final boolean b) {
        final long b2 = a.b;
        if ((this.O == 0 || this.O == 28) && b2 == -1L) {
            this.b(0, 0);
        }
        else if (b2 > 0L) {
            final int a2 = this.a(b2);
            if (a2 >= this.Y().getHeaderViewsCount() || !b) {
                this.b(a2, a.c);
            }
        }
    }
    
    @Override
    protected void a(final Iterable iterable) {
        for (final PendingRequest pendingRequest : iterable) {
            if (pendingRequest.c == this.X) {
                this.c(pendingRequest.a);
            }
        }
    }
    
    public void a(final pb pb) {
        if (!((aa)pb.l().b()).a()) {
            ((xc)this.W).notifyDataSetChanged();
        }
    }
    
    public void a(final pe pe) {
    }
    
    public void a(final pp pp) {
        if (((aa)pp.l().b()).a()) {
            final HashMap e = pp.e();
            if (this.f != null && e != null) {
                for (final Map.Entry<Long, V> entry : e.entrySet()) {
                    this.f.c(entry.getKey(), (int)entry.getValue());
                }
                if (this.W != null) {
                    ((xc)this.W).d();
                }
            }
        }
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        switch (this.O) {
            default: {
                throw new IllegalArgumentException("Invalid status type: " + this.O);
            }
            case 0: {
                this.l = ContentUris.withAppendedId(bc.b, this.X);
                break;
            }
            case 1: {
                Uri uri;
                if (this.j) {
                    uri = bc.c;
                }
                else if (bj.a(this.aF().f(), this.p)) {
                    uri = ay.c;
                }
                else {
                    uri = ay.b;
                }
                this.l = ContentUris.withAppendedId(uri, this.X);
                break;
            }
            case 2: {
                this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.j, this.X);
                break;
            }
            case 3: {
                this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.h, this.X);
                break;
            }
            case 5:
            case 23:
            case 24:
            case 25: {
                if (this.getArguments().getBoolean("include_rts", false)) {
                    this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.l, this.X);
                    break;
                }
                this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.g, this.X);
                break;
            }
            case 9: {
                if (this.X > 0L && this.n > 0L) {
                    this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.e, this.X);
                    break;
                }
                break;
            }
            case 8: {
                this.l = ContentUris.withAppendedId(com.twitter.library.provider.ah.b, this.X);
                break;
            }
            case 12: {
                this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.p, this.X);
                break;
            }
            case 14: {
                this.l = ContentUris.withAppendedId(com.twitter.library.provider.az.q, this.X);
                break;
            }
            case 16: {
                this.l = ContentUris.withAppendedId(bc.d, this.X);
                break;
            }
            case 28: {
                this.l = ContentUris.withAppendedId(bc.e, this.X);
                break;
            }
            case 27:
            case 31: {
                this.l = ContentUris.withAppendedId(bc.f, this.X);
                break;
            }
            case 30: {
                this.l = ContentUris.withAppendedId(bc.g, this.X);
                break;
            }
        }
        if (this.l != null) {
            if (b) {
                this.a_(5);
                this.A_();
            }
            else {
                if (this.T() == null) {
                    this.c.ap_();
                    this.a_(5);
                    this.q();
                    return;
                }
                if (this.r()) {
                    this.c(3);
                    this.b = true;
                }
            }
            return;
        }
        this.c_(5);
    }
    
    @Override
    public boolean a(final long n, final Tweet tweet, final Runnable runnable) {
        return ((xc)this.W).a(this.Y(), n, tweet, runnable);
    }
    
    @Override
    protected boolean a(final PendingRequest pendingRequest, final int n) {
        return this.X == pendingRequest.c && super.a(pendingRequest, n);
    }
    
    boolean a(final boolean b, final TwitterUser twitterUser, final int n) {
        return b && (n == 9 || n == 2 || n == 8 || (com.twitter.android.util.aj.a(twitterUser) && (n == 5 || n == 23)));
    }
    
    @Override
    protected void a_(final int n) {
        if (this.O == 0) {
            switch (n) {
                case 2: {
                    com.twitter.library.metrics.e.b("home:refresh", this.av(), this.X, ih.n).i();
                    break;
                }
            }
        }
        super.a_(n);
    }
    
    @Override
    public void a_(final boolean b) {
        if (!b) {
            this.ap();
        }
    }
    
    @Override
    public void ac_() {
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.c.k();
        this.d(this.aF().g());
    }
    
    protected xc b(final TwitterFragmentActivity twitterFragmentActivity, final xa xa, final boolean b) {
        return new xc(twitterFragmentActivity, 2, false, b, false, xa, this.L, this.f, this.Z);
    }
    
    @Override
    public void b(final long n) {
        this.Y().post((Runnable)new ub(this));
    }
    
    protected void b(final boolean b) {
        this.a(new a(0, this.e, this.d), b);
    }
    
    @Override
    protected void c() {
        super.c();
        final com.twitter.android.client.c aw = this.aw();
        final long g = this.aF().g();
        final Bundle arguments = this.getArguments();
        String s;
        if (arguments.containsKey("ref_event")) {
            final String string = arguments.getString("ref_event");
            arguments.remove("ref_event");
            s = string;
        }
        else {
            s = null;
        }
        switch (this.O) {
            default: {}
            case 0:
            case 16:
            case 28: {
                aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(this.m(), this.u, null, null, "impression")).c(new String[] { s }));
            }
            case 1: {
                aw.a(g, this.m() + ":" + com.twitter.util.k.a(this.u) + ":::impression", s);
            }
            case 5: {
                aw.a(g, "connect:mentions:::impression", s);
            }
            case 23: {
                aw.a(g, "connect:mentions_filtered:::impression", s);
            }
            case 24: {
                aw.a(g, "connect:mentions_following:::impression", s);
            }
            case 25: {
                aw.a(g, "connect:mentions_verified:::impression", s);
            }
            case 2: {
                aw.a(g, this.m() + ":" + com.twitter.util.k.a(this.u) + ":::impression", s);
            }
            case 27: {
                aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.m() + "::::impression" })).a(TwitterScribeItem.b(this.a, -1)));
            }
        }
    }
    
    @Override
    public void c(final long n) {
        final ListView y = this.Y();
        if (y != null) {
            y.post((Runnable)new uc(this));
        }
    }
    
    protected boolean c(final int n) {
        return this.a(n, false);
    }
    
    @Override
    protected void c_(final int n) {
        if (this.O == 0) {
            switch (n) {
                case 2: {
                    if (this.aD()) {
                        com.twitter.library.metrics.e.b("home:refresh", this.av(), this.X, ih.n).j();
                        break;
                    }
                    com.twitter.library.metrics.e.b("home:refresh", this.av(), this.X, ih.n).k();
                    break;
                }
                case 3:
                case 4: {
                    com.twitter.library.featureswitch.b.a(this.aF().g());
                    break;
                }
            }
        }
        switch (n) {
            default: {
                super.c_(n);
            }
            case 7: {
                ((xc)this.W).f();
                ((xc)this.W).notifyDataSetChanged();
            }
        }
    }
    
    protected boolean d(final int n) {
        return this.a(n, true);
    }
    
    protected void e(final int n) {
    }
    
    @Override
    public void f() {
        super.f();
        if (this.W != null) {
            final Cursor t = this.T();
            final az ae = this.aE();
            if (this.aD() && t != null && (this.ae || ae.b().d())) {
                final pp a = ty.a((Context)this.getActivity(), t);
                if (a != null) {
                    this.a(a);
                }
            }
        }
    }
    
    @Override
    protected boolean f(final int n) {
        if (2 == n && App.c()) {
            return super.f(n);
        }
        return super.f(n) && TelephonyUtil.c((Context)this.getActivity());
    }
    
    protected com.twitter.library.service.y g(final int n) {
        this.aw();
        final FragmentActivity activity = this.getActivity();
        String b;
        if (this.O == 1 || this.O == 2) {
            b = this.Z.b();
        }
        else {
            b = null;
        }
        final String a = TwitterListFragment.a(this.Z.a(), b, n, 7);
        switch (this.O) {
            default: {
                return null;
            }
            case 0: {
                final Session af = this.aF();
                final w w = (w)new w((Context)activity, af, af.f()).a(this.t(n)).a(this.u(n)).a(this.v(n)).c(this.k(n)).b("scribe_event", a);
                w.b(this.j(n));
                return w;
            }
            case 2: {
                return new r((Context)activity, this.aF(), this.X, 1 + ((xc)this.W).getCount() / 20).b("scribe_event", a);
            }
            case 1: {
                if (this.j) {
                    final ae ae = (ae)new ae((Context)activity, this.aF(), this.X).c(this.k(n));
                    ae.b("scribe_event", a);
                    ae.a(this.u(n));
                    ae.a(this.v(n));
                    return ae;
                }
                return new ai((Context)activity, this.aF(), this.X, this.O).c(this.s(n)).b(this.i(n)).c(this.k(n)).b("scribe_event", a);
            }
            case 3:
            case 5:
            case 23:
            case 24:
            case 25: {
                return new ai((Context)activity, this.aF(), this.X, this.O).c(this.s(n)).b(this.i(n)).c(this.k(n)).b("scribe_event", a);
            }
            case 27: {
                final com.twitter.library.api.timeline.d d = new com.twitter.library.api.timeline.d((Context)activity, this.aF(), this.a, this.r(n));
                d.b("scribe_event", a);
                return d;
            }
            case 31: {
                final com.twitter.android.commerce.view.f f = new com.twitter.android.commerce.view.f((Context)activity, this.aF(), this.a, this.r(n));
                f.b("scribe_event", a);
                return f;
            }
            case 9: {
                return new x((Context)activity, this.aF(), this.X, this.n).c(this.s(n)).b(this.i(n)).c(this.k(n));
            }
            case 8: {
                return new com.twitter.library.api.timeline.c((Context)activity, this.aF(), this.X, this.o).c(100);
            }
            case 16: {
                return new am((Context)activity, this.aF(), this.a);
            }
            case 28: {
                return new com.twitter.library.api.timeline.al((Context)activity, this.aF());
            }
            case 30: {
                return null;
            }
        }
    }
    
    protected long i(final int n) {
        return this.e(this.O, n);
    }
    
    @Override
    protected void i() {
        super.i();
        this.c(2);
    }
    
    @Override
    protected int j() {
        return 21;
    }
    
    @Override
    protected void k() {
        final int o = this.O;
        switch (o) {
            default: {
                super.k();
            }
            case 0:
            case 5:
            case 23:
            case 24:
            case 25: {
                final com.twitter.library.client.k k = new com.twitter.library.client.k((Context)this.getActivity(), this.aF().e(), "timeline");
                this.e = k.getLong("tweet_" + o, 0L);
                this.d = k.getInt("off_" + o, 0);
                this.b(false);
            }
        }
    }
    
    @Override
    protected String m() {
        if (!TextUtils.isEmpty((CharSequence)this.t)) {
            return this.t;
        }
        switch (this.O) {
            default: {
                return "unknown";
            }
            case 0: {
                return "home";
            }
            case 16: {
                return "trends";
            }
            case 28: {
                return "trendsplus";
            }
            case 27: {
                return "custom";
            }
            case 31: {
                return "commerce_collection";
            }
            case 2: {
                return "favorites";
            }
            case 30: {
                return "place";
            }
        }
    }
    
    @Override
    protected boolean n() {
        return (this.O == 0 && TwitterDataSyncService.b((Context)this.getActivity())) || ax.a(this.O);
    }
    
    @Override
    protected void o() {
        this.c(4);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final TwitterFragmentActivity ax = this.ax();
        if (ax instanceof ProfileActivity) {
            this.f = ((ProfileActivity)ax).g();
        }
        if (this.W == null) {
            if (this.f == null) {
                this.f = new FriendshipCache();
            }
            final xc a = this.a(ax, this.F(), com.twitter.android.client.v.a(this.an).a());
            this.a(a);
            a.b(this);
            if (bundle != null) {
                final long[] longArray = bundle.getLongArray("spinning_gap_ids");
                if (longArray != null) {
                    for (int length = longArray.length, i = 0; i < length; ++i) {
                        a.c(longArray[i]);
                    }
                    a.notifyDataSetChanged();
                }
            }
            this.W = (ListAdapter)a;
        }
        this.Y_();
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 == -1 && n == 1 && intent != null && intent.hasExtra("woeid")) {
            final long longExtra = intent.getLongExtra("woeid", 1L);
            final Session af = this.aF();
            final UserSettings j = af.j();
            if (j != null && (j.s || j.a != longExtra)) {
                j.s = false;
                j.a = longExtra;
                j.b = intent.getStringExtra("loc_name");
                this.a(com.twitter.library.api.account.ab.a(this.an, af, j, true, null));
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.x_();
        final Bundle arguments = this.getArguments();
        this.O = arguments.getInt("type", 0);
        this.n = arguments.getLong("tag", -1L);
        this.a = arguments.getString("timeline_tag");
        this.u = arguments.getString("scribe_section");
        this.o = arguments.getLong("category_id");
        if (this.a == null) {
            this.a = "unspecified";
        }
        if (this.O == 27) {
            this.P = TwitterScribeItem.b(this.a, -1);
        }
        this.q = arguments.getBoolean("is_collapsed", false);
        this.t = arguments.getString("scribe_page");
        this.p = arguments.getLong("userid_of_current_profile", -1L);
        if (bundle != null) {
            this.g = (HashSet)bundle.getSerializable("viewed_trend_ids");
            this.h = (HashSet)bundle.getSerializable("logged_trend_ids");
            this.j = bundle.getBoolean("rich_profile_timeline_enabled");
        }
        else {
            this.g = new HashSet();
            this.h = new HashSet();
            this.j = com.twitter.android.profiles.ah.b();
        }
        this.P();
        final FragmentActivity activity = this.getActivity();
        PreferenceManager.getDefaultSharedPreferences((Context)activity).registerOnSharedPreferenceChangeListener(this.k);
        this.v = new ug(this, null);
        final TwitterUser f = this.aF().f();
        this.w = ((ax.a(this.O) && bj.a(f)) || (this.O == 1 && bj.a(f, this.p)));
        if (this.w) {
            if (bundle != null) {
                this.y = bundle.getBoolean("is_device_storage_low");
            }
            activity.registerReceiver((BroadcastReceiver)(this.x = new DeviceStorageLowReceiver()), new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW"));
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return this.a(this.t());
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        final FragmentActivity activity = this.getActivity();
        PreferenceManager.getDefaultSharedPreferences((Context)activity).unregisterOnSharedPreferenceChangeListener(this.k);
        if (this.w) {
            activity.unregisterReceiver((BroadcastReceiver)this.x);
            this.a(bj.a((Context)activity, this.aF()));
        }
        com.twitter.library.provider.x.a(this);
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.b(this.v);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.O == 16) {
            this.a(true);
        }
        else if (this.O == 28) {
            this.a(false);
        }
        this.a(this.v);
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.W != null) {
            final ArrayList e = ((xc)this.W).e();
            if (!e.isEmpty()) {
                final long[] array = new long[e.size()];
                final Iterator<Long> iterator = e.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    array[n] = iterator.next();
                    ++n;
                }
                bundle.putLongArray("spinning_gap_ids", array);
            }
        }
        bundle.putSerializable("viewed_trend_ids", (Serializable)this.g);
        bundle.putSerializable("logged_trend_ids", (Serializable)this.h);
        bundle.putBoolean("rich_profile_timeline_enabled", this.j);
        if (this.x != null) {
            bundle.putBoolean("is_device_storage_low", this.O());
        }
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        if ((this.ae || this.aF().d()) && this.R) {
            this.K = new uf(this, this.Z);
        }
        super.onViewCreated(view, bundle);
        com.twitter.library.provider.x.b(this);
    }
    
    protected boolean r() {
        return ((xc)this.W).isEmpty() || (this.O == 1 && !this.b && ((xc)this.W).getCount() < 20);
    }
    
    protected int s() {
        return 3;
    }
    
    protected oy t() {
        String s;
        String[] array;
        if (!"unspecified".equals(this.a)) {
            if (this.M()) {
                s = "t_tag=? AND t_flags=?";
                array = new String[] { this.a, Integer.toString(64) };
            }
            else if (this.L()) {
                s = "t_tag=? AND t_flags!=?";
                array = new String[] { this.a, Integer.toString(128) };
            }
            else {
                s = "t_tag=?";
                array = new String[] { this.a };
            }
        }
        else if (ax.a(this.O)) {
            s = "type=?";
            array = new String[] { String.valueOf(this.O) };
        }
        else if (this.n > 0L) {
            s = "tag=?";
            array = new String[] { Long.toString(this.n) };
        }
        else if (this.O == 8) {
            s = "tag=?";
            array = new String[] { Long.toString(this.o) };
        }
        else if (this.O == 1 && this.j) {
            s = "p_format IS NULL OR p_format=?";
            String[] array2;
            if (this.getArguments().getBoolean("is_me")) {
                array2 = new String[] { "profile_self" };
            }
            else {
                array2 = new String[] { "profile_other" };
            }
            array = array2;
        }
        else if (this.O == 0) {
            s = "p_format IS NULL OR p_format=?";
            array = new String[] { "home_timeline" };
        }
        else {
            s = null;
            array = null;
        }
        String[] array3 = null;
        String s2 = null;
        switch (this.O) {
            default: {
                array3 = Tweet.a;
                s2 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                break;
            }
            case 16:
            case 28:
            case 30: {
                array3 = cn.a;
                s2 = "preview_draft_id DESC, t_updated_at DESC, _id ASC";
                break;
            }
            case 0: {
                array3 = cn.a;
                if (com.twitter.library.featureswitch.d.f("home_timeline_order_by_sort_index")) {
                    s2 = "preview_draft_id DESC, t_sort_index DESC, preview_draft_id DESC, t_updated_at DESC, _id ASC";
                    break;
                }
                s2 = "preview_draft_id DESC, t_updated_at DESC, _id ASC";
                break;
            }
            case 27:
            case 31: {
                array3 = cn.a;
                s2 = "preview_draft_id DESC, t_sort_index DESC, preview_draft_id DESC, t_updated_at DESC, _id ASC";
                break;
            }
            case 1: {
                if (this.j) {
                    array3 = cn.a;
                    s2 = "preview_draft_id DESC, t_sort_index DESC, preview_draft_id DESC, t_updated_at DESC, _id ASC";
                    break;
                }
                array3 = Tweet.b;
                s2 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                break;
            }
            case 8: {
                array3 = Tweet.c;
                s2 = "cat_timestamp DESC, _id ASC";
                break;
            }
            case 9: {
                array3 = Tweet.b;
                s2 = "preview_draft_id DESC, updated_at DESC, _id ASC";
                break;
            }
        }
        return new oy(com.twitter.library.provider.ae.a(this.l, this.aF().g()), array3, s, array, s2);
    }
    
    protected void v() {
        this.c.j();
    }
    
    protected void x_() {
        (this.c = new com.twitter.android.metrics.b("timeline:first_tweet_", "timeline:first_tweet_", ih.l, null)).b(this.aE().b().g());
        this.c.i();
    }
    
    public void y() {
        ((xc)this.W).notifyDataSetChanged();
    }
    
    protected boolean z() {
        return this.Z() != null;
    }
}
