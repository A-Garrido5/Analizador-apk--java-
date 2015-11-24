// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.nio.ByteBuffer;

public final class IsoTypeWriter
{
    public static void writeFixedPoint0230(final ByteBuffer byteBuffer, final double n) {
        final int n2 = (int)(1.073741824E9 * n);
        byteBuffer.put((byte)((0xFF000000 & n2) >> 24));
        byteBuffer.put((byte)((0xFF0000 & n2) >> 16));
        byteBuffer.put((byte)((0xFF00 & n2) >> 8));
        byteBuffer.put((byte)(n2 & 0xFF));
    }
    
    public static void writeFixedPoint1616(final ByteBuffer byteBuffer, final double n) {
        final int n2 = (int)(65536.0 * n);
        byteBuffer.put((byte)((0xFF000000 & n2) >> 24));
        byteBuffer.put((byte)((0xFF0000 & n2) >> 16));
        byteBuffer.put((byte)((0xFF00 & n2) >> 8));
        byteBuffer.put((byte)(n2 & 0xFF));
    }
    
    public static void writeFixedPoint88(final ByteBuffer byteBuffer, final double n) {
        final short n2 = (short)(256.0 * n);
        byteBuffer.put((byte)((0xFF00 & n2) >> 8));
        byteBuffer.put((byte)(n2 & 0xFF));
    }
    
    public static void writeIso639(final ByteBuffer byteBuffer, final String s) {
        if (s.getBytes().length != 3) {
            throw new IllegalArgumentException("\"" + s + "\" language string isn't exactly 3 characters long!");
        }
        int n = 0;
        for (int i = 0; i < 3; ++i) {
            n += -96 + s.getBytes()[i] << 5 * (2 - i);
        }
        writeUInt16(byteBuffer, n);
    }
    
    public static void writePascalUtfString(final ByteBuffer byteBuffer, final String s) {
        final byte[] convert = Utf8.convert(s);
        assert convert.length < 255;
        writeUInt8(byteBuffer, convert.length);
        byteBuffer.put(convert);
    }
    
    public static void writeUInt16(final ByteBuffer byteBuffer, final int n) {
        final int n2 = n & 0xFFFF;
        writeUInt8(byteBuffer, n2 >> 8);
        writeUInt8(byteBuffer, n2 & 0xFF);
    }
    
    public static void writeUInt16BE(final ByteBuffer byteBuffer, final int n) {
        final int n2 = n & 0xFFFF;
        writeUInt8(byteBuffer, n2 & 0xFF);
        writeUInt8(byteBuffer, n2 >> 8);
    }
    
    public static void writeUInt24(final ByteBuffer byteBuffer, final int n) {
        final int n2 = n & 0xFFFFFF;
        writeUInt16(byteBuffer, n2 >> 8);
        writeUInt8(byteBuffer, n2);
    }
    
    public static void writeUInt32(final ByteBuffer byteBuffer, final long n) {
        byteBuffer.putInt((int)n);
    }
    
    public static void writeUInt32BE(final ByteBuffer byteBuffer, final long n) {
        assert n >= 0L && n <= 4294967296L : "The given long is not in the range of uint32 (" + n + ")";
        writeUInt16BE(byteBuffer, 0xFFFF & (int)n);
        writeUInt16BE(byteBuffer, (int)(0xFFFFL & n >> 16));
    }
    
    public static void writeUInt64(final ByteBuffer byteBuffer, final long n) {
        byteBuffer.putLong(n);
    }
    
    public static void writeUInt8(final ByteBuffer byteBuffer, final int n) {
        byteBuffer.put((byte)(n & 0xFF));
    }
    
    public static void writeUtf8String(final ByteBuffer byteBuffer, final String s) {
        byteBuffer.put(Utf8.convert(s));
        writeUInt8(byteBuffer, 0);
    }
    
    public static void writeZeroTermUtf8String(final ByteBuffer byteBuffer, final String s) {
        byteBuffer.put(Utf8.convert(s));
        writeUInt8(byteBuffer, 0);
    }
}
