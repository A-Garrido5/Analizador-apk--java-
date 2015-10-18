// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.graphics.SurfaceTexture;
import java.io.IOException;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.VideoFile;
import android.view.Surface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.TextureView$SurfaceTextureListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.view.TextureView;
import android.view.View;
import android.support.v4.view.ViewCompat;

class ba implements Runnable
{
    final /* synthetic */ VideoTextureView a;
    
    ba(final VideoTextureView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.e == 1) {
            if (this.a.m != null) {
                this.a.m.d(this.a.a.getCurrentPosition());
            }
            ViewCompat.postOnAnimation((View)this.a, this);
        }
    }
}
