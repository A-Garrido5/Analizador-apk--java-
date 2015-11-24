// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.util.bq;
import com.twitter.library.av.playback.bf;
import com.twitter.library.av.playback.av;
import android.view.ViewGroup;
import com.twitter.library.api.MediaEntity;
import android.view.View;
import com.twitter.library.av.VideoPlayerView$Mode;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.av.model.factory.c;
import com.twitter.library.av.VideoPlayerView;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.w;

class p implements w
{
    AVPlayer a;
    au b;
    String c;
    VideoPlayerView d;
    c e;
    com.twitter.library.av.playback.p f;
    final PlaybackMode g;
    private final TwitterScribeAssociation h;
    private final Tweet i;
    
    public p(final Tweet i, final TwitterScribeAssociation h, final PlaybackMode g) {
        this.f = com.twitter.library.av.playback.p.a();
        this.i = i;
        this.h = h;
        this.g = g;
    }
    
    private void a(final Context context, final au au, final MediaVideoView mediaVideoView) {
        if (this.a == null) {
            this.c = au.a();
            (this.a = com.twitter.library.av.playback.p.a().a(au, context)).c(false);
        }
        if (this.d == null) {
            VideoPlayerView$Mode videoPlayerView$Mode;
            if (this.g == PlaybackMode.d) {
                videoPlayerView$Mode = VideoPlayerView$Mode.a;
            }
            else {
                videoPlayerView$Mode = VideoPlayerView$Mode.b;
            }
            mediaVideoView.addView((View)(this.d = new VideoPlayerView(context, this.a, videoPlayerView$Mode)));
        }
    }
    
    private void a(final Context context, final MediaVideoView mediaVideoView, final MediaEntity mediaEntity) {
        if (this.b != null) {
            this.a((ViewGroup)mediaVideoView);
        }
        if (mediaEntity != null) {
            this.b = new av().a(this.i, mediaEntity.mediaUrl, bf.b(this.i), this.h);
            if (mediaEntity != null) {
                this.a(context, this.b, mediaVideoView);
                mediaVideoView.setAspectRatio(mediaEntity.size.e());
                this.e = new c(mediaEntity);
                if (bq.a() && this.g == PlaybackMode.a) {
                    this.a.a(this);
                }
            }
        }
    }
    
    private void a(final ViewGroup viewGroup) {
        if (this.a != null) {
            this.f.a(this.b);
            this.f.c(this.c);
            this.a = null;
        }
        if (this.d != null) {
            viewGroup.removeView((View)this.d);
            this.d = null;
        }
    }
    
    public au a() {
        if (this.d != null) {
            return this.d.g();
        }
        return au.a;
    }
    
    public void a(final boolean b) {
        if (!b && this.a != null && this.f.b(this.b)) {
            this.a.d(false);
        }
    }
    
    @Override
    public void aj_() {
    }
    
    public au b() {
        if (this.d != null) {
            return this.d.m();
        }
        return au.a;
    }
    
    public void b(final boolean b) {
        if (this.a != null && this.f != null) {
            this.f.a(this.b);
            if (!b) {
                this.f.c(this.c);
            }
            this.a = null;
        }
    }
    
    @Override
    public void d_() {
        if (this.a != null) {
            this.a.b(false);
        }
    }
    
    @Override
    public void e_() {
    }
}
