// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class ContentDistributorIdBox extends AbstractFullBox
{
    public static final String TYPE = "cdis";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String contentDistributorId;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public ContentDistributorIdBox() {
        super("cdis");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ContentDistributorIdBox.java", ContentDistributorIdBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getContentDistributorId", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.vodafone.ContentDistributorIdBox", "", "", "", "java.lang.String"), 68);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.contentDistributorId = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.contentDistributorId));
        byteBuffer.put((byte)0);
    }
    
    public String getContentDistributorId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ContentDistributorIdBox.ajc$tjp_1, this, this));
        return this.contentDistributorId;
    }
    
    @Override
    protected long getContentSize() {
        return 5 + (2 + Utf8.utf8StringLengthInBytes(this.contentDistributorId));
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ContentDistributorIdBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ContentDistributorIdBox.ajc$tjp_2, this, this));
        return "ContentDistributorIdBox[language=" + this.getLanguage() + ";contentDistributorId=" + this.getContentDistributorId() + "]";
    }
}
