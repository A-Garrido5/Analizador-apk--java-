// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.BoxParser;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.boxes.Container;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;
import com.coremedia.iso.boxes.Box;

public final class MediaDataBox implements Box
{
    private static Logger LOG;
    public static final String TYPE = "mdat";
    private FileChannel fileChannel;
    boolean largeBox;
    private long offset;
    Container parent;
    private long size;
    
    static {
        MediaDataBox.LOG = Logger.getLogger(MediaDataBox.class.getName());
    }
    
    public MediaDataBox() {
        this.largeBox = false;
    }
    
    private static void transfer(final FileChannel fileChannel, final long n, final long n2, final WritableByteChannel writableByteChannel) throws IOException {
        for (long n3 = 0L; n3 < n2; n3 += fileChannel.transferTo(n + n3, Math.min(67076096L, n2 - n3), writableByteChannel)) {}
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        transfer(this.fileChannel, this.offset, this.size, writableByteChannel);
    }
    
    @Override
    public long getOffset() {
        return this.offset;
    }
    
    @Override
    public Container getParent() {
        return this.parent;
    }
    
    @Override
    public long getSize() {
        return this.size;
    }
    
    @Override
    public String getType() {
        return "mdat";
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        this.offset = fileChannel.position() - byteBuffer.remaining();
        this.fileChannel = fileChannel;
        this.size = n + byteBuffer.remaining();
        fileChannel.position(n + fileChannel.position());
    }
    
    @Override
    public void setParent(final Container parent) {
        this.parent = parent;
    }
    
    @Override
    public String toString() {
        return "MediaDataBox{size=" + this.size + '}';
    }
}
