// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.io.IOException;
import com.twitter.library.media.model.VideoFile;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class el implements MediaPlayer$OnPreparedListener
{
    final /* synthetic */ MediaPlayer a;
    final /* synthetic */ ProgressReportingVideoView b;
    
    el(final ProgressReportingVideoView b, final MediaPlayer a) {
        this.b = b;
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.b.h = true;
        if (this.b.g >= 0) {
            this.a.seekTo(this.b.g);
        }
        if (this.b.b != null && this.b.e != null) {
            this.b.e.b();
        }
    }
}
