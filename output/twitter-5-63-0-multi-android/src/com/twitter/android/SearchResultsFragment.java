// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.support.v4.content.CursorLoader;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.client.TwitterFragmentActivity;
import android.widget.ListAdapter;
import com.twitter.android.client.u;
import com.twitter.android.widget.TopicView;
import com.twitter.library.provider.Tweet;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.widget.UserView;
import com.twitter.errorreporter.ErrorReporter;
import android.widget.ListView;
import com.twitter.refresh.widget.a;
import com.twitter.library.view.z;
import android.support.v4.content.Loader;
import android.content.DialogInterface;
import java.io.Serializable;
import com.twitter.library.api.PromotedEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.TwitterTopic$Data;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.TwitterTopic$Metadata;
import com.twitter.android.events.b;
import android.text.TextUtils;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.y;
import android.os.Parcelable;
import com.twitter.library.api.search.g;
import android.content.Context;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import android.support.v4.app.Fragment;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog$SearchDetails;
import com.twitter.library.util.FriendshipCache;
import java.util.HashSet;
import java.util.ArrayList;
import android.util.SparseArray;
import com.twitter.ui.dialog.e;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;

public class SearchResultsFragment extends SearchFragment implements View$OnClickListener, AdapterView$OnItemClickListener, vk, xx, e
{
    private static final SparseArray a;
    protected rf I;
    private ArrayList aA;
    private boolean aB;
    private xa aC;
    private xa aD;
    private xa aE;
    private xa aF;
    private xa aG;
    private rn aH;
    private final ArrayList aI;
    private ArrayList aJ;
    private final HashSet aK;
    private long ao;
    private long ap;
    private boolean aq;
    private boolean ar;
    private FriendshipCache as;
    private mz at;
    private boolean au;
    private String av;
    private boolean aw;
    private boolean ax;
    private String ay;
    private HashSet az;
    
    static {
        (a = new SparseArray(7)).put(1, (Object)"universal_all");
        SearchResultsFragment.a.put(2, (Object)"users");
        SearchResultsFragment.a.put(3, (Object)"photo_tweets");
        SearchResultsFragment.a.put(4, (Object)"videos_vines");
        SearchResultsFragment.a.put(5, (Object)"videos_all");
        SearchResultsFragment.a.put(6, (Object)"news");
        SearchResultsFragment.a.put(9, (Object)"geo");
    }
    
    public SearchResultsFragment() {
        this.aq = false;
        this.ar = true;
        this.aI = new ArrayList();
        this.aK = new HashSet();
    }
    
    private xa a(xa a, final String s, final boolean b, final ScribeLog$SearchDetails scribeLog$SearchDetails) {
        if (a == null || a.a() != b) {
            a = this.a(s, b, scribeLog$SearchDetails);
        }
        return a;
    }
    
    private xa a(final String s, final boolean b, final ScribeLog$SearchDetails scribeLog$SearchDetails) {
        final StringBuilder sb = new StringBuilder();
        final String b2 = this.B;
        final String m_ = this.M_();
        final String a = TwitterScribeLog.a(this.Z, s, "avatar", "profile_click");
        final String a2 = ScribeLog.a(sb, b2, m_, s, "link", "open_link");
        final String a3 = ScribeLog.a(sb, b2, m_, s, "platform_photo_card", "click");
        final String a4 = ScribeLog.a(sb, b2, m_, s, "platform_player_card", "click");
        if (b) {
            return new xa(this, this.Z, this.u, a, a2, a3, a4, new oy(com.twitter.library.provider.ae.a(com.twitter.library.provider.aw.a, this.X), cc.a, "flags&1537 !=0 AND search_id=?", new String[] { String.valueOf(this.s) }, "type_id ASC, _id ASC"));
        }
        return new xa(this, this.Z, this.u, a, a2, a3, a4, new rm(this, this.Z, scribeLog$SearchDetails, this.aJ));
    }
    
    private void a(final String s, final xa xa) {
        this.aw().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { s })).a(this.V(), SearchFragment.d(this.m), this.d, this.c)).a(this.Z)).a(TwitterScribeItem.a(xa)));
    }
    
    private boolean a(final int l, final long n) {
        if (!this.f(l)) {
            return false;
        }
        this.a_(this.l = l);
        int n2 = 0;
        int n3 = 0;
        switch (l) {
            default: {
                throw new IllegalArgumentException("Invalid fetch type: " + l);
            }
            case 3: {
                n2 = 0;
                n3 = 1;
                break;
            }
            case 4: {
                n2 = 1;
                n3 = 0;
                break;
            }
            case 2: {
                n2 = 1;
                this.am();
                n3 = 0;
                break;
            }
            case 1: {
                n2 = 2;
                n3 = 0;
                break;
            }
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { TwitterListFragment.a(this.B, this.M_(), l) })).a(this.u, SearchFragment.d(this.m), this.d, this.c);
        final FragmentActivity activity = this.getActivity();
        final g a = new g((Context)activity, this.aF(), n, this.u, this.O(), this.v, this.t, n2, this.A, false, kg.a((Context)activity)).a(this.m, this.d, this.e, this.f).a(this.ao, this.ap).a(this.D, this.E);
        this.a(a);
        if (n3 != 0) {
            a.a(this.aA);
        }
        a.a("scribe_log", (Parcelable)twitterScribeLog);
        if (this.c) {
            a.a(this.H.a());
        }
        this.a(a, 2, l);
        return true;
    }
    
    private void aG() {
        if (this.m == 2) {
            this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.X)).b(this.B)).c("people"));
            return;
        }
        this.a((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b(this.B)).c(this.M_()));
    }
    
    private boolean aH() {
        return !TextUtils.isEmpty((CharSequence)this.D);
    }
    
    private boolean aI() {
        return this.E != null;
    }
    
    private boolean b(final g g) {
        final boolean aq = this.aq;
        final String a = g.A();
        if (a != null) {
            final FragmentActivity activity = this.getActivity();
            if (activity != null) {
                TwitterTopic e = g.E();
                final String b = g.B();
                if (com.twitter.android.events.b.a(a) && e == null) {
                    e = new TwitterTopic(new TwitterTopic$Metadata(2, g.z(), false), this.t, null, this.u, this.u, null, null, null, 0L, 0L, 0L, null, null, null, null, null);
                }
                return ((rp)activity).a(this.u, this.s, e, b);
            }
        }
        return aq;
    }
    
    private void d(final boolean b) {
        if (!b && !this.P()) {
            this.S();
        }
        else if (this.ax) {
            return;
        }
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            ((rp)activity).a(b, this.Y());
        }
    }
    
    private xa e(final String s) {
        final ScribeLog$SearchDetails scribeLog$SearchDetails = new ScribeLog$SearchDetails(this.u, SearchFragment.d(this.m), s, this.d, this.c);
        switch (s) {
            default: {
                return null;
            }
            case "tweet": {
                return this.aC = this.a(this.aC, s, this.m == 3, null);
            }
            case "news": {
                return this.aD = this.a(this.aD, s, false, null);
            }
            case "highlight": {
                return this.aE = this.a(this.aE, s, false, null);
            }
            case "tweet_list_glance": {
                return this.aF = this.a(this.aF, s, false, scribeLog$SearchDetails);
            }
            case "tweet_list_popular": {
                return this.aG = this.a(this.aG, s, false, scribeLog$SearchDetails);
            }
        }
    }
    
    protected boolean A_() {
        this.getLoaderManager().restartLoader(0, null, this);
        return true;
    }
    
    @Override
    protected String M_() {
        return this.e_(this.q);
    }
    
    protected Cursor T() {
        if (this.I != null) {
            return this.I.b();
        }
        return null;
    }
    
    public void U() {
        String s;
        String s2;
        if (this.aH()) {
            s = this.M_();
            s2 = "user_rail";
        }
        else {
            s = this.M_();
            s2 = "user_gallery";
        }
        this.a(ScribeLog.a(this.B, s, s2, "more", "search"));
        this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchTerminalActivity.class).putExtra("query", this.u).putExtra("query_name", this.t).putExtra("search_type", 2).putExtra("terminal", true));
    }
    
    protected String V() {
        if (this.aI()) {
            return this.E;
        }
        if (this.aH()) {
            return this.D;
        }
        return this.u;
    }
    
    @Override
    public void a(final int n, final y y) {
        this.aB = false;
        final View emptyView = this.Y().getEmptyView();
        emptyView.setVisibility(8);
        super.a(n, y);
        if (n == 2) {
            final g g = (g)y;
            final aa aa = (aa)g.l().b();
            final int r = y.R();
            if (!aa.a()) {
                Toast.makeText(this.an, 2131297648, 1).show();
                this.d(false);
                emptyView.setVisibility(0);
                ((TextView)emptyView.findViewById(2131886113)).setText(2131297648);
            }
            else if (r == 3) {
                this.au = g.f();
                this.D = g.z();
                this.a(g.D());
                if (g.t() == 0) {
                    emptyView.setVisibility(0);
                    this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { ScribeLog.a(this.B, this.M_(), "stream", null, "no_results") })).a(this.u, SearchFragment.d(this.m), this.d, this.c));
                }
                if (this.j) {
                    this.B();
                }
                if (this.aq = this.b(g)) {
                    return;
                }
                this.d(false);
            }
            else if (g.t() == 0 && r == 1) {
                this.h = true;
            }
            this.k = g.g();
        }
    }
    
    public void a(final long n, final PromotedContent promotedContent, final int n2, final xz xz) {
        final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", n).putExtra("screen_name", xz.a);
        if (this.Z != null) {
            putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.Z).a(5)).a(this.X));
        }
        final com.twitter.android.client.c aw = this.aw();
        if (promotedContent != null) {
            aw.a(PromotedEvent.d, promotedContent);
            putExtra.putExtra("pc", (Serializable)promotedContent);
        }
        this.startActivity(putExtra);
        String s;
        String s2;
        String s3;
        if (this.aH()) {
            final String m_ = this.M_();
            s = "avatar";
            s2 = "user_rail";
            s3 = m_;
        }
        else {
            final String m_2 = this.M_();
            s = "user";
            s2 = "user_gallery";
            s3 = m_2;
        }
        aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(n, promotedContent, null, n2).b(new String[] { ScribeLog.a(this.B, s3, s2, s, "profile_click") })).a(this.Z)).a(this.u, SearchFragment.d(this.m), this.d, this.c));
    }
    
    @Override
    protected void a(final Context context) {
        final g a = new g(context, this.aF(), this.s, this.u, this.O(), this.v, this.t, 1, this.A, false, kg.a(context)).a(this.m, this.d, this.e, this.f).a(this.ao, this.ap).a(this.D, this.E);
        a.j("Not triggered by a user action.");
        this.a(a);
        if (this.c) {
            a.a(this.H.a());
        }
        this.a(a, 1, 4);
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 1) {
            final String m_ = this.M_();
            if (n2 == -1) {
                this.aw().a(this.X, this.B, m_, this.ay, "feedback", "accept");
            }
            else if (n2 == -2) {
                this.aw().a(this.X, this.B, m_, this.ay, "feedback", "deny");
            }
            Toast.makeText((Context)this.getActivity(), 2131297652, 0).show();
        }
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        final rf i = this.I;
        final int l = this.l;
        if (this.aw) {
            if (l == 3) {
                this.aG();
                i.a(this.e("tweet"), this.e("news"), this.e("highlight"), this.e("tweet_list_glance"), this.e("tweet_list_popular"));
            }
            this.A();
        }
        final a e = this.E();
        i.swapCursor(cursor);
        if (this.aw) {
            this.c_(l);
            if (l == 2) {
                this.a(e, true);
                this.l = 3;
            }
        }
        else {
            if (this.I.isEmpty()) {
                this.c(3);
            }
            this.aw = true;
        }
        if (this.aq) {
            this.d(true);
        }
        if (this.af) {
            this.ad();
        }
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        if (n >= this.Y().getHeaderViewsCount()) {
            final com.twitter.android.client.c aw = this.aw();
            final String d = SearchFragment.d(this.m);
            final rh rh = (rh)view.getTag();
            if (rh == null) {
                ErrorReporter.a(new com.twitter.errorreporter.a().a("view", view).a("position", n).a("view type", this.I.getItemViewType(n)));
            }
            final ro m = rh.m;
            final StringBuilder sb = new StringBuilder();
            switch (m.b) {
                case 7:
                case 20: {
                    break;
                }
                default: {}
                case 0:
                case 4:
                case 9:
                case 24:
                case 30:
                case 32: {
                    final Tweet tweet = rh.a.f.getTweet();
                    final int reasonIconResId = rh.a.f.getReasonIconResId();
                    final Context applicationContext = this.getActivity().getApplicationContext();
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)TweetActivity.class).putExtra("tw", (Parcelable)tweet).putExtra("reason", rh.a.f.getReason()).putExtra("reason_icon_id", reasonIconResId).putExtra("association", (Parcelable)this.Z));
                    if (this.aH()) {
                        aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(applicationContext, tweet, this.Z, null).b(new String[] { ScribeLog.a(sb, this.B, this.M_(), "tweet", "tweet", "click") })).a(this.Z)).a(this.aJ).a(this.u, d, this.d, this.c));
                        return;
                    }
                    if (m.b == 0 || m.b == 30) {
                        if (this.aI()) {
                            aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(applicationContext, tweet, this.Z, null).b(new String[] { this.B + ":cluster_detail:tweet:tweet:click" })).a(this.Z)).a(this.aJ).a(this.u, d, this.d, this.c));
                            return;
                        }
                        aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(applicationContext, tweet, this.Z, null).b(new String[] { TwitterScribeLog.a(this.Z, "tweet", "tweet", "click") })).a(this.Z)).a(this.aJ).a(this.u, d, this.d, this.c));
                        return;
                    }
                    else {
                        if (m.b == 24 || m.b == 32) {
                            String d2;
                            if (m.k != null) {
                                d2 = m.k.d;
                            }
                            else {
                                d2 = null;
                            }
                            aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(applicationContext, tweet, this.Z, null).b(new String[] { this.B + ":cluster:tweet::click" })).a(this.Z)).a(this.aJ).a(this.u, d, this.d, this.c).c(d2));
                            return;
                        }
                        aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(applicationContext, tweet, this.Z, null).b(new String[] { ScribeLog.a(sb, this.B, this.M_(), "news", "tweet", "click") })).a(this.Z)).a(this.aJ).a(this.u, d, this.d, this.c));
                        return;
                    }
                    break;
                }
                case 15: {
                    this.a(ScribeLog.a(sb, this.B, this.M_(), "highlight", "more", "search"));
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchTerminalActivity.class).putExtra("query", this.u).putExtra("query_name", this.t).putExtra("q_source", "highlight_tweet_drill_down_click").putExtra("since", m.j.timeSince).putExtra("until", m.j.timeUntil).putExtra("terminal", true));
                }
                case 1: {
                    final UserView userView = (UserView)((GroupedRowView)view).getChildAt(0);
                    final long userId = userView.getUserId();
                    final Intent putExtra = new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", userId).putExtra("screen_name", userView.getUserName());
                    if (this.Z != null) {
                        putExtra.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation(this.Z).a(5)).a(this.X));
                    }
                    final PromotedContent promotedContent = userView.getPromotedContent();
                    if (promotedContent != null) {
                        aw.a(PromotedEvent.d, promotedContent);
                        putExtra.putExtra("pc", (Serializable)promotedContent);
                    }
                    this.startActivity(putExtra);
                    String s;
                    if (this.m == 2) {
                        s = this.B + ":people:users:user:profile_click";
                    }
                    else {
                        s = ScribeLog.a(sb, this.B, this.M_(), null, "user", "profile_click");
                    }
                    aw.a(((TwitterScribeLog)new TwitterScribeLog(this.X).a(userId, userView.getPromotedContent(), null, n).b(new String[] { s })).a(this.aJ).a(this.Z).a(this.u, d, this.d, this.c));
                }
                case 8:
                case 14: {
                    this.a(ScribeLog.a(sb, this.B, this.M_(), "user", "more", "search"));
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchTerminalActivity.class).putExtra("query", this.u).putExtra("query_name", this.t).putExtra("search_type", 2).putExtra("terminal", true));
                }
                case 26: {
                    this.a(ScribeLog.a(sb, this.B, this.M_(), "media_gallery", "more", "search"));
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchTerminalActivity.class).putExtra("query", this.u).putExtra("query_name", this.t).putExtra("search_type", 3).putExtra("terminal", true));
                }
                case 3: {
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchActivity.class).putExtra("query", m.i).putExtra("query_name", m.i).putExtra("q_source", "related_query_click"));
                    this.a(ScribeLog.a(sb, this.B, this.M_(), "related_queries", null, "search"));
                }
                case 2: {
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchActivity.class).putExtra("query", this.u).putExtra("query_name", this.t).putExtra("q_source", "auto_spell_correct_revert_click"));
                    this.a(ScribeLog.a(sb, this.B, this.M_(), "spelling_corrections", null, "revert_click"));
                }
                case 18:
                case 19: {
                    this.startActivity(new Intent((Context)this.getActivity(), (Class)SearchTerminalActivity.class).putExtra("query", this.u).putExtra("scribe_context", "cluster_header").putExtra("cluster_id", m.k.c()).putExtra("query_name", m.k.d).putExtra("terminal", true));
                    if (this.aH()) {
                        this.a(ScribeLog.a(sb, this.B, this.M_(), null, "cluster_header", "click"));
                        return;
                    }
                    this.a(this.B + ":cluster::cluster_header:click", m.k);
                }
                case 25:
                case 31: {
                    final Intent putExtra2 = new Intent((Context)this.getActivity(), (Class)SearchTerminalActivity.class).putExtra("query", this.u).putExtra("terminal", true).putExtra("q_type", 1);
                    if (m.k != null) {
                        putExtra2.putExtra("scribe_context", "cluster_footer").putExtra("cluster_id", m.k.c()).putExtra("query_name", m.k.d);
                        this.a(this.B + ":cluster::cluster_footer:click", m.k);
                    }
                    else if (m.l != null) {
                        putExtra2.putExtra("query_name", this.t).putExtra("follows", m.l.follow).putExtra("near", m.l.nearby);
                        if (m.l.follow) {
                            this.a(ScribeLog.a(sb, this.B, this.M_(), "follows_pivot", "more", "search"));
                        }
                        else if (m.l.nearby) {
                            this.a(ScribeLog.a(sb, this.B, this.M_(), "nearby_pivot", "more", "search"));
                        }
                    }
                    this.startActivity(putExtra2);
                }
                case 11:
                case 28: {
                    if (!this.aH()) {
                        final TopicView j = rh.j;
                        final int topicType = j.getTopicType();
                        final String topicId = j.getTopicId();
                        final String seedHashtag = j.getSeedHashtag();
                        final String c = TwitterTopic.c(topicType);
                        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
                        twitterScribeItem.b = topicId;
                        twitterScribeItem.c = 16;
                        twitterScribeItem.y = c;
                        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.X);
                        twitterScribeLog.b(new String[] { ScribeLog.a(this.B, "universal_top", c, "event", "click") });
                        aw.a(((TwitterScribeLog)twitterScribeLog.a(this.u, d, this.d, this.c)).a(twitterScribeItem));
                        new uk(this).a(topicId, topicType, this.t, this.u, seedHashtag, j.getTopicData());
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    protected void a(final String s) {
        this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).g(this.av)).b(new String[] { s })).a(this.aJ).a(this.V(), SearchFragment.d(this.m), this.d, this.c).a(this.Z));
    }
    
    protected void a(final boolean b) {
        super.a(b);
        final rf i = this.I;
        if (b) {
            this.a_(5);
            this.A_();
        }
        else {
            if (i.b() == null) {
                this.a_(5);
                this.q();
                return;
            }
            if (i.isEmpty() || this.F()) {
                this.c(3);
                this.aw = true;
            }
        }
    }
    
    @Override
    protected int b(final long n) {
        if (this.I != null) {
            return this.I.a(n);
        }
        return 0;
    }
    
    public int b(final long n, final PromotedContent promotedContent, final int n2, final xz xz) {
        final FragmentActivity activity = this.getActivity();
        final com.twitter.android.client.c aw = this.aw();
        final FriendshipCache as = this.as;
        final int b = xz.b;
        if (!kg.a((Context)activity)) {
            boolean b2;
            if (as.a(n)) {
                b2 = as.k(n);
            }
            else {
                b2 = com.twitter.library.api.z.b(b);
            }
            String s;
            String s2;
            if (this.aH()) {
                final String m_ = this.M_();
                s = "user_rail";
                s2 = m_;
            }
            else {
                final String m_2 = this.M_();
                s = "user_gallery";
                s2 = m_2;
            }
            int n3;
            String s3;
            if (b2) {
                n3 = com.twitter.library.api.z.b(b, 1);
                this.a(new pe((Context)activity, this.aF(), n, promotedContent));
                as.c(n);
                s3 = ScribeLog.a(this.B, s2, s, "user", "unfollow");
            }
            else {
                n3 = com.twitter.library.api.z.a(b, 1);
                this.a(new pb((Context)activity, this.aF(), n, promotedContent));
                as.b(n);
                s3 = ScribeLog.a(this.B, s2, s, "user", "follow");
            }
            aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).a(n, promotedContent, null, n2).b(new String[] { s3 })).a(this.Z)).a(this.u, SearchFragment.d(this.m), this.d, this.c));
            return n3;
        }
        kg.a(activity, 4, xz.a);
        return b;
    }
    
    public xb b(final View view) {
        if (view.getTag() instanceof rh) {
            return ((rh)view.getTag()).a;
        }
        return null;
    }
    
    public void b(final int n, final y y) {
        this.aB = true;
        super.b(n, y);
    }
    
    @Override
    protected boolean c(final int n) {
        return this.a(n, this.s);
    }
    
    protected String e_(final int n) {
        String s;
        if (this.aI()) {
            s = "cluster_detail";
        }
        else {
            if (this.au) {
                return "cluster";
            }
            if (n != -1) {
                return TwitterTopic.c(n);
            }
            s = (String)SearchResultsFragment.a.get(this.m);
            if (s == null) {
                return "universal_top";
            }
        }
        return s;
    }
    
    @Override
    protected void i() {
        if (this.m == 2 && this.ao != 0L) {
            return;
        }
        if (this.n > 0) {
            this.e();
            return;
        }
        this.a(2, this.s);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        final Bundle arguments = this.getArguments();
        final String e = this.aF().e();
        this.av = arguments.getString("scribe_context");
        final TwitterFragmentActivity ax = this.ax();
        final com.twitter.android.client.c aw = this.aw();
        if (this.I == null) {
            this.a(this.I = new rf(ax, aw, this.t, this.L, this.as, this.at, (AdapterView$OnItemClickListener)this, this, new mx(this.getFragmentManager(), e, this.C, this.D, this.u), this.m, this.aI(), this.aH(), this.ar, this.D, this.az, this.C, bundle != null, this.ax, this.aq, this.q, (View$OnClickListener)this));
            if (this.M != null) {
                this.M.a(this);
            }
        }
        if (this.Z == null) {
            this.aG();
        }
        if (this.g || this.aH()) {
            (this.aJ = new ArrayList(1)).add(TwitterScribeItem.a(this.D, this.C, this.q));
        }
        else {
            this.aJ = null;
        }
        this.I.a(this.e("tweet"), this.e("news"), this.e("highlight"), this.e("tweet_list_glance"), this.e("tweet_list_popular"));
        final ListView y = this.Y();
        y.setAdapter((ListAdapter)this.I);
        y.setContentDescription((CharSequence)this.getString(2131297656));
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887268) {
            final String ay = (String)view.getTag();
            this.ay = ay;
            this.aw().a(this.X, this.B, this.M_(), ay, "feedback", "click");
            PromptDialogFragment.b(1).d(2131297651).h(2131298158).j(2131297303).c(2131297653).a(this).show(this.getFragmentManager(), "summary_dialog");
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            if (bundle.containsKey("friendship_cache")) {
                this.as = (FriendshipCache)bundle.getSerializable("friendship_cache");
            }
            else {
                this.as = new FriendshipCache();
            }
            this.az = (HashSet)bundle.getSerializable("viewed_item_ids");
            this.ao = bundle.getLong("since");
            this.ap = bundle.getLong("until");
            this.au = bundle.getBoolean("searches_with_clusters");
            this.ax = bundle.getBoolean("in_back_stack");
            this.aq = bundle.getBoolean("search_takeover");
            this.ar = bundle.getBoolean("event_header_available");
        }
        else {
            this.as = new FriendshipCache();
            this.az = new HashSet();
            final Bundle arguments = this.getArguments();
            this.ao = arguments.getLong("since", 0L);
            this.ap = arguments.getLong("until", 0L);
            this.ax = arguments.containsKey("in_back_stack");
            this.aq = arguments.getBoolean("search_takeover");
            this.ar = arguments.getBoolean("event_header_available");
            this.au = false;
            this.aA = (ArrayList)arguments.getSerializable("pinnedTweetIds");
        }
        this.at = new rl(this);
        this.aH = new rn(this);
    }
    
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        this.d(true);
        return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.aw.a, this.X), cc.a, "search_id=?", new String[] { String.valueOf(this.s) }, "type_id ASC, _id ASC");
    }
    
    public void onDestroy() {
        if (this.I != null) {
            this.I.swapCursor(null);
        }
        if (this.aH()) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { ScribeLog.a(new StringBuilder(), this.B, TwitterTopic.c(this.q), "time_nav", null, "close") })).e(this.D));
        }
        else if (this.aI()) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { this.B + ":cluster_detail:time_nav::close" })).e(this.D));
        }
        this.b(this.aH);
        super.onDestroy();
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final ro ro = (ro)adapterView.getTag();
        int n3;
        Object a;
        if (ro.b == 20) {
            n3 = 3;
            a = TwitterScribeItem.a(ro.k);
        }
        else {
            n3 = 2;
            a = null;
        }
        this.getActivity().startActivity(new Intent((Context)this.getActivity(), (Class)GalleryActivity.class).setData(com.twitter.library.provider.ae.a(com.twitter.library.provider.aw.a, this.X)).putExtra("prj", cc.a).putExtra("sel", "flags&1537 !=0 AND search_id=? AND type_id=?").putExtra("selArgs", new String[] { String.valueOf(this.s), String.valueOf(ro.c) }).putExtra("orderBy", "type_id ASC, _id ASC").putExtra("id", n2).putExtra("context", n3).putExtra("item", (Parcelable)a));
        this.a(ScribeLog.a(this.B, this.M_(), "media_gallery", "photo", "click"));
    }
    
    public void onLoaderReset(final Loader loader) {
        this.I.swapCursor(null);
        this.d(false);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        final PromptDialogFragment promptDialogFragment = (PromptDialogFragment)this.getFragmentManager().findFragmentByTag("summary_dialog");
        if (promptDialogFragment != null) {
            promptDialogFragment.a(this);
        }
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.as.a()) {
            bundle.putSerializable("friendship_cache", (Serializable)this.as);
        }
        bundle.putLong("since", this.ao);
        bundle.putLong("until", this.ap);
        bundle.putBoolean("searches_with_clusters", this.au);
        bundle.putSerializable("viewed_item_ids", (Serializable)this.az);
        bundle.putBoolean("in_back_stack", this.ax);
        bundle.putBoolean("search_takeover", this.aq);
        bundle.putBoolean("event_header_available", this.ar);
        if (this.aB) {
            this.a(this.aH);
        }
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.d(false);
        }
    }
    
    protected boolean p() {
        return this.I.isEmpty();
    }
    
    protected void q() {
        this.getLoaderManager().initLoader(0, null, this);
    }
    
    @Override
    public int t() {
        return this.m;
    }
    
    @Override
    protected boolean w() {
        return this.m != 2 && this.ao == 0L;
    }
    
    @Override
    protected int x() {
        if (this.I != null) {
            return this.I.getCount();
        }
        return 0;
    }
    
    @Override
    protected void y() {
        if (this.m == 2) {
            this.a(this.B + ":people:users::impression");
            return;
        }
        this.a(ScribeLog.a(this.B, this.M_(), null, null, "impression"));
    }
    
    @Override
    protected void z() {
        if (!this.aI.isEmpty()) {
            String s;
            if (this.q == -1 || this.aH()) {
                s = ScribeLog.a(this.B, this.e_(this.q), "stream", null, "results");
            }
            else {
                s = ScribeLog.a(this.B, "universal_top", TwitterTopic.c(this.q), "event", "results");
            }
            this.aw().a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.X).b(new String[] { s })).a(this.V(), SearchFragment.d(this.m), this.d, this.c)).b(this.aI));
            this.aI.clear();
        }
    }
}
