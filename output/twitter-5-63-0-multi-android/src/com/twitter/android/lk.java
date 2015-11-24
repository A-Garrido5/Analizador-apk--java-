// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.SharedPreferences$Editor;
import com.twitter.library.platform.PushService;
import android.accounts.Account;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import com.twitter.android.metrics.LaunchTracker;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.client.o;
import com.twitter.library.client.App;
import com.twitter.android.client.ce;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.library.client.ay;
import android.os.Handler;
import android.accounts.AccountManager;
import com.twitter.android.news.NewsActivity;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.highlights.StoriesActivity;
import com.twitter.android.util.aj;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.android.highlights.e;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
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
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.widget.ConfirmRetryExpiredDraftsDialog;
import com.twitter.library.provider.f;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import android.text.TextUtils;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.content.res.Resources;
import java.util.HashMap;
import com.twitter.library.client.k;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.internal.android.widget.DockLayout;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Future;
import com.twitter.library.client.bp;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import android.net.Uri;
import com.twitter.library.media.manager.m;
import com.twitter.library.featureswitch.n;
import com.twitter.library.client.bq;
import android.accounts.OnAccountsUpdateListener;
import com.twitter.library.api.account.ab;
import com.twitter.library.service.y;
import com.twitter.internal.android.service.x;
import com.twitter.library.api.upload.ag;
import android.content.Context;
import com.twitter.library.platform.TwitterDataSyncService;
import android.os.Bundle;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.a;
import com.twitter.android.revenue.b;
import com.twitter.library.client.as;
import com.twitter.android.revenue.c;
import com.twitter.library.api.timeline.w;
import com.twitter.library.service.z;

class lk extends z
{
    final /* synthetic */ MainActivity a;
    
    lk(final MainActivity a) {
        this.a = a;
    }
    
    private void a(final w w) {
        final long h = w.H();
        final int k = w.K();
        if (h == 0L && k > 0) {
            this.a.a(MainActivity.c, k);
        }
        if (k > 0 && com.twitter.android.revenue.c.a()) {
            as.a(this.a.getApplicationContext()).a(new b(this.a.I(), w.D()));
        }
        if (((aa)w.l().b()).a()) {
            final Bundle bundle = new Bundle();
            bundle.putBoolean("home", false);
            TwitterDataSyncService.a((Context)this.a, bundle, this.a.U());
        }
    }
    
    private void a(final ag ag, final x x, final boolean b) {
        final boolean a = ((aa)x.b()).a();
        switch (ag.O()) {
            case 2:
            case 3:
            case 4: {
                if (a && b) {
                    this.a.a(MainActivity.c, 1);
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public void a(final y y) {
        final boolean a = y.P().a(this.a.U());
        if (y instanceof w) {
            if (a) {
                this.a((w)y);
            }
        }
        else {
            if (y instanceof ag) {
                this.a((ag)y, y.l(), a);
                return;
            }
            if (y instanceof ab) {
                final aa aa = (aa)y.l().b();
                if (aa != null && aa.a() && aa.c.getString("OLD_SCREEN_NAME") != null) {
                    this.a.n();
                    this.a.Q();
                }
            }
        }
    }
}
