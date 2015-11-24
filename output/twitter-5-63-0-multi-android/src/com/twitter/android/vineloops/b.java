// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.view.View$OnTouchListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnPreparedListener;
import com.twitter.library.media.player.InlineVideoView;
import android.os.SystemClock;
import android.media.MediaPlayer;

public class b
{
    private final a a;
    private int b;
    private long c;
    
    public b(final a a) {
        this.b = 0;
        this.a = a;
    }
    
    private void a(final MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        this.c = SystemClock.elapsedRealtime();
    }
    
    public int a() {
        int n = 1;
        int n2;
        if (SystemClock.elapsedRealtime() - this.c >= 500L) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        final int b = this.b;
        if (n2 == 0) {
            n = 0;
        }
        final int n3 = b + n;
        this.b = 0;
        this.c = 0L;
        return n3;
    }
    
    public void a(final InlineVideoView inlineVideoView) {
        inlineVideoView.setOnPreparedListener((MediaPlayer$OnPreparedListener)new c(this));
        inlineVideoView.setOnErrorListener((MediaPlayer$OnErrorListener)new d(this, inlineVideoView));
        inlineVideoView.setOnCompletionListener((MediaPlayer$OnCompletionListener)new e(this));
        inlineVideoView.setOnTouchListener((View$OnTouchListener)new f(this, inlineVideoView));
    }
}
