// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackRunBox extends AbstractFullBox
{
    public static final String TYPE = "trun";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_18;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_19;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private int dataOffset;
    private List<Entry> entries;
    private SampleFlags firstSampleFlags;
    
    static {
        ajc$preClinit();
    }
    
    public TrackRunBox() {
        super("trun");
        this.entries = new ArrayList<Entry>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 117);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 260);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 268);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 276);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 285);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 293);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), 302);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 306);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 310);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 320);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 335);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 126);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "long"), 231);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 235);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 239);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 244);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 248);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 252);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 256);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            this.dataOffset = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        }
        else {
            this.dataOffset = -1;
        }
        if ((0x4 & this.getFlags()) == 0x4) {
            this.firstSampleFlags = new SampleFlags(byteBuffer);
        }
        for (int n = 0; n < uInt32; ++n) {
            final Entry entry = new Entry();
            if ((0x100 & this.getFlags()) == 0x100) {
                Entry.access$4(entry, IsoTypeReader.readUInt32(byteBuffer));
            }
            if ((0x200 & this.getFlags()) == 0x200) {
                Entry.access$5(entry, IsoTypeReader.readUInt32(byteBuffer));
            }
            if ((0x400 & this.getFlags()) == 0x400) {
                Entry.access$6(entry, new SampleFlags(byteBuffer));
            }
            if ((0x800 & this.getFlags()) == 0x800) {
                Entry.access$7(entry, byteBuffer.getInt());
            }
            this.entries.add(entry);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.entries.size());
        final int flags = this.getFlags();
        if ((flags & 0x1) == 0x1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.dataOffset);
        }
        if ((flags & 0x4) == 0x4) {
            this.firstSampleFlags.getContent(byteBuffer);
        }
        for (final Entry entry : this.entries) {
            if ((flags & 0x100) == 0x100) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleDuration);
            }
            if ((flags & 0x200) == 0x200) {
                IsoTypeWriter.writeUInt32(byteBuffer, entry.sampleSize);
            }
            if ((flags & 0x400) == 0x400) {
                entry.sampleFlags.getContent(byteBuffer);
            }
            if ((flags & 0x800) == 0x800) {
                byteBuffer.putInt(entry.sampleCompositionTimeOffset);
            }
        }
    }
    
    @Override
    protected long getContentSize() {
        long n = 8L;
        final int flags = this.getFlags();
        if ((flags & 0x1) == 0x1) {
            n += 4L;
        }
        if ((flags & 0x4) == 0x4) {
            n += 4L;
        }
        long n2 = 0L;
        if ((flags & 0x100) == 0x100) {
            n2 += 4L;
        }
        if ((flags & 0x200) == 0x200) {
            n2 += 4L;
        }
        if ((flags & 0x400) == 0x400) {
            n2 += 4L;
        }
        if ((flags & 0x800) == 0x800) {
            n2 += 4L;
        }
        return n + n2 * this.entries.size();
    }
    
    public int getDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_15, this, this));
        return this.dataOffset;
    }
    
    public List<Entry> getEntries() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_0, this, this));
        return this.entries;
    }
    
    public SampleFlags getFirstSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_16, this, this));
        return this.firstSampleFlags;
    }
    
    public long[] getSampleCompositionTimeOffsets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_2, this, this));
        if (this.isSampleCompositionTimeOffsetPresent()) {
            final long[] array = new long[this.entries.size()];
            for (int i = 0; i < array.length; ++i) {
                array[i] = this.entries.get(i).getSampleCompositionTimeOffset();
            }
            return array;
        }
        return null;
    }
    
    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_3, this, this));
        return this.entries.size();
    }
    
    public boolean isDataOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_4, this, this));
        return (0x1 & this.getFlags()) == 0x1;
    }
    
    public boolean isFirstSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_5, this, this));
        return (0x4 & this.getFlags()) == 0x4;
    }
    
    public boolean isSampleCompositionTimeOffsetPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_9, this, this));
        return (0x800 & this.getFlags()) == 0x800;
    }
    
    public boolean isSampleDurationPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_7, this, this));
        return (0x100 & this.getFlags()) == 0x100;
    }
    
    public boolean isSampleFlagsPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_8, this, this));
        return (0x400 & this.getFlags()) == 0x400;
    }
    
    public boolean isSampleSizePresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_6, this, this));
        return (0x200 & this.getFlags()) == 0x200;
    }
    
    public void setDataOffset(final int dataOffset) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_1, this, this, Conversions.intObject(dataOffset)));
        if (dataOffset == -1) {
            this.setFlags(0xFFFFFE & this.getFlags());
        }
        else {
            this.setFlags(0x1 | this.getFlags());
        }
        this.dataOffset = dataOffset;
    }
    
    public void setDataOffsetPresent(final boolean b) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_10, this, this, Conversions.booleanObject(b)));
        if (b) {
            this.setFlags(0x1 | this.getFlags());
            return;
        }
        this.setFlags(0xFFFFFE & this.getFlags());
    }
    
    public void setEntries(final List<Entry> entries) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_19, this, this, entries));
        this.entries = entries;
    }
    
    public void setFirstSampleFlags(final SampleFlags firstSampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_17, this, this, firstSampleFlags));
        if (firstSampleFlags == null) {
            this.setFlags(0xFFFFFB & this.getFlags());
        }
        else {
            this.setFlags(0x4 | this.getFlags());
        }
        this.firstSampleFlags = firstSampleFlags;
    }
    
    public void setSampleCompositionTimeOffsetPresent(final boolean b) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_14, this, this, Conversions.booleanObject(b)));
        if (b) {
            this.setFlags(0x800 | this.getFlags());
            return;
        }
        this.setFlags(0xFFF7FF & this.getFlags());
    }
    
    public void setSampleDurationPresent(final boolean b) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_12, this, this, Conversions.booleanObject(b)));
        if (b) {
            this.setFlags(0x100 | this.getFlags());
            return;
        }
        this.setFlags(0xFFFEFF & this.getFlags());
    }
    
    public void setSampleFlagsPresent(final boolean b) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_13, this, this, Conversions.booleanObject(b)));
        if (b) {
            this.setFlags(0x400 | this.getFlags());
            return;
        }
        this.setFlags(0xFFFBFF & this.getFlags());
    }
    
    public void setSampleSizePresent(final boolean b) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_11, this, this, Conversions.booleanObject(b)));
        if (b) {
            this.setFlags(0x200 | this.getFlags());
            return;
        }
        this.setFlags(0xFFFDFF & this.getFlags());
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackRunBox.ajc$tjp_18, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackRunBox");
        sb.append("{sampleCount=").append(this.entries.size());
        sb.append(", dataOffset=").append(this.dataOffset);
        sb.append(", dataOffsetPresent=").append(this.isDataOffsetPresent());
        sb.append(", sampleSizePresent=").append(this.isSampleSizePresent());
        sb.append(", sampleDurationPresent=").append(this.isSampleDurationPresent());
        sb.append(", sampleFlagsPresentPresent=").append(this.isSampleFlagsPresent());
        sb.append(", sampleCompositionTimeOffsetPresent=").append(this.isSampleCompositionTimeOffsetPresent());
        sb.append(", firstSampleFlags=").append(this.firstSampleFlags);
        sb.append('}');
        return sb.toString();
    }
    
    public static class Entry
    {
        private int sampleCompositionTimeOffset;
        private long sampleDuration;
        private SampleFlags sampleFlags;
        private long sampleSize;
        
        public Entry() {
        }
        
        public Entry(final long sampleDuration, final long sampleSize, final SampleFlags sampleFlags, final int sampleCompositionTimeOffset) {
            this.sampleDuration = sampleDuration;
            this.sampleSize = sampleSize;
            this.sampleFlags = sampleFlags;
            this.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }
        
        static /* synthetic */ void access$4(final Entry entry, final long sampleDuration) {
            entry.sampleDuration = sampleDuration;
        }
        
        static /* synthetic */ void access$5(final Entry entry, final long sampleSize) {
            entry.sampleSize = sampleSize;
        }
        
        static /* synthetic */ void access$6(final Entry entry, final SampleFlags sampleFlags) {
            entry.sampleFlags = sampleFlags;
        }
        
        static /* synthetic */ void access$7(final Entry entry, final int sampleCompositionTimeOffset) {
            entry.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }
        
        public int getSampleCompositionTimeOffset() {
            return this.sampleCompositionTimeOffset;
        }
        
        public long getSampleDuration() {
            return this.sampleDuration;
        }
        
        public SampleFlags getSampleFlags() {
            return this.sampleFlags;
        }
        
        public long getSampleSize() {
            return this.sampleSize;
        }
        
        public void setSampleCompositionTimeOffset(final int sampleCompositionTimeOffset) {
            this.sampleCompositionTimeOffset = sampleCompositionTimeOffset;
        }
        
        public void setSampleDuration(final long sampleDuration) {
            this.sampleDuration = sampleDuration;
        }
        
        public void setSampleFlags(final SampleFlags sampleFlags) {
            this.sampleFlags = sampleFlags;
        }
        
        public void setSampleSize(final long sampleSize) {
            this.sampleSize = sampleSize;
        }
        
        @Override
        public String toString() {
            return "Entry{sampleDuration=" + this.sampleDuration + ", sampleSize=" + this.sampleSize + ", sampleFlags=" + this.sampleFlags + ", sampleCompositionTimeOffset=" + this.sampleCompositionTimeOffset + '}';
        }
    }
}
