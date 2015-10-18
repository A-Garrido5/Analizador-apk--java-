// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ImageView;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.g;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.android.widget.TweetCarouselView;
import android.content.Intent;
import com.twitter.library.provider.Tweet;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.support.v4.view.PagerAdapter;

public class wp extends PagerAdapter
{
    private final Context a;
    private final TwitterFragmentActivity b;
    private final z c;
    private final ul d;
    private final vf e;
    private final FriendshipCache f;
    private final long g;
    private int h;
    private ln i;
    
    public wp(final TwitterFragmentActivity b, final z c, final ul d, final vf e, final FriendshipCache f, final int h, final long g) {
        this.i = ln.a;
        this.a = b.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private int a(final Tweet tweet) {
        for (int a = this.i.a(), i = 0; i < a; ++i) {
            if (((Tweet)this.i.b(i)).equals(tweet)) {
                return i;
            }
        }
        return -2;
    }
    
    private void a(final TweetCarouselView tweetCarouselView, final Tweet tweet) {
        tweetCarouselView.a(tweet, new g(true, this.b, tweet, DisplayMode.a, null, null));
    }
    
    private Intent b(final Tweet tweet) {
        return new Intent(this.a, (Class)RootTweetActivity.class).putExtra("tw", (Parcelable)tweet);
    }
    
    public int a() {
        return this.h;
    }
    
    public Tweet a(final int n) {
        return (Tweet)this.i.b(n);
    }
    
    public void a(final ln i) {
        final ln j = this.i;
        if (j != i) {
            this.i = i;
            this.notifyDataSetChanged();
            if (j != null) {
                j.b();
            }
        }
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        viewGroup.removeView((View)o);
    }
    
    @Override
    public int getCount() {
        return this.i.a();
    }
    
    @Override
    public int getItemPosition(final Object o) {
        final TweetCarouselView tweetCarouselView = (TweetCarouselView)o;
        final Tweet tweet = tweetCarouselView.getTweet();
        final int a = this.a(tweet);
        if (a >= 0) {
            final Tweet a2 = this.a(a);
            if (!a2.a(tweet)) {
                this.a(tweetCarouselView, a2);
            }
        }
        return a;
    }
    
    @Override
    public float getPageWidth(final int n) {
        return 0.9f;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final Tweet tweet = (Tweet)this.i.b(n);
        this.f.a(tweet);
        final TweetCarouselView tweetCarouselView = (TweetCarouselView)LayoutInflater.from((Context)this.b).inflate(this.a(), (ViewGroup)null);
        if (this.c instanceof xa) {
            tweetCarouselView.setTweetViewClickHandler((xa)this.c);
        }
        tweetCarouselView.setTweetActionsHandler(this.d);
        tweetCarouselView.setFriendshipCache(this.f);
        this.a(tweetCarouselView, tweet);
        tweetCarouselView.setOnClickListener((View$OnClickListener)new wq(this, tweetCarouselView));
        tweetCarouselView.setOnLongClickListener((View$OnLongClickListener)new wr(this, tweetCarouselView));
        ViewGroup viewGroup2;
        if (viewGroup.getParent() instanceof ViewGroup) {
            viewGroup2 = (ViewGroup)viewGroup.getParent();
        }
        else {
            viewGroup2 = viewGroup;
        }
        ((ImageView)tweetCarouselView.findViewById(2131886108)).setOnClickListener((View$OnClickListener)new ws(this, tweetCarouselView, viewGroup2));
        viewGroup.addView((View)tweetCarouselView);
        return tweetCarouselView;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == o;
    }
}
