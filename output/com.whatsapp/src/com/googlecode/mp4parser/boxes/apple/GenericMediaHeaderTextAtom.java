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
import com.googlecode.mp4parser.AbstractBox;

public class GenericMediaHeaderTextAtom extends AbstractBox
{
    public static final String TYPE = "text";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int unknown_1;
    int unknown_2;
    int unknown_3;
    int unknown_4;
    int unknown_5;
    int unknown_6;
    int unknown_7;
    int unknown_8;
    int unknown_9;
    
    static {
        ajc$preClinit();
    }
    
    public GenericMediaHeaderTextAtom() {
        super("text");
        this.unknown_1 = 65536;
        this.unknown_5 = 65536;
        this.unknown_9 = 1073741824;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("GenericMediaHeaderTextAtom.java", GenericMediaHeaderTextAtom.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 60);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_1", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_1", "", "void"), 64);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 100);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_6", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_6", "", "void"), 104);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 108);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_7", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_7", "", "void"), 112);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 116);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_8", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_8", "", "void"), 120);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 124);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_9", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_9", "", "void"), 128);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 68);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_2", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_2", "", "void"), 72);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 76);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_3", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_3", "", "void"), 80);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 84);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_4", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_4", "", "void"), 88);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"), 92);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setUnknown_5", "com.googlecode.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_5", "", "void"), 96);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.unknown_1 = byteBuffer.getInt();
        this.unknown_2 = byteBuffer.getInt();
        this.unknown_3 = byteBuffer.getInt();
        this.unknown_4 = byteBuffer.getInt();
        this.unknown_5 = byteBuffer.getInt();
        this.unknown_6 = byteBuffer.getInt();
        this.unknown_7 = byteBuffer.getInt();
        this.unknown_8 = byteBuffer.getInt();
        this.unknown_9 = byteBuffer.getInt();
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.unknown_1);
        byteBuffer.putInt(this.unknown_2);
        byteBuffer.putInt(this.unknown_3);
        byteBuffer.putInt(this.unknown_4);
        byteBuffer.putInt(this.unknown_5);
        byteBuffer.putInt(this.unknown_6);
        byteBuffer.putInt(this.unknown_7);
        byteBuffer.putInt(this.unknown_8);
        byteBuffer.putInt(this.unknown_9);
    }
    
    @Override
    protected long getContentSize() {
        return 36L;
    }
    
    public int getUnknown_1() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_0, this, this));
        return this.unknown_1;
    }
    
    public int getUnknown_2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_2, this, this));
        return this.unknown_2;
    }
    
    public int getUnknown_3() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_4, this, this));
        return this.unknown_3;
    }
    
    public int getUnknown_4() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_6, this, this));
        return this.unknown_4;
    }
    
    public int getUnknown_5() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_8, this, this));
        return this.unknown_5;
    }
    
    public int getUnknown_6() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_10, this, this));
        return this.unknown_6;
    }
    
    public int getUnknown_7() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_12, this, this));
        return this.unknown_7;
    }
    
    public int getUnknown_8() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_14, this, this));
        return this.unknown_8;
    }
    
    public int getUnknown_9() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_16, this, this));
        return this.unknown_9;
    }
    
    public void setUnknown_1(final int unknown_1) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_1, this, this, Conversions.intObject(unknown_1)));
        this.unknown_1 = unknown_1;
    }
    
    public void setUnknown_2(final int unknown_2) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_3, this, this, Conversions.intObject(unknown_2)));
        this.unknown_2 = unknown_2;
    }
    
    public void setUnknown_3(final int unknown_3) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_5, this, this, Conversions.intObject(unknown_3)));
        this.unknown_3 = unknown_3;
    }
    
    public void setUnknown_4(final int unknown_4) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_7, this, this, Conversions.intObject(unknown_4)));
        this.unknown_4 = unknown_4;
    }
    
    public void setUnknown_5(final int unknown_5) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_9, this, this, Conversions.intObject(unknown_5)));
        this.unknown_5 = unknown_5;
    }
    
    public void setUnknown_6(final int unknown_6) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_11, this, this, Conversions.intObject(unknown_6)));
        this.unknown_6 = unknown_6;
    }
    
    public void setUnknown_7(final int unknown_7) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_13, this, this, Conversions.intObject(unknown_7)));
        this.unknown_7 = unknown_7;
    }
    
    public void setUnknown_8(final int unknown_8) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_15, this, this, Conversions.intObject(unknown_8)));
        this.unknown_8 = unknown_8;
    }
    
    public void setUnknown_9(final int unknown_9) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(GenericMediaHeaderTextAtom.ajc$tjp_17, this, this, Conversions.intObject(unknown_9)));
        this.unknown_9 = unknown_9;
    }
}
