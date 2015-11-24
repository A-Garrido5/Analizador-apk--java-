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

public class TitleBox extends AbstractFullBox
{
    public static final String TYPE = "titl";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private String language;
    private String title;
    
    static {
        ajc$preClinit();
    }
    
    public TitleBox() {
        super("titl");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TitleBox.java", TitleBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTitle", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", "", "void"), 59);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "title", "", "void"), 63);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.TitleBox", "", "", "", "java.lang.String"), 86);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.title = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.title));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 7 + Utf8.utf8StringLengthInBytes(this.title);
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TitleBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public String getTitle() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TitleBox.ajc$tjp_1, this, this));
        return this.title;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TitleBox.ajc$tjp_2, this, this, language));
        this.language = language;
    }
    
    public void setTitle(final String title) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TitleBox.ajc$tjp_3, this, this, title));
        this.title = title;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TitleBox.ajc$tjp_4, this, this));
        return "TitleBox[language=" + this.getLanguage() + ";title=" + this.getTitle() + "]";
    }
}
