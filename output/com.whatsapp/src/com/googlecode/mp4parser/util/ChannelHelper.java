// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import java.nio.channels.WritableByteChannel;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.io.EOFException;
import java.nio.channels.ReadableByteChannel;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.ByteBuffer;

public class ChannelHelper
{
    private static ByteBuffer empty;
    
    static {
        ChannelHelper.empty = ByteBuffer.allocate(0).asReadOnlyBuffer();
    }
    
    public static void close(final SelectionKey selectionKey) {
        try {
            selectionKey.channel().close();
        }
        catch (IOException ex) {}
    }
    
    public static int readFully(final ReadableByteChannel readableByteChannel, final ByteBuffer byteBuffer, final int n) throws IOException {
        int i = 0;
        while (true) {
            do {
                final int read = readableByteChannel.read(byteBuffer);
                if (-1 == read) {
                    if (read == -1) {
                        throw new EOFException("End of file. No more boxes.");
                    }
                    return i;
                }
                else {
                    i += read;
                }
            } while (i != n);
            continue;
        }
    }
    
    public static ByteBuffer readFully(final ReadableByteChannel readableByteChannel, final long n) throws IOException {
        if (n == 0L) {
            return ChannelHelper.empty;
        }
        if (readableByteChannel instanceof ByteBufferByteChannel) {
            if (((ByteBufferByteChannel)readableByteChannel).byteBuffer.remaining() < n) {
                throw new IOException("Trying to read more data than available. The file might be corrupt");
            }
            final ByteBuffer byteBuffer = (ByteBuffer)((ByteBufferByteChannel)readableByteChannel).byteBuffer.slice().limit((int)n);
            ((ByteBufferByteChannel)readableByteChannel).byteBuffer.position((int)(n + ((ByteBufferByteChannel)readableByteChannel).byteBuffer.position()));
            return byteBuffer;
        }
        else {
            if (readableByteChannel instanceof FileChannel && n > 1048576L) {
                final MappedByteBuffer map = ((FileChannel)readableByteChannel).map(FileChannel.MapMode.READ_ONLY, ((FileChannel)readableByteChannel).position(), n);
                ((FileChannel)readableByteChannel).position(n + ((FileChannel)readableByteChannel).position());
                return map;
            }
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(CastUtils.l2i(n));
            readFully(readableByteChannel, allocateDirect, allocateDirect.limit());
            allocateDirect.rewind();
            assert allocateDirect.limit() == n;
            return allocateDirect;
        }
    }
    
    public static void readFully(final ReadableByteChannel readableByteChannel, final ByteBuffer byteBuffer) throws IOException {
        readFully(readableByteChannel, byteBuffer, byteBuffer.remaining());
    }
    
    public static void writeFully(final WritableByteChannel writableByteChannel, final ByteBuffer byteBuffer) throws IOException {
        while (writableByteChannel.write(byteBuffer) >= 0) {
            if (!byteBuffer.hasRemaining()) {
                return;
            }
        }
        throw new EOFException();
    }
}
