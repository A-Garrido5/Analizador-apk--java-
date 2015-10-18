// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import com.twitter.errorreporter.ErrorReporter;
import java.nio.ByteBuffer;
import android.media.MediaCodec;

class f extends i
{
    private final MediaCodec d;
    private final a e;
    private final b f;
    private final MediaCodec g;
    private ByteBuffer[] h;
    private int i;
    private long j;
    private int k;
    private int l;
    
    f(final MediaCodec d, final b f, final a e, final MediaCodec g) {
        super(null);
        this.k = 1;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public int a() {
        return this.c(1);
    }
    
    public f a(final int i) {
        this.i = i;
        return this;
    }
    
    public f a(final long j) {
        this.j = j;
        return this;
    }
    
    public f b(final int k) {
        this.k = k;
        return this;
    }
    
    @Override
    public int c(final int n) {
        if (this.h == null) {
            this.h = this.d.getInputBuffers();
        }
        int n2 = 0;
        while (!this.b && (n == 0 || n2 < n)) {
            final int dequeueOutputBuffer = this.d.dequeueOutputBuffer(this.a, (long)this.c);
            if (dequeueOutputBuffer == -1) {
                break;
            }
            if (dequeueOutputBuffer == -3) {
                this.h = this.d.getInputBuffers();
            }
            else if (dequeueOutputBuffer < 0) {
                ErrorReporter.a(new Exception("unexpected result mDecoder.dequeueOutputBuffer: " + dequeueOutputBuffer));
            }
            else {
                boolean b;
                if (this.a.size != 0 && this.a.presentationTimeUs >= this.j) {
                    b = true;
                }
                else {
                    b = false;
                }
                final boolean b2 = b && this.l % this.k == 0;
                this.b = ((0x4 & this.a.flags) != 0x0);
                this.d.releaseOutputBuffer(dequeueOutputBuffer, b2);
                if (b2) {
                    this.f.c();
                    this.f.a(this.i);
                    this.e.a(1000L * this.a.presentationTimeUs);
                    this.e.c();
                    ++n2;
                }
                final int l = this.l;
                int n3;
                if (b) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                this.l = n3 + l;
                if (!this.b) {
                    continue;
                }
                this.g.signalEndOfInputStream();
            }
        }
        return n2;
    }
}
