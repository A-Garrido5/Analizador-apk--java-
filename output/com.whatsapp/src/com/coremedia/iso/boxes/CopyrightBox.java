// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class CopyrightBox extends AbstractFullBox
{
    public static final String TYPE = "cprt";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private String copyright;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public CopyrightBox() {
        super("cprt");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("CopyrightBox.java", CopyrightBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCopyright", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCopyright", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "copyright", "", "void"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 81);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.copyright = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.copyright));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 7 + Utf8.utf8StringLengthInBytes(this.copyright);
    }
    
    public String getCopyright() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CopyrightBox.ajc$tjp_1, this, this));
        return this.copyright;
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CopyrightBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public void setCopyright(final String copyright) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CopyrightBox.ajc$tjp_3, this, this, copyright));
        this.copyright = copyright;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CopyrightBox.ajc$tjp_2, this, this, language));
        this.language = language;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CopyrightBox.ajc$tjp_4, this, this));
        return "CopyrightBox[language=" + this.getLanguage() + ";copyright=" + this.getCopyright() + "]";
    }
}
