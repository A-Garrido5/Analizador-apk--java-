// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class FreeSpaceBox extends AbstractBox
{
    public static final String TYPE = "skip";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    byte[] data;
    
    static {
        ajc$preClinit();
    }
    
    public FreeSpaceBox() {
        super("skip");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("FreeSpaceBox.java", FreeSpaceBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setData", "com.coremedia.iso.boxes.FreeSpaceBox", "[B", "data", "", "void"), 42);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getData", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "[B"), 46);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        byteBuffer.get(this.data = new byte[byteBuffer.remaining()]);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }
    
    @Override
    protected long getContentSize() {
        return this.data.length;
    }
    
    public byte[] getData() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FreeSpaceBox.ajc$tjp_1, this, this));
        return this.data;
    }
    
    public void setData(final byte[] data) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FreeSpaceBox.ajc$tjp_0, this, this, data));
        this.data = data;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(FreeSpaceBox.ajc$tjp_2, this, this));
        return "FreeSpaceBox[size=" + this.data.length + ";type=" + this.getType() + "]";
    }
}
