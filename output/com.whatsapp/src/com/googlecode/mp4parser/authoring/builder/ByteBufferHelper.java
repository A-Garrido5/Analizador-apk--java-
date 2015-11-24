// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.authoring.builder;

import java.util.Iterator;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;

public class ByteBufferHelper
{
    public static List<ByteBuffer> mergeAdjacentBuffers(final List<ByteBuffer> list) {
        final ArrayList<ByteBuffer> list2 = new ArrayList<ByteBuffer>(list.size());
        for (final ByteBuffer byteBuffer : list) {
            final int n = -1 + list2.size();
            if (n >= 0 && byteBuffer.hasArray() && list2.get(n).hasArray() && byteBuffer.array() == list2.get(n).array() && list2.get(n).arrayOffset() + list2.get(n).limit() == byteBuffer.arrayOffset()) {
                final ByteBuffer byteBuffer2 = list2.remove(n);
                list2.add(ByteBuffer.wrap(byteBuffer.array(), byteBuffer2.arrayOffset(), byteBuffer2.limit() + byteBuffer.limit()).slice());
            }
            else if (n >= 0 && byteBuffer instanceof MappedByteBuffer && list2.get(n) instanceof MappedByteBuffer && list2.get(n).limit() == list2.get(n).capacity() - byteBuffer.capacity()) {
                final ByteBuffer byteBuffer3 = list2.get(n);
                byteBuffer3.limit(byteBuffer.limit() + byteBuffer3.limit());
            }
            else {
                byteBuffer.reset();
                list2.add(byteBuffer);
            }
        }
        return list2;
    }
}
