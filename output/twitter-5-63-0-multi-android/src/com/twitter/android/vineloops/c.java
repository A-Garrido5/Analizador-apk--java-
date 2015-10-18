// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.view.View$OnTouchListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnErrorListener;
import com.twitter.library.media.player.InlineVideoView;
import android.os.SystemClock;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class c implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ b a;
    
    c(final b a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.a.a(mediaPlayer);
        this.a.a.h();
    }
}
