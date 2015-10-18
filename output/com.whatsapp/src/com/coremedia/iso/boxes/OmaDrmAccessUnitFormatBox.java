// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox
{
    public static final String TYPE = "odaf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;
    
    static {
        ajc$preClinit();
    }
    
    public OmaDrmAccessUnitFormatBox() {
        super("odaf");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("OmaDrmAccessUnitFormatBox.java", OmaDrmAccessUnitFormatBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "boolean"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 50);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", "int"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"), 62);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"), 66);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.allBits = (byte)IsoTypeReader.readUInt8(byteBuffer);
        this.selectiveEncryption = ((0x80 & this.allBits) == 0x80);
        this.keyIndicatorLength = IsoTypeReader.readUInt8(byteBuffer);
        this.initVectorLength = IsoTypeReader.readUInt8(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt8(byteBuffer, this.allBits);
        IsoTypeWriter.writeUInt8(byteBuffer, this.keyIndicatorLength);
        IsoTypeWriter.writeUInt8(byteBuffer, this.initVectorLength);
    }
    
    @Override
    protected long getContentSize() {
        return 7L;
    }
    
    public int getInitVectorLength() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_2, this, this));
        return this.initVectorLength;
    }
    
    public int getKeyIndicatorLength() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_1, this, this));
        return this.keyIndicatorLength;
    }
    
    public boolean isSelectiveEncryption() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_0, this, this));
        return this.selectiveEncryption;
    }
    
    public void setAllBits(final byte allBits) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_5, this, this, Conversions.byteObject(allBits)));
        this.allBits = allBits;
        this.selectiveEncryption = ((allBits & 0x80) == 0x80);
    }
    
    public void setInitVectorLength(final int initVectorLength) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_3, this, this, Conversions.intObject(initVectorLength)));
        this.initVectorLength = initVectorLength;
    }
    
    public void setKeyIndicatorLength(final int keyIndicatorLength) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OmaDrmAccessUnitFormatBox.ajc$tjp_4, this, this, Conversions.intObject(keyIndicatorLength)));
        this.keyIndicatorLength = keyIndicatorLength;
    }
}
