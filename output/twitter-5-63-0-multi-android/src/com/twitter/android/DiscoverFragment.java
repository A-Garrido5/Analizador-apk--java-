// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.bc;
import com.twitter.library.provider.ao;
import android.preference.PreferenceManager;
import com.twitter.android.client.u;
import com.twitter.library.view.z;
import android.support.v4.app.Fragment;
import com.twitter.android.client.v;
import com.twitter.library.av.w;
import com.twitter.library.api.TwitterTopic;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.provider.cn;
import android.widget.AbsListView;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.UserView;
import java.io.Serializable;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import android.os.Parcelable;
import com.twitter.util.f;
import com.twitter.library.api.DiscoverStoryMetadata;
import com.twitter.library.provider.ad;
import com.twitter.library.scribe.ScribeItem;
import android.content.Intent;
import com.twitter.android.trends.TrendsActivity;
import android.support.v4.content.Loader;
import java.util.Map;
import com.twitter.library.service.ab;
import android.util.Pair;
import com.twitter.library.platform.TwitterDataSyncService;
import android.widget.Toast;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.library.service.aa;
import android.view.View;
import android.widget.ListView;
import android.support.v4.app.FragmentActivity;
import java.util.Iterator;
import java.util.LinkedHashSet;
import com.twitter.internal.android.widget.GroupedRowView;
import android.text.TextUtils;
import com.twitter.library.featureswitch.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.internal.android.service.a;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.search.h;
import com.twitter.library.client.Session;
import com.twitter.library.provider.bq;
import android.database.Cursor;
import com.twitter.library.client.k;
import com.twitter.library.api.p;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.as;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.am;
import android.content.Context;
import android.widget.ListAdapter;
import java.util.HashSet;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;

public class DiscoverFragment extends TweetListFragment implements td, c
{
    FriendshipCache a;
    int b;
    int c;
    final ArrayList d;
    final ArrayList e;
    final Set f;
    final HashMap g;
    TwitterScribeLog h;
    private final HashMap i;
    private final SharedPreferences$OnSharedPreferenceChangeListener j;
    private fb k;
    private long l;
    private int m;
    private boolean n;
    private int o;
    private int p;
    private fg q;
    private boolean r;
    private boolean s;
    private int t;
    
    public DiscoverFragment() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashSet();
        this.g = new HashMap();
        this.i = new HashMap();
        this.j = (SharedPreferences$OnSharedPreferenceChangeListener)new ey(this);
    }
    
    private void A() {
        if (this.s && this.h != null) {
            this.aw().a(this.h.b(new String[] { "discover:discover:trend_module:trend:results" }));
            this.s = false;
        }
    }
    
    private void a(final int n, final long n2) {
        if (n == 7 && n2 != 0L) {
            ((ez)this.W).c(n2);
            ((ez)this.W).notifyDataSetChanged();
            return;
        }
        this.a_(n);
    }
    
    private void a(final Context context) {
        this.a(new am(context, this.aF(), "TREND"), 1, 0);
    }
    
    private void a(final PromotedEvent promotedEvent, final long n) {
        as.a(this.an).a(new nu(this.r(), this.s(), promotedEvent).a(n));
    }
    
    private boolean a(final int n, final long n2, final long n3) {
        int n4 = 2;
        if (!this.f(n)) {
            return false;
        }
        this.aw();
        TwitterListFragment.a(this.m(), "discover", n, 7);
        switch (n) {
            case 2: {
                n4 = 1;
            }
            default: {
                this.c(1);
                n4 = 0;
            }
            case 1:
            case 7: {
                this.a(n, n2);
                this.a(new com.twitter.library.api.p(this.an, this.aF(), n4, n2, n3), 4, n);
                return true;
            }
        }
    }
    
    private boolean a(final Context context, final int n) {
        boolean b = true;
        final k k = new k(context, this.aF().e(), "discover_prefs");
        final long currentTimeMillis = System.currentTimeMillis();
        switch (n) {
            default: {
                b = false;
                break;
            }
            case 1: {
                if (currentTimeMillis <= 300000L + k.getLong("last_refresh", 0L)) {
                    return false;
                }
                break;
            }
            case 2: {
                if (currentTimeMillis <= 300000L + k.getLong("last_refresh_trends", 0L)) {
                    return false;
                }
                break;
            }
        }
        return b;
    }
    
    private void b(final long n) {
        if (!this.e.isEmpty()) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { this.m(), "discover:stream::results" })).b(this.e));
            this.e.clear();
        }
    }
    
    public static boolean b(final Cursor cursor) {
        return cursor.getInt(bq.f) == 1;
    }
    
    private void c(final long n) {
        if (n != 0L) {
            final Session b = this.aE().b(n);
            final ArrayList d = this.d;
            if (b != null && !d.isEmpty()) {
                final h h = (h)new h((Context)this.getActivity(), this.aF()).c(2);
                h.e = CollectionUtils.c(d);
                this.a(h);
                d.clear();
            }
        }
    }
    
    public static boolean c(final Cursor cursor) {
        return cursor.getInt(bq.f) == 2;
    }
    
    private static String e(final String s) {
        String s2 = com.twitter.library.featureswitch.d.g("olympic_pivot_cell_title_" + s);
        if (TextUtils.isEmpty((CharSequence)s2)) {
            s2 = com.twitter.library.featureswitch.d.g("olympic_pivot_cell_title_default");
        }
        return s2;
    }
    
    private void e(final Cursor cursor) {
        final LinkedHashSet b = this.q.b;
        final Iterator<GroupedRowView> iterator = (Iterator<GroupedRowView>)b.iterator();
        this.h = new TwitterScribeLog(this.aF().g());
        int p;
        if (cursor != null && cursor.moveToFirst() && cursor.getCount() >= b.size()) {
            int n = 0;
            while (true) {
                this.a(iterator.next(), cursor, n);
                p = n + 1;
                if (!cursor.moveToNext() || !iterator.hasNext()) {
                    break;
                }
                n = p;
            }
            this.q.a(0);
        }
        else {
            this.q.a(8);
            p = 0;
        }
        this.p = p;
    }
    
    private void w() {
        final FragmentActivity activity = this.getActivity();
        if (this.e(2) && this.a((Context)activity, 2)) {
            this.a((Context)activity);
            this.c(2);
        }
    }
    
    private boolean y() {
        final ListView y = this.Y();
        final int p = this.p;
        boolean b = false;
        if (p > 0) {
            final int n = -1 + y.getChildCount();
            int n2 = 0;
            while (true) {
                b = false;
                if (n2 > n) {
                    break;
                }
                final View child = y.getChildAt(n2);
                if (child != null && this.q.a(child)) {
                    b = true;
                    break;
                }
                ++n2;
            }
        }
        return b;
    }
    
    private void z() {
        if (this.r && this.y()) {
            this.aw().a(this.aF().g(), new String[] { this.m(), "discover:trend_module::impression" });
            this.r = false;
        }
    }
    
    public void G_() {
        if (this.t > 0) {
            --this.t;
            if (this.t == 0) {
                this.Y().smoothScrollToPosition(0);
            }
        }
    }
    
    @Override
    protected void Z_() {
        int n = 1;
        super.Z_();
        final FragmentActivity activity = this.getActivity();
        int t;
        if (this.a((Context)activity, n)) {
            t = n;
        }
        else {
            t = 0;
        }
        this.t = t;
        final int t2 = this.t;
        if (!this.a((Context)activity, 2)) {
            n = 0;
        }
        this.t = t2 + n;
        this.a(false);
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 1: {
                if (!aa.a()) {
                    break;
                }
                this.G_();
                this.a(this.an, y.P().e, "last_refresh_trends");
                if (this.isAdded()) {
                    this.getLoaderManager().restartLoader(n, null, this);
                    return;
                }
                break;
            }
            case 2: {
                final Session a = this.aE().a(y);
                if (a == null) {
                    break;
                }
                final pb pb = (pb)y;
                final long c = pb.P().c;
                final long u = pb.u();
                final Pair b = this.b(c, u);
                if (!aa.a()) {
                    if (c == this.aF().g()) {
                        this.a.c(u);
                        ((ez)this.W).notifyDataSetChanged();
                        return;
                    }
                    break;
                }
                else {
                    if (b != null) {
                        ((ez)this.W).a(u, (long)b.first);
                        this.a(new pv(this.an, a, c, 9, -1L, u, (Integer)b.second), 5, 0);
                        return;
                    }
                    break;
                }
                break;
            }
            case 3: {
                if (this.aE().a(y) == null) {
                    break;
                }
                final pe pe = (pe)y;
                final long c2 = pe.P().c;
                final long f = pe.f();
                this.b(c2, f);
                if (aa.a() || c2 != this.aF().g()) {
                    break;
                }
                this.a.b(f);
                ((ez)this.W).notifyDataSetChanged();
                if (!y.isCancelled()) {
                    Toast.makeText(this.an, 2131298058, 1).show();
                    return;
                }
                break;
            }
            case 4: {
                if (y != null) {
                    final int r = y.R();
                    this.c_(r);
                    if (aa.a()) {
                        switch (r) {
                            case 2:
                            case 3:
                            case 4: {
                                this.G_();
                                this.a((Context)this.getActivity(), this.aF().e(), "last_refresh");
                                break;
                            }
                        }
                    }
                    else if (r == 3 || r == 4) {
                        if (this.W != null && ((ez)this.W).isEmpty()) {
                            Toast.makeText((Context)this.getActivity(), 2131298000, 1).show();
                        }
                    }
                    else {
                        Toast.makeText((Context)this.getActivity(), 2131298000, 1).show();
                    }
                }
                if (TwitterDataSyncService.b(this.an)) {
                    TwitterDataSyncService.a(this.an, new Bundle(), false, com.twitter.library.util.a.a(this.an, this.aF().e()));
                    return;
                }
                break;
            }
            case 5: {
                final pv pv = (pv)y;
                final ab p2 = y.P();
                if (p2 == null || !p2.a(this.aF())) {
                    break;
                }
                final Long a2 = ((ez)this.W).a(pv.t());
                if (a2 != null && (pv.f() == null || !yj.a(this.Y(), a2))) {
                    ((ez)this.W).b(pv.t());
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected void a(final long n, final long n2) {
        this.b(n);
        this.c(n);
    }
    
    void a(final long n, final long n2, final long n3, final int n4) {
        Map<K, V> map = (Map<K, V>)this.i.get(n);
        if (map == null) {
            map = (Map<K, V>)new HashMap<Long, Pair>();
            this.i.put(n, map);
        }
        ((HashMap<Long, Pair>)map).put(n2, new Pair((Object)n3, (Object)n4));
    }
    
    void a(final Context context, final String s, final String s2) {
        new k(context, s, "discover_prefs").a().a(s2, System.currentTimeMillis()).apply();
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && cursor.getInt(14) == 0 && cursor.getCount() < 400) {
            this.a(1);
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        final Context context = loader.getContext();
        switch (loader.getId()) {
            case 0: {
                super.a(loader, cursor);
                this.c_(5);
                if (!this.e(2)) {
                    this.getLoaderManager().initLoader(1, null, this);
                    this.c |= 0x2;
                }
                final boolean empty = ((ez)this.W).isEmpty();
                if (!this.d(1)) {
                    if (empty) {
                        this.a(3);
                    }
                    else {
                        this.f(false);
                    }
                }
                if (this.n && !empty) {
                    this.a(new com.twitter.refresh.widget.a(0, this.l, this.m), true);
                    return;
                }
                break;
            }
            case 1: {
                boolean b;
                if (cursor == null || cursor.getCount() == 0) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (!b) {
                    this.e(cursor);
                }
                else {
                    this.e((Cursor)null);
                }
                if (!this.d(2) && (b || this.a(context, 2))) {
                    this.a(context);
                    this.c(2);
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected void a(final ListView listView, final View view, final int n, final long n2) {
        final FragmentActivity activity = this.getActivity();
        final long g = this.aF().g();
        int n3;
        if (view == this.q.a) {
            n3 = 1;
            this.startActivity(new Intent((Context)activity, (Class)TrendsActivity.class).putExtra("type", 16).putExtra("timeline_tag", "TREND").putExtra("empty_title", 2131296940).putExtra("empty_desc", 2131296941));
            this.aw().a(new TwitterScribeLog(g).b(new String[] { "discover:discover:trend_module:header:click" }));
        }
        else if (view == this.q.c) {
            n3 = 1;
            this.startActivity(new Intent((Context)activity, (Class)ActivitiesActivity.class).putExtra("activity_type", 1));
        }
        else if (view == this.q.d) {
            String g2;
            String g3;
            String e;
            if (com.twitter.library.featureswitch.d.f("olympic_pivot_cell_discover")) {
                g2 = com.twitter.library.featureswitch.d.g("olympic_pivot_cell_event_id");
                g3 = com.twitter.library.featureswitch.d.g("olympic_pivot_cell_query");
                e = e(this.getResources().getConfiguration().locale.toString());
                this.aw().a(new TwitterScribeLog(g).b(new String[] { "discover:discover:trend_module:olympics:click" }));
            }
            else {
                e = null;
                g3 = null;
                g2 = null;
            }
            this.startActivity(new Intent((Context)activity, (Class)SearchTerminalActivity.class).putExtra("query", g3).putExtra("terminal", true).putExtra("search_button", true).putExtra("event_id", g2).putExtra("query_name", e));
            n3 = 0;
        }
        else {
            if (this.q.b.contains(view)) {
                final com.twitter.android.client.c aw = this.aw();
                final String m = this.m();
                final ff ff = (ff)view.getTag();
                if (ff.e) {
                    this.a(PromotedEvent.h, ff.f);
                }
                aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { m, "discover:trend_module:trend:click" })).a(ff.i));
                aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { m, "discover:trend_module:trend:search" })).e(ff.h));
                this.startActivity(ff.g);
            }
            n3 = 0;
        }
        if (n3 == 0) {
            final Cursor cursor = (Cursor)listView.getItemAtPosition(n);
            if (cursor != null) {
                final boolean b = b(cursor);
                final com.twitter.android.client.c aw2 = this.aw();
                if (b && cursor.getInt(18) == 2) {
                    this.a(7, cursor.getLong(1), cursor.getLong(21));
                }
                else {
                    if (b) {
                        final Tweet a = new com.twitter.library.provider.ad(cursor).a();
                        final DiscoverStoryMetadata discoverStoryMetadata = (DiscoverStoryMetadata)com.twitter.util.f.a(cursor.getBlob(bq.v));
                        Serializable s;
                        if (this.ac()) {
                            s = RootTweetActivity.class;
                        }
                        else {
                            s = TweetActivity.class;
                        }
                        this.startActivity(new Intent((Context)activity, (Class)s).putExtra("tw", (Parcelable)a).putExtra("type", a.aa).putExtra("association", (Parcelable)this.Z));
                        aw2.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).a(activity.getApplicationContext(), a, this.Z, null).b(new String[] { this.m(), "discover:tweet::click" })).a(this.Z)).a(TwitterScribeItem.a(discoverStoryMetadata)));
                        return;
                    }
                    if (c(cursor)) {
                        final long long1 = cursor.getLong(bq.i);
                        final Intent putExtra = new Intent((Context)activity, (Class)ProfileActivity.class).putExtra("user_id", long1).putExtra("type", 9).putExtra("association", (Parcelable)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.X)).b(this.m())).c("who_to_follow"));
                        final Integer j = this.a.j(long1);
                        if (j != null) {
                            putExtra.putExtra("friendship", (Serializable)j);
                        }
                        final UserView userView = (UserView)((GroupedRowView)view).getChildAt(0);
                        final PromotedContent promotedContent = userView.getPromotedContent();
                        if (promotedContent != null) {
                            aw2.a(PromotedEvent.d, promotedContent);
                            putExtra.putExtra("pc", (Serializable)promotedContent);
                        }
                        this.startActivityForResult(putExtra, 1);
                        aw2.a(((TwitterScribeLog)new TwitterScribeLog(g).b(long1, promotedContent, ((yk)userView.getTag()).f).b(new String[] { this.m(), "discover:user_module:user:profile_click" })).a(this.Z));
                        return;
                    }
                    Serializable s2;
                    if (this.ac()) {
                        s2 = RootTabbedFindPeopleActivity.class;
                    }
                    else {
                        s2 = TabbedFindPeopleActivity.class;
                    }
                    this.startActivityForResult(new Intent((Context)activity, (Class)s2), 2);
                    aw2.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { this.m(), "discover:user_module:more:click" })).a(this.Z));
                }
            }
        }
    }
    
    public void a(final UserView userView, final long n, final int n2) {
        final PromotedContent promotedContent = userView.getPromotedContent();
        final com.twitter.android.client.c aw = this.aw();
        final long g = this.aF().g();
        final fe fe = (fe)userView.getTag();
        String s;
        if (userView.l.isChecked()) {
            this.a.c(n);
            this.b(g, n);
            this.a(new pe((Context)this.getActivity(), this.aF(), n, promotedContent));
            s = "unfollow";
        }
        else {
            this.a.b(n);
            this.a(g, n, fe.c, fe.a);
            this.a(new pb((Context)this.getActivity(), this.aF(), n, promotedContent), 2, 0);
            s = "follow";
        }
        aw.a(((TwitterScribeLog)new TwitterScribeLog(g).b(n, promotedContent, fe.f).b(new String[] { ScribeLog.a(this.m(), "discover:user_module:user", s) })).a(this.Z));
    }
    
    @Override
    protected void a(final com.twitter.refresh.widget.a a) {
        if (this.n) {
            new k((Context)this.getActivity(), this.aF().e(), "discover_prefs").a().a("item", a.b).a("off", a.c).apply();
        }
    }
    
    @Override
    protected void a(final com.twitter.refresh.widget.a a, final boolean b) {
        if (this.n) {
            final long b2 = a.b;
            if (b2 > 0L) {
                final int a2 = this.a(b2);
                if (a2 >= this.Y().getHeaderViewsCount() || !b) {
                    this.b(a2, a.c);
                }
            }
        }
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        this.t();
        if (b) {
            this.a_(5);
            this.a.b();
            this.A_();
            this.getLoaderManager().restartLoader(1, null, this);
            this.e((Cursor)null);
            return;
        }
        if (this.T() == null) {
            this.a_(5);
            this.q();
            return;
        }
        if (((ez)this.W).isEmpty()) {
            this.a(3);
            this.w();
            return;
        }
        this.f(false);
    }
    
    protected boolean a(final int n) {
        return this.a(n, 0L, 0L);
    }
    
    boolean a(final long n, final long n2, final long n3) {
        final HashMap<Object, Long> hashMap = this.g.get(n);
        HashMap<Object, Long> hashMap3;
        if (hashMap == null) {
            final HashMap<Object, Long> hashMap2 = new HashMap<Object, Long>();
            this.g.put(n, hashMap2);
            hashMap3 = hashMap2;
        }
        else {
            hashMap3 = hashMap;
        }
        final Long n4 = hashMap3.get(n2);
        if (n4 != null && n4 == n3) {
            return false;
        }
        hashMap3.put(n2, n3);
        return true;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (n == 0) {
            this.z();
            this.s = true;
        }
        return super.a(absListView, n, n2, n3, b);
    }
    
    protected boolean a(final GroupedRowView groupedRowView, final Cursor cursor, final int h) {
        final ff ff = (ff)groupedRowView.getTag();
        final String string = cursor.getString(cn.v);
        final String string2 = cursor.getString(cn.u);
        final String string3 = cursor.getString(cn.s);
        final int int1 = cursor.getInt(cn.t);
        final String string4 = cursor.getString(cn.E);
        final int int2 = cursor.getInt(cn.B);
        final PromotedContent promotedContent = (PromotedContent)com.twitter.util.f.a(cursor.getBlob(cn.C));
        final Context r = this.r();
        ff.a(string);
        ff.a(promotedContent, r);
        ff.a(int2, int1, r);
        ff.a(int1, r);
        ff.h = string2;
        final boolean b = promotedContent != null;
        ff.g = uk.a(r, string3, int1, string, string2, "trend", string4, b, null);
        final TwitterScribeItem i = new TwitterScribeItem();
        i.h = h;
        i.y = TwitterTopic.e(int1);
        i.b = string;
        i.z = int2;
        if (b) {
            final long promotedTrendId = promotedContent.promotedTrendId;
            ff.f = promotedTrendId;
            i.e = Long.toString(promotedTrendId);
            if (!this.f.contains(promotedTrendId)) {
                this.a(PromotedEvent.a, promotedTrendId);
                this.f.add(promotedTrendId);
            }
        }
        ff.i = i;
        this.h.a(i);
        return true;
    }
    
    @Override
    public void ac_() {
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        final Session af = this.aF();
        final long g = af.g();
        final HashMap<Long, V> hashMap = this.i.get(g);
        if (hashMap != null) {
            for (final Map.Entry<Long, V> entry : hashMap.entrySet()) {
                this.a(new pv(this.an, af, g, 9, -1L, entry.getKey(), (Integer)((Pair)entry.getValue()).second), 5, 0);
            }
            hashMap.clear();
        }
        ((ez)this.W).a();
        this.b(g);
        this.A();
        this.c(g);
    }
    
    Pair b(final long n, final long n2) {
        ((ez)this.W).b(n2);
        final HashMap<Object, Pair> hashMap = this.i.get(n);
        if (hashMap != null) {
            return hashMap.remove(n2);
        }
        return null;
    }
    
    @Override
    protected void c() {
        super.c();
        this.aw().a(this.aF().g(), this.m() + "::::impression");
        this.r = true;
        this.z();
    }
    
    void c(final int n) {
        this.b |= n;
    }
    
    @Override
    protected void c_(final int n) {
        if (n == 7) {
            ((ez)this.W).f();
            ((ez)this.W).notifyDataSetChanged();
            return;
        }
        super.c_(n);
    }
    
    boolean d(final int n) {
        return (n & this.b) != 0x0;
    }
    
    boolean e(final int n) {
        return (n & this.c) != 0x0;
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
    protected void j_() {
        super.j_();
        this.q.a();
    }
    
    @Override
    protected void k() {
        if (this.n) {
            final k k = new k((Context)this.getActivity(), this.aF().e(), "discover_prefs");
            this.l = k.getLong("item", 0L);
            this.m = k.getInt("off", 0);
            this.a(new com.twitter.refresh.widget.a(0, this.l, this.m), false);
        }
    }
    
    @Override
    protected boolean l() {
        return com.twitter.library.av.w.a(94);
    }
    
    @Override
    protected String m() {
        return "discover";
    }
    
    @Override
    protected void o() {
        if (this.a((Context)this.getActivity(), 1)) {
            this.a(4);
        }
        this.w();
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final FragmentActivity activity = this.getActivity();
        if (this.W == null) {
            final String m = this.m();
            final ez w = new ez(this.ax(), 2, com.twitter.android.client.v.a(this.an).a(), new fd(this, (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(1)).b(m)).c("discover")).d("tweet"), m + ":discover:tweet:avatar:profile_click", m + ":discover:tweet::open_link", m + ":discover:tweet:photo:click"), this.L, this, this.a, this.k, this.Z);
            if (bundle != null) {
                final long[] longArray = bundle.getLongArray("spinning_gap_ids");
                if (longArray != null) {
                    for (int length = longArray.length, i = 0; i < length; ++i) {
                        w.c(longArray[i]);
                    }
                    w.notifyDataSetChanged();
                }
            }
            this.a(w);
            this.W = (ListAdapter)w;
        }
        final ListView y = this.Y();
        final boolean boolean1 = this.getArguments().getBoolean("legacy", false);
        this.o = this.getResources().getDimensionPixelSize(2131558415);
        final boolean f = com.twitter.library.featureswitch.d.f("olympic_pivot_cell_discover");
        final ArrayList h = com.twitter.library.featureswitch.d.h("olympic_pivot_cell_locale");
        final String string = this.getResources().getConfiguration().locale.toString();
        this.q = new fg((Context)activity, y, this.o, boolean1, !boolean1 && f && h.contains(string));
        y.setAdapter(this.W);
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            case 1: {
                if (-1 != n2 || intent == null) {
                    break;
                }
                final long longExtra = intent.getLongExtra("user_id", 0L);
                if (longExtra <= 0L || !intent.hasExtra("friendship")) {
                    break;
                }
                final int intExtra = intent.getIntExtra("friendship", 0);
                final FriendshipCache a = this.a;
                if (!a.a(longExtra, intExtra)) {
                    a.b(longExtra, intExtra);
                    ((ez)this.W).notifyDataSetChanged();
                    return;
                }
                break;
            }
            case 2: {
                if (-1 == n2 && intent != null && intent.hasExtra("friendship_cache")) {
                    this.a.a((FriendshipCache)intent.getSerializableExtra("friendship_cache"));
                    ((ez)this.W).notifyDataSetChanged();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.n = this.getArguments().getBoolean("no_tweet_marker", false);
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b(this.m()));
        if (bundle != null && bundle.containsKey("friendship_cache")) {
            this.a = (FriendshipCache)bundle.getSerializable("friendship_cache");
        }
        else {
            this.a = new FriendshipCache();
        }
        this.k = new fb(this);
        PreferenceManager.getDefaultSharedPreferences((Context)this.getActivity()).registerOnSharedPreferenceChangeListener(this.j);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final long g = this.aF().g();
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return new com.twitter.library.util.k((Context)this.getActivity(), ao.a.buildUpon().appendQueryParameter("ownerId", String.valueOf(g)).build(), null, null, null, null);
            }
            case 1: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(ContentUris.withAppendedId(bc.d, this.X), g).buildUpon().appendQueryParameter("limit", Integer.toString(3)).build(), cn.a, "t_tag=? AND t_data_type=?", new String[] { "TREND", Integer.toString(7) }, "preview_draft_id DESC, t_updated_at DESC, _id ASC");
            }
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.a(layoutInflater, 2130968793, viewGroup);
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        PreferenceManager.getDefaultSharedPreferences((Context)this.getActivity()).unregisterOnSharedPreferenceChangeListener(this.j);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        switch (loader.getId()) {
            default: {
                super.onLoaderReset(loader);
            }
            case 0: {
                super.onLoaderReset(loader);
            }
            case 1: {
                this.e((Cursor)null);
            }
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.a.a()) {
            bundle.putSerializable("friendship_cache", (Serializable)this.a);
        }
        if (this.W != null) {
            final ArrayList e = ((ez)this.W).e();
            if (!e.isEmpty()) {
                bundle.putLongArray("spinning_gap_ids", CollectionUtils.c(e));
            }
        }
    }
    
    protected Context r() {
        return this.an;
    }
    
    protected Session s() {
        return this.aF();
    }
    
    void t() {
        this.b = 0;
    }
}
