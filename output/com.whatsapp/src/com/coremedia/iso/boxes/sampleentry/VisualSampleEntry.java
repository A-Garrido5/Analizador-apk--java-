// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.BoxParser;
import java.nio.channels.FileChannel;
import java.io.IOException;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import com.coremedia.iso.boxes.Container;

public final class VisualSampleEntry extends AbstractSampleEntry implements Container
{
    public static final String TYPE1 = "mp4v";
    public static final String TYPE2 = "s263";
    public static final String TYPE3 = "avc1";
    public static final String TYPE4 = "drmi";
    public static final String TYPE_ENCRYPTED = "encv";
    private String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;
    
    public VisualSampleEntry() {
        super("avc1");
        this.horizresolution = 72.0;
        this.vertresolution = 72.0;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }
    
    public VisualSampleEntry(final String s) {
        super(s);
        this.horizresolution = 72.0;
        this.vertresolution = 72.0;
        this.frameCount = 1;
        this.compressorname = "";
        this.depth = 24;
        this.predefined = new long[3];
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        final ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(allocate, 0);
        IsoTypeWriter.writeUInt16(allocate, 0);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[0]);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[1]);
        IsoTypeWriter.writeUInt32(allocate, this.predefined[2]);
        IsoTypeWriter.writeUInt16(allocate, this.getWidth());
        IsoTypeWriter.writeUInt16(allocate, this.getHeight());
        IsoTypeWriter.writeFixedPoint1616(allocate, this.getHorizresolution());
        IsoTypeWriter.writeFixedPoint1616(allocate, this.getVertresolution());
        IsoTypeWriter.writeUInt32(allocate, 0L);
        IsoTypeWriter.writeUInt16(allocate, this.getFrameCount());
        IsoTypeWriter.writeUInt8(allocate, Utf8.utf8StringLengthInBytes(this.getCompressorname()));
        allocate.put(Utf8.convert(this.getCompressorname()));
        int i = Utf8.utf8StringLengthInBytes(this.getCompressorname());
        while (i < 31) {
            ++i;
            allocate.put((byte)0);
        }
        IsoTypeWriter.writeUInt16(allocate, this.getDepth());
        IsoTypeWriter.writeUInt16(allocate, 65535);
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    public String getCompressorname() {
        return this.compressorname;
    }
    
    public int getDepth() {
        return this.depth;
    }
    
    public int getFrameCount() {
        return this.frameCount;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public double getHorizresolution() {
        return this.horizresolution;
    }
    
    @Override
    public long getSize() {
        final long containerSize = this.getContainerSize();
        final long n = containerSize + 78L;
        int n2;
        if (this.largeBox || 8L + (containerSize + 78L) >= 4294967296L) {
            n2 = 16;
        }
        else {
            n2 = 8;
        }
        return n + n2;
    }
    
    public double getVertresolution() {
        return this.vertresolution;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(78);
        fileChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        final long n2 = IsoTypeReader.readUInt16(allocate);
        assert 0L == n2 : "reserved byte not 0";
        final long n3 = IsoTypeReader.readUInt16(allocate);
        assert 0L == n3 : "reserved byte not 0";
        this.predefined[0] = IsoTypeReader.readUInt32(allocate);
        this.predefined[1] = IsoTypeReader.readUInt32(allocate);
        this.predefined[2] = IsoTypeReader.readUInt32(allocate);
        this.width = IsoTypeReader.readUInt16(allocate);
        this.height = IsoTypeReader.readUInt16(allocate);
        this.horizresolution = IsoTypeReader.readFixedPoint1616(allocate);
        this.vertresolution = IsoTypeReader.readFixedPoint1616(allocate);
        final long uInt32 = IsoTypeReader.readUInt32(allocate);
        assert 0L == uInt32 : "reserved byte not 0";
        this.frameCount = IsoTypeReader.readUInt16(allocate);
        int uInt33 = IsoTypeReader.readUInt8(allocate);
        if (uInt33 > 31) {
            System.out.println("invalid compressor name displayable data: " + uInt33);
            uInt33 = 31;
        }
        final byte[] array = new byte[uInt33];
        allocate.get(array);
        this.compressorname = Utf8.convert(array);
        if (uInt33 < 31) {
            allocate.get(new byte[31 - uInt33]);
        }
        this.depth = IsoTypeReader.readUInt16(allocate);
        final long n4 = IsoTypeReader.readUInt16(allocate);
        assert 65535L == n4;
        this.parseContainer(fileChannel, n - 78L, boxParser);
    }
    
    public void setCompressorname(final String compressorname) {
        this.compressorname = compressorname;
    }
    
    public void setDepth(final int depth) {
        this.depth = depth;
    }
    
    public void setFrameCount(final int frameCount) {
        this.frameCount = frameCount;
    }
    
    public void setHeight(final int height) {
        this.height = height;
    }
    
    public void setHorizresolution(final double horizresolution) {
        this.horizresolution = horizresolution;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setVertresolution(final double vertresolution) {
        this.vertresolution = vertresolution;
    }
    
    public void setWidth(final int width) {
        this.width = width;
    }
}
