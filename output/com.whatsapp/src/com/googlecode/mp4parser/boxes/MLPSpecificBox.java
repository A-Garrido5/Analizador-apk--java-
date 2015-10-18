// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractBox;

public class MLPSpecificBox extends AbstractBox
{
    public static final String TYPE = "dmlp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;
    
    static {
        ajc$preClinit();
    }
    
    public MLPSpecificBox() {
        super("dmlp");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("MLPSpecificBox.java", MLPSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 49);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "format_info", "", "void"), 53);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 57);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "peak_data_rate", "", "void"), 61);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 65);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved", "", "void"), 69);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", "int"), 73);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "int", "reserved2", "", "void"), 77);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        final BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.format_info = bitReaderBuffer.readBits(32);
        this.peak_data_rate = bitReaderBuffer.readBits(15);
        this.reserved = bitReaderBuffer.readBits(1);
        this.reserved2 = bitReaderBuffer.readBits(32);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        final BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.format_info, 32);
        bitWriterBuffer.writeBits(this.peak_data_rate, 15);
        bitWriterBuffer.writeBits(this.reserved, 1);
        bitWriterBuffer.writeBits(this.reserved2, 32);
    }
    
    @Override
    protected long getContentSize() {
        return 10L;
    }
    
    public int getFormat_info() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_0, this, this));
        return this.format_info;
    }
    
    public int getPeak_data_rate() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_2, this, this));
        return this.peak_data_rate;
    }
    
    public int getReserved() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_4, this, this));
        return this.reserved;
    }
    
    public int getReserved2() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_6, this, this));
        return this.reserved2;
    }
    
    public void setFormat_info(final int format_info) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_1, this, this, Conversions.intObject(format_info)));
        this.format_info = format_info;
    }
    
    public void setPeak_data_rate(final int peak_data_rate) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_3, this, this, Conversions.intObject(peak_data_rate)));
        this.peak_data_rate = peak_data_rate;
    }
    
    public void setReserved(final int reserved) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_5, this, this, Conversions.intObject(reserved)));
        this.reserved = reserved;
    }
    
    public void setReserved2(final int reserved2) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MLPSpecificBox.ajc$tjp_7, this, this, Conversions.intObject(reserved2)));
        this.reserved2 = reserved2;
    }
}
