// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TfxdBox extends AbstractFullBox
{
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;
    
    static {
        ajc$preClinit();
    }
    
    public TfxdBox() {
        super("uuid");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TfxdBox.java", TfxdBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFragmentAbsoluteTime", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 79);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFragmentAbsoluteDuration", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", "long"), 83);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.fragmentAbsoluteTime = IsoTypeReader.readUInt64(byteBuffer);
            this.fragmentAbsoluteDuration = IsoTypeReader.readUInt64(byteBuffer);
            return;
        }
        this.fragmentAbsoluteTime = IsoTypeReader.readUInt32(byteBuffer);
        this.fragmentAbsoluteDuration = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentAbsoluteTime);
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentAbsoluteDuration);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentAbsoluteTime);
        IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentAbsoluteDuration);
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if (this.getVersion() == 1) {
            n = 20;
        }
        else {
            n = 12;
        }
        return n;
    }
    
    public long getFragmentAbsoluteDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TfxdBox.ajc$tjp_1, this, this));
        return this.fragmentAbsoluteDuration;
    }
    
    public long getFragmentAbsoluteTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TfxdBox.ajc$tjp_0, this, this));
        return this.fragmentAbsoluteTime;
    }
    
    @Override
    public byte[] getUserType() {
        return new byte[] { 109, 29, -101, 5, 66, -43, 68, -26, -128, -30, 20, 29, -81, -9, 87, -78 };
    }
}
