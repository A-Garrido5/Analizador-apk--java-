// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.element.k;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.media.manager.aj;
import android.view.View;
import com.twitter.library.media.player.InlineVideoView;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnErrorListener;
import com.twitter.library.card.element.BasePlayer;
import android.content.Context;
import com.twitter.library.media.manager.ap;
import com.twitter.library.card.element.j;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class al implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ ak a;
    
    al(final ak a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        this.a.b.h();
    }
}
