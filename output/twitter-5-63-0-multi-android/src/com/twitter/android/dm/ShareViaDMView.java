// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dm;

import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.TweetView;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.DMActivity;
import com.twitter.library.api.QuotedTweetData;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import android.widget.LinearLayout;

public class ShareViaDMView extends LinearLayout
{
    public ShareViaDMView(final Context context) {
        super(context);
    }
    
    public ShareViaDMView(final Context context, final Tweet tweet, final c c) {
        this(context);
        inflate(context, 2130969104, (ViewGroup)this);
        this.a(tweet);
        this.findViewById(2131887274).setOnClickListener((View$OnClickListener)new b(this, tweet, c));
    }
    
    private void a(final QuotedTweetData quotedTweetData) {
        this.getContext().startActivity(new Intent(this.getContext(), (Class)DMActivity.class).putExtra("quoted_tweet", (Serializable)quotedTweetData));
    }
    
    private void a(final Tweet tweet) {
        final TweetView tweetView = (TweetView)this.findViewById(2131886946);
        tweetView.setHideInlineActions(true);
        tweetView.setFriendshipCache(new FriendshipCache());
        tweetView.setPromotedBadgeEnabled(false);
        tweetView.setShowRetweetSocialProofToOwner(false);
        tweetView.setAlwaysExpandMedia(true);
        tweetView.setTweet(tweet);
    }
}
