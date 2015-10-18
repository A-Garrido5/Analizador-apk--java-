// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.events;

import android.os.Build$VERSION;
import com.twitter.library.client.Session$LoginStatus;
import android.content.Intent;
import android.content.res.Resources;
import com.twitter.library.util.bq;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.api.TwitterTopic$SportsEvent;
import android.view.LayoutInflater;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.widget.UnboundedFrameLayout;
import java.io.Serializable;
import com.twitter.util.q;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.text.TextUtils;
import android.graphics.Bitmap;
import com.twitter.library.util.af;
import android.annotation.TargetApi;
import com.twitter.library.provider.bg;
import android.graphics.drawable.Drawable;
import java.io.File;
import android.widget.TextView;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.qi;
import java.util.HashMap;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.media.widget.BackgroundImageView;
import android.net.Uri;
import com.twitter.library.media.manager.m;
import com.twitter.android.rp;
import com.twitter.android.hm;
import android.view.View$OnClickListener;
import com.twitter.android.ScrollingHeaderActivity;
import android.widget.ListView;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.Iterator;
import com.twitter.android.rc;
import com.twitter.android.SearchFragment;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.android.kg;
import com.twitter.android.client.TwitterListFragment;
import android.support.v4.app.Fragment;
import com.twitter.android.mn;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.AbsPagesAdapter;

class f extends AbsPagesAdapter
{
    final /* synthetic */ TwitterEventActivity g;
    
    public f(final TwitterEventActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn) {
        this.g = g;
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
        this.f = viewPager.getCurrentItem();
    }
    
    @Override
    public Fragment getItem(final int n) {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)super.getItem(n);
        twitterListFragment.i(!kg.a((Context)this.d));
        return twitterListFragment;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final SearchFragment searchFragment = (SearchFragment)super.instantiateItem(viewGroup, n);
        searchFragment.a(new h(this.g, this.a(n).c, this.e));
        this.a(searchFragment, n);
        this.g.a(searchFragment);
        return searchFragment;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        super.onPageScrollStateChanged(n);
        if (n == 1) {
            final Iterator<gm> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                this.g.a(this.c(iterator.next()));
            }
        }
    }
    
    @Override
    public void onPageSelected(final int f) {
        super.onPageSelected(f);
        final gm a = this.a(f);
        this.a(this.b(this.f));
        final SearchFragment searchFragment = (SearchFragment)this.c(a);
        if (searchFragment != null) {
            this.g.a(searchFragment);
            final ListView y = searchFragment.Y();
            y.clearFocus();
            y.post((Runnable)new g(this, searchFragment));
            searchFragment.W();
            searchFragment.a(new h(this.g, a.c, this.e));
        }
        this.f = f;
        final long g = this.g.U().g();
        final TwitterScribeItem a2 = TwitterScribeItem.a(this.g.J, this.g.K);
        this.g.G().a(new ArrayList(Arrays.asList((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(this.g.L, a.h, this.g.O, null, "click")).a(a2), (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(this.g.L, a.h, this.g.O, null, "impression")).a(a2))));
    }
}
