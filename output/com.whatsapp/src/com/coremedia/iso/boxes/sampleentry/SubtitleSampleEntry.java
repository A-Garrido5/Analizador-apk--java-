// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public class SubtitleSampleEntry extends AbstractSampleEntry
{
    public static final String TYPE1 = "stpp";
    private String imageMimeType;
    private String namespace;
    private String schemaLocation;
    
    public SubtitleSampleEntry() {
        super("stpp");
        this.namespace = "";
        this.schemaLocation = "";
        this.imageMimeType = "";
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(3 + (8 + this.namespace.length() + this.schemaLocation.length() + this.imageMimeType.length()));
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.namespace);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.schemaLocation);
        IsoTypeWriter.writeZeroTermUtf8String(allocate, this.imageMimeType);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    public String getImageMimeType() {
        return this.imageMimeType;
    }
    
    public String getNamespace() {
        return this.namespace;
    }
    
    public String getSchemaLocation() {
        return this.schemaLocation;
    }
    
    @Override
    public long getSize() {
        final long containerSize = this.getContainerSize();
        final long n = 3 + (8 + this.namespace.length() + this.schemaLocation.length() + this.imageMimeType.length());
        final long n2 = containerSize + n;
        int n3;
        if (this.largeBox || 8L + (containerSize + n) >= 4294967296L) {
            n3 = 16;
        }
        else {
            n3 = 8;
        }
        return n2 + n3;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        fileChannel.read((ByteBuffer)allocate.rewind());
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        final long position = fileChannel.position();
        final ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        fileChannel.read((ByteBuffer)allocate2.rewind());
        this.namespace = IsoTypeReader.readString((ByteBuffer)allocate2.rewind());
        fileChannel.position(1L + (position + this.namespace.length()));
        fileChannel.read((ByteBuffer)allocate2.rewind());
        this.schemaLocation = IsoTypeReader.readString((ByteBuffer)allocate2.rewind());
        fileChannel.position(2L + (position + this.namespace.length() + this.schemaLocation.length()));
        fileChannel.read((ByteBuffer)allocate2.rewind());
        this.imageMimeType = IsoTypeReader.readString((ByteBuffer)allocate2.rewind());
        fileChannel.position(3L + (position + this.namespace.length() + this.schemaLocation.length() + this.imageMimeType.length()));
        this.parseContainer(fileChannel, n - (3 + (byteBuffer.remaining() + this.namespace.length() + this.schemaLocation.length() + this.imageMimeType.length())), boxParser);
    }
    
    public void setImageMimeType(final String imageMimeType) {
        this.imageMimeType = imageMimeType;
    }
    
    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }
    
    public void setSchemaLocation(final String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }
}
