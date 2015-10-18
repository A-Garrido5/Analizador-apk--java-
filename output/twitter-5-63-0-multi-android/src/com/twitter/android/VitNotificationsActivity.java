// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.vit.VitNotificationsEducationOverlay;
import android.view.View;
import android.widget.AdapterView;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.ToolBar;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.f;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.ListAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.library.client.d;
import java.util.Arrays;
import java.util.List;
import com.twitter.android.client.bn;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.content.Intent;
import java.io.Serializable;
import android.os.Bundle;
import com.twitter.library.client.k;
import android.support.v4.view.ViewPager;
import android.net.Uri;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class VitNotificationsActivity extends TwitterFragmentActivity implements AdapterView$OnItemClickListener, nc
{
    static final Uri a;
    static final Uri b;
    static final Uri c;
    private mn d;
    private ViewPager e;
    private fo f;
    private boolean g;
    private k h;
    
    static {
        a = Uri.parse("twitter://vit_notifications/all");
        b = Uri.parse("twitter://vit_notifications/mentions");
        c = Uri.parse("twitter://vit_notifications/verified");
    }
    
    private gm a(final Uri uri, final int n, final boolean b) {
        int n3;
        boolean b2;
        Serializable s;
        int n5;
        int n6;
        if (VitNotificationsActivity.a.equals((Object)uri)) {
            int n2;
            if (b) {
                n2 = 2;
            }
            else {
                n2 = 0;
            }
            n3 = 2131298129;
            b2 = false;
            final int n4 = n2;
            s = ActivityFragment.class;
            n5 = 2131298130;
            n6 = n4;
        }
        else if (VitNotificationsActivity.b.equals((Object)uri)) {
            n3 = 2131298131;
            b2 = true;
            int n7;
            if (b) {
                n7 = 23;
            }
            else {
                n7 = 5;
            }
            n5 = 2131298132;
            n6 = n7;
            s = MentionTimelineFragment.class;
        }
        else {
            if (!VitNotificationsActivity.c.equals((Object)uri)) {
                throw new IllegalArgumentException("Invalid page");
            }
            n6 = 4;
            n5 = 2131298134;
            s = ActivityFragment.class;
            n3 = 2131298133;
            b2 = false;
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
        String s2;
        if (b2) {
            s2 = "type";
        }
        else {
            s2 = "activity_type";
        }
        bundle.putInt(s2, n6);
        bundle.putInt("fragment_page_number", n);
        bundle.putBoolean("horizontal_padding_enabled", false);
        bundle.putInt("empty_desc", n5);
        bundle.putInt("shim_size", this.getResources().getDimensionPixelSize(2131558806));
        String s3;
        if (b2) {
            s3 = "should_fetch_new_data";
        }
        else {
            s3 = "should_fetch_new_data";
        }
        bundle.putBoolean(s3, false);
        if (!b2) {
            bundle.putBoolean("activity_mention_only", false);
        }
        return new go(uri, (Class)s).a((CharSequence)this.getString(n3)).a(bundle).a();
    }
    
    private void b(final Uri uri) {
        final int a = this.f.a(uri);
        if (a != -1 && a != this.e.getCurrentItem()) {
            this.a(a);
        }
    }
    
    private Fragment i() {
        final gm a = this.f.a(this.e.getCurrentItem());
        if (a != null) {
            return this.b(a);
        }
        return null;
    }
    
    private boolean k() {
        return new k((Context)this, this.U().e()).getBoolean("quality_filter", true);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.c(2130969201);
        a.e(true);
        return a;
    }
    
    List a(final boolean b) {
        return Arrays.asList(this.a(VitNotificationsActivity.a, 0, b), this.a(VitNotificationsActivity.b, 1, b), this.a(VitNotificationsActivity.c, 2, b));
    }
    
    void a(final int currentItem) {
        this.e.setCurrentItem(currentItem);
        this.d.a(currentItem);
    }
    
    void a(final int n, final int n2) {
        if (n == n2) {
            this.h();
            return;
        }
        this.a(n);
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.setTitle(2131297313);
        this.h = new k((Context)this, this.U().e(), "vit_notifications");
        this.g = this.k();
        final List a = this.a(this.g);
        final HorizontalListView horizontalListView = (HorizontalListView)this.findViewById(2131886733);
        horizontalListView.setAdapter((ListAdapter)(this.d = new mn(a)));
        horizontalListView.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final DockLayout dockLayout = (DockLayout)this.findViewById(2131886401);
        dockLayout.a(new nd(this));
        (this.e = (ViewPager)this.findViewById(2131886367)).setOffscreenPageLimit(2);
        this.f = new fo(this, a, this.e, horizontalListView, this.d, dockLayout, new fn(dockLayout));
        this.e.setAdapter(this.f);
        this.b(Uri.parse(this.h.getString("tag", VitNotificationsActivity.a.toString())));
    }
    
    void a(final k k, final Uri uri) {
        String string;
        if (uri != null) {
            string = uri.toString();
        }
        else {
            string = null;
        }
        k.a().a("tag", string).apply();
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951661, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887480) {
            this.startActivity(new Intent((Context)this, (Class)NotificationsTimelineSettingsActivity.class).putExtra("NotificationsTimelineSettingsActivity_account_name", this.U().e()));
            return true;
        }
        return super.a(jx);
    }
    
    public Fragment b(final gm gm) {
        return this.f.c(gm);
    }
    
    @Override
    protected void f_() {
        final Fragment i = this.i();
        if (i instanceof TwitterListFragment) {
            ((TwitterListFragment)i).X();
        }
    }
    
    void h() {
        final Fragment i = this.i();
        if (i instanceof TwitterListFragment) {
            ((TwitterListFragment)i).ay();
        }
    }
    
    public AbsPagesAdapter j() {
        return this.f;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a(n, this.e.getCurrentItem());
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        this.a(this.h, this.f.c());
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (this.g != this.k()) {
            this.startActivity(new Intent((Context)this, (Class)VitNotificationsActivity.class));
            this.overridePendingTransition(2131034166, 2131034167);
            this.finish();
        }
        else if (VitNotificationsEducationOverlay.a((Context)this, this.U().f())) {
            VitNotificationsEducationOverlay.b(this);
        }
    }
}
