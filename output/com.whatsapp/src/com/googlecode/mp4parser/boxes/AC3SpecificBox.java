// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class AC3SpecificBox extends AbstractBox
{
    public static final String TYPE = "dac3";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;
    
    static {
        ajc$preClinit();
    }
    
    public AC3SpecificBox() {
        super("dac3");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("AC3SpecificBox.java", AC3SpecificBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 55);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "fscod", "", "void"), 59);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 95);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bitRateCode", "", "void"), 99);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 103);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "reserved", "", "void"), 107);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 63);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsid", "", "void"), 67);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 71);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "bsmod", "", "void"), 75);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 79);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "acmod", "", "void"), 83);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "int"), 87);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "int", "lfeon", "", "void"), 91);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.fscod = bitReaderBuffer.readBits(2);
        this.bsid = bitReaderBuffer.readBits(5);
        this.bsmod = bitReaderBuffer.readBits(3);
        this.acmod = bitReaderBuffer.readBits(3);
        this.lfeon = bitReaderBuffer.readBits(1);
        this.bitRateCode = bitReaderBuffer.readBits(5);
        this.reserved = bitReaderBuffer.readBits(5);
    }
    
    public int getAcmod() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_6, this, this));
        return this.acmod;
    }
    
    public int getBitRateCode() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_10, this, this));
        return this.bitRateCode;
    }
    
    public int getBsid() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_2, this, this));
        return this.bsid;
    }
    
    public int getBsmod() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_4, this, this));
        return this.bsmod;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.fscod, 2);
        bitWriterBuffer.writeBits(this.bsid, 5);
        bitWriterBuffer.writeBits(this.bsmod, 3);
        bitWriterBuffer.writeBits(this.acmod, 3);
        bitWriterBuffer.writeBits(this.lfeon, 1);
        bitWriterBuffer.writeBits(this.bitRateCode, 5);
        bitWriterBuffer.writeBits(this.reserved, 5);
    }
    
    @Override
    protected long getContentSize() {
        return 3L;
    }
    
    public int getFscod() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_0, this, this));
        return this.fscod;
    }
    
    public int getLfeon() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_8, this, this));
        return this.lfeon;
    }
    
    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_12, this, this));
        return this.reserved;
    }
    
    public void setAcmod(final int acmod) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_7, this, this, Conversions.intObject(acmod)));
        this.acmod = acmod;
    }
    
    public void setBitRateCode(final int bitRateCode) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_11, this, this, Conversions.intObject(bitRateCode)));
        this.bitRateCode = bitRateCode;
    }
    
    public void setBsid(final int bsid) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_3, this, this, Conversions.intObject(bsid)));
        this.bsid = bsid;
    }
    
    public void setBsmod(final int bsmod) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_5, this, this, Conversions.intObject(bsmod)));
        this.bsmod = bsmod;
    }
    
    public void setFscod(final int fscod) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_1, this, this, Conversions.intObject(fscod)));
        this.fscod = fscod;
    }
    
    public void setLfeon(final int lfeon) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_9, this, this, Conversions.intObject(lfeon)));
        this.lfeon = lfeon;
    }
    
    public void setReserved(final int reserved) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_13, this, this, Conversions.intObject(reserved)));
        this.reserved = reserved;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(AC3SpecificBox.ajc$tjp_14, this, this));
        return "AC3SpecificBox{fscod=" + this.fscod + ", bsid=" + this.bsid + ", bsmod=" + this.bsmod + ", acmod=" + this.acmod + ", lfeon=" + this.lfeon + ", bitRateCode=" + this.bitRateCode + ", reserved=" + this.reserved + '}';
    }
}
