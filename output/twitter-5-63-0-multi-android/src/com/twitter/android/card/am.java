// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.media.MediaPlayer;
import com.twitter.library.media.player.InlineVideoView;
import android.media.MediaPlayer$OnErrorListener;

class am implements MediaPlayer$OnErrorListener
{
    final /* synthetic */ InlineVideoView a;
    final /* synthetic */ ak b;
    
    am(final ak b, final InlineVideoView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        this.a.a(false);
        return true;
    }
}
