// 
// Decompiled by Procyon v0.5.30
// 

package com.coremedia.iso.boxes.vodafone;

import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.coremedia.iso.Utf8;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import org.aspectj.lang.Signature;
import org.aspectj.runtime.reflect.Factory;
import org.aspectj.lang.JoinPoint;
import com.googlecode.mp4parser.AbstractFullBox;

public class LyricsUriBox extends AbstractFullBox
{
    public static final String TYPE = "lrcu";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private String lyricsUri;
    
    static {
        ajc$preClinit();
    }
    
    public LyricsUriBox() {
        super("lrcu");
    }
    
    private static /* synthetic */ void ajc$preClinit() {
        final Factory factory = new Factory("LyricsUriBox.java", LyricsUriBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 39);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLyricsUri", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "java.lang.String", "lyricsUri", "", "void"), 43);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.vodafone.LyricsUriBox", "", "", "", "java.lang.String"), 64);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        this.lyricsUri = IsoTypeReader.readString(byteBuffer);
    }
    
    @Override
    protected void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put(Utf8.convert(this.lyricsUri));
        byteBuffer.put((byte)0);
    }
    
    @Override
    protected long getContentSize() {
        return 5 + Utf8.utf8StringLengthInBytes(this.lyricsUri);
    }
    
    public String getLyricsUri() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LyricsUriBox.ajc$tjp_0, this, this));
        return this.lyricsUri;
    }
    
    public void setLyricsUri(final String lyricsUri) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LyricsUriBox.ajc$tjp_1, this, this, lyricsUri));
        this.lyricsUri = lyricsUri;
    }
    
    @Override
    public String toString() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(LyricsUriBox.ajc$tjp_2, this, this));
        return "LyricsUriBox[lyricsUri=" + this.getLyricsUri() + "]";
    }
}
