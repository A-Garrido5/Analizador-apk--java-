// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.read;

import java.io.IOException;
import java.io.InputStream;
import com.googlecode.mp4parser.h264.CharCache;

public class BitstreamReader
{
    protected static int bitsRead;
    private int curByte;
    protected CharCache debugBits;
    private InputStream is;
    int nBit;
    private int nextByte;
    
    public BitstreamReader(final InputStream is) throws IOException {
        this.debugBits = new CharCache(50);
        this.is = is;
        this.curByte = is.read();
        this.nextByte = is.read();
    }
    
    private void advance() throws IOException {
        this.curByte = this.nextByte;
        this.nextByte = this.is.read();
        this.nBit = 0;
    }
    
    public void close() throws IOException {
    }
    
    public long getBitPosition() {
        return 8 * BitstreamReader.bitsRead + this.nBit % 8;
    }
    
    public int getCurBit() {
        return this.nBit;
    }
    
    public boolean isByteAligned() {
        return this.nBit % 8 == 0;
    }
    
    public boolean moreRBSPData() throws IOException {
        int n = 1;
        if (this.nBit == 8) {
            this.advance();
        }
        final int n2 = n << -1 + (8 - this.nBit);
        int n3;
        if ((-1 + (n2 << 1) & this.curByte) == n2) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        if (this.curByte == -1 || (this.nextByte == -1 && n3 != 0)) {
            n = 0;
        }
        return n != 0;
    }
    
    public int peakNextBits(final int n) throws IOException {
        int n2 = -1;
        if (n > 8) {
            throw new IllegalArgumentException("N should be less then 8");
        }
        Label_0041: {
            if (this.nBit != 8) {
                break Label_0041;
            }
            this.advance();
            if (this.curByte != n2) {
                break Label_0041;
            }
            return n2;
        }
        final int[] array = new int[16 - this.nBit];
        int i = this.nBit;
        int n3 = 0;
        while (i < 8) {
            final int n4 = n3 + 1;
            array[n3] = (0x1 & this.curByte >> 7 - i);
            ++i;
            n3 = n4;
        }
        int n5;
        for (int j = 0; j < 8; ++j, n3 = n5) {
            n5 = n3 + 1;
            array[n3] = (0x1 & this.nextByte >> 7 - j);
        }
        n2 = 0;
        for (int k = 0; k < n; ++k) {
            n2 = (n2 << 1 | array[k]);
        }
        return n2;
    }
    
    public int read1Bit() throws IOException {
        if (this.nBit == 8) {
            this.advance();
            if (this.curByte == -1) {
                return -1;
            }
        }
        final int n = 0x1 & this.curByte >> 7 - this.nBit;
        ++this.nBit;
        final CharCache debugBits = this.debugBits;
        char c;
        if (n == 0) {
            c = '0';
        }
        else {
            c = '1';
        }
        debugBits.append(c);
        ++BitstreamReader.bitsRead;
        return n;
    }
    
    public int readByte() throws IOException {
        if (this.nBit > 0) {
            this.advance();
        }
        final int curByte = this.curByte;
        this.advance();
        return curByte;
    }
    
    public long readNBit(final int n) throws IOException {
        if (n > 64) {
            throw new IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long n2 = 0L;
        for (int i = 0; i < n; ++i) {
            n2 = (n2 << 1 | this.read1Bit());
        }
        return n2;
    }
    
    public long readRemainingByte() throws IOException {
        return this.readNBit(8 - this.nBit);
    }
}
