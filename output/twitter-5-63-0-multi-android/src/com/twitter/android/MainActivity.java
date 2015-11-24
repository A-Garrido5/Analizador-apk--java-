// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.client.as;
import android.content.SharedPreferences$Editor;
import com.twitter.library.platform.PushService;
import android.accounts.Account;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import com.twitter.android.metrics.LaunchTracker;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.client.o;
import com.twitter.library.client.App;
import com.twitter.android.client.ce;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.library.client.ay;
import android.os.Handler;
import android.accounts.AccountManager;
import com.twitter.android.news.NewsActivity;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.highlights.StoriesActivity;
import com.twitter.android.lists.b;
import com.twitter.android.util.aj;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.android.highlights.e;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import com.twitter.library.service.ab;
import com.twitter.library.service.y;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.media.manager.q;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.android.util.d;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import java.util.Iterator;
import android.widget.ListView;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.widget.ConfirmRetryExpiredDraftsDialog;
import com.twitter.library.provider.f;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.platform.TwitterDataSyncService;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.os.Bundle;
import android.content.res.Resources;
import android.content.Context;
import java.util.HashMap;
import com.twitter.library.client.aa;
import com.twitter.android.trends.a;
import com.twitter.library.client.k;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.android.geo.c;
import com.twitter.android.client.x;
import com.twitter.library.service.z;
import com.twitter.internal.android.widget.DockLayout;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;
import com.twitter.library.client.bp;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import android.net.Uri;
import com.twitter.library.media.manager.m;
import com.twitter.library.featureswitch.n;
import com.twitter.library.client.bq;
import android.accounts.OnAccountsUpdateListener;

public class MainActivity extends ActivityWithProgress implements OnAccountsUpdateListener, bd, j, jg, jh, nc, tc, bq, n, m
{
    public static final Uri c;
    public static final Uri d;
    public static boolean e;
    private static final Map m;
    private static final Uri n;
    private static final ArrayList o;
    private static int p;
    private static int q;
    private boolean A;
    private boolean B;
    private int F;
    private boolean G;
    private String H;
    private boolean I;
    private boolean J;
    private ll K;
    private List L;
    private long M;
    private bp N;
    private jx O;
    private jx P;
    private Future Q;
    private Drawable R;
    private DockLayout S;
    private Runnable T;
    private z U;
    private lq V;
    private lp W;
    private x X;
    private c Y;
    private SharedPreferences$OnSharedPreferenceChangeListener Z;
    private boolean aa;
    private SubheaderView ab;
    fn f;
    li g;
    String h;
    int i;
    int j;
    ViewPager k;
    ln l;
    private final lg r;
    private final lh s;
    private long t;
    private i u;
    private SharedPreferences v;
    private k w;
    private a x;
    private SharedPreferences$OnSharedPreferenceChangeListener y;
    private aa z;
    
    static {
        c = Uri.parse("twitter://timeline/home");
        d = Uri.parse("twitter://discover");
        m = new HashMap();
        n = Uri.parse("twitter://activity");
        o = new ArrayList();
        MainActivity.p = 0;
        MainActivity.q = 0;
    }
    
    public MainActivity() {
        this.r = new lg(this);
        this.s = new lh(this, null);
        this.M = -1L;
    }
    
    public static int a(final Context context, final boolean b, final boolean b2, final boolean b3) {
        final Resources resources = context.getResources();
        int dimensionPixelSize;
        if (b) {
            dimensionPixelSize = resources.getDimensionPixelSize(2131558806);
        }
        else {
            dimensionPixelSize = 0;
        }
        if (b3) {
            int n;
            if (b2) {
                n = 2131558810;
            }
            else {
                n = 2131558809;
            }
            return resources.getDimensionPixelSize(n) - dimensionPixelSize;
        }
        return b(context) - dimensionPixelSize;
    }
    
    public static Bundle a(final Context context) {
        final Bundle bundle = new Bundle();
        bundle.putInt("shim_size", b(context));
        return bundle;
    }
    
    public static TaskStackBuilder a(final Context context, final String s) {
        final TaskStackBuilder create = TaskStackBuilder.create(context);
        create.addNextIntent(new Intent(context, (Class)MainActivity.class).putExtra("AbsFragmentActivity_account_name", s));
        return create;
    }
    
    public static void a(final Activity activity, final Uri uri) {
        final Intent addFlags = new Intent((Context)activity, (Class)MainActivity.class).addFlags(67108864);
        if (uri != null) {
            addFlags.putExtra("page", (Parcelable)uri);
        }
        if (activity instanceof TwitterFragmentActivity) {
            ((TwitterFragmentActivity)activity).d(addFlags);
        }
        else {
            activity.startActivity(addFlags);
        }
        activity.finish();
    }
    
    private void a(final Intent intent) {
        if ("twitter".equals(intent.getScheme())) {
            if ("timeline".equals(intent.getData().getHost())) {
                this.b_(MainActivity.c);
            }
            else {
                this.b_(MainActivity.c);
            }
        }
        else {
            final Uri uri = (Uri)intent.getParcelableExtra("page");
            if (uri == null) {
                this.b_(Uri.parse(this.v.getString("tag", MainActivity.c.toString())));
            }
            else {
                if (intent.hasExtra("ref_event")) {
                    this.l.a(this.k.getCurrentItem()).b.putString("ref_event", intent.getStringExtra("ref_event"));
                }
                this.b_(uri);
            }
        }
        this.I = intent.getBooleanExtra("focus_search_bar", false);
        this.J = intent.getBooleanExtra("scroll_to_top", false);
    }
    
    public static void a(final Intent intent, final Context context, final String s) {
        final TaskStackBuilder a = a(context, s);
        a.addNextIntent(intent);
        a.startActivities();
    }
    
    private void a(final Fragment fragment) {
        if (this.ab == null) {
            return;
        }
        if (fragment instanceof HomeTimelineFragment) {
            ((HomeTimelineFragment)fragment).X_();
            return;
        }
        this.ab.b();
    }
    
    private void a(final String s, final boolean b) {
        if (b) {
            this.h(s);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putBoolean("activity", false);
        TwitterDataSyncService.a((Context)this, bundle, this.U());
    }
    
    private void a(final jx jx, final int n) {
        jx.f(n);
        final CharSequence k = jx.k();
        final Resources resources = this.getResources();
        String s;
        if (n <= 0) {
            s = "";
        }
        else {
            s = resources.getQuantityString(2131427328, n, new Object[] { n });
        }
        if (!TextUtils.isEmpty(k)) {
            if (TextUtils.isEmpty((CharSequence)s)) {
                s = k.toString();
            }
            else {
                s = resources.getString(2131296287, new Object[] { k, s });
            }
        }
        jx.b(s);
    }
    
    private void a(final boolean b) {
        if (this.U().f() != null) {
            if (b) {
                this.r();
            }
            this.H().b((CharSequence)"");
        }
        this.n();
    }
    
    private void a(final Uri[] array) {
        if (array != null && array.length > 0) {
            final boolean empty = MainActivity.m.isEmpty();
            for (final Uri uri : array) {
                MainActivity.o.add(uri);
                final String b = bp.b(uri);
                if (empty && b != null) {
                    switch (b) {
                        case "discover": {
                            MainActivity.m.put("discover", new fc());
                            break;
                        }
                        case "activity": {
                            MainActivity.m.put("activity", new com.twitter.android.z());
                            break;
                        }
                    }
                }
            }
        }
    }
    
    private static int b(final Context context) {
        return context.getResources().getDimensionPixelSize(2131558806);
    }
    
    private void b(final int i) {
        if (this.i != i) {
            this.i = i;
            this.Q();
        }
    }
    
    private void b(final long n) {
        final li g = this.g;
        if (g.hasMessages(6)) {
            g.removeMessages(6);
        }
        g.sendMessageDelayed(g.obtainMessage(6), n);
    }
    
    private void c(final int j) {
        if (this.j != j) {
            this.j = j;
            this.Q();
        }
    }
    
    private void c(final long n) {
        this.g.a(n, this.V, li.a);
    }
    
    private boolean d(final Uri uri) {
        final gp gp = MainActivity.m.get(bp.b(uri));
        if (gp != null) {
            final gm a = gp.a((Context)this, uri);
            if (a != null) {
                this.L.add(a);
                this.K.notifyDataSetChanged();
                return true;
            }
        }
        return false;
    }
    
    private boolean g(final String s) {
        return "trends_plus_plus_enabled".equals(s);
    }
    
    private void h(final String s) {
        if (TwitterDataSyncService.a(this.getApplicationContext(), s)) {
            final Bundle bundle = new Bundle(5);
            bundle.putBoolean("activity", true);
            bundle.putBoolean("home", false);
            bundle.putBoolean("messages", false);
            bundle.putBoolean("show_notif", false);
            TwitterDataSyncService.a((Context)this, bundle, false, com.twitter.library.util.a.a((Context)this, s));
        }
    }
    
    private void l() {
        final Context applicationContext = this.getApplicationContext();
        final Session u = this.U();
        final List a = com.twitter.library.provider.f.a(applicationContext, u.g()).a();
        if (!a.isEmpty()) {
            ConfirmRetryExpiredDraftsDialog.a(this.getSupportFragmentManager(), applicationContext, u, a);
        }
    }
    
    private void m() {
        if (this.G().m()) {
            if (this.ab == null) {
                this.ab = (SubheaderView)this.findViewById(2131886918);
            }
            final TwitterListFragment f = this.f();
            final SubheaderView ab = this.ab;
            final com.twitter.android.client.c g = this.G();
            final long g2 = this.U().g();
            final k w = this.w;
            final boolean g3 = this.g(this.H);
            ListView y;
            if (f != null) {
                y = f.Y();
            }
            else {
                y = null;
            }
            ab.a(g, g2, w, this, g3, y);
        }
        else if (this.ab != null) {
            this.ab.b();
        }
    }
    
    private void n() {
        if (this.Q != null) {
            this.Q.cancel(false);
            this.Q = null;
        }
        this.R = null;
    }
    
    private void p() {
        this.a(true);
    }
    
    private void q() {
        this.L.clear();
        final Bundle bundle = new Bundle();
        bundle.putInt("type", 0);
        bundle.putInt("empty_title", 2131296940);
        bundle.putInt("empty_desc", 2131296941);
        bundle.putInt("shim_size", this.F);
        bundle.putBoolean("prompt_host", true);
        this.L.add(new go(MainActivity.c, HomeTimelineFragment.class).a(bundle).a((CharSequence)this.getString(2131298275)).a(2130839312).a("home").a());
        this.K.notifyDataSetChanged();
        final ArrayList a = this.N.a(MainActivity.o);
        final ArrayList list = new ArrayList<Uri>(a.size());
        for (final Uri uri : a) {
            if (!this.d(uri)) {
                list.add(uri);
            }
        }
        final Iterator<Uri> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            this.N.a(iterator2.next());
        }
    }
    
    private void r() {
        this.q();
        this.K.notifyDataSetChanged();
        this.k.setCurrentItem(0);
        this.l.d();
        this.v.edit().remove("tag").apply();
    }
    
    private void s() {
        this.getSupportLoaderManager().restartLoader(0, null, this.r);
        this.getSupportLoaderManager().restartLoader(1, null, this.s);
    }
    
    private void t() {
        this.P.b(com.twitter.android.util.d.a(this.U().f()));
    }
    
    private void u() {
        final TwitterUser f = this.U().f();
        if (f != null) {
            if (this.R != null) {
                this.O.a(this.R);
            }
            else if (this.Q == null) {
                this.Q = this.I().a((com.twitter.library.media.manager.k)UserImageRequest.a(f.profileImageUrl, -1).a(this));
            }
        }
    }
    
    private void w() {
        if (this.T == null) {
            this.T = new lf(this);
        }
        this.g.removeCallbacks(this.T);
        this.g.post(this.T);
    }
    
    private void x() {
        this.l.d();
        this.K.notifyDataSetChanged();
    }
    
    public int a() {
        boolean b = true;
        final boolean g = this.g(this.H);
        final boolean b2 = this.ab != null && this.ab.c() && b;
        if (this.ab == null || this.ab.getVisibility() != 0) {
            b = false;
        }
        return a((Context)this, g, b2, b);
    }
    
    protected int a(final ToolBar toolBar) {
        int n = 2;
        super.a(toolBar);
        final TwitterUser f = this.U().f();
        this.a(toolBar, this.U().g(), this.w);
        toolBar.a(2131887436).b(com.twitter.library.featureswitch.d.f("custom_timelines_list_entry_point_enabled"));
        final jx a = toolBar.a(2131887431);
        int n2;
        if (this.j == -100) {
            n2 = 3;
        }
        else {
            n2 = n;
        }
        a.e(n2);
        this.a(a, this.j);
        final jx a2 = toolBar.a(2131887432);
        if (f != null && f.verified) {
            n = 1;
        }
        a2.e(n);
        this.a(a2, this.i);
        this.t();
        final jx o = this.O;
        if (f != null) {
            if (TextUtils.isEmpty((CharSequence)f.name)) {
                o.a("@" + f.username);
            }
            else {
                o.a(f.name);
                o.c("@" + f.username);
            }
            o.g(2130837565);
            this.u();
            this.x.a("trendsplus_tooltip");
        }
        return 1;
    }
    
    public TwitterListFragment a(final gm gm) {
        if (gm == null) {
            return null;
        }
        return (TwitterListFragment)gm.a(this.getSupportFragmentManager());
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        if (bundle != null) {
            this.H = bundle.getString("state_main_nav_experiment");
        }
        if (CollectionUtils.a((Collection)MainActivity.o) && this.H == null) {
            this.H = com.twitter.library.experiments.a.a(true, (Context)this);
        }
        if (this.g(this.H)) {
            a.b(34);
        }
        else {
            a.b(2);
        }
        a.e(true);
        a.c(2130968866);
        return a;
    }
    
    public void a(final int n) {
        if (this.ab != null) {
            this.ab.a(n);
        }
    }
    
    public void a(final int n, final y y) {
        if (y.c.equals(ma.a)) {
            final ab p2 = y.P();
            final com.twitter.library.service.aa aa = (com.twitter.library.service.aa)y.l().b();
            if (p2.c == this.U().g() && aa.a()) {
                this.a(p2.e, false);
            }
        }
    }
    
    public void a(final long n) {
        this.runOnUiThread((Runnable)new ld(this));
    }
    
    void a(final Uri uri, final int n) {
        for (final gm gm : this.L) {
            if (uri.equals((Object)gm.c)) {
                gm.k += n;
                this.w();
                break;
            }
        }
    }
    
    void a(final Uri uri, final int k, final boolean j) {
        for (final gm gm : this.L) {
            if (uri.equals((Object)gm.c) && gm.k != k) {
                gm.k = k;
                gm.j = j;
                this.w();
                break;
            }
        }
    }
    
    public void a(final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView) {
        if (this.ab != null) {
            this.ab.a(pinnedHeaderRefreshableListView);
        }
    }
    
    public void a(final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView, final int n, final boolean b) {
        if (this.ab != null) {
            this.ab.a(pinnedHeaderRefreshableListView, n, b);
        }
    }
    
    void a(final ToolBar toolBar, final long n, final k k) {
        final boolean a = com.twitter.android.highlights.e.a(n, k);
        toolBar.a(2131887430).b(!a);
        toolBar.a(2131887438).b(a);
        final jx a2 = toolBar.a(2131887429);
        a2.b(a);
        toolBar.post((Runnable)new le(this, a2));
    }
    
    public void a(final p p) {
        final Bitmap bitmap = (Bitmap)p.c();
        Object r;
        if (bitmap != null) {
            r = new BitmapDrawable(this.getResources(), bitmap);
        }
        else {
            r = null;
        }
        this.R = (Drawable)r;
        this.O.a(this.R);
    }
    
    public void a(final String s) {
        final az t = this.T();
        t.c(t.b(s));
        this.h(s);
        cm.a();
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        final TwitterUser f = this.U().f();
        int n;
        if (f != null && f.verified) {
            n = 1;
        }
        else {
            n = 0;
        }
        jv.a(2131951635, toolBar);
        final jx a = toolBar.a(2131887432);
        int n2;
        if (n != 0) {
            n2 = 1;
        }
        else {
            n2 = 2;
        }
        a.e(n2);
        this.O = toolBar.a(2131887433);
        this.P = toolBar.a(2131887440);
        return true;
    }
    
    public boolean a(final jx jx) {
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887439: {
                this.startActivityForResult(new Intent((Context)this, (Class)AccountsDialogActivity.class).putExtra("page", (Parcelable)MainActivity.c).putExtra("AccountsDialogActivity_account_name", this.U().e()), 1);
                this.c("accounts_overflow_item");
                break;
            }
            case 2131887430:
            case 2131887438: {
                this.startActivityForResult(new Intent((Context)this, (Class)RootTabbedFindPeopleActivity.class), 2);
                final int a = jx.a();
                boolean b = false;
                if (a == 2131887438) {
                    b = true;
                }
                String s;
                if (b) {
                    s = "peopleplus_overflow_item";
                }
                else {
                    s = "peopleplus_menu_item";
                }
                this.c(s);
                break;
            }
            case 2131887433: {
                this.startActivity(new Intent((Context)this, (Class)ProfileActivity.class).putExtra("user_id", this.U().g()));
                this.c("me_overflow_item");
                break;
            }
            case 2131887432: {
                this.startActivity(aj.a((Context)this, this.U().f(), true, this.B));
                this.c("notifications_menu_item");
                break;
            }
            case 2131887431: {
                this.startActivity(new Intent((Context)this, (Class)RootDMActivity.class));
                this.c("messages_menu_item");
                break;
            }
            case 2131886126: {
                if (this.G) {
                    this.i();
                    this.c("home_menu_item");
                    break;
                }
                break;
            }
            case 2131887437: {
                this.startActivity(DraftsActivity.a((Context)this, true));
                this.c("drafts_overflow_item");
                break;
            }
            case 2131887435: {
                this.startActivity(new b(this.U().g()).a((Context)this));
                this.c("lists_overflow_item");
                break;
            }
            case 2131887436: {
                this.startActivity(new Intent((Context)this, (Class)ProfileCollectionsListActivity.class).putExtra("user_id", this.U().g()));
                this.c("collections_overflow_item");
                break;
            }
            case 2131887429: {
                this.startActivity(StoriesActivity.a((Context)this, false, null, 0, null, null));
                this.c("highlights_menu_item");
                break;
            }
            case 2131887440: {
                this.startActivity(AdsCompanionWebViewActivity.a((Context)this));
                break;
            }
            case 2131887434: {
                this.startActivity(new Intent((Context)this, (Class)NewsActivity.class));
                break;
            }
            case 2131886226: {
                super.a(jx);
                this.c("settings_overflow_item");
                break;
            }
            case 2131887418: {
                super.a(jx);
                this.c("search_menu_item");
                break;
            }
        }
        return true;
    }
    
    public int ab_() {
        final gm b = this.l.b(MainActivity.c);
        if (b != null) {
            return b.k;
        }
        return 0;
    }
    
    public String b() {
        final TwitterListFragment f = this.f();
        if (f instanceof bd) {
            return ((bd)f).b();
        }
        return null;
    }
    
    public void b(final Uri uri) {
        this.C();
        final String h = this.h;
        this.X.a(h, 127);
        if (MainActivity.c.equals((Object)uri)) {
            this.X.b(h, 1);
        }
        final ln l = this.l;
        this.setTitle(l.getPageTitle(l.a(uri)));
        this.H().a(l.e());
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final com.twitter.android.client.c g = this.G();
        final Resources resources = this.getResources();
        if (MainActivity.o.isEmpty() && !"trends_plus_plus_enabled".equals(this.H)) {
            this.a(new Uri[] { MainActivity.d, MainActivity.n });
        }
        if (this.g(this.H)) {
            this.F = 0;
            this.G = true;
        }
        else {
            this.F = b((Context)this);
            this.G = false;
        }
        this.c((Intent)null);
        (this.N = bp.a((Context)this)).a(this);
        this.X = com.twitter.android.client.x.a((Context)this);
        this.g = new li(this.getApplicationContext());
        this.V = new lq(this.g);
        g.c((Context)this);
        (this.k = (ViewPager)this.findViewById(2131886367)).setPageMargin(resources.getDimensionPixelSize(2131558733));
        this.k.setPageMarginDrawable(2131689603);
        this.k.setOffscreenPageLimit(3);
        this.S = (DockLayout)this.findViewById(2131886401);
        if (this.S != null) {
            this.f = new fn(this.S);
            this.S.a(new nd(this));
        }
        this.u = new i((Context)this, this.findViewById(2131886916), this);
        this.v = this.getPreferences(0);
        MainActivity.q = this.v.getInt("version_code", 0);
        AccountManager.get((Context)this).addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, true);
        this.A = true;
        g.a(this.z = new lj(this));
        this.W = new lp(this);
        this.T().a(this.W);
        this.a(this.U = new lk(this));
        this.L = new ArrayList();
        this.K = new ll(this.L);
        this.y = (SharedPreferences$OnSharedPreferenceChangeListener)new la(this);
        this.b(this.U().e());
        this.x = new a((Context)this, this.U().f(), this.getSupportFragmentManager());
        if (bundle == null) {
            final y f = g.f();
            if (f != null) {
                this.a(f);
            }
        }
        this.aa = false;
        this.q();
        final HorizontalListView horizontalListView = (HorizontalListView)this.findViewById(2131886733);
        this.l = new ln(this, this, this.L, this.k, horizontalListView, this.K, this.S);
        this.k.setAdapter(this.l);
        this.a(false);
        horizontalListView.setAdapter((ListAdapter)this.K);
        horizontalListView.setOnItemClickListener((AdapterView$OnItemClickListener)new lb(this));
        if (this.g(this.H)) {
            horizontalListView.setVisibility(8);
        }
        this.m();
        this.a(this.getIntent());
        this.h();
        this.g();
        if (bundle == null) {
            ce.a((Context)this).a((int[])null);
            if (App.b()) {
                com.twitter.android.client.o.a(this.getApplicationContext());
            }
        }
        final Context applicationContext = this.getApplicationContext();
        if (com.twitter.util.a.a() && bundle == null) {
            ScribeService.a(applicationContext, new TwitterScribeLog(this.U().g()).b(new String[] { "app::::explorebytouch_enabled" }));
        }
        if (jt.c(this)) {
            this.b_(MainActivity.c);
        }
        this.Y = new c(this, "main_activity_location_dialog", null);
        this.Z = (SharedPreferences$OnSharedPreferenceChangeListener)new lc(this);
        this.b.registerOnSharedPreferenceChangeListener(this.Z);
    }
    
    protected void b(final String h) {
        if (this.w != null && this.y != null) {
            this.w.unregisterOnSharedPreferenceChangeListener(this.y);
        }
        this.h = h;
        final k w = new k((Context)this, h);
        this.B = w.getBoolean("connect_tab", false);
        w.registerOnSharedPreferenceChangeListener(this.y);
        this.w = w;
    }
    
    void b_(final Uri uri) {
        final int a = this.l.a(uri);
        if (a != -1) {
            LaunchTracker.a().a(uri);
            this.b(uri);
            this.k.setCurrentItem(a);
        }
    }
    
    public void c(final Uri uri) {
        final gm a = this.K.a(uri);
        if (a == null || !a.l) {
            return;
        }
        this.L.remove(a);
        this.x();
    }
    
    protected void c(final String s) {
        this.G().a(this.U().g(), "home", "navigation_bar", "", s, "click");
    }
    
    public void d(final String s) {
        am.a((Context)this, null, s, this.U().g(), null, null, null);
    }
    
    protected void e() {
        final TwitterListFragment f = this.f();
        if (f != null) {
            if (!this.aa) {
                f.ab();
                return;
            }
            f.W();
            this.aa = false;
        }
    }
    
    public TwitterListFragment f() {
        return this.a(this.l.a(this.k.getCurrentItem()));
    }
    
    protected void f_() {
        final TwitterListFragment f = this.f();
        if (f != null) {
            f.X();
        }
    }
    
    void g() {
        final k k = new k((Context)this, this.U().e(), "hometab");
        final li g = this.g;
        if (k.getLong("ft", 0L) == 0L) {
            if (g.hasMessages(1)) {
                g.removeMessages(1);
            }
            g.sendMessageDelayed(g.obtainMessage(1), 60000L);
        }
        this.c(30000L);
        this.b(15000L);
    }
    
    void h() {
        this.c(0);
        this.b(0);
        final Iterator<gm> iterator = this.L.iterator();
        while (iterator.hasNext()) {
            iterator.next().k = 0;
        }
        this.w();
        this.s();
    }
    
    public void i() {
        final TwitterListFragment f = this.f();
        if (f != null) {
            f.ay();
        }
    }
    
    public AbsPagesAdapter j() {
        return this.l;
    }
    
    public void k() {
        if (this.ab != null) {
            final int a = this.a();
            final TwitterListFragment a2 = this.a(this.l.b(MainActivity.c));
            if (a2 != null) {
                a2.n(a);
            }
        }
    }
    
    public void onAccountsUpdated(final Account[] array) {
        final int length = array.length;
        int i = 0;
        int n = 0;
        int n2 = 0;
        Account account = null;
        while (i < length) {
            final Account account2 = array[i];
            if (com.twitter.library.util.a.a.equals(account2.type)) {
                ++n2;
                if (account == null) {
                    account = account2;
                }
                if (n == 0 && account2.name.equals(this.h)) {
                    n = 1;
                }
            }
            ++i;
        }
        if (n == 0 && n2 > 0) {
            this.h = null;
            this.p();
        }
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                super.onActivityResult(n, n2, intent);
                break;
            }
            case 1: {
                if (n2 != 1) {
                    break;
                }
                final Account a = ((UserAccount)intent.getParcelableExtra("account")).a;
                if (this.h != null && !this.h.equals(a.name)) {
                    this.u.a(a);
                    return;
                }
                break;
            }
            case 2: {
                this.g.a(0L, 0, this.V, 2);
            }
        }
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getWindow().setFormat(1);
    }
    
    public void onContentChanged() {
        super.onContentChanged();
        this.k = (ViewPager)this.findViewById(2131886367);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        PushService.f((Context)this);
        this.T().b(this.W);
        final aa z = this.z;
        if (z != null) {
            this.G().b(z);
        }
        this.b(this.U);
        if (this.A) {
            AccountManager.get((Context)this).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
        }
        if (this.y != null) {
            this.w.unregisterOnSharedPreferenceChangeListener(this.y);
        }
        if (this.N != null) {
            this.N.b(this);
        }
        this.n();
        if (this.Z != null) {
            this.b.unregisterOnSharedPreferenceChangeListener(this.Z);
            this.Z = null;
        }
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.a(intent);
    }
    
    protected void onPause() {
        super.onPause();
        com.twitter.library.featureswitch.d.b(this);
        this.X.a(this.U().e(), 127);
        final SharedPreferences$Editor edit = this.v.edit();
        edit.putInt("ver", 5);
        edit.putInt("version_code", MainActivity.q);
        final Uri c = this.l.c();
        String string;
        if (c != null) {
            string = c.toString();
        }
        else {
            string = null;
        }
        edit.putString("tag", string);
        edit.putLong("st", this.t);
        edit.apply();
        this.aa = true;
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final Uri uri = (Uri)bundle.getParcelable("currentTab");
        if (uri != null) {
            this.b_(uri);
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        final com.twitter.android.client.c g = this.G();
        com.twitter.library.featureswitch.d.a(this);
        final az t = this.T();
        if (this.h == null) {
            t.d(t.b().e());
        }
        if (MainActivity.e) {
            MainActivity.e = false;
            this.Q();
        }
    Label_0200_Outer:
        while (true) {
            com.twitter.library.featureswitch.d.a(this.getApplicationContext(), t.b().g());
            final PackageManager packageManager = this.getPackageManager();
            while (true) {
                int int1 = 0;
                Label_0440: {
                Label_0434:
                    while (true) {
                        try {
                            final int versionCode = packageManager.getPackageInfo(this.getPackageName(), 0).versionCode;
                            if (MainActivity.q == 0 && g.i() == 0L) {
                                this.X.d();
                            }
                            else if (versionCode > MainActivity.q && System.currentTimeMillis() > 1000L * com.twitter.library.featureswitch.d.a("legacy_deciders_find_friends_interval_sec", 15552000) + g.i()) {
                                this.X.d();
                            }
                            MainActivity.q = versionCode;
                            final int p = MainActivity.p;
                            int n = 0;
                            if (p == 0) {
                                int1 = this.v.getInt("ver", 0);
                                if (int1 != 0) {
                                    break Label_0440;
                                }
                                final boolean c = this.J().c();
                                n = 0;
                                if (c) {
                                    if (!App.f()) {
                                        break Label_0434;
                                    }
                                    final boolean boolean1 = this.getSharedPreferences("debug_prefs", 0).getBoolean("suppress_location_dialogs", false);
                                    n = 0;
                                    if (!boolean1) {
                                        n = 1;
                                    }
                                }
                                MainActivity.p = 5;
                            }
                            if (n != 0) {
                                this.Y.a(5);
                            }
                            final SharedPreferences v = this.v;
                            final long currentTimeMillis = System.currentTimeMillis();
                            this.t = v.getLong("st", 0L);
                            final Session b = t.b();
                            if (b.j() == null || 3600000L + this.t < currentTimeMillis) {
                                g.h();
                                as.a((Context)this).a(com.twitter.library.api.account.ab.a((Context)this, b), (z)null);
                                this.t = currentTimeMillis;
                            }
                            this.h(b.e());
                            this.m();
                            final Context applicationContext = this.getApplicationContext();
                            com.twitter.android.vineloops.i.a(applicationContext, as.a(applicationContext)).a();
                            com.twitter.library.client.y.a().a(new com.twitter.library.client.z(applicationContext));
                            if (this.I) {
                                this.D();
                                this.I = false;
                            }
                            if (this.J) {
                                this.i();
                                this.J = false;
                            }
                            this.l();
                            return;
                        }
                        catch (PackageManager$NameNotFoundException ex) {
                            continue Label_0200_Outer;
                        }
                        break;
                    }
                    int n = 1;
                    continue;
                }
                if (int1 != 1) {
                    final int n = 0;
                    if (int1 != 2) {
                        continue;
                    }
                }
                final boolean boolean2 = this.getSharedPreferences("discover_prefs", 0).getBoolean("suppress_location_dialogs", false);
                int n = 0;
                if (boolean2) {
                    continue;
                }
                final boolean c2 = this.J().c();
                n = 0;
                if (c2) {
                    n = 1;
                    continue;
                }
                continue;
            }
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Uri c = this.l.c();
        if (c != null) {
            bundle.putParcelable("currentTab", (Parcelable)c);
        }
        bundle.putString("state_main_nav_experiment", this.H);
    }
    
    public boolean onSearchRequested() {
        this.c(0L);
        return super.onSearchRequested();
    }
    
    protected void onStart() {
        super.onStart();
        this.s();
        com.twitter.android.metrics.a.a(this.F(), this.U().g()).j();
        if (PushService.c((Context)this)) {
            final String f = com.google.android.gcm.b.f((Context)this);
            if (TextUtils.isEmpty((CharSequence)f)) {
                PushService.e((Context)this);
            }
            else if (PushService.f((Context)this, this.h)) {
                final com.twitter.library.api.account.aa aa = (com.twitter.library.api.account.aa)new com.twitter.library.api.account.aa((Context)this, this.U()).c(1);
                aa.a = f;
                this.a(aa);
            }
        }
        if (!this.b.getBoolean("has_completed_signin_flow", false)) {
            this.b.edit().putBoolean("has_completed_signin_flow", true).apply();
        }
    }
    
    public boolean v() {
        return true;
    }
}
