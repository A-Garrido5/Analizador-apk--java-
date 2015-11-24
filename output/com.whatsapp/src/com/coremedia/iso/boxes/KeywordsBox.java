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

public class KeywordsBox extends AbstractFullBox
{
    public static final String TYPE = "kywd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private String[] keywords;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public KeywordsBox() {
        super("kywd");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("KeywordsBox.java", KeywordsBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"), 48);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        final int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.keywords = new String[uInt8];
        for (int i = 0; i < uInt8; ++i) {
            IsoTypeReader.readUInt8(byteBuffer);
            this.keywords[i] = IsoTypeReader.readString(byteBuffer);
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        IsoTypeWriter.writeUInt8(byteBuffer, this.keywords.length);
        for (final String s : this.keywords) {
            IsoTypeWriter.writeUInt8(byteBuffer, 1 + Utf8.utf8StringLengthInBytes(s));
            byteBuffer.put(Utf8.convert(s));
        }
    }
    
    @Override
    protected long getContentSize() {
        long n = 7L;
        final String[] keywords = this.keywords;
        for (int length = keywords.length, i = 0; i < length; ++i) {
            n += 1 + (1 + Utf8.utf8StringLengthInBytes(keywords[i]));
        }
        return n;
    }
    
    public String[] getKeywords() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(KeywordsBox.ajc$tjp_1, this, this));
        return this.keywords;
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(KeywordsBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public void setKeywords(final String[] keywords) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(KeywordsBox.ajc$tjp_3, this, this, (Object)keywords));
        this.keywords = keywords;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(KeywordsBox.ajc$tjp_2, this, this, language));
        this.language = language;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(KeywordsBox.ajc$tjp_4, this, this));
        final StringBuffer sb = new StringBuffer();
        sb.append("KeywordsBox[language=").append(this.getLanguage());
        for (int i = 0; i < this.keywords.length; ++i) {
            sb.append(";keyword").append(i).append("=").append(this.keywords[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
