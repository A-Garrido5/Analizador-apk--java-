// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso;

import java.nio.ByteBuffer;

public final class IsoTypeWriterVariable
{
    public static void write(final long n, final ByteBuffer byteBuffer, final int n2) {
        switch (n2) {
            default: {
                throw new RuntimeException("I don't know how to read " + n2 + " bytes");
            }
            case 1: {
                IsoTypeWriter.writeUInt8(byteBuffer, (int)(0xFFL & n));
            }
            case 2: {
                IsoTypeWriter.writeUInt16(byteBuffer, (int)(0xFFFFL & n));
            }
            case 3: {
                IsoTypeWriter.writeUInt24(byteBuffer, (int)(0xFFFFFFL & n));
            }
            case 4: {
                IsoTypeWriter.writeUInt32(byteBuffer, n);
            }
            case 8: {
                IsoTypeWriter.writeUInt64(byteBuffer, n);
            }
        }
    }
}
