// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class CompositionShiftLeastGreatestAtom extends AbstractFullBox
{
    public static final String TYPE = "cslg";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;
    
    static {
        ajc$preClinit();
    }
    
    public CompositionShiftLeastGreatestAtom() {
        super("cslg");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("CompositionShiftLeastGreatestAtom.java", CompositionShiftLeastGreatestAtom.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 66);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "compositionOffsetToDisplayOffsetShift", "", "void"), 70);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 74);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "leastDisplayOffset", "", "void"), 78);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 82);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "greatestDisplayOffset", "", "void"), 86);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 90);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayStartTime", "", "void"), 94);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", "int"), 98);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "int", "displayEndTime", "", "void"), 102);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.compositionOffsetToDisplayOffsetShift = byteBuffer.getInt();
        this.leastDisplayOffset = byteBuffer.getInt();
        this.greatestDisplayOffset = byteBuffer.getInt();
        this.displayStartTime = byteBuffer.getInt();
        this.displayEndTime = byteBuffer.getInt();
    }
    
    public int getCompositionOffsetToDisplayOffsetShift() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_0, this, this));
        return this.compositionOffsetToDisplayOffsetShift;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.compositionOffsetToDisplayOffsetShift);
        byteBuffer.putInt(this.leastDisplayOffset);
        byteBuffer.putInt(this.greatestDisplayOffset);
        byteBuffer.putInt(this.displayStartTime);
        byteBuffer.putInt(this.displayEndTime);
    }
    
    @Override
    protected long getContentSize() {
        return 24L;
    }
    
    public int getDisplayEndTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_8, this, this));
        return this.displayEndTime;
    }
    
    public int getDisplayStartTime() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_6, this, this));
        return this.displayStartTime;
    }
    
    public int getGreatestDisplayOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_4, this, this));
        return this.greatestDisplayOffset;
    }
    
    public int getLeastDisplayOffset() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_2, this, this));
        return this.leastDisplayOffset;
    }
    
    public void setCompositionOffsetToDisplayOffsetShift(final int compositionOffsetToDisplayOffsetShift) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_1, this, this, Conversions.intObject(compositionOffsetToDisplayOffsetShift)));
        this.compositionOffsetToDisplayOffsetShift = compositionOffsetToDisplayOffsetShift;
    }
    
    public void setDisplayEndTime(final int displayEndTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_9, this, this, Conversions.intObject(displayEndTime)));
        this.displayEndTime = displayEndTime;
    }
    
    public void setDisplayStartTime(final int displayStartTime) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_7, this, this, Conversions.intObject(displayStartTime)));
        this.displayStartTime = displayStartTime;
    }
    
    public void setGreatestDisplayOffset(final int greatestDisplayOffset) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_5, this, this, Conversions.intObject(greatestDisplayOffset)));
        this.greatestDisplayOffset = greatestDisplayOffset;
    }
    
    public void setLeastDisplayOffset(final int leastDisplayOffset) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(CompositionShiftLeastGreatestAtom.ajc$tjp_3, this, this, Conversions.intObject(leastDisplayOffset)));
        this.leastDisplayOffset = leastDisplayOffset;
    }
}
