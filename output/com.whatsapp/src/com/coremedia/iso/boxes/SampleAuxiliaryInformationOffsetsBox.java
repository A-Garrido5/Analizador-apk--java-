// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
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

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox
{
    public static final String TYPE = "saio";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private long auxInfoType;
    private long auxInfoTypeParameter;
    private List<Long> offsets;
    
    static {
        ajc$preClinit();
    }
    
    public SampleAuxiliaryInformationOffsetsBox() {
        super("saio");
        this.offsets = new LinkedList<Long>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleAuxiliaryInformationOffsetsBox.java", SampleAuxiliaryInformationOffsetsBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "long"), 108);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoType", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "long", "auxInfoType", "", "void"), 112);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "long"), 116);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "long", "auxInfoTypeParameter", "", "void"), 120);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOffsets", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOffsets", "com.coremedia.iso.boxes.SampleAuxiliaryInformationOffsetsBox", "java.util.List", "offsets", "", "void"), 128);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            this.auxInfoType = IsoTypeReader.readUInt32(byteBuffer);
            this.auxInfoTypeParameter = IsoTypeReader.readUInt32(byteBuffer);
        }
        final int l2i = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.offsets.clear();
        for (int i = 0; i < l2i; ++i) {
            if (this.getVersion() == 0) {
                this.offsets.add(IsoTypeReader.readUInt32(byteBuffer));
            }
            else {
                this.offsets.add(IsoTypeReader.readUInt64(byteBuffer));
            }
        }
    }
    
    public long getAuxInfoType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_0, this, this));
        return this.auxInfoType;
    }
    
    public long getAuxInfoTypeParameter() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.auxInfoType);
            IsoTypeWriter.writeUInt32(byteBuffer, this.auxInfoTypeParameter);
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.offsets.size());
        for (final Long n : this.offsets) {
            if (this.getVersion() == 0) {
                IsoTypeWriter.writeUInt32(byteBuffer, n);
            }
            else {
                IsoTypeWriter.writeUInt64(byteBuffer, n);
            }
        }
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if (this.getVersion() == 0) {
            n = 4 * this.offsets.size();
        }
        else {
            n = 8 * this.offsets.size();
        }
        final int n2 = n + 8;
        int n3;
        if ((0x1 & this.getFlags()) == 0x1) {
            n3 = 8;
        }
        else {
            n3 = 0;
        }
        return n3 + n2;
    }
    
    public List<Long> getOffsets() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_4, this, this));
        return this.offsets;
    }
    
    public void setAuxInfoType(final long auxInfoType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_1, this, this, Conversions.longObject(auxInfoType)));
        this.auxInfoType = auxInfoType;
    }
    
    public void setAuxInfoTypeParameter(final long auxInfoTypeParameter) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_3, this, this, Conversions.longObject(auxInfoTypeParameter)));
        this.auxInfoTypeParameter = auxInfoTypeParameter;
    }
    
    public void setOffsets(final List<Long> offsets) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleAuxiliaryInformationOffsetsBox.ajc$tjp_5, this, this, offsets));
        this.offsets = offsets;
    }
}
