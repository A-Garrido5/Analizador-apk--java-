// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox
{
    public static final String TYPE = "saiz";
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
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private int defaultSampleInfoSize;
    private int sampleCount;
    private List<Short> sampleInfoSizes;
    
    static {
        ajc$preClinit();
    }
    
    public SampleAuxiliaryInformationSizesBox() {
        super("saiz");
        this.sampleInfoSizes = new LinkedList<Short>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 98);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 102);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 140);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 106);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 110);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDefaultSampleInfoSize", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 114);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDefaultSampleInfoSize", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 118);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleInfoSizes", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "java.util.List"), 123);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleInfoSizes", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "java.util.List", "sampleInfoSizes", "", "void"), 127);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 131);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleCount", "com.coremedia.iso.boxes.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 135);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            this.auxInfoType = IsoTypeReader.read4cc(byteBuffer);
            this.auxInfoTypeParameter = IsoTypeReader.read4cc(byteBuffer);
        }
        this.defaultSampleInfoSize = (short)IsoTypeReader.readUInt8(byteBuffer);
        this.sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.sampleInfoSizes.clear();
        if (this.defaultSampleInfoSize == 0) {
            for (int i = 0; i < this.sampleCount; ++i) {
                this.sampleInfoSizes.add((short)IsoTypeReader.readUInt8(byteBuffer));
            }
        }
    }
    
    public String getAuxInfoType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_0, this, this));
        return this.auxInfoType;
    }
    
    public String getAuxInfoTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            byteBuffer.put(IsoFile.fourCCtoBytes(this.auxInfoType));
            byteBuffer.put(IsoFile.fourCCtoBytes(this.auxInfoTypeParameter));
        }
        IsoTypeWriter.writeUInt8(byteBuffer, this.defaultSampleInfoSize);
        if (this.defaultSampleInfoSize == 0) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.sampleInfoSizes.size());
            final Iterator<Short> iterator = this.sampleInfoSizes.iterator();
            while (iterator.hasNext()) {
                IsoTypeWriter.writeUInt8(byteBuffer, iterator.next());
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleCount);
    }
    
    @Override
    protected long getContentSize() {
        int n = 4;
        if ((0x1 & this.getFlags()) == 0x1) {
            n += 8;
        }
        final int n2 = n + 5;
        int size;
        if (this.defaultSampleInfoSize == 0) {
            size = this.sampleInfoSizes.size();
        }
        else {
            size = 0;
        }
        return n2 + size;
    }
    
    public int getDefaultSampleInfoSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_4, this, this));
        return this.defaultSampleInfoSize;
    }
    
    public int getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_8, this, this));
        return this.sampleCount;
    }
    
    public List<Short> getSampleInfoSizes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_6, this, this));
        return this.sampleInfoSizes;
    }
    
    public void setAuxInfoType(final String auxInfoType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_1, this, this, auxInfoType));
        this.auxInfoType = auxInfoType;
    }
    
    public void setAuxInfoTypeParameter(final String auxInfoTypeParameter) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_3, this, this, auxInfoTypeParameter));
        this.auxInfoTypeParameter = auxInfoTypeParameter;
    }
    
    public void setDefaultSampleInfoSize(final int defaultSampleInfoSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_5, this, this, Conversions.intObject(defaultSampleInfoSize)));
        assert defaultSampleInfoSize <= 255;
        this.defaultSampleInfoSize = defaultSampleInfoSize;
    }
    
    public void setSampleCount(final int sampleCount) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_9, this, this, Conversions.intObject(sampleCount)));
        this.sampleCount = sampleCount;
    }
    
    public void setSampleInfoSizes(final List<Short> sampleInfoSizes) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_7, this, this, sampleInfoSizes));
        this.sampleInfoSizes = sampleInfoSizes;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationSizesBox.ajc$tjp_10, this, this));
        return "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=" + this.defaultSampleInfoSize + ", sampleCount=" + this.sampleCount + ", auxInfoType='" + this.auxInfoType + '\'' + ", auxInfoTypeParameter='" + this.auxInfoTypeParameter + '\'' + '}';
    }
}
