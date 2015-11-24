// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public final class BitRateBox extends AbstractBox
{
    public static final String TYPE = "btrt";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;
    
    static {
        ajc$preClinit();
    }
    
    public BitRateBox() {
        super("btrt");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("BitRateBox.java", BitRateBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBufferSizeDb", "com.coremedia.iso.boxes.BitRateBox", "", "", "", "long"), 70);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBufferSizeDb", "com.coremedia.iso.boxes.BitRateBox", "long", "bufferSizeDb", "", "void"), 74);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMaxBitrate", "com.coremedia.iso.boxes.BitRateBox", "", "", "", "long"), 78);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMaxBitrate", "com.coremedia.iso.boxes.BitRateBox", "long", "maxBitrate", "", "void"), 82);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAvgBitrate", "com.coremedia.iso.boxes.BitRateBox", "", "", "", "long"), 86);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAvgBitrate", "com.coremedia.iso.boxes.BitRateBox", "long", "avgBitrate", "", "void"), 90);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.bufferSizeDb = IsoTypeReader.readUInt32(byteBuffer);
        this.maxBitrate = IsoTypeReader.readUInt32(byteBuffer);
        this.avgBitrate = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    public long getAvgBitrate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BitRateBox.ajc$tjp_4, this, this));
        return this.avgBitrate;
    }
    
    public long getBufferSizeDb() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BitRateBox.ajc$tjp_0, this, this));
        return this.bufferSizeDb;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt32(byteBuffer, this.bufferSizeDb);
        IsoTypeWriter.writeUInt32(byteBuffer, this.maxBitrate);
        IsoTypeWriter.writeUInt32(byteBuffer, this.avgBitrate);
    }
    
    @Override
    protected long getContentSize() {
        return 12L;
    }
    
    public long getMaxBitrate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BitRateBox.ajc$tjp_2, this, this));
        return this.maxBitrate;
    }
    
    public void setAvgBitrate(final long avgBitrate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BitRateBox.ajc$tjp_5, this, this, Conversions.longObject(avgBitrate)));
        this.avgBitrate = avgBitrate;
    }
    
    public void setBufferSizeDb(final long bufferSizeDb) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BitRateBox.ajc$tjp_1, this, this, Conversions.longObject(bufferSizeDb)));
        this.bufferSizeDb = bufferSizeDb;
    }
    
    public void setMaxBitrate(final long maxBitrate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BitRateBox.ajc$tjp_3, this, this, Conversions.longObject(maxBitrate)));
        this.maxBitrate = maxBitrate;
    }
}
