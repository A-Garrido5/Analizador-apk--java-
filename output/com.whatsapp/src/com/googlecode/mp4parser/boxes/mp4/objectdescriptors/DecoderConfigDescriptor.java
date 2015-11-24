// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.util.Arrays;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Descriptor(tags = { 4 })
public class DecoderConfigDescriptor extends BaseDescriptor
{
    private static Logger log;
    AudioSpecificConfig audioSpecificInfo;
    long avgBitRate;
    int bufferSizeDB;
    byte[] configDescriptorDeadBytes;
    DecoderSpecificInfo decoderSpecificInfo;
    long maxBitRate;
    int objectTypeIndication;
    List<ProfileLevelIndicationDescriptor> profileLevelIndicationDescriptors;
    int streamType;
    int upStream;
    
    static {
        DecoderConfigDescriptor.log = Logger.getLogger(DecoderConfigDescriptor.class.getName());
    }
    
    public DecoderConfigDescriptor() {
        this.profileLevelIndicationDescriptors = new ArrayList<ProfileLevelIndicationDescriptor>();
    }
    
    public AudioSpecificConfig getAudioSpecificInfo() {
        return this.audioSpecificInfo;
    }
    
    public long getAvgBitRate() {
        return this.avgBitRate;
    }
    
    public int getBufferSizeDB() {
        return this.bufferSizeDB;
    }
    
    public DecoderSpecificInfo getDecoderSpecificInfo() {
        return this.decoderSpecificInfo;
    }
    
    public long getMaxBitRate() {
        return this.maxBitRate;
    }
    
    public int getObjectTypeIndication() {
        return this.objectTypeIndication;
    }
    
    public List<ProfileLevelIndicationDescriptor> getProfileLevelIndicationDescriptors() {
        return this.profileLevelIndicationDescriptors;
    }
    
    public int getStreamType() {
        return this.streamType;
    }
    
    public int getUpStream() {
        return this.upStream;
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        this.objectTypeIndication = IsoTypeReader.readUInt8(byteBuffer);
        final int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.streamType = uInt8 >>> 2;
        this.upStream = (0x1 & uInt8 >> 1);
        this.bufferSizeDB = IsoTypeReader.readUInt24(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            final int position = byteBuffer.position();
            final BaseDescriptor from = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer);
            final int n = byteBuffer.position() - position;
            final Logger log = DecoderConfigDescriptor.log;
            final StringBuilder append = new StringBuilder().append(from).append(" - DecoderConfigDescr1 read: ").append(n).append(", size: ");
            Integer value;
            if (from != null) {
                value = from.getSize();
            }
            else {
                value = null;
            }
            log.finer(append.append(value).toString());
            if (from != null) {
                final int size = from.getSize();
                if (n < size) {
                    byteBuffer.get(this.configDescriptorDeadBytes = new byte[size - n]);
                }
            }
            if (from instanceof DecoderSpecificInfo) {
                this.decoderSpecificInfo = (DecoderSpecificInfo)from;
            }
            if (from instanceof AudioSpecificConfig) {
                this.audioSpecificInfo = (AudioSpecificConfig)from;
            }
        }
        while (byteBuffer.remaining() > 2) {
            final long n2 = byteBuffer.position();
            final BaseDescriptor from2 = ObjectDescriptorFactory.createFrom(this.objectTypeIndication, byteBuffer);
            final long n3 = byteBuffer.position() - n2;
            final Logger log2 = DecoderConfigDescriptor.log;
            final StringBuilder append2 = new StringBuilder().append(from2).append(" - DecoderConfigDescr2 read: ").append(n3).append(", size: ");
            Integer value2;
            if (from2 != null) {
                value2 = from2.getSize();
            }
            else {
                value2 = null;
            }
            log2.finer(append2.append(value2).toString());
            if (from2 instanceof ProfileLevelIndicationDescriptor) {
                this.profileLevelIndicationDescriptors.add((ProfileLevelIndicationDescriptor)from2);
            }
        }
    }
    
    public ByteBuffer serialize() {
        final ByteBuffer allocate = ByteBuffer.allocate(this.serializedSize());
        IsoTypeWriter.writeUInt8(allocate, 4);
        IsoTypeWriter.writeUInt8(allocate, -2 + this.serializedSize());
        IsoTypeWriter.writeUInt8(allocate, this.objectTypeIndication);
        IsoTypeWriter.writeUInt8(allocate, 0x1 | (this.streamType << 2 | this.upStream << 1));
        IsoTypeWriter.writeUInt24(allocate, this.bufferSizeDB);
        IsoTypeWriter.writeUInt32(allocate, this.maxBitRate);
        IsoTypeWriter.writeUInt32(allocate, this.avgBitRate);
        allocate.put(this.audioSpecificInfo.serialize().array());
        return allocate;
    }
    
    public int serializedSize() {
        return 15 + this.audioSpecificInfo.serializedSize();
    }
    
    public void setAudioSpecificInfo(final AudioSpecificConfig audioSpecificInfo) {
        this.audioSpecificInfo = audioSpecificInfo;
    }
    
    public void setAvgBitRate(final long avgBitRate) {
        this.avgBitRate = avgBitRate;
    }
    
    public void setBufferSizeDB(final int bufferSizeDB) {
        this.bufferSizeDB = bufferSizeDB;
    }
    
    public void setMaxBitRate(final long maxBitRate) {
        this.maxBitRate = maxBitRate;
    }
    
    public void setObjectTypeIndication(final int objectTypeIndication) {
        this.objectTypeIndication = objectTypeIndication;
    }
    
    public void setStreamType(final int streamType) {
        this.streamType = streamType;
    }
    
    public void setUpStream(final int upStream) {
        this.upStream = upStream;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DecoderConfigDescriptor");
        sb.append("{objectTypeIndication=").append(this.objectTypeIndication);
        sb.append(", streamType=").append(this.streamType);
        sb.append(", upStream=").append(this.upStream);
        sb.append(", bufferSizeDB=").append(this.bufferSizeDB);
        sb.append(", maxBitRate=").append(this.maxBitRate);
        sb.append(", avgBitRate=").append(this.avgBitRate);
        sb.append(", decoderSpecificInfo=").append(this.decoderSpecificInfo);
        sb.append(", audioSpecificInfo=").append(this.audioSpecificInfo);
        final StringBuilder append = sb.append(", configDescriptorDeadBytes=");
        byte[] configDescriptorDeadBytes;
        if (this.configDescriptorDeadBytes != null) {
            configDescriptorDeadBytes = this.configDescriptorDeadBytes;
        }
        else {
            configDescriptorDeadBytes = new byte[0];
        }
        append.append(Hex.encodeHex(configDescriptorDeadBytes));
        final StringBuilder append2 = sb.append(", profileLevelIndicationDescriptors=");
        String string;
        if (this.profileLevelIndicationDescriptors == null) {
            string = "null";
        }
        else {
            string = Arrays.asList(this.profileLevelIndicationDescriptors).toString();
        }
        append2.append(string);
        sb.append('}');
        return sb.toString();
    }
}
