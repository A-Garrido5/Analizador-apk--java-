// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnBufferingUpdateListener;

class alx implements MediaPlayer$OnBufferingUpdateListener
{
    final VideoView a;
    
    alx(final VideoView a) {
        this.a = a;
    }
    
    public void onBufferingUpdate(final MediaPlayer mediaPlayer, final int n) {
        VideoView.c(this.a, n);
    }
}
