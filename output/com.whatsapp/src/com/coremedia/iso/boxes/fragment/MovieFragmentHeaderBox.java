// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.fragment;

import org.aspectj.runtime.internal.Conversions;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class MovieFragmentHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "mfhd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private long sequenceNumber;
    
    static {
        ajc$preClinit();
    }
    
    public MovieFragmentHeaderBox() {
        super("mfhd");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("MovieFragmentHeaderBox.java", MovieFragmentHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "long"), 59);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "long", "sequenceNumber", "", "void"), 63);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.sequenceNumber = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.sequenceNumber);
    }
    
    @Override
    protected long getContentSize() {
        return 8L;
    }
    
    public long getSequenceNumber() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieFragmentHeaderBox.ajc$tjp_0, this, this));
        return this.sequenceNumber;
    }
    
    public void setSequenceNumber(final long sequenceNumber) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieFragmentHeaderBox.ajc$tjp_1, this, this, Conversions.longObject(sequenceNumber)));
        this.sequenceNumber = sequenceNumber;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieFragmentHeaderBox.ajc$tjp_2, this, this));
        return "MovieFragmentHeaderBox{sequenceNumber=" + this.sequenceNumber + '}';
    }
}
