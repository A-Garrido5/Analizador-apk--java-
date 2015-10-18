// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public class ByteBufferByteChannel implements ByteChannel
{
    ByteBuffer byteBuffer;
    
    public ByteBufferByteChannel(final ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
    
    @Override
    public void close() throws IOException {
    }
    
    @Override
    public boolean isOpen() {
        return true;
    }
    
    @Override
    public int read(final ByteBuffer byteBuffer) throws IOException {
        final int remaining = byteBuffer.remaining();
        if (this.byteBuffer.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer)this.byteBuffer.duplicate().limit(this.byteBuffer.position() + byteBuffer.remaining()));
        this.byteBuffer.position(remaining + this.byteBuffer.position());
        return remaining;
    }
    
    @Override
    public int write(final ByteBuffer byteBuffer) throws IOException {
        final int remaining = byteBuffer.remaining();
        this.byteBuffer.put(byteBuffer);
        return remaining;
    }
}
