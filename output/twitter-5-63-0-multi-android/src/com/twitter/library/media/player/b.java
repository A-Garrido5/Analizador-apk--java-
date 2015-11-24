// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.player;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.net.Uri;
import android.widget.MediaController;
import android.view.Surface;
import android.view.TextureView$SurfaceTextureListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class b implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ InlineVideoView a;
    
    b(final InlineVideoView a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.a.q = 2;
        this.a.n = (this.a.o = (this.a.p = true));
        if (this.a.j != null) {
            this.a.j.onPrepared(this.a.e);
        }
        if (this.a.h != null) {
            this.a.h.setEnabled(true);
        }
        this.a.b = mediaPlayer.getVideoWidth();
        this.a.c = mediaPlayer.getVideoHeight();
        final int f = this.a.m;
        if (f != 0) {
            this.a.seekTo(f);
        }
        if (this.a.b != 0 && this.a.c != 0) {
            if (this.a.f == this.a.b && this.a.g == this.a.c) {
                if (this.a.r == 3) {
                    this.a.start();
                    if (this.a.h != null) {
                        this.a.h.show();
                    }
                }
                else if (!this.a.isPlaying() && (f != 0 || this.a.getCurrentPosition() > 0) && this.a.h != null) {
                    this.a.h.show(0);
                }
            }
        }
        else if (this.a.r == 3) {
            this.a.start();
        }
    }
}
