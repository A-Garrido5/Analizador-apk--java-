// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.apple;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public final class AppleLosslessSpecificBox extends AbstractFullBox
{
    public static final String TYPE = "alac";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_20;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_21;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;
    
    static {
        ajc$preClinit();
    }
    
    public AppleLosslessSpecificBox() {
        super("alac");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 34);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 98);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 106);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"), 114);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = IsoTypeReader.readUInt32(byteBuffer);
        this.unknown1 = IsoTypeReader.readUInt8(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt8(byteBuffer);
        this.historyMult = IsoTypeReader.readUInt8(byteBuffer);
        this.initialHistory = IsoTypeReader.readUInt8(byteBuffer);
        this.kModifier = IsoTypeReader.readUInt8(byteBuffer);
        this.channels = IsoTypeReader.readUInt8(byteBuffer);
        this.unknown2 = IsoTypeReader.readUInt16(byteBuffer);
        this.maxCodedFrameSize = IsoTypeReader.readUInt32(byteBuffer);
        this.bitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.sampleRate = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    public long getBitRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_18, this, this));
        return this.bitRate;
    }
    
    public int getChannels() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_12, this, this));
        return this.channels;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxSamplePerFrame);
        IsoTypeWriter.writeUInt8(byteBuffer, this.unknown1);
        IsoTypeWriter.writeUInt8(byteBuffer, this.sampleSize);
        IsoTypeWriter.writeUInt8(byteBuffer, this.historyMult);
        IsoTypeWriter.writeUInt8(byteBuffer, this.initialHistory);
        IsoTypeWriter.writeUInt8(byteBuffer, this.kModifier);
        IsoTypeWriter.writeUInt8(byteBuffer, this.channels);
        IsoTypeWriter.writeUInt16(byteBuffer, this.unknown2);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxCodedFrameSize);
        IsoTypeWriter.writeUInt32(byteBuffer, this.bitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleRate);
    }
    
    @Override
    protected long getContentSize() {
        return 28L;
    }
    
    public int getHistoryMult() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_6, this, this));
        return this.historyMult;
    }
    
    public int getInitialHistory() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_8, this, this));
        return this.initialHistory;
    }
    
    public int getKModifier() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_10, this, this));
        return this.kModifier;
    }
    
    public long getMaxCodedFrameSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_16, this, this));
        return this.maxCodedFrameSize;
    }
    
    public long getMaxSamplePerFrame() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_0, this, this));
        return this.maxSamplePerFrame;
    }
    
    public long getSampleRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_20, this, this));
        return this.sampleRate;
    }
    
    public int getSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_4, this, this));
        return this.sampleSize;
    }
    
    public int getUnknown1() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_2, this, this));
        return this.unknown1;
    }
    
    public int getUnknown2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_14, this, this));
        return this.unknown2;
    }
    
    public void setBitRate(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_19, this, this, Conversions.intObject(n)));
        this.bitRate = n;
    }
    
    public void setChannels(final int channels) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_13, this, this, Conversions.intObject(channels)));
        this.channels = channels;
    }
    
    public void setHistoryMult(final int historyMult) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_7, this, this, Conversions.intObject(historyMult)));
        this.historyMult = historyMult;
    }
    
    public void setInitialHistory(final int initialHistory) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_9, this, this, Conversions.intObject(initialHistory)));
        this.initialHistory = initialHistory;
    }
    
    public void setKModifier(final int kModifier) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_11, this, this, Conversions.intObject(kModifier)));
        this.kModifier = kModifier;
    }
    
    public void setMaxCodedFrameSize(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_17, this, this, Conversions.intObject(n)));
        this.maxCodedFrameSize = n;
    }
    
    public void setMaxSamplePerFrame(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_1, this, this, Conversions.intObject(n)));
        this.maxSamplePerFrame = n;
    }
    
    public void setSampleRate(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_21, this, this, Conversions.intObject(n)));
        this.sampleRate = n;
    }
    
    public void setSampleSize(final int sampleSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_5, this, this, Conversions.intObject(sampleSize)));
        this.sampleSize = sampleSize;
    }
    
    public void setUnknown1(final int unknown1) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_3, this, this, Conversions.intObject(unknown1)));
        this.unknown1 = unknown1;
    }
    
    public void setUnknown2(final int unknown2) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleLosslessSpecificBox.ajc$tjp_15, this, this, Conversions.intObject(unknown2)));
        this.unknown2 = unknown2;
    }
}
