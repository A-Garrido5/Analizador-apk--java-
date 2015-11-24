// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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
import com.twitter.library.widget.TweetView;
import android.view.View;
import com.twitter.android.widget.TweetCarouselView;
import android.view.View$OnLongClickListener;

class wr implements View$OnLongClickListener
{
    final /* synthetic */ TweetCarouselView a;
    final /* synthetic */ wp b;
    
    wr(final wp b, final TweetCarouselView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        vi.a(this.a.getTweet(), null, this.b.b, this.b.e, this.b.b.h_());
        return true;
    }
}
