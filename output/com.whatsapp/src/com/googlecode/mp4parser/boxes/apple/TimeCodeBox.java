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
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;

public class TimeCodeBox extends AbstractBox implements SampleEntry
{
    public static final String TYPE = "tmcd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;
    
    static {
        ajc$preClinit();
    }
    
    public TimeCodeBox() {
        super("tmcd");
        this.rest = new byte[0];
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("TimeCodeBox.java", TimeCodeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 81);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 85);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), 130);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 134);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 138);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "long"), 142);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long", "flags", "", "void"), 146);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 150);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 154);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 91);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 102);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), 106);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 110);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), 114);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 118);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), 122);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 126);
    }
    
    @Override
    protected void _parseDetails(final ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = IsoTypeReader.readUInt32(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = IsoTypeReader.readUInt8(byteBuffer);
        this.reserved2 = IsoTypeReader.readUInt24(byteBuffer);
        byteBuffer.get(this.rest = new byte[byteBuffer.remaining()]);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        IsoTypeWriter.writeUInt32(byteBuffer, this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        IsoTypeWriter.writeUInt8(byteBuffer, this.numberOfFrames);
        IsoTypeWriter.writeUInt24(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }
    
    @Override
    protected long getContentSize() {
        return 28 + this.rest.length;
    }
    
    @Override
    public int getDataReferenceIndex() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_0, this, this));
        return this.dataReferenceIndex;
    }
    
    public long getFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_13, this, this));
        return this.flags;
    }
    
    public int getFrameDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_5, this, this));
        return this.frameDuration;
    }
    
    public int getNumberOfFrames() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_7, this, this));
        return this.numberOfFrames;
    }
    
    public int getReserved1() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_9, this, this));
        return this.reserved1;
    }
    
    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_11, this, this));
        return this.reserved2;
    }
    
    public byte[] getRest() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_15, this, this));
        return this.rest;
    }
    
    public int getTimeScale() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_3, this, this));
        return this.timeScale;
    }
    
    @Override
    public void setDataReferenceIndex(final int dataReferenceIndex) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_1, this, this, Conversions.intObject(dataReferenceIndex)));
        this.dataReferenceIndex = dataReferenceIndex;
    }
    
    public void setFlags(final long flags) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_14, this, this, Conversions.longObject(flags)));
        this.flags = flags;
    }
    
    public void setFrameDuration(final int frameDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_6, this, this, Conversions.intObject(frameDuration)));
        this.frameDuration = frameDuration;
    }
    
    public void setNumberOfFrames(final int numberOfFrames) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_8, this, this, Conversions.intObject(numberOfFrames)));
        this.numberOfFrames = numberOfFrames;
    }
    
    public void setReserved1(final int reserved1) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_10, this, this, Conversions.intObject(reserved1)));
        this.reserved1 = reserved1;
    }
    
    public void setReserved2(final int reserved2) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_12, this, this, Conversions.intObject(reserved2)));
        this.reserved2 = reserved2;
    }
    
    public void setRest(final byte[] rest) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_16, this, this, rest));
        this.rest = rest;
    }
    
    public void setTimeScale(final int timeScale) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_4, this, this, Conversions.intObject(timeScale)));
        this.timeScale = timeScale;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(TimeCodeBox.ajc$tjp_2, this, this));
        return "TimeCodeBox{timeScale=" + this.timeScale + ", frameDuration=" + this.frameDuration + ", numberOfFrames=" + this.numberOfFrames + ", reserved1=" + this.reserved1 + ", reserved2=" + this.reserved2 + ", flags=" + this.flags + '}';
    }
}
