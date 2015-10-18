// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.apple;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class TrackEncodedPixelsDimensionsAtom extends AbstractFullBox
{
    public static final String TYPE = "enof";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    double height;
    double width;
    
    static {
        ajc$preClinit();
    }
    
    public TrackEncodedPixelsDimensionsAtom() {
        super("enof");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TrackEncodedPixelsDimensionsAtom.java", TrackEncodedPixelsDimensionsAtom.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getWidth", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "", "", "", "double"), 44);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setWidth", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "double", "width", "", "void"), 48);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getHeight", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "", "", "", "double"), 52);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setHeight", "com.googlecode.mp4parser.boxes.apple.TrackEncodedPixelsDimensionsAtom", "double", "height", "", "void"), 56);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.width = IsoTypeReader.readFixedPoint1616(byteBuffer);
        this.height = IsoTypeReader.readFixedPoint1616(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.width);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.height);
    }
    
    @Override
    protected long getContentSize() {
        return 12L;
    }
    
    public double getHeight() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_2, this, this));
        return this.height;
    }
    
    public double getWidth() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_0, this, this));
        return this.width;
    }
    
    public void setHeight(final double height) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_3, this, this, Conversions.doubleObject(height)));
        this.height = height;
    }
    
    public void setWidth(final double width) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TrackEncodedPixelsDimensionsAtom.ajc$tjp_1, this, this, Conversions.doubleObject(width)));
        this.width = width;
    }
}
