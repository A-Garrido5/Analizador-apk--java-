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

public class PerformerBox extends AbstractFullBox
{
    public static final String TYPE = "perf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private String language;
    private String performer;
    
    static {
        ajc$preClinit();
    }
    
    public PerformerBox() {
        super("perf");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("PerformerBox.java", PerformerBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 41);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPerformer", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 45);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "language", "", "void"), 49);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPerformer", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "performer", "", "void"), 53);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 76);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.performer = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.performer));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 1 + (6 + Utf8.utf8StringLengthInBytes(this.performer));
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PerformerBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public String getPerformer() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PerformerBox.ajc$tjp_1, this, this));
        return this.performer;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PerformerBox.ajc$tjp_2, this, this, language));
        this.language = language;
    }
    
    public void setPerformer(final String performer) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PerformerBox.ajc$tjp_3, this, this, performer));
        this.performer = performer;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PerformerBox.ajc$tjp_4, this, this));
        return "PerformerBox[language=" + this.getLanguage() + ";performer=" + this.getPerformer() + "]";
    }
}
