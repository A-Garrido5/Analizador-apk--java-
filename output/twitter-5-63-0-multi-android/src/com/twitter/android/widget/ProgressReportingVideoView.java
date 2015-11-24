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
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import android.util.AttributeSet;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;

public class ProgressReportingVideoView extends TextureView
{
    static final /* synthetic */ boolean a;
    private Surface b;
    private MediaPlayer c;
    private Runnable d;
    private ep e;
    private eq f;
    private int g;
    private boolean h;
    
    static {
        a = !ProgressReportingVideoView.class.desiredAssertionStatus();
    }
    
    public ProgressReportingVideoView(final Context context) {
        this(context, null, 0);
    }
    
    public ProgressReportingVideoView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ProgressReportingVideoView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.g = -1;
        this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)new ej(this));
    }
    
    private MediaPlayer i() {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnErrorListener((MediaPlayer$OnErrorListener)new ek(this));
        mediaPlayer.setOnPreparedListener((MediaPlayer$OnPreparedListener)new el(this, mediaPlayer));
        mediaPlayer.setOnCompletionListener((MediaPlayer$OnCompletionListener)new em(this, mediaPlayer));
        mediaPlayer.setOnSeekCompleteListener((MediaPlayer$OnSeekCompleteListener)new en(this));
        final SurfaceTexture surfaceTexture = this.getSurfaceTexture();
        if (surfaceTexture != null) {
            mediaPlayer.setSurface(this.b = new Surface(surfaceTexture));
        }
        return mediaPlayer;
    }
    
    private void j() {
        ViewCompat.postOnAnimation((View)this, this.d = new eo(this));
    }
    
    private void k() {
        if (this.d != null) {
            this.removeCallbacks(this.d);
            this.d = null;
        }
    }
    
    public void a() {
        if (this.c != null) {
            this.c.pause();
            this.k();
            this.g = -1;
            this.f = null;
        }
    }
    
    public void a(final int n, final eq eq) {
        if (!this.h) {
            this.g = n;
            this.f = eq;
            return;
        }
        this.k();
        if (!ProgressReportingVideoView.a && this.c == null) {
            throw new AssertionError();
        }
        if (this.c.getCurrentPosition() == n) {
            this.g = -1;
            this.f = null;
            if (eq != null) {
                eq.a(this);
            }
            return;
        }
        this.g = n;
        this.f = eq;
        this.c.seekTo(n);
    }
    
    public void b() {
        this.k();
        this.h();
    }
    
    public void c() {
        if (this.c != null) {
            this.c.start();
        }
    }
    
    public void d() {
        if (this.c != null) {
            this.j();
            this.c.start();
        }
    }
    
    public boolean e() {
        return this.h && this.b != null;
    }
    
    public boolean f() {
        return this.g != -1;
    }
    
    public boolean g() {
        return this.c != null && this.c.isPlaying();
    }
    
    public int getCurrentPosition() {
        if (this.c == null) {
            return 0;
        }
        return this.c.getCurrentPosition();
    }
    
    void h() {
        if (this.c != null) {
            this.k();
            this.c.release();
            this.c = null;
            this.h = false;
            this.g = -1;
            this.f = null;
        }
        if (this.b != null) {
            this.b.release();
            this.b = null;
        }
    }
    
    public void setProgressListener(final ep e) {
        this.e = e;
    }
    
    public void setVideoFile(final VideoFile videoFile) {
        try {
            (this.c = this.i()).setDataSource(videoFile.file.getAbsolutePath());
            this.c.prepareAsync();
        }
        catch (IOException ex) {}
        catch (IllegalStateException ex2) {
            goto Label_0031;
        }
    }
}
