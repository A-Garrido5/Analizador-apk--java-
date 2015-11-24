// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.content.Context;
import java.util.Map;
import com.twitter.library.av.model.a;
import android.media.MediaPlayer$OnCompletionListener;
import com.twitter.library.av.l;

public abstract class ax implements AVMediaPlayer
{
    protected final f b;
    protected l c;
    protected MediaPlayer$OnCompletionListener d;
    protected com.twitter.library.av.playback.l e;
    protected a f;
    protected String g;
    protected Map h;
    protected AVPlayer$PlayerStartType i;
    AVMediaPlayer$PlayerState j;
    AVMediaPlayer$PlayerState k;
    
    public ax(final f b) {
        this.i = AVPlayer$PlayerStartType.c;
        this.j = AVMediaPlayer$PlayerState.b;
        this.k = AVMediaPlayer$PlayerState.b;
        this.b = b;
        this.e = new com.twitter.library.av.playback.l(this);
    }
    
    private boolean a() {
        return this.v() == AVMediaPlayer$PlayerState.c;
    }
    
    private void b() {
        this.a(AVMediaPlayer$PlayerState.b);
        this.b(AVMediaPlayer$PlayerState.b);
    }
    
    protected abstract void a(final int p0);
    
    protected abstract void a(final Context p0);
    
    @Override
    public void a(final Context context, final a f, final Map h) {
        this.f = f;
        this.g = f.a();
        this.h = h;
        this.b();
        this.a(context);
    }
    
    @Override
    public void a(final MediaPlayer$OnCompletionListener d) {
        this.d = d;
    }
    
    @Override
    public void a(final SurfaceHolder surfaceHolder) {
    }
    
    @Override
    public void a(final l c) {
        this.c = c;
        final AVMediaPlayer$PlayerState v = this.v();
        if (this.c != null) {
            if (this.x()) {
                this.c.a(this.d(), this.e());
            }
            if (v == AVMediaPlayer$PlayerState.g) {
                this.c.f();
            }
            else if (this.x()) {
                this.c.a(this.d(), this.e(), this.f() <= this.g(), false);
            }
            else if (v == AVMediaPlayer$PlayerState.a) {
                this.c.a(this.h(), this.i());
            }
            this.c.h();
        }
    }
    
    @Override
    public void a(final a a, final boolean b) {
        final AVMediaPlayer$PlayerState v = this.v();
        AVPlayer$PlayerStartType i;
        if (v == AVMediaPlayer$PlayerState.f || v == AVMediaPlayer$PlayerState.e) {
            i = AVPlayer$PlayerStartType.b;
        }
        else if (b) {
            i = AVPlayer$PlayerStartType.a;
        }
        else {
            i = AVPlayer$PlayerStartType.c;
        }
        this.i = i;
        if (this.x()) {
            if (b) {
                this.b(0);
            }
            this.k();
            this.a(AVMediaPlayer$PlayerState.e);
            this.n();
        }
        this.b(AVMediaPlayer$PlayerState.e);
    }
    
    protected void a(final AVMediaPlayer$PlayerState j) {
        synchronized (this) {
            this.j = j;
        }
    }
    
    protected void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        if (this.e == null) {
            this.e = new com.twitter.library.av.playback.l(this);
        }
        this.e.a(avPlayer$PlayerStartType);
        this.e.a();
    }
    
    @Override
    public void a(final boolean b) {
        if (this.e != null) {
            this.e.c();
            this.e = null;
        }
        this.a(AVMediaPlayer$PlayerState.b);
        if (b) {
            this.b(AVMediaPlayer$PlayerState.b);
        }
        this.m();
    }
    
    @Override
    public void b(final int n) {
        if (this.j() && this.x()) {
            this.b(false);
            this.a(n);
            if (this.g() >= this.f() && this.v() != AVMediaPlayer$PlayerState.e) {
                this.a(AVMediaPlayer$PlayerState.g);
                this.b(AVMediaPlayer$PlayerState.g);
                this.d.onCompletion((MediaPlayer)null);
            }
        }
    }
    
    protected void b(final AVMediaPlayer$PlayerState k) {
        synchronized (this) {
            this.k = k;
        }
    }
    
    protected void b(final boolean b) {
        if (this.e != null) {
            this.e.b();
            if (b) {
                this.e.e();
            }
        }
    }
    
    @Override
    public f c() {
        return this.b;
    }
    
    protected abstract int d();
    
    protected abstract int e();
    
    protected abstract long f();
    
    protected abstract long g();
    
    protected abstract int h();
    
    protected abstract String i();
    
    protected abstract boolean j();
    
    protected abstract void k();
    
    protected abstract void l();
    
    protected abstract void m();
    
    protected abstract void n();
    
    @Override
    public boolean o() {
        return this.v() == AVMediaPlayer$PlayerState.e;
    }
    
    @Override
    public void p() {
        if (this.j() && (this.o() || this.a())) {
            this.a(AVMediaPlayer$PlayerState.f);
            this.b(AVMediaPlayer$PlayerState.f);
            this.b(false);
            this.l();
            if (this.c != null) {
                this.c.j();
            }
        }
    }
    
    @Override
    public boolean q() {
        return this.v() == AVMediaPlayer$PlayerState.f;
    }
    
    @Override
    public boolean r() {
        return this.v() == AVMediaPlayer$PlayerState.g;
    }
    
    @Override
    public void s() {
        this.b(false);
    }
    
    @Override
    public void t() {
        if (this.e != null) {
            this.e.a();
        }
    }
    
    @Override
    public aw u() {
        if (this.j() && this.x()) {
            return aw.a(this.g(), this.f());
        }
        return new aw(0L, 0L, 0);
    }
    
    protected AVMediaPlayer$PlayerState v() {
        synchronized (this) {
            return this.j;
        }
    }
    
    protected AVMediaPlayer$PlayerState w() {
        synchronized (this) {
            return this.k;
        }
    }
    
    public boolean x() {
        final AVMediaPlayer$PlayerState v = this.v();
        return this.j() && v != AVMediaPlayer$PlayerState.a && v != AVMediaPlayer$PlayerState.b && v != AVMediaPlayer$PlayerState.c;
    }
}
