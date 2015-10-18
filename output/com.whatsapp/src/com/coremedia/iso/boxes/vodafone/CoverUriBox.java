// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class CoverUriBox extends AbstractFullBox
{
    public static final String TYPE = "cvru";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String coverUri;
    
    static {
        ajc$preClinit();
    }
    
    public CoverUriBox() {
        super("cvru");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("CoverUriBox.java", CoverUriBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCoverUri", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "java.lang.String", "coverUri", "", "void"), 42);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.vodafone.CoverUriBox", "", "", "", "java.lang.String"), 64);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.coverUri = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.coverUri));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 5 + Utf8.utf8StringLengthInBytes(this.coverUri);
    }
    
    public String getCoverUri() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CoverUriBox.ajc$tjp_0, this, this));
        return this.coverUri;
    }
    
    public void setCoverUri(final String coverUri) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CoverUriBox.ajc$tjp_1, this, this, coverUri));
        this.coverUri = coverUri;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CoverUriBox.ajc$tjp_2, this, this));
        return "CoverUriBox[coverUri=" + this.getCoverUri() + "]";
    }
}
