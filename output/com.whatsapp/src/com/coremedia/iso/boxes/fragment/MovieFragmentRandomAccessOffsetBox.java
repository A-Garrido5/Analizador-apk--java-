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

public class MovieFragmentRandomAccessOffsetBox extends AbstractFullBox
{
    public static final String TYPE = "mfro";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private long mfraSize;
    
    static {
        ajc$preClinit();
    }
    
    public MovieFragmentRandomAccessOffsetBox() {
        super("mfro");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("MovieFragmentRandomAccessOffsetBox.java", MovieFragmentRandomAccessOffsetBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "", "", "", "long"), 56);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "long", "mfraSize", "", "void"), 60);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.mfraSize = IsoTypeReader.readUInt32(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.writeUInt32(byteBuffer, this.mfraSize);
    }
    
    @Override
    protected long getContentSize() {
        return 8L;
    }
    
    public long getMfraSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieFragmentRandomAccessOffsetBox.ajc$tjp_0, this, this));
        return this.mfraSize;
    }
    
    public void setMfraSize(final long mfraSize) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieFragmentRandomAccessOffsetBox.ajc$tjp_1, this, this, Conversions.longObject(mfraSize)));
        this.mfraSize = mfraSize;
    }
}
