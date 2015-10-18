// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.media.MediaCodec;
import android.os.Handler;
import android.view.Surface;
import android.annotation.TargetApi;

@TargetApi(16)
public class y extends MediaCodecTrackRenderer
{
    private final ad c;
    private final ac d;
    private final long e;
    private final int f;
    private final int g;
    private Surface h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private int m;
    private int n;
    private int o;
    private float p;
    private int q;
    private int r;
    private float s;
    
    public y(final ah ah, final int n, final long n2, final Handler handler, final ac ac, final int n3) {
        this(ah, null, true, n, n2, null, handler, ac, n3);
    }
    
    public y(final ah ah, final ad ad, final boolean b, final int f, final long n, final ad c, final Handler handler, final ac d, final int g) {
        super(ah, ad, b, handler, d);
        this.f = f;
        this.e = 1000L * n;
        this.c = c;
        this.d = d;
        this.g = g;
        this.k = -1L;
        this.n = -1;
        this.o = -1;
        this.p = -1.0f;
        this.q = -1;
        this.r = -1;
        this.s = -1.0f;
    }
    
    private void a(final MediaCodec mediaCodec, final int n) {
        ah.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(n, false);
        ah.a();
        final a a = this.a;
        ++a.f;
    }
    
    @TargetApi(21)
    private void a(final MediaCodec mediaCodec, final int n, final long n2) {
        this.w();
        ah.a("releaseOutputBufferTimed");
        mediaCodec.releaseOutputBuffer(n, n2);
        ah.a();
        final a a = this.a;
        ++a.e;
        this.x();
    }
    
    private void a(final Surface h) {
        if (this.h != h) {
            this.h = h;
            this.i = false;
            final int q = this.q();
            if (q == 2 || q == 3) {
                this.l();
                this.i();
            }
        }
    }
    
    private void b(final MediaCodec mediaCodec, final int n) {
        ah.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(n, false);
        ah.a();
        final a a = this.a;
        ++a.g;
        ++this.m;
        if (this.m == this.g) {
            this.y();
        }
    }
    
    private void c(final MediaCodec mediaCodec, final int n) {
        this.w();
        ah.a("renderVideoBufferImmediate");
        mediaCodec.releaseOutputBuffer(n, true);
        ah.a();
        final a a = this.a;
        ++a.e;
        this.x();
    }
    
    private void w() {
        if (this.b == null || this.d == null || (this.q == this.n && this.r == this.o && this.s == this.p)) {
            return;
        }
        final int n = this.n;
        final int o = this.o;
        final float p = this.p;
        this.b.post((Runnable)new z(this, n, o, p));
        this.q = n;
        this.r = o;
        this.s = p;
    }
    
    private void x() {
        if (this.b == null || this.d == null || this.i) {
            return;
        }
        this.b.post((Runnable)new aa(this, this.h));
        this.i = true;
    }
    
    private void y() {
        if (this.b == null || this.d == null || this.m == 0) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b.post((Runnable)new ab(this, this.m, elapsedRealtime - this.l));
        this.m = 0;
        this.l = elapsedRealtime;
    }
    
    @Override
    public void a(final int n, final Object o) {
        if (n == 1) {
            this.a((Surface)o);
            return;
        }
        super.a(n, o);
    }
    
    @Override
    protected void a(final long n) {
        super.a(n);
        this.j = false;
        this.k = -1L;
    }
    
    @Override
    protected void a(final long n, final boolean b) {
        super.a(n, b);
        this.j = false;
        if (b && this.e > 0L) {
            this.k = 1000L * SystemClock.elapsedRealtime() + this.e;
        }
        if (this.c != null) {
            this.c.a();
        }
    }
    
    @Override
    protected void a(final MediaCodec mediaCodec, final MediaFormat mediaFormat, final MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, this.h, mediaCrypto, 0);
        mediaCodec.setVideoScalingMode(this.f);
    }
    
    @Override
    protected void a(final MediaFormat mediaFormat) {
        boolean b;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            b = true;
        }
        else {
            b = false;
        }
        int integer;
        if (b) {
            integer = 1 + (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left"));
        }
        else {
            integer = mediaFormat.getInteger("width");
        }
        this.n = integer;
        int integer2;
        if (b) {
            integer2 = 1 + (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top"));
        }
        else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.o = integer2;
    }
    
    @Override
    protected void a(final af af) {
        super.a(af);
        float e;
        if (af.a.e == -1.0f) {
            e = 1.0f;
        }
        else {
            e = af.a.e;
        }
        this.p = e;
    }
    
    @Override
    protected boolean a(final long n, final long n2, final MediaCodec mediaCodec, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo, final int n3, final boolean b) {
        if (b) {
            this.a(mediaCodec, n3);
            return true;
        }
        long n4 = mediaCodec$BufferInfo.presentationTimeUs - n - (1000L * SystemClock.elapsedRealtime() - n2);
        final long nanoTime = System.nanoTime();
        long a = nanoTime + 1000L * n4;
        if (this.c != null) {
            a = this.c.a(mediaCodec$BufferInfo.presentationTimeUs, a);
            n4 = (a - nanoTime) / 1000L;
        }
        if (n4 < -30000L) {
            this.b(mediaCodec, n3);
            return true;
        }
        if (!this.j) {
            this.c(mediaCodec, n3);
            return this.j = true;
        }
        if (this.q() != 3) {
            return false;
        }
        if (ai.a >= 21) {
            if (n4 < 50000L) {
                this.a(mediaCodec, n3, a);
                return true;
            }
        }
        else if (n4 < 30000L) {
            while (true) {
                if (n4 <= 11000L) {
                    break Label_0205;
                }
                final long n5 = n4 - 10000L;
                try {
                    Thread.sleep(n5 / 1000L);
                    this.c(mediaCodec, n3);
                    return true;
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    continue;
                }
                break;
            }
        }
        return false;
    }
    
    @Override
    protected boolean a(final MediaCodec mediaCodec, final boolean b, final ae ae, final ae ae2) {
        return ae2.a.equals(ae.a) && (b || (ae.c == ae2.c && ae.d == ae2.d));
    }
    
    @Override
    protected boolean a(final String s) {
        return af.c(s) && super.a(s);
    }
    
    @Override
    protected void b() {
        super.b();
        this.m = 0;
        this.l = SystemClock.elapsedRealtime();
    }
    
    @Override
    protected void c() {
        this.k = -1L;
        this.y();
        super.c();
    }
    
    @Override
    protected boolean e() {
        if (super.e() && (this.j || !this.k() || this.p() == 2)) {
            this.k = -1L;
        }
        else {
            if (this.k == -1L) {
                return false;
            }
            if (1000L * SystemClock.elapsedRealtime() >= this.k) {
                this.k = -1L;
                return false;
            }
        }
        return true;
    }
    
    public void g() {
        this.n = -1;
        this.o = -1;
        this.p = -1.0f;
        this.q = -1;
        this.r = -1;
        this.s = -1.0f;
        if (this.c != null) {
            this.c.b();
        }
        super.g();
    }
    
    @Override
    protected boolean j() {
        return super.j() && this.h != null;
    }
}
