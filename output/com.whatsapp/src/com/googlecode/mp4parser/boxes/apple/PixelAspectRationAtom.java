// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.apple;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class PixelAspectRationAtom extends AbstractFullBox
{
    public static final String TYPE = "pasp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private int hSpacing;
    private int vSpacing;
    
    static {
        ajc$preClinit();
    }
    
    public PixelAspectRationAtom() {
        super("pasp");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("PixelAspectRationAtom.java", PixelAspectRationAtom.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "gethSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"), 34);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "sethSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "hSpacing", "", "void"), 38);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getvSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"), 42);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setvSpacing", "com.googlecode.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "vSpacing", "", "void"), 46);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.hSpacing = byteBuffer.getInt();
        this.vSpacing = byteBuffer.getInt();
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.hSpacing);
        byteBuffer.putInt(this.vSpacing);
    }
    
    @Override
    protected long getContentSize() {
        return 12L;
    }
    
    public int gethSpacing() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PixelAspectRationAtom.ajc$tjp_0, this, this));
        return this.hSpacing;
    }
    
    public int getvSpacing() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PixelAspectRationAtom.ajc$tjp_2, this, this));
        return this.vSpacing;
    }
    
    public void sethSpacing(final int hSpacing) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PixelAspectRationAtom.ajc$tjp_1, this, this, Conversions.intObject(hSpacing)));
        this.hSpacing = hSpacing;
    }
    
    public void setvSpacing(final int vSpacing) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(PixelAspectRationAtom.ajc$tjp_3, this, this, Conversions.intObject(vSpacing)));
        this.vSpacing = vSpacing;
    }
}
