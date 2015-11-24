// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.client.as;
import android.content.SharedPreferences$Editor;
import com.twitter.library.platform.PushService;
import android.accounts.Account;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import com.twitter.android.metrics.LaunchTracker;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.client.o;
import com.twitter.library.client.App;
import com.twitter.android.client.ce;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.client.ay;
import android.os.Handler;
import android.accounts.AccountManager;
import com.twitter.android.news.NewsActivity;
import com.twitter.android.highlights.StoriesActivity;
import com.twitter.android.lists.b;
import com.twitter.android.util.aj;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import com.twitter.library.service.ab;
import com.twitter.library.service.y;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.media.manager.q;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.android.util.d;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import java.util.Iterator;
import android.widget.ListView;
import com.twitter.android.widget.ConfirmRetryExpiredDraftsDialog;
import com.twitter.library.provider.f;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.android.client.TwitterFragmentActivity;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.os.Bundle;
import android.content.res.Resources;
import android.content.Context;
import java.util.HashMap;
import com.twitter.library.client.aa;
import com.twitter.android.trends.a;
import com.twitter.library.client.k;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.android.geo.c;
import com.twitter.android.client.x;
import com.twitter.library.service.z;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;
import com.twitter.library.client.bp;
import java.util.ArrayList;
import java.util.Map;
import com.twitter.library.media.manager.m;
import com.twitter.library.featureswitch.n;
import com.twitter.library.client.bq;
import android.accounts.OnAccountsUpdateListener;
import android.os.Parcelable;
import com.twitter.refresh.widget.e;
import com.twitter.android.client.bw;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import android.view.ViewGroup;
import android.net.Uri;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.database.DataSetObserver;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import com.twitter.internal.android.widget.DockLayout;

class ln extends AbsPagesAdapter
{
    final /* synthetic */ MainActivity g;
    private final DockLayout h;
    
    public ln(final MainActivity g, final MainActivity mainActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn, final DockLayout h) {
        this.g = g;
        super(mainActivity, mainActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
        this.h = h;
        this.registerDataSetObserver(new lo(this, g));
    }
    
    public void a(final int n, final String s, final gm gm, final gm gm2) {
        final long currentTimeMillis = System.currentTimeMillis();
        long n2 = -1L;
        String s2;
        if (this.f != -1) {
            gm gm3;
            if (gm == null) {
                gm3 = this.b.get(this.f);
            }
            else {
                gm3 = gm;
            }
            final String h = gm3.h;
            n2 = currentTimeMillis - this.g.M;
            s2 = h;
        }
        else {
            s2 = "";
        }
        gm gm4;
        if (gm2 == null) {
            gm4 = this.b.get(n);
        }
        else {
            gm4 = gm2;
        }
        this.g.G().a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.g.U().g()).b(s2, "", s, gm4.h, "navigate")).b(n2)).e(this.f)).d(n));
    }
    
    public gm b(final Uri uri) {
        final int a = this.a(uri);
        if (a < 0) {
            return null;
        }
        return (gm)this.b.get(a);
    }
    
    public String e() {
        return this.b.get(this.a.getCurrentItem()).h;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)super.instantiateItem(viewGroup, n);
        final gm gm = this.b.get(n);
        gm.a(twitterListFragment);
        twitterListFragment.a(new lm(this.g, gm.c, this.g.k, this.h, this)).a(this.g.f);
        if (n == this.a.getCurrentItem()) {
            twitterListFragment.W();
            this.g.a(twitterListFragment);
        }
        if (twitterListFragment instanceof HomeTimelineFragment) {
            final HomeTimelineFragment homeTimelineFragment = (HomeTimelineFragment)twitterListFragment;
            homeTimelineFragment.a((jh)this.g);
            homeTimelineFragment.a((jg)this.g);
        }
        return twitterListFragment;
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        super.onPageScrolled(n, n2, n3);
        if (this.h != null) {
            this.h.b();
        }
    }
    
    @Override
    public void onPageSelected(final int f) {
        super.onPageSelected(f);
        final gm gm = this.b.get(f);
        this.g.b(gm.c);
        final gm b = this.b(this.f);
        this.a(b);
        final TwitterListFragment twitterListFragment = (TwitterListFragment)this.c(gm);
        if (twitterListFragment != null) {
            twitterListFragment.W();
            this.g.a(twitterListFragment);
        }
        if (this.h != null && this.f != f) {
            this.h.setTopLocked(twitterListFragment != null && twitterListFragment.Y().getFirstVisiblePosition() == 0);
        }
        this.a(f, "", b, gm);
        this.f = f;
        this.g.M = System.currentTimeMillis();
        this.g.Q();
    }
    
    @Override
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
        final String[] a = ((AbsPagesAdapter$PageSavedState)parcelable).a;
        for (int n = 0; n < a.length && n < this.b.size(); ++n) {
            final TwitterListFragment twitterListFragment = (TwitterListFragment)this.c.findFragmentByTag(a[n]);
            if (twitterListFragment != null) {
                final gm gm = this.b.get(n);
                gm.a(twitterListFragment);
                twitterListFragment.a(new lm(this.g, gm.c, this.g.k, this.h, this));
                if (this.h != null) {
                    twitterListFragment.a(this.g.f);
                }
            }
        }
    }
    
    @Override
    public Parcelable saveState() {
        return (Parcelable)new AbsPagesAdapter$PageSavedState(this.b);
    }
}
