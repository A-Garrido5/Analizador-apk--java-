// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.DockLayout;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;

class tf extends fo
{
    final /* synthetic */ TabbedVitFollowersActivity g;
    
    public tf(final TabbedVitFollowersActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn, final DockLayout dockLayout) {
        this.g = g;
        super(fragmentActivity, list, viewPager, horizontalListView, mn, dockLayout);
    }
    
    @Override
    public void onPageSelected(final int n) {
        super.onPageSelected(n);
        this.g.b(n);
    }
}
