// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.h264;

import com.googlecode.mp4parser.h264.model.SeqParameterSet;
import com.coremedia.iso.Hex;
import java.io.IOException;
import java.io.InputStream;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.coremedia.iso.IsoTypeReader;
import java.util.ArrayList;
import org.aspectj.runtime.internal.Conversions;
import java.util.Collections;
import java.util.List;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public final class AvcConfigurationBox extends AbstractBox
{
    public static final String TYPE = "avcC";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    public AVCDecoderConfigurationRecord avcDecoderConfigurationRecord;
    
    static {
        ajc$preClinit();
    }
    
    public AvcConfigurationBox() {
        super("avcC");
        this.avcDecoderConfigurationRecord = new AVCDecoderConfigurationRecord();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getConfigurationVersion", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvcProfileIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 58);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvcLevelIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 94);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLengthSizeMinusOne", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 98);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSequenceParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 102);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPictureParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 106);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getChromaFormat", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 110);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setChromaFormat", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 114);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitDepthLumaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 118);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitDepthLumaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 122);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitDepthChromaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 126);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitDepthChromaMinus8", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 130);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getProfileCompatibility", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 62);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSetExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 134);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSequenceParameterSetExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 138);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hasExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "boolean"), 142);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHasExts", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 146);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContentSize", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "long"), 157);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 163);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSPS", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 168);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPPS", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 172);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getavcDecoderConfigurationRecord", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "com.coremedia.iso.boxes.h264.AvcConfigurationBox$AVCDecoderConfigurationRecord"), 177);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvcLevelIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 66);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "int"), 70);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 74);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPictureParameterSets", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "", "", "", "java.util.List"), 78);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setConfigurationVersion", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 82);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvcProfileIndication", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 86);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setProfileCompatibility", "com.coremedia.iso.boxes.h264.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 90);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new AVCDecoderConfigurationRecord(byteBuffer);
    }
    
    public int getAvcLevelIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.avcLevelIndication;
    }
    
    public int getAvcProfileIndication() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.avcProfileIndication;
    }
    
    public int getBitDepthChromaMinus8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.bitDepthChromaMinus8;
    }
    
    public int getBitDepthLumaMinus8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.bitDepthLumaMinus8;
    }
    
    public int getChromaFormat() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.chromaFormat;
    }
    
    public int getConfigurationVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.configurationVersion;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_25, this, this, byteBuffer));
        this.avcDecoderConfigurationRecord.getContent(byteBuffer);
    }
    
    public long getContentSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.getContentSize();
    }
    
    public int getLengthSizeMinusOne() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }
    
    public String[] getPPS() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_27, this, this));
        return this.avcDecoderConfigurationRecord.getPPS();
    }
    
    public List<byte[]> getPictureParameterSets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_6, this, this));
        return Collections.unmodifiableList((List<? extends byte[]>)this.avcDecoderConfigurationRecord.pictureParameterSets);
    }
    
    public int getProfileCompatibility() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.profileCompatibility;
    }
    
    public String[] getSPS() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord.getSPS();
    }
    
    public List<byte[]> getSequenceParameterSetExts() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.sequenceParameterSetExts;
    }
    
    public List<byte[]> getSequenceParameterSets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_5, this, this));
        return Collections.unmodifiableList((List<? extends byte[]>)this.avcDecoderConfigurationRecord.sequenceParameterSets);
    }
    
    public AVCDecoderConfigurationRecord getavcDecoderConfigurationRecord() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_28, this, this));
        return this.avcDecoderConfigurationRecord;
    }
    
    public boolean hasExts() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.hasExts;
    }
    
    public void setAvcLevelIndication(final int avcLevelIndication) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_10, this, this, Conversions.intObject(avcLevelIndication)));
        this.avcDecoderConfigurationRecord.avcLevelIndication = avcLevelIndication;
    }
    
    public void setAvcProfileIndication(final int avcProfileIndication) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_8, this, this, Conversions.intObject(avcProfileIndication)));
        this.avcDecoderConfigurationRecord.avcProfileIndication = avcProfileIndication;
    }
    
    public void setBitDepthChromaMinus8(final int bitDepthChromaMinus8) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_19, this, this, Conversions.intObject(bitDepthChromaMinus8)));
        this.avcDecoderConfigurationRecord.bitDepthChromaMinus8 = bitDepthChromaMinus8;
    }
    
    public void setBitDepthLumaMinus8(final int bitDepthLumaMinus8) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_17, this, this, Conversions.intObject(bitDepthLumaMinus8)));
        this.avcDecoderConfigurationRecord.bitDepthLumaMinus8 = bitDepthLumaMinus8;
    }
    
    public void setChromaFormat(final int chromaFormat) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_15, this, this, Conversions.intObject(chromaFormat)));
        this.avcDecoderConfigurationRecord.chromaFormat = chromaFormat;
    }
    
    public void setConfigurationVersion(final int configurationVersion) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_7, this, this, Conversions.intObject(configurationVersion)));
        this.avcDecoderConfigurationRecord.configurationVersion = configurationVersion;
    }
    
    public void setHasExts(final boolean hasExts) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_23, this, this, Conversions.booleanObject(hasExts)));
        this.avcDecoderConfigurationRecord.hasExts = hasExts;
    }
    
    public void setLengthSizeMinusOne(final int lengthSizeMinusOne) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_11, this, this, Conversions.intObject(lengthSizeMinusOne)));
        this.avcDecoderConfigurationRecord.lengthSizeMinusOne = lengthSizeMinusOne;
    }
    
    public void setPictureParameterSets(final List<byte[]> pictureParameterSets) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_13, this, this, pictureParameterSets));
        this.avcDecoderConfigurationRecord.pictureParameterSets = pictureParameterSets;
    }
    
    public void setProfileCompatibility(final int profileCompatibility) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_9, this, this, Conversions.intObject(profileCompatibility)));
        this.avcDecoderConfigurationRecord.profileCompatibility = profileCompatibility;
    }
    
    public void setSequenceParameterSetExts(final List<byte[]> sequenceParameterSetExts) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_21, this, this, sequenceParameterSetExts));
        this.avcDecoderConfigurationRecord.sequenceParameterSetExts = sequenceParameterSetExts;
    }
    
    public void setSequenceParameterSets(final List<byte[]> sequenceParameterSets) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcConfigurationBox.ajc$tjp_12, this, this, sequenceParameterSets));
        this.avcDecoderConfigurationRecord.sequenceParameterSets = sequenceParameterSets;
    }
    
    public static class AVCDecoderConfigurationRecord
    {
        public int avcLevelIndication;
        public int avcProfileIndication;
        public int bitDepthChromaMinus8;
        public int bitDepthChromaMinus8PaddingBits;
        public int bitDepthLumaMinus8;
        public int bitDepthLumaMinus8PaddingBits;
        public int chromaFormat;
        public int chromaFormatPaddingBits;
        public int configurationVersion;
        public boolean hasExts;
        public int lengthSizeMinusOne;
        public int lengthSizeMinusOnePaddingBits;
        public int numberOfSequenceParameterSetsPaddingBits;
        public List<byte[]> pictureParameterSets;
        public int profileCompatibility;
        public List<byte[]> sequenceParameterSetExts;
        public List<byte[]> sequenceParameterSets;
        
        public AVCDecoderConfigurationRecord() {
            this.sequenceParameterSets = new ArrayList<byte[]>();
            this.pictureParameterSets = new ArrayList<byte[]>();
            this.hasExts = true;
            this.chromaFormat = 1;
            this.bitDepthLumaMinus8 = 0;
            this.bitDepthChromaMinus8 = 0;
            this.sequenceParameterSetExts = new ArrayList<byte[]>();
            this.lengthSizeMinusOnePaddingBits = 63;
            this.numberOfSequenceParameterSetsPaddingBits = 7;
            this.chromaFormatPaddingBits = 31;
            this.bitDepthLumaMinus8PaddingBits = 31;
            this.bitDepthChromaMinus8PaddingBits = 31;
        }
        
        public AVCDecoderConfigurationRecord(final ByteBuffer byteBuffer) {
            this.sequenceParameterSets = new ArrayList<byte[]>();
            this.pictureParameterSets = new ArrayList<byte[]>();
            this.hasExts = true;
            this.chromaFormat = 1;
            this.bitDepthLumaMinus8 = 0;
            this.bitDepthChromaMinus8 = 0;
            this.sequenceParameterSetExts = new ArrayList<byte[]>();
            this.lengthSizeMinusOnePaddingBits = 63;
            this.numberOfSequenceParameterSetsPaddingBits = 7;
            this.chromaFormatPaddingBits = 31;
            this.bitDepthLumaMinus8PaddingBits = 31;
            this.bitDepthChromaMinus8PaddingBits = 31;
            this.configurationVersion = IsoTypeReader.readUInt8(byteBuffer);
            this.avcProfileIndication = IsoTypeReader.readUInt8(byteBuffer);
            this.profileCompatibility = IsoTypeReader.readUInt8(byteBuffer);
            this.avcLevelIndication = IsoTypeReader.readUInt8(byteBuffer);
            final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
            this.lengthSizeMinusOnePaddingBits = bitReaderBuffer.readBits(6);
            this.lengthSizeMinusOne = bitReaderBuffer.readBits(2);
            this.numberOfSequenceParameterSetsPaddingBits = bitReaderBuffer.readBits(3);
            for (int bits = bitReaderBuffer.readBits(5), i = 0; i < bits; ++i) {
                final byte[] array = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                byteBuffer.get(array);
                this.sequenceParameterSets.add(array);
            }
            final long n = IsoTypeReader.readUInt8(byteBuffer);
            for (int n2 = 0; n2 < n; ++n2) {
                final byte[] array2 = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                byteBuffer.get(array2);
                this.pictureParameterSets.add(array2);
            }
            if (byteBuffer.remaining() < 4) {
                this.hasExts = false;
            }
            if (this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 122 || this.avcProfileIndication == 144)) {
                final BitReaderBuffer bitReaderBuffer2 = new BitReaderBuffer(byteBuffer);
                this.chromaFormatPaddingBits = bitReaderBuffer2.readBits(6);
                this.chromaFormat = bitReaderBuffer2.readBits(2);
                this.bitDepthLumaMinus8PaddingBits = bitReaderBuffer2.readBits(5);
                this.bitDepthLumaMinus8 = bitReaderBuffer2.readBits(3);
                this.bitDepthChromaMinus8PaddingBits = bitReaderBuffer2.readBits(5);
                this.bitDepthChromaMinus8 = bitReaderBuffer2.readBits(3);
                final long n3 = IsoTypeReader.readUInt8(byteBuffer);
                for (int n4 = 0; n4 < n3; ++n4) {
                    final byte[] array3 = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                    byteBuffer.get(array3);
                    this.sequenceParameterSetExts.add(array3);
                }
                return;
            }
            this.chromaFormat = -1;
            this.bitDepthLumaMinus8 = -1;
            this.bitDepthChromaMinus8 = -1;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            IsoTypeWriter.writeUInt8(byteBuffer, this.configurationVersion);
            IsoTypeWriter.writeUInt8(byteBuffer, this.avcProfileIndication);
            IsoTypeWriter.writeUInt8(byteBuffer, this.profileCompatibility);
            IsoTypeWriter.writeUInt8(byteBuffer, this.avcLevelIndication);
            final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer.writeBits(this.lengthSizeMinusOnePaddingBits, 6);
            bitWriterBuffer.writeBits(this.lengthSizeMinusOne, 2);
            bitWriterBuffer.writeBits(this.numberOfSequenceParameterSetsPaddingBits, 3);
            bitWriterBuffer.writeBits(this.pictureParameterSets.size(), 5);
            for (final byte[] array : this.sequenceParameterSets) {
                IsoTypeWriter.writeUInt16(byteBuffer, array.length);
                byteBuffer.put(array);
            }
            IsoTypeWriter.writeUInt8(byteBuffer, this.pictureParameterSets.size());
            for (final byte[] array2 : this.pictureParameterSets) {
                IsoTypeWriter.writeUInt16(byteBuffer, array2.length);
                byteBuffer.put(array2);
            }
            if (this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 122 || this.avcProfileIndication == 144)) {
                final BitWriterBuffer bitWriterBuffer2 = new BitWriterBuffer(byteBuffer);
                bitWriterBuffer2.writeBits(this.chromaFormatPaddingBits, 6);
                bitWriterBuffer2.writeBits(this.chromaFormat, 2);
                bitWriterBuffer2.writeBits(this.bitDepthLumaMinus8PaddingBits, 5);
                bitWriterBuffer2.writeBits(this.bitDepthLumaMinus8, 3);
                bitWriterBuffer2.writeBits(this.bitDepthChromaMinus8PaddingBits, 5);
                bitWriterBuffer2.writeBits(this.bitDepthChromaMinus8, 3);
                for (final byte[] array3 : this.sequenceParameterSetExts) {
                    IsoTypeWriter.writeUInt16(byteBuffer, array3.length);
                    byteBuffer.put(array3);
                }
            }
        }
        
        public long getContentSize() {
            long n = 5L + 1L;
            final Iterator<byte[]> iterator = this.sequenceParameterSets.iterator();
            while (iterator.hasNext()) {
                n = n + 2L + iterator.next().length;
            }
            long n2 = n + 1L;
            final Iterator<byte[]> iterator2 = this.pictureParameterSets.iterator();
            while (iterator2.hasNext()) {
                n2 = n2 + 2L + iterator2.next().length;
            }
            if (this.hasExts && (this.avcProfileIndication == 100 || this.avcProfileIndication == 110 || this.avcProfileIndication == 122 || this.avcProfileIndication == 144)) {
                n2 += 4L;
                final Iterator<byte[]> iterator3 = this.sequenceParameterSetExts.iterator();
                while (iterator3.hasNext()) {
                    n2 = n2 + 2L + iterator3.next().length;
                }
            }
            return n2;
        }
        
        public String[] getPPS() {
            final ArrayList<String> list = new ArrayList<String>();
            for (final byte[] array : this.pictureParameterSets) {
                try {
                    list.add(PictureParameterSet.read(new ByteArrayInputStream(array, 1, -1 + array.length)).toString());
                }
                catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            return list.toArray(new String[list.size()]);
        }
        
        public List<String> getPictureParameterSetsAsStrings() {
            final ArrayList<String> list = new ArrayList<String>(this.pictureParameterSets.size());
            final Iterator<byte[]> iterator = this.pictureParameterSets.iterator();
            while (iterator.hasNext()) {
                list.add(Hex.encodeHex(iterator.next()));
            }
            return list;
        }
        
        public String[] getSPS() {
            final ArrayList<String> list = new ArrayList<String>();
            for (final byte[] array : this.sequenceParameterSets) {
                String string = "not parsable";
                while (true) {
                    try {
                        string = SeqParameterSet.read(new ByteArrayInputStream(array, 1, -1 + array.length)).toString();
                        list.add(string);
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    break;
                }
            }
            return list.toArray(new String[list.size()]);
        }
        
        public List<String> getSequenceParameterSetExtsAsStrings() {
            final ArrayList<String> list = new ArrayList<String>(this.sequenceParameterSetExts.size());
            final Iterator<byte[]> iterator = this.sequenceParameterSetExts.iterator();
            while (iterator.hasNext()) {
                list.add(Hex.encodeHex(iterator.next()));
            }
            return list;
        }
        
        public List<String> getSequenceParameterSetsAsStrings() {
            final ArrayList<String> list = new ArrayList<String>(this.sequenceParameterSets.size());
            final Iterator<byte[]> iterator = this.sequenceParameterSets.iterator();
            while (iterator.hasNext()) {
                list.add(Hex.encodeHex(iterator.next()));
            }
            return list;
        }
    }
}
