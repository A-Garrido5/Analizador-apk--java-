// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.preference.PreferenceManager;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.u;
import com.twitter.android.client.v;
import com.twitter.library.platform.TwitterDataSyncService;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.library.api.timeline.al;
import com.twitter.library.api.timeline.am;
import com.twitter.library.api.timeline.x;
import com.twitter.library.api.timeline.d;
import com.twitter.library.api.timeline.ai;
import com.twitter.library.api.timeline.ae;
import com.twitter.library.api.timeline.r;
import com.twitter.library.api.timeline.w;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.client.App;
import com.twitter.library.metrics.e;
import com.twitter.android.util.aj;
import com.twitter.library.provider.ah;
import com.twitter.library.provider.ay;
import com.twitter.android.util.bj;
import android.content.ContentUris;
import com.twitter.library.provider.bc;
import java.util.Map;
import com.twitter.android.client.PendingRequest;
import com.twitter.refresh.widget.a;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.widget.TopicView$TopicData;
import com.twitter.library.scribe.ScribeAssociation;
import java.io.Serializable;
import com.twitter.library.api.EntityScribeContent;
import com.twitter.library.provider.ad;
import com.twitter.library.api.TimelineScribeContent;
import android.os.Parcelable;
import android.content.Intent;
import android.net.Uri$Builder;
import com.twitter.android.widget.ConfirmCancelPendingTweetDialog;
import com.twitter.library.provider.ax;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.support.v4.content.Loader;
import android.support.v4.app.Fragment;
import com.twitter.library.api.timeline.RichTimeline$RequestType;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.util.k;
import com.twitter.library.util.bk;
import com.twitter.library.provider.bb;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface$OnClickListener;
import com.twitter.util.f;
import com.twitter.library.provider.cn;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import android.database.Cursor;
import com.twitter.library.client.as;
import com.twitter.library.provider.Tweet;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.widget.ListAdapter;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.platform.DeviceStorageLowReceiver;
import com.twitter.library.service.z;
import java.util.HashMap;
import android.net.Uri;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.HashSet;
import com.twitter.library.util.FriendshipCache;
import com.twitter.android.metrics.b;
import com.twitter.library.provider.y;
import com.twitter.library.api.PromotedEvent;
import java.util.ArrayList;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.scribe.TwitterScribeItem;
import android.os.Bundle;
import com.twitter.library.api.PromotedContent;
import android.view.View;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.ListView;
import java.util.Set;

public class uj implements mz
{
    final /* synthetic */ TimelineFragment a;
    private final Set b;
    private final ListView c;
    private final DockLayout d;
    
    public uj(final TimelineFragment a, final DockLayout d, final Set b) {
        this.a = a;
        this.b = b;
        this.c = a.Y();
        this.d = d;
    }
    
    public void a(final View view, final PromotedContent promotedContent, final Bundle bundle) {
        final tq tq = (tq)view.getTag();
        final int k = tq.k;
        final String r = tq.r;
        if (r != null && this.a.s.add(tq.r + ":" + k)) {
            Object b = null;
            switch (k) {
                default: {
                    b = null;
                    break;
                }
                case 1: {
                    if (tq.q == 17) {
                        b = TwitterScribeItem.b(tq.r, bundle.getInt("position", -1));
                        break;
                    }
                    final TwitterScribeItem a = TwitterScribeItem.a(tq.l, tq.o, -1L, tq.q, tq.r);
                    a.h = 0;
                    a.w = "single";
                    if (this.a.O == 16) {
                        a.z = bundle.getInt("tweet_count", -1);
                        tq.o = null;
                        b = a;
                        break;
                    }
                    b = a;
                    break;
                }
                case 2: {
                    b = new TwitterScribeItem();
                    ((TwitterScribeItem)b).h = bundle.getInt("trend_cursor", -1);
                    ((TwitterScribeItem)b).y = bundle.getString("entity_type");
                    String string;
                    if (TwitterTopic.b(r)) {
                        string = tq.c.c.getText().toString();
                    }
                    else {
                        string = r;
                    }
                    ((TwitterScribeItem)b).b = string;
                    ((TwitterScribeItem)b).z = bundle.getInt("tweet_count", -1);
                    if (promotedContent != null) {
                        ((TwitterScribeItem)b).e = String.valueOf(promotedContent.promotedTrendId);
                        break;
                    }
                    break;
                }
                case 5: {
                    final long long1 = bundle.getLong("entity_id", 0L);
                    if (long1 != 0L) {
                        this.a.i.add(long1);
                    }
                    final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
                    twitterScribeItem.y = bundle.getString("entity_type");
                    twitterScribeItem.b = bundle.getString("name");
                    twitterScribeItem.c = 8;
                    twitterScribeItem.g = bundle.getInt("position", -1);
                    twitterScribeItem.w = bundle.getString("description");
                    if (promotedContent != null) {
                        twitterScribeItem.e = String.valueOf(promotedContent.promotedTrendId);
                        b = twitterScribeItem;
                        break;
                    }
                    b = twitterScribeItem;
                    break;
                }
            }
            if (b != null) {
                final String a2 = ScribeLog.a(this.a.m(), this.a.u, tq.o, tq.n, "results");
                ArrayList<?> list = this.a.r.get(a2);
                if (list == null) {
                    list = new ArrayList<Object>();
                }
                list.add(b);
                this.a.r.put(a2, list);
            }
        }
        if (k == 5 && !bundle.getBoolean("isread", true) && this.a.g.add(r)) {
            final int int1 = bundle.getInt("changes", 0);
            final int position = this.a.T().getPosition();
            if (int1 != 0 && position >= 0) {
                this.a.a(view, int1, position);
            }
        }
        if (promotedContent != null && !this.b.contains(promotedContent.promotedTrendId)) {
            this.a.a(PromotedEvent.a, promotedContent.promotedTrendId);
            this.b.add(promotedContent.promotedTrendId);
        }
        final int n = 1 + (this.c.getLastVisiblePosition() - this.c.getFirstVisiblePosition());
        final int n2 = this.c.getCount() - this.c.getHeaderViewsCount();
        if (this.d != null) {
            this.a.a(this.d, n == n2);
        }
    }
}
