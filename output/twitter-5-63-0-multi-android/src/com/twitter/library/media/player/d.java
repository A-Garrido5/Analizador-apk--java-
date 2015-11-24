// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.player;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.net.Uri;
import android.widget.MediaController;
import android.view.Surface;
import android.view.TextureView$SurfaceTextureListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;
import android.widget.Toast;
import android.util.Log;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class d implements MediaPlayer$OnErrorListener
{
    final /* synthetic */ InlineVideoView a;
    
    d(final InlineVideoView a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        Log.e(InlineVideoView.a, "Error: " + n + ", " + n2 + ", " + this.a);
        this.a.q = -1;
        this.a.r = -1;
        this.a.w = null;
        if (this.a.h != null) {
            this.a.h.hide();
        }
        if ((this.a.l == null || !this.a.l.onError(this.a.e, n, n2)) && this.a.getWindowToken() != null) {
            String s;
            if (n == 200) {
                s = "This video cannot be played due to invalid progressive playback.";
            }
            else {
                s = "This video cannot be played due to an unknown error.";
            }
            Toast.makeText(this.a.v, (CharSequence)s, 0).show();
            return true;
        }
        return true;
    }
}
