// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.view.Surface;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import java.io.IOException;
import android.os.SystemClock;
import android.media.MediaCodec$CryptoException;
import android.media.MediaCodec$CryptoInfo;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import java.util.Map;
import android.media.MediaCodec$BufferInfo;
import java.util.List;
import android.os.Handler;
import android.annotation.TargetApi;

@TargetApi(16)
public abstract class MediaCodecTrackRenderer extends aj
{
    private boolean A;
    private boolean B;
    private long C;
    public final a a;
    protected final Handler b;
    private final ad c;
    private final boolean d;
    private final ah e;
    private final ag f;
    private final af g;
    private final List h;
    private final MediaCodec$BufferInfo i;
    private final r j;
    private ae k;
    private Map l;
    private MediaCodec m;
    private boolean n;
    private ByteBuffer[] o;
    private ByteBuffer[] p;
    private long q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;
    
    public MediaCodecTrackRenderer(final ah e, final ad c, final boolean d, final Handler b, final r j) {
        ae.b(ai.a >= 16);
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
        this.j = j;
        this.a = new a();
        this.f = new ag(0);
        this.g = new af();
        this.h = new ArrayList();
        this.i = new MediaCodec$BufferInfo();
    }
    
    private static MediaCodec$CryptoInfo a(final ag ag, final int n) {
        final MediaCodec$CryptoInfo a = ag.a.a();
        if (n == 0) {
            return a;
        }
        if (a.numBytesOfClearData == null) {
            a.numBytesOfClearData = new int[1];
        }
        final int[] numBytesOfClearData = a.numBytesOfClearData;
        numBytesOfClearData[0] += n;
        return a;
    }
    
    private void a(final MediaCodec$CryptoException ex) {
        if (this.b != null && this.j != null) {
            this.b.post((Runnable)new q(this, ex));
        }
    }
    
    private void a(final MediaCodecTrackRenderer$DecoderInitializationException ex) {
        if (this.b != null && this.j != null) {
            this.b.post((Runnable)new p(this, ex));
        }
    }
    
    private boolean a(final boolean b) {
        if (this.y) {
            return false;
        }
        if (this.r < 0) {
            this.r = this.m.dequeueInputBuffer(0L);
            if (this.r < 0) {
                return false;
            }
            (this.f.b = this.o[this.r]).clear();
        }
        int a;
        if (this.A) {
            a = -3;
        }
        else {
            if (this.v == 1) {
                for (int i = 0; i < this.k.i.size(); ++i) {
                    this.f.b.put((byte[])this.k.i.get(i));
                }
                this.v = 2;
            }
            a = this.e.a(this.w, this.C, this.g, this.f, false);
            if (b && this.x == 1 && a == -2) {
                this.x = 2;
            }
        }
        if (a == -2) {
            return false;
        }
        if (a == -5) {
            this.y();
            return true;
        }
        if (a == -4) {
            if (this.v == 2) {
                this.f.b.clear();
                this.v = 1;
            }
            this.a(this.g);
            return true;
        }
        if (a == -1) {
            if (this.v == 2) {
                this.f.b.clear();
                this.v = 1;
            }
            this.y = true;
            try {
                this.m.queueInputBuffer(this.r, 0, 0, 0L, 4);
                this.r = -1;
                return false;
            }
            catch (MediaCodec$CryptoException ex) {
                this.a(ex);
                throw new ExoPlaybackException((Throwable)ex);
            }
        }
        if (this.B) {
            if ((0x1 & this.f.d) == 0x0) {
                this.f.b.clear();
                if (this.v == 2) {
                    this.v = 1;
                }
                return true;
            }
            this.B = false;
        }
        final boolean b2 = (0x2 & this.f.d) != 0x0;
        this.A = this.b(b2);
        if (this.A) {
            return false;
        }
        try {
            final int position = this.f.b.position();
            final int n = position - this.f.c;
            final long e = this.f.e;
            if (this.f.f) {
                this.h.add(e);
            }
            if (b2) {
                this.m.queueSecureInputBuffer(this.r, 0, a(this.f, n), e, 0);
            }
            else {
                this.m.queueInputBuffer(this.r, 0, position, e, 0);
            }
            this.r = -1;
            this.v = 0;
            return true;
        }
        catch (MediaCodec$CryptoException ex2) {
            this.a(ex2);
            throw new ExoPlaybackException((Throwable)ex2);
        }
    }
    
    private void b(final long n) {
        this.f.b = null;
        int a = -3;
        while (a == -3 && this.C <= n) {
            a = this.e.a(this.w, this.C, this.g, this.f, false);
            if (a == -3) {
                if (this.f.f) {
                    continue;
                }
                this.C = this.f.e;
            }
            else {
                if (a != -4) {
                    continue;
                }
                this.a(this.g);
            }
        }
    }
    
    private boolean b(final long n, final long n2) {
        if (this.z) {
            return false;
        }
        if (this.s < 0) {
            this.s = this.m.dequeueOutputBuffer(this.i, 0L);
        }
        if (this.s == -2) {
            this.a(this.m.getOutputFormat());
            final a a = this.a;
            ++a.c;
            return true;
        }
        if (this.s == -3) {
            this.p = this.m.getOutputBuffers();
            final a a2 = this.a;
            ++a2.d;
            return true;
        }
        if (this.s < 0) {
            return false;
        }
        if ((0x4 & this.i.flags) != 0x0) {
            this.z = true;
            return false;
        }
        final int c = this.c(this.i.presentationTimeUs);
        if (this.a(n, n2, this.m, this.p[this.s], this.i, this.s, c != -1)) {
            if (c != -1) {
                this.h.remove(c);
            }
            else {
                this.C = this.i.presentationTimeUs;
            }
            this.s = -1;
            return true;
        }
        return false;
    }
    
    private boolean b(final boolean b) {
        if (this.t) {
            final int b2 = this.c.b();
            if (b2 == 0) {
                throw new ExoPlaybackException(this.c.d());
            }
            if (b2 != 4 && (b || !this.d)) {
                return true;
            }
        }
        return false;
    }
    
    private int c(final long n) {
        for (int size = this.h.size(), i = 0; i < size; ++i) {
            if ((long)this.h.get(i) == n) {
                return i;
            }
        }
        return -1;
    }
    
    private void w() {
        if (this.e.a(this.w, this.C, this.g, this.f, false) == -4) {
            this.a(this.g);
        }
    }
    
    private void x() {
        if (this.m != null && this.e.a(this.w, this.C, this.g, this.f, true) == -5) {
            this.y();
        }
    }
    
    private void y() {
        this.q = -1L;
        this.r = -1;
        this.s = -1;
        this.B = true;
        this.h.clear();
        if (ai.a >= 18) {
            this.m.flush();
        }
        else {
            this.l();
            this.i();
        }
        if (this.u && this.k != null) {
            this.v = 1;
        }
    }
    
    private boolean z() {
        return SystemClock.elapsedRealtime() < 1000L + this.q;
    }
    
    @Override
    protected void a(final long c) {
        this.C = c;
        this.e.b(c);
        this.x = 0;
        this.y = false;
        this.z = false;
        this.A = false;
    }
    
    @Override
    protected void a(final long n, final long n2) {
        while (true) {
            int x = 1;
        Label_0044_Outer:
            while (true) {
            Label_0160:
                while (true) {
                    Label_0103: {
                        try {
                            if (this.e.a(n)) {
                                if (this.x != 0) {
                                    x = this.x;
                                }
                                this.x = x;
                                this.x();
                                if (this.k == null) {
                                    this.w();
                                }
                                else {
                                    if (this.m != null || this.j() || this.q() != 3) {
                                        break Label_0103;
                                    }
                                    this.b(n);
                                }
                                this.a.a();
                                return;
                            }
                            break Label_0160;
                        }
                        catch (IOException ex) {
                            throw new ExoPlaybackException(ex);
                        }
                    }
                    if (this.m == null && this.j()) {
                        this.i();
                    }
                    if (this.m == null) {
                        continue;
                    }
                    while (this.b(n, n2)) {}
                    if (this.a(true)) {
                        while (this.a(false)) {}
                        continue;
                    }
                    continue;
                }
                x = 0;
                continue Label_0044_Outer;
            }
        }
    }
    
    @Override
    protected void a(final long c, final boolean b) {
        this.e.a(this.w, c);
        this.x = 0;
        this.y = false;
        this.z = false;
        this.A = false;
        this.C = c;
    }
    
    protected void a(final MediaCodec mediaCodec, final MediaFormat mediaFormat, final MediaCrypto mediaCrypto) {
        mediaCodec.configure(mediaFormat, (Surface)null, mediaCrypto, 0);
    }
    
    protected void a(final MediaFormat mediaFormat) {
    }
    
    protected void a(final af af) {
        final ae k = this.k;
        this.k = af.a;
        this.l = af.b;
        if (this.m != null && this.a(this.m, this.n, k, this.k)) {
            this.u = true;
            this.v = 1;
            return;
        }
        this.l();
        this.i();
    }
    
    protected abstract boolean a(final long p0, final long p1, final MediaCodec p2, final ByteBuffer p3, final MediaCodec$BufferInfo p4, final int p5, final boolean p6);
    
    protected boolean a(final MediaCodec mediaCodec, final boolean b, final ae ae, final ae ae2) {
        return false;
    }
    
    protected boolean a(final String s) {
        return true;
    }
    
    @Override
    protected void b() {
    }
    
    @Override
    protected void c() {
    }
    
    @Override
    protected boolean d() {
        return this.z;
    }
    
    @Override
    protected boolean e() {
        return this.k != null && !this.A && (this.x != 0 || this.s >= 0 || this.z());
    }
    
    @Override
    protected long f() {
        return this.C;
    }
    
    @Override
    protected void g() {
        this.k = null;
        this.l = null;
        try {
            this.l();
            try {
                if (this.t) {
                    this.c.a();
                    this.t = false;
                }
            }
            finally {
                this.e.b(this.w);
            }
        }
        finally {
            try {
                if (this.t) {
                    this.c.a();
                    this.t = false;
                }
                this.e.b(this.w);
            }
            finally {
                this.e.b(this.w);
            }
        }
    }
    
    @Override
    protected int h() {
        while (true) {
            int w = 0;
            Label_0031: {
                try {
                    final boolean a = this.e.a();
                    w = 0;
                    if (!a) {
                        return 0;
                    }
                    break Label_0031;
                }
                catch (IOException ex) {
                    throw new ExoPlaybackException(ex);
                }
                ++w;
            }
            if (w >= this.e.b()) {
                return -1;
            }
            if (this.a(this.e.a(w).a)) {
                this.w = w;
                return 1;
            }
            continue;
        }
    }
    
    protected final void i() {
        if (this.j()) {
            final String a = this.k.a;
            final Map l = this.l;
            boolean a2 = false;
            MediaCrypto c = null;
            if (l != null) {
                if (this.c == null) {
                    throw new ExoPlaybackException("Media requires a DrmSessionManager");
                }
                if (!this.t) {
                    this.c.a(this.l, a);
                    this.t = true;
                }
                final int b = this.c.b();
                if (b == 0) {
                    throw new ExoPlaybackException(this.c.d());
                }
                if (b != 3 && b != 4) {
                    return;
                }
                c = this.c.c();
                a2 = this.c.a(a);
            }
            while (true) {
                final c a3 = com.google.android.exoplayer.s.a(a, a2);
                final String a4 = a3.a;
                this.n = a3.b;
                while (true) {
                    try {
                        this.a(this.m = MediaCodec.createByCodecName(a4), this.k.a(), c);
                        this.m.start();
                        this.o = this.m.getInputBuffers();
                        this.p = this.m.getOutputBuffers();
                        if (this.q() == 3) {
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            this.q = elapsedRealtime;
                            this.r = -1;
                            this.s = -1;
                            this.B = true;
                            final a a5 = this.a;
                            ++a5.a;
                            return;
                        }
                    }
                    catch (Exception ex2) {
                        final MediaCodecTrackRenderer$DecoderInitializationException ex = new MediaCodecTrackRenderer$DecoderInitializationException(a4, this.k, ex2);
                        this.a(ex);
                        throw new ExoPlaybackException(ex);
                    }
                    final long elapsedRealtime = -1L;
                    continue;
                }
            }
        }
    }
    
    protected boolean j() {
        return this.m == null && this.k != null;
    }
    
    protected final boolean k() {
        return this.m != null;
    }
    
    protected void l() {
        if (this.m == null) {
            return;
        }
        this.q = -1L;
        this.r = -1;
        this.s = -1;
        this.h.clear();
        this.o = null;
        this.p = null;
        this.u = false;
        this.n = false;
        this.v = 0;
        final a a = this.a;
        ++a.b;
        try {
            this.m.stop();
            try {
                this.m.release();
            }
            finally {
                this.m = null;
            }
        }
        finally {
            try {
                this.m.release();
                this.m = null;
            }
            finally {
                this.m = null;
            }
        }
    }
    
    @Override
    protected void m() {
        this.e.d();
    }
    
    @Override
    protected long n() {
        return this.e.a(this.w).b;
    }
    
    @Override
    protected long o() {
        final long c = this.e.c();
        if (c == -1L || c == -3L) {
            return c;
        }
        return Math.max(c, this.f());
    }
    
    protected final int p() {
        return this.x;
    }
}
