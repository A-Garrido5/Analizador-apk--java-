// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoFile;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class ClassificationBox extends AbstractFullBox
{
    public static final String TYPE = "clsf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private String classificationEntity;
    private String classificationInfo;
    private int classificationTableIndex;
    private String language;
    
    static {
        ajc$preClinit();
    }
    
    public ClassificationBox() {
        super("clsf");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("ClassificationBox.java", ClassificationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "int"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setClassificationEntity", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"), 60);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setClassificationTableIndex", "com.coremedia.iso.boxes.ClassificationBox", "int", "classificationTableIndex", "", "void"), 64);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "language", "", "void"), 68);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setClassificationInfo", "com.coremedia.iso.boxes.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"), 72);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.ClassificationBox", "", "", "", "java.lang.String"), 101);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        this.classificationEntity = IsoFile.bytesToFourCC(array);
        this.classificationTableIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.classificationInfo = IsoTypeReader.readString(byteBuffer);
    }
    
    public String getClassificationEntity() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_1, this, this));
        return this.classificationEntity;
    }
    
    public String getClassificationInfo() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_3, this, this));
        return this.classificationInfo;
    }
    
    public int getClassificationTableIndex() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_2, this, this));
        return this.classificationTableIndex;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.classificationEntity));
        IsoTypeWriter.writeUInt16(byteBuffer, this.classificationTableIndex);
        IsoTypeWriter.writeIso639(byteBuffer, this.language);
        byteBuffer.put(Utf8.convert(this.classificationInfo));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 1 + (8 + Utf8.utf8StringLengthInBytes(this.classificationInfo));
    }
    
    public String getLanguage() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_0, this, this));
        return this.language;
    }
    
    public void setClassificationEntity(final String classificationEntity) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_4, this, this, classificationEntity));
        this.classificationEntity = classificationEntity;
    }
    
    public void setClassificationInfo(final String classificationInfo) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_7, this, this, classificationInfo));
        this.classificationInfo = classificationInfo;
    }
    
    public void setClassificationTableIndex(final int classificationTableIndex) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_5, this, this, Conversions.intObject(classificationTableIndex)));
        this.classificationTableIndex = classificationTableIndex;
    }
    
    public void setLanguage(final String language) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_6, this, this, language));
        this.language = language;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ClassificationBox.ajc$tjp_8, this, this));
        final StringBuilder sb = new StringBuilder();
        sb.append("ClassificationBox[language=").append(this.getLanguage());
        sb.append("classificationEntity=").append(this.getClassificationEntity());
        sb.append(";classificationTableIndex=").append(this.getClassificationTableIndex());
        sb.append(";language=").append(this.getLanguage());
        sb.append(";classificationInfo=").append(this.getClassificationInfo());
        sb.append("]");
        return sb.toString();
    }
}
