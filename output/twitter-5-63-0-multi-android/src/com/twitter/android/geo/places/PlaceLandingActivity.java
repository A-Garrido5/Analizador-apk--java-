// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import java.util.ArrayList;
import com.twitter.library.client.Session;
import com.twitter.library.client.as;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.twitter.android.client.bn;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.graphics.Bitmap;
import java.util.List;
import com.twitter.library.api.geo.TwitterPlace;
import java.io.Serializable;
import com.twitter.android.EventGridFragment;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.util.q;
import android.os.Bundle;
import com.twitter.android.mn;
import android.net.Uri;
import com.twitter.android.rp;
import android.view.View$OnClickListener;
import com.twitter.android.ScrollingHeaderActivity;

public class PlaceLandingActivity extends ScrollingHeaderActivity implements View$OnClickListener, l, rp
{
    private static final Uri a;
    private static final Uri b;
    private g c;
    private b d;
    private mn e;
    
    static {
        a = Uri.parse("twitter://place/tweets");
        b = Uri.parse("twitter://place/media");
    }
    
    private gm a(final PlaceLandingActivity$PageType placeLandingActivity$PageType, final int n) {
        Serializable s = null;
        int n2 = 0;
        final Bundle bundle = new Bundle();
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            bundle.putAll(extras);
        }
        final TwitterPlace a = this.c.a();
        Uri a2 = null;
        switch (com.twitter.android.geo.places.a.a[placeLandingActivity$PageType.ordinal()]) {
            default: {
                a2 = null;
                break;
            }
            case 1: {
                s = PlaceTimelineFragment.class;
                n2 = 2131297992;
                a2 = PlaceLandingActivity.a;
                bundle.putInt("empty_title", 2131297310);
                bundle.putString("timeline_tag", a.placeId);
                bundle.putInt("type", 30);
                break;
            }
            case 2: {
                final Uri b = PlaceLandingActivity.b;
                bundle.putInt("empty_title", 2131297307);
                bundle.putString("query", "place:" + a.placeId);
                bundle.putLong("search_id", com.twitter.util.q.a.nextLong());
                bundle.putString("query_name", a.fullName);
                bundle.putBoolean("recent", a.placeType == TwitterPlace$PlaceType.a);
                bundle.putBoolean("search_button", true);
                bundle.putBoolean("terminal", true);
                bundle.putBoolean("should_shim", false);
                bundle.putBoolean("should_refresh", true);
                bundle.putInt("search_type", 1);
                n2 = 2131297487;
                s = EventGridFragment.class;
                a2 = b;
                break;
            }
        }
        bundle.putInt("fragment_page_number", n);
        final go go = new go(a2, (Class)s);
        go.a((CharSequence)this.getString(n2));
        go.a(bundle);
        return go.a();
    }
    
    @TargetApi(21)
    private void l() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.getWindow().setStatusBarColor(-16777216);
        }
    }
    
    @Override
    protected String K_() {
        return null;
    }
    
    @Override
    protected int a(final Resources resources) {
        final int widthPixels = resources.getDisplayMetrics().widthPixels;
        final AspectRatioFrameLayout b = this.d.b();
        ((View)b).measure(View$MeasureSpec.makeMeasureSpec(widthPixels, 1073741824), View$MeasureSpec.makeMeasureSpec(0, 0));
        return ((View)b).getMeasuredHeight();
    }
    
    @Override
    protected PagerAdapter a(final List list, final ViewPager viewPager) {
        return new c(this, this, list, viewPager, this.n, this.e);
    }
    
    @Override
    protected BaseAdapter a(final List list) {
        return this.e = new mn(list);
    }
    
    @Override
    protected void a(final int n) {
        super.a(n);
        this.c.a(n, true);
    }
    
    @Override
    protected void a(final Drawable drawable) {
        this.d.a(drawable);
    }
    
    @Override
    public void a(final boolean b) {
        super.a(b);
        if (b) {
            this.c.b();
        }
    }
    
    public void a(final boolean b, final ListView listView) {
    }
    
    public boolean a(final String s, final long n, final TwitterTopic twitterTopic, final String s2) {
        return false;
    }
    
    @Override
    protected String b() {
        return this.c.a().fullName;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        if (!this.getIntent().hasExtra("extra_place") || this.getIntent().getParcelableExtra("extra_place") == null) {
            throw new NullPointerException("PlaceLandingActivity expects a value for extra_place in its intent extras!");
        }
        final TwitterPlace twitterPlace = (TwitterPlace)this.getIntent().getParcelableExtra("extra_place");
        final LinearLayout headerView = (LinearLayout)View.inflate((Context)this, 2130968976, (ViewGroup)null);
        this.d = new b(this, (ViewGroup)headerView);
        final AspectRatioFrameLayout b = this.d.b();
        final sx a = sz.a((Context)this, (ViewGroup)b.findViewById(2131887133));
        final Session u = this.U();
        this.c = new g(a, new e((Context)this), new m(as.a((Context)this), (Context)this, u), twitterPlace, this.d, this.G(), u.g());
        super.b(bundle, bn);
        this.setHeaderView((View)headerView);
        this.c(b.getAspectRatio());
        headerView.setOnClickListener((View$OnClickListener)this);
        this.l();
        this.c.a(bundle);
    }
    
    protected ArrayList h() {
        final ArrayList<gm> list = new ArrayList<gm>(PlaceLandingActivity$PageType.values().length);
        list.add(this.a(PlaceLandingActivity$PageType.a, 0));
        list.add(this.a(PlaceLandingActivity$PageType.b, 1));
        this.c.a(0, false);
        return list;
    }
    
    @Override
    protected int j() {
        return this.d.b().getHeight() - this.p;
    }
    
    public void k() {
        this.c.c();
    }
    
    public void onClick(final View view) {
    }
    
    @Override
    protected void onDestroy() {
        this.c.i();
        super.onDestroy();
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.c.h();
    }
    
    protected void onPause() {
        this.c.g();
        super.onPause();
    }
    
    protected void onResume() {
        this.c.f();
        super.onResume();
    }
    
    protected void onResumeFragments() {
        super.onResumeFragments();
        this.c.d();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        this.c.b(bundle);
        super.onSaveInstanceState(bundle);
    }
}
