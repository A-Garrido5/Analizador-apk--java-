// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackFragmentHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "tfhd";
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
    private long baseDataOffset;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;
    
    static {
        ajc$preClinit();
    }
    
    public TrackFragmentHeaderBox() {
        super("tfhd");
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 120);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 124);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 160);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 164);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "trackId", "", "void"), 168);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"), 172);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"), 181);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"), 190);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"), 195);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 200);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "boolean", "durationIsEmpty", "", "void"), 205);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 211);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 128);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 132);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "boolean"), 136);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 140);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 144);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 148);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 152);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "long"), 156);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            this.baseDataOffset = IsoTypeReader.readUInt64(byteBuffer);
        }
        if ((0x2 & this.getFlags()) == 0x2) {
            this.sampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((0x8 & this.getFlags()) == 0x8) {
            this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((0x10 & this.getFlags()) == 0x10) {
            this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer);
        }
        if ((0x20 & this.getFlags()) == 0x20) {
            this.defaultSampleFlags = new SampleFlags(byteBuffer);
        }
        if ((0x10000 & this.getFlags()) == 0x10000) {
            this.durationIsEmpty = true;
        }
    }
    
    public long getBaseDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_6, this, this));
        return this.baseDataOffset;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        if ((0x1 & this.getFlags()) == 0x1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.getBaseDataOffset());
        }
        if ((0x2 & this.getFlags()) == 0x2) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.getSampleDescriptionIndex());
        }
        if ((0x8 & this.getFlags()) == 0x8) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.getDefaultSampleDuration());
        }
        if ((0x10 & this.getFlags()) == 0x10) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.getDefaultSampleSize());
        }
        if ((0x20 & this.getFlags()) == 0x20) {
            this.defaultSampleFlags.getContent(byteBuffer);
        }
    }
    
    @Override
    protected long getContentSize() {
        long n = 8L;
        final int flags = this.getFlags();
        if ((flags & 0x1) == 0x1) {
            n += 8L;
        }
        if ((flags & 0x2) == 0x2) {
            n += 4L;
        }
        if ((flags & 0x8) == 0x8) {
            n += 4L;
        }
        if ((flags & 0x10) == 0x10) {
            n += 4L;
        }
        if ((flags & 0x20) == 0x20) {
            n += 4L;
        }
        return n;
    }
    
    public long getDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_8, this, this));
        return this.defaultSampleDuration;
    }
    
    public SampleFlags getDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_10, this, this));
        return this.defaultSampleFlags;
    }
    
    public long getDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_9, this, this));
        return this.defaultSampleSize;
    }
    
    public long getSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_7, this, this));
        return this.sampleDescriptionIndex;
    }
    
    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_5, this, this));
        return this.trackId;
    }
    
    public boolean hasBaseDataOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_0, this, this));
        return (0x1 & this.getFlags()) != 0x0;
    }
    
    public boolean hasDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_2, this, this));
        return (0x8 & this.getFlags()) != 0x0;
    }
    
    public boolean hasDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_4, this, this));
        return (0x20 & this.getFlags()) != 0x0;
    }
    
    public boolean hasDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_3, this, this));
        return (0x10 & this.getFlags()) != 0x0;
    }
    
    public boolean hasSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_1, this, this));
        return (0x2 & this.getFlags()) != 0x0;
    }
    
    public boolean isDurationIsEmpty() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_11, this, this));
        return this.durationIsEmpty;
    }
    
    public void setBaseDataOffset(final long baseDataOffset) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_13, this, this, Conversions.longObject(baseDataOffset)));
        if (baseDataOffset == -1L) {
            this.setFlags(0x7FFFFFFE & this.getFlags());
        }
        else {
            this.setFlags(0x1 | this.getFlags());
        }
        this.baseDataOffset = baseDataOffset;
    }
    
    public void setDefaultSampleDuration(final long defaultSampleDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_15, this, this, Conversions.longObject(defaultSampleDuration)));
        this.setFlags(0x8 | this.getFlags());
        this.defaultSampleDuration = defaultSampleDuration;
    }
    
    public void setDefaultSampleFlags(final SampleFlags defaultSampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_17, this, this, defaultSampleFlags));
        this.setFlags(0x20 | this.getFlags());
        this.defaultSampleFlags = defaultSampleFlags;
    }
    
    public void setDefaultSampleSize(final long defaultSampleSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_16, this, this, Conversions.longObject(defaultSampleSize)));
        this.setFlags(0x10 | this.getFlags());
        this.defaultSampleSize = defaultSampleSize;
    }
    
    public void setDurationIsEmpty(final boolean durationIsEmpty) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_18, this, this, Conversions.booleanObject(durationIsEmpty)));
        this.setFlags(0x10000 | this.getFlags());
        this.durationIsEmpty = durationIsEmpty;
    }
    
    public void setSampleDescriptionIndex(final long sampleDescriptionIndex) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_14, this, this, Conversions.longObject(sampleDescriptionIndex)));
        if (sampleDescriptionIndex == -1L) {
            this.setFlags(0x7FFFFFFD & this.getFlags());
        }
        else {
            this.setFlags(0x2 | this.getFlags());
        }
        this.sampleDescriptionIndex = sampleDescriptionIndex;
    }
    
    public void setTrackId(final long trackId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_12, this, this, Conversions.longObject(trackId)));
        this.trackId = trackId;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentHeaderBox.ajc$tjp_19, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("TrackFragmentHeaderBox");
        sb.append("{trackId=").append(this.trackId);
        sb.append(", baseDataOffset=").append(this.baseDataOffset);
        sb.append(", sampleDescriptionIndex=").append(this.sampleDescriptionIndex);
        sb.append(", defaultSampleDuration=").append(this.defaultSampleDuration);
        sb.append(", defaultSampleSize=").append(this.defaultSampleSize);
        sb.append(", defaultSampleFlags=").append(this.defaultSampleFlags);
        sb.append(", durationIsEmpty=").append(this.durationIsEmpty);
        sb.append('}');
        return sb.toString();
    }
}
