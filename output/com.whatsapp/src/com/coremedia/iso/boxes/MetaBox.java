// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class MetaBox extends AbstractContainerBox
{
    public static final String TYPE = "meta";
    private int flags;
    private int version;
    
    public MetaBox() {
        super("meta");
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        this.writeVersionAndFlags(allocate);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    public int getFlags() {
        return this.flags;
    }
    
    @Override
    public long getSize() {
        final long containerSize = this.getContainerSize();
        final long n = containerSize + 4L;
        int n2;
        if (this.largeBox || containerSize + 4L >= 4294967296L) {
            n2 = 16;
        }
        else {
            n2 = 8;
        }
        return n + n2;
    }
    
    public int getVersion() {
        return this.version;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        fileChannel.read(allocate);
        this.parseVersionAndFlags((ByteBuffer)allocate.rewind());
        this.parseContainer(fileChannel, n - 4L, boxParser);
    }
    
    protected final long parseVersionAndFlags(final ByteBuffer byteBuffer) {
        this.version = IsoTypeReader.readUInt8(byteBuffer);
        this.flags = IsoTypeReader.readUInt24(byteBuffer);
        return 4L;
    }
    
    public void setFlags(final int flags) {
        this.flags = flags;
    }
    
    public void setVersion(final int version) {
        this.version = version;
    }
    
    protected final void writeVersionAndFlags(final ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer, this.flags);
    }
}
