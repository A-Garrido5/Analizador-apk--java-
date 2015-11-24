// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoFile;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class AmrSpecificBox extends AbstractBox
{
    public static final String TYPE = "damr";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;
    
    static {
        ajc$preClinit();
    }
    
    public AmrSpecificBox() {
        super("damr");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AmrSpecificBox.java", AmrSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        this.vendor = IsoFile.bytesToFourCC(array);
        this.decoderVersion = IsoTypeReader.readUInt8(byteBuffer);
        this.modeSet = IsoTypeReader.readUInt16(byteBuffer);
        this.modeChangePeriod = IsoTypeReader.readUInt8(byteBuffer);
        this.framesPerSample = IsoTypeReader.readUInt8(byteBuffer);
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_5, this, this, byteBuffer));
        byteBuffer.put(IsoFile.fourCCtoBytes(this.vendor));
        IsoTypeWriter.writeUInt8(byteBuffer, this.decoderVersion);
        IsoTypeWriter.writeUInt16(byteBuffer, this.modeSet);
        IsoTypeWriter.writeUInt8(byteBuffer, this.modeChangePeriod);
        IsoTypeWriter.writeUInt8(byteBuffer, this.framesPerSample);
    }
    
    @Override
    protected long getContentSize() {
        return 9L;
    }
    
    public int getDecoderVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_1, this, this));
        return this.decoderVersion;
    }
    
    public int getFramesPerSample() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_4, this, this));
        return this.framesPerSample;
    }
    
    public int getModeChangePeriod() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_3, this, this));
        return this.modeChangePeriod;
    }
    
    public int getModeSet() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_2, this, this));
        return this.modeSet;
    }
    
    public String getVendor() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_0, this, this));
        return this.vendor;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AmrSpecificBox.ajc$tjp_6, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("AmrSpecificBox[vendor=").append(this.getVendor());
        sb.append(";decoderVersion=").append(this.getDecoderVersion());
        sb.append(";modeSet=").append(this.getModeSet());
        sb.append(";modeChangePeriod=").append(this.getModeChangePeriod());
        sb.append(";framesPerSample=").append(this.getFramesPerSample());
        sb.append("]");
        return sb.toString();
    }
}
