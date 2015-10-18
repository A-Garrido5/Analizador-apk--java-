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

public final class AudioSampleEntry extends AbstractSampleEntry
{
    public static final String TYPE1 = "samr";
    public static final String TYPE10 = "mlpa";
    public static final String TYPE11 = "dtsl";
    public static final String TYPE12 = "dtsh";
    public static final String TYPE13 = "dtse";
    public static final String TYPE2 = "sawb";
    public static final String TYPE3 = "mp4a";
    public static final String TYPE4 = "drms";
    public static final String TYPE5 = "alac";
    public static final String TYPE7 = "owma";
    public static final String TYPE8 = "ac-3";
    public static final String TYPE9 = "ec-3";
    public static final String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;
    
    public AudioSampleEntry(final String s) {
        super(s);
    }
    
    @Override
    public void getBox(final WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(this.getHeader());
        int n;
        if (this.soundVersion == 1) {
            n = 16;
        }
        else {
            n = 0;
        }
        final int n2 = n + 28;
        final int soundVersion = this.soundVersion;
        int n3 = 0;
        if (soundVersion == 2) {
            n3 = 36;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n2 + n3);
        allocate.position(6);
        IsoTypeWriter.writeUInt16(allocate, this.dataReferenceIndex);
        IsoTypeWriter.writeUInt16(allocate, this.soundVersion);
        IsoTypeWriter.writeUInt16(allocate, this.reserved1);
        IsoTypeWriter.writeUInt32(allocate, this.reserved2);
        IsoTypeWriter.writeUInt16(allocate, this.channelCount);
        IsoTypeWriter.writeUInt16(allocate, this.sampleSize);
        IsoTypeWriter.writeUInt16(allocate, this.compressionId);
        IsoTypeWriter.writeUInt16(allocate, this.packetSize);
        if (this.type.equals("mlpa")) {
            IsoTypeWriter.writeUInt32(allocate, this.getSampleRate());
        }
        else {
            IsoTypeWriter.writeUInt32(allocate, this.getSampleRate() << 16);
        }
        if (this.soundVersion == 1) {
            IsoTypeWriter.writeUInt32(allocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerSample);
        }
        if (this.soundVersion == 2) {
            IsoTypeWriter.writeUInt32(allocate, this.samplesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerPacket);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerFrame);
            IsoTypeWriter.writeUInt32(allocate, this.bytesPerSample);
            allocate.put(this.soundVersion2Data);
        }
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        this.writeContainer(writableByteChannel);
    }
    
    public long getBytesPerFrame() {
        return this.bytesPerFrame;
    }
    
    public long getBytesPerPacket() {
        return this.bytesPerPacket;
    }
    
    public long getBytesPerSample() {
        return this.bytesPerSample;
    }
    
    public int getChannelCount() {
        return this.channelCount;
    }
    
    public int getCompressionId() {
        return this.compressionId;
    }
    
    public int getPacketSize() {
        return this.packetSize;
    }
    
    public int getReserved1() {
        return this.reserved1;
    }
    
    public long getReserved2() {
        return this.reserved2;
    }
    
    public long getSampleRate() {
        return this.sampleRate;
    }
    
    public int getSampleSize() {
        return this.sampleSize;
    }
    
    public long getSamplesPerPacket() {
        return this.samplesPerPacket;
    }
    
    @Override
    public long getSize() {
        int n = 16;
        int n2;
        if (this.soundVersion == 1) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        final int n3 = n2 + 28;
        final int soundVersion = this.soundVersion;
        int n4 = 0;
        if (soundVersion == 2) {
            n4 = 36;
        }
        final long n5 = n3 + n4 + this.getContainerSize();
        if (!this.largeBox && 8L + n5 < 4294967296L) {
            n = 8;
        }
        return n5 + n;
    }
    
    public int getSoundVersion() {
        return this.soundVersion;
    }
    
    public byte[] getSoundVersion2Data() {
        return this.soundVersion2Data;
    }
    
    @Override
    public void parse(final FileChannel fileChannel, final ByteBuffer byteBuffer, final long n, final BoxParser boxParser) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(28);
        fileChannel.read(allocate);
        allocate.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(allocate);
        this.soundVersion = IsoTypeReader.readUInt16(allocate);
        this.reserved1 = IsoTypeReader.readUInt16(allocate);
        this.reserved2 = IsoTypeReader.readUInt32(allocate);
        this.channelCount = IsoTypeReader.readUInt16(allocate);
        this.sampleSize = IsoTypeReader.readUInt16(allocate);
        this.compressionId = IsoTypeReader.readUInt16(allocate);
        this.packetSize = IsoTypeReader.readUInt16(allocate);
        this.sampleRate = IsoTypeReader.readUInt32(allocate);
        if (!this.type.equals("mlpa")) {
            this.sampleRate >>>= 16;
        }
        if (this.soundVersion == 1) {
            final ByteBuffer allocate2 = ByteBuffer.allocate(16);
            fileChannel.read(allocate2);
            allocate2.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(allocate2);
            this.bytesPerPacket = IsoTypeReader.readUInt32(allocate2);
            this.bytesPerFrame = IsoTypeReader.readUInt32(allocate2);
            this.bytesPerSample = IsoTypeReader.readUInt32(allocate2);
        }
        if (this.soundVersion == 2) {
            final ByteBuffer allocate3 = ByteBuffer.allocate(36);
            fileChannel.read(allocate3);
            allocate3.rewind();
            this.samplesPerPacket = IsoTypeReader.readUInt32(allocate3);
            this.bytesPerPacket = IsoTypeReader.readUInt32(allocate3);
            this.bytesPerFrame = IsoTypeReader.readUInt32(allocate3);
            this.bytesPerSample = IsoTypeReader.readUInt32(allocate3);
            allocate3.get(this.soundVersion2Data = new byte[20]);
        }
        final long n2 = n - 28L;
        int n3;
        if (this.soundVersion == 1) {
            n3 = 16;
        }
        else {
            n3 = 0;
        }
        final long n4 = n2 - n3;
        int n5;
        if (this.soundVersion == 2) {
            n5 = 36;
        }
        else {
            n5 = 0;
        }
        this.parseContainer(fileChannel, n4 - n5, boxParser);
    }
    
    public void setBytesPerFrame(final long bytesPerFrame) {
        this.bytesPerFrame = bytesPerFrame;
    }
    
    public void setBytesPerPacket(final long bytesPerPacket) {
        this.bytesPerPacket = bytesPerPacket;
    }
    
    public void setBytesPerSample(final long bytesPerSample) {
        this.bytesPerSample = bytesPerSample;
    }
    
    public void setChannelCount(final int channelCount) {
        this.channelCount = channelCount;
    }
    
    public void setCompressionId(final int compressionId) {
        this.compressionId = compressionId;
    }
    
    public void setPacketSize(final int packetSize) {
        this.packetSize = packetSize;
    }
    
    public void setReserved1(final int reserved1) {
        this.reserved1 = reserved1;
    }
    
    public void setReserved2(final long reserved2) {
        this.reserved2 = reserved2;
    }
    
    public void setSampleRate(final long sampleRate) {
        this.sampleRate = sampleRate;
    }
    
    public void setSampleSize(final int sampleSize) {
        this.sampleSize = sampleSize;
    }
    
    public void setSamplesPerPacket(final long samplesPerPacket) {
        this.samplesPerPacket = samplesPerPacket;
    }
    
    public void setSoundVersion(final int soundVersion) {
        this.soundVersion = soundVersion;
    }
    
    public void setSoundVersion2Data(final byte[] soundVersion2Data) {
        this.soundVersion2Data = soundVersion2Data;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.bytesPerSample + ", bytesPerFrame=" + this.bytesPerFrame + ", bytesPerPacket=" + this.bytesPerPacket + ", samplesPerPacket=" + this.samplesPerPacket + ", packetSize=" + this.packetSize + ", compressionId=" + this.compressionId + ", soundVersion=" + this.soundVersion + ", sampleRate=" + this.sampleRate + ", sampleSize=" + this.sampleSize + ", channelCount=" + this.channelCount + ", boxes=" + this.getBoxes() + '}';
    }
}
