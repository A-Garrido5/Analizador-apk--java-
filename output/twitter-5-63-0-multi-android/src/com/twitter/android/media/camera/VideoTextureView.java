// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.graphics.SurfaceTexture;
import java.io.IOException;
import android.view.View;
import android.support.v4.view.ViewCompat;
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

public class VideoTextureView extends TextureView implements MediaPlayer$OnCompletionListener, MediaPlayer$OnErrorListener, MediaPlayer$OnPreparedListener, TextureView$SurfaceTextureListener
{
    final MediaPlayer a;
    private final Runnable b;
    private final AudioManager c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private Surface i;
    private VideoFile j;
    private int k;
    private boolean l;
    private bb m;
    private VideoTextureView n;
    private VideoTextureView o;
    private VideoFile p;
    
    public VideoTextureView(final Context context) {
        this(context, null, 0);
    }
    
    public VideoTextureView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoTextureView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new ba(this);
        this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
        (this.a = new MediaPlayer()).setOnPreparedListener((MediaPlayer$OnPreparedListener)this);
        this.a.setOnCompletionListener((MediaPlayer$OnCompletionListener)this);
        this.a.setOnErrorListener((MediaPlayer$OnErrorListener)this);
        this.c = (AudioManager)context.getSystemService("audio");
    }
    
    private boolean g() {
        return this.getAlpha() > 0.0f;
    }
    
    private void h() {
        float n = 1.0f;
        final int videoWidth = this.a.getVideoWidth();
        final int videoHeight = this.a.getVideoHeight();
        if (videoWidth == 0 || videoHeight == 0 || (videoWidth == this.g && videoHeight == this.h)) {
            return;
        }
        this.g = videoWidth;
        this.h = videoHeight;
        final float n2 = this.getWidth();
        final float n3 = this.getHeight();
        final float n4 = videoWidth / n2;
        final float n5 = videoHeight / n3;
        float n6;
        if (n4 >= n5) {
            n6 = n4 / n5;
        }
        else {
            final float n7 = n5 / n4;
            n6 = n;
            n = n7;
        }
        final Matrix transform = new Matrix();
        transform.setScale(n6, n, n2 / 2.0f, n3 / 2.0f);
        this.setTransform(transform);
    }
    
    private void i() {
        if (this.e == 1 && this.d >= 1 && this.o != null && this.p != null && this.g()) {
            this.o.a(this.p, 0);
            this.o.b();
            this.o = null;
            this.p = null;
        }
    }
    
    private void j() {
        final float n = this.c.getStreamVolume(3) / this.c.getStreamMaxVolume(3);
        this.a.setVolume(n, n);
    }
    
    private void setPhase(final int d) {
        if (d > this.d) {
            this.d = d;
        }
    }
    
    private void setPlaybackMode(final int e) {
        Label_0046: {
            switch (this.e = e) {
                case 1: {
                    this.j();
                    ViewCompat.postOnAnimation((View)this, this.b);
                    this.l = true;
                    break Label_0046;
                }
                case 2: {
                    if (this.d < 2) {
                        this.a.setVolume(0.0f, 0.0f);
                        break Label_0046;
                    }
                    break;
                }
            }
            return;
        }
        if (!this.a.isPlaying() && this.d >= 1) {
            this.k = this.a.getCurrentPosition();
            this.a.start();
            this.i();
        }
    }
    
    public void a() {
        if (this.e != 1) {
            this.setPlaybackMode(1);
        }
    }
    
    public void a(final VideoTextureView n) {
        if (this.d >= 2 || this.g()) {
            this.n = null;
            n.f();
            this.e();
            return;
        }
        this.n = n;
    }
    
    public void a(final VideoFile j, final int k) {
        if (j.a(this.j) && k == this.k && !this.l && !this.f) {
            return;
        }
        this.d();
        this.j = j;
        this.k = k;
        try {
            this.a.setDataSource(j.file.getAbsolutePath());
            this.a.prepareAsync();
        }
        catch (IllegalStateException ex) {}
        catch (IOException ex2) {
            goto Label_0071;
        }
    }
    
    public void a(final VideoFile p2, final VideoTextureView o) {
        this.o = o;
        this.p = p2;
    }
    
    public void b() {
        if (this.e != 2) {
            this.setPlaybackMode(2);
        }
    }
    
    public void c() {
        final int e = this.e;
        this.e = 0;
        if (this.a.isPlaying()) {
            this.a.pause();
            this.removeCallbacks(this.b);
            if (this.m != null) {
                final bb m = this.m;
                int n;
                if (e == 2) {
                    n = this.k;
                }
                else {
                    n = this.a.getCurrentPosition();
                }
                m.d(n);
            }
        }
    }
    
    public void d() {
        this.removeCallbacks(this.b);
        this.a.reset();
        this.e = 0;
        this.d = 0;
        this.f = false;
        this.j = null;
        this.o = null;
        this.n = null;
        this.p = null;
        this.k = 0;
        this.l = false;
    }
    
    public void e() {
        this.setAlpha(1.0f);
        this.i();
    }
    
    public void f() {
        this.setAlpha(0.0f);
    }
    
    public VideoFile getVideoFile() {
        return this.j;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        if (this.d < 2 && !this.f) {
            this.a.seekTo(this.k);
            if (this.e == 1) {
                this.a.start();
            }
        }
        else if (this.e == 1) {
            this.setPhase(3);
            if (this.m != null) {
                this.m.h();
            }
        }
    }
    
    public void onDetachedFromWindow() {
        this.a.release();
        this.removeCallbacks(this.b);
        super.onDetachedFromWindow();
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        this.f = true;
        return false;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.setPhase(1);
        this.h();
        this.a.seekTo(this.k);
        this.setPlaybackMode(this.e);
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.i = new Surface(surfaceTexture);
        this.a.setSurface(this.i);
        if (this.d >= 1) {
            this.h();
        }
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.i.release();
        this.i = null;
        return true;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.g = 0;
        this.h = 0;
        if (this.d >= 1) {
            this.h();
        }
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        if (this.d >= 1) {
            this.setPhase(2);
            if (this.e == 2) {
                this.c();
            }
            if (this.n != null) {
                this.n.f();
                this.n = null;
                this.e();
            }
        }
    }
    
    public void setPlaybackListener(final bb m) {
        this.m = m;
    }
}
