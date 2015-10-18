// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SubSampleInformationBox extends AbstractFullBox
{
    public static final String TYPE = "subs";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private List<SampleEntry> entries;
    private long entryCount;
    
    static {
        ajc$preClinit();
    }
    
    public SubSampleInformationBox() {
        super("subs");
        this.entries = new ArrayList<SampleEntry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 51);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 55);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 115);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.entryCount = IsoTypeReader.readUInt32(byteBuffer);
        for (int n = 0; n < this.entryCount; ++n) {
            final SampleEntry sampleEntry = new SampleEntry();
            sampleEntry.setSampleDelta(IsoTypeReader.readUInt32(byteBuffer));
            for (int uInt16 = IsoTypeReader.readUInt16(byteBuffer), i = 0; i < uInt16; ++i) {
                final SubsampleEntry subsampleEntry = new SubsampleEntry();
                long uInt17;
                if (this.getVersion() == 1) {
                    uInt17 = IsoTypeReader.readUInt32(byteBuffer);
                }
                else {
                    uInt17 = IsoTypeReader.readUInt16(byteBuffer);
                }
                subsampleEntry.setSubsampleSize(uInt17);
                subsampleEntry.setSubsamplePriority(IsoTypeReader.readUInt8(byteBuffer));
                subsampleEntry.setDiscardable(IsoTypeReader.readUInt8(byteBuffer));
                subsampleEntry.setReserved(IsoTypeReader.readUInt32(byteBuffer));
                sampleEntry.addSubsampleEntry(subsampleEntry);
            }
            this.entries.add(sampleEntry);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        for (final SampleEntry sampleEntry : this.entries) {
            IsoTypeWriter.writeUInt32(byteBuffer, sampleEntry.getSampleDelta());
            IsoTypeWriter.writeUInt16(byteBuffer, sampleEntry.getSubsampleCount());
            for (final SubsampleEntry subsampleEntry : sampleEntry.getSubsampleEntries()) {
                if (this.getVersion() == 1) {
                    IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getSubsampleSize());
                }
                else {
                    IsoTypeWriter.writeUInt16(byteBuffer, CastUtils.l2i(subsampleEntry.getSubsampleSize()));
                }
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getSubsamplePriority());
                IsoTypeWriter.writeUInt8(byteBuffer, subsampleEntry.getDiscardable());
                IsoTypeWriter.writeUInt32(byteBuffer, subsampleEntry.getReserved());
            }
        }
    }
    
    @Override
    protected long getContentSize() {
        final long n = 8L + 6L * this.entryCount;
        int n2 = 0;
        final Iterator<SampleEntry> iterator = this.entries.iterator();
        while (iterator.hasNext()) {
            final int subsampleCount = iterator.next().getSubsampleCount();
            int n3;
            if (this.getVersion() == 1) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n2 += subsampleCount * (4 + (1 + (n3 + 1)));
        }
        return n + n2;
    }
    
    public List<SampleEntry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SubSampleInformationBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public void setEntries(final List<SampleEntry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SubSampleInformationBox.ajc$tjp_1, this, this, entries));
        this.entries = entries;
        this.entryCount = entries.size();
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SubSampleInformationBox.ajc$tjp_2, this, this));
        return "SubSampleInformationBox{entryCount=" + this.entryCount + ", entries=" + this.entries + '}';
    }
    
    public static class SampleEntry
    {
        private long sampleDelta;
        private int subsampleCount;
        private List<SubsampleEntry> subsampleEntries;
        
        public SampleEntry() {
            this.subsampleEntries = new ArrayList<SubsampleEntry>();
        }
        
        public void addSubsampleEntry(final SubsampleEntry subsampleEntry) {
            this.subsampleEntries.add(subsampleEntry);
            ++this.subsampleCount;
        }
        
        public long getSampleDelta() {
            return this.sampleDelta;
        }
        
        public int getSubsampleCount() {
            return this.subsampleCount;
        }
        
        public List<SubsampleEntry> getSubsampleEntries() {
            return this.subsampleEntries;
        }
        
        public void setSampleDelta(final long sampleDelta) {
            this.sampleDelta = sampleDelta;
        }
        
        public void setSubsampleCount(final int subsampleCount) {
            this.subsampleCount = subsampleCount;
        }
        
        @Override
        public String toString() {
            return "SampleEntry{sampleDelta=" + this.sampleDelta + ", subsampleCount=" + this.subsampleCount + ", subsampleEntries=" + this.subsampleEntries + '}';
        }
        
        public static class SubsampleEntry
        {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;
            
            public int getDiscardable() {
                return this.discardable;
            }
            
            public long getReserved() {
                return this.reserved;
            }
            
            public int getSubsamplePriority() {
                return this.subsamplePriority;
            }
            
            public long getSubsampleSize() {
                return this.subsampleSize;
            }
            
            public void setDiscardable(final int discardable) {
                this.discardable = discardable;
            }
            
            public void setReserved(final long reserved) {
                this.reserved = reserved;
            }
            
            public void setSubsamplePriority(final int subsamplePriority) {
                this.subsamplePriority = subsamplePriority;
            }
            
            public void setSubsampleSize(final long subsampleSize) {
                this.subsampleSize = subsampleSize;
            }
            
            @Override
            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.subsampleSize + ", subsamplePriority=" + this.subsamplePriority + ", discardable=" + this.discardable + ", reserved=" + this.reserved + '}';
            }
        }
    }
}
