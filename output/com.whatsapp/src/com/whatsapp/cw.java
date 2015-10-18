// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class cw implements MediaPlayer$OnPreparedListener
{
    final VideoPreviewActivity a;
    
    cw(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.a.findViewById(2131755799).setVisibility(8);
    }
}
