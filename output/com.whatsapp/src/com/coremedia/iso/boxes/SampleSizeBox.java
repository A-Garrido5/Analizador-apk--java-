// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.CastUtils;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class SampleSizeBox extends AbstractFullBox
{
    public static final String TYPE = "stsz";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;
    
    static {
        ajc$preClinit();
    }
    
    public SampleSizeBox() {
        super("stsz");
        this.sampleSizes = new long[0];
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("SampleSizeBox.java", SampleSizeBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.sampleSize = IsoTypeReader.readUInt32(byteBuffer);
        this.sampleCount = CastUtils.l2i(IsoTypeReader.readUInt32(byteBuffer));
        if (this.sampleSize == 0L) {
            this.sampleSizes = new long[this.sampleCount];
            for (int i = 0; i < this.sampleCount; ++i) {
                this.sampleSizes[i] = IsoTypeReader.readUInt32(byteBuffer);
            }
        }
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleSize);
        if (this.sampleSize == 0L) {
            IsoTypeWriter.writeUInt32(byteBuffer, this.sampleSizes.length);
            final long[] sampleSizes = this.sampleSizes;
            for (int length = sampleSizes.length, i = 0; i < length; ++i) {
                IsoTypeWriter.writeUInt32(byteBuffer, sampleSizes[i]);
            }
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.sampleCount);
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if (this.sampleSize == 0L) {
            n = 4 * this.sampleSizes.length;
        }
        else {
            n = 0;
        }
        return n + 12;
    }
    
    public long getSampleCount() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_3, this, this));
        if (this.sampleSize > 0L) {
            return this.sampleCount;
        }
        return this.sampleSizes.length;
    }
    
    public long getSampleSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_0, this, this));
        return this.sampleSize;
    }
    
    public long getSampleSizeAtIndex(final int n) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_2, this, this, Conversions.intObject(n)));
        if (this.sampleSize > 0L) {
            return this.sampleSize;
        }
        return this.sampleSizes[n];
    }
    
    public long[] getSampleSizes() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_4, this, this));
        return this.sampleSizes;
    }
    
    public void setSampleSize(final long sampleSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_1, this, this, Conversions.longObject(sampleSize)));
        this.sampleSize = sampleSize;
    }
    
    public void setSampleSizes(final long[] sampleSizes) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_5, this, this, sampleSizes));
        this.sampleSizes = sampleSizes;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(SampleSizeBox.ajc$tjp_6, this, this));
        return "SampleSizeBox[sampleSize=" + this.getSampleSize() + ";sampleCount=" + this.getSampleCount() + "]";
    }
}
