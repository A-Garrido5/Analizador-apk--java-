// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.MotionEvent;
import android.view.KeyEvent;
import java.io.IOException;
import android.net.Uri;
import com.twitter.library.media.model.MediaDescriptor;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import com.twitter.library.media.util.d;
import com.twitter.library.media.util.b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import java.util.ArrayList;
import android.view.SurfaceHolder;
import android.media.MediaPlayer;
import android.widget.MediaController$MediaPlayerControl;
import android.view.SurfaceHolder$Callback;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.view.SurfaceView;

public class MediaPlayerView extends SurfaceView implements MediaPlayer$OnBufferingUpdateListener, MediaPlayer$OnCompletionListener, MediaPlayer$OnErrorListener, MediaPlayer$OnInfoListener, MediaPlayer$OnPreparedListener, MediaPlayer$OnVideoSizeChangedListener, SurfaceHolder$Callback, MediaController$MediaPlayerControl
{
    private MediaPlayer a;
    private dh b;
    private final SurfaceHolder c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private ArrayList i;
    private int j;
    private boolean k;
    private boolean l;
    private dj m;
    private ProgressBar n;
    private ImageButton o;
    private View p;
    private final b q;
    private final d r;
    private float s;
    private View$OnClickListener t;
    
    public MediaPlayerView(final Context context) {
        this(context, null, 0);
    }
    
    public MediaPlayerView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MediaPlayerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.r = new de(this);
        this.t = (View$OnClickListener)new df(this);
        this.g = 0;
        final SurfaceHolder holder = this.getHolder();
        holder.setType(3);
        holder.addCallback((SurfaceHolder$Callback)this);
        this.c = holder;
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
        this.q = new b(context, this.r);
        this.s = com.twitter.library.media.util.b.a(100, 100);
    }
    
    private void a(final int n) {
        if (this.m != null) {
            this.m.c(n);
        }
    }
    
    private boolean b(final int n) {
        return (n & this.g) != 0x0;
    }
    
    private void c(final int n) {
        this.g &= ~n;
    }
    
    private boolean g() {
        return this.b(8);
    }
    
    private void h() {
        if (this.o != null && this.p != null) {
            this.o.setVisibility(8);
            this.p.setVisibility(8);
        }
    }
    
    private void i() {
        if (this.o != null && this.p != null) {
            this.o.setVisibility(0);
            this.p.setVisibility(0);
        }
    }
    
    private void j() {
        if (this.b(1)) {
            if (!this.b.isShowing()) {
                this.d();
                return;
            }
            this.e();
        }
    }
    
    private void setState(final int n) {
        this.g |= n;
    }
    
    void a() {
        this.s = com.twitter.library.media.util.b.a(100, 50);
        if (this.a != null) {
            this.a.setVolume(this.s, this.s);
        }
    }
    
    public void a(final ImageButton o, final View p2) {
        this.o = o;
        this.p = p2;
        this.o.setOnClickListener(this.t);
        this.p.setOnClickListener(this.t);
    }
    
    public void a(final ArrayList i, final int j, final int h) {
        this.i = i;
        this.j = j;
        this.h = h;
    }
    
    void b() {
        this.s = com.twitter.library.media.util.b.a(100, 100);
        if (this.a != null) {
            this.a.setVolume(this.s, this.s);
        }
    }
    
    public void c() {
        if (this.g() || this.i == null || this.getVisibility() != 0) {
            return;
        }
        while (true) {
            final MediaPlayer a = new MediaPlayer();
            this.a = a;
            final MediaDescriptor mediaDescriptor = this.i.get(this.j);
            while (true) {
                try {
                    a.setDataSource(this.getContext(), Uri.parse(mediaDescriptor.a));
                    a.setOnInfoListener((MediaPlayer$OnInfoListener)this);
                    a.setOnBufferingUpdateListener((MediaPlayer$OnBufferingUpdateListener)this);
                    a.setOnCompletionListener((MediaPlayer$OnCompletionListener)this);
                    a.setOnErrorListener((MediaPlayer$OnErrorListener)this);
                    a.setOnPreparedListener((MediaPlayer$OnPreparedListener)this);
                    a.setOnVideoSizeChangedListener((MediaPlayer$OnVideoSizeChangedListener)this);
                    a.setDisplay(this.c);
                    a.setAudioStreamType(3);
                    a.setLooping(this.k);
                    a.setVolume(this.s, this.s);
                    a.prepareAsync();
                    if (!mediaDescriptor.b) {
                        break;
                    }
                    if (this.l) {
                        final dh b = new dk(this.m);
                        b.a((View)this);
                        b.setMediaPlayer((MediaController$MediaPlayerControl)this);
                        this.b = b;
                        return;
                    }
                }
                catch (IOException ex) {
                    this.f();
                    this.a(1);
                    return;
                }
                final dh b = new di(this, this.getContext());
                continue;
            }
        }
        this.b = null;
    }
    
    public boolean canPause() {
        return this.a != null;
    }
    
    public boolean canSeekBackward() {
        return this.a != null && this.b(4);
    }
    
    public boolean canSeekForward() {
        return this.a != null && this.b(4);
    }
    
    public void d() {
        if (this.b != null) {
            this.b.show(3000);
        }
    }
    
    public void e() {
        if (this.b != null) {
            this.b.hide();
        }
    }
    
    public void f() {
        if (!this.b(16)) {
            if (this.a != null) {
                this.a.release();
                this.a = null;
            }
            this.g = 16;
        }
        this.q.b();
    }
    
    public int getAudioSessionId() {
        if (this.a != null) {
            return this.a.getAudioSessionId();
        }
        return 0;
    }
    
    public int getBufferPercentage() {
        if (this.a != null) {
            return this.f;
        }
        return 0;
    }
    
    public int getCurrentPosition() {
        if (this.a != null) {
            return this.a.getCurrentPosition();
        }
        return 0;
    }
    
    public int getDuration() {
        if (this.a != null) {
            return this.a.getDuration();
        }
        return 0;
    }
    
    public boolean isPlaying() {
        return this.a != null && this.a.isPlaying();
    }
    
    public void onBufferingUpdate(final MediaPlayer mediaPlayer, final int f) {
        this.f = f;
    }
    
    public void onCompletion(final MediaPlayer mediaPlayer) {
        ++this.j;
        if (this.j < this.i.size()) {
            this.f();
            this.g = 0;
            if (this.n != null) {
                this.n.setVisibility(0);
            }
            this.c();
            return;
        }
        this.e();
        this.i();
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        if (n == 100) {
            this.a(3);
        }
        else {
            this.a(2);
        }
        this.f();
        return true;
    }
    
    public boolean onInfo(final MediaPlayer mediaPlayer, final int n, final int n2) {
        if (n == 801) {
            this.c(4);
        }
        else if (n == 701) {
            if (this.n != null) {
                this.n.setVisibility(0);
                return false;
            }
        }
        else if (n == 702 && this.n != null) {
            this.n.setVisibility(8);
            return false;
        }
        return false;
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        boolean b;
        if (n != 4 && n != 24 && n != 25 && n != 164 && n != 82 && n != 5 && n != 6) {
            b = true;
        }
        else {
            b = false;
        }
        if (b && this.b != null) {
            if (this.g()) {
                if (n == 79 || n == 85) {
                    if (!this.a.isPlaying()) {
                        this.start();
                        this.e();
                        return true;
                    }
                    this.pause();
                    this.d();
                }
                else if (n == 126) {
                    if (!this.a.isPlaying()) {
                        this.start();
                        this.e();
                        return true;
                    }
                }
                else {
                    if (n != 86 && n != 127) {
                        return super.onKeyDown(n, keyEvent);
                    }
                    if (this.a.isPlaying()) {
                        this.pause();
                        this.d();
                        return true;
                    }
                }
                return true;
            }
            this.j();
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int d = this.d;
        final int e = this.e;
        int defaultSize = getDefaultSize(d, n);
        int defaultSize2 = getDefaultSize(e, n2);
        if (d > 0 && e > 0) {
            final int n3 = d * defaultSize2;
            final int n4 = e * defaultSize;
            if (n3 > n4) {
                defaultSize2 = defaultSize * e / d;
            }
            else if (n3 < n4) {
                defaultSize = n3 / e;
            }
        }
        this.setMeasuredDimension(defaultSize, defaultSize2);
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        this.setState(5);
        this.start();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.b != null) {
            this.b.a();
            this.j();
        }
        return false;
    }
    
    public boolean onTrackballEvent(final MotionEvent motionEvent) {
        if (this.b != null) {
            this.j();
        }
        return false;
    }
    
    public void onVideoSizeChanged(final MediaPlayer mediaPlayer, final int d, final int e) {
        this.setState(2);
        if (d > 0 && e > 0) {
            mediaPlayer.setScreenOnWhilePlaying(true);
        }
        this.d = d;
        this.e = e;
        this.start();
    }
    
    public void pause() {
        if (this.a != null) {
            this.a.pause();
            this.q.b();
        }
    }
    
    public void seekTo(final int n) {
        if (this.a != null) {
            this.a.seekTo(n);
        }
    }
    
    public void setIsLooping(final boolean k) {
        this.k = k;
    }
    
    public void setMediaControllerListener(final dj m) {
        this.m = m;
    }
    
    public void setProgressBar(final ProgressBar n) {
        this.n = n;
    }
    
    public void setStartPosition(final int h) {
        this.h = h;
    }
    
    public void setUseSimplePlayPauseControls(final boolean l) {
        this.l = l;
    }
    
    public void start() {
        if (this.b(1) && this.b(2)) {
            if (!this.q.a()) {
                this.a(4);
                return;
            }
            this.setState(8);
            this.m.g();
            this.c.setFixedSize(this.d, this.e);
            if (this.h > 0) {
                this.a.seekTo(this.h);
                this.h = 0;
            }
            this.a.start();
            if (this.n != null) {
                this.n.setVisibility(8);
            }
            this.d();
        }
    }
    
    public void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.c();
    }
    
    public void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        this.f();
    }
}
