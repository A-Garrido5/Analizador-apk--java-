// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import com.twitter.library.client.Session$LoginStatus;
import android.text.TextUtils;
import com.twitter.library.scribe.ScribeLog;
import android.view.LayoutInflater;
import android.support.v4.view.PagerAdapter;
import android.widget.ListAdapter;
import android.content.Intent;
import com.twitter.library.util.bq;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import java.io.Serializable;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import com.twitter.android.widget.br;
import android.os.Parcelable;
import android.content.Context;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import com.twitter.library.client.Session;
import android.os.Bundle;
import com.twitter.util.q;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import com.twitter.android.widget.bt;
import java.util.HashMap;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.android.widget.TopicView;
import com.twitter.library.provider.bg;
import android.net.Uri;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;

class hn extends AbsPagesAdapter
{
    final /* synthetic */ EventLandingActivity g;
    
    public hn(final EventLandingActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn) {
        this.g = g;
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
        this.f = viewPager.getCurrentItem();
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final SearchFragment searchFragment = (SearchFragment)super.instantiateItem(viewGroup, n);
        searchFragment.a(new ho(this.g, this.b.get(n).c, this.e));
        this.a(searchFragment, n);
        return searchFragment;
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        super.onPageScrolled(n, n2, n3);
        if (this.g.v != null) {
            this.g.v.b();
        }
    }
    
    @Override
    public void onPageSelected(final int f) {
        super.onPageSelected(f);
        this.a(this.b(this.f));
        final gm gm = this.b.get(f);
        this.b(gm);
        this.f = f;
        final long g = this.g.U().g();
        final TwitterScribeItem a = TwitterScribeItem.a(this.g.l, this.g.m);
        this.g.G().a(new ArrayList(Arrays.asList((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(this.g.o, gm.h, null, null, "click")).a(a), (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(this.g.o, gm.h, null, null, "impression")).a(a))));
    }
}
