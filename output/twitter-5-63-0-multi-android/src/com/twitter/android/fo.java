// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import com.twitter.refresh.widget.e;
import com.twitter.android.client.bw;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.DockLayout;

public class fo extends AbsPagesAdapter
{
    private final DockLayout g;
    private final fn h;
    
    public fo(final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn, final DockLayout dockLayout) {
        this(fragmentActivity, list, viewPager, horizontalListView, mn, dockLayout, new fn(dockLayout));
    }
    
    public fo(final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn, final DockLayout g, final fn h) {
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
        this.g = g;
        this.h = h;
    }
    
    protected void a(final TwitterListFragment twitterListFragment, final int n) {
        super.a(twitterListFragment, n);
        twitterListFragment.a(new nb(this.a(n).c, this.a, this.g, this)).a(this.h);
    }
    
    void c(final int f) {
        this.a(this.b(this.f));
        final gm a = this.a(f);
        final TwitterListFragment twitterListFragment = (TwitterListFragment)this.c(a);
        this.b(a);
        if (this.f != f) {
            this.g.setTopLocked(twitterListFragment != null && twitterListFragment.Y().getFirstVisiblePosition() == 0);
        }
        this.f = f;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)super.instantiateItem(viewGroup, n);
        this.a(twitterListFragment, n);
        return twitterListFragment;
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        super.onPageScrolled(n, n2, n3);
        this.g.b();
    }
    
    @Override
    public void onPageSelected(final int n) {
        super.onPageSelected(n);
        this.c(n);
    }
}
