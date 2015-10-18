// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Descriptor(tags = { 3 })
public class ESDescriptor extends BaseDescriptor
{
    private static Logger log;
    int URLFlag;
    int URLLength;
    String URLString;
    DecoderConfigDescriptor decoderConfigDescriptor;
    int dependsOnEsId;
    int esId;
    int oCREsId;
    int oCRstreamFlag;
    List<BaseDescriptor> otherDescriptors;
    int remoteODFlag;
    SLConfigDescriptor slConfigDescriptor;
    int streamDependenceFlag;
    int streamPriority;
    
    static {
        ESDescriptor.log = Logger.getLogger(ESDescriptor.class.getName());
    }
    
    public ESDescriptor() {
        this.URLLength = 0;
        this.otherDescriptors = new ArrayList<BaseDescriptor>();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final ESDescriptor esDescriptor = (ESDescriptor)o;
            if (this.URLFlag != esDescriptor.URLFlag) {
                return false;
            }
            if (this.URLLength != esDescriptor.URLLength) {
                return false;
            }
            if (this.dependsOnEsId != esDescriptor.dependsOnEsId) {
                return false;
            }
            if (this.esId != esDescriptor.esId) {
                return false;
            }
            if (this.oCREsId != esDescriptor.oCREsId) {
                return false;
            }
            if (this.oCRstreamFlag != esDescriptor.oCRstreamFlag) {
                return false;
            }
            if (this.remoteODFlag != esDescriptor.remoteODFlag) {
                return false;
            }
            if (this.streamDependenceFlag != esDescriptor.streamDependenceFlag) {
                return false;
            }
            if (this.streamPriority != esDescriptor.streamPriority) {
                return false;
            }
            Label_0176: {
                if (this.URLString != null) {
                    if (this.URLString.equals(esDescriptor.URLString)) {
                        break Label_0176;
                    }
                }
                else if (esDescriptor.URLString == null) {
                    break Label_0176;
                }
                return false;
            }
            Label_0206: {
                if (this.decoderConfigDescriptor != null) {
                    if (this.decoderConfigDescriptor.equals(esDescriptor.decoderConfigDescriptor)) {
                        break Label_0206;
                    }
                }
                else if (esDescriptor.decoderConfigDescriptor == null) {
                    break Label_0206;
                }
                return false;
            }
            Label_0238: {
                if (this.otherDescriptors != null) {
                    if (this.otherDescriptors.equals(esDescriptor.otherDescriptors)) {
                        break Label_0238;
                    }
                }
                else if (esDescriptor.otherDescriptors == null) {
                    break Label_0238;
                }
                return false;
            }
            if (this.slConfigDescriptor != null) {
                if (this.slConfigDescriptor.equals(esDescriptor.slConfigDescriptor)) {
                    return true;
                }
            }
            else if (esDescriptor.slConfigDescriptor == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public DecoderConfigDescriptor getDecoderConfigDescriptor() {
        return this.decoderConfigDescriptor;
    }
    
    public int getDependsOnEsId() {
        return this.dependsOnEsId;
    }
    
    public int getEsId() {
        return this.esId;
    }
    
    public List<BaseDescriptor> getOtherDescriptors() {
        return this.otherDescriptors;
    }
    
    public int getRemoteODFlag() {
        return this.remoteODFlag;
    }
    
    public SLConfigDescriptor getSlConfigDescriptor() {
        return this.slConfigDescriptor;
    }
    
    public int getStreamDependenceFlag() {
        return this.streamDependenceFlag;
    }
    
    public int getStreamPriority() {
        return this.streamPriority;
    }
    
    public int getURLFlag() {
        return this.URLFlag;
    }
    
    public int getURLLength() {
        return this.URLLength;
    }
    
    public String getURLString() {
        return this.URLString;
    }
    
    public int getoCREsId() {
        return this.oCREsId;
    }
    
    public int getoCRstreamFlag() {
        return this.oCRstreamFlag;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 * (31 * (31 * (31 * this.esId + this.streamDependenceFlag) + this.URLFlag) + this.oCRstreamFlag) + this.streamPriority) + this.URLLength);
        int hashCode;
        if (this.URLString != null) {
            hashCode = this.URLString.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (31 * (31 * (31 * (n + hashCode) + this.remoteODFlag) + this.dependsOnEsId) + this.oCREsId);
        int hashCode2;
        if (this.decoderConfigDescriptor != null) {
            hashCode2 = this.decoderConfigDescriptor.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (n2 + hashCode2);
        int hashCode3;
        if (this.slConfigDescriptor != null) {
            hashCode3 = this.slConfigDescriptor.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (n3 + hashCode3);
        final List<BaseDescriptor> otherDescriptors = this.otherDescriptors;
        int hashCode4 = 0;
        if (otherDescriptors != null) {
            hashCode4 = this.otherDescriptors.hashCode();
        }
        return n4 + hashCode4;
    }
    
    @Override
    public void parseDetail(final ByteBuffer byteBuffer) throws IOException {
        this.esId = IsoTypeReader.readUInt16(byteBuffer);
        final int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.streamDependenceFlag = uInt8 >>> 7;
        this.URLFlag = (0x1 & uInt8 >>> 6);
        this.oCRstreamFlag = (0x1 & uInt8 >>> 5);
        this.streamPriority = (uInt8 & 0x1F);
        if (this.streamDependenceFlag == 1) {
            this.dependsOnEsId = IsoTypeReader.readUInt16(byteBuffer);
        }
        if (this.URLFlag == 1) {
            this.URLLength = IsoTypeReader.readUInt8(byteBuffer);
            this.URLString = IsoTypeReader.readString(byteBuffer, this.URLLength);
        }
        if (this.oCRstreamFlag == 1) {
            this.oCREsId = IsoTypeReader.readUInt16(byteBuffer);
        }
        final int n = 1 + (2 + (1 + this.getSizeBytes()));
        int n2;
        if (this.streamDependenceFlag == 1) {
            n2 = 2;
        }
        else {
            n2 = 0;
        }
        final int n3 = n + n2;
        int n4;
        if (this.URLFlag == 1) {
            n4 = 1 + this.URLLength;
        }
        else {
            n4 = 0;
        }
        final int n5 = n3 + n4;
        int n6;
        if (this.oCRstreamFlag == 1) {
            n6 = 2;
        }
        else {
            n6 = 0;
        }
        int n7 = n5 + n6;
        final int position = byteBuffer.position();
        if (this.getSize() > n7 + 2) {
            final BaseDescriptor from = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
            final long n8 = byteBuffer.position() - position;
            final Logger log = ESDescriptor.log;
            final StringBuilder append = new StringBuilder().append(from).append(" - ESDescriptor1 read: ").append(n8).append(", size: ");
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
                byteBuffer.position(position + size);
                n7 += size;
            }
            else {
                n7 += (int)n8;
            }
            if (from instanceof DecoderConfigDescriptor) {
                this.decoderConfigDescriptor = (DecoderConfigDescriptor)from;
            }
        }
        final int position2 = byteBuffer.position();
        if (this.getSize() > n7 + 2) {
            final BaseDescriptor from2 = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
            final long n9 = byteBuffer.position() - position2;
            final Logger log2 = ESDescriptor.log;
            final StringBuilder append2 = new StringBuilder().append(from2).append(" - ESDescriptor2 read: ").append(n9).append(", size: ");
            Integer value2;
            if (from2 != null) {
                value2 = from2.getSize();
            }
            else {
                value2 = null;
            }
            log2.finer(append2.append(value2).toString());
            if (from2 != null) {
                final int size2 = from2.getSize();
                byteBuffer.position(position2 + size2);
                n7 += size2;
            }
            else {
                n7 += (int)n9;
            }
            if (from2 instanceof SLConfigDescriptor) {
                this.slConfigDescriptor = (SLConfigDescriptor)from2;
            }
        }
        else {
            ESDescriptor.log.warning("SLConfigDescriptor is missing!");
        }
        while (this.getSize() - n7 > 2) {
            final int position3 = byteBuffer.position();
            final BaseDescriptor from3 = ObjectDescriptorFactory.createFrom(-1, byteBuffer);
            final long n10 = byteBuffer.position() - position3;
            final Logger log3 = ESDescriptor.log;
            final StringBuilder append3 = new StringBuilder().append(from3).append(" - ESDescriptor3 read: ").append(n10).append(", size: ");
            Integer value3;
            if (from3 != null) {
                value3 = from3.getSize();
            }
            else {
                value3 = null;
            }
            log3.finer(append3.append(value3).toString());
            if (from3 != null) {
                final int size3 = from3.getSize();
                byteBuffer.position(position3 + size3);
                n7 += size3;
            }
            else {
                n7 += (int)n10;
            }
            this.otherDescriptors.add(from3);
        }
    }
    
    public ByteBuffer serialize() {
        final ByteBuffer allocate = ByteBuffer.allocate(this.serializedSize());
        IsoTypeWriter.writeUInt8(allocate, 3);
        IsoTypeWriter.writeUInt8(allocate, -2 + this.serializedSize());
        IsoTypeWriter.writeUInt16(allocate, this.esId);
        IsoTypeWriter.writeUInt8(allocate, this.streamDependenceFlag << 7 | this.URLFlag << 6 | this.oCRstreamFlag << 5 | (0x1F & this.streamPriority));
        if (this.streamDependenceFlag > 0) {
            IsoTypeWriter.writeUInt16(allocate, this.dependsOnEsId);
        }
        if (this.URLFlag > 0) {
            IsoTypeWriter.writeUInt8(allocate, this.URLLength);
            IsoTypeWriter.writeUtf8String(allocate, this.URLString);
        }
        if (this.oCRstreamFlag > 0) {
            IsoTypeWriter.writeUInt16(allocate, this.oCREsId);
        }
        final ByteBuffer serialize = this.decoderConfigDescriptor.serialize();
        final ByteBuffer serialize2 = this.slConfigDescriptor.serialize();
        allocate.put(serialize.array());
        allocate.put(serialize2.array());
        return allocate;
    }
    
    public int serializedSize() {
        int n = 5;
        if (this.streamDependenceFlag > 0) {
            n += 2;
        }
        if (this.URLFlag > 0) {
            n += 1 + this.URLLength;
        }
        if (this.oCRstreamFlag > 0) {
            n += 2;
        }
        return n + this.decoderConfigDescriptor.serializedSize() + this.slConfigDescriptor.serializedSize();
    }
    
    public void setDecoderConfigDescriptor(final DecoderConfigDescriptor decoderConfigDescriptor) {
        this.decoderConfigDescriptor = decoderConfigDescriptor;
    }
    
    public void setDependsOnEsId(final int dependsOnEsId) {
        this.dependsOnEsId = dependsOnEsId;
    }
    
    public void setEsId(final int esId) {
        this.esId = esId;
    }
    
    public void setRemoteODFlag(final int remoteODFlag) {
        this.remoteODFlag = remoteODFlag;
    }
    
    public void setSlConfigDescriptor(final SLConfigDescriptor slConfigDescriptor) {
        this.slConfigDescriptor = slConfigDescriptor;
    }
    
    public void setStreamDependenceFlag(final int streamDependenceFlag) {
        this.streamDependenceFlag = streamDependenceFlag;
    }
    
    public void setStreamPriority(final int streamPriority) {
        this.streamPriority = streamPriority;
    }
    
    public void setURLFlag(final int urlFlag) {
        this.URLFlag = urlFlag;
    }
    
    public void setURLLength(final int urlLength) {
        this.URLLength = urlLength;
    }
    
    public void setURLString(final String urlString) {
        this.URLString = urlString;
    }
    
    public void setoCREsId(final int ocrEsId) {
        this.oCREsId = ocrEsId;
    }
    
    public void setoCRstreamFlag(final int ocRstreamFlag) {
        this.oCRstreamFlag = ocRstreamFlag;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ESDescriptor");
        sb.append("{esId=").append(this.esId);
        sb.append(", streamDependenceFlag=").append(this.streamDependenceFlag);
        sb.append(", URLFlag=").append(this.URLFlag);
        sb.append(", oCRstreamFlag=").append(this.oCRstreamFlag);
        sb.append(", streamPriority=").append(this.streamPriority);
        sb.append(", URLLength=").append(this.URLLength);
        sb.append(", URLString='").append(this.URLString).append('\'');
        sb.append(", remoteODFlag=").append(this.remoteODFlag);
        sb.append(", dependsOnEsId=").append(this.dependsOnEsId);
        sb.append(", oCREsId=").append(this.oCREsId);
        sb.append(", decoderConfigDescriptor=").append(this.decoderConfigDescriptor);
        sb.append(", slConfigDescriptor=").append(this.slConfigDescriptor);
        sb.append('}');
        return sb.toString();
    }
}
