// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import java.io.IOException;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.googlecode.mp4parser.AbstractContainerBox;

public class SampleDescriptionBox extends AbstractContainerBox implements FullBox
{
    public static final String TYPE = "stsd";
    private int flags;
    private int version;
    
    public SampleDescriptionBox() {
        super("stsd");
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt8(allocate, this.version);
        IsoTypeWriter.writeUInt24(allocate, this.flags);
        IsoTypeWriter.writeUInt32(allocate, this.getBoxes().size());
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    @Override
    public int getFlags() {
        return this.flags;
    }
    
    public AbstractSampleEntry getSampleEntry() {
        final Iterator<AbstractSampleEntry> iterator = this.getBoxes(AbstractSampleEntry.class).iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }
    
    @Override
    public long getSize() {
        final long containerSize = this.getContainerSize();
        final long n = containerSize + 8L;
        int n2;
        if (this.largeBox || 8L + (containerSize + 8L) >= 4294967296L) {
            n2 = 16;
        }
        else {
            n2 = 8;
        }
        return n + n2;
    }
    
    @Override
    public int getVersion() {
        return this.version;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        fileChannel.read(allocate);
        allocate.rewind();
        this.version = IsoTypeReader.readUInt8(allocate);
        this.flags = IsoTypeReader.readUInt24(allocate);
        this.parseContainer(fileChannel, n - 8L, boxParser);
    }
    
    @Override
    public void setFlags(final int flags) {
        this.flags = flags;
    }
    
    @Override
    public void setVersion(final int version) {
        this.version = version;
    }
}
