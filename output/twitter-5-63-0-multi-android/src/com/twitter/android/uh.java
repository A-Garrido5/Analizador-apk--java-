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
import com.twitter.library.api.TwitterTopic;
import android.os.Parcelable;
import android.content.Intent;
import android.net.Uri$Builder;
import android.widget.ListView;
import com.twitter.library.provider.ax;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.database.DataSetObserver;
import java.util.Set;
import android.graphics.drawable.Drawable;
import com.twitter.android.client.TwitterFragmentActivity;
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
import com.twitter.android.metrics.b;
import com.twitter.library.provider.y;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.TweetActionType;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.android.widget.ConfirmCancelPendingTweetDialog;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.provider.Tweet;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.twitter.library.widget.TweetView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.Fragment;
import android.view.animation.TranslateAnimation;

public class uh extends xa
{
    private TranslateAnimation a;
    private final long o;
    
    public uh(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final ul ul, final long o) {
        super(fragment, twitterScribeAssociation, null, null, s, null, null, ul);
        this.o = o;
    }
    
    @Override
    public void a(final long n, final long n2, final String s, final PromotedContent promotedContent, final TweetView tweetView, final boolean b) {
        if (n2 != this.o) {
            super.a(n, n2, s, promotedContent, tweetView, b);
        }
        else {
            final Fragment fragment = (Fragment)this.b.get();
            if (fragment != null && this.c != null) {
                final View view = fragment.getView();
                TranslateAnimation a = this.a;
                if (a == null) {
                    final Resources resources = this.c.getResources();
                    final int integer = resources.getInteger(2131623945);
                    final float dimension = resources.getDimension(2131558481);
                    final TranslateAnimation translateAnimation = new TranslateAnimation(-dimension, 0.0f, 0.0f, 0.0f);
                    translateAnimation.setDuration((long)integer);
                    translateAnimation.setInterpolator((Interpolator)new OvershootInterpolator());
                    final ui animationListener = new ui(this, view, translateAnimation);
                    a = new TranslateAnimation(0.0f, -dimension, 0.0f, 0.0f);
                    a.setDuration((long)integer);
                    a.setInterpolator((Interpolator)new LinearInterpolator());
                    a.setAnimationListener((Animation$AnimationListener)animationListener);
                    this.a = a;
                }
                view.startAnimation((Animation)a);
            }
        }
    }
    
    @Override
    public void a(final Tweet tweet, final EditableMedia editableMedia, final TweetView tweetView) {
        if (tweet.K != null) {
            final Fragment fragment = (Fragment)this.b.get();
            if (fragment != null) {
                ConfirmCancelPendingTweetDialog.a(fragment.getFragmentManager(), tweet);
            }
        }
    }
    
    @Override
    public void a(final Tweet tweet, final TweetView tweetView) {
        final Fragment fragment = (Fragment)this.b.get();
        if (fragment != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (tweet.m()) {
                this.l.a(tweet, (View)tweetView, activity, -1L);
            }
            else {
                if (tweet.t()) {
                    b(this.d, tweet);
                    return;
                }
                if (tweet.v()) {
                    b(az.a((Context)activity), activity, this.l, tweet);
                }
            }
        }
    }
    
    @Override
    public void a(final TweetActionType tweetActionType, final TweetView tweetView) {
        final Tweet tweet = tweetView.getTweet();
        super.a(tweetActionType, tweetView);
        if (tweet.t() && TweetActionType.e == tweetActionType) {
            this.d.a(this.e.b().g(), tweet.C);
            final FriendshipCache friendshipCache = tweetView.getFriendshipCache();
            final Fragment fragment = (Fragment)this.b.get();
            final fi a = fj.a(this.c);
            if (fragment != null && friendshipCache != null && friendshipCache.k(tweet.C) && a.c()) {
                a.a(fragment.getActivity());
            }
        }
    }
}
