// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.SharedPreferences$Editor;
import android.support.v4.app.Fragment;
import android.widget.TabHost;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import com.twitter.internal.android.widget.ViewPagerScrollBar;
import com.twitter.internal.android.widget.IconTabHost;
import android.widget.TabHost$OnTabChangeListener;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class TabbedFragmentActivity extends TwitterFragmentActivity implements TabHost$OnTabChangeListener
{
    protected int a;
    IconTabHost b;
    ViewPagerScrollBar c;
    ViewPager d;
    TabsAdapter e;
    SharedPreferences f;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969128);
        bn.d(true);
        return bn;
    }
    
    void a(final String currentTabByTag) {
        final IconTabHost b = this.b;
        if (!currentTabByTag.equals(b.getCurrentTabTag())) {
            b.setCurrentTabByTag(currentTabByTag);
            this.c.setPosition(this.d.getCurrentItem());
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.j();
        this.p();
        this.k();
        this.q();
        this.d.setPageMargin(this.getResources().getDimensionPixelSize(2131558733));
        this.d.setPageMarginDrawable(2131689603);
        this.f = this.getPreferences(0);
        this.b.setOnTabChangedListener((TabHost$OnTabChangeListener)this);
        this.m();
    }
    
    protected void j() {
        this.c = (ViewPagerScrollBar)this.findViewById(2131886147);
        if (this.c == null) {
            throw new RuntimeException("You must define a ViewPagerScrollBar with id R.id.scrollbar");
        }
    }
    
    protected void k() {
        this.d = (ViewPager)this.findViewById(2131886367);
        if (this.d == null) {
            throw new RuntimeException("You must define a ViewPager with id R.id.pager");
        }
    }
    
    protected void l() {
        this.b = (IconTabHost)this.findViewById(16908306);
        if (this.b == null) {
            throw new RuntimeException("You must define a tabhost with id android.R.id.tabhost");
        }
    }
    
    protected void m() {
        this.e = new TabsAdapter(this, this.b, this.d, this.c);
    }
    
    protected Fragment n() {
        return this.e.a(this.d.getCurrentItem()).a(this.getSupportFragmentManager());
    }
    
    public void onContentChanged() {
        super.onContentChanged();
        this.l();
        this.b.setup();
        this.k();
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        final SharedPreferences$Editor edit = this.f.edit();
        edit.putString("tag", this.b.getCurrentTabTag());
        edit.apply();
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.b.getCurrentTab() == -1) {
            this.b.setCurrentTab(0);
        }
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        final String string = bundle.getString("currentTab");
        if (string != null) {
            this.a(string);
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final String currentTabTag = this.b.getCurrentTabTag();
        if (currentTabTag != null) {
            bundle.putString("currentTab", currentTabTag);
        }
    }
    
    public void onTabChanged(final String s) {
        this.d.setCurrentItem(this.b.getCurrentTab());
    }
    
    protected void p() {
        this.c.setRange(this.a);
    }
    
    protected void q() {
        this.d.setOffscreenPageLimit((-1 + this.a) / 2);
    }
}
