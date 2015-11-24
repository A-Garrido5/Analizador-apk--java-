// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.metrics.e;
import java.util.Collection;
import android.os.Parcelable;
import com.twitter.android.client.bw;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cw;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import com.twitter.library.api.TwitterUser;
import android.database.DataSetObserver;
import android.view.View$OnClickListener;
import com.twitter.library.client.ay;
import android.support.v4.widget.CursorAdapter;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import com.twitter.library.api.timeline.aj;
import com.twitter.android.widget.RediscoverabilityOverlayPrompt;
import com.twitter.android.util.ba;
import com.twitter.library.client.v;
import android.widget.AbsListView;
import android.app.Activity;
import android.widget.ListAdapter;
import com.twitter.library.client.k;
import android.support.v4.content.Loader;
import com.twitter.library.platform.TwitterDataSyncService;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.api.timeline.w;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.util.n;
import com.twitter.refresh.widget.a;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.c;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import com.twitter.library.provider.cn;
import com.twitter.library.api.Recap$Metadata;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.Tweet;
import android.database.Cursor;
import android.widget.ListView;
import com.twitter.library.service.y;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import com.twitter.android.util.al;
import com.twitter.android.widget.dx;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.util.ap;
import android.content.Context;
import com.twitter.android.util.AppRatingPromptHelper;
import com.twitter.android.util.j;
import com.twitter.library.featureswitch.d;
import com.twitter.android.widget.NewTweetBannerView;
import com.twitter.library.api.Prompt;
import android.view.View;
import com.twitter.android.widget.ObservableFrameLayout;
import java.util.HashSet;
import android.os.Bundle;
import com.twitter.android.util.av;
import com.twitter.ui.widget.PromptView;
import com.twitter.android.widget.f;
import com.twitter.ui.widget.q;
import com.twitter.android.util.aw;

class iz implements yu
{
    final /* synthetic */ HomeTimelineFragment a;
    
    iz(final HomeTimelineFragment a) {
        this.a = a;
    }
    
    @Override
    public void T_() {
        this.a.r = true;
    }
}
