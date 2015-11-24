// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.threegpp26244;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SegmentIndexBox extends AbstractFullBox
{
    public static final String TYPE = "sidx";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    long earliestPresentationTime;
    List<Entry> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;
    
    static {
        ajc$preClinit();
    }
    
    public SegmentIndexBox() {
        super("sidx");
        this.entries = new ArrayList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SegmentIndexBox.java", SegmentIndexBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), 132);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"), 168);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"), 172);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 136);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "referenceId", "", "void"), 140);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 144);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "timeScale", "", "void"), 148);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 152);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"), 156);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "long"), 160);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "long", "firstOffset", "", "void"), 164);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.referenceId = IsoTypeReader.readUInt32(byteBuffer);
        this.timeScale = IsoTypeReader.readUInt32(byteBuffer);
        if (this.getVersion() == 0) {
            this.earliestPresentationTime = IsoTypeReader.readUInt32(byteBuffer);
            this.firstOffset = IsoTypeReader.readUInt32(byteBuffer);
        }
        else {
            this.earliestPresentationTime = IsoTypeReader.readUInt64(byteBuffer);
            this.firstOffset = IsoTypeReader.readUInt64(byteBuffer);
        }
        this.reserved = IsoTypeReader.readUInt16(byteBuffer);
        for (int uInt16 = IsoTypeReader.readUInt16(byteBuffer), i = 0; i < uInt16; ++i) {
            final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
            final Entry entry = new Entry();
            entry.setReferenceType((byte)bitReaderBuffer.readBits(1));
            entry.setReferencedSize(bitReaderBuffer.readBits(31));
            entry.setSubsegmentDuration(IsoTypeReader.readUInt32(byteBuffer));
            final BitReaderBuffer bitReaderBuffer2 = new BitReaderBuffer(byteBuffer);
            entry.setStartsWithSap((byte)bitReaderBuffer2.readBits(1));
            entry.setSapType((byte)bitReaderBuffer2.readBits(3));
            entry.setSapDeltaTime(bitReaderBuffer2.readBits(28));
            this.entries.add(entry);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.referenceId);
        IsoTypeWriter.writeUInt32(byteBuffer, this.timeScale);
        if (this.getVersion() == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt32(byteBuffer, this.firstOffset);
        }
        else {
            IsoTypeWriter.writeUInt64(byteBuffer, this.earliestPresentationTime);
            IsoTypeWriter.writeUInt64(byteBuffer, this.firstOffset);
        }
        IsoTypeWriter.writeUInt16(byteBuffer, this.reserved);
        IsoTypeWriter.writeUInt16(byteBuffer, this.entries.size());
        for (final Entry entry : this.entries) {
            final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer.writeBits(entry.getReferenceType(), 1);
            bitWriterBuffer.writeBits(entry.getReferencedSize(), 31);
            IsoTypeWriter.writeUInt32(byteBuffer, entry.getSubsegmentDuration());
            final BitWriterBuffer bitWriterBuffer2 = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer2.writeBits(entry.getStartsWithSap(), 1);
            bitWriterBuffer2.writeBits(entry.getSapType(), 3);
            bitWriterBuffer2.writeBits(entry.getSapDeltaTime(), 28);
        }
    }
    
    @Override
    protected long getContentSize() {
        final long n = 4L + (4L + 4L);
        int n2;
        if (this.getVersion() == 0) {
            n2 = 8;
        }
        else {
            n2 = 16;
        }
        return 2L + (2L + (n + n2)) + 12 * this.entries.size();
    }
    
    public long getEarliestPresentationTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_6, this, this));
        return this.earliestPresentationTime;
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public long getFirstOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_8, this, this));
        return this.firstOffset;
    }
    
    public long getReferenceId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_2, this, this));
        return this.referenceId;
    }
    
    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_10, this, this));
        return this.reserved;
    }
    
    public long getTimeScale() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_4, this, this));
        return this.timeScale;
    }
    
    public void setEarliestPresentationTime(final long earliestPresentationTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_7, this, this, Conversions.longObject(earliestPresentationTime)));
        this.earliestPresentationTime = earliestPresentationTime;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
    }
    
    public void setFirstOffset(final long firstOffset) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_9, this, this, Conversions.longObject(firstOffset)));
        this.firstOffset = firstOffset;
    }
    
    public void setReferenceId(final long referenceId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_3, this, this, Conversions.longObject(referenceId)));
        this.referenceId = referenceId;
    }
    
    public void setReserved(final int reserved) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_11, this, this, Conversions.intObject(reserved)));
        this.reserved = reserved;
    }
    
    public void setTimeScale(final long timeScale) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SegmentIndexBox.ajc$tjp_5, this, this, Conversions.longObject(timeScale)));
        this.timeScale = timeScale;
    }
    
    public static class Entry
    {
        byte referenceType;
        int referencedSize;
        int sapDeltaTime;
        byte sapType;
        byte startsWithSap;
        long subsegmentDuration;
        
        public Entry() {
        }
        
        public Entry(final byte referenceType, final int referencedSize, final long subsegmentDuration, final byte startsWithSap, final byte sapType, final int sapDeltaTime) {
            this.referenceType = referenceType;
            this.referencedSize = referencedSize;
            this.subsegmentDuration = subsegmentDuration;
            this.startsWithSap = startsWithSap;
            this.sapType = sapType;
            this.sapDeltaTime = sapDeltaTime;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.referenceType != entry.referenceType) {
                    return false;
                }
                if (this.referencedSize != entry.referencedSize) {
                    return false;
                }
                if (this.sapDeltaTime != entry.sapDeltaTime) {
                    return false;
                }
                if (this.sapType != entry.sapType) {
                    return false;
                }
                if (this.startsWithSap != entry.startsWithSap) {
                    return false;
                }
                if (this.subsegmentDuration != entry.subsegmentDuration) {
                    return false;
                }
            }
            return true;
        }
        
        public byte getReferenceType() {
            return this.referenceType;
        }
        
        public int getReferencedSize() {
            return this.referencedSize;
        }
        
        public int getSapDeltaTime() {
            return this.sapDeltaTime;
        }
        
        public byte getSapType() {
            return this.sapType;
        }
        
        public byte getStartsWithSap() {
            return this.startsWithSap;
        }
        
        public long getSubsegmentDuration() {
            return this.subsegmentDuration;
        }
        
        @Override
        public int hashCode() {
            return 31 * (31 * (31 * (31 * (31 * this.referenceType + this.referencedSize) + (int)(this.subsegmentDuration ^ this.subsegmentDuration >>> 32)) + this.startsWithSap) + this.sapType) + this.sapDeltaTime;
        }
        
        public void setReferenceType(final byte referenceType) {
            this.referenceType = referenceType;
        }
        
        public void setReferencedSize(final int referencedSize) {
            this.referencedSize = referencedSize;
        }
        
        public void setSapDeltaTime(final int sapDeltaTime) {
            this.sapDeltaTime = sapDeltaTime;
        }
        
        public void setSapType(final byte sapType) {
            this.sapType = sapType;
        }
        
        public void setStartsWithSap(final byte startsWithSap) {
            this.startsWithSap = startsWithSap;
        }
        
        public void setSubsegmentDuration(final long subsegmentDuration) {
            this.subsegmentDuration = subsegmentDuration;
        }
        
        @Override
        public String toString() {
            return "Entry{referenceType=" + this.referenceType + ", referencedSize=" + this.referencedSize + ", subsegmentDuration=" + this.subsegmentDuration + ", startsWithSap=" + this.startsWithSap + ", sapType=" + this.sapType + ", sapDeltaTime=" + this.sapDeltaTime + '}';
        }
    }
}
