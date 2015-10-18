// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.media.MediaPlayer;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.media.player.InlineVideoView;
import java.lang.ref.WeakReference;
import com.twitter.library.media.manager.ar;
import android.media.MediaPlayer$OnPreparedListener;

class m implements MediaPlayer$OnPreparedListener, ar
{
    private WeakReference a;
    
    public m(final InlineVideoView inlineVideoView) {
        this.a = new WeakReference((T)inlineVideoView);
    }
    
    public void a(final ResourceResponse resourceResponse) {
        final VideoFile videoFile = (VideoFile)resourceResponse.c();
        final InlineVideoView inlineVideoView = (InlineVideoView)this.a.get();
        if (videoFile != null && inlineVideoView != null) {
            inlineVideoView.setVideoPath(videoFile.file.getAbsolutePath());
        }
    }
    
    public void a(final InlineVideoView inlineVideoView) {
        if (!inlineVideoView.equals(this.a.get())) {
            this.a = new WeakReference((T)inlineVideoView);
        }
    }
    
    public void a(final boolean b) {
        final InlineVideoView inlineVideoView = (InlineVideoView)this.a.get();
        if (inlineVideoView != null) {
            if (!b) {
                inlineVideoView.pause();
                return;
            }
            inlineVideoView.start();
        }
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        mediaPlayer.seekTo(0);
    }
}
