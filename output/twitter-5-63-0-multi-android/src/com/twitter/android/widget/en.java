// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.io.IOException;
import com.twitter.library.media.model.VideoFile;
import android.view.View;
import android.support.v4.view.ViewCompat;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnSeekCompleteListener;

class en implements MediaPlayer$OnSeekCompleteListener
{
    final /* synthetic */ ProgressReportingVideoView a;
    
    en(final ProgressReportingVideoView a) {
        this.a = a;
    }
    
    public void onSeekComplete(final MediaPlayer mediaPlayer) {
        if (this.a.g >= 0) {
            this.a.g = -1;
            if (this.a.f != null) {
                this.a.f.a(this.a);
                this.a.f = null;
            }
        }
    }
}
