// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnVideoSizeChangedListener;

class kl implements MediaPlayer$OnVideoSizeChangedListener
{
    final VideoView a;
    
    kl(final VideoView a) {
        this.a = a;
    }
    
    public void onVideoSizeChanged(final MediaPlayer mediaPlayer, final int n, final int n2) {
        VideoView.a(this.a, mediaPlayer.getVideoWidth());
        VideoView.g(this.a, mediaPlayer.getVideoHeight());
        if (VideoView.d(this.a) != 0 && VideoView.g(this.a) != 0) {
            this.a.getHolder().setFixedSize(VideoView.d(this.a), VideoView.g(this.a));
            this.a.requestLayout();
        }
    }
}
