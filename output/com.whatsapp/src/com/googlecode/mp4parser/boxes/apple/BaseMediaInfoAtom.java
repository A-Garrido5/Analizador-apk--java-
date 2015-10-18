// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.apple;

import org.aspectj.runtime.internal.Conversions;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class BaseMediaInfoAtom extends AbstractFullBox
{
    public static final String TYPE = "gmin";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    short balance;
    short graphicsMode;
    int opColorB;
    int opColorG;
    int opColorR;
    short reserved;
    
    static {
        ajc$preClinit();
    }
    
    public BaseMediaInfoAtom() {
        super("gmin");
        this.graphicsMode = 64;
        this.opColorR = 32768;
        this.opColorG = 32768;
        this.opColorB = 32768;
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("BaseMediaInfoAtom.java", BaseMediaInfoAtom.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 54);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setGraphicsMode", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"), 58);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 94);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"), 98);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"), 103);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 62);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOpColorR", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"), 66);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 70);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOpColorG", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"), 74);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"), 78);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setOpColorB", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"), 82);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"), 86);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBalance", "com.googlecode.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"), 90);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.graphicsMode = byteBuffer.getShort();
        this.opColorR = IsoTypeReader.readUInt16(byteBuffer);
        this.opColorG = IsoTypeReader.readUInt16(byteBuffer);
        this.opColorB = IsoTypeReader.readUInt16(byteBuffer);
        this.balance = byteBuffer.getShort();
        this.reserved = byteBuffer.getShort();
    }
    
    public short getBalance() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_8, this, this));
        return this.balance;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.putShort(this.graphicsMode);
        IsoTypeWriter.writeUInt16(byteBuffer, this.opColorR);
        IsoTypeWriter.writeUInt16(byteBuffer, this.opColorG);
        IsoTypeWriter.writeUInt16(byteBuffer, this.opColorB);
        byteBuffer.putShort(this.balance);
        byteBuffer.putShort(this.reserved);
    }
    
    @Override
    protected long getContentSize() {
        return 16L;
    }
    
    public short getGraphicsMode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_0, this, this));
        return this.graphicsMode;
    }
    
    public int getOpColorB() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_6, this, this));
        return this.opColorB;
    }
    
    public int getOpColorG() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_4, this, this));
        return this.opColorG;
    }
    
    public int getOpColorR() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_2, this, this));
        return this.opColorR;
    }
    
    public short getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_10, this, this));
        return this.reserved;
    }
    
    public void setBalance(final short balance) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_9, this, this, Conversions.shortObject(balance)));
        this.balance = balance;
    }
    
    public void setGraphicsMode(final short graphicsMode) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_1, this, this, Conversions.shortObject(graphicsMode)));
        this.graphicsMode = graphicsMode;
    }
    
    public void setOpColorB(final int opColorB) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_7, this, this, Conversions.intObject(opColorB)));
        this.opColorB = opColorB;
    }
    
    public void setOpColorG(final int opColorG) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_5, this, this, Conversions.intObject(opColorG)));
        this.opColorG = opColorG;
    }
    
    public void setOpColorR(final int opColorR) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_3, this, this, Conversions.intObject(opColorR)));
        this.opColorR = opColorR;
    }
    
    public void setReserved(final short reserved) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_11, this, this, Conversions.shortObject(reserved)));
        this.reserved = reserved;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(BaseMediaInfoAtom.ajc$tjp_12, this, this));
        return "BaseMediaInfoAtom{graphicsMode=" + this.graphicsMode + ", opColorR=" + this.opColorR + ", opColorG=" + this.opColorG + ", opColorB=" + this.opColorB + ", balance=" + this.balance + ", reserved=" + this.reserved + '}';
    }
}
