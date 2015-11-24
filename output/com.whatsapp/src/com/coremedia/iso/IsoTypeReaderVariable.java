// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.nio.ByteBuffer;

public final class IsoTypeReaderVariable
{
    public static long read(final ByteBuffer byteBuffer, final int n) {
        switch (n) {
            default: {
                throw new RuntimeException("I don't know how to read " + n + " bytes");
            }
            case 1: {
                return IsoTypeReader.readUInt8(byteBuffer);
            }
            case 2: {
                return IsoTypeReader.readUInt16(byteBuffer);
            }
            case 3: {
                return IsoTypeReader.readUInt24(byteBuffer);
            }
            case 4: {
                return IsoTypeReader.readUInt32(byteBuffer);
            }
            case 8: {
                return IsoTypeReader.readUInt64(byteBuffer);
            }
        }
    }
}
