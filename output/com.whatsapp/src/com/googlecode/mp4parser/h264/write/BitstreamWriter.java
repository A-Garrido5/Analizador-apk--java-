// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.write;

import com.googlecode.mp4parser.h264.Debug;
import java.io.IOException;
import java.io.OutputStream;

public class BitstreamWriter
{
    private int curBit;
    private int[] curByte;
    private final OutputStream os;
    
    public BitstreamWriter(final OutputStream os) {
        this.curByte = new int[8];
        this.os = os;
    }
    
    private void writeCurByte() throws IOException {
        this.os.write(this.curByte[0] << 7 | this.curByte[1] << 6 | this.curByte[2] << 5 | this.curByte[3] << 4 | this.curByte[4] << 3 | this.curByte[5] << 2 | this.curByte[6] << 1 | this.curByte[7]);
    }
    
    public void flush() throws IOException {
        for (int i = this.curBit; i < 8; ++i) {
            this.curByte[i] = 0;
        }
        this.curBit = 0;
        this.writeCurByte();
    }
    
    public void write1Bit(final int n) throws IOException {
        Debug.print(n);
        if (this.curBit == 8) {
            this.curBit = 0;
            this.writeCurByte();
        }
        this.curByte[this.curBit++] = n;
    }
    
    public void writeByte(final int n) throws IOException {
        this.os.write(n);
    }
    
    public void writeNBit(final long n, final int n2) throws IOException {
        for (int i = 0; i < n2; ++i) {
            this.write1Bit(0x1 & (int)(n >> -1 + (n2 - i)));
        }
    }
    
    public void writeRemainingZero() throws IOException {
        this.writeNBit(0L, 8 - this.curBit);
    }
}
