// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.widget.TabWidget;
import android.view.ViewGroup;
import java.util.Iterator;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.widget.TabHost$TabContentFactory;
import android.os.Bundle;
import android.widget.TabHost$TabSpec;
import android.support.v4.view.PagerAdapter;
import com.twitter.internal.android.widget.ViewPagerScrollBar;
import java.util.ArrayList;
import android.support.v4.view.ViewPager;
import android.widget.TabHost;
import com.twitter.android.client.TwitterFragmentActivity;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter implements ViewPager$OnPageChangeListener
{
    protected final TwitterFragmentActivity a;
    protected final TabHost b;
    protected final ViewPager c;
    protected final ArrayList d;
    protected int e;
    private final ViewPagerScrollBar f;
    private final tg g;
    
    public TabsAdapter(final TwitterFragmentActivity a, final TabHost b, final ViewPager c, final ViewPagerScrollBar f) {
        super(a.getSupportFragmentManager());
        this.d = new ArrayList();
        this.e = -1;
        this.a = a;
        this.b = b;
        (this.c = c).setAdapter(this);
        this.c.setOnPageChangeListener(this);
        this.f = f;
        this.g = new tg(this.a);
    }
    
    public th a(final int n) {
        return this.d.get(n);
    }
    
    public void a(final TabHost$TabSpec tabHost$TabSpec, final Class clazz, final Bundle bundle) {
        final th th = new th(clazz, bundle, tabHost$TabSpec.getTag());
        tabHost$TabSpec.setContent((TabHost$TabContentFactory)this.g);
        this.d.add(th);
        this.b.addTab(tabHost$TabSpec);
        this.notifyDataSetChanged();
    }
    
    @Override
    public int getCount() {
        return this.d.size();
    }
    
    @Override
    public Fragment getItem(final int n) {
        return Fragment.instantiate((Context)this.a, this.d.get(n).a.getName(), this.d.get(n).b);
    }
    
    @Override
    public int getItemPosition(final Object o) {
        final Iterator<th> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a(this.a.getSupportFragmentManager()) == o) {
                return -1;
            }
        }
        return -2;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final Fragment fragment = (Fragment)super.instantiateItem(viewGroup, n);
        this.d.get(n).a(fragment);
        return fragment;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        if (this.c.getCurrentItem() < n) {
            this.f.a(n, -n3);
            return;
        }
        this.f.a(n, n3);
    }
    
    @Override
    public void onPageSelected(final int n) {
        final TabWidget tabWidget = this.b.getTabWidget();
        final int descendantFocusability = tabWidget.getDescendantFocusability();
        tabWidget.setDescendantFocusability(393216);
        if (n != this.b.getCurrentTab()) {
            this.b.setCurrentTab(n);
        }
        tabWidget.setDescendantFocusability(descendantFocusability);
        this.e = n;
    }
    
    @Override
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
        final String[] a = ((TabsAdapter$TabSavedState)parcelable).a;
        for (int i = 0; i < a.length; ++i) {
            final Fragment fragmentByTag = this.a.getSupportFragmentManager().findFragmentByTag(a[i]);
            if (fragmentByTag != null) {
                this.d.get(i).a(fragmentByTag);
            }
        }
    }
    
    @Override
    public Parcelable saveState() {
        return (Parcelable)new TabsAdapter$TabSavedState(this.d);
    }
}
