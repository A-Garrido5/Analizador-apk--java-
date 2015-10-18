// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.widget.AdapterView;
import java.util.Arrays;
import com.twitter.android.client.TwitterListFragment;
import java.util.List;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.f;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.android.util.v;
import android.content.Context;
import android.support.v4.app.Fragment;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import com.twitter.android.client.bn;
import android.content.Intent;
import android.os.Bundle;
import com.twitter.library.client.k;
import android.support.v4.view.ViewPager;
import android.net.Uri;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class TabbedVitFollowersActivity extends TwitterFragmentActivity implements AdapterView$OnItemClickListener, nc
{
    public static final Uri a;
    public static final Uri b;
    private mn c;
    private ViewPager d;
    private fo e;
    private k f;
    
    static {
        a = Uri.parse("twitter://followers/all");
        b = Uri.parse("twitter://followers/verified");
    }
    
    private gm a(final Uri uri, final int n) {
        int n2;
        int n3;
        if (TabbedVitFollowersActivity.a.equals((Object)uri)) {
            n2 = 2131297026;
            n3 = 1;
        }
        else {
            if (!TabbedVitFollowersActivity.b.equals((Object)uri)) {
                throw new IllegalArgumentException("Invalid page");
            }
            n2 = 2131297025;
            n3 = 29;
        }
        final Bundle bundle = new Bundle();
        final Intent intent = this.getIntent();
        Bundle extras;
        if (intent != null) {
            extras = intent.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            bundle.putAll(extras);
        }
        bundle.putInt("type", n3);
        bundle.putBoolean("follow", true);
        bundle.putBoolean("fetch_always", true);
        bundle.putBoolean("refresh", true);
        bundle.putInt("fragment_page_number", n);
        bundle.putBoolean("horizontal_padding_enabled", false);
        bundle.putInt("shim_size", this.getResources().getDimensionPixelSize(2131558806));
        return new go(uri, VerifiedFollowersUsersFragment.class).a((CharSequence)this.getString(n2)).a(bundle).a();
    }
    
    private void b(final Uri uri) {
        this.a(this.e.a(uri));
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.c(2130969129);
        return a;
    }
    
    String a(final boolean b, final Intent intent) {
        String s;
        if (b) {
            s = null;
        }
        else {
            s = intent.getStringExtra("extra_start_tab");
        }
        if (s == null) {
            s = this.i().getString("last_tab", null);
            if (TextUtils.isEmpty((CharSequence)s)) {
                return TabbedVitFollowersActivity.a.toString();
            }
        }
        return s;
    }
    
    void a(final int currentItem) {
        if (currentItem != -1 && currentItem != this.d.getCurrentItem()) {
            this.d.setCurrentItem(currentItem);
            this.c.a(currentItem);
        }
    }
    
    void a(final int n, final int n2) {
        if (n == n2) {
            this.h();
            return;
        }
        this.a(n);
    }
    
    void a(final k k, final Uri uri) {
        String string;
        if (uri != null) {
            string = uri.toString();
        }
        else {
            string = null;
        }
        k.a().a("last_tab", string).apply();
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951661, toolBar);
        return true;
    }
    
    public Fragment b(final gm gm) {
        return this.e.c(gm);
    }
    
    void b(final int n) {
        String s = null;
        switch (n) {
            default: {
                s = null;
                break;
            }
            case 0: {
                s = "all";
                break;
            }
            case 1: {
                s = "verified";
                break;
            }
        }
        if (s != null) {
            this.G().a(this.U().g(), "followers:vit_verified_followers", s, ":impression");
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.setTitle(2131297474);
        this.f = new k((Context)this, this.U().e(), "vit_followers");
        v.a(this, this.getIntent().getLongExtra("owner_id", -1L));
        final List k = this.k();
        final HorizontalListView horizontalListView = (HorizontalListView)this.findViewById(2131886733);
        horizontalListView.setAdapter((ListAdapter)(this.c = new mn(k)));
        horizontalListView.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final DockLayout dockLayout = (DockLayout)this.findViewById(2131886401);
        dockLayout.a(new nd(this));
        this.d = (ViewPager)this.findViewById(2131886367);
        this.e = new tf(this, this, k, this.d, horizontalListView, this.c, dockLayout);
        this.d.setAdapter(this.e);
        this.b(Uri.parse(this.a(bundle != null, this.getIntent())));
        this.G().a(this.U().g(), "followers:vit_verified_followers:::impression");
        this.b(this.d.getCurrentItem());
    }
    
    void h() {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)this.b(this.e.a(this.d.getCurrentItem()));
        if (twitterListFragment != null) {
            twitterListFragment.ay();
        }
    }
    
    k i() {
        return this.f;
    }
    
    public AbsPagesAdapter j() {
        return this.e;
    }
    
    List k() {
        return Arrays.asList(this.a(TabbedVitFollowersActivity.a, 0), this.a(TabbedVitFollowersActivity.b, 1));
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a(n, this.d.getCurrentItem());
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.a(this.f, this.e.c());
    }
}
