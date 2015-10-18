// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class AppleDataRateBox extends AbstractFullBox
{
    public static final String TYPE = "rmdr";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private long dataRate;
    
    static {
        ajc$preClinit();
    }
    
    public AppleDataRateBox() {
        super("rmdr");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AppleDataRateBox.java", AppleDataRateBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", "long"), 53);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.dataRate = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.dataRate);
    }
    
    @Override
    protected long getContentSize() {
        return 8L;
    }
    
    public long getDataRate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AppleDataRateBox.ajc$tjp_0, this, this));
        return this.dataRate;
    }
}
