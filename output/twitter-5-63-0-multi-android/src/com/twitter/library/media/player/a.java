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
import android.media.MediaPlayer$OnPreparedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnVideoSizeChangedListener;

class a implements MediaPlayer$OnVideoSizeChangedListener
{
    final /* synthetic */ InlineVideoView a;
    
    a(final InlineVideoView a) {
        this.a = a;
    }
    
    public void onVideoSizeChanged(final MediaPlayer mediaPlayer, final int n, final int n2) {
        this.a.b = mediaPlayer.getVideoWidth();
        this.a.c = mediaPlayer.getVideoHeight();
        if (this.a.b != 0 && this.a.c != 0) {
            this.a.requestLayout();
        }
    }
}
