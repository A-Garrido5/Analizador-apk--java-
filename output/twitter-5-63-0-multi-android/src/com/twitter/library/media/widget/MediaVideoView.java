// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.util.bq;
import com.twitter.library.av.playback.bf;
import com.twitter.library.av.playback.av;
import android.view.ViewGroup;
import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.library.av.model.factory.c;
import com.twitter.library.av.VideoPlayerView;
import com.twitter.library.av.playback.w;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.AVPlayer;
import android.view.View;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.api.MediaEntity;
import android.view.View$OnClickListener;
import com.twitter.library.widget.AspectRatioFrameLayout;

public class MediaVideoView extends AspectRatioFrameLayout implements View$OnClickListener
{
    private MediaEntity a;
    private p c;
    private View$OnClickListener d;
    
    public MediaVideoView(final Context context) {
        this(context, null, 0);
    }
    
    public MediaVideoView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MediaVideoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.setOnClickListener((View$OnClickListener)this);
    }
    
    public MediaVideoView(final Context context, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final PlaybackMode playbackMode) {
        this(context);
        this.a(tweet, twitterScribeAssociation, playbackMode);
    }
    
    public void a() {
        this.setOnClickListener((View$OnClickListener)this);
        final AVPlayer a = this.c.a;
        final com.twitter.library.av.playback.p f = this.c.f;
        if (a != null && f != null) {
            if (!a.J()) {
                if (this.c.d != null) {
                    this.c.d.b();
                    this.c.d.h();
                }
            }
            else if (this.c.d != null) {
                this.removeView((View)this.c.d);
            }
        }
    }
    
    public void a(final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final PlaybackMode playbackMode) {
        this.c = new p(tweet, twitterScribeAssociation, playbackMode);
    }
    
    public void a(final boolean b) {
        if (this.c != null) {
            this.c.a(b);
        }
    }
    
    public au b() {
        if (this.c != null) {
            return this.c.a();
        }
        return au.a;
    }
    
    public void b(final boolean b) {
        if (this.c != null) {
            this.c.b(b);
        }
    }
    
    public au c() {
        if (this.c != null) {
            return this.c.b();
        }
        return au.a;
    }
    
    public void onClick(final View view) {
        if (this.c.d != null && !this.c.d.c() && this.d != null) {
            this.d.onClick((View)this);
        }
    }
    
    public void setExternalClickListener(final View$OnClickListener d) {
        this.d = d;
    }
    
    public void setMediaEntity(final MediaEntity a) {
        if (a == null || !a.a(this.a)) {
            this.a = a;
            this.c.a(this.getContext(), this, this.a);
        }
    }
}
