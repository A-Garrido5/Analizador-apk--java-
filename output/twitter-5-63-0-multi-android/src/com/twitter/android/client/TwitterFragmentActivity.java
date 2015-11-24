// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.trends.TrendsPlusActivity;
import java.util.Iterator;
import com.twitter.library.metrics.f;
import android.view.KeyEvent;
import android.content.res.Configuration;
import com.twitter.android.composer.au;
import com.twitter.android.DraftsActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.kz;
import com.twitter.util.concurrent.h;
import com.twitter.util.concurrent.e;
import com.twitter.android.az;
import com.twitter.android.kg;
import com.twitter.android.SettingsActivity;
import com.twitter.library.network.g;
import com.twitter.library.client.App;
import com.twitter.library.client.r;
import com.twitter.library.client.aa;
import com.twitter.android.composer.at;
import com.twitter.library.client.d;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.MainActivity;
import android.net.Uri;
import com.twitter.android.widget.cs;
import com.twitter.android.widget.bf;
import com.twitter.internal.android.widget.DockLayout;
import com.twitter.android.widget.bg;
import android.view.View;
import android.app.Activity;
import com.twitter.android.DispatchActivity;
import android.content.Context;
import com.twitter.library.media.manager.q;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import android.os.Bundle;
import com.twitter.android.client.notifications.StatusBarNotif;
import com.twitter.library.util.bq;
import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.android.widget.bc;
import com.twitter.android.av.audio.i;
import java.util.ArrayList;
import com.twitter.android.composer.FloatingActionButtonLayout;
import com.twitter.android.composer.ComposerDockLayout;
import com.twitter.library.client.s;
import com.twitter.android.ju;
import com.twitter.library.client.AbsFragmentActivity;

public class TwitterFragmentActivity extends AbsFragmentActivity implements ju, s
{
    protected ComposerDockLayout C;
    protected FloatingActionButtonLayout D;
    protected boolean E;
    private final a a;
    private final ArrayList b;
    private c c;
    private sp d;
    private SearchSuggestionController e;
    private bn f;
    private CharSequence g;
    private i h;
    private boolean i;
    private bc j;
    private boolean k;
    
    public TwitterFragmentActivity() {
        this.a = new a();
        this.b = new ArrayList();
        this.g = "";
    }
    
    private void a(final Intent intent) {
        final Bundle a = bq.a(intent);
        if (a != null) {
            if (a.getParcelable("sb_notification") != null) {
                NotificationService.a(this.getApplicationContext(), a);
            }
            this.k = a.getBoolean("extra_up_as_back", false);
            intent.removeExtra("sb_account_name");
            intent.removeExtra("sb_notification");
            intent.removeExtra("notif_scribe_log");
            intent.removeExtra("notif_scribe_log_for_preview_experiment");
            intent.removeExtra("notif_scribe_log_from_background");
        }
    }
    
    private void j() {
        final ToolBar m = this.M();
        if (m != null) {
            CharSequence titleDescription = this.getTitle();
            if (!TextUtils.isEmpty(titleDescription) && !TextUtils.isEmpty(this.g)) {
                titleDescription = this.getString(2131296429, new Object[] { titleDescription, this.g });
            }
            else if (TextUtils.isEmpty(titleDescription)) {
                if (!TextUtils.isEmpty(this.g)) {
                    titleDescription = this.g;
                }
                else {
                    titleDescription = "";
                }
            }
            m.setTitleDescription(titleDescription);
        }
    }
    
    protected void B() {
        if (fg.a()) {
            final int b = fg.b();
            if (b != 0) {
                this.getTheme().applyStyle(b, true);
            }
        }
    }
    
    protected final boolean C() {
        return this.e.c();
    }
    
    protected final boolean D() {
        return this.e.e();
    }
    
    public CharSequence E() {
        return this.g;
    }
    
    protected ir F() {
        return ir.b();
    }
    
    protected c G() {
        return this.c;
    }
    
    protected SearchSuggestionController H() {
        return this.e;
    }
    
    protected q I() {
        return q.a((Context)this);
    }
    
    protected sp J() {
        return this.d;
    }
    
    public bn K() {
        if (this.f == null) {
            throw new IllegalStateException("ToolBarOptions have not been configured");
        }
        return this.f;
    }
    
    public i L() {
        return this.h;
    }
    
    @Override
    protected void S_() {
        DispatchActivity.a(this, this.getIntent());
    }
    
    public View a(final View view) {
        return view.findViewById(2131886401);
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        this.B();
        return bn;
    }
    
    public bc a(final Context context, final bg bg, final View view) {
        final DockLayout dockLayout = (DockLayout)view.findViewById(2131886401);
        View bottomDockView;
        if (dockLayout == null) {
            bottomDockView = null;
        }
        else {
            bottomDockView = dockLayout.getBottomDockView();
        }
        if (bottomDockView != null && bottomDockView.getVisibility() == 0) {
            final bf bf = new bf(bg, context);
            bf.a(dockLayout);
            bg.a(bf);
            bf.a(this.a(view));
            return bf;
        }
        final cs cs = new cs(bg, context);
        bg.a(cs);
        cs.a(this.a(view));
        return cs;
    }
    
    protected void a(final Uri uri) {
        if (this.k) {
            this.onBackPressed();
            return;
        }
        final Intent w = this.W();
        if (w != null) {
            this.a(this, w);
            return;
        }
        final Activity parent = this.getParent();
        final Activity activity;
        if (parent != null) {
            activity = parent;
        }
        MainActivity.a(activity, uri);
    }
    
    public void a(final Bundle bundle, final Intent intent) {
        boolean i = false;
        if (bundle != null) {
            final boolean boolean1 = bundle.getBoolean("is_tracked", false);
            i = false;
            if (boolean1) {
                i = true;
            }
        }
        this.i = i;
        if (!this.i && intent.getData() != null) {
            AppEventTrack.a(this.getApplicationContext(), com.twitter.library.util.bn.b(intent.getData()));
            this.i = true;
        }
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        final Intent intent = this.getIntent();
        this.a(bundle, intent);
        this.a(intent);
        this.b(bundle, this.f);
        this.h = new i(this);
        if (bg.b() && !this.f.a()) {
            bg.a().a(2);
        }
        final View viewById = this.findViewById(2131886401);
        if (viewById instanceof ComposerDockLayout) {
            final ComposerDockLayout c = (ComposerDockLayout)viewById;
            c.setFabLayout(this.D = (FloatingActionButtonLayout)this.findViewById(2131886398));
            this.E = (this.f.f == 2 || this.f.f == 3 || this.f.f == 4);
            if (this.E) {
                if (this.f.f == 3) {
                    c.setBottomLocked(true);
                }
                if (this.f.f == 4) {
                    c.setLoggedOutMode(true);
                    c.a(this);
                }
                else {
                    c.setComposerHintText(this.c());
                    c.setComposerDockListener(new bk(this));
                }
            }
            else {
                c.setBottomVisible(false);
            }
            this.C = c;
        }
        bh.a((Context)this).b();
    }
    
    @Deprecated
    protected void a(final aa aa) {
        this.b.add(aa);
    }
    
    @Override
    public void a(final r r) {
        this.a.a(r);
    }
    
    public void a(final CharSequence g, final boolean b) {
        this.M().b(g, b);
        this.g = g;
        this.j();
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        if (this.f.d) {
            jv.a(2131951629, toolBar);
            this.e.a(toolBar);
            final jx a = toolBar.a(2131887417);
            if (a != null) {
                final View d = a.d();
                if (d != null) {
                    d.setContentDescription((CharSequence)this.getString(2131296414));
                }
                if (this.f.f != 1) {
                    a.b(false);
                }
            }
        }
        if (App.e()) {
            jv.a(2131951619, toolBar);
        }
        else if (com.twitter.library.network.g.b()) {
            jv.a(2131951644, toolBar);
        }
        if (this.f.e && this.U().d()) {
            jv.a(2131951652, toolBar);
        }
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131886226: {
                this.startActivity(new Intent((Context)this, (Class)SettingsActivity.class));
                return true;
            }
            case 2131886126: {
                if (kg.a((Context)this)) {
                    this.finish();
                    return true;
                }
                return super.a(jx);
            }
            case 2131887418: {
                return this.onSearchRequested();
            }
            case 2131887403: {
                final az a = az.a((Context)this);
                a.a(this.getResources().getString(2131298177), a.a(), "Thanks for filing a bug!\n\n" + "Summary: \n\n" + "Steps to reproduce: \n\n" + "Expected results: \n\n" + "Actual results: \n\n" + a.c()).a(new e().a(com.twitter.util.concurrent.h.b).a(new bm(this)));
                return true;
            }
            case 2131887457: {
                com.twitter.library.network.g.a(this.getApplicationContext(), false);
                return true;
            }
            case 2131887417: {
                this.h(1);
                return true;
            }
        }
    }
    
    public void b(final Bundle bundle, final bn bn) {
    }
    
    @Override
    public void b(final r r) {
        this.a.b(r);
    }
    
    public void b(final CharSequence charSequence) {
        this.M().setSubtitle(charSequence);
        this.g = charSequence;
        this.j();
    }
    
    @Override
    public final d c(final Bundle bundle) {
        (this.c = com.twitter.android.client.c.a((Context)this)).c((Context)this);
        this.d = sp.a((Context)this);
        this.a(new kz((Context)this));
        (this.e = new SearchSuggestionController(this, Integer.MIN_VALUE)).a(bundle);
        this.e.a(new bl(this));
        final boolean a = com.twitter.library.featureswitch.d.a("android_entrypoints_2_2997", "single_entrypoint_fab", "split_fab", "split_fab_w_drafts");
        final bn bn = new bn();
        if (!a && this.getResources().getConfiguration().orientation == 2) {
            bn.a(1);
        }
        else if (com.twitter.util.a.a()) {
            bn.a(3);
        }
        else {
            bn.a(2);
        }
        bn.c(2130968775);
        bn.c(true);
        return this.f = this.a(bundle, bn);
    }
    
    protected String c() {
        return this.getString(2131296702);
    }
    
    public void d(final boolean bottomVisible) {
        if (this.C != null && this.E) {
            this.C.setBottomVisible(bottomVisible);
        }
    }
    
    protected void e() {
        final Fragment fragmentById = this.getSupportFragmentManager().findFragmentById(2131886241);
        if (fragmentById != null && fragmentById instanceof TwitterListFragment) {
            ((TwitterListFragment)fragmentById).W();
        }
    }
    
    public void e(final String composerHintText) {
        if (this.C != null) {
            this.C.setComposerHintText(composerHintText);
        }
    }
    
    protected void f_() {
        final Fragment fragmentById = this.getSupportFragmentManager().findFragmentById(2131886241);
        if (fragmentById != null && fragmentById instanceof TwitterListFragment) {
            ((TwitterListFragment)fragmentById).X();
        }
    }
    
    public void finish() {
        if (bg.b()) {
            bg.a().a(this);
        }
        super.finish();
    }
    
    @Override
    protected void g_() {
        this.a((Uri)null);
    }
    
    void h(final int n) {
        if (n == 4) {
            this.startActivity(DraftsActivity.a((Context)this, true));
            return;
        }
        com.twitter.android.composer.au.a((Context)this).a(n).a(this.l_(), this.u_()).b((Context)this);
    }
    
    public void i(final int n) {
        this.b(this.getString(n));
    }
    
    protected String l_() {
        return null;
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        this.a.a(n, n2, intent);
        super.onActivityResult(n, n2, intent);
    }
    
    @Override
    public void onBackPressed() {
        if (this.e.c()) {
            return;
        }
        if (this.D != null && this.D.a()) {
            this.D.b();
            return;
        }
        super.onBackPressed();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.a(configuration);
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        this.c = com.twitter.android.client.c.a((Context)this);
        super.onCreate(bundle);
    }
    
    @Override
    protected void onDestroy() {
        this.a.b(this.isChangingConfigurations());
        super.onDestroy();
        if (App.c()) {
            az.b((Context)this);
        }
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (!this.P() || n != 82 || this.e.b() || !this.O()) {
            final boolean onKeyUp = super.onKeyUp(n, keyEvent);
            final boolean b = false;
            if (!onKeyUp) {
                return b;
            }
        }
        return true;
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.a(intent);
    }
    
    @Override
    protected void onPause() {
        this.C();
        final Iterator<aa> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            this.c.b(iterator.next());
        }
        this.d.d();
        this.f_();
        if (this.j != null) {
            this.j.b();
        }
        com.twitter.library.metrics.f.a().b();
        super.onPause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a.b();
        final Iterator<aa> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            this.c.a(iterator.next());
        }
        this.d.e();
        this.e();
        if (bg.b() && this.f.a()) {
            final bg a = bg.a();
            this.a(a);
            View decorView;
            if (this.getWindow() != null) {
                decorView = this.getWindow().getDecorView();
            }
            else {
                decorView = null;
            }
            if (decorView != null) {
                this.j = this.a(this.getApplicationContext(), a, decorView);
            }
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.a(bundle);
        this.e.b(bundle);
        bundle.putBoolean("is_tracked", this.i);
    }
    
    public boolean onSearchRequested() {
        if ("trends_plus_plus_enabled".equals(com.twitter.library.experiments.a.a(true, (Context)this))) {
            this.startActivity(new Intent((Context)this, (Class)TrendsPlusActivity.class).putExtra("type", 28).putExtra("timeline_tag", "TRENDSPLUS").putExtra("scribe_section", "search").putExtra("scribe_page", "trendsplus"));
            this.G().a(this.U().g(), "trendsplus::::search_icon_launch");
            return true;
        }
        return this.e.e();
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        this.a.a();
    }
    
    @Override
    protected void onStop() {
        this.a.a(this.isChangingConfigurations());
        super.onStop();
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.j();
    }
    
    public void startActivity(final Intent intent, final Bundle bundle) {
        if (this.h != null) {
            this.h.a(intent);
        }
        super.startActivity(intent, bundle);
    }
    
    protected int[] u_() {
        return null;
    }
    
    @Override
    public boolean v() {
        return true;
    }
}
