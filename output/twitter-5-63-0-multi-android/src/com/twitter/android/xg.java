// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ViewAnimator;
import android.widget.ListView;
import android.util.Pair;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.util.bo;
import com.twitter.android.client.bh;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.util.bj;
import com.twitter.library.api.UserSettings;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.FriendshipCache;
import java.util.ArrayList;
import com.twitter.library.view.z;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.u;
import android.support.v4.widget.CursorAdapter;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.TweetView;
import com.twitter.library.widget.tweet.content.g;
import java.lang.ref.WeakReference;

class xg implements pq
{
    final /* synthetic */ xc a;
    private long b;
    private WeakReference c;
    private g d;
    
    public xg(final xc a, final long b, final TweetView tweetView, final g d) {
        this.a = a;
        this.b = b;
        this.c = new WeakReference((T)tweetView);
        this.d = d;
    }
    
    @Override
    public void a(final int n) {
        final TweetView tweetView = (TweetView)this.c.get();
        if (tweetView != null) {
            final Tweet tweet = tweetView.getTweet();
            if (tweet != null && tweet.D == this.b) {
                tweet.w = (n > 0);
                tweetView.a(tweet, this.a.l, this.d);
            }
        }
    }
}
