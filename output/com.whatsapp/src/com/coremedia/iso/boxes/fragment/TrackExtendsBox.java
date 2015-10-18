// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackExtendsBox extends AbstractFullBox
{
    public static final String TYPE = "trex";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private long defaultSampleDescriptionIndex;
    private long defaultSampleDuration;
    private SampleFlags defaultSampleFlags;
    private long defaultSampleSize;
    private long trackId;
    
    static {
        ajc$preClinit();
    }
    
    public TrackExtendsBox() {
        super("trex");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackExtendsBox.java", TrackExtendsBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 72);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 76);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 80);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "long"), 84);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "trackId", "", "void"), 96);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"), 100);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"), 104);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "long", "defaultSampleSize", "", "void"), 108);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.trackId = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleDescriptionIndex = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleDuration = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleSize = IsoTypeReader.readUInt32(byteBuffer);
        this.defaultSampleFlags = new SampleFlags(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.trackId);
        IsoTypeWriter.writeUInt32(byteBuffer, this.defaultSampleDescriptionIndex);
        IsoTypeWriter.writeUInt32(byteBuffer, this.defaultSampleDuration);
        IsoTypeWriter.writeUInt32(byteBuffer, this.defaultSampleSize);
        this.defaultSampleFlags.getContent(byteBuffer);
    }
    
    @Override
    protected long getContentSize() {
        return 24L;
    }
    
    public long getDefaultSampleDescriptionIndex() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_1, this, this));
        return this.defaultSampleDescriptionIndex;
    }
    
    public long getDefaultSampleDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_2, this, this));
        return this.defaultSampleDuration;
    }
    
    public SampleFlags getDefaultSampleFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_4, this, this));
        return this.defaultSampleFlags;
    }
    
    public String getDefaultSampleFlagsStr() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_5, this, this));
        return this.defaultSampleFlags.toString();
    }
    
    public long getDefaultSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_3, this, this));
        return this.defaultSampleSize;
    }
    
    public long getTrackId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_0, this, this));
        return this.trackId;
    }
    
    public void setDefaultSampleDescriptionIndex(final long defaultSampleDescriptionIndex) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_7, this, this, Conversions.longObject(defaultSampleDescriptionIndex)));
        this.defaultSampleDescriptionIndex = defaultSampleDescriptionIndex;
    }
    
    public void setDefaultSampleDuration(final long defaultSampleDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_8, this, this, Conversions.longObject(defaultSampleDuration)));
        this.defaultSampleDuration = defaultSampleDuration;
    }
    
    public void setDefaultSampleFlags(final SampleFlags defaultSampleFlags) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_10, this, this, defaultSampleFlags));
        this.defaultSampleFlags = defaultSampleFlags;
    }
    
    public void setDefaultSampleSize(final long defaultSampleSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_9, this, this, Conversions.longObject(defaultSampleSize)));
        this.defaultSampleSize = defaultSampleSize;
    }
    
    public void setTrackId(final long trackId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackExtendsBox.ajc$tjp_6, this, this, Conversions.longObject(trackId)));
        this.trackId = trackId;
    }
}
