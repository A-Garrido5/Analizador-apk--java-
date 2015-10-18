// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;

public class SubtitleMediaHeaderBox extends AbstractMediaHeaderBox
{
    public static final String TYPE = "sthd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    
    static {
        ajc$preClinit();
    }
    
    public SubtitleMediaHeaderBox() {
        super("sthd");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SubtitleMediaHeaderBox.java", SubtitleMediaHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"), 30);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
    }
    
    @Override
    protected long getContentSize() {
        return 4L;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SubtitleMediaHeaderBox.ajc$tjp_0, this, this));
        return "SubtitleMediaHeaderBox";
    }
}
