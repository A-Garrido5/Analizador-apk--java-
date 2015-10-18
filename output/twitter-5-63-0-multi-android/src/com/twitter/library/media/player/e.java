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
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnBufferingUpdateListener;

class e implements MediaPlayer$OnBufferingUpdateListener
{
    final /* synthetic */ InlineVideoView a;
    
    e(final InlineVideoView a) {
        this.a = a;
    }
    
    public void onBufferingUpdate(final MediaPlayer mediaPlayer, final int n) {
        this.a.k = n;
    }
}
