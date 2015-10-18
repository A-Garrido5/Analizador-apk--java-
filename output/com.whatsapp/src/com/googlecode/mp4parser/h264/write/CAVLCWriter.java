// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.write;

import java.io.IOException;
import com.googlecode.mp4parser.h264.Debug;
import java.io.OutputStream;

public class CAVLCWriter extends BitstreamWriter
{
    public CAVLCWriter(final OutputStream outputStream) {
        super(outputStream);
    }
    
    public void writeBool(final boolean b, final String s) throws IOException {
        Debug.print(String.valueOf(s) + "\t");
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.write1Bit(n);
        Debug.println("\t" + b);
    }
    
    public void writeNBit(final long n, final int n2, final String s) throws IOException {
        Debug.print(String.valueOf(s) + "\t");
        for (int i = 0; i < n2; ++i) {
            this.write1Bit(0x1 & (int)(n >> -1 + (n2 - i)));
        }
        Debug.println("\t" + n);
    }
    
    public void writeSE(final int n, final String s) throws IOException {
        int n2 = 1;
        Debug.print(String.valueOf(s) + "\t");
        final int n3 = n << 1;
        int n4;
        if (n < 0) {
            n4 = -1;
        }
        else {
            n4 = n2;
        }
        final int n5 = n4 * n3;
        if (n <= 0) {
            n2 = 0;
        }
        this.writeUE(n2 + n5);
        Debug.println("\t" + n);
    }
    
    public void writeSliceTrailingBits() {
        throw new IllegalStateException("todo");
    }
    
    public void writeTrailingBits() throws IOException {
        this.write1Bit(1);
        this.writeRemainingZero();
        this.flush();
    }
    
    public void writeU(final int n, final int n2) throws IOException {
        this.writeNBit(n, n2);
    }
    
    public void writeU(final int n, final int n2, final String s) throws IOException {
        Debug.print(String.valueOf(s) + "\t");
        this.writeNBit(n, n2);
        Debug.println("\t" + n);
    }
    
    public void writeUE(final int n) throws IOException {
        int n2 = 0;
        int n3 = 0;
        while (true) {
            Block_1: {
                int n4;
                while (true) {
                    n4 = 0;
                    if (n3 >= 15) {
                        break;
                    }
                    if (n < n2 + (1 << n3)) {
                        break Block_1;
                    }
                    n2 += 1 << n3;
                    ++n3;
                }
                this.writeNBit(0L, n4);
                this.write1Bit(1);
                this.writeNBit(n - n2, n4);
                return;
            }
            int n4 = n3;
            continue;
        }
    }
    
    public void writeUE(final int n, final String s) throws IOException {
        Debug.print(String.valueOf(s) + "\t");
        this.writeUE(n);
        Debug.println("\t" + n);
    }
}
