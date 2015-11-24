// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox
{
    public static byte[] USER_TYPE;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    ProtectionSpecificHeader protectionSpecificHeader;
    UUID systemId;
    
    static {
        ajc$preClinit();
        UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE = new byte[] { -48, -118, 79, 24, 16, -13, 74, -126, -74, -56, 50, -40, -85, -95, -125, -45 };
    }
    
    public UuidBasedProtectionSystemSpecificHeaderBox() {
        super("uuid", UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("UuidBasedProtectionSystemSpecificHeaderBox.java", UuidBasedProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"), 67);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSystemId", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"), 71);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSystemIdString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 75);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader"), 79);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getProtectionSpecificHeaderString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setProtectionSpecificHeader", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"), 87);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.piff.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"), 92);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final byte[] array = new byte[16];
        byteBuffer.get(array);
        this.systemId = UUIDConverter.convert(array);
        CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.protectionSpecificHeader = ProtectionSpecificHeader.createFor(this.systemId, byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt64(byteBuffer, this.systemId.getMostSignificantBits());
        IsoTypeWriter.writeUInt64(byteBuffer, this.systemId.getLeastSignificantBits());
        final ByteBuffer data = this.protectionSpecificHeader.getData();
        data.rewind();
        IsoTypeWriter.writeUInt32(byteBuffer, data.limit());
        byteBuffer.put(data);
    }
    
    @Override
    protected long getContentSize() {
        return 24 + this.protectionSpecificHeader.getData().limit();
    }
    
    public ProtectionSpecificHeader getProtectionSpecificHeader() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_3, this, this));
        return this.protectionSpecificHeader;
    }
    
    public String getProtectionSpecificHeaderString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_4, this, this));
        return this.protectionSpecificHeader.toString();
    }
    
    public UUID getSystemId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_0, this, this));
        return this.systemId;
    }
    
    public String getSystemIdString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_2, this, this));
        return this.systemId.toString();
    }
    
    @Override
    public byte[] getUserType() {
        return UuidBasedProtectionSystemSpecificHeaderBox.USER_TYPE;
    }
    
    public void setProtectionSpecificHeader(final ProtectionSpecificHeader protectionSpecificHeader) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_5, this, this, protectionSpecificHeader));
        this.protectionSpecificHeader = protectionSpecificHeader;
    }
    
    public void setSystemId(final UUID systemId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_1, this, this, systemId));
        this.systemId = systemId;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UuidBasedProtectionSystemSpecificHeaderBox.ajc$tjp_6, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("UuidBasedProtectionSystemSpecificHeaderBox");
        sb.append("{systemId=").append(this.systemId.toString());
        sb.append(", dataSize=").append(this.protectionSpecificHeader.getData().limit());
        sb.append('}');
        return sb.toString();
    }
}
