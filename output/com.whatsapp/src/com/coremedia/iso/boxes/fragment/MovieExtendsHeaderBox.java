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

public class MovieExtendsHeaderBox extends AbstractFullBox
{
    public static final String TYPE = "mehd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private long fragmentDuration;
    
    static {
        ajc$preClinit();
    }
    
    public MovieExtendsHeaderBox() {
        super("mehd");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("MovieExtendsHeaderBox.java", MovieExtendsHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "", "", "", "long"), 65);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "long", "fragmentDuration", "", "void"), 69);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        long fragmentDuration;
        if (this.getVersion() == 1) {
            fragmentDuration = IsoTypeReader.readUInt64(byteBuffer);
        }
        else {
            fragmentDuration = IsoTypeReader.readUInt32(byteBuffer);
        }
        this.fragmentDuration = fragmentDuration;
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        if (this.getVersion() == 1) {
            IsoTypeWriter.writeUInt64(byteBuffer, this.fragmentDuration);
            return;
        }
        IsoTypeWriter.writeUInt32(byteBuffer, this.fragmentDuration);
    }
    
    @Override
    protected long getContentSize() {
        int n;
        if (this.getVersion() == 1) {
            n = 12;
        }
        else {
            n = 8;
        }
        return n;
    }
    
    public long getFragmentDuration() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieExtendsHeaderBox.ajc$tjp_0, this, this));
        return this.fragmentDuration;
    }
    
    public void setFragmentDuration(final long fragmentDuration) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(MovieExtendsHeaderBox.ajc$tjp_1, this, this, Conversions.longObject(fragmentDuration)));
        this.fragmentDuration = fragmentDuration;
    }
}
