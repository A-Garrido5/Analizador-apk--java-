// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReaderVariable;
import java.util.ArrayList;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackFragmentRandomAccessBox extends AbstractFullBox
{
    public static final String TYPE = "tfra";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private List<Entry> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;
    
    static {
        ajc$preClinit();
    }
    
    public TrackFragmentRandomAccessBox() {
        super("tfra");
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.emptyList();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "long", "trackId", "", "void"), 145);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 161);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "long"), 181);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        final long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        this.reserved = (int)(uInt32 >> 6);
        this.lengthSizeOfTrafNum = 1 + ((int)(0x3FL & uInt32) >> 4);
        this.lengthSizeOfTrunNum = 1 + ((int)(0xCL & uInt32) >> 2);
        this.lengthSizeOfSampleNum = 1 + (int)(0x3L & uInt32);
        final long uInt33 = IsoTypeReader.readUInt32(byteBuffer);
        this.entries = new ArrayList<Entry>();
        for (int n = 0; n < uInt33; ++n) {
            final Entry entry = new Entry();
            if (this.getVersion() == 1) {
                Entry.access$0(entry, IsoTypeReader.readUInt64(byteBuffer));
                Entry.access$1(entry, IsoTypeReader.readUInt64(byteBuffer));
            }
            else {
                Entry.access$0(entry, IsoTypeReader.readUInt32(byteBuffer));
                Entry.access$1(entry, IsoTypeReader.readUInt32(byteBuffer));
            }
            Entry.access$2(entry, IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrafNum));
            Entry.access$3(entry, IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfTrunNum));
            Entry.access$4(entry, IsoTypeReaderVariable.read(byteBuffer, this.lengthSizeOfSampleNum));
            this.entries.add(entry);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer, this.reserved << 6 | (0x3 & -1 + this.lengthSizeOfTrafNum) << 4 | (0x3 & -1 + this.lengthSizeOfTrunNum) << 2 | (0x3 & -1 + this.lengthSizeOfSampleNum));
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (final Entry entry : this.entries) {
            if (this.getVersion() == 1) {
                IsoTypeWriter.writeUInt64(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt64(byteBuffer, entry.moofOffset);
            }
            else {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.time);
                IsoTypeWriter.writeUInt32(byteBuffer, entry.moofOffset);
            }
            IsoTypeWriterVariable.write(entry.trafNumber, byteBuffer, this.lengthSizeOfTrafNum);
            IsoTypeWriterVariable.write(entry.trunNumber, byteBuffer, this.lengthSizeOfTrunNum);
            IsoTypeWriterVariable.write(entry.sampleNumber, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }
    
    @Override
    protected long getContentSize() {
        final long n = 4L + 12L;
        long n2;
        if (this.getVersion() == 1) {
            n2 = n + 16 * this.entries.size();
        }
        else {
            n2 = n + 8 * this.entries.size();
        }
        return n2 + this.lengthSizeOfTrafNum * this.entries.size() + this.lengthSizeOfTrunNum * this.entries.size() + this.lengthSizeOfSampleNum * this.entries.size();
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_10, this, this));
        return Collections.unmodifiableList((List<? extends Entry>)this.entries);
    }
    
    public int getLengthSizeOfSampleNum() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_8, this, this));
        return this.lengthSizeOfSampleNum;
    }
    
    public int getLengthSizeOfTrafNum() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_6, this, this));
        return this.lengthSizeOfTrafNum;
    }
    
    public int getLengthSizeOfTrunNum() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_7, this, this));
        return this.lengthSizeOfTrunNum;
    }
    
    public long getNumberOfEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_9, this, this));
        return this.entries.size();
    }
    
    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_5, this, this));
        return this.reserved;
    }
    
    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_4, this, this));
        return this.trackId;
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_11, this, this, entries));
        this.entries = entries;
    }
    
    public void setLengthSizeOfSampleNum(final int lengthSizeOfSampleNum) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_3, this, this, Conversions.intObject(lengthSizeOfSampleNum)));
        this.lengthSizeOfSampleNum = lengthSizeOfSampleNum;
    }
    
    public void setLengthSizeOfTrafNum(final int lengthSizeOfTrafNum) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_1, this, this, Conversions.intObject(lengthSizeOfTrafNum)));
        this.lengthSizeOfTrafNum = lengthSizeOfTrafNum;
    }
    
    public void setLengthSizeOfTrunNum(final int lengthSizeOfTrunNum) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_2, this, this, Conversions.intObject(lengthSizeOfTrunNum)));
        this.lengthSizeOfTrunNum = lengthSizeOfTrunNum;
    }
    
    public void setTrackId(final long trackId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_0, this, this, Conversions.longObject(trackId)));
        this.trackId = trackId;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentRandomAccessBox.ajc$tjp_12, this, this));
        return "TrackFragmentRandomAccessBox{trackId=" + this.trackId + ", entries=" + this.entries + '}';
    }
    
    public static class Entry
    {
        private long moofOffset;
        private long sampleNumber;
        private long time;
        private long trafNumber;
        private long trunNumber;
        
        public Entry() {
        }
        
        public Entry(final long time, final long moofOffset, final long trafNumber, final long trunNumber, final long sampleNumber) {
            this.moofOffset = moofOffset;
            this.sampleNumber = sampleNumber;
            this.time = time;
            this.trafNumber = trafNumber;
            this.trunNumber = trunNumber;
        }
        
        static /* synthetic */ void access$0(final Entry entry, final long time) {
            entry.time = time;
        }
        
        static /* synthetic */ void access$1(final Entry entry, final long moofOffset) {
            entry.moofOffset = moofOffset;
        }
        
        static /* synthetic */ void access$2(final Entry entry, final long trafNumber) {
            entry.trafNumber = trafNumber;
        }
        
        static /* synthetic */ void access$3(final Entry entry, final long trunNumber) {
            entry.trunNumber = trunNumber;
        }
        
        static /* synthetic */ void access$4(final Entry entry, final long sampleNumber) {
            entry.sampleNumber = sampleNumber;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this != o) {
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }
                final Entry entry = (Entry)o;
                if (this.moofOffset != entry.moofOffset) {
                    return false;
                }
                if (this.sampleNumber != entry.sampleNumber) {
                    return false;
                }
                if (this.time != entry.time) {
                    return false;
                }
                if (this.trafNumber != entry.trafNumber) {
                    return false;
                }
                if (this.trunNumber != entry.trunNumber) {
                    return false;
                }
            }
            return true;
        }
        
        public long getMoofOffset() {
            return this.moofOffset;
        }
        
        public long getSampleNumber() {
            return this.sampleNumber;
        }
        
        public long getTime() {
            return this.time;
        }
        
        public long getTrafNumber() {
            return this.trafNumber;
        }
        
        public long getTrunNumber() {
            return this.trunNumber;
        }
        
        @Override
        public int hashCode() {
            return 31 * (31 * (31 * (31 * (int)(this.time ^ this.time >>> 32) + (int)(this.moofOffset ^ this.moofOffset >>> 32)) + (int)(this.trafNumber ^ this.trafNumber >>> 32)) + (int)(this.trunNumber ^ this.trunNumber >>> 32)) + (int)(this.sampleNumber ^ this.sampleNumber >>> 32);
        }
        
        public void setMoofOffset(final long moofOffset) {
            this.moofOffset = moofOffset;
        }
        
        public void setSampleNumber(final long sampleNumber) {
            this.sampleNumber = sampleNumber;
        }
        
        public void setTime(final long time) {
            this.time = time;
        }
        
        public void setTrafNumber(final long trafNumber) {
            this.trafNumber = trafNumber;
        }
        
        public void setTrunNumber(final long trunNumber) {
            this.trunNumber = trunNumber;
        }
        
        @Override
        public String toString() {
            return "Entry{time=" + this.time + ", moofOffset=" + this.moofOffset + ", trafNumber=" + this.trafNumber + ", trunNumber=" + this.trunNumber + ", sampleNumber=" + this.sampleNumber + '}';
        }
    }
}
