// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class AppleDataReferenceBox extends AbstractFullBox
{
    public static final String TYPE = "rdrf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;
    
    static {
        ajc$preClinit();
    }
    
    public AppleDataReferenceBox() {
        super("rdrf");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AppleDataReferenceBox.java", AppleDataReferenceBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "long"), 63);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = IsoTypeReader.read4cc(byteBuffer);
        this.dataReferenceSize = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        this.dataReference = IsoTypeReader.readString(byteBuffer, this.dataReferenceSize);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(IsoFile.fourCCtoBytes(this.dataReferenceType));
        IsoTypeWriter.writeUInt32(byteBuffer, this.dataReferenceSize);
        byteBuffer.put(Utf8.convert(this.dataReference));
    }
    
    @Override
    protected long getContentSize() {
        return 12 + this.dataReferenceSize;
    }
    
    public String getDataReference() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleDataReferenceBox.ajc$tjp_2, this, this));
        return this.dataReference;
    }
    
    public long getDataReferenceSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleDataReferenceBox.ajc$tjp_0, this, this));
        return this.dataReferenceSize;
    }
    
    public String getDataReferenceType() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleDataReferenceBox.ajc$tjp_1, this, this));
        return this.dataReferenceType;
    }
}
