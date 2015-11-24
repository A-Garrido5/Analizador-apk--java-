// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitReaderBuffer
{
    private ByteBuffer buffer;
    int initialPos;
    int position;
    
    public BitReaderBuffer(final ByteBuffer buffer) {
        this.buffer = buffer;
        this.initialPos = buffer.position();
    }
    
    public int byteSync() {
        int n = 8 - this.position % 8;
        if (n == 8) {
            n = 0;
        }
        this.readBits(n);
        return n;
    }
    
    public int getPosition() {
        return this.position;
    }
    
    public int readBits(final int n) {
        final byte value = this.buffer.get(this.initialPos + this.position / 8);
        int n2;
        if (value < 0) {
            n2 = value + 256;
        }
        else {
            n2 = value;
        }
        final int n3 = 8 - this.position % 8;
        int n4;
        if (n <= n3) {
            n4 = (0xFF & n2 << this.position % 8) >> this.position % 8 + (n3 - n);
            this.position += n;
        }
        else {
            final int n5 = n - n3;
            n4 = (this.readBits(n3) << n5) + this.readBits(n5);
        }
        this.buffer.position(this.initialPos + (int)Math.ceil(this.position / 8.0));
        return n4;
    }
    
    public int remainingBits() {
        return 8 * this.buffer.limit() - this.position;
    }
}
