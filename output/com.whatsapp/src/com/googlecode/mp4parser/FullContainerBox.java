// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser;

import com.coremedia.iso.IsoTypeReader;
import java.io.IOException;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.List;
import com.coremedia.iso.boxes.Box;
import java.util.logging.Logger;
import com.coremedia.iso.boxes.FullBox;

public abstract class FullContainerBox extends AbstractContainerBox implements FullBox
{
    private static Logger LOG;
    private int flags;
    private int version;
    
    static {
        FullContainerBox.LOG = Logger.getLogger(FullContainerBox.class.getName());
    }
    
    public FullContainerBox(final String s) {
        super(s);
    }
    
    @Override
    public <T extends Box> List<T> getBoxes(final Class<T> clazz) {
        return this.getBoxes(clazz, false);
    }
    
    @Override
    public int getFlags() {
        return this.flags;
    }
    
    @Override
    protected ByteBuffer getHeader() {
        ByteBuffer byteBuffer;
        if (this.largeBox || this.getSize() >= 4294967296L) {
            final byte[] array = new byte[20];
            array[3] = 1;
            array[4] = this.type.getBytes()[0];
            array[5] = this.type.getBytes()[1];
            array[6] = this.type.getBytes()[2];
            array[7] = this.type.getBytes()[3];
            byteBuffer = ByteBuffer.wrap(array);
            byteBuffer.position(8);
            IsoTypeWriter.writeUInt64(byteBuffer, this.getSize());
            this.writeVersionAndFlags(byteBuffer);
        }
        else {
            byteBuffer = ByteBuffer.wrap(new byte[] { 0, 0, 0, 0, this.type.getBytes()[0], this.type.getBytes()[1], this.type.getBytes()[2], this.type.getBytes()[3], 0, 0, 0, 0 });
            IsoTypeWriter.writeUInt32(byteBuffer, this.getSize());
            byteBuffer.position(8);
            this.writeVersionAndFlags(byteBuffer);
        }
        byteBuffer.rewind();
        return byteBuffer;
    }
    
    @Override
    public int getVersion() {
        return this.version;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        fileChannel.read(allocate);
        this.parseVersionAndFlags((ByteBuffer)allocate.rewind());
        super.parse(fileChannel, byteBuffer, n, boxParser);
    }
    
    protected final long parseVersionAndFlags(final ByteBuffer byteBuffer) {
        this.version = IsoTypeReader.readUInt8(byteBuffer);
        this.flags = IsoTypeReader.readUInt24(byteBuffer);
        return 4L;
    }
    
    @Override
    public void setFlags(final int flags) {
        this.flags = flags;
    }
    
    @Override
    public void setVersion(final int version) {
        this.version = version;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.getClass().getSimpleName()) + "[childBoxes]";
    }
    
    protected final void writeVersionAndFlags(final ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.version);
        IsoTypeWriter.writeUInt24(byteBuffer, this.flags);
    }
}
