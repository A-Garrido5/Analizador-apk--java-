// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import java.util.ArrayList;
import com.twitter.library.client.Session;
import com.twitter.library.client.as;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.twitter.android.client.bn;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import com.twitter.library.api.geo.TwitterPlace;
import java.io.Serializable;
import com.twitter.android.EventGridFragment;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.util.q;
import android.os.Bundle;
import android.net.Uri;
import com.twitter.android.rp;
import android.view.View$OnClickListener;
import com.twitter.android.ScrollingHeaderActivity;
import java.util.Iterator;
import android.support.v4.app.Fragment;
import com.twitter.android.TweetListFragment;
import android.view.ViewGroup;
import com.twitter.android.mn;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.AbsPagesAdapter;

class c extends AbsPagesAdapter
{
    final /* synthetic */ PlaceLandingActivity g;
    
    public c(final PlaceLandingActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn) {
        this.g = g;
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
        this.f = viewPager.getCurrentItem();
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final TweetListFragment tweetListFragment = (TweetListFragment)super.instantiateItem(viewGroup, n);
        this.a(tweetListFragment, n);
        if (n == 0 && tweetListFragment instanceof PlaceTimelineFragment) {
            ((PlaceTimelineFragment)tweetListFragment).a(this.g);
        }
        this.g.a(tweetListFragment);
        return tweetListFragment;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        super.onPageScrollStateChanged(n);
        if (n == 1) {
            final Iterator<gm> iterator = this.e.c().iterator();
            while (iterator.hasNext()) {
                this.g.a(this.c(iterator.next()));
            }
        }
    }
    
    @Override
    public void onPageSelected(final int f) {
        super.onPageSelected(f);
        this.a(this.b(this.f));
        this.b(this.a(f));
        this.f = f;
    }
}
