// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class XmlBox extends AbstractFullBox
{
    public static final String TYPE = "xml ";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    String xml;
    
    static {
        ajc$preClinit();
    }
    
    public XmlBox() {
        super("xml ");
        this.xml = "";
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("XmlBox.java", XmlBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getXml", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 20);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setXml", "com.coremedia.iso.boxes.XmlBox", "java.lang.String", "xml", "", "void"), 24);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.XmlBox", "", "", "", "java.lang.String"), 46);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.xml = IsoTypeReader.readString(byteBuffer, byteBuffer.remaining());
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.xml));
    }
    
    @Override
    protected long getContentSize() {
        return 4 + Utf8.utf8StringLengthInBytes(this.xml);
    }
    
    public String getXml() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(XmlBox.ajc$tjp_0, this, this));
        return this.xml;
    }
    
    public void setXml(final String xml) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(XmlBox.ajc$tjp_1, this, this, xml));
        this.xml = xml;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(XmlBox.ajc$tjp_2, this, this));
        return "XmlBox{xml='" + this.xml + '\'' + '}';
    }
}
