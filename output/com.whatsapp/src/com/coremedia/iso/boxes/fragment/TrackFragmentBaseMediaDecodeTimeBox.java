// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackFragmentBaseMediaDecodeTimeBox extends AbstractFullBox
{
    public static final String TYPE = "tfdt";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private long baseMediaDecodeTime;
    
    static {
        ajc$preClinit();
    }
    
    public TrackFragmentBaseMediaDecodeTimeBox() {
        super("tfdt");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackFragmentBaseMediaDecodeTimeBox.java", TrackFragmentBaseMediaDecodeTimeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "long"), 65);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "long", "baseMediaDecodeTime", "", "void"), 69);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            this.baseMediaDecodeTime = IsoTypeReader.readUInt64(byteBuffer);
            return;
        }
        this.baseMediaDecodeTime = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    public long getBaseMediaDecodeTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_0, this, this));
        return this.baseMediaDecodeTime;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.baseMediaDecodeTime);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.baseMediaDecodeTime);
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if (this.getVersion() == 0) {
            n = 8;
        }
        else {
            n = 12;
        }
        return n;
    }
    
    public void setBaseMediaDecodeTime(final long baseMediaDecodeTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_1, this, this, Conversions.longObject(baseMediaDecodeTime)));
        this.baseMediaDecodeTime = baseMediaDecodeTime;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackFragmentBaseMediaDecodeTimeBox.ajc$tjp_2, this, this));
        return "TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=" + this.baseMediaDecodeTime + '}';
    }
}
