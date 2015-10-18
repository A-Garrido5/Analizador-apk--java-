// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.nio.ByteBuffer;

public class SampleImpl implements Sample
{
    private final ByteBuffer[] data;
    
    public SampleImpl(final ByteBuffer byteBuffer) {
        this.data = new ByteBuffer[] { byteBuffer };
    }
    
    public SampleImpl(final ByteBuffer[] data) {
        this.data = data;
    }
    
    @Override
    public ByteBuffer asByteBuffer() {
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[(int)this.remaining()]);
        final ByteBuffer[] data = this.data;
        for (int length = data.length, i = 0; i < length; ++i) {
            wrap.put(data[i].duplicate());
        }
        return wrap;
    }
    
    @Override
    public long remaining() {
        long n = 0L;
        final ByteBuffer[] data = this.data;
        for (int length = data.length, i = 0; i < length; ++i) {
            n += data[i].remaining();
        }
        return n;
    }
    
    @Override
    public void writeTo(final WritableByteChannel writableByteChannel) throws IOException {
        final ByteBuffer[] data = this.data;
        for (int length = data.length, i = 0; i < length; ++i) {
            writableByteChannel.write(data[i]);
        }
    }
}
