// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.view.View$OnTouchListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnPreparedListener;
import com.twitter.library.media.player.InlineVideoView;
import android.os.SystemClock;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;

class e implements MediaPlayer$OnCompletionListener
{
    final /* synthetic */ b a;
    
    e(final b a) {
        this.a = a;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        mediaPlayer.seekTo(0);
        this.a.a(mediaPlayer);
        this.a.b++;
    }
}
