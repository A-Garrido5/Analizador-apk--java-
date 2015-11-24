// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

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
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.UserView;
import java.io.Serializable;
import com.twitter.library.scribe.TwitterScribeItem;
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
import android.os.Bundle;
import com.twitter.library.service.aa;
import android.support.v4.app.FragmentActivity;
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
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.am;
import android.widget.ListAdapter;
import java.util.HashSet;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;
import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.content.Context;
import java.util.LinkedHashSet;
import com.twitter.internal.android.widget.GroupedRowView;

class fg
{
    public final GroupedRowView a;
    public final LinkedHashSet b;
    public final GroupedRowView c;
    public final GroupedRowView d;
    
    fg(final Context context, final ListView listView, final int n, final boolean b, final boolean b2) {
        int n2 = 2;
        final LinkedHashSet<GroupedRowView> b3 = new LinkedHashSet<GroupedRowView>();
        context.getResources();
        this.a = a(context, listView, 2131297966, null, n, 2130839446, n2);
        for (int i = 0; i < n2; ++i) {
            b3.add(a(context, listView, 0));
        }
        if (!b && !b2) {
            n2 = 3;
        }
        b3.add(a(context, listView, n2));
        this.b = b3;
        if (b) {
            this.c = a(context, listView, 2131296292, null, n, 2130838854, 3);
        }
        else {
            this.c = null;
        }
        if (b2) {
            this.d = a(context, listView, 0, e(context.getResources().getConfiguration().locale.toString()), n, 2130839443, 3);
            return;
        }
        this.d = null;
    }
    
    private static GroupedRowView a(final Context context, final ListView listView, final int style) {
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968712, (ViewGroup)null);
        groupedRowView.setTag((Object)new ff((View)groupedRowView));
        groupedRowView.setStyle(style);
        groupedRowView.setGroupStyle(2);
        listView.addHeaderView((View)groupedRowView);
        return groupedRowView;
    }
    
    private static GroupedRowView a(final Context context, final ListView listView, final int n, final String s, final int n2, final int n3, final int n4) {
        return a(context, listView, n, s, n2, n3, n4, true);
    }
    
    private static GroupedRowView a(final Context context, final ListView listView, final int n, final String s, final int n2, final int n3, final int style, final boolean b) {
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968712, (ViewGroup)null);
        final ff tag = new ff((View)groupedRowView);
        if (s != null) {
            tag.a(context, s, n2);
        }
        else {
            tag.a(context, n, n2);
        }
        tag.b(n3, context);
        groupedRowView.setTag((Object)tag);
        groupedRowView.setStyle(style);
        groupedRowView.setGroupStyle(2);
        groupedRowView.setVisibility(8);
        if (b) {
            listView.addHeaderView((View)groupedRowView);
        }
        return groupedRowView;
    }
    
    void a() {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().invalidate();
        }
    }
    
    void a(final int n) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().setVisibility(n);
        }
        this.a.setVisibility(n);
        if (this.c != null) {
            this.c.setVisibility(n);
        }
        if (this.d != null) {
            this.d.setVisibility(n);
        }
    }
    
    boolean a(final View view) {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            if (view == (GroupedRowView)iterator.next()) {
                return true;
            }
        }
        return false;
    }
}
