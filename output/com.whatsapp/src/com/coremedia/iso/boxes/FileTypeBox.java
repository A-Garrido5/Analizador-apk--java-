// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import org.aspectj.runtime.internal.Conversions;
import java.util.Iterator;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoFile;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.util.LinkedList;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class FileTypeBox extends AbstractBox
{
    public static final String TYPE = "ftyp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private List<String> compatibleBrands;
    private String majorBrand;
    private long minorVersion;
    
    static {
        ajc$preClinit();
    }
    
    public FileTypeBox() {
        super("ftyp");
        this.compatibleBrands = Collections.emptyList();
    }
    
    public FileTypeBox(final String majorBrand, final long minorVersion, final List<String> compatibleBrands) {
        super("ftyp");
        this.compatibleBrands = Collections.emptyList();
        this.majorBrand = majorBrand;
        this.minorVersion = minorVersion;
        this.compatibleBrands = compatibleBrands;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("FileTypeBox.java", FileTypeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMajorBrand", "com.coremedia.iso.boxes.FileTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "int", "minorVersion", "", "void"), 103);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMinorVersion", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "long"), 113);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "", "", "", "java.util.List"), 122);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCompatibleBrands", "com.coremedia.iso.boxes.FileTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.majorBrand = IsoTypeReader.read4cc(byteBuffer);
        this.minorVersion = IsoTypeReader.readUInt32(byteBuffer);
        final int n = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList<String>();
        for (int i = 0; i < n; ++i) {
            this.compatibleBrands.add(IsoTypeReader.read4cc(byteBuffer));
        }
    }
    
    public List<String> getCompatibleBrands() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FileTypeBox.ajc$tjp_4, this, this));
        return this.compatibleBrands;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.fourCCtoBytes(this.majorBrand));
        IsoTypeWriter.writeUInt32(byteBuffer, this.minorVersion);
        final Iterator<String> iterator = this.compatibleBrands.iterator();
        while (iterator.hasNext()) {
            byteBuffer.put(IsoFile.fourCCtoBytes(iterator.next()));
        }
    }
    
    @Override
    protected long getContentSize() {
        return 8 + 4 * this.compatibleBrands.size();
    }
    
    public String getMajorBrand() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FileTypeBox.ajc$tjp_0, this, this));
        return this.majorBrand;
    }
    
    public long getMinorVersion() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FileTypeBox.ajc$tjp_3, this, this));
        return this.minorVersion;
    }
    
    public void setCompatibleBrands(final List<String> compatibleBrands) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FileTypeBox.ajc$tjp_5, this, this, compatibleBrands));
        this.compatibleBrands = compatibleBrands;
    }
    
    public void setMajorBrand(final String majorBrand) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FileTypeBox.ajc$tjp_1, this, this, majorBrand));
        this.majorBrand = majorBrand;
    }
    
    public void setMinorVersion(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FileTypeBox.ajc$tjp_2, this, this, Conversions.intObject(n)));
        this.minorVersion = n;
    }
    
    @DoNotParseDetail
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FileTypeBox[");
        sb.append("majorBrand=").append(this.getMajorBrand());
        sb.append(";");
        sb.append("minorVersion=").append(this.getMinorVersion());
        for (final String s : this.compatibleBrands) {
            sb.append(";");
            sb.append("compatibleBrand=").append(s);
        }
        sb.append("]");
        return sb.toString();
    }
}
