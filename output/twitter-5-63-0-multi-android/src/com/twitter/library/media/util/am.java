// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.util.e;
import java.io.FileOutputStream;
import android.os.SystemClock;
import com.twitter.media.MediaUtils;
import android.media.MediaCrypto;
import android.view.Surface;
import android.util.Log;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.OutputStream;
import com.twitter.internal.android.util.Size;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import android.annotation.TargetApi;

@TargetApi(16)
public class am
{
    public static final int[] a;
    private MediaCodec A;
    private ByteBuffer[] B;
    private ByteBuffer[] C;
    private boolean D;
    private byte[] E;
    private boolean F;
    private Size G;
    private Size H;
    private byte[] I;
    private int J;
    private OutputStream K;
    private int L;
    private int M;
    private int N;
    private VideoTranscoderException O;
    private ao P;
    private final File b;
    private final File c;
    private int d;
    private MediaFormat e;
    private MediaExtractor f;
    private boolean g;
    private int h;
    private int i;
    private long j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private MediaCodec q;
    private int r;
    private ByteBuffer[] s;
    private ByteBuffer[] t;
    private int u;
    private boolean v;
    private int w;
    private final MediaCodec$BufferInfo x;
    private int y;
    private int z;
    
    static {
        a = new int[] { 0, -1 };
    }
    
    public am(final File b, final File c, final int z) {
        this.d = 0;
        this.l = am.a[0];
        this.m = am.a[1];
        this.n = 60;
        this.o = 1;
        this.w = -1;
        this.x = new MediaCodec$BufferInfo();
        this.b = b;
        this.c = c;
        this.z = z;
        if (Log.isLoggable("VideoTranscoder", 3)) {
            this.P = new ap("VideoTranscoder");
        }
    }
    
    private static int a(final MediaExtractor mediaExtractor, final String s) {
        for (int trackCount = mediaExtractor.getTrackCount(), i = 0; i < trackCount; ++i) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith(s)) {
                return i;
            }
        }
        return -1;
    }
    
    private VideoTranscoderException a(final String s, final Exception ex) {
        return new VideoTranscoderException(s, ex, this.d, this.L, this.M, this.N);
    }
    
    private void b(final int y) {
        if (this.P != null) {
            this.P.b("initializeEncoder (cf: " + y + ")");
        }
        this.p = this.q.getOutputFormat().getInteger("color-format");
        final MediaFormat videoFormat = MediaFormat.createVideoFormat("video/avc", this.H.a(), this.H.b());
        videoFormat.setInteger("bitrate", this.z / this.o);
        videoFormat.setInteger("frame-rate", this.k);
        videoFormat.setInteger("color-format", y);
        videoFormat.setInteger("i-frame-interval", 5);
        if (this.P != null) {
            this.P.a("encoder", "video/avc", videoFormat);
        }
        (this.A = MediaCodec.createEncoderByType("video/avc")).configure(videoFormat, (Surface)null, (MediaCrypto)null, 1);
        this.A.start();
        this.B = this.A.getInputBuffers();
        this.C = this.A.getOutputBuffers();
        this.y = y;
        if (this.y != this.p) {
            this.E = MediaUtils.a(this.p, this.h, this.i);
        }
        if (this.F) {
            this.I = MediaUtils.a(21, this.H.a(), this.H.b());
        }
        try {
            Thread.sleep(400L);
        }
        catch (InterruptedException ex) {}
    }
    
    private void b(final int n, final int n2) {
        this.L = 0;
        this.u = 0;
        this.M = 0;
        this.N = 0;
        if (this.P != null) {
            this.P.a("TRANSCODE start. Trimming [" + this.l + ':' + this.m + "] " + (this.m - this.l) + " frames");
        }
        long n3;
        int n4 = 0;
        int n5;
        int j;
        int n6;
        Label_0123_Outer:Label_0154_Outer:
        while (true) {
            while (true) {
            Block_10_Outer:
                while (true) {
                    Label_0455: {
                        try {
                            this.c(n, n2);
                            this.e();
                            n3 = SystemClock.elapsedRealtime();
                            this.d(1);
                            n4 = 0;
                            n5 = 0;
                            break Label_0455;
                            // iftrue(Label_0123:, this.g() == 0)
                            // iftrue(Label_0295:, n4 == 0)
                            // iftrue(Label_0240:, j != 2)
                            // iftrue(Label_0211:, this.P == null)
                            while (true) {
                                Label_0130: {
                                    while (true) {
                                        while (true) {
                                            this.d(6);
                                            throw new VideoTranscoderException("Timeout when transcoding video track");
                                            break Label_0130;
                                            this.P.a("File " + this.c + " saved " + this.N + " frames");
                                            Label_0211: {
                                                continue Label_0123_Outer;
                                            }
                                        }
                                        continue Block_10_Outer;
                                    }
                                }
                                Label_0137: {
                                    j = this.j();
                                }
                                continue Label_0154_Outer;
                            }
                        }
                        // iftrue(Label_0130:, this.i() == 0)
                        // iftrue(Label_0137:, j == 0)
                        finally {
                            this.d();
                        }
                        Label_0240: {
                            n6 = this.L + this.u + this.M + this.N;
                        }
                        if (n5 != n6) {
                            n3 = SystemClock.elapsedRealtime();
                        }
                        else {
                            if (SystemClock.elapsedRealtime() - n3 > 60000L) {
                                n4 = 1;
                            }
                            else {
                                n4 = 0;
                            }
                            n6 = n5;
                        }
                        n5 = n6;
                    }
                    if (n4 == 0) {
                        continue Label_0154_Outer;
                    }
                    break;
                }
                continue;
            }
        }
        Label_0295: {
            if (this.m != -1 && this.J != this.N) {
                this.d(6);
                throw this.a("Bad trim frame count " + this.N + " (expected " + (this.m - this.l) + ")", null);
            }
        }
        if (this.m == -1 && this.L != this.N) {
            this.d(6);
            throw this.a("Bad frame count " + this.N + " (expected " + this.L + ")", null);
        }
        this.d(7);
        this.d();
    }
    
    private void c(int integer, int integer2) {
        (this.f = new MediaExtractor()).setDataSource(this.b.toString());
        this.r = a(this.f, "video/");
        if (this.r == -1) {
            throw this.a("No video track (MediaExtractor)", null);
        }
        this.f.selectTrack(this.r);
        this.e = this.f.getTrackFormat(this.r);
        if (integer <= 0) {
            integer = this.e.getInteger("width");
        }
        this.h = integer;
        if (integer2 <= 0) {
            integer2 = this.e.getInteger("height");
        }
        this.i = integer2;
        this.j = this.e.getLong("durationUs");
        if (this.j <= 0L) {
            throw this.a("Duration of the video is zero", null);
        }
        if (this.e.containsKey("frame-rate")) {
            try {
                this.k = (int)this.e.getFloat("frame-rate");
                return;
            }
            catch (ClassCastException ex) {
                this.k = this.e.getInteger("frame-rate");
                return;
            }
        }
        this.k = 30;
    }
    
    private boolean c(final int n) {
        return this.o != 1 && (n - this.l) % this.o > 0;
    }
    
    private void d(final int d) {
        if (this.P != null) {
            this.P.a(this.d, d);
        }
        this.d = d;
    }
    
    private void e() {
        if (this.P != null) {
            this.P.b("prepareDecoder");
        }
        final String string = this.e.getString("mime");
        this.e.setInteger("width", this.h);
        this.e.setInteger("height", this.i);
        if (this.P != null) {
            this.P.a("decoder", "video/avc", this.e);
        }
        (this.q = MediaCodec.createDecoderByType(string)).configure(this.e, (Surface)null, (MediaCrypto)null, 0);
        this.q.start();
        this.s = this.q.getInputBuffers();
        this.t = this.q.getOutputBuffers();
        this.K = new FileOutputStream(this.c);
    }
    
    private void f() {
        if (this.P != null) {
            this.P.a("decoder-output", "", this.q.getOutputFormat());
        }
        this.p = this.q.getOutputFormat().getInteger("color-format");
        final Integer value = this.q.getOutputFormat().getInteger("width");
        final Integer value2 = this.q.getOutputFormat().getInteger("height");
        if (value != null && value2 != null) {
            final int intValue = value;
            final int intValue2 = value2;
            if (intValue != this.h || intValue2 != this.i) {
                throw new VideoDecodingMismatchException(value, value2, this.h, this.i);
            }
        }
        if (this.G != null) {
            final Size a = Size.a(this.h, this.i);
            final float n = a.c(this.G).a() / a.a();
            if (n < 1.0f) {
                this.F = true;
                this.H = Size.a(MediaUtils.a(this.h, n), MediaUtils.a(this.i, n));
            }
            else {
                this.H = a;
            }
        }
        if (this.k > this.n) {
            this.o = 2;
            while (this.k / this.o > this.n) {
                ++this.o;
            }
            if (this.o / this.o < 1) {
                throw this.a("Can't reduce frame rate to less than " + this.n, null);
            }
            if (this.m != -1) {
                this.J = 1 + (-1 + (this.m - this.l)) / this.o;
                this.m = 1 + (this.l + this.o * (-1 + this.J));
            }
        }
        while (true) {
            if (this.F || this.p == 21) {
                break Label_0391;
            }
            try {
                this.b(this.p);
                if (this.A == null) {
                    this.b(21);
                }
            }
            catch (Exception ex) {
                if (this.P != null) {
                    this.P.a(ex);
                }
                this.A = null;
                continue;
            }
            break;
        }
    }
    
    private int g() {
        int n = 4;
        if (this.g) {
            return 2;
        }
        final int dequeueInputBuffer = this.q.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer < 0) {
            return 1;
        }
        final int sampleData = this.f.readSampleData(this.s[dequeueInputBuffer], 0);
        if (sampleData < 0) {
            this.q.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, n);
            this.g = true;
            this.d(3);
            return 2;
        }
        int n2;
        if ((0x1 & this.f.getSampleFlags()) > 0) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (this.f.getSampleTrackIndex() == this.r) {
            ++this.L;
            boolean b;
            if (this.m != -1 && this.L == this.m) {
                b = true;
            }
            else {
                b = false;
            }
            final MediaCodec q = this.q;
            final long sampleTime = this.f.getSampleTime();
            boolean b2;
            if (n2 != 0) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (!b) {
                n = 0;
            }
            q.queueInputBuffer(dequeueInputBuffer, 0, sampleData, sampleTime, n | (b2 ? 1 : 0));
            if (b) {
                this.g = true;
                this.d(3);
                return 2;
            }
        }
        this.f.advance();
        return 0;
    }
    
    private int h() {
        int n;
        if (this.w >= 0) {
            n = this.w;
        }
        else {
            n = this.q.dequeueOutputBuffer(this.x, 10000L);
            if (n >= 0 && (0x2 & this.x.flags) == 0x0) {
                ++this.u;
                return n;
            }
            if (n == -3) {
                this.s = this.q.getInputBuffers();
                this.t = this.q.getOutputBuffers();
                return n;
            }
        }
        return n;
    }
    
    private int i() {
        if (this.v) {
            return 2;
        }
        final int h = this.h();
        if (h < 0) {
            return 1;
        }
        if (this.A == null) {
            this.f();
            this.d(2);
        }
        if (this.u <= this.l || this.c(-1 + this.u)) {
            this.w = -1;
            this.q.releaseOutputBuffer(h, false);
            return 0;
        }
        final int dequeueInputBuffer = this.A.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer > -1) {
            final ByteBuffer byteBuffer = this.B[dequeueInputBuffer];
            final ByteBuffer byteBuffer2 = this.t[h];
            final int size = this.x.size;
            this.w = -1;
            while (true) {
                Label_0484: {
                    if (this.x.size <= 0) {
                        break Label_0484;
                    }
                    while (true) {
                        ++this.M;
                        byteBuffer2.position(this.x.offset);
                    Label_0477:
                        while (true) {
                            try {
                                byteBuffer2.limit(this.x.offset + this.x.size);
                                byteBuffer.clear();
                                if (this.p != this.y) {
                                    final byte[] array = new byte[this.x.size];
                                    byteBuffer2.get(array);
                                    byteBuffer2.position(this.x.offset);
                                    MediaUtils.a(this.E, array, this.p, this.h, this.i);
                                    byte[] array2 = this.E;
                                    if (this.F) {
                                        MediaUtils.a(this.I, this.I.length, this.H.a(), this.H.b(), array2, array2.length, this.h, this.i);
                                        array2 = this.I;
                                    }
                                    if (array2 == null) {
                                        break Label_0477;
                                    }
                                    byteBuffer.put(array2);
                                    final int length = array2.length;
                                    this.q.releaseOutputBuffer(h, false);
                                    this.A.queueInputBuffer(dequeueInputBuffer, 0, length, this.x.presentationTimeUs, 0);
                                    if ((0x4 & this.x.flags) > 0) {
                                        this.v = true;
                                        this.d(4);
                                        return 2;
                                    }
                                    return 0;
                                }
                            }
                            catch (IllegalArgumentException ex) {
                                throw new VideoTranscoderException("Decoder generated invalid sized buffer " + this.x.size + " bytes (" + this.h + "x" + this.i + " video)", ex);
                            }
                            final boolean f = this.F;
                            byte[] array2 = null;
                            if (f) {
                                array2 = new byte[this.x.size];
                                byteBuffer2.get(array2);
                                continue;
                            }
                            continue;
                        }
                        byteBuffer.put(byteBuffer2);
                        break;
                    }
                }
                final int length = size;
                continue;
            }
        }
        this.w = h;
        return 1;
    }
    
    private int j() {
        if (this.A != null) {
            if (this.D) {
                return 2;
            }
            final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
            final int dequeueOutputBuffer = this.A.dequeueOutputBuffer(mediaCodec$BufferInfo, 10000L);
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer == -3) {
                    this.C = this.A.getOutputBuffers();
                    return 0;
                }
                if (dequeueOutputBuffer >= 0) {
                    if ((0x2 & mediaCodec$BufferInfo.flags) == 0x0) {
                        ++this.N;
                    }
                    final ByteBuffer byteBuffer = this.C[dequeueOutputBuffer];
                    byteBuffer.position(mediaCodec$BufferInfo.offset);
                    try {
                        byteBuffer.limit(mediaCodec$BufferInfo.offset + mediaCodec$BufferInfo.size);
                        final byte[] array = new byte[mediaCodec$BufferInfo.size];
                        byteBuffer.get(array);
                        byteBuffer.position(mediaCodec$BufferInfo.offset);
                        this.K.write(array);
                        this.A.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if (this.v && this.N >= this.M) {
                            this.D = true;
                            this.d(5);
                            return 2;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw this.a("Encoder generated invalid sized buffer " + mediaCodec$BufferInfo.size + " bytes", ex);
                    }
                    return 0;
                }
            }
        }
        return 1;
    }
    
    public int a() {
        return this.o;
    }
    
    public am a(final int n) {
        com.twitter.util.e.b(n > 0);
        this.n = n;
        return this;
    }
    
    public am a(final int l, final int j) {
        this.l = l;
        this.m = j + this.l;
        this.J = j;
        return this;
    }
    
    public am a(final Size g) {
        this.G = g;
        return this;
    }
    
    public Size b() {
        return this.H;
    }
    
    public boolean c() {
        while (true) {
            try {
                try {
                    this.b(0, 0);
                    if (this.P != null && this.O != null) {
                        this.P.a(this.O);
                    }
                    final int d = this.d;
                    boolean b = false;
                    if (d == 7) {
                        b = true;
                    }
                    return b;
                }
                catch (VideoDecodingMismatchException ex) {
                    this.b(ex.receivedWidth, ex.receivedHeight);
                }
            }
            catch (VideoTranscoderException o) {
                this.O = o;
                continue;
            }
            catch (Exception ex2) {
                this.O = this.a("Cannot transcode", ex2);
                return false;
            }
            break;
        }
    }
    
    public void d() {
        Label_0026: {
            if (this.q == null) {
                break Label_0026;
            }
            while (true) {
                try {
                    this.q.stop();
                    this.q.release();
                    this.q = null;
                    Label_0052: {
                        if (this.A == null) {
                            break Label_0052;
                        }
                        try {
                            this.A.stop();
                            this.A.release();
                            this.A = null;
                            if (this.f != null) {
                                this.f.release();
                            }
                            if (this.K == null) {
                                return;
                            }
                            try {
                                this.K.flush();
                                this.K.close();
                            }
                            catch (Exception ex) {}
                        }
                        catch (Exception ex2) {}
                    }
                }
                catch (Exception ex3) {
                    continue;
                }
                break;
            }
        }
    }
}
