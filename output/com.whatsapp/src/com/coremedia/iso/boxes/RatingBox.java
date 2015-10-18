// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

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

public class RatingBox extends AbstractFullBox
{
    public static final String TYPE = "rtng";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;
    
    static {
        ajc$preClinit();
    }
    
    public RatingBox() {
        super("rtng");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("RatingBox.java", RatingBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.ratingEntity = IsoTypeReader.read4cc(byteBuffer);
        this.ratingCriteria = IsoTypeReader.read4cc(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.ratingInfo = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.ratingEntity));
        byteBuffer.put(IsoFile.fourCCtoBytes(this.ratingCriteria));
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.ratingInfo));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 15 + Utf8.utf8StringLengthInBytes(this.ratingInfo);
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_4, this, this));
        return this.language;
    }
    
    public String getRatingCriteria() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_6, this, this));
        return this.ratingCriteria;
    }
    
    public String getRatingEntity() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_5, this, this));
        return this.ratingEntity;
    }
    
    public String getRatingInfo() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_7, this, this));
        return this.ratingInfo;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_2, this, this, language));
        this.language = language;
    }
    
    public void setRatingCriteria(final String ratingCriteria) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_1, this, this, ratingCriteria));
        this.ratingCriteria = ratingCriteria;
    }
    
    public void setRatingEntity(final String ratingEntity) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_0, this, this, ratingEntity));
        this.ratingEntity = ratingEntity;
    }
    
    public void setRatingInfo(final String ratingInfo) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_3, this, this, ratingInfo));
        this.ratingInfo = ratingInfo;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(RatingBox.ajc$tjp_8, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("RatingBox[language=").append(this.getLanguage());
        sb.append("ratingEntity=").append(this.getRatingEntity());
        sb.append(";ratingCriteria=").append(this.getRatingCriteria());
        sb.append(";language=").append(this.getLanguage());
        sb.append(";ratingInfo=").append(this.getRatingInfo());
        sb.append("]");
        return sb.toString();
    }
}
