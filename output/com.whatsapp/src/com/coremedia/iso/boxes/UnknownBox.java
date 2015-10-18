// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class UnknownBox extends AbstractBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    ByteBuffer data;
    
    static {
        ajc$preClinit();
    }
    
    public UnknownBox(final String s) {
        super(s);
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("UnknownBox.java", UnknownBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 52);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 56);
    }
    
    public void _parseDetails(final ByteBuffer data) {
        (this.data = data).position(data.position() + data.remaining());
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.data.rewind();
        byteBuffer.put(this.data);
    }
    
    @Override
    protected long getContentSize() {
        return this.data.limit();
    }
    
    public ByteBuffer getData() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UnknownBox.ajc$tjp_0, this, this));
        return this.data;
    }
    
    public void setData(final ByteBuffer data) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(UnknownBox.ajc$tjp_1, this, this, data));
        this.data = data;
    }
}
