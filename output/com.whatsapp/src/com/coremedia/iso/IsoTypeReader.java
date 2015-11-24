// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.util.IntHashMap;

public final class IsoTypeReader
{
    private static byte[] codeBytes;
    private static IntHashMap codeCache;
    
    static {
        IsoTypeReader.codeCache = new IntHashMap();
        IsoTypeReader.codeBytes = new byte[4];
    }
    
    public static int byte2int(byte b) {
        if (b < 0) {
            b += 256;
        }
        return b;
    }
    
    public static String read4cc(final ByteBuffer byteBuffer) {
        byteBuffer.get(IsoTypeReader.codeBytes);
        final int n = (0xFF000000 & IsoTypeReader.codeBytes[0] << 24) | (0xFF0000 & IsoTypeReader.codeBytes[1] << 16) | (0xFF00 & IsoTypeReader.codeBytes[2] << 8) | (0xFF & IsoTypeReader.codeBytes[3]);
        final String s = (String)IsoTypeReader.codeCache.get(n);
        if (s != null) {
            return s;
        }
        String s2 = null;
        try {
            s2 = new String(IsoTypeReader.codeBytes, "ISO-8859-1");
            final IntHashMap intHashMap = IsoTypeReader.codeCache;
            final int n2 = n;
            final String s3 = s2;
            intHashMap.put(n2, s3);
            return s2;
        }
        catch (UnsupportedEncodingException ex2) {}
        try {
            final IntHashMap intHashMap = IsoTypeReader.codeCache;
            final int n2 = n;
            final String s3 = s2;
            intHashMap.put(n2, s3);
            return s2;
        }
        catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static double readFixedPoint0230(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        return (0x0 | (0xFF000000 & array[0] << 24) | (0xFF0000 & array[1] << 16) | (0xFF00 & array[2] << 8) | (0xFF & array[3])) / 1.073741824E9;
    }
    
    public static double readFixedPoint1616(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        return (0x0 | (0xFF000000 & array[0] << 24) | (0xFF0000 & array[1] << 16) | (0xFF00 & array[2] << 8) | (0xFF & array[3])) / 65536.0;
    }
    
    public static float readFixedPoint88(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[2];
        byteBuffer.get(array);
        return (short)((short)(0x0 | (0xFF00 & array[0] << 8)) | (0xFF & array[1])) / 256.0f;
    }
    
    public static String readIso639(final ByteBuffer byteBuffer) {
        final int uInt16 = readUInt16(byteBuffer);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; ++i) {
            sb.append((char)(96 + (0x1F & uInt16 >> 5 * (2 - i))));
        }
        return sb.toString();
    }
    
    public static String readString(final ByteBuffer byteBuffer) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            final byte value = byteBuffer.get();
            if (value == 0) {
                break;
            }
            byteArrayOutputStream.write(value);
        }
        return Utf8.convert(byteArrayOutputStream.toByteArray());
    }
    
    public static String readString(final ByteBuffer byteBuffer, final int n) {
        final byte[] array = new byte[n];
        byteBuffer.get(array);
        return Utf8.convert(array);
    }
    
    public static int readUInt16(final ByteBuffer byteBuffer) {
        return 0 + (byte2int(byteBuffer.get()) << 8) + byte2int(byteBuffer.get());
    }
    
    public static int readUInt16BE(final ByteBuffer byteBuffer) {
        return 0 + byte2int(byteBuffer.get()) + (byte2int(byteBuffer.get()) << 8);
    }
    
    public static int readUInt24(final ByteBuffer byteBuffer) {
        return 0 + (readUInt16(byteBuffer) << 8) + byte2int(byteBuffer.get());
    }
    
    public static long readUInt32(final ByteBuffer byteBuffer) {
        long n = byteBuffer.getInt();
        if (n < 0L) {
            n += 4294967296L;
        }
        return n;
    }
    
    public static long readUInt32BE(final ByteBuffer byteBuffer) {
        return (readUInt8(byteBuffer) << 24) + (readUInt8(byteBuffer) << 16) + (readUInt8(byteBuffer) << 8) + (readUInt8(byteBuffer) << 0);
    }
    
    public static long readUInt64(final ByteBuffer byteBuffer) {
        final long n = 0L + (readUInt32(byteBuffer) << 32);
        if (n < 0L) {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        }
        return n + readUInt32(byteBuffer);
    }
    
    public static int readUInt8(final ByteBuffer byteBuffer) {
        return byte2int(byteBuffer.get());
    }
}
