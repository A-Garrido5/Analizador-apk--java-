// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.read;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.googlecode.mp4parser.h264.BTree;
import com.googlecode.mp4parser.h264.Debug;
import java.io.IOException;
import java.io.InputStream;

public class CAVLCReader extends BitstreamReader
{
    public CAVLCReader(final InputStream inputStream) throws IOException {
        super(inputStream);
    }
    
    private int readUE() throws IOException {
        int n = 0;
        while (this.read1Bit() == 0) {
            ++n;
        }
        int n2 = 0;
        if (n > 0) {
            n2 = (int)(this.readNBit(n) + (-1 + (1 << n)));
        }
        return n2;
    }
    
    private void trace(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        final String value = String.valueOf(BitstreamReader.bitsRead - this.debugBits.length());
        final int n = 8 - value.length();
        sb.append("@" + value);
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        sb.append(s);
        for (int n2 = 100 - sb.length() - this.debugBits.length(), j = 0; j < n2; ++j) {
            sb.append(' ');
        }
        sb.append(this.debugBits);
        sb.append(" (" + s2 + ")");
        this.debugBits.clear();
        Debug.println(sb.toString());
    }
    
    public byte[] read(final int n) throws IOException {
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)this.readByte();
        }
        return array;
    }
    
    public boolean readAE() {
        throw new UnsupportedOperationException("Stan");
    }
    
    public int readAEI() {
        throw new UnsupportedOperationException("Stan");
    }
    
    public boolean readBool(final String s) throws IOException {
        final boolean b = this.read1Bit() != 0;
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        this.trace(s, s2);
        return b;
    }
    
    public Object readCE(BTree down, final String s) throws IOException {
        Object value;
        do {
            down = down.down(this.read1Bit());
            if (down == null) {
                throw new RuntimeException("Illegal code");
            }
            value = down.getValue();
        } while (value == null);
        this.trace(s, value.toString());
        return value;
    }
    
    public int readME(final String s) throws IOException {
        return this.readUE(s);
    }
    
    public long readNBit(final int n, final String s) throws IOException {
        final long nBit = this.readNBit(n);
        this.trace(s, String.valueOf(nBit));
        return nBit;
    }
    
    public int readSE(final String s) throws IOException {
        final int ue = this.readUE();
        final int n = (-1 + ((ue & 0x1) << 1)) * ((ue >> 1) + (ue & 0x1));
        this.trace(s, String.valueOf(n));
        return n;
    }
    
    public int readTE(final int n) throws IOException {
        if (n > 1) {
            return this.readUE();
        }
        return 0x1 & (-1 ^ this.read1Bit());
    }
    
    public void readTrailingBits() throws IOException {
        this.read1Bit();
        this.readRemainingByte();
    }
    
    public int readU(final int n, final String s) throws IOException {
        return (int)this.readNBit(n, s);
    }
    
    public int readUE(final String s) throws IOException {
        final int ue = this.readUE();
        this.trace(s, String.valueOf(ue));
        return ue;
    }
    
    public int readZeroBitCount(final String s) throws IOException {
        int n = 0;
        while (this.read1Bit() == 0) {
            ++n;
        }
        this.trace(s, String.valueOf(n));
        return n;
    }
}
