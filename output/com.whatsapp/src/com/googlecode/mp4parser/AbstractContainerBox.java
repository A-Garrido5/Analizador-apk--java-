// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.boxes.Container;
import java.nio.ByteBuffer;
import com.coremedia.iso.boxes.Box;

public class AbstractContainerBox extends BasicContainer implements Box
{
    ByteBuffer header;
    protected boolean largeBox;
    private long offset;
    Container parent;
    protected String type;
    
    public AbstractContainerBox(final String type) {
        this.type = type;
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        this.writeContainer(writableByteChannel);
    }
    
    protected ByteBuffer getHeader() {
        ByteBuffer byteBuffer;
        if (this.largeBox || this.getSize() >= 4294967296L) {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 1, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3], 0, 0, 0, 0, 0, 0, 0, 0 });
            byteBuffer.position(8);
            IsoTypeWriter.writeUInt64(byteBuffer, this.getSize());
        }
        else {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3] });
            IsoTypeWriter.writeUInt32(byteBuffer, this.getSize());
        }
        byteBuffer.rewind();
        return byteBuffer;
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
        final long containerSize = this.getContainerSize();
        int n;
        if (this.largeBox || 8L + containerSize >= 4294967296L) {
            n = 16;
        }
        else {
            n = 8;
        }
        return containerSize + n;
    }
    
    @Override
    public String getType() {
        return this.type;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        this.offset = fileChannel.position() - byteBuffer.remaining();
        this.largeBox = (byteBuffer.remaining() == 16);
        this.parseContainer(fileChannel, n, boxParser);
    }
    
    @Override
    public void setParent(final Container parent) {
        this.parent = parent;
    }
}
