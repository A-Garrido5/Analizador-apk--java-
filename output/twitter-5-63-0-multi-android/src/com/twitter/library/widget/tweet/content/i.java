// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import android.view.View;
import com.twitter.library.av.playback.au;
import com.twitter.library.media.widget.v;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.media.widget.MediaVideoView;
import com.twitter.library.media.widget.r;
import android.app.Activity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.a;

public class i extends l implements a
{
    Tweet a;
    TwitterScribeAssociation b;
    
    public i(final Activity activity, final k k, final r r) {
        super(activity, k, r);
    }
    
    private MediaVideoView h() {
        final TweetMediaView g = this.g();
        if (g != null) {
            return g.getMediaVideoView();
        }
        return null;
    }
    
    @Override
    protected AdaptiveTweetMediaView a(final Activity activity, final n n) {
        final AdaptiveTweetMediaView a = super.a(activity, n);
        this.a = n.a;
        this.b = n.d;
        a.a(new j(this), PlaybackMode.d);
        return a;
    }
    
    @Override
    public au ak_() {
        final MediaVideoView h = this.h();
        if (h != null) {
            return h.b();
        }
        return au.a;
    }
    
    @Override
    public au e() {
        final MediaVideoView h = this.h();
        if (h != null) {
            return h.c();
        }
        return au.a;
    }
    
    @Override
    public View f() {
        return this.d();
    }
}
