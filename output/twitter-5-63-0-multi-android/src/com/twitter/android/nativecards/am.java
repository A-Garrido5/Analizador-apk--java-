// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import com.twitter.library.media.widget.r;
import android.os.Bundle;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.client.Session;
import android.os.Parcelable;
import java.io.Serializable;
import android.content.Intent;
import com.twitter.android.MediaPlayerActivity;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.client.az;
import com.twitter.library.media.model.MediaDescriptor;
import java.util.ArrayList;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import android.view.ViewGroup;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import com.twitter.library.media.widget.s;

public class am extends j implements s
{
    String a;
    String b;
    private AdaptiveTweetMediaView c;
    private final ViewGroup d;
    private final an e;
    
    public am(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), new an());
    }
    
    am(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final an e) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.e = e;
        this.d = this.e.a(activity);
    }
    
    @Override
    public void a() {
        if (this.c != null) {
            this.c.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final TweetMediaView tweetMediaView, final MediaEntity mediaEntity) {
    }
    
    @Override
    public void a(final TweetMediaView tweetMediaView, final TweetClassicCard tweetClassicCard) {
        final Activity k = this.k();
        if (k != null) {
            final ArrayList<MediaDescriptor> list = new ArrayList<MediaDescriptor>();
            if (this.b != null) {
                list.add(new MediaDescriptor(this.b, true));
            }
            final Session b = az.a((Context)k).b();
            final c a = com.twitter.android.client.c.a((Context)k);
            if (b != null) {
                a.a(((TwitterScribeLog)new TwitterScribeLog(b.g()).a((Context)k, this.E, this.z, null).b(new String[] { TwitterScribeLog.a(this.z, Tweet.b(this.E), "platform_forward_player_card", "click") })).a(this.z));
            }
            final Intent intent = new Intent((Context)k, (Class)MediaPlayerActivity.class);
            intent.putExtra("player_url", this.a).putExtra("player_stream_urls", (Serializable)list).putExtra("tweet", (Parcelable)this.E).putExtra("association", (Parcelable)this.z);
            k.startActivity(intent);
        }
    }
    
    @Override
    public void a(final TweetMediaView tweetMediaView, final EditableMedia editableMedia) {
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.a = wb.a("player_url", vq.c);
        this.b = wb.a("player_stream_url", vq.c);
        final Activity k = this.k();
        if (k != null && this.E != null) {
            (this.c = this.e.b(k)).setOnMediaClickListener(this);
            com.twitter.library.widget.tweet.content.c.a(this.E.K != null, this.c, null, this.E, 0, 0);
            this.d.removeAllViews();
            this.d.addView((View)this.c);
            return;
        }
        this.c = null;
    }
    
    @Override
    public View d() {
        return (View)this.d;
    }
}
