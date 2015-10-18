// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class DTSSpecificBox extends AbstractBox
{
    public static final String TYPE = "ddts";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_22;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_23;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_24;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_25;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_26;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_27;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_28;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_29;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_30;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_31;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;
    
    static {
        ajc$preClinit();
    }
    
    public DTSSpecificBox() {
        super("ddts");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 88);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "avgBitRate", "", "void"), 92);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 128);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), 132);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 136);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 140);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 144);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 148);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 152);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 156);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 160);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 164);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 96);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 168);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), 172);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 176);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 180);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 184);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 188);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 192);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 196);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 200);
        ajc$tjp_29 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), 204);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"), 100);
        ajc$tjp_30 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 208);
        ajc$tjp_31 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), 212);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "long"), 104);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "long", "maxBitRate", "", "void"), 108);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 112);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 116);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 120);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), 124);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = IsoTypeReader.readUInt32(byteBuffer);
        this.maxBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitRate = IsoTypeReader.readUInt32(byteBuffer);
        this.pcmSampleDepth = IsoTypeReader.readUInt8(byteBuffer);
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.frameDuration = bitReaderBuffer.readBits(2);
        this.streamConstruction = bitReaderBuffer.readBits(5);
        this.coreLFEPresent = bitReaderBuffer.readBits(1);
        this.coreLayout = bitReaderBuffer.readBits(6);
        this.coreSize = bitReaderBuffer.readBits(14);
        this.stereoDownmix = bitReaderBuffer.readBits(1);
        this.representationType = bitReaderBuffer.readBits(3);
        this.channelLayout = bitReaderBuffer.readBits(16);
        this.multiAssetFlag = bitReaderBuffer.readBits(1);
        this.LBRDurationMod = bitReaderBuffer.readBits(1);
        this.reservedBoxPresent = bitReaderBuffer.readBits(1);
        this.reserved = bitReaderBuffer.readBits(5);
    }
    
    public long getAvgBitRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_0, this, this));
        return this.avgBitRate;
    }
    
    public int getChannelLayout() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_22, this, this));
        return this.channelLayout;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, this.DTSSamplingFrequency);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitRate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitRate);
        IsoTypeWriter.writeUInt8(byteBuffer, this.pcmSampleDepth);
        final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.frameDuration, 2);
        bitWriterBuffer.writeBits(this.streamConstruction, 5);
        bitWriterBuffer.writeBits(this.coreLFEPresent, 1);
        bitWriterBuffer.writeBits(this.coreLayout, 6);
        bitWriterBuffer.writeBits(this.coreSize, 14);
        bitWriterBuffer.writeBits(this.stereoDownmix, 1);
        bitWriterBuffer.writeBits(this.representationType, 3);
        bitWriterBuffer.writeBits(this.channelLayout, 16);
        bitWriterBuffer.writeBits(this.multiAssetFlag, 1);
        bitWriterBuffer.writeBits(this.LBRDurationMod, 1);
        bitWriterBuffer.writeBits(this.reservedBoxPresent, 1);
        bitWriterBuffer.writeBits(this.reserved, 5);
    }
    
    @Override
    protected long getContentSize() {
        return 20L;
    }
    
    public int getCoreLFEPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_12, this, this));
        return this.coreLFEPresent;
    }
    
    public int getCoreLayout() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_14, this, this));
        return this.coreLayout;
    }
    
    public int getCoreSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_16, this, this));
        return this.coreSize;
    }
    
    public long getDTSSamplingFrequency() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_2, this, this));
        return this.DTSSamplingFrequency;
    }
    
    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_8, this, this));
        return this.frameDuration;
    }
    
    public int getLBRDurationMod() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_26, this, this));
        return this.LBRDurationMod;
    }
    
    public long getMaxBitRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_4, this, this));
        return this.maxBitRate;
    }
    
    public int getMultiAssetFlag() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_24, this, this));
        return this.multiAssetFlag;
    }
    
    public int getPcmSampleDepth() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_6, this, this));
        return this.pcmSampleDepth;
    }
    
    public int getRepresentationType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_20, this, this));
        return this.representationType;
    }
    
    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_28, this, this));
        return this.reserved;
    }
    
    public int getReservedBoxPresent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_30, this, this));
        return this.reservedBoxPresent;
    }
    
    public int getStereoDownmix() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_18, this, this));
        return this.stereoDownmix;
    }
    
    public int getStreamConstruction() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_10, this, this));
        return this.streamConstruction;
    }
    
    public void setAvgBitRate(final long avgBitRate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_1, this, this, Conversions.longObject(avgBitRate)));
        this.avgBitRate = avgBitRate;
    }
    
    public void setChannelLayout(final int channelLayout) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_23, this, this, Conversions.intObject(channelLayout)));
        this.channelLayout = channelLayout;
    }
    
    public void setCoreLFEPresent(final int coreLFEPresent) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_13, this, this, Conversions.intObject(coreLFEPresent)));
        this.coreLFEPresent = coreLFEPresent;
    }
    
    public void setCoreLayout(final int coreLayout) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_15, this, this, Conversions.intObject(coreLayout)));
        this.coreLayout = coreLayout;
    }
    
    public void setCoreSize(final int coreSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_17, this, this, Conversions.intObject(coreSize)));
        this.coreSize = coreSize;
    }
    
    public void setDTSSamplingFrequency(final long dtsSamplingFrequency) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_3, this, this, Conversions.longObject(dtsSamplingFrequency)));
        this.DTSSamplingFrequency = dtsSamplingFrequency;
    }
    
    public void setFrameDuration(final int frameDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_9, this, this, Conversions.intObject(frameDuration)));
        this.frameDuration = frameDuration;
    }
    
    public void setLBRDurationMod(final int lbrDurationMod) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_27, this, this, Conversions.intObject(lbrDurationMod)));
        this.LBRDurationMod = lbrDurationMod;
    }
    
    public void setMaxBitRate(final long maxBitRate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_5, this, this, Conversions.longObject(maxBitRate)));
        this.maxBitRate = maxBitRate;
    }
    
    public void setMultiAssetFlag(final int multiAssetFlag) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_25, this, this, Conversions.intObject(multiAssetFlag)));
        this.multiAssetFlag = multiAssetFlag;
    }
    
    public void setPcmSampleDepth(final int pcmSampleDepth) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_7, this, this, Conversions.intObject(pcmSampleDepth)));
        this.pcmSampleDepth = pcmSampleDepth;
    }
    
    public void setRepresentationType(final int representationType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_21, this, this, Conversions.intObject(representationType)));
        this.representationType = representationType;
    }
    
    public void setReserved(final int reserved) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_29, this, this, Conversions.intObject(reserved)));
        this.reserved = reserved;
    }
    
    public void setReservedBoxPresent(final int reservedBoxPresent) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_31, this, this, Conversions.intObject(reservedBoxPresent)));
        this.reservedBoxPresent = reservedBoxPresent;
    }
    
    public void setStereoDownmix(final int stereoDownmix) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_19, this, this, Conversions.intObject(stereoDownmix)));
        this.stereoDownmix = stereoDownmix;
    }
    
    public void setStreamConstruction(final int streamConstruction) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(DTSSpecificBox.ajc$tjp_11, this, this, Conversions.intObject(streamConstruction)));
        this.streamConstruction = streamConstruction;
    }
}
