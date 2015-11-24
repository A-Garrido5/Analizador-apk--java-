// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;

class ku implements MediaPlayer$OnCompletionListener
{
    final VideoView a;
    
    ku(final VideoView a) {
        this.a = a;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        VideoView.e(this.a, 5);
        VideoView.f(this.a, 5);
        if (VideoView.a(this.a) != null) {
            VideoView.a(this.a).onCompletion(VideoView.f(this.a));
        }
    }
}
