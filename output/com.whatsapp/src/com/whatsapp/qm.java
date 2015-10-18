// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class qm implements MediaPlayer$OnPreparedListener
{
    final VideoView a;
    
    qm(final VideoView a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        VideoView.e(this.a, 2);
        VideoView.a(this.a, VideoView.d(this.a, VideoView.b(this.a, true)));
        if (VideoView.h(this.a) != null) {
            VideoView.h(this.a).onPrepared(VideoView.f(this.a));
        }
        VideoView.a(this.a, mediaPlayer.getVideoWidth());
        VideoView.g(this.a, mediaPlayer.getVideoHeight());
        final int e = VideoView.e(this.a);
        if (e != 0) {
            this.a.seekTo(e);
        }
        if (VideoView.d(this.a) != 0 && VideoView.g(this.a) != 0) {
            this.a.getHolder().setFixedSize(VideoView.d(this.a), VideoView.g(this.a));
            if (VideoView.b(this.a) == VideoView.d(this.a) && VideoView.i(this.a) == VideoView.g(this.a)) {
                if (VideoView.j(this.a) == 3) {
                    this.a.start();
                    if (!App.I) {
                        return;
                    }
                }
                if (this.a.isPlaying() || e != 0 || this.a.getCurrentPosition() > 0) {}
            }
        }
        else if (VideoView.j(this.a) == 3) {
            this.a.start();
        }
    }
}
