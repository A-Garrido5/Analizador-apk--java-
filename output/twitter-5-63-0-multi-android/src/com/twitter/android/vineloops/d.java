// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.media.MediaPlayer;
import com.twitter.library.media.player.InlineVideoView;
import android.media.MediaPlayer$OnErrorListener;

class d implements MediaPlayer$OnErrorListener
{
    final /* synthetic */ InlineVideoView a;
    final /* synthetic */ b b;
    
    d(final b b, final InlineVideoView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        this.a.a(false);
        return true;
    }
}
