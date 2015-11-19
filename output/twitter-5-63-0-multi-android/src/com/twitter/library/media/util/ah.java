// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.os.SystemClock;
import android.media.MediaCrypto;
import android.view.Surface;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import android.annotation.TargetApi;

@TargetApi(16)
public class ah
{
    private final File a;
    private MediaFormat b;
    private MediaExtractor c;
    private boolean d;
    private MediaCodec e;
    private int f;
    private ByteBuffer[] g;
    private int h;
    private boolean i;
    private int j;
    private final MediaCodec$BufferInfo k;
    private int l;
    private VideoTranscoderException m;
    
    public ah(final File a) {
        this.k = new MediaCodec$BufferInfo();
        this.a = a;
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
        return new VideoTranscoderException(s, ex, 6, this.l, 0, 0);
    }
    
    private void f() {
        (this.c = new MediaExtractor()).setDataSource(this.a.toString());
        this.f = a(this.c, "video/");
        if (this.f == -1) {
            throw this.a("No video track (MediaExtractor)", null);
        }
        this.c.selectTrack(this.f);
        this.b = this.c.getTrackFormat(this.f);
        if (this.b.getLong("durationUs") <= 0L) {
            throw this.a("Duration of the video is zero", null);
        }
    }
    
    private void g() {
        (this.e = MediaCodec.createDecoderByType(this.b.getString("mime"))).configure(this.b, (Surface)null, (MediaCrypto)null, 0);
        this.e.start();
        this.g = this.e.getInputBuffers();
    }
    
    private int h() {
        if (this.d) {
            return 2;
        }
        final int dequeueInputBuffer = this.e.dequeueInputBuffer(10000L);
        if (dequeueInputBuffer < 0) {
            return 1;
        }
        final int sampleData = this.c.readSampleData(this.g[dequeueInputBuffer], 0);
        if (sampleData < 0) {
            this.e.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            this.d = true;
            return 2;
        }
        int n;
        if ((0x1 & this.c.getSampleFlags()) > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (this.c.getSampleTrackIndex() == this.f) {
            ++this.l;
            final MediaCodec e = this.e;
            final long sampleTime = this.c.getSampleTime();
            int n2;
            if (n != 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            e.queueInputBuffer(dequeueInputBuffer, 0, sampleData, sampleTime, n2);
        }
        this.c.advance();
        return 0;
    }
    
    private int i() {
        final int dequeueOutputBuffer = this.e.dequeueOutputBuffer(this.k, 10000L);
        if (dequeueOutputBuffer >= 0 && (0x2 & this.k.flags) == 0x0) {
            ++this.h;
        }
        else if (dequeueOutputBuffer == -3) {
            this.g = this.e.getInputBuffers();
            return dequeueOutputBuffer;
        }
        return dequeueOutputBuffer;
    }
    
    private int j() {
        int i = 1;
        final int j = this.i();
        if (j >= 0) {
            switch (this.j = this.e.getOutputFormat().getInteger("color-format")) {
                default: {
                    this.i = false;
                    break;
                }
                case 21:
                case 2141391875:
                case 2141391876: {
                    this.i = (i != 0);
                    break;
                }
            }
            this.e.releaseOutputBuffer(j, false);
            i = 2;
        }
        return i;
    }
    
    public int a() {
        return this.j;
    }
    
    public void b() {
    Label_0046_Outer:
        while (true) {
            this.l = 0;
            this.h = 0;
        Label_0046:
            while (true) {
                while (true) {
                    int n2 = 0;
                    Label_0130: {
                        long n;
                        int n3;
                        try {
                            this.f();
                            this.g();
                            n = SystemClock.elapsedRealtime();
                            n2 = 0;
                            n3 = 0;
                            break Label_0130;
                            // iftrue(Label_0031:, this.h() == 0)
                            // iftrue(Label_0125:, n2 == 0)
                            Block_6: {
                                break Block_6;
                                throw new VideoTranscoderException("Timeout when transcoding video track");
                            }
                            // iftrue(Label_0068:, this.j() != 2)
                            continue Label_0046;
                        }
                        finally {
                            this.c();
                        }
                        int n4 = 0;
                        Label_0068: {
                            n4 = this.l + this.h;
                        }
                        if (n3 != n4) {
                            n = SystemClock.elapsedRealtime();
                        }
                        else {
                            if (SystemClock.elapsedRealtime() - n > 60000L) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            n4 = n3;
                        }
                        n3 = n4;
                    }
                    if (n2 == 0) {
                        continue Label_0046_Outer;
                    }
                    break;
                }
                continue Label_0046;
            }
        }
        Label_0125: {
            this.c();
        }
    }
    
    public void c() {
        Label_0026: {
            if (this.e == null) {
                break Label_0026;
            }
            while (true) {
                try {
                    this.e.stop();
                    this.e.release();
                    this.e = null;
                    if (this.c != null) {
                        this.c.release();
                    }
                }
                catch (Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public VideoTranscoderException d() {
        return this.m;
    }
    
    public boolean e() {
        return this.i;
    }
}
