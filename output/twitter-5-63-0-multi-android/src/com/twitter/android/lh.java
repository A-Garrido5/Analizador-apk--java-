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
import com.twitter.android.lists.b;
import com.twitter.android.util.aj;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.android.highlights.e;
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
import java.util.Iterator;
import android.widget.ListView;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.widget.ConfirmRetryExpiredDraftsDialog;
import com.twitter.library.provider.f;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.platform.TwitterDataSyncService;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Parcelable;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.content.res.Resources;
import java.util.HashMap;
import com.twitter.library.client.aa;
import com.twitter.android.trends.a;
import com.twitter.library.client.k;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.android.geo.c;
import com.twitter.android.client.x;
import com.twitter.library.service.z;
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
import android.content.Context;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.am;
import android.os.Bundle;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.support.v4.app.LoaderManager$LoaderCallbacks;

class lh implements LoaderManager$LoaderCallbacks
{
    final /* synthetic */ MainActivity a;
    
    private lh(final MainActivity a) {
        this.a = a;
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            this.a.c(cursor.getInt(0));
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return new CursorLoader((Context)this.a, ae.a(am.a, this.a.U().g()), null, null, null, null);
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
    }
}
