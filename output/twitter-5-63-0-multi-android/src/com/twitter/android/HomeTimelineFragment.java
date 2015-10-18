// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.metrics.e;
import java.util.Collection;
import android.os.Parcelable;
import com.twitter.android.client.bw;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cw;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.library.api.TwitterUser;
import android.database.DataSetObserver;
import android.view.View$OnClickListener;
import com.twitter.library.client.ay;
import android.support.v4.widget.CursorAdapter;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import com.twitter.library.api.timeline.aj;
import com.twitter.android.widget.RediscoverabilityOverlayPrompt;
import com.twitter.android.util.ba;
import com.twitter.library.client.v;
import android.widget.AbsListView;
import android.app.Activity;
import android.widget.ListAdapter;
import com.twitter.library.client.k;
import android.support.v4.content.Loader;
import com.twitter.library.platform.TwitterDataSyncService;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.timeline.w;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.n;
import com.twitter.refresh.widget.a;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.c;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import com.twitter.library.provider.cn;
import com.twitter.library.api.Recap$Metadata;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.Tweet;
import android.database.Cursor;
import android.widget.ListView;
import com.twitter.library.service.y;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import com.twitter.android.util.al;
import com.twitter.android.widget.dx;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.util.ap;
import android.content.Context;
import com.twitter.android.util.AppRatingPromptHelper;
import com.twitter.android.util.j;
import com.twitter.library.featureswitch.d;
import com.twitter.android.widget.NewTweetBannerView;
import com.twitter.library.api.Prompt;
import android.view.View;
import com.twitter.android.widget.ObservableFrameLayout;
import java.util.HashSet;
import android.os.Bundle;
import com.twitter.android.util.av;
import com.twitter.ui.widget.PromptView;
import com.twitter.android.widget.f;
import com.twitter.ui.widget.q;
import com.twitter.android.util.aw;

public class HomeTimelineFragment extends TimelineFragment implements bd, aw, yw, q
{
    private static Runnable k;
    private f A;
    private boolean B;
    private PromptView C;
    private av D;
    private Bundle E;
    private boolean F;
    private oy G;
    private final HashSet l;
    private ObservableFrameLayout m;
    private View n;
    private View o;
    private View p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private Prompt u;
    private NewTweetBannerView v;
    private MiniWTFFragment w;
    private jh x;
    private jg y;
    private long z;
    
    public HomeTimelineFragment() {
        this.l = new HashSet();
        this.s = -1;
        this.t = -1;
    }
    
    private void L() {
        if (com.twitter.library.featureswitch.d.f("app_rating_prompt_enable") && (com.twitter.library.featureswitch.d.f("app_rating_prompt_show_now") || AppRatingPromptHelper.a((Context)this.getActivity(), new j()) >= 7) && this.A == null) {
            (this.A = new f((Context)this.getActivity(), this.aF().g())).f();
        }
    }
    
    private void M() {
        if (this.n == null) {
            final com.twitter.android.util.al a = ap.a((Context)this.getActivity());
            final View inflate = LayoutInflater.from((Context)this.getActivity()).inflate(2130968757, (ViewGroup)null, false);
            this.n = inflate;
            this.o = inflate.findViewById(2131886719);
            this.p = inflate.findViewById(2131886721);
            this.C = (PromptView)inflate.findViewById(2131886718);
            final boolean e = this.aw().e();
            if (a.e() || a.c()) {
                final PromptView c = this.C;
                int title;
                if (e) {
                    title = 2131298251;
                }
                else {
                    title = 2131297608;
                }
                c.setTitle(title);
            }
            else {
                final PromptView c2 = this.C;
                int title2;
                if (e) {
                    title2 = 2131298252;
                }
                else {
                    title2 = 2131297609;
                }
                c2.setTitle(title2);
            }
        }
        this.m.removeAllViews();
        this.m.addView(this.n);
        this.n.setVisibility(0);
        this.q = true;
        if (this.m.a()) {
            this.N();
        }
        this.m.setWindowAttachmentListener(new iy(this));
    }
    
    private void N() {
        if (this.U()) {
            return;
        }
        this.V();
        final MiniWTFFragment c = MiniWTFFragment.c(this.O());
        c.a((yw)this);
        c.a(new iz(this));
        final FragmentManager childFragmentManager = this.getChildFragmentManager();
        childFragmentManager.beginTransaction().add(2131886720, c).commitAllowingStateLoss();
        childFragmentManager.executePendingTransactions();
        this.w = c;
    }
    
    private int O() {
        int n;
        if (com.twitter.library.featureswitch.d.a("eht_wtf_module_num_recs_android_3101", "wtf7u7", "wtf7u14")) {
            n = 7;
        }
        else {
            n = 3;
        }
        if (this.as() > 0) {
            return n;
        }
        return 10;
    }
    
    private void P() {
        final com.twitter.library.service.y f = this.aw().f();
        if (f != null) {
            this.a(f, 1000, 0);
        }
    }
    
    private void Q() {
        if (this.S()) {
            this.a((UmfPromptView)null);
            if (!this.q) {
                this.M();
            }
            if (this.w != null) {
                this.w.d(this.O());
            }
            this.W_();
            if (this.U()) {
                if (this.w != null) {
                    this.V();
                }
                this.o.setVisibility(8);
                this.p.setVisibility(8);
            }
            else {
                if (this.w == null) {
                    this.N();
                }
                this.o.setVisibility(0);
                this.p.setVisibility(0);
            }
            this.R();
        }
        else if (this.n != null) {
            this.n.setVisibility(8);
        }
    }
    
    private void R() {
        final ListView y = this.Y();
        final View viewById = ((View)y).findViewById(2131886119);
        if (this.q && viewById != null) {
            viewById.setVisibility(8);
        }
        ((View)y).requestLayout();
    }
    
    private boolean S() {
        int n;
        if (com.twitter.library.featureswitch.d.a("eht_wtf_module_num_recs_android_3101", "wtf3u14", "wtf7u14")) {
            n = 14;
        }
        else {
            n = 7;
        }
        return this.O == 0 && this.s != -1 && this.s < n;
    }
    
    private boolean U() {
        return com.twitter.library.featureswitch.d.a("eht_wtf_module_num_recs_android_3101", new String[] { "no_wtf" });
    }
    
    private void V() {
        final FragmentManager childFragmentManager = this.getChildFragmentManager();
        if (this.w != null) {
            childFragmentManager.beginTransaction().remove(this.w).commitAllowingStateLoss();
            childFragmentManager.executePendingTransactions();
        }
    }
    
    private void a(final Cursor cursor, final int n, final Tweet tweet, final Bundle bundle) {
        if (cursor != null && bb.m(tweet.al) && cursor.moveToPosition(n) && this.N.a(tweet, bundle)) {
            final Recap$Metadata recap$Metadata = (Recap$Metadata)com.twitter.util.f.a(cursor.getBlob(cn.g));
            if (recap$Metadata != null && recap$Metadata.tweetId == tweet.D) {
                new jf((Context)this.getActivity(), this.m(), this.Z, this.aF(), recap$Metadata).execute((Object[])new Void[0]);
            }
        }
    }
    
    static boolean a(final Context context, final Session session, final long n) {
        if (session.f() == null) {
            Context applicationContext;
            if (context != null) {
                applicationContext = context.getApplicationContext();
            }
            else {
                applicationContext = context;
            }
            ErrorReporter.a(new jc(applicationContext, session, n, null).a(new IllegalStateException("TLN-2544")));
            return false;
        }
        return true;
    }
    
    private boolean aG() {
        return !this.getActivity().isChangingConfigurations();
    }
    
    private void j(final int n) {
        if (!this.f(n)) {}
    }
    
    private void k(final int n) {
        this.s = n;
        if (this.S()) {
            this.t = n;
            this.getLoaderManager().initLoader(1, null, this);
            return;
        }
        this.Q();
    }
    
    private boolean r(final int n) {
        return n == 2 || n == 4 || n == 3;
    }
    
    @Override
    protected boolean A() {
        return super.A() || (this.n != null && this.n.getVisibility() == 0);
    }
    
    @Override
    protected boolean C() {
        return com.twitter.android.av.aw.a((Context)this.getActivity(), 900);
    }
    
    @Override
    protected boolean D() {
        return com.twitter.android.revenue.c.b();
    }
    
    @Override
    public a E() {
        return super.E();
    }
    
    public void V_() {
        if (com.twitter.library.featureswitch.d.f("new_home_new_tweets_banner_android") && this.v.a(true)) {
            this.aw().a(this.aF().g(), this.m(), null, "new_tweet_prompt", null, "show");
        }
    }
    
    void W_() {
        final FragmentActivity activity = this.getActivity();
        final boolean b = com.twitter.library.util.n.a((Context)activity).b();
        final fi a = fj.a((Context)activity);
        if (a.b()) {
            this.C.setButtonText(null);
            this.C.setTitle(2131297110);
            int n;
            if (this.s <= 0 && !a.d()) {
                n = 1;
            }
            else {
                n = 0;
            }
            final PromptView c = this.C;
            int visibility = 0;
            if (n == 0) {
                visibility = 8;
            }
            c.setVisibility(visibility);
            return;
        }
        if (b) {
            this.C.setButtonText(null);
            final PromptView c2 = this.C;
            int title;
            if (this.aw().e()) {
                title = 2131298252;
            }
            else {
                title = 2131297609;
            }
            c2.setTitle(title);
        }
        this.C.setOnPromptClickListener(this);
    }
    
    boolean X_() {
        final ListView y = this.Y();
        if (!(y instanceof PinnedHeaderRefreshableListView)) {
            return true;
        }
        if (y.getChildCount() > 0) {
            final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView = (PinnedHeaderRefreshableListView)y;
            if (this.y != null) {
                this.y.a(pinnedHeaderRefreshableListView);
                pinnedHeaderRefreshableListView.setPinnedHeaderViewTopMargin(this.y.a());
            }
            pinnedHeaderRefreshableListView.a(pinnedHeaderRefreshableListView.getFirstVisiblePosition());
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final int n, final int n2, final int n3) {
        if (this.w != null) {
            this.w.r();
        }
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        if (y instanceof w) {
            final a e = this.E();
            final int headerViewsCount = this.Y().getHeaderViewsCount();
            final w w = (w)y;
            if (w.C() && w.K() > 0 && (e.a > headerViewsCount || e.c < 0)) {
                this.V_();
            }
        }
        final int r = y.R();
        if (r == 3 || r == 4) {
            if (this.aD()) {
                this.c.g();
                this.c.j();
            }
            else {
                this.c.k();
            }
        }
        if (n == 0) {
            this.r = false;
            this.c(y.b);
            this.c_(r);
            if (!((aa)y.l().b()).a()) {
                if (r == 1 && y.Q()) {
                    this.z = 0L;
                }
                Toast.makeText(this.an, 2131298000, 1).show();
            }
            if (y instanceof w && r == 3) {
                TwitterDataSyncService.f(this.an, this.aF().e());
            }
            if (this.r(r)) {
                this.D.a("home_timeline");
            }
        }
        else {
            if (n != 1000) {
                super.a(n, y);
                return;
            }
            final qd qd = (qd)y;
            if (((aa)y.l().b()).a() && qd.a != null) {
                this.k(qd.a.friendsCount);
            }
        }
    }
    
    @Override
    protected void a(final long n, final long n2) {
        super.a(n, n2);
        this.G = null;
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (cursor.getInt(14) != 0 || cursor.getCount() == 400) {
            this.aw().a(this.aF().g(), "home::::bottom");
        }
        super.a(cursor);
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        if (loader.getId() == 1) {
            this.s = cursor.getCount();
            if (this.s >= this.t) {
                if (!this.S()) {
                    this.getLoaderManager().destroyLoader(1);
                }
                this.Q();
                return;
            }
            this.a(new oy((Context)this.getActivity(), this.aF(), 0));
            this.t = -1;
        }
        else {
            super.a(loader, cursor);
            if (this.ah() && this.F) {
                this.D.a("home_timeline");
                this.F = false;
            }
        }
    }
    
    @Override
    public void a(final View view, final Tweet tweet, final Bundle bundle) {
        int position = -1;
        final ListAdapter w = this.W;
        Cursor t = null;
        if (w != null) {
            t = this.T();
            if (t != null) {
                position = t.getPosition();
            }
        }
        this.a(t, position, tweet, bundle);
        super.a(view, tweet, bundle);
        if (!this.B) {
            this.B = this.X_();
        }
        if (t != null && bb.s(t.getInt(cn.h))) {
            final long long1 = t.getLong(cn.H);
            if (this.l.add(long1)) {
                final k k = new k(this.getActivity().getApplicationContext(), this.aF().e());
                if (long1 == k.getLong("scribe_group_id", -1L)) {
                    k.a().a("scribe_group_id").apply();
                }
            }
        }
        if (t != null) {
            final int count = t.getCount();
            if (count < 400 && count - position <= 20) {
                if (t.moveToLast() && t.getInt(14) == 0) {
                    final long a = this.a(this.O, t);
                    if (a != this.z && com.twitter.library.featureswitch.d.f("home_timeline_preload_bottom_enabled") && this.d(1)) {
                        this.z = a;
                    }
                }
                t.moveToPosition(position);
            }
        }
    }
    
    public void a(final jg y) {
        this.y = y;
    }
    
    public void a(final jh x) {
        this.x = x;
    }
    
    @Override
    protected void a(final a a) {
        super.a(a);
    }
    
    @Override
    protected void a(final a a, final boolean b) {
        super.a(a, b);
    }
    
    @Override
    public void a(final PromptView promptView) {
        this.aw().a(this.aF().g(), this.m(), null, null, "find_friends", "click");
        final com.twitter.android.util.al a = ap.a((Context)this.getActivity());
        final FollowFlowController a2 = new FollowFlowController("empty_home_timeline").e(a.c()).a(true);
        final FragmentActivity activity = this.getActivity();
        a2.b(activity);
        if (a.e()) {
            com.twitter.android.er.a(a2.f(), activity.getApplicationContext()).a();
        }
    }
    
    @Override
    public boolean a(final long n, final Tweet tweet, final Runnable runnable) {
        this.r = true;
        return super.a(n, tweet, runnable);
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        if (this.y != null) {
            this.y.a(n);
        }
        return super.a(absListView, n);
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        Label_0139: {
            if (this.W != null && com.twitter.library.featureswitch.d.f("app_graph_enabled") && this.W instanceof tl && ((tl)this.W).b()) {
                int i = Math.max(-2 + (1 + (n - n2)), 0);
                while (true) {
                    while (i < Math.min(2 + (n + 1), ((xc)this.W).getCount())) {
                        if (((tl)this.W).b(i)) {
                            final int n4 = 1;
                            if (n4 == 0) {
                                ((tl)this.W).a(false);
                                final v a = com.twitter.library.client.v.a(this.an);
                                a.b("optin");
                                a.a("optin");
                            }
                            break Label_0139;
                        }
                        else {
                            ++i;
                        }
                    }
                    final int n4 = 0;
                    continue;
                }
            }
        }
        if (absListView instanceof PinnedHeaderRefreshableListView) {
            final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView = (PinnedHeaderRefreshableListView)absListView;
            if (this.y != null) {
                this.y.a(pinnedHeaderRefreshableListView, n, b);
                pinnedHeaderRefreshableListView.a(n);
            }
        }
        return super.a(absListView, n, n2, n3, b);
    }
    
    @Override
    public boolean a(final Prompt prompt) {
        final FragmentActivity activity = this.getActivity();
        if (activity != null && prompt != null && prompt.e() && ba.a((Context)activity).a(prompt)) {
            RediscoverabilityOverlayPrompt.a(prompt, this);
            return true;
        }
        return false;
    }
    
    @Override
    protected void ae_() {
        super.ae_();
        this.v.setVisibility(8);
    }
    
    @Override
    public String b() {
        return String.format("PTR Override: %s", com.twitter.library.api.timeline.aj.a(this.an) != null);
    }
    
    @Override
    public void b(Prompt u) {
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            if (u == null && this.aw().l() && !PreferenceManager.getDefaultSharedPreferences((Context)activity).getBoolean("readability_prompt_disabled", false)) {
                if (this.u == null) {
                    final Resources resources = this.getResources();
                    this.u = new Prompt(resources.getString(2131297515) + "\n", resources.getString(2131297516), null, null, null, null, null, 300, 0);
                    u = this.u;
                }
                else {
                    this.u = null;
                    PreferenceManager.getDefaultSharedPreferences((Context)activity).edit().putBoolean("readability_prompt_disabled", true).apply();
                }
            }
            if (u != null && this.z()) {
                this.c(u);
                this.ap();
            }
        }
    }
    
    @Override
    public void b(final PromptView promptView) {
    }
    
    @Override
    protected void b(final boolean b) {
        super.b(b);
    }
    
    @Override
    protected void c() {
        super.c();
        if (this.x != null && this.x.ab_() > 0) {
            this.V_();
        }
        if (this.S() && this.q && this.C.getVisibility() == 0) {
            this.aw().a(this.aF().g(), this.m(), "empty_timeline_module", null, null, "impression");
        }
        if (HomeTimelineFragment.k != null) {
            HomeTimelineFragment.k.run();
        }
    }
    
    @Override
    public void c(final boolean b) {
        super.c(b);
        if (b) {
            this.aw().a(this.aF().g(), "home::::pull_to_refresh");
            final fi a = fj.a((Context)this.getActivity());
            if (a.b() && !a.d()) {
                a.e();
                this.Q();
            }
        }
    }
    
    @Override
    protected boolean c(final int n) {
        this.j(n);
        return super.c(n);
    }
    
    @Override
    protected void c_(final int n) {
        super.c_(n);
    }
    
    @Override
    protected boolean d(final int n) {
        this.j(n);
        return super.d(n);
    }
    
    @Override
    protected void e(final int pinnedHeaderViewTopMargin) {
        this.v.a(0, pinnedHeaderViewTopMargin, 0, 0);
        final ListView y = this.Y();
        if (y instanceof PinnedHeaderRefreshableListView) {
            ((PinnedHeaderRefreshableListView)y).setPinnedHeaderViewTopMargin(pinnedHeaderViewTopMargin);
        }
    }
    
    @Override
    protected boolean f(final int n) {
        return a((Context)this.getActivity(), this.aF(), this.X) && super.f(n);
    }
    
    @Override
    protected void h() {
        if (this.r) {
            this.g();
            return;
        }
        super.h();
    }
    
    @Override
    protected void k() {
        super.k();
    }
    
    @Override
    protected boolean l() {
        return com.twitter.library.av.w.a(90);
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.s = bundle.getInt("friends_count");
        }
        else {
            this.P();
        }
        this.D = new av(this.ax(), (CursorAdapter)this.W);
        if (this.E != null) {
            this.D.a(this.E);
        }
        this.D.a(this);
        this.a(new jd(this));
        ((tl)this.W).a(this.D);
        final ListView y = this.Y();
        y.setContentDescription((CharSequence)this.getActivity().getString(2131297086));
        if (y instanceof PinnedHeaderRefreshableListView) {
            final View a = ((tl)this.W).a(2130968790, (ViewGroup)y);
            a.setOnClickListener((View$OnClickListener)new iw(this));
            final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView = (PinnedHeaderRefreshableListView)y;
            final Resources resources = this.getActivity().getResources();
            pinnedHeaderRefreshableListView.a(a, resources.getDimensionPixelSize(2131558806));
            pinnedHeaderRefreshableListView.setBuiltInDividerHeight(resources.getDimensionPixelSize(2131558661));
            ((xc)this.W).registerDataSetObserver((DataSetObserver)new ix(this));
        }
        this.m = new ObservableFrameLayout((Context)this.getActivity());
        this.Y().addHeaderView((View)this.m);
        final com.twitter.library.service.y f = this.aw().f();
        if (f != null) {
            this.a(f, 1000, 0);
        }
        else {
            final TwitterUser f2 = this.aF().f();
            if (f2 != null && f2.username != null) {
                this.k(f2.friendsCount);
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.E = (Bundle)bundle.getParcelable("prompt_controller");
            final Prompt u = (Prompt)bundle.getParcelable("readability_prompt");
            if (u != null && !u.c()) {
                this.u = u;
            }
        }
        else {
            this.F = true;
        }
        this.L();
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        if (n == 1) {
            final long g = this.aF().g();
            return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(ContentUris.withAppendedId(be.g, g), g), cw.a, null, null, null);
        }
        return super.onCreateLoader(n, bundle);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View a = this.a(layoutInflater, 2130969132, viewGroup);
        (this.v = (NewTweetBannerView)a.findViewById(2131886088)).setMinDelaySinceLastDisplayed(240000L);
        this.v.setOnClickListener((View$OnClickListener)new ja(this));
        this.a(new jb(this));
        return a;
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (this.q) {
            this.m.removeView(this.n);
            this.q = false;
        }
        if (this.aG()) {
            this.V();
        }
        this.getLoaderManager().destroyLoader(1);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        if (loader.getId() != 1) {
            super.onLoaderReset(loader);
        }
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.G = null;
        if (this.A != null) {
            this.A.a();
            this.A = null;
        }
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.D.a(this.t());
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("prompt_controller", this.D.d());
        if (this.u != null && !this.u.c()) {
            bundle.putParcelable("readability_prompt", (Parcelable)this.u);
        }
        bundle.putInt("friends_count", this.s);
    }
    
    @Override
    public void onStop() {
        super.onStop();
        if (com.twitter.library.featureswitch.d.f("polled_content_impression_enabled") && !this.l.isEmpty()) {
            this.a(new qh((Context)this.getActivity(), this.aF(), this.l));
        }
        this.l.clear();
    }
    
    @Override
    protected boolean p() {
        return this.Y().getCount() == 0;
    }
    
    @Override
    protected oy t() {
        if (this.G == null) {
            this.G = super.t();
        }
        return this.G;
    }
    
    @Override
    protected void u() {
        if (this.ac == null) {
            (this.ac = new sl((Context)this.getActivity(), this.ad)).a(this.Y());
            return;
        }
        super.u();
    }
    
    protected uh w() {
        return new je(this, this, this.Z, this.H(), this.K);
    }
    
    @Override
    protected void x_() {
        (this.c = com.twitter.android.metrics.e.a(this.av(), this.aF().g())).i();
    }
    
    @Override
    protected boolean z() {
        return super.z() && this.K() && (this.n == null || this.n.getVisibility() != 0);
    }
}
