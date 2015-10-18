// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitWriterBuffer
{
    static final /* synthetic */ boolean $assertionsDisabled;
    private ByteBuffer buffer;
    int initialPos;
    int position;
    
    public BitWriterBuffer(final ByteBuffer buffer) {
        this.position = 0;
        this.buffer = buffer;
        this.initialPos = buffer.position();
    }
    
    public void writeBits(final int n, final int n2) {
        int n3 = 1;
        if (!BitWriterBuffer.$assertionsDisabled && n > -1 + (n3 << n2)) {
            final Object[] array = { n, null };
            array[n3] = -1 + (n3 << n2);
            throw new AssertionError((Object)String.format("Trying to write a value bigger (%s) than the number bits (%s) allows. Please mask the value before writing it and make your code is really working as intended.", array));
        }
        final int n4 = 8 - this.position % 8;
        if (n2 <= n4) {
            int value = this.buffer.get(this.initialPos + this.position / 8);
            if (value < 0) {
                value += 256;
            }
            int n5 = value + (n << n4 - n2);
            final ByteBuffer buffer = this.buffer;
            final int n6 = this.initialPos + this.position / 8;
            if (n5 > 127) {
                n5 -= 256;
            }
            buffer.put(n6, (byte)n5);
            this.position += n2;
        }
        else {
            final int n7 = n2 - n4;
            this.writeBits(n >> n7, n4);
            this.writeBits(n & -1 + (n3 << n7), n7);
        }
        final ByteBuffer buffer2 = this.buffer;
        final int n8 = this.initialPos + this.position / 8;
        if (this.position % 8 <= 0) {
            n3 = 0;
        }
        buffer2.position(n3 + n8);
    }
}
