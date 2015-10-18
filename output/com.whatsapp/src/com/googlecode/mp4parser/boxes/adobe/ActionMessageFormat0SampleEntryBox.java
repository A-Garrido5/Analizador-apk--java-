// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.adobe;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;

public class ActionMessageFormat0SampleEntryBox extends AbstractSampleEntry
{
    public static final String TYPE = "amf0";
    
    public ActionMessageFormat0SampleEntryBox() {
        super("amf0");
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    @Override
    public long getSize() {
        final long containerSize = this.getContainerSize();
        final long n = containerSize + 8L;
        int n2;
        if (this.largeBox || containerSize + 8L >= 4294967296L) {
            n2 = 16;
        }
        else {
            n2 = 8;
        }
        return n + n2;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        fileChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        this.parseContainer(fileChannel, n, boxParser);
    }
}
