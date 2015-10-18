// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ImageView;
import android.view.View$OnLongClickListener;
import android.view.LayoutInflater;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.content.Intent;
import com.twitter.library.provider.Tweet;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.android.widget.TweetCarouselView;
import android.view.View$OnClickListener;

class ws implements View$OnClickListener
{
    final /* synthetic */ TweetCarouselView a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ wp c;
    
    ws(final wp c, final TweetCarouselView a, final ViewGroup b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.c.d.a(this.a.getTweet(), (View)this.b, this.c.b, this.c.g);
    }
}
