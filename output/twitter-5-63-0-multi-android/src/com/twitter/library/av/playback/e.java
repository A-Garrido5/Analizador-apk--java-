// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.av.model.a;
import android.media.MediaPlayer;
import com.google.android.exoplayer.audio.AudioTrack$InitializationException;
import com.google.android.exoplayer.MediaCodecTrackRenderer$DecoderInitializationException;
import android.view.SurfaceHolder;
import android.media.MediaCodec$CryptoException;
import android.view.Surface;
import com.google.android.exoplayer.aj;
import com.google.android.exoplayer.ah;
import com.google.android.exoplayer.k;
import android.net.Uri;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import com.google.android.exoplayer.ExoPlaybackException;
import java.lang.ref.WeakReference;
import com.google.android.exoplayer.m;
import com.google.android.exoplayer.y;
import android.os.Handler;
import com.google.android.exoplayer.d;
import android.annotation.TargetApi;
import com.google.android.exoplayer.o;
import com.google.android.exoplayer.g;
import com.google.android.exoplayer.ac;

@TargetApi(16)
public class e extends ax implements ac, g, o
{
    private static final boolean a;
    private final d l;
    private final Handler m;
    private y n;
    private m o;
    private int p;
    private int q;
    private int r;
    private float s;
    private WeakReference t;
    private ExoPlaybackException u;
    private boolean v;
    
    static {
        a = (App.l() && Log.isLoggable("AVMediaExoPlayer", 3));
    }
    
    public e(final Handler handler, final f f) {
        this(handler, f, com.google.android.exoplayer.f.a(2, b(), 5000, 1000));
    }
    
    e(final Handler m, final f f, final d l) {
        super(f);
        this.p = 1;
        this.s = Float.NaN;
        this.t = new WeakReference(null);
        this.m = m;
        (this.l = l).a(this);
    }
    
    static int b() {
        final String d = com.twitter.library.featureswitch.d.d("video_dropoff_exoplayer_buffering_2825");
        switch (d) {
            default: {
                return 1000;
            }
            case "exoplayer_2_second_buffering": {
                return 2000;
            }
            case "exoplayer_5_second_buffering": {
                return 5000;
            }
        }
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final float s) {
        this.s = s;
        if (this.o != null) {
            this.l.a(this.o, 1, s);
        }
    }
    
    @Override
    protected void a(final int n) {
        this.l.a(n);
    }
    
    @Override
    public void a(final int q, final int r, final float n) {
        this.q = q;
        this.r = r;
        if (this.c != null) {
            this.c.a(q, r);
        }
    }
    
    @Override
    public void a(final int n, final long n2) {
    }
    
    @Override
    protected void a(final Context context) {
        final k k = new k(context, Uri.parse(this.f.a()), this.h, 2);
        this.n = new y(k, 1, 0L, this.m, this, -1);
        this.o = new m(k, this.m, this);
        this.l.a(this.n, this.o);
        if (!Float.isNaN(this.s)) {
            this.a(this.s);
        }
        Surface surface;
        if (this.t != null) {
            surface = (Surface)this.t.get();
        }
        else {
            surface = null;
        }
        if (surface != null) {
            this.b(surface);
        }
    }
    
    @Override
    public void a(final MediaCodec$CryptoException ex) {
    }
    
    @Override
    public void a(final Surface surface) {
    }
    
    @Override
    public void a(final SurfaceHolder surfaceHolder) {
        Surface surface;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        }
        else {
            surface = null;
        }
        if (e.a) {
            Log.d("AVMediaExoPlayer", "setSurface(Display)" + surfaceHolder + "=>" + surface);
        }
        this.b(surface);
    }
    
    @Override
    public void a(final ExoPlaybackException u) {
        this.a(AVMediaPlayer$PlayerState.a);
        this.p = 1;
        this.u = u;
        if (this.c != null) {
            this.c.a(0, u.getMessage());
        }
    }
    
    @Override
    public void a(final MediaCodecTrackRenderer$DecoderInitializationException ex) {
    }
    
    @Override
    public void a(final AudioTrack$InitializationException ex) {
    }
    
    @Override
    public void a(final boolean b, final int p2) {
        boolean v = true;
        final int p3 = this.p;
        this.p = p2;
        if (p2 == 2) {
            this.v = v;
            this.a(AVMediaPlayer$PlayerState.c);
        }
        if (this.v && p2 == 4) {
            this.a(AVMediaPlayer$PlayerState.d);
            this.v = false;
            if (this.c != null) {
                this.c.a(this.q, this.r, false, false);
            }
        }
        if (p2 == 3) {
            if (this.w() == AVMediaPlayer$PlayerState.e || this.v() == AVMediaPlayer$PlayerState.e) {
                this.l.a(v);
            }
            if (p3 != 2 && p3 != p2 && this.c != null) {
                this.c.b(701, 0);
            }
            this.b(false);
        }
        if (p3 == 3 && p2 == 4 && this.c != null) {
            this.c.b(702, 0);
        }
        if (p2 == 5) {
            this.a(AVMediaPlayer$PlayerState.g);
            this.b(v);
            if (this.d != null) {
                this.d.onCompletion((MediaPlayer)null);
            }
        }
        if (p2 == 4 && !b && this.w() == AVMediaPlayer$PlayerState.e) {
            final a f = this.f;
            if (this.i != AVPlayer$PlayerStartType.a) {
                v = false;
            }
            this.a(f, v);
        }
        if (b && p2 == 4) {
            this.a(AVMediaPlayer$PlayerState.e);
            this.a(this.i);
            if (this.c != null) {
                this.c.a(this.i);
            }
            this.i = AVPlayer$PlayerStartType.b;
        }
    }
    
    @Override
    public void b(final Surface surface) {
        if (e.a) {
            Log.d("AVMediaExoPlayer", "setSurface(Surface)" + surface);
        }
        if (this.n != null) {
            this.t.clear();
            this.l.b(this.n, 1, surface);
            return;
        }
        this.t = new WeakReference((T)surface);
    }
    
    @Override
    public f c() {
        return this.b;
    }
    
    @Override
    protected int d() {
        return this.q;
    }
    
    @Override
    protected int e() {
        return this.r;
    }
    
    @Override
    protected long f() {
        return this.l.b();
    }
    
    @Override
    protected long g() {
        return this.l.c();
    }
    
    @Override
    protected int h() {
        return 0;
    }
    
    @Override
    protected String i() {
        if (this.u != null) {
            return this.u.getMessage();
        }
        return null;
    }
    
    @Override
    protected boolean j() {
        return this.l != null;
    }
    
    @Override
    protected void k() {
        this.b(AVMediaPlayer$PlayerState.e);
        this.l.a(true);
    }
    
    @Override
    protected void l() {
        this.b(AVMediaPlayer$PlayerState.f);
        this.l.a(false);
    }
    
    @Override
    protected void m() {
        this.l.b(this);
        this.l.a();
    }
    
    @Override
    protected void n() {
    }
}
