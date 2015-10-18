// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer.audio;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import android.os.ConditionVariable;
import android.annotation.TargetApi;

@TargetApi(16)
public final class AudioTrack
{
    private byte[] A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private final ConditionVariable a;
    private final b b;
    private final long[] c;
    private final float d;
    private android.media.AudioTrack e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private long n;
    private long o;
    private boolean p;
    private long q;
    private long r;
    private long s;
    private Method t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private float z;
    
    public AudioTrack() {
        this(4.0f);
    }
    
    public AudioTrack(final float d) {
        Label_0094: {
            if (d < 1.0f) {
                break Label_0094;
            }
            boolean b = true;
        Label_0052_Outer:
            while (true) {
                ae.a(b);
                this.d = d;
                this.a = new ConditionVariable(true);
                Label_0099: {
                    if (ai.a < 19) {
                        break Label_0099;
                    }
                    this.b = new c();
                Label_0075_Outer:
                    while (true) {
                        while (true) {
                            if (ai.a < 18) {
                                break Label_0075;
                            }
                            try {
                                this.t = android.media.AudioTrack.class.getMethod("getLatency", (Class<?>[])null);
                                this.c = new long[10];
                                this.z = 1.0f;
                                this.v = 0;
                                return;
                                b = false;
                                continue Label_0052_Outer;
                                this.b = new d(null);
                                continue Label_0075_Outer;
                            }
                            catch (NoSuchMethodException ex) {
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    @TargetApi(21)
    private static int a(final android.media.AudioTrack audioTrack, final ByteBuffer byteBuffer, final int n) {
        return audioTrack.write(byteBuffer, n, 1);
    }
    
    private long a(final long n) {
        return n * this.i;
    }
    
    @TargetApi(21)
    private static void a(final android.media.AudioTrack audioTrack, final float volume) {
        audioTrack.setVolume(volume);
    }
    
    private long b(final long n) {
        if (this.D) {
            return 8L * n * this.f / (1000 * this.E);
        }
        return n / this.i;
    }
    
    private static void b(final android.media.AudioTrack audioTrack, final float n) {
        audioTrack.setStereoVolume(n, n);
    }
    
    private long c(final long n) {
        return 1000000L * n / this.f;
    }
    
    private long d(final long n) {
        return n * this.f / 1000000L;
    }
    
    private boolean i() {
        return this.a() && this.w != 0L;
    }
    
    private void j() {
        final long m = this.m();
        if (m != 0L) {
            final long n = System.nanoTime() / 1000L;
            if (n - this.o >= 30000L) {
                this.c[this.l] = m - n;
                this.l = (1 + this.l) % 10;
                if (this.m < 10) {
                    ++this.m;
                }
                this.o = n;
                this.n = 0L;
                for (int i = 0; i < this.m; ++i) {
                    this.n += this.c[i] / this.m;
                }
            }
            if (n - this.q >= 500000L) {
                this.p = this.b.a(this.e);
                Label_0307: {
                    if (this.p) {
                        final long n2 = this.b.a() / 1000L;
                        if (n2 >= this.x) {
                            break Label_0307;
                        }
                        this.p = false;
                    }
                Label_0301_Outer:
                    while (true) {
                        while (true) {
                            if (this.t == null) {
                                break Label_0301;
                            }
                            try {
                                this.y = 1000L * (int)this.t.invoke(this.e, (Object[])null) - this.c(this.b(this.k));
                                this.y = Math.max(this.y, 0L);
                                if (this.y > 10000000L) {
                                    Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.y);
                                    this.y = 0L;
                                }
                                this.q = n;
                                return;
                                // iftrue(Label_0194:, Math.abs(n2 - n) <= 10000000L)
                                this.p = false;
                                final long n2;
                                Log.w("AudioTrack", "Spurious audio timestamp: " + this.b.b() + ", " + n2 + ", " + n);
                                continue Label_0301_Outer;
                            }
                            catch (Exception ex) {
                                this.t = null;
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    private void k() {
        final int state = this.e.getState();
        if (state == 1) {
            return;
        }
        try {
            this.e.release();
            this.e = null;
            throw new AudioTrack$InitializationException(state, this.f, this.g, this.k);
        }
        catch (Exception ex) {
            this.e = null;
            throw new AudioTrack$InitializationException(state, this.f, this.g, this.k);
        }
        finally {
            this.e = null;
        }
    }
    
    private long l() {
        final long r = 0xFFFFFFFFL & this.e.getPlaybackHeadPosition();
        if (this.r > r) {
            ++this.s;
        }
        this.r = r;
        return r + (this.s << 32);
    }
    
    private long m() {
        return this.c(this.l());
    }
    
    private void n() {
        this.n = 0L;
        this.m = 0;
        this.l = 0;
        this.o = 0L;
        this.p = false;
        this.q = 0L;
    }
    
    public int a(final int n) {
        this.a.block();
        if (n == 0) {
            this.e = new android.media.AudioTrack(3, this.f, this.g, this.h, this.k, 1);
        }
        else {
            this.e = new android.media.AudioTrack(3, this.f, this.g, this.h, this.k, 1, n);
        }
        this.k();
        this.a(this.z);
        return this.e.getAudioSessionId();
    }
    
    public int a(final ByteBuffer byteBuffer, final int n, final int c, final long n2) {
        final int c2 = this.C;
        boolean b = false;
        if (c2 == 0) {
            b = false;
            if (c != 0) {
                if (this.D && this.E == 0) {
                    this.E = (768000 + c * 8 * this.f) / 1536000;
                }
                final long n3 = n2 - this.c(this.b(c));
                if (this.w == 0L) {
                    this.w = Math.max(0L, n3);
                    this.v = 1;
                }
                else {
                    final long n4 = this.w + this.c(this.b(this.u));
                    if (this.v == 1 && Math.abs(n4 - n3) > 200000L) {
                        Log.e("AudioTrack", "Discontinuity detected [expected " + n4 + ", got " + n3 + "]");
                        this.v = 2;
                    }
                    final int v = this.v;
                    b = false;
                    if (v == 2) {
                        this.w += n3 - n4;
                        this.v = 1;
                        b = true;
                    }
                }
            }
        }
        if (c == 0) {
            return b ? 1 : 0;
        }
        if (this.C == 0) {
            this.C = c;
            byteBuffer.position(n);
            if (ai.a < 21) {
                if (this.A == null || this.A.length < c) {
                    this.A = new byte[c];
                }
                byteBuffer.get(this.A, 0, c);
                this.B = 0;
            }
        }
        int n6;
        if (ai.a < 21) {
            final int n5 = this.k - (int)(this.u - this.a(this.l()));
            n6 = 0;
            if (n5 > 0) {
                n6 = this.e.write(this.A, this.B, Math.min(this.C, n5));
                if (n6 < 0) {
                    Log.w("AudioTrack", "AudioTrack.write returned error code: " + n6);
                }
                else {
                    this.B += n6;
                }
            }
        }
        else {
            n6 = a(this.e, byteBuffer, this.C);
        }
        this.C -= n6;
        this.u += n6;
        int n7;
        if (this.C == 0) {
            n7 = ((b ? 1 : 0) | 0x2);
        }
        else {
            n7 = (b ? 1 : 0);
        }
        return n7;
    }
    
    public long a(final boolean b) {
        long n;
        if (!this.i()) {
            n = Long.MIN_VALUE;
        }
        else {
            if (this.e.getPlayState() == 3) {
                this.j();
            }
            final long n2 = System.nanoTime() / 1000L;
            if (this.p) {
                return this.c(this.d(n2 - this.b.a() / 1000L) + this.b.b()) + this.w;
            }
            if (this.m == 0) {
                n = this.m() + this.w;
            }
            else {
                n = n2 + this.n + this.w;
            }
            if (!b) {
                return n - this.y;
            }
        }
        return n;
    }
    
    public void a(final float z) {
        this.z = z;
        if (this.e != null) {
            if (ai.a < 21) {
                b(this.e, z);
                return;
            }
            a(this.e, z);
        }
    }
    
    public void a(final MediaFormat mediaFormat) {
        this.a(mediaFormat, 2, 0);
    }
    
    @SuppressLint({ "InlinedApi" })
    public void a(final MediaFormat mediaFormat, final int h, int k) {
        final int integer = mediaFormat.getInteger("channel-count");
        int g = 0;
        switch (integer) {
            default: {
                throw new IllegalArgumentException("Unsupported channel count: " + integer);
            }
            case 1: {
                g = 4;
                break;
            }
            case 2: {
                g = 12;
                break;
            }
            case 6: {
                g = 252;
                break;
            }
            case 8: {
                g = 1020;
                break;
            }
        }
        final int integer2 = mediaFormat.getInteger("sample-rate");
        final boolean d = h == 5 || h == 6;
        if (this.e != null && this.f == integer2 && this.g == g && !this.D && !d) {
            return;
        }
        this.h();
        this.j = android.media.AudioTrack.getMinBufferSize(integer2, g, h);
        this.h = h;
        if (k == 0) {
            k = (int)(this.d * this.j);
        }
        this.k = k;
        this.f = integer2;
        this.g = g;
        this.D = d;
        this.E = 0;
        this.i = integer * 2;
    }
    
    public boolean a() {
        return this.e != null;
    }
    
    public int b() {
        return this.a(0);
    }
    
    public void c() {
        if (this.a()) {
            this.x = System.nanoTime() / 1000L;
            this.e.play();
        }
    }
    
    public void d() {
        if (this.v == 1) {
            this.v = 2;
        }
    }
    
    public boolean e() {
        return this.e != null && this.b(this.u) > this.l();
    }
    
    public boolean f() {
        return this.u >= this.j;
    }
    
    public void g() {
        if (this.e != null) {
            this.n();
            this.e.pause();
        }
    }
    
    public void h() {
        if (this.e != null) {
            this.u = 0L;
            this.C = 0;
            this.r = 0L;
            this.s = 0L;
            this.w = 0L;
            this.n();
            if (this.e.getPlayState() == 3) {
                this.e.pause();
            }
            final android.media.AudioTrack e = this.e;
            this.e = null;
            this.a.close();
            new a(this, e).start();
        }
    }
}
