// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaMuxer;
import android.media.MediaCodec;

class g extends i
{
    private final MediaCodec d;
    private final MediaMuxer e;
    private long f;
    private int g;
    private ByteBuffer[] h;
    
    g(final MediaCodec d, final MediaMuxer e) {
        super(null);
        this.g = -1;
        this.d = d;
        this.e = e;
    }
    
    public g a(final long f) {
        this.f = f;
        return this;
    }
    
    public MediaCodec$BufferInfo b() {
        return this.a;
    }
    
    @Override
    public int c(final int n) {
        if (this.h == null) {
            this.h = this.d.getOutputBuffers();
        }
        int n2 = 0;
        while (!this.b && (n == 0 || n2 < n)) {
            final int dequeueOutputBuffer = this.d.dequeueOutputBuffer(this.a, (long)this.c);
            if (dequeueOutputBuffer == -1) {
                break;
            }
            if (dequeueOutputBuffer == -3) {
                this.h = this.d.getOutputBuffers();
            }
            else if (dequeueOutputBuffer == -2) {
                this.g = this.e.addTrack(this.d.getOutputFormat());
                this.e.start();
            }
            else {
                if (dequeueOutputBuffer < 0) {
                    continue;
                }
                final ByteBuffer byteBuffer = this.h[dequeueOutputBuffer];
                if ((0x2 & this.a.flags) != 0x0) {
                    this.a.size = 0;
                }
                if (this.a.size != 0) {
                    ++n2;
                    byteBuffer.position(this.a.offset);
                    byteBuffer.limit(this.a.offset + this.a.size);
                    final MediaCodec$BufferInfo a = this.a;
                    a.presentationTimeUs += this.f;
                    this.a.presentationTimeUs = Math.max(0L, this.a.presentationTimeUs);
                    this.e.writeSampleData(this.g, byteBuffer, this.a);
                }
                this.d.releaseOutputBuffer(dequeueOutputBuffer, false);
                this.b = ((0x4 & this.a.flags) != 0x0);
            }
        }
        return n2;
    }
}
