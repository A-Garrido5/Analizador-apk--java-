// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.ultraviolet;

import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class AssetInformationBox extends AbstractFullBox
{
    public static final String TYPE = "ainf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    String apid;
    String profileVersion;
    
    static {
        ajc$preClinit();
    }
    
    public AssetInformationBox() {
        super("ainf");
        this.apid = "";
        this.profileVersion = "0000";
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AssetInformationBox.java", AssetInformationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getApid", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setApid", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "java.lang.String", "apid", "", "void"), 66);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "", "", "", "java.lang.String"), 70);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.ultraviolet.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 74);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.profileVersion = IsoTypeReader.readString(byteBuffer, 4);
        this.apid = IsoTypeReader.readString(byteBuffer);
    }
    
    public String getApid() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AssetInformationBox.ajc$tjp_0, this, this));
        return this.apid;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.profileVersion), 0, 4);
        byteBuffer.put(Utf8.convert(this.apid));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 9 + Utf8.utf8StringLengthInBytes(this.apid);
    }
    
    public String getProfileVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AssetInformationBox.ajc$tjp_2, this, this));
        return this.profileVersion;
    }
    
    public void setApid(final String apid) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AssetInformationBox.ajc$tjp_1, this, this, apid));
        this.apid = apid;
    }
    
    public void setProfileVersion(final String profileVersion) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AssetInformationBox.ajc$tjp_3, this, this, profileVersion));
        assert profileVersion != null && profileVersion.length() == 4;
        this.profileVersion = profileVersion;
    }
}
