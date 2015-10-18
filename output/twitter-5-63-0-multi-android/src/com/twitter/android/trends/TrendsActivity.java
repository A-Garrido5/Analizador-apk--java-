// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.library.service.z;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.HorizontalListView;
import java.util.List;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import android.content.Context;
import android.content.Intent;
import android.content.DialogInterface;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import android.content.SharedPreferences$Editor;
import com.twitter.library.client.Session;
import android.text.TextUtils;
import com.twitter.library.api.UserSettings;
import android.os.Bundle;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.DockLayout;
import com.twitter.android.mn;
import android.support.v4.view.ViewPager;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.net.Uri;
import com.twitter.ui.dialog.e;
import com.twitter.android.client.TwitterFragmentActivity;

public class TrendsActivity extends TwitterFragmentActivity implements e
{
    private static final Uri a;
    private static final Uri b;
    private final d c;
    private SharedPreferences d;
    private ArrayList e;
    private ViewPager f;
    private com.twitter.android.trends.e g;
    private mn h;
    private DockLayout i;
    private boolean j;
    
    static {
        a = Uri.parse("twitter://trends/list");
        b = Uri.parse("twitter://trends/details");
    }
    
    public TrendsActivity() {
        this.c = new d(this, null);
    }
    
    private gm a(final Uri uri, final boolean b) {
        final go go = new go(uri, TrendsFragment.class);
        final Bundle a = TwitterListFragment.a(this.getIntent(), false);
        a.putBoolean("is_collapsed", b);
        String s;
        if (b) {
            s = "list_view";
        }
        else {
            s = "detail_view";
        }
        a.putString("scribe_section", s);
        a.putBoolean("orientation_shim", true);
        if (this.getIntent().getBooleanExtra("needs_refresh", false)) {
            a.putBoolean("needs_refresh", true);
        }
        go.a(a);
        go.a(s);
        int n;
        if (b) {
            n = 2131297964;
        }
        else {
            n = 2131297963;
        }
        go.a((CharSequence)this.getString(n));
        return go.a();
    }
    
    private void a(final UserSettings userSettings) {
        if (userSettings != null && !userSettings.s && !TextUtils.isEmpty((CharSequence)userSettings.b)) {
            this.b(userSettings.b);
            return;
        }
        this.b((CharSequence)null);
    }
    
    private ArrayList j() {
        final ArrayList<gm> list = new ArrayList<gm>(2);
        if (!this.j) {
            list.add(this.a(TrendsActivity.b, false));
        }
        list.add(this.a(TrendsActivity.a, true));
        return list;
    }
    
    private void k() {
        final int int1 = this.d.getInt("scope_option", 0);
        int currentItem = 0;
        switch (int1) {
            case 1: {
                final int size = this.e.size();
                currentItem = 0;
                if (size != 1) {
                    currentItem = 1;
                    break;
                }
                break;
            }
        }
        this.f.setCurrentItem(currentItem);
    }
    
    private void l() {
        int n = 1;
        if (this.e.size() > n && this.f.getCurrentItem() == 0) {
            n = 0;
        }
        final SharedPreferences$Editor edit = this.d.edit();
        edit.putInt("scope_option", n);
        edit.apply();
    }
    
    @Override
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        final Session u = this.U();
        if (u.d()) {
            final UserSettings j = u.j();
            toolBar.a(2131887479).b(j != null && !j.s);
        }
        final jx a = toolBar.a(2131887418);
        if (a != null) {
            a.b(false);
        }
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969142);
        bn.e(true);
        return bn;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 1 && n2 == -1) {
            this.startActivityForResult(new Intent((Context)this, (Class)TrendsLocationsActivity.class), 1);
        }
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        if (this.U().d()) {
            jv.a(2131951659, toolBar);
        }
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887479) {
            final Session u = this.U();
            final UserSettings j = u.j();
            if (j != null) {
                j.s = true;
                this.a(ab.a((Context)this, u, j, true, null));
            }
            jx.b(false);
            return true;
        }
        if (a == 2131887478) {
            final UserSettings i = this.U().j();
            if (i != null && i.s) {
                ((PromptDialogFragment)PromptDialogFragment.b(1).c(2131297956).d(2131297955).h(2131297954).a(this)).a(this.getSupportFragmentManager());
            }
            else {
                this.startActivityForResult(new Intent((Context)this, (Class)TrendsLocationsActivity.class), 1);
            }
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131297966);
        this.d = this.getPreferences(0);
        this.j = (this.getResources().getConfiguration().orientation == 2);
        this.e = this.j();
        this.h = new mn(this.e);
        final HorizontalListView horizontalListView = (HorizontalListView)this.findViewById(2131886733);
        (this.f = (ViewPager)this.findViewById(2131886367)).setPageMarginDrawable(2131689603);
        this.g = new com.twitter.android.trends.e(this, this, this.e, this.f, horizontalListView, this.h);
        this.f.setAdapter(this.g);
        this.i = (DockLayout)this.findViewById(2131886401);
        if (!this.j) {
            horizontalListView.setVisibility(0);
            this.i.b();
        }
        else {
            horizontalListView.setVisibility(8);
            this.i.c();
        }
        horizontalListView.setAdapter((ListAdapter)this.h);
        horizontalListView.setOnItemClickListener((AdapterView$OnItemClickListener)new c(this));
        this.a(this.U().j());
    }
    
    @Override
    protected void f_() {
        final TwitterListFragment i = this.i();
        if (i != null) {
            i.X();
        }
    }
    
    public void h() {
        final TwitterListFragment i = this.i();
        if (i != null) {
            i.ay();
        }
    }
    
    public TwitterListFragment i() {
        return (TwitterListFragment)this.g.a(this.f.getCurrentItem()).a(this.getSupportFragmentManager());
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n2 == -1 && n == 1 && intent != null && intent.hasExtra("woeid")) {
            final long longExtra = intent.getLongExtra("woeid", 1L);
            final Session u = this.U();
            final UserSettings j = u.j();
            if (j != null && (j.s || j.a != longExtra)) {
                j.s = false;
                j.a = longExtra;
                j.b = intent.getStringExtra("loc_name");
                this.a(ab.a((Context)this, u, j, true, null));
                this.Q();
            }
        }
    }
    
    @Override
    protected void onPause() {
        this.b(this.c);
        super.onPause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        this.a(this.c);
        this.k();
    }
    
    @Override
    protected Intent q_() {
        final Intent intent = this.getIntent();
        intent.putExtra("from_up_navigation", true);
        return intent;
    }
}
