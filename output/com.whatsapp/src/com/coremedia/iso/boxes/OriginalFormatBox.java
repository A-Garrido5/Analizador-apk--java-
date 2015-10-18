// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class OriginalFormatBox extends AbstractBox
{
    public static final String TYPE = "frma";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String dataFormat;
    
    static {
        ajc$preClinit();
    }
    
    public OriginalFormatBox() {
        super("frma");
        this.dataFormat = "    ";
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("OriginalFormatBox.java", OriginalFormatBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 42);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataFormat", "com.coremedia.iso.boxes.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"), 47);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.OriginalFormatBox", "", "", "", "java.lang.String"), 67);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.dataFormat = IsoTypeReader.read4cc(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.dataFormat));
    }
    
    @Override
    protected long getContentSize() {
        return 4L;
    }
    
    public String getDataFormat() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OriginalFormatBox.ajc$tjp_0, this, this));
        return this.dataFormat;
    }
    
    public void setDataFormat(final String dataFormat) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OriginalFormatBox.ajc$tjp_1, this, this, dataFormat));
        assert dataFormat.length() == 4;
        this.dataFormat = dataFormat;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(OriginalFormatBox.ajc$tjp_2, this, this));
        return "OriginalFormatBox[dataFormat=" + this.getDataFormat() + "]";
    }
}
