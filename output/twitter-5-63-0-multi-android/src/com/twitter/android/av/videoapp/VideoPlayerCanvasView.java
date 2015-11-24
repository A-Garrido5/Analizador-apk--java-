// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.view.View;
import com.twitter.android.av.FullscreenVideoCardCanvasChromeView;
import com.twitter.android.card.CardActionHelper;
import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;
import com.twitter.library.av.VideoPlayerView;

public class VideoPlayerCanvasView extends VideoPlayerView
{
    public VideoPlayerCanvasView(final Context context, final AVPlayer avPlayer, final VideoPlayerView$Mode videoPlayerView$Mode) {
        super(context, avPlayer, videoPlayerView$Mode);
    }
    
    public void a(final VideoCardData videoCardData, final CardActionHelper cardActionHelper) {
        if (this.a instanceof FullscreenVideoCardCanvasChromeView) {
            ((FullscreenVideoCardCanvasChromeView)this.a).a((View)this, cardActionHelper, videoCardData);
        }
    }
    
    @Override
    protected int getEmbeddedChromeMode() {
        switch (com.twitter.android.av.videoapp.h.a[this.b.ordinal()]) {
            default: {
                return super.getEmbeddedChromeMode();
            }
            case 1: {
                return 0;
            }
            case 2: {
                return 4;
            }
        }
    }
}
