// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import java.nio.ByteBuffer;
import android.media.MediaCodec;
import android.media.MediaExtractor;

class h extends i
{
    private final MediaExtractor d;
    private final MediaCodec e;
    private ByteBuffer[] f;
    private long g;
    
    h(final MediaExtractor d, final MediaCodec e) {
        super(null);
        this.g = -1L;
        this.d = d;
        this.e = e;
    }
    
    h a(final long g) {
        this.g = g;
        return this;
    }
    
    @Override
    public int c(final int n) {
        if (this.f == null) {
            this.f = this.e.getInputBuffers();
        }
        int n2;
        int n3;
        for (n2 = 0; !this.b && (n == 0 || n2 < n); n2 = n3) {
            final int dequeueInputBuffer = this.e.dequeueInputBuffer((long)this.c);
            if (dequeueInputBuffer < 0) {
                break;
            }
            final int sampleData = this.d.readSampleData(this.f[dequeueInputBuffer], 0);
            if (sampleData < 0 || (this.g != -1L && this.d.getSampleTime() > this.g)) {
                this.e.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                this.b = true;
                n3 = n2;
            }
            else {
                this.e.queueInputBuffer(dequeueInputBuffer, 0, sampleData, this.d.getSampleTime(), 0);
                n3 = n2 + 1;
                this.d.advance();
            }
        }
        return n2;
    }
}
