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
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;

class c implements MediaPlayer$OnCompletionListener
{
    final /* synthetic */ InlineVideoView a;
    
    c(final InlineVideoView a) {
        this.a = a;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        this.a.q = 5;
        this.a.r = 5;
        if (this.a.h != null) {
            this.a.h.hide();
        }
        if (this.a.i != null) {
            this.a.i.onCompletion(this.a.e);
        }
    }
}
