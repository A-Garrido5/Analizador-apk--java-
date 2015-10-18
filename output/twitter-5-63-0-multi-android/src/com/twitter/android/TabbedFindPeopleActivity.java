// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.widget.TabWidget;
import android.view.View;
import android.widget.TabHost;
import com.twitter.android.widget.TabIndicator;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.twitter.internal.android.widget.x;

public class TabbedFindPeopleActivity extends TabbedFragmentActivity implements x
{
    private void a(final String s, final int n, final Bundle bundle, final Class clazz) {
        this.e.a(this.b.newTabSpec(s).setIndicator((View)TabIndicator.a(LayoutInflater.from((Context)this), 2130968958, this.b, 0, n)), clazz, bundle);
    }
    
    private void r() {
        final TabWidget tabWidget = this.b.getTabWidget();
        for (int i = 0; i < tabWidget.getTabCount(); ++i) {
            final View childTabView = tabWidget.getChildTabViewAt(i);
            if (childTabView instanceof TabIndicator) {
                ((TabIndicator)childTabView).setTitleBold(this.b.getCurrentTab() == i);
            }
        }
    }
    
    private void s() {
        this.a("tailored", 2131297002, this.a(21), UsersFragment.class);
    }
    
    private void t() {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("refresh", false);
        bundle.putBoolean("is_hidden", true);
        this.a("popular", 2131297001, bundle, CategoriesFragment.class);
    }
    
    protected Bundle a(final int n) {
        final Bundle bundle = new Bundle();
        bundle.putInt("type", n);
        bundle.putBoolean("find_friends", true);
        bundle.putBoolean("follow", true);
        bundle.putBoolean("fetch_always", true);
        bundle.putBoolean("refresh", true);
        bundle.putBoolean("hide_bio", true);
        bundle.putBoolean("hide_contacts_import_cta", this.getIntent().getBooleanExtra("hide_contacts_import_cta", false));
        return bundle;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.a = 2;
        super.b(bundle, bn);
        this.setTitle(2131298076);
        this.d.setPageMargin(this.getResources().getDimensionPixelSize(2131558831));
        this.b.setOnTabClickedListener(this);
        this.s();
        this.t();
    }
    
    @Override
    public void h() {
        this.i();
    }
    
    protected void i() {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)this.n();
        if (twitterListFragment != null) {
            twitterListFragment.ay();
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
    }
    
    @Override
    public void onTabChanged(final String s) {
        final te te = (te)this.n();
        if (te != null) {
            te.v_();
        }
        super.onTabChanged(s);
        final te te2 = (te)this.n();
        if (te2 != null) {
            te2.e();
        }
        this.r();
    }
}
