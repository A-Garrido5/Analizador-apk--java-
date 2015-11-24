// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.media.MediaPlayer;
import com.twitter.library.util.e;

class i extends e
{
    private final MediaPlayer a;
    
    i(final MediaPlayer a) {
        this.a = a;
    }
    
    protected Void a(final Void... array) {
        this.a.reset();
        this.a.release();
        return null;
    }
}
