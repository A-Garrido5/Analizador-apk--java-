// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SchemeTypeBox extends AbstractFullBox
{
    public static final String TYPE = "schm";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    String schemeType;
    String schemeUri;
    long schemeVersion;
    
    static {
        ajc$preClinit();
    }
    
    public SchemeTypeBox() {
        super("schm");
        this.schemeType = "    ";
        this.schemeUri = null;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SchemeTypeBox.java", SchemeTypeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "long"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "int", "schemeVersion", "", "void"), 61);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"), 65);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.schemeType = IsoTypeReader.read4cc(byteBuffer);
        this.schemeVersion = IsoTypeReader.readUInt32(byteBuffer);
        if ((0x1 & this.getFlags()) == 0x1) {
            this.schemeUri = IsoTypeReader.readString(byteBuffer);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.schemeType));
        IsoTypeWriter.writeUInt32(byteBuffer, this.schemeVersion);
        if ((0x1 & this.getFlags()) == 0x1) {
            byteBuffer.put(Utf8.convert(this.schemeUri));
        }
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if ((0x1 & this.getFlags()) == 0x1) {
            n = 1 + Utf8.utf8StringLengthInBytes(this.schemeUri);
        }
        else {
            n = 0;
        }
        return n + 12;
    }
    
    public String getSchemeType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_0, this, this));
        return this.schemeType;
    }
    
    public String getSchemeUri() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_2, this, this));
        return this.schemeUri;
    }
    
    public long getSchemeVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_1, this, this));
        return this.schemeVersion;
    }
    
    public void setSchemeType(final String schemeType) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_3, this, this, schemeType));
        assert schemeType != null && schemeType.length() == 4 : "SchemeType may not be null or not 4 bytes long";
        this.schemeType = schemeType;
    }
    
    public void setSchemeUri(final String schemeUri) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_5, this, this, schemeUri));
        this.schemeUri = schemeUri;
    }
    
    public void setSchemeVersion(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_4, this, this, Conversions.intObject(n)));
        this.schemeVersion = n;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SchemeTypeBox.ajc$tjp_6, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("Schema Type Box[");
        sb.append("schemeUri=").append(this.schemeUri).append("; ");
        sb.append("schemeType=").append(this.schemeType).append("; ");
        sb.append("schemeVersion=").append(this.schemeUri).append("; ");
        sb.append("]");
        return sb.toString();
    }
}
