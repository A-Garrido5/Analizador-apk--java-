// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.featureswitch.d;
import java.util.Arrays;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.widget.TextView;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.e;
import com.twitter.library.util.bj;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import java.util.Collection;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import com.twitter.library.util.bq;
import com.twitter.library.media.widget.MediaImageView;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.graphics.drawable.Drawable;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.bn;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.client.c;
import com.twitter.library.media.util.HeaderImageVariant;
import android.os.Bundle;
import java.io.Serializable;
import com.twitter.util.q;
import com.twitter.library.client.Session;
import android.widget.Button;
import java.util.ArrayList;
import java.util.HashMap;
import com.twitter.library.provider.bg;
import android.net.Uri;
import com.twitter.library.media.widget.o;
import android.view.View$OnClickListener;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import com.twitter.android.widget.ey;
import com.twitter.android.widget.ScrollingHeaderUsersListFragment;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import android.view.ViewGroup;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;

class hh extends AbsPagesAdapter
{
    final /* synthetic */ EmailExploreActivity g;
    
    public hh(final EmailExploreActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn) {
        this.g = g;
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
        this.f = viewPager.getCurrentItem();
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)super.instantiateItem(viewGroup, n);
        this.g.a(twitterListFragment);
        if (twitterListFragment instanceof SearchFragment) {
            ((SearchFragment)twitterListFragment).a(new hi(this.g, this.b.get(n).c, this.e));
        }
        else if (n == 2) {
            ((ScrollingHeaderUsersListFragment)twitterListFragment).a(new hk(this.g, null));
            this.g.y = (hj)twitterListFragment;
        }
        this.a(twitterListFragment, n);
        return twitterListFragment;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        this.b().a(n);
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
        this.a(this.b(this.f));
        final gm gm = this.b.get(f);
        this.b(gm);
        this.f = f;
        this.g.G().a(((TwitterScribeLog)new TwitterScribeLog(this.g.U().g()).b("explore_email", "category", gm.h, null, "select")).d(this.g.B));
        this.g.Q();
    }
}
