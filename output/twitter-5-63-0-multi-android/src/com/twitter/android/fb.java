// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.bc;
import com.twitter.library.provider.ao;
import android.preference.PreferenceManager;
import com.twitter.android.client.u;
import com.twitter.library.view.z;
import android.support.v4.app.Fragment;
import com.twitter.android.client.v;
import com.twitter.library.av.w;
import com.twitter.library.api.TwitterTopic;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.provider.cn;
import android.widget.AbsListView;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.UserView;
import java.io.Serializable;
import com.twitter.library.scribe.ScribeAssociation;
import android.os.Parcelable;
import com.twitter.util.f;
import com.twitter.library.api.DiscoverStoryMetadata;
import com.twitter.library.provider.ad;
import com.twitter.library.scribe.ScribeItem;
import android.content.Intent;
import com.twitter.android.trends.TrendsActivity;
import android.support.v4.content.Loader;
import java.util.Map;
import com.twitter.library.service.ab;
import android.util.Pair;
import com.twitter.library.platform.TwitterDataSyncService;
import android.widget.Toast;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.service.aa;
import android.widget.ListView;
import android.support.v4.app.FragmentActivity;
import java.util.Iterator;
import java.util.LinkedHashSet;
import com.twitter.internal.android.widget.GroupedRowView;
import android.text.TextUtils;
import com.twitter.library.featureswitch.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.internal.android.service.a;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.search.h;
import com.twitter.library.client.Session;
import com.twitter.library.provider.bq;
import android.database.Cursor;
import com.twitter.library.client.k;
import com.twitter.library.api.p;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.as;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.am;
import android.content.Context;
import android.widget.ListAdapter;
import java.util.HashSet;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.TwitterScribeItem;
import android.os.Bundle;
import android.view.View;

class fb implements mz
{
    final /* synthetic */ DiscoverFragment a;
    
    public fb(final DiscoverFragment a) {
        this.a = a;
    }
    
    public void a(final View view, final fa fa, final Bundle bundle) {
        final long g = this.a.aF().g();
        TwitterScribeItem twitterScribeItem;
        if (fa.d == 0 && this.a.a(g, fa.a, fa.b)) {
            this.a.d.add(fa.a);
            if (fa.c == 1) {
                twitterScribeItem = TwitterScribeItem.a(this.a.getActivity().getApplicationContext(), fa.e, this.a.Z, null);
            }
            else {
                final int c = fa.c;
                twitterScribeItem = null;
                if (c == 2) {
                    twitterScribeItem = TwitterScribeItem.a(fa.f, fa.g, fa.h, null);
                }
            }
            PromotedContent promotedContent;
            if (fa.e != null) {
                promotedContent = fa.e.j;
            }
            else {
                promotedContent = fa.g;
            }
            if (promotedContent != null) {
                this.a.aw().a(PromotedEvent.a, promotedContent);
            }
        }
        else {
            final int c2 = fa.c;
            twitterScribeItem = null;
            if (c2 == 2) {
                final int d = fa.d;
                twitterScribeItem = null;
                if (d == 1) {
                    final boolean a = this.a.a(g, fa.a, fa.b);
                    twitterScribeItem = null;
                    if (a) {
                        twitterScribeItem = TwitterScribeItem.a(fa.f, fa.g, fa.h, null);
                    }
                }
            }
        }
        if (twitterScribeItem != null) {
            twitterScribeItem.g = 1 + bundle.getInt("position");
            this.a.e.add(twitterScribeItem);
        }
    }
}
