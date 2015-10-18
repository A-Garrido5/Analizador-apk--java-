// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.UUID;

public class UUIDConverter
{
    public static UUID convert(final byte[] array) {
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }
    
    public static byte[] convert(final UUID uuid) {
        final long mostSignificantBits = uuid.getMostSignificantBits();
        final long leastSignificantBits = uuid.getLeastSignificantBits();
        final byte[] array = new byte[16];
        for (int i = 0; i < 8; ++i) {
            array[i] = (byte)(mostSignificantBits >>> 8 * (7 - i));
        }
        for (int j = 8; j < 16; ++j) {
            array[j] = (byte)(leastSignificantBits >>> 8 * (7 - j));
        }
        return array;
    }
}
