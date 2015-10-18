// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.bi;
import com.twitter.library.provider.ae;
import com.twitter.library.featureswitch.d;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.twitter.android.util.bj;
import android.preference.PreferenceManager;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.u;
import android.view.View$OnTouchListener;
import android.view.ViewConfiguration;
import android.support.v4.app.Fragment;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.library.av.w;
import android.widget.AbsListView;
import com.twitter.library.client.k;
import java.io.Serializable;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;
import com.twitter.library.scribe.ScribeAssociation;
import android.widget.ListView;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.refresh.widget.a;
import com.twitter.refresh.widget.RefreshableListView;
import android.os.Bundle;
import com.twitter.android.lists.ListTabActivity;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.twitter.library.provider.af;
import com.twitter.android.util.ah;
import com.twitter.library.view.z;
import com.twitter.android.client.v;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.widget.ListAdapter;
import com.twitter.android.platform.DeviceStorageLowReceiver;
import com.twitter.library.widget.TweetView;
import com.twitter.android.util.ai;
import android.content.SharedPreferences;
import com.twitter.library.util.FriendshipCache;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.view.View;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.android.client.bv;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class aa extends ay
{
    final /* synthetic */ ActivityFragment a;
    
    private aa(final ActivityFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session) {
        if (this.a.t) {
            this.a.u = false;
            this.a.v.a(this.a.c, session.g(), session.e());
        }
        super.a(session);
    }
}
