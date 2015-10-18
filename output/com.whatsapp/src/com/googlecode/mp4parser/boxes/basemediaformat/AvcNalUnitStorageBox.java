// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.basemediaformat;

import java.util.List;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class AvcNalUnitStorageBox extends AbstractBox
{
    public static final String TYPE = "avcn";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    AvcConfigurationBox.AVCDecoderConfigurationRecord avcDecoderConfigurationRecord;
    
    static {
        ajc$preClinit();
    }
    
    public AvcNalUnitStorageBox() {
        super("avcn");
    }
    
    public AvcNalUnitStorageBox(final AvcConfigurationBox avcConfigurationBox) {
        super("avcn");
        this.avcDecoderConfigurationRecord = avcConfigurationBox.getavcDecoderConfigurationRecord();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AvcNalUnitStorageBox.java", AvcNalUnitStorageBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.coremedia.iso.boxes.h264.AvcConfigurationBox$AVCDecoderConfigurationRecord"), 43);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "int"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 60);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 88);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new AvcConfigurationBox.AVCDecoderConfigurationRecord(byteBuffer);
    }
    
    public AvcConfigurationBox.AVCDecoderConfigurationRecord getAvcDecoderConfigurationRecord() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord.getContent(byteBuffer);
    }
    
    @Override
    protected long getContentSize() {
        return this.avcDecoderConfigurationRecord.getContentSize();
    }
    
    public int getLengthSizeMinusOne() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.lengthSizeMinusOne;
    }
    
    public String[] getPPS() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.getPPS();
    }
    
    public List<String> getPictureParameterSetsAsStrings() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_6, this, this));
        return this.avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings();
    }
    
    public String[] getSPS() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.getSPS();
    }
    
    public List<String> getSequenceParameterSetExtsAsStrings() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_5, this, this));
        return this.avcDecoderConfigurationRecord.getSequenceParameterSetExtsAsStrings();
    }
    
    public List<String> getSequenceParameterSetsAsStrings() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings();
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AvcNalUnitStorageBox.ajc$tjp_7, this, this));
        return "AvcNalUnitStorageBox{SPS=" + this.avcDecoderConfigurationRecord.getSequenceParameterSetsAsStrings() + ",PPS=" + this.avcDecoderConfigurationRecord.getPictureParameterSetsAsStrings() + ",lengthSize=" + (1 + this.avcDecoderConfigurationRecord.lengthSizeMinusOne) + '}';
    }
}
