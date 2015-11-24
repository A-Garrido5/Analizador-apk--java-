// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.io.IOException;
import com.twitter.library.media.model.VideoFile;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.support.v4.view.ViewCompat;

class eo implements Runnable
{
    final /* synthetic */ ProgressReportingVideoView a;
    
    eo(final ProgressReportingVideoView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.c != null) {
            if (this.a.e != null) {
                this.a.e.a(this.a.c.getCurrentPosition());
            }
            if (this.a.d != null && this.a.c.isPlaying()) {
                ViewCompat.postOnAnimation((View)this.a, this.a.d);
            }
        }
    }
}
