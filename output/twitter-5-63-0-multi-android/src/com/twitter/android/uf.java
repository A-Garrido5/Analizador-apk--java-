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
import android.os.Bundle;
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
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.TwitterTopic;
import android.os.Parcelable;
import android.content.Intent;
import android.net.Uri$Builder;
import com.twitter.android.widget.ConfirmCancelPendingTweetDialog;
import android.widget.ListView;
import android.view.View;
import com.twitter.library.provider.ax;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.database.DataSetObserver;
import java.util.Set;
import android.graphics.drawable.Drawable;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.support.v4.content.Loader;
import com.twitter.library.api.timeline.RichTimeline$RequestType;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.util.k;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.util.bk;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.provider.bb;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface$OnClickListener;
import com.twitter.util.f;
import com.twitter.library.provider.cn;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import android.database.Cursor;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.api.PromotedEvent;
import com.twitter.internal.android.widget.DockLayout;
import android.widget.ListAdapter;
import com.twitter.android.platform.DeviceStorageLowReceiver;
import com.twitter.library.service.z;
import java.util.HashMap;
import android.net.Uri;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashSet;
import com.twitter.library.util.FriendshipCache;
import com.twitter.android.metrics.b;
import com.twitter.library.provider.y;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.Fragment;

final class uf extends ul
{
    public uf(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation) {
        super(fragment, twitterScribeAssociation);
    }
    
    @Override
    protected void a(final Tweet tweet, final Fragment fragment, final FragmentActivity fragmentActivity, final Session session) {
        if (tweet.t()) {
            b(this.c, tweet);
            return;
        }
        if (tweet.r() || tweet.s()) {
            b(this.c, this.d, fragmentActivity, this, tweet, this.f);
            return;
        }
        super.a(tweet, fragment, fragmentActivity, session);
    }
}
