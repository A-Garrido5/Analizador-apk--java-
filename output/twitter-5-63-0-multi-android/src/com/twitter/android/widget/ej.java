// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.io.IOException;
import com.twitter.library.media.model.VideoFile;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.util.AttributeSet;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.view.TextureView$SurfaceTextureListener;

class ej implements TextureView$SurfaceTextureListener
{
    final /* synthetic */ ProgressReportingVideoView a;
    
    ej(final ProgressReportingVideoView a) {
        this.a = a;
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        if (this.a.c != null) {
            this.a.b = new Surface(surfaceTexture);
            this.a.c.setSurface(this.a.b);
            if (this.a.h && this.a.e != null) {
                this.a.e.b();
            }
        }
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.a.h();
        return true;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
}
