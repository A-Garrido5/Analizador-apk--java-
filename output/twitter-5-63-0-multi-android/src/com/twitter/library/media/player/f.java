// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.player;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.util.Log;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.net.Uri;
import android.widget.MediaController;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.widget.MediaController$MediaPlayerControl;
import android.view.TextureView;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.view.TextureView$SurfaceTextureListener;

class f implements TextureView$SurfaceTextureListener
{
    final /* synthetic */ InlineVideoView a;
    
    f(final InlineVideoView a) {
        this.a = a;
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.a.d = new Surface(surfaceTexture);
        this.a.g();
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        if (this.a.d != null) {
            this.a.d.release();
        }
        this.a.d = null;
        if (this.a.h != null) {
            this.a.h.hide();
        }
        this.a.b(true);
        return true;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        int n3 = 1;
        this.a.f = n;
        this.a.g = n2;
        int n4;
        if (this.a.r == 3) {
            n4 = n3;
        }
        else {
            n4 = 0;
        }
        if (this.a.b != n || this.a.c != n2) {
            n3 = 0;
        }
        if (this.a.e != null && n4 != 0 && n3 != 0) {
            if (this.a.m != 0) {
                this.a.seekTo(this.a.m);
            }
            this.a.start();
        }
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        if (this.a.d != null) {
            this.a.d.release();
        }
        this.a.d = new Surface(surfaceTexture);
        if (this.a.e != null && this.a.r == 3) {
            if (this.a.m != 0) {
                this.a.seekTo(this.a.m);
            }
            this.a.start();
        }
    }
}
