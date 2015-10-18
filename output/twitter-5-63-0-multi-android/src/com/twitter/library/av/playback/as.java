// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.client.App;
import com.twitter.library.util.bq;
import com.twitter.android.av.t;
import android.view.SurfaceHolder;
import android.view.Surface;
import android.media.MediaPlayer$OnCompletionListener;
import com.twitter.library.av.l;
import android.content.Context;
import java.util.HashMap;
import android.os.Handler;
import com.twitter.library.av.model.b;
import com.twitter.library.av.model.a;
import java.util.Map;

public class as
{
    final Map a;
    private AVMediaPlayer b;
    private AVMediaPlayer c;
    private AVMediaPlayer d;
    private a e;
    private b f;
    private AVPlayer g;
    private Handler h;
    private a i;
    private a j;
    private final ba k;
    
    public as() {
        this.a = new HashMap();
        this.k = new ba();
    }
    
    private a a(final b b, final a a, final PlaybackMode playbackMode) {
        for (int i = 0; i < b.c(); ++i) {
            final a a2 = b.a(i);
            final boolean equals = a2.equals(a);
            this.a(a2, b, equals);
            if (equals) {
                this.k.a(a2, playbackMode);
            }
        }
        return this.d();
    }
    
    private a a(final PlaybackMode playbackMode, final b b) {
        a a;
        a a2;
        if (b.c() > 1) {
            a = b.a(0);
            a2 = b.a(1);
        }
        else {
            a2 = b.a(0);
            a = null;
        }
        switch (at.a[playbackMode.ordinal()]) {
            default: {
                if (a == null) {
                    a = a2;
                }
                a2 = a;
                return a2;
            }
            case 1: {
                return a2;
            }
        }
    }
    
    private void a(final a a, final b b, final boolean b2) {
        final Context o = this.g.O();
        final AVMediaPlayer a2 = this.a(this.g.N(), b, a);
        if ("ad".equals(a.b())) {
            this.a(a2);
            this.i = a;
        }
        else {
            this.b(a2);
            this.j = a;
        }
        if (b2) {
            this.e(a2);
            this.c(a2);
            this.a(a);
        }
        a2.a(o, a, b.d());
    }
    
    static void a(final boolean b, final AVMediaPlayer avMediaPlayer) {
        avMediaPlayer.a((l)null);
        avMediaPlayer.a((MediaPlayer$OnCompletionListener)null);
        if (b) {
            avMediaPlayer.b(null);
        }
        else {
            avMediaPlayer.a((SurfaceHolder)null);
        }
        if (!t.a()) {
            avMediaPlayer.a(true);
        }
    }
    
    static void d(final AVMediaPlayer avMediaPlayer) {
        a(bq.a(), avMediaPlayer);
    }
    
    private void e(final AVMediaPlayer avMediaPlayer) {
        if (bq.a()) {
            avMediaPlayer.b(this.g.n());
        }
        else {
            avMediaPlayer.a(this.g.o());
        }
        avMediaPlayer.a((MediaPlayer$OnCompletionListener)this.g);
        avMediaPlayer.a(this.g.m());
    }
    
    private boolean j() {
        int n = 0;
        boolean b;
        while (true) {
            final int c = this.f.c();
            b = false;
            if (n >= c) {
                break;
            }
            final a a = this.f.a(n);
            if ("ad".equals(a.b()) && this.k.a(a)) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
    
    public long a(final boolean b) {
        long a = 0L;
        if (this.c() != null) {
            a = this.c().u().a;
            this.c((AVMediaPlayer)null);
            this.a((a)null);
        }
        if (this.a() != null) {
            this.a().a(true);
            this.a((AVMediaPlayer)null);
        }
        if (this.b() != null) {
            this.b().a(true);
            this.b((AVMediaPlayer)null);
        }
        if (b) {
            this.k.a();
        }
        return a;
    }
    
    AVMediaPlayer a() {
        return this.b;
    }
    
    AVMediaPlayer a(final j j, final b b, final a a) {
        if (!this.a.containsKey(a)) {
            this.a.put(a, bc.a(this.g, a));
        }
        return j.a(b, this.a.get(a), this.h);
    }
    
    void a(final a e) {
        this.e = e;
    }
    
    void a(final AVMediaPlayer b) {
        this.b = b;
    }
    
    public void a(final AVPlayer g, final Handler h) {
        this.g = g;
        this.h = h;
    }
    
    public boolean a(final b f) {
        if (this.f == null) {
            if (App.a()) {
                throw new IllegalStateException("Requested a re-buffer with in an illegal state");
            }
            this.b(f);
        }
        else {
            for (int i = 0; i < f.c(); ++i) {
                final a a = f.a(i);
                a a3;
                AVMediaPlayer avMediaPlayer;
                if ("ad".equals(a.b())) {
                    final a j = this.i;
                    final AVMediaPlayer a2 = this.a();
                    a3 = j;
                    avMediaPlayer = a2;
                }
                else {
                    final a k = this.j;
                    final AVMediaPlayer b = this.b();
                    a3 = k;
                    avMediaPlayer = b;
                }
                if (!a3.equals(a)) {
                    final f f2 = this.a.get(a3);
                    if (f2 != null) {
                        this.a.put(a, f2);
                    }
                }
                int n;
                if (!a3.a().equals(a.a())) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    final AVMediaPlayer c = this.c();
                    final boolean b2 = false;
                    if (c == avMediaPlayer) {
                        return b2;
                    }
                    this.a(a, f, false);
                }
            }
        }
        this.f = f;
        return true;
    }
    
    public a b(final b f) {
        final PlaybackMode i = this.g.I();
        final a a = this.a(i, f);
        this.f = f;
        return this.a(f, a, i);
    }
    
    AVMediaPlayer b() {
        return this.c;
    }
    
    void b(final AVMediaPlayer c) {
        this.c = c;
    }
    
    public AVMediaPlayer c() {
        return this.d;
    }
    
    void c(final AVMediaPlayer d) {
        this.d = d;
    }
    
    public boolean c(final b b) {
        if (App.a() && !b.equals(this.f)) {
            throw new IllegalStateException("Playlists do not match!");
        }
        if (App.a() && this.c() == null) {
            throw new IllegalStateException("onMediaComplete was called without an active buffer");
        }
        final PlaybackMode i = this.g.I();
        switch (at.a[i.ordinal()]) {
            default: {
                if (this.c() == this.a()) {
                    final a a = b.a(1);
                    d(this.a());
                    this.e(this.b());
                    this.a(a);
                    this.c(this.b());
                    this.k.a(a, i);
                    return true;
                }
                return false;
            }
            case 1: {
                return false;
            }
        }
    }
    
    public a d() {
        return this.e;
    }
    
    public boolean d(final b b) {
        if (App.a() && !b.equals(this.f)) {
            throw new IllegalStateException("Playlists do not match!");
        }
        final PlaybackMode i = this.g.I();
        final int n = at.a[i.ordinal()];
        boolean b2 = false;
        switch (n) {
            default: {
                final AVMediaPlayer c = this.c();
                final AVMediaPlayer b3 = this.b();
                b2 = false;
                if (c != b3) {
                    return b2;
                }
                final AVMediaPlayer a = this.a();
                b2 = false;
                if (a == null) {
                    return b2;
                }
                final boolean j = this.j();
                b2 = false;
                if (!j) {
                    final a a2 = b.a(0);
                    d(this.b());
                    this.b().p();
                    this.a(a2);
                    this.c(this.a());
                    this.e(this.a());
                    this.a().a(null, false);
                    this.k.a(a2, i);
                    b2 = true;
                    return b2;
                }
                return b2;
            }
            case 1: {
                return b2;
            }
        }
    }
    
    public Map e() {
        return this.a;
    }
    
    public ba f() {
        return this.k;
    }
    
    public void g() {
        this.a.clear();
    }
    
    public boolean h() {
        int n = 1;
        int c;
        if (this.f != null) {
            c = this.f.c();
        }
        else {
            c = -1;
        }
        if (this.g.I() == PlaybackMode.d) {
            return false;
        }
        if (this.c() != null) {
            boolean b;
            if (c > n && this.c() == this.a()) {
                b = (n != 0);
            }
            else {
                b = false;
            }
            return b;
        }
        if (c <= 0) {
            n = 0;
        }
        return n != 0;
    }
    
    public boolean i() {
        int c;
        if (this.f != null) {
            c = this.f.c();
        }
        else {
            c = -1;
        }
        return c == 1 || this.k.b() == 1;
    }
}
