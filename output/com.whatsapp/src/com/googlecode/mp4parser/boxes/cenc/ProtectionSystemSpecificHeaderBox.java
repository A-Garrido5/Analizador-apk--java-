// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import com.googlecode.mp4parser.util.UUIDConverter;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox
{
    public static byte[] OMA2_SYSTEM_ID;
    public static byte[] PLAYREADY_SYSTEM_ID;
    public static final String TYPE = "pssh";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    byte[] content;
    byte[] systemId;
    
    static {
        ajc$preClinit();
        ProtectionSystemSpecificHeaderBox.OMA2_SYSTEM_ID = UUIDConverter.convert(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        ProtectionSystemSpecificHeaderBox.PLAYREADY_SYSTEM_ID = UUIDConverter.convert(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }
    
    public ProtectionSystemSpecificHeaderBox() {
        super("pssh");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ProtectionSystemSpecificHeaderBox.java", ProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSystemId", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 38);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSystemId", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 42);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContent", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 47);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setContent", "com.googlecode.mp4parser.boxes.cenc.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 51);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        byteBuffer.get(this.systemId = new byte[16]);
        final long uInt32 = IsoTypeReader.readUInt32(byteBuffer);
        byteBuffer.get(this.content = new byte[byteBuffer.remaining()]);
        assert uInt32 == this.content.length;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        assert this.systemId.length == 16;
        byteBuffer.put(this.systemId, 0, 16);
        IsoTypeWriter.writeUInt32(byteBuffer, this.content.length);
        byteBuffer.put(this.content);
    }
    
    public byte[] getContent() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_2, this, this));
        return this.content;
    }
    
    @Override
    protected long getContentSize() {
        return 24 + this.content.length;
    }
    
    public byte[] getSystemId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_0, this, this));
        return this.systemId;
    }
    
    public void setContent(final byte[] content) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_3, this, this, content));
        this.content = content;
    }
    
    public void setSystemId(final byte[] systemId) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ProtectionSystemSpecificHeaderBox.ajc$tjp_1, this, this, systemId));
        assert systemId.length == 16;
        this.systemId = systemId;
    }
}
